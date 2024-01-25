import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class380 implements Runnable {

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "J")
	private long aLong269;

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "Lclient!jia;")
	private Class182 aClass182_1;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "[Lclient!laa;")
	private final Class2_Sub12[] aClass2_Sub12Array6 = new Class2_Sub12[8];

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "Z")
	private volatile boolean aBoolean747 = true;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "[I")
	private final int[] anIntArray729 = new int[3];

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "Z")
	private volatile boolean aBoolean748 = true;

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "Z")
	private volatile boolean aBoolean749 = false;

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
	private final int anInt10303;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "Lclient!ha;")
	private final Class13 aClass13_84;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class380(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		this.anInt10303 = arg0;
		this.aClass13_84 = arg1;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!jia;)V")
	public void method8752(@OriginalArg(0) Class182 arg0) {
		if (this.aClass182_1 != null) {
			this.aClass182_1.method4409((Class380) null);
		}
		this.aClass182_1 = arg0;
		if (this.aClass182_1 != null) {
			this.aClass182_1.method4409(this);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "()V")
	public void method8753() {
		this.aBoolean747 = false;
		this.aBoolean748 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "()J")
	public long method8754() {
		return this.aLong269;
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "()V")
	public void method8755() {
		this.aBoolean747 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "()V")
	private void method8756() {
		this.aClass13_84.method8139(this.anInt10303);
		while (!this.aBoolean747 && this.aBoolean748) {
			if (this.aClass182_1 == null || this.aClass182_1.method4408()) {
				this.aBoolean749 = false;
				this.aLong269 = Static220.aClass124_1.method7049();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean749 = true;
				@Pc(21) Class16 local21 = this.aClass182_1.method4406();
				if (local21 instanceof Class16_Sub1) {
					@Pc(27) Class16_Sub1 local27 = (Class16_Sub1) local21;
					if (local27.aBoolean583) {
						local27.method6978(Static380.aClass13_86);
					} else {
						Static433.method6272(local27, this.aClass2_Sub12Array6);
						if (Static126.aClass37_2 != null) {
							Static126.aClass37_2.method6067(-256, this.aClass182_1.aString42, -16777216, local27.anInt8039, local27.anInt8031);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class16_Sub3) local21).anInt4778;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class91 local70 = Static511.aClass91Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static621.anInt10151 + Static621.anInt10151; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static621.anInt10151 + Static621.anInt10151; local75++) {
								if (Static598.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static636.anInt10301 + local72 - Static621.anInt10151;
									@Pc(98) int local98 = Static66.anInt1803 + local75 - Static621.anInt10151;
									if (local92 >= 0 && local92 < local70.anInt8650 && local98 >= 0 && local98 < local70.anInt8645) {
										Static380.aClass13_86.H(local92 << Static326.anInt5713, local70.method7447(local98, local92), local98 << Static326.anInt5713, this.anIntArray729);
										if (Static78.method1681(this.anIntArray729[0]) == this.anInt10303 - 1) {
											local70.method7448(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass13_84.method8086(this.anInt10303);
		while (this.aBoolean747 && this.aBoolean748) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "()Z")
	public boolean method8757() {
		return this.aClass182_1 == null || !this.aBoolean749 && this.aClass182_1.method4408();
	}

	@OriginalMember(owner = "client!wga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean748) {
			this.method8756();
		}
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "()V")
	public void method8758() {
		this.aBoolean747 = true;
		synchronized (this) {
			this.notify();
		}
	}
}
