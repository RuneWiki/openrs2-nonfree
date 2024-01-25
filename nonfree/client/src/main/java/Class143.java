import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Lclient!wu;")
	private Class399 aClass399_1;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Z")
	private volatile boolean aBoolean257 = true;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Z")
	private volatile boolean aBoolean256 = true;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "[Lclient!rfa;")
	private final Class14_Sub18[] aClass14_Sub18Array2 = new Class14_Sub18[8];

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Z")
	private volatile boolean aBoolean258 = false;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "[I")
	private final int[] anIntArray212 = new int[3];

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	private final int anInt3572;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Lclient!ha;")
	private final Class144 aClass144_7;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1) {
		this.anInt3572 = arg0;
		this.aClass144_7 = arg1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()J")
	public long method3048() {
		return this.aLong120;
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "()V")
	private void method3049() {
		this.aClass144_7.method6900(this.anInt3572);
		while (!this.aBoolean257 && this.aBoolean256) {
			if (this.aClass399_1 == null || this.aClass399_1.method9468()) {
				this.aBoolean258 = false;
				this.aLong120 = Static515.aClass29_1.method9347();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean258 = true;
				@Pc(23) Class4 local23 = this.aClass399_1.method9462();
				if (local23 instanceof Class4_Sub3) {
					@Pc(29) Class4_Sub3 local29 = (Class4_Sub3) local23;
					if (local29.aBoolean778) {
						local29.method9490(Static554.aClass144_12);
					} else {
						Static200.method8474(local29, this.aClass14_Sub18Array2);
						if (Static613.aClass68_11 != null) {
							Static613.aClass68_11.method9422(this.aClass399_1.aString124, local29.anInt11180, -16777216, local29.anInt11179, -256);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class4_Sub10) local23).anInt11042;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class159 local76 = Static258.aClass159Array1[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static459.anInt10513 + Static459.anInt10513; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static459.anInt10513 + Static459.anInt10513; local81++) {
								if (Static684.aBooleanArrayArrayArray2[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static307.anInt5453 + local78 - Static459.anInt10513;
									@Pc(104) int local104 = Static325.anInt5630 + local81 - Static459.anInt10513;
									if (local98 >= 0 && local98 < local76.anInt9504 && local104 >= 0 && local104 < local76.anInt9506) {
										Static554.aClass144_12.H(local98 << Static110.anInt1858, local76.method8207(local104, local98), local104 << Static110.anInt1858, this.anIntArray212);
										if (Static681.method9397(this.anIntArray212[0]) == this.anInt3572 - 1) {
											local76.method8204(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass144_7.method6940(this.anInt3572);
		while (this.aBoolean257 && this.aBoolean256) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean256) {
			this.method3049();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!wu;)V")
	public void method3050(@OriginalArg(0) Class399 arg0) {
		if (this.aClass399_1 != null) {
			this.aClass399_1.method9463((Class143) null);
		}
		this.aClass399_1 = arg0;
		if (this.aClass399_1 != null) {
			this.aClass399_1.method9463(this);
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "()V")
	public void method3051() {
		this.aBoolean257 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "()V")
	public void method3052() {
		this.aBoolean257 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "()V")
	public void method3053() {
		this.aBoolean257 = false;
		this.aBoolean256 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "()Z")
	public boolean method3054() {
		return this.aClass399_1 == null || !this.aBoolean258 && this.aClass399_1.method9468();
	}
}
