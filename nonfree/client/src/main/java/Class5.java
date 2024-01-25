import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class5 {

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "F")
	public float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "F")
	public float aFloat8 = 1.0F;

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "F")
	public float aFloat10 = 0.25F;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "F")
	public final float aFloat9;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
	public final int anInt68;

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "Lclient!ka;")
	public final Class3 aClass3_1;

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
	public final int anInt72;

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
	public final int anInt73;

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "F")
	public final float aFloat6;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
	public final int anInt77;

	@OriginalMember(owner = "client!aca", name = "p", descriptor = "F")
	public final float aFloat11;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	public final int anInt76;

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
	public final int anInt74;

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
			aLongArray1[local18] = local22;
		}
	}

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V")
	public Class5() {
		this.aFloat9 = 1.2F;
		this.anInt68 = -60;
		this.aClass3_1 = Static476.aClass3_4;
		this.anInt72 = Static122.anInt2114;
		this.anInt73 = Static547.anInt9362;
		this.aFloat6 = 1.1523438F;
		this.anInt77 = -50;
		this.aFloat11 = 0.69921875F;
		this.anInt76 = 0;
		this.anInt74 = -50;
	}

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!jr;)V")
	public Class5(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(16) int local16 = arg0.method6019();
		if (Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700) && Static89.aClass90_3.method7458() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt73 = Static547.anInt9362;
			} else {
				this.anInt73 = arg0.method6015();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat6 = 1.1523438F;
			} else {
				this.aFloat6 = (float) arg0.method6044() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat11 = 0.69921875F;
			} else {
				this.aFloat11 = (float) arg0.method6044() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat9 = 1.2F;
			} else {
				this.aFloat9 = (float) arg0.method6044() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6015();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6044();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6044();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6044();
			}
			this.aFloat9 = 1.2F;
			this.aFloat11 = 0.69921875F;
			this.aFloat6 = 1.1523438F;
			this.anInt73 = Static547.anInt9362;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt74 = -50;
			this.anInt77 = -50;
			this.anInt68 = -60;
		} else {
			this.anInt77 = arg0.method6023();
			this.anInt68 = arg0.method6023();
			this.anInt74 = arg0.method6023();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt72 = Static122.anInt2114;
		} else {
			this.anInt72 = arg0.method6015();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt76 = 0;
		} else {
			this.anInt76 = arg0.method6044();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass3_1 = Static476.aClass3_4;
		} else {
			@Pc(225) int local225 = arg0.method6044();
			@Pc(229) int local229 = arg0.method6044();
			@Pc(233) int local233 = arg0.method6044();
			@Pc(237) int local237 = arg0.method6044();
			@Pc(241) int local241 = arg0.method6044();
			@Pc(245) int local245 = arg0.method6044();
			this.aClass3_1 = Static216.method1061(local229, local237, local241, local245, local233, local225);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!jr;)V")
	public void method80(@OriginalArg(1) Class6_Sub12 arg0) {
		this.aFloat7 = (float) (arg0.method6019() * 8) / 255.0F;
		this.aFloat10 = (float) (arg0.method6019() * 8) / 255.0F;
		this.aFloat8 = (float) (arg0.method6019() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!aca;I)Z")
	public boolean method81(@OriginalArg(0) Class5 arg0) {
		return this.anInt73 == arg0.anInt73 && arg0.aFloat6 == this.aFloat6 && this.aFloat11 == arg0.aFloat11 && arg0.aFloat9 == this.aFloat9 && this.aFloat10 == arg0.aFloat10 && this.aFloat7 == arg0.aFloat7 && arg0.aFloat8 == this.aFloat8 && this.anInt72 == arg0.anInt72 && arg0.anInt76 == this.anInt76 && this.aClass3_1 == arg0.aClass3_1;
	}
}
