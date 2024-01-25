import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
	public static final int[] anIntArray387 = new int[8];

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray92 = new byte[1000][];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!qa;Lclient!co;IIIII)V")
	public static void method3894(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static107.anInt1964) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static377.anInt6467) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static378.anInt6480 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class211 local62 = Static268.aClass211ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static92.aClass136Array1[local17].I(local23, local32) + Static92.aClass136Array1[local17].I(local23 + 1, local32) + Static92.aClass136Array1[local17].I(local23, local32 + 1) + Static92.aClass136Array1[local17].I(local23 + 1, local32 + 1)) / 4 - (Static92.aClass136Array1[arg2].I(arg3, arg4) + Static92.aClass136Array1[arg2].I(arg3 + 1, arg4) + Static92.aClass136Array1[arg2].I(arg3, arg4 + 1) + Static92.aClass136Array1[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class26_Sub1 local143 = local62.aClass26_Sub1_2;
									@Pc(146) Class26_Sub1 local146 = local62.aClass26_Sub1_3;
									if (local143 != null && local143.method5512()) {
										arg1.method5514((local32 - arg4) * Static337.anInt7424 + (1 - arg6) * Static122.anInt2160, local140, local143, (local23 - arg3) * Static337.anInt7424 + (1 - arg5) * Static122.anInt2160, arg0, local1);
									}
									if (local146 != null && local146.method5512()) {
										arg1.method5514((local32 - arg4) * Static337.anInt7424 + (1 - arg6) * Static122.anInt2160, local140, local146, (local23 - arg3) * Static337.anInt7424 + (1 - arg5) * Static122.anInt2160, arg0, local1);
									}
									for (@Pc(219) Class125 local219 = local62.aClass125_3; local219 != null; local219 = local219.aClass125_1) {
										@Pc(223) Class26_Sub2 local223 = local219.aClass26_Sub2_1;
										if (local223 != null && local223.method5512() && (local23 == local223.aShort93 || local23 == local3) && (local32 == local223.aShort94 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort92 + 1 - local223.aShort93;
											@Pc(260) int local260 = local223.aShort95 + 1 - local223.aShort94;
											arg1.method5514((local223.aShort94 - arg4) * Static337.anInt7424 + (local260 - arg6) * Static122.anInt2160, local140, local223, (local223.aShort93 - arg3) * Static337.anInt7424 + (local252 - arg5) * Static122.anInt2160, arg0, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIII)Z")
	public static boolean method3895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static184.aByteArrayArrayArray3[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static184.aByteArrayArrayArray3[arg3][arg0][arg1] & 0x10) == 0) {
			return Static270.method3935(arg3, arg0, arg1) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V")
	public static void method3896() {
		Static55.method989(Static70.aClass131_49);
		for (@Pc(21) Class1_Sub36 local21 = (Class1_Sub36) Static445.aClass27_42.method555(); local21 != null; local21 = (Class1_Sub36) Static445.aClass27_42.method563()) {
			if (!local21.method6069()) {
				local21 = (Class1_Sub36) Static445.aClass27_42.method555();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt5679 == 0) {
				Static225.method3382(true, local21, true);
			}
		}
		if (Static419.aClass219_18 != null) {
			Static355.method4895(Static419.aClass219_18);
			Static419.aClass219_18 = null;
		}
	}
}
