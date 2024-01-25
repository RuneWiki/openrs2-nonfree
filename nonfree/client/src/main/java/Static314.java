import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "[I")
	public static final int[] anIntArray512 = new int[14];

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString341 = "Loaded client variable data";

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public static int anInt6018 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II[Lclient!jf;IIZ)V")
	public static void method5367(@OriginalArg(1) int arg0, @OriginalArg(2) Class96[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class96 local6 = arg1[local1];
			if (local6 != null && arg3 == local6.anInt2929) {
				Static147.method2743(local6, arg0, arg4, arg2);
				Static352.method5797(local6, arg0, arg2);
				if (local6.anInt2918 > local6.anInt2961 - local6.anInt2943) {
					local6.anInt2918 = local6.anInt2961 - local6.anInt2943;
				}
				if (local6.anInt2965 - local6.anInt2916 < local6.anInt2904) {
					local6.anInt2904 = local6.anInt2965 - local6.anInt2916;
				}
				if (local6.anInt2918 < 0) {
					local6.anInt2918 = 0;
				}
				if (local6.anInt2904 < 0) {
					local6.anInt2904 = 0;
				}
				if (local6.anInt2933 == 0) {
					Static27.method4647(arg4, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIII)V")
	public static void method5368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg2;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static126.method2448(arg4, arg3, arg2, arg0);
			}
		} else if (local10 == 0) {
			Static103.method2060(arg2, arg4, arg0, arg1);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(59) boolean local59 = local15 < local10;
			@Pc(63) int local63;
			@Pc(65) int local65;
			if (local59) {
				local63 = arg0;
				local65 = arg1;
				arg0 = arg2;
				arg1 = arg3;
				arg2 = local63;
				arg3 = local65;
			}
			if (arg1 < arg0) {
				local63 = arg0;
				local65 = arg2;
				arg0 = arg1;
				arg2 = arg3;
				arg1 = local63;
				arg3 = local65;
			}
			local63 = arg2;
			local65 = arg1 - arg0;
			@Pc(104) int local104 = arg3 - arg2;
			@Pc(109) int local109 = -(local65 >> 1);
			@Pc(120) int local120 = arg3 > arg2 ? 1 : -1;
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(132) int local132;
			if (local59) {
				for (local132 = arg0; local132 <= arg1; local132++) {
					Static332.anIntArrayArray56[local132][local63] = arg4;
					local109 += local104;
					if (local109 > 0) {
						local109 -= local65;
						local63 += local120;
					}
				}
			} else {
				for (local132 = arg0; local132 <= arg1; local132++) {
					local109 += local104;
					Static332.anIntArrayArray56[local63][local132] = arg4;
					if (local109 > 0) {
						local63 += local120;
						local109 -= local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5369(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(23) byte local23 = 2;
		for (@Pc(25) int local25 = 0; local25 < local8; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local23 == 0) {
				local31 = Character.toLowerCase(local31);
			} else if (local23 == 2 || Character.isUpperCase(local31)) {
				local31 = Static67.method1487(local31);
			}
			if (Character.isLetter(local31)) {
				local23 = 0;
			} else if (local31 == '.' || local31 == '?' || local31 == '!') {
				local23 = 2;
			} else if (!Character.isSpaceChar(local31)) {
				local23 = 1;
			} else if (local23 != 2) {
				local23 = 1;
			}
			local11[local25] = local31;
		}
		return new String(local11);
	}
}
