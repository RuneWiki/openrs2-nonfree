import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class291 implements Runnable {

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!pha;")
	private Class287 aClass287_1;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
	private volatile boolean aBoolean508 = true;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "[Lclient!ih;")
	private final Class5_Sub12[] aClass5_Sub12Array4 = new Class5_Sub12[8];

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "[I")
	private final int[] anIntArray446 = new int[3];

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Z")
	private volatile boolean aBoolean510 = true;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Z")
	private volatile boolean aBoolean509 = false;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	private final int anInt7540;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Lclient!ha;")
	private final Class100 aClass100_11;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		this.anInt7540 = arg0;
		this.aClass100_11 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "()J")
	public long method6559() {
		return this.aLong221;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "()V")
	public void method6560() {
		this.aBoolean508 = false;
		this.aBoolean510 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "()V")
	public void method6561() {
		this.aBoolean508 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "()V")
	public void method6562() {
		this.aBoolean508 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!pha;)V")
	public void method6563(@OriginalArg(0) Class287 arg0) {
		if (this.aClass287_1 != null) {
			this.aClass287_1.method6425((Class291) null);
		}
		this.aClass287_1 = arg0;
		if (this.aClass287_1 != null) {
			this.aClass287_1.method6425(this);
		}
	}

	@OriginalMember(owner = "client!pp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean510) {
			this.method6565();
		}
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "()Z")
	public boolean method6564() {
		return this.aClass287_1 == null || !this.aBoolean509 && this.aClass287_1.method6430();
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()V")
	private void method6565() {
		this.aClass100_11.method8608(this.anInt7540);
		while (!this.aBoolean508 && this.aBoolean510) {
			if (this.aClass287_1 == null || this.aClass287_1.method6430()) {
				this.aBoolean509 = false;
				this.aLong221 = Static147.aClass77_1.method5828();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean509 = true;
				@Pc(23) Class4 local23 = this.aClass287_1.method6432();
				if (local23 instanceof Class4_Sub1) {
					@Pc(29) Class4_Sub1 local29 = (Class4_Sub1) local23;
					if (local29.aBoolean687) {
						local29.method8342(Static44.aClass100_1);
					} else {
						Static521.method9167(local29, this.aClass5_Sub12Array4);
						if (Static453.aClass70_9 != null) {
							Static453.aClass70_9.method8433(local29.anInt9796, -16777216, -256, this.aClass287_1.aString86, local29.anInt9804);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class4_Sub5) local23).anInt5036;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class84 local76 = Static177.aClass84Array2[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static553.anInt8738 + Static553.anInt8738; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static553.anInt8738 + Static553.anInt8738; local81++) {
								if (Static115.aBooleanArrayArrayArray1[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static220.anInt3838 + local78 - Static553.anInt8738;
									@Pc(104) int local104 = Static377.anInt6335 + local81 - Static553.anInt8738;
									if (local98 >= 0 && local98 < local76.anInt8883 && local104 >= 0 && local104 < local76.anInt8878) {
										Static44.aClass100_1.H(local98 << Static314.anInt5377, local76.method7620(local104, local98), local104 << Static314.anInt5377, this.anIntArray446);
										if (Static236.method3747(this.anIntArray446[0]) == this.anInt7540 - 1) {
											local76.method7621(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass100_11.method8626(this.anInt7540);
		while (this.aBoolean508 && this.aBoolean510) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}
}
