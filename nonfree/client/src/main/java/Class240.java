import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mja")
public final class Class240 implements Runnable {

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "Lclient!kba;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "client!mja", name = "h", descriptor = "[Lclient!vj;")
	private final Class3_Sub16[] aClass3_Sub16Array6 = new Class3_Sub16[8];

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "Z")
	private volatile boolean aBoolean556 = true;

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "[I")
	private final int[] anIntArray386 = new int[3];

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "Z")
	private volatile boolean aBoolean555 = true;

	@OriginalMember(owner = "client!mja", name = "e", descriptor = "Z")
	private volatile boolean aBoolean557 = false;

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
	private final int anInt7094;

	@OriginalMember(owner = "client!mja", name = "i", descriptor = "Lclient!ha;")
	private final Class67 aClass67_9;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1) {
		this.anInt7094 = arg0;
		this.aClass67_9 = arg1;
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "()V")
	public void method5944() {
		this.aBoolean556 = false;
		this.aBoolean555 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "()V")
	private void method5945() {
		this.aClass67_9.method7695(this.anInt7094);
		while (!this.aBoolean556 && this.aBoolean555) {
			if (this.aClass198_1 == null || this.aClass198_1.method4821()) {
				this.aBoolean557 = false;
				this.aLong237 = Static76.aClass123_1.method6011();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean557 = true;
				@Pc(23) Class19 local23 = this.aClass198_1.method4819();
				if (local23 instanceof Class19_Sub1) {
					@Pc(29) Class19_Sub1 local29 = (Class19_Sub1) local23;
					if (local29.aBoolean808) {
						local29.method9374(Static626.aClass67_16);
					} else {
						Static362.method7255(local29, this.aClass3_Sub16Array6);
						if (Static67.aClass44_6 != null) {
							Static67.aClass44_6.method8129(-256, this.aClass198_1.aString91, -16777216, local29.anInt11207, local29.anInt11210);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class19_Sub7) local23).anInt6116;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class313 local76 = Static639.aClass313Array2[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static726.anInt11312 + Static726.anInt11312; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static726.anInt11312 + Static726.anInt11312; local81++) {
								if (Static71.aBooleanArrayArrayArray1[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static296.anInt3655 + local78 - Static726.anInt11312;
									@Pc(104) int local104 = Static450.anInt7928 + local81 - Static726.anInt11312;
									if (local98 >= 0 && local98 < local76.anInt10875 && local104 >= 0 && local104 < local76.anInt10872) {
										Static626.aClass67_16.H(local98 << Static394.anInt7067, local76.method9095(local104, local98), local104 << Static394.anInt7067, this.anIntArray386);
										if (Static92.method1253(this.anIntArray386[0]) == this.anInt7094 - 1) {
											local76.method9090(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass67_9.method7672(this.anInt7094);
		while (this.aBoolean556 && this.aBoolean555) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "()V")
	public void method5946() {
		this.aBoolean556 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!kba;)V")
	public void method5947(@OriginalArg(0) Class198 arg0) {
		if (this.aClass198_1 != null) {
			this.aClass198_1.method4815((Class240) null);
		}
		this.aClass198_1 = arg0;
		if (this.aClass198_1 != null) {
			this.aClass198_1.method4815(this);
		}
	}

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "()V")
	public void method5948() {
		this.aBoolean556 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "()J")
	public long method5949() {
		return this.aLong237;
	}

	@OriginalMember(owner = "client!mja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean555) {
			this.method5945();
		}
	}

	@OriginalMember(owner = "client!mja", name = "e", descriptor = "()Z")
	public boolean method5950() {
		return this.aClass198_1 == null || !this.aBoolean557 && this.aClass198_1.method4821();
	}
}
