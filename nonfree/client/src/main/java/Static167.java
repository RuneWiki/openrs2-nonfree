import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_8;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array12;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "[I")
	public static int[] anIntArray434 = new int[50];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!ce;)Lclient!dd;")
	public static Class13 method2852(@OriginalArg(2) Class1_Sub8 arg0) {
		try {
			@Pc(12) Class13 local12 = new Class13();
			local12.anInt1080 = arg0.method1645();
			if (local12.anInt1080 > 32767) {
				local12.anInt1080 = 32767;
			}
			local12.aByteArray19 = new byte[local12.anInt1080];
			arg0.anInt2195 += Static113.aClass24_1.method1345(local12.anInt1080, local12.aByteArray19, arg0.aByteArray27, arg0.anInt2195, 0);
			return local12;
		} catch (@Pc(51) Exception local51) {
			return Static96.aClass13_883;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILclient!lc;JLclient!lc;Lclient!lc;)V")
	public static void method2854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub2 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class1_Sub2_Sub2 arg6, @OriginalArg(7) Class1_Sub2_Sub2 arg7) {
		@Pc(3) Class44 local3 = new Class44();
		local3.aClass1_Sub2_Sub2_3 = arg4;
		local3.anInt2492 = arg1 * 128 + 64;
		local3.anInt2483 = arg2 * 128 + 64;
		local3.anInt2489 = arg3;
		local3.aLong82 = arg5;
		local3.aClass1_Sub2_Sub2_4 = arg6;
		local3.aClass1_Sub2_Sub2_5 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class1_Sub10 local42 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1544; local46++) {
				if ((local42.aClass59Array4[local46].aLong106 & 0x400000L) == 4194304L && local42.aClass59Array4[local46].aClass1_Sub2_Sub2_7 instanceof Class1_Sub2_Sub2_Sub5) {
					@Pc(71) Class1_Sub2_Sub2_Sub5 local71 = (Class1_Sub2_Sub2_Sub5) local42.aClass59Array4[local46].aClass1_Sub2_Sub2_7;
					local71.method2714();
					if (local71.aShort27 < local34) {
						local34 = local71.aShort27;
					}
				}
			}
		}
		local3.anInt2487 = -local34;
		if (Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2] == null) {
			Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2] = new Class1_Sub10(arg0, arg1, arg2);
		}
		Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass44_1 = local3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIII)V")
	public static void method2857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static66.anInt1948 = -1;
			Static30.anInt1069 = -1;
			return;
		}
		@Pc(33) int local33 = Static66.method1449(Static156.anInt3696, arg2, arg1) - arg0;
		@Pc(37) int local37 = Class1_Sub2_Sub1_Sub2.anIntArray41[Static104.anInt2874];
		@Pc(53) int local53 = local33 - Static45.anInt1493;
		@Pc(57) int local57 = arg1 - Static22.anInt2236;
		@Pc(61) int local61 = arg2 - Static7.anInt3157;
		@Pc(65) int local65 = Class1_Sub2_Sub1_Sub2.anIntArray41[Static49.anInt1557];
		@Pc(69) int local69 = Class1_Sub2_Sub1_Sub2.anIntArray38[Static49.anInt1557];
		@Pc(79) int local79 = local69 * local57 + local61 * local65 >> 16;
		@Pc(89) int local89 = local61 * local69 - local65 * local57 >> 16;
		@Pc(91) int local91 = local79;
		@Pc(95) int local95 = Class1_Sub2_Sub1_Sub2.anIntArray38[Static104.anInt2874];
		@Pc(106) int local106 = local53 * local95 - local37 * local89 >> 16;
		@Pc(116) int local116 = local95 * local89 + local53 * local37 >> 16;
		if (local116 >= 50) {
			Static30.anInt1069 = (local106 << 9) / local116 + 167;
			Static66.anInt1948 = (local91 << 9) / local116 + 256;
		} else {
			Static66.anInt1948 = -1;
			Static30.anInt1069 = -1;
		}
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	public static void method2859() {
		aClass1_Sub2_Sub1_Sub3_8 = null;
		aClass1_Sub2_Sub1_Sub3Array12 = null;
		anIntArray434 = null;
	}
}
