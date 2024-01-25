import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class106 implements Runnable {

	@OriginalMember(owner = "client!f", name = "g", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!ai;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
	private volatile boolean aBoolean244 = true;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
	private volatile boolean aBoolean245 = true;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Z")
	private volatile boolean aBoolean246 = false;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
	private final int[] anIntArray168 = new int[3];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[Lclient!ta;")
	private final Class6_Sub10[] aClass6_Sub10Array3 = new Class6_Sub10[8];

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private final int anInt3101;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!ha;")
	private final Class75 aClass75_2;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		this.anInt3101 = arg0;
		this.aClass75_2 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean245) {
			this.method2908();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
	public void method2902() {
		this.aBoolean244 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()Z")
	public boolean method2903() {
		return this.aClass15_1 == null || !this.aBoolean246 && this.aClass15_1.method198();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	public void method2904() {
		this.aBoolean244 = false;
		this.aBoolean245 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
	public void method2905() {
		this.aBoolean244 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ai;)V")
	public void method2906(@OriginalArg(0) Class15 arg0) {
		if (this.aClass15_1 != null) {
			this.aClass15_1.method200((Class106) null);
		}
		this.aClass15_1 = arg0;
		if (this.aClass15_1 != null) {
			this.aClass15_1.method200(this);
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "()J")
	public long method2907() {
		return this.aLong87;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	private void method2908() {
		this.aClass75_2.method6696(this.anInt3101);
		while (!this.aBoolean244 && this.aBoolean245) {
			if (this.aClass15_1 == null || this.aClass15_1.method198()) {
				this.aBoolean246 = false;
				this.aLong87 = Static123.aClass114_1.method6117();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean246 = true;
				@Pc(23) Class60 local23 = this.aClass15_1.method199();
				if (local23 instanceof Class60_Sub1) {
					@Pc(29) Class60_Sub1 local29 = (Class60_Sub1) local23;
					if (local29.aBoolean684) {
						local29.method7909(Static277.aClass75_7, 0);
					} else {
						Static122.method2209(local29, this.aClass6_Sub10Array3);
						if (Static456.aClass67_11 != null) {
							Static456.aClass67_11.method8294(local29.anInt9055, this.aClass15_1.aString8, -16777216, local29.anInt9050, -256);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class60_Sub5) local23).anInt5146;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class96 local76 = Static555.aClass96Array3[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static382.anInt6636 + Static382.anInt6636; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static382.anInt6636 + Static382.anInt6636; local81++) {
								if (Static195.aBooleanArrayArrayArray1[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static506.anInt8446 + local78 - Static382.anInt6636;
									@Pc(104) int local104 = Static676.anInt10368 + local81 - Static382.anInt6636;
									if (local98 >= 0 && local98 < local76.anInt9255 && local104 >= 0 && local104 < local76.anInt9257) {
										Static277.aClass75_7.H(local98 << Static594.anInt9440, local76.method8080(local98, local104), local104 << Static594.anInt9440, this.anIntArray168);
										if (Static567.method7975(this.anIntArray168[0]) == this.anInt3101 - 1) {
											local76.method8071(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass75_2.method6637(this.anInt3101);
		while (this.aBoolean244 && this.aBoolean245) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}
}
