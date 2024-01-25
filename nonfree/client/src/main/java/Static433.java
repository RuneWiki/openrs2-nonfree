import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
	public static int anInt7533;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_195 = new Class81(75, 8);

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "[S")
	public static final short[] aShortArray104 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!bi;IIIII)V")
	public static void method5831(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6960 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub7Array3[local4] != null) {
				arg0.anInt6960++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6960; local22++) {
			@Pc(31) long local31 = Static427.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class168 local41;
			while (local31 != 0L) {
				local41 = Static77.aClass168Array9[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub7_2 == arg0.aClass2_Sub7Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static427.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static77.aClass168Array9[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub7_2 == arg0.aClass2_Sub7Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt6960 - 1; local93++) {
				arg0.aClass2_Sub7Array3[local93] = arg0.aClass2_Sub7Array3[local93 + 1];
			}
			arg0.anInt6960--;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public static void method5833() {
		try {
			if (Static415.anInt7247 == 1) {
				@Pc(17) int local17 = Static151.aClass2_Sub18_Sub2_1.method2902();
				if (local17 > 0 && Static151.aClass2_Sub18_Sub2_1.method2912()) {
					local17 -= Static158.anInt3122;
					if (local17 < 0) {
						local17 = 0;
					}
					Static151.aClass2_Sub18_Sub2_1.method2884(local17);
				} else {
					Static151.aClass2_Sub18_Sub2_1.method2903();
					Static151.aClass2_Sub18_Sub2_1.method2911();
					Static14.aClass229_1 = null;
					if (Static391.aClass188_113 == null) {
						Static415.anInt7247 = 0;
					} else {
						Static415.anInt7247 = 2;
					}
					Static123.aClass2_Sub9_1 = null;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static151.aClass2_Sub18_Sub2_1.method2903();
			Static391.aClass188_113 = null;
			Static123.aClass2_Sub9_1 = null;
			Static14.aClass229_1 = null;
			Static415.anInt7247 = 0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!pc;ILclient!jb;Lclient!pc;Lclient!pc;)Z")
	public static boolean method5834(@OriginalArg(0) Class188 arg0, @OriginalArg(2) Class2_Sub18_Sub2 arg1, @OriginalArg(3) Class188 arg2, @OriginalArg(4) Class188 arg3) {
		Static218.aClass188_18 = arg2;
		Static180.aClass188_52 = arg3;
		Static332.aClass188_92 = arg0;
		Static151.aClass2_Sub18_Sub2_1 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)I")
	public static int method5835(@OriginalArg(1) int arg0) {
		if (Static423.aClass199_11 != null) {
			Static423.aClass199_11.method4490();
			Static423.aClass199_11 = null;
		}
		Static306.anInt5407++;
		if (Static306.anInt5407 > 4) {
			Static408.anInt7082 = 0;
			Static306.anInt5407 = 0;
			return arg0;
		}
		if (Static427.anInt7456 == Static11.anInt311) {
			Static11.anInt311 = Static135.anInt2654;
		} else {
			Static11.anInt311 = Static427.anInt7456;
		}
		Static408.anInt7082 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([[II)V")
	public static void method5836(@OriginalArg(0) int[][] arg0) {
		Static277.anIntArrayArray40 = arg0;
	}
}
