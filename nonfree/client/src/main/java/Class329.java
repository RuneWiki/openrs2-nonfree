import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class329 implements Runnable {

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "Lclient!bka;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "J")
	private long aLong266;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "Z")
	private volatile boolean aBoolean677 = true;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "Z")
	private volatile boolean aBoolean678 = true;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "[Lclient!sca;")
	private final Class6_Sub17[] aClass6_Sub17Array6 = new Class6_Sub17[8];

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "[I")
	private final int[] anIntArray625 = new int[3];

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "Z")
	private volatile boolean aBoolean679 = false;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
	private final int anInt9304;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "Lclient!ha;")
	private final Class132 aClass132_14;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class329(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1) {
		this.anInt9304 = arg0;
		this.aClass132_14 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "()V")
	public void method7839() {
		this.aBoolean677 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "()Z")
	public boolean method7840() {
		return this.aClass40_1 == null || !this.aBoolean679 && this.aClass40_1.method976();
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "()J")
	public long method7841() {
		return this.aLong266;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!bka;)V")
	public void method7842(@OriginalArg(0) Class40 arg0) {
		if (this.aClass40_1 != null) {
			this.aClass40_1.method972((Class329) null);
		}
		this.aClass40_1 = arg0;
		if (this.aClass40_1 != null) {
			this.aClass40_1.method972(this);
		}
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "()V")
	public void method7843() {
		this.aBoolean677 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "()V")
	private void method7844() {
		this.aClass132_14.method7497(this.anInt9304);
		while (!this.aBoolean677 && this.aBoolean678) {
			if (this.aClass40_1 == null || this.aClass40_1.method976()) {
				this.aBoolean679 = false;
				this.aLong266 = Static623.aClass13_1.method9172();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean679 = true;
				@Pc(21) Class2 local21 = this.aClass40_1.method977();
				if (local21 instanceof Class2_Sub1) {
					@Pc(27) Class2_Sub1 local27 = (Class2_Sub1) local21;
					if (local27.aBoolean701) {
						local27.method8458(Static576.aClass132_15);
					} else {
						Static407.method5839(local27, this.aClass6_Sub17Array6);
						if (Static32.aClass19_3 != null) {
							Static32.aClass19_3.method6336(local27.anInt9996, -256, -16777216, local27.anInt10005, this.aClass40_1.aString17);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class2_Sub10) local21).anInt9434;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class12 local70 = Static289.aClass12Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static514.anInt8546 + Static514.anInt8546; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static514.anInt8546 + Static514.anInt8546; local75++) {
								if (Static597.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static608.anInt9872 + local72 - Static514.anInt8546;
									@Pc(98) int local98 = Static370.anInt6309 + local75 - Static514.anInt8546;
									if (local92 >= 0 && local92 < local70.anInt9314 && local98 >= 0 && local98 < local70.anInt9313) {
										Static576.aClass132_15.H(local92 << Static185.anInt3178, local70.method7846(local92, local98), local98 << Static185.anInt3178, this.anIntArray625);
										if (Static346.method5044(this.anIntArray625[0]) == this.anInt9304 - 1) {
											local70.method7847(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass132_14.method7484(this.anInt9304);
		while (this.aBoolean677 && this.aBoolean678) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!sw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean678) {
			this.method7844();
		}
	}

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "()V")
	public void method7845() {
		this.aBoolean677 = false;
		this.aBoolean678 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
