import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class235 implements Runnable {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Lclient!fb;")
	private Class103 aClass103_1;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "[I")
	private final int[] anIntArray460 = new int[3];

	@OriginalMember(owner = "client!no", name = "i", descriptor = "[Lclient!bh;")
	private final Class2_Sub4[] aClass2_Sub4Array4 = new Class2_Sub4[8];

	@OriginalMember(owner = "client!no", name = "h", descriptor = "Z")
	private volatile boolean aBoolean512 = true;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Z")
	private volatile boolean aBoolean510 = true;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Z")
	private volatile boolean aBoolean511 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "I")
	private final int anInt6883;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!ha;")
	private final Class87 aClass87_8;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class235(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1) {
		this.anInt6883 = arg0;
		this.aClass87_8 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()J")
	public long method5772() {
		return this.aLong197;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
	public void method5773() {
		this.aBoolean512 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "()V")
	public void method5774() {
		this.aBoolean512 = false;
		this.aBoolean510 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fb;)V")
	public void method5775(@OriginalArg(0) Class103 arg0) {
		if (this.aClass103_1 != null) {
			this.aClass103_1.method2672(null);
		}
		this.aClass103_1 = arg0;
		if (this.aClass103_1 != null) {
			this.aClass103_1.method2672(this);
		}
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "()Z")
	public boolean method5776() {
		return this.aClass103_1 == null || !this.aBoolean511 && this.aClass103_1.method2674();
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "()V")
	public void method5777() {
		this.aBoolean512 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!no", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean510) {
			this.method5778();
		}
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "()V")
	private void method5778() {
		this.aClass87_8.method7890(this.anInt6883);
		while (!this.aBoolean512 && this.aBoolean510) {
			if (this.aClass103_1 == null || this.aClass103_1.method2674()) {
				this.aBoolean511 = false;
				this.aLong197 = Static284.aClass13_33.method4548();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean511 = true;
				@Pc(21) Class11 local21 = this.aClass103_1.method2669();
				if (local21 instanceof Class11_Sub1) {
					@Pc(27) Class11_Sub1 local27 = (Class11_Sub1) local21;
					if (local27.aBoolean732) {
						local27.method8312(Static328.aClass87_6);
					} else {
						Static460.method6690(local27, this.aClass2_Sub4Array4);
						if (Static463.aClass64_12 != null) {
							Static463.aClass64_12.method7508(local27.anInt9931, this.aClass103_1.aString32, -16777216, local27.anInt9932, -256);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class11_Sub9) local21).anInt9058;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class112 local70 = Static331.aClass112Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static319.anInt5795 + Static319.anInt5795; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static319.anInt5795 + Static319.anInt5795; local75++) {
								if (Static295.aBooleanArrayArrayArray6[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static623.anInt9563 + local72 - Static319.anInt5795;
									@Pc(98) int local98 = Static507.anInt8547 + local75 - Static319.anInt5795;
									if (local92 >= 0 && local92 < local70.anInt9348 && local98 >= 0 && local98 < local70.anInt9340) {
										Static328.aClass87_6.H(local92 << Static415.anInt7579, local70.method7819(local98, local92), local98 << Static415.anInt7579, this.anIntArray460);
										if (Static466.method3726(this.anIntArray460[0]) == this.anInt6883 - 1) {
											local70.method7815(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass87_8.method7922(this.anInt6883);
		while (this.aBoolean512 && this.aBoolean510) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}
}
