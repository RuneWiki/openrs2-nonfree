import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public static int anInt3046;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	public static int anInt3049 = -1;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	public static int anInt3051 = -1;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	public static void method2348() {
		Static258.aClass135_36.method3317();
		Static191.aClass135_18.method3317();
		Static113.aClass135_11.method3317();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)V")
	public static void method2349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static49.anInt1129 || Static297.anInt5619 > arg1) {
			return;
		}
		@Pc(33) boolean local33;
		if (arg2 < Static224.anInt4436) {
			arg2 = Static224.anInt4436;
			local33 = false;
		} else if (arg2 > Static68.anInt1451) {
			arg2 = Static68.anInt1451;
			local33 = false;
		} else {
			local33 = true;
		}
		@Pc(59) boolean local59;
		if (arg4 < Static224.anInt4436) {
			local59 = false;
			arg4 = Static224.anInt4436;
		} else if (arg4 <= Static68.anInt1451) {
			local59 = true;
		} else {
			local59 = false;
			arg4 = Static68.anInt1451;
		}
		if (arg0 >= Static297.anInt5619) {
			Static126.method1523(Static22.anIntArrayArray3[arg0++], arg2, arg3, arg4);
		} else {
			arg0 = Static297.anInt5619;
		}
		if (Static49.anInt1129 < arg1) {
			arg1 = Static49.anInt1129;
		} else {
			Static126.method1523(Static22.anIntArrayArray3[arg1--], arg2, arg3, arg4);
		}
		@Pc(124) int local124;
		if (local59 && local33) {
			for (local124 = arg0; local124 <= arg1; local124++) {
				@Pc(171) int[] local171 = Static22.anIntArrayArray3[local124];
				local171[arg4] = local171[arg2] = arg3;
			}
		} else if (local59) {
			for (local124 = arg0; local124 <= arg1; local124++) {
				Static22.anIntArrayArray3[local124][arg4] = arg3;
			}
		} else if (local33) {
			for (local124 = arg0; local124 <= arg1; local124++) {
				Static22.anIntArrayArray3[local124][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class71 local4 = Static164.method2829(arg1, arg0);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray26 != null) {
			@Pc(19) Class1_Sub14 local19 = new Class1_Sub14();
			local19.anInt1264 = arg3;
			local19.aString73 = arg2;
			local19.anObjectArray1 = local4.anObjectArray26;
			local19.aClass71_8 = local4;
			Static188.method3144(local19);
		}
		@Pc(37) boolean local37 = true;
		if (local4.anInt2713 > 0) {
			local37 = Static93.method1673(local4);
		}
		if (!local37 || !Static36.method769(local4).method1366(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static283.aClass1_Sub11_Sub1_3.method2697(149);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 2) {
			Static283.aClass1_Sub11_Sub1_3.method2697(66);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 3) {
			Static283.aClass1_Sub11_Sub1_3.method2697(81);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 4) {
			Static283.aClass1_Sub11_Sub1_3.method2697(232);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 5) {
			Static283.aClass1_Sub11_Sub1_3.method2697(38);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 6) {
			Static283.aClass1_Sub11_Sub1_3.method2697(121);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 7) {
			Static283.aClass1_Sub11_Sub1_3.method2697(63);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 8) {
			Static283.aClass1_Sub11_Sub1_3.method2697(36);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 9) {
			Static283.aClass1_Sub11_Sub1_3.method2697(57);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
		if (arg3 == 10) {
			Static283.aClass1_Sub11_Sub1_3.method2697(74);
			Static283.aClass1_Sub11_Sub1_3.method2659(arg1);
			Static283.aClass1_Sub11_Sub1_3.method2660(arg0);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	public static void method2352() {
		for (@Pc(10) Class1_Sub17 local10 = (Class1_Sub17) Static256.aClass70_17.method2074(); local10 != null; local10 = (Class1_Sub17) Static256.aClass70_17.method2079()) {
			@Pc(16) int local16 = local10.anInt2431;
			if (Static108.method1987(local16)) {
				@Pc(23) boolean local23 = true;
				@Pc(27) Class71[] local27 = Static77.aClass71ArrayArray1[local16];
				@Pc(29) int local29;
				for (local29 = 0; local29 < local27.length; local29++) {
					if (local27[local29] != null) {
						local23 = local27[local29].aBoolean196;
						break;
					}
				}
				if (!local23) {
					local29 = (int) local10.aLong205;
					@Pc(63) Class71 local63 = Static56.method1058(local29);
					if (local63 != null) {
						Static160.method2779(local63);
					}
				}
			}
		}
	}
}
