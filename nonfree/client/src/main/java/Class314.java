import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class314 implements Runnable {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "J")
	private long aLong249;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!gda;")
	private Class119 aClass119_1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Z")
	private volatile boolean aBoolean664 = true;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "[I")
	private final int[] anIntArray462 = new int[3];

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Z")
	private volatile boolean aBoolean666 = true;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Z")
	private volatile boolean aBoolean665 = false;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "[Lclient!mfa;")
	private final Class2_Sub13[] aClass2_Sub13Array6 = new Class2_Sub13[8];

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	private final int anInt9144;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!ha;")
	private final Class101 aClass101_13;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1) {
		this.anInt9144 = arg0;
		this.aClass101_13 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	public void method7992() {
		this.aBoolean664 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()V")
	public void method7993() {
		this.aBoolean664 = false;
		this.aBoolean666 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean666) {
			this.method7998();
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()Z")
	public boolean method7994() {
		return this.aClass119_1 == null || !this.aBoolean665 && this.aClass119_1.method3572();
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()V")
	public void method7995() {
		this.aBoolean664 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!gda;)V")
	public void method7996(@OriginalArg(0) Class119 arg0) {
		if (this.aClass119_1 != null) {
			this.aClass119_1.method3567((Class314) null);
		}
		this.aClass119_1 = arg0;
		if (this.aClass119_1 != null) {
			this.aClass119_1.method3567(this);
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "()J")
	public long method7997() {
		return this.aLong249;
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "()V")
	private void method7998() {
		this.aClass101_13.method8062(this.anInt9144);
		while (!this.aBoolean664 && this.aBoolean666) {
			if (this.aClass119_1 == null || this.aClass119_1.method3572()) {
				this.aBoolean665 = false;
				this.aLong249 = Static129.aClass69_1.method2396();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean665 = true;
				@Pc(21) Class15 local21 = this.aClass119_1.method3571();
				if (local21 instanceof Class15_Sub3) {
					@Pc(27) Class15_Sub3 local27 = (Class15_Sub3) local21;
					if (local27.aBoolean790) {
						local27.method9438(Static64.aClass101_1);
					} else {
						Static244.method9721(local27, this.aClass2_Sub13Array6);
						if (Static394.aClass59_9 != null) {
							Static394.aClass59_9.method9577(-256, this.aClass119_1.aString41, local27.anInt11025, local27.anInt11027, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class15_Sub4) local21).anInt1231;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class18 local70 = Static245.aClass18Array14[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static602.anInt10539 + Static602.anInt10539; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static602.anInt10539 + Static602.anInt10539; local75++) {
								if (Static151.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static440.anInt8000 + local72 - Static602.anInt10539;
									@Pc(98) int local98 = Static139.anInt2631 + local75 - Static602.anInt10539;
									if (local92 >= 0 && local92 < local70.anInt9741 && local98 >= 0 && local98 < local70.anInt9742) {
										Static64.aClass101_1.H(local92 << Static170.anInt3602, local70.method8537(local98, local92), local98 << Static170.anInt3602, this.anIntArray462);
										if (Static369.method9413(this.anIntArray462[0]) == this.anInt9144 - 1) {
											local70.method8533(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass101_13.method8080(this.anInt9144);
		while (this.aBoolean664 && this.aBoolean666) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}
}
