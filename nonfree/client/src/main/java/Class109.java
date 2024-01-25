import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class109 {

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "[J")
	public static final long[] aLongArray6 = new long[256];

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "F")
	public float aFloat33 = 1.0F;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "F")
	public float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "F")
	public float aFloat37 = 0.25F;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "F")
	public final float aFloat38;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public final int anInt2745;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "F")
	public final float aFloat36;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	public final int anInt2754;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public final int anInt2749;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	public final int anInt2747;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "F")
	public final float aFloat34;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public final int anInt2751;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public final int anInt2748;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!ob;")
	public final Class3 aClass3_1;

	static {
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(22) long local22 = (long) local18;
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				if ((local22 & 0x1L) == 1L) {
					local22 = local22 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local22 >>>= 0x1;
				}
			}
			aLongArray6[local18] = local22;
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class109() {
		this.aFloat38 = 0.69921875F;
		this.anInt2745 = 0;
		this.aFloat36 = 1.2F;
		this.anInt2754 = Static343.anInt5894;
		this.anInt2749 = -50;
		this.anInt2747 = Static429.anInt7256;
		this.aFloat34 = 1.1523438F;
		this.anInt2751 = -60;
		this.anInt2748 = -50;
		this.aClass3_1 = Static322.aClass3_2;
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class109(@OriginalArg(0) Class1_Sub28 arg0) {
		@Pc(16) int local16 = arg0.method5337();
		if (Static453.aClass136_Sub1_1.method3519(Static14.anInt293) && Static383.aClass34_11.method5800() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2754 = Static343.anInt5894;
			} else {
				this.anInt2754 = arg0.method5355();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat34 = 1.1523438F;
			} else {
				this.aFloat34 = (float) arg0.method5335() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat38 = 0.69921875F;
			} else {
				this.aFloat38 = (float) arg0.method5335() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat36 = 1.2F;
			} else {
				this.aFloat36 = (float) arg0.method5335() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5355();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5335();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5335();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5335();
			}
			this.aFloat38 = 0.69921875F;
			this.aFloat36 = 1.2F;
			this.anInt2754 = Static343.anInt5894;
			this.aFloat34 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2751 = -60;
			this.anInt2748 = -50;
			this.anInt2749 = -50;
		} else {
			this.anInt2748 = arg0.method5382();
			this.anInt2751 = arg0.method5382();
			this.anInt2749 = arg0.method5382();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2747 = Static429.anInt7256;
		} else {
			this.anInt2747 = arg0.method5355();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2745 = 0;
		} else {
			this.anInt2745 = arg0.method5335();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass3_1 = Static322.aClass3_2;
		} else {
			@Pc(232) int local232 = arg0.method5335();
			@Pc(236) int local236 = arg0.method5335();
			@Pc(240) int local240 = arg0.method5335();
			@Pc(244) int local244 = arg0.method5335();
			@Pc(248) int local248 = arg0.method5335();
			@Pc(252) int local252 = arg0.method5335();
			this.aClass3_1 = Static86.method1409(local240, local236, local248, local232, local252, local244);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ug;)V")
	public void method2386(@OriginalArg(1) Class1_Sub28 arg0) {
		this.aFloat33 = (float) (arg0.method5337() * 8) / 255.0F;
		this.aFloat37 = (float) (arg0.method5337() * 8) / 255.0F;
		this.aFloat35 = (float) (arg0.method5337() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ie;)Z")
	public boolean method2387(@OriginalArg(1) Class109 arg0) {
		return this.anInt2754 == arg0.anInt2754 && arg0.aFloat34 == this.aFloat34 && arg0.aFloat38 == this.aFloat38 && arg0.aFloat36 == this.aFloat36 && arg0.aFloat37 == this.aFloat37 && this.aFloat33 == arg0.aFloat33 && arg0.aFloat35 == this.aFloat35 && arg0.anInt2747 == this.anInt2747 && this.anInt2745 == arg0.anInt2745 && this.aClass3_1 == arg0.aClass3_1;
	}
}
