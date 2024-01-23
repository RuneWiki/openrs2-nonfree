import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
	public static int anInt1931;

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_2;

	@OriginalMember(owner = "client!fl", name = "bb", descriptor = "Lclient!ib;")
	public static Class4_Sub3_Sub10 aClass4_Sub3_Sub10_3;

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "Lclient!ll;")
	public static Class114 aClass114_9 = new Class114();

	@OriginalMember(owner = "client!fl", name = "ab", descriptor = "Z")
	public static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
	public static int anInt1937 = -1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Lclient!ch;[BIIIIZII)V")
	public static void method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class4_Sub10 local10 = new Class4_Sub10(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method4635();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local10.method4616();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(57) int local57 = local34 >> 6 & 0x3F;
				@Pc(61) int local61 = local34 & 0x3F;
				@Pc(65) int local65 = local34 >> 12;
				@Pc(69) int local69 = local10.method4666();
				@Pc(73) int local73 = local69 >> 2;
				@Pc(77) int local77 = local69 & 0x3;
				if (local65 == arg7 && arg6 <= local57 && arg6 + 8 > local57 && arg5 <= local61 && arg5 + 8 > local61) {
					@Pc(108) Class184 local108 = Static6.method99(local12);
					@Pc(125) int local125 = Static210.method3160(local108.anInt5528, local61 & 0x7, local77, local57 & 0x7, arg4, local108.anInt5517) + arg1;
					@Pc(145) int local145 = arg9 + Static186.method4393(local57 & 0x7, local108.anInt5517, local108.anInt5528, arg4, local61 & 0x7, local77);
					if (local125 > 0 && local145 > 0 && local125 < 103 && local145 < 103) {
						@Pc(162) Class30 local162 = null;
						if (!arg8) {
							@Pc(166) int local166 = arg0;
							if ((Static174.aByteArrayArrayArray17[1][local125][local145] & 0x2) == 2) {
								local166 = arg0 - 1;
							}
							if (local166 >= 0) {
								local162 = arg2[local166];
							}
						}
						Static143.method2194(local77 + arg4 & 0x3, arg0, local12, arg0, local125, arg8, local145, local162, !arg8, local73);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!fh;ILclient!fh;)V")
	public static void method1473(@OriginalArg(0) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		Static50.aClass58_26 = arg1;
		Static252.aClass58_91 = arg0;
	}
}
