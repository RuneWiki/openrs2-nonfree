import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Lclient!rja;")
	private Class324 aClass324_1;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
	private final int[] anIntArray41 = new int[3];

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "Z")
	private volatile boolean aBoolean51 = true;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[Lclient!bba;")
	private final Class2_Sub7[] aClass2_Sub7Array1 = new Class2_Sub7[8];

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Z")
	private volatile boolean aBoolean52 = true;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Z")
	private volatile boolean aBoolean50 = false;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	private final int anInt380;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Lclient!ha;")
	private final Class145 aClass145_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1) {
		this.anInt380 = arg0;
		this.aClass145_1 = arg1;
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "()V")
	public void method375() {
		this.aBoolean51 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "()J")
	public long method376() {
		return this.aLong20;
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "()Z")
	public boolean method377() {
		return this.aClass324_1 == null || !this.aBoolean50 && this.aClass324_1.method7735();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!rja;)V")
	public void method378(@OriginalArg(0) Class324 arg0) {
		if (this.aClass324_1 != null) {
			this.aClass324_1.method7732((Class23) null);
		}
		this.aClass324_1 = arg0;
		if (this.aClass324_1 != null) {
			this.aClass324_1.method7732(this);
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "()V")
	public void method379() {
		this.aBoolean51 = false;
		this.aBoolean52 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()V")
	public void method380() {
		this.aBoolean51 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()V")
	private void method381() {
		this.aClass145_1.method9705(this.anInt380);
		while (!this.aBoolean51 && this.aBoolean52) {
			if (this.aClass324_1 == null || this.aClass324_1.method7735()) {
				this.aBoolean50 = false;
				this.aLong20 = Static711.aClass157_1.method7779();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean50 = true;
				@Pc(23) Class4 local23 = this.aClass324_1.method7731();
				if (local23 instanceof Class4_Sub2) {
					@Pc(29) Class4_Sub2 local29 = (Class4_Sub2) local23;
					if (local29.aBoolean885) {
						local29.method8975(Static689.aClass145_16);
					} else {
						Static253.method3573(local29, this.aClass2_Sub7Array1);
						if (Static116.aClass68_5 != null) {
							Static116.aClass68_5.method7882(local29.anInt10236, -256, this.aClass324_1.aString97, local29.anInt10232, -16777216);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class4_Sub4) local23).anInt1052;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class133 local76 = Static158.aClass133Array4[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static128.anInt2136 + Static128.anInt2136; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static128.anInt2136 + Static128.anInt2136; local81++) {
								if (Static9.aBooleanArrayArrayArray1[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static20.anInt267 + local78 - Static128.anInt2136;
									@Pc(104) int local104 = Static503.anInt2766 + local81 - Static128.anInt2136;
									if (local98 >= 0 && local98 < local76.anInt9318 && local104 >= 0 && local104 < local76.anInt9315) {
										Static689.aClass145_16.H(local98 << Static260.anInt4053, local76.method8217(local98, local104), local104 << Static260.anInt4053, this.anIntArray41);
										if (Static70.method1066(this.anIntArray41[0]) == this.anInt380 - 1) {
											local76.method8223(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass145_1.method9709(this.anInt380);
		while (this.aBoolean51 && this.aBoolean52) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean52) {
			this.method381();
		}
	}
}
