import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dja", name = "N", descriptor = "I")
	public static int anInt1972 = 0;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "([IIILclient!ea;)V")
	public static void method1933(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15_Sub3_Sub3_Sub1_Sub1 arg2) {
		@Pc(14) boolean local14;
		@Pc(16) int local16;
		if (arg2.anIntArray184 != null) {
			local14 = true;
			for (local16 = 0; local16 < arg2.anIntArray184.length; local16++) {
				if (arg2.anIntArray184[local16] != arg0[local16]) {
					local14 = false;
					break;
				}
			}
			if (local14 && arg2.anInt3985 != -1) {
				@Pc(55) Class178 local55 = Static354.aClass40_2.method1123(arg2.anInt3985);
				@Pc(58) int local58 = local55.anInt5129;
				if (local58 == 1) {
					arg2.anInt4030 = arg1;
					arg2.anInt4036 = 0;
					arg2.anInt3995 = 1;
					arg2.anInt4021 = 0;
					arg2.anInt3998 = 0;
					if (!arg2.aBoolean315) {
						Static509.method7938(local55, arg2, arg2.anInt4021);
					}
				}
				if (local58 == 2) {
					arg2.anInt3998 = 0;
				}
			}
		}
		local14 = true;
		for (local16 = 0; local16 < arg0.length; local16++) {
			if (arg0[local16] != -1) {
				local14 = false;
			}
			if (arg2.anIntArray184 == null || arg2.anIntArray184[local16] == -1 || Static354.aClass40_2.method1123(arg0[local16]).anInt5138 >= Static354.aClass40_2.method1123(arg2.anIntArray184[local16]).anInt5138) {
				arg2.anInt4030 = arg1;
				arg2.anIntArray184 = arg0;
				break;
			}
		}
		if (local14) {
			arg2.anInt4030 = arg1;
			arg2.anIntArray184 = arg0;
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Z)I")
	public static int method1934() {
		return Static255.anInt4904 == 1 ? Static5.anInt88 : 0;
	}
}
