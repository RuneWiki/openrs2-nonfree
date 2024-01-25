import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean578 = true;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public static void method6956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg1, 1);
		local8.method776();
		local8.anInt972 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!dga;I)Lclient!jt;")
	public static Class38_Sub3 method6957(@OriginalArg(0) Class6_Sub14 arg0) {
		return new Class38_Sub3(arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method5988(), arg0.method5988(), arg0.method6041());
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([BZILjava/lang/String;)I")
	public static int method6958(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(25) int local25 = 0; local25 < local10; local25 += 4) {
			@Pc(33) int local33 = Static247.method3537(arg2.charAt(local25));
			@Pc(52) int local52 = local10 > local25 + 1 ? Static247.method3537(arg2.charAt(local25 + 1)) : -1;
			@Pc(67) int local67 = local25 + 2 < local10 ? Static247.method3537(arg2.charAt(local25 + 2)) : -1;
			@Pc(82) int local82 = local10 > local25 + 3 ? Static247.method3537(arg2.charAt(local25 + 3)) : -1;
			arg0[arg1++] = (byte) (local52 >>> 4 | local33 << 2);
			if (local67 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local52 & 0xF) << 4 | local67 >>> 2);
			if (local82 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local82 | (local67 & 0x3) << 6);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIIIII[BII)V")
	public static void method6959(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg3++;
				arg6[local26] += arg0[arg2++];
				@Pc(38) int local38 = arg3++;
				arg6[local38] += arg0[arg2++];
				@Pc(50) int local50 = arg3++;
				arg6[local50] += arg0[arg2++];
				@Pc(62) int local62 = arg3++;
				arg6[local62] += arg0[arg2++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg3++;
				arg6[local26] += arg0[arg2++];
			}
			arg3 += arg7;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method6960(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static383.anInt6691 >= 100) {
			Static418.method6132(Static141.aClass104_84.method2145(Static470.anInt7957));
			return;
		}
		@Pc(25) String local25 = Static502.method6919(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(34) int local34 = 0; local34 < Static383.anInt6691; local34++) {
			@Pc(42) String local42 = Static502.method6919(Static353.aStringArray23[local34]);
			if (local42 != null && local42.equals(local25)) {
				Static418.method6132(arg1 + Static141.aClass104_85.method2145(Static470.anInt7957));
				return;
			}
			if (Static129.aStringArray10[local34] != null) {
				local73 = Static502.method6919(Static129.aStringArray10[local34]);
				if (local73 != null && local73.equals(local25)) {
					Static418.method6132(arg1 + Static141.aClass104_85.method2145(Static470.anInt7957));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static300.anInt4872; local104++) {
			local73 = Static502.method6919(Static489.aStringArray30[local104]);
			if (local73 != null && local73.equals(local25)) {
				Static418.method6132(Static141.aClass104_90.method2145(Static470.anInt7957) + arg1 + Static141.aClass104_91.method2145(Static470.anInt7957));
				return;
			}
			if (Static478.aStringArray28[local104] != null) {
				@Pc(148) String local148 = Static502.method6919(Static478.aStringArray28[local104]);
				if (local148 != null && local148.equals(local25)) {
					Static418.method6132(Static141.aClass104_90.method2145(Static470.anInt7957) + arg1 + Static141.aClass104_91.method2145(Static470.anInt7957));
					return;
				}
			}
		}
		if (Static502.method6919(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108).equals(local25)) {
			Static418.method6132(Static141.aClass104_87.method2145(Static470.anInt7957));
		} else {
			Static136.method2051(Static103.aClass160_123);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg1) + 1);
			Static218.aClass6_Sub14_Sub2_1.method5989(arg1);
			Static218.aClass6_Sub14_Sub2_1.method6035(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)I")
	public static int method6961(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static350.anIntArray535[arg1 & 0x3] : Static576.anIntArray730[arg1 & 0x3];
	}
}
