import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!oi;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
	private final int[] anIntArray539 = new int[3];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Z")
	private volatile boolean aBoolean622 = true;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[Lclient!tj;")
	private final Class3_Sub22[] aClass3_Sub22Array6 = new Class3_Sub22[8];

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
	private volatile boolean aBoolean623 = true;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Z")
	private volatile boolean aBoolean621 = false;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private final int anInt8553;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!ha;")
	private final Class82 aClass82_15;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class301(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1) {
		this.anInt8553 = arg0;
		this.aClass82_15 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	public void method7370() {
		this.aBoolean622 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean623) {
			this.method7374();
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()Z")
	public boolean method7371() {
		return this.aClass250_1 == null || !this.aBoolean621 && this.aClass250_1.method6326();
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()V")
	public void method7372() {
		this.aBoolean622 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()J")
	public long method7373() {
		return this.aLong225;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "()V")
	private void method7374() {
		this.aClass82_15.method6098(this.anInt8553);
		while (!this.aBoolean622 && this.aBoolean623) {
			if (this.aClass250_1 == null || this.aClass250_1.method6326()) {
				this.aBoolean621 = false;
				this.aLong225 = Static471.aClass166_1.method6646();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean621 = true;
				@Pc(21) Class9 local21 = this.aClass250_1.method6324();
				if (local21 instanceof Class9_Sub2) {
					@Pc(27) Class9_Sub2 local27 = (Class9_Sub2) local21;
					if (local27.aBoolean769) {
						local27.method8600(Static568.aClass82_14);
					} else {
						Static11.method200(local27, this.aClass3_Sub22Array6);
						if (Static303.aClass63_13 != null) {
							Static303.aClass63_13.method7751(local27.anInt10157, -16777216, this.aClass250_1.aString53, -256, local27.anInt10155);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class9_Sub7) local21).anInt6175;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class91 local70 = Static637.aClass91Array4[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static361.anInt6683 + Static361.anInt6683; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static361.anInt6683 + Static361.anInt6683; local75++) {
								if (Static38.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static281.anInt5392 + local72 - Static361.anInt6683;
									@Pc(98) int local98 = Static394.anInt7055 + local75 - Static361.anInt6683;
									if (local92 >= 0 && local92 < local70.anInt8983 && local98 >= 0 && local98 < local70.anInt8985) {
										Static568.aClass82_14.H(local92 << Static485.anInt8241, local70.method7724(local98, local92), local98 << Static485.anInt8241, this.anIntArray539);
										if (Static1.method8033(this.anIntArray539[0]) == this.anInt8553 - 1) {
											local70.method7717(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass82_15.method6159(this.anInt8553);
		while (this.aBoolean622 && this.aBoolean623) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!oi;)V")
	public void method7375(@OriginalArg(0) Class250 arg0) {
		if (this.aClass250_1 != null) {
			this.aClass250_1.method6330((Class301) null);
		}
		this.aClass250_1 = arg0;
		if (this.aClass250_1 != null) {
			this.aClass250_1.method6330(this);
		}
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "()V")
	public void method7376() {
		this.aBoolean622 = false;
		this.aBoolean623 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
