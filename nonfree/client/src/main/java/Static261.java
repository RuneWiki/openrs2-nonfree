import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString187 = "glow3:";

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public static int anInt5241 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method3923(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) int local20 = Static247.aClass8_Sub1_Sub5_5.method2037(arg0, 250);
		@Pc(35) int local35 = Static247.aClass8_Sub1_Sub5_5.method2016(arg0, 250) * 13;
		if (Static116.aBoolean188) {
			Static126.method1994(6, 6, local20 + 4 + 4, local35 - -8, 0);
			Static126.method2004(6, 6, local20 + 4 + 4, local35 + 4 - -4, 16777215);
		} else {
			Static103.method1664(6, 6, local20 + 4 + 4, 4 + 4 + local35, 0);
			Static103.method1669(6, 6, local20 + 4 + 4, local35 - -8, 16777215);
		}
		Static247.aClass8_Sub1_Sub5_5.method2022(arg0, 10, 10, local20, local35, 16777215, -1, 1, 1, 0);
		Static216.method3391(local20 + 4 + 4, local35 + 8, 6, 6);
		if (!arg1) {
			Static128.method2076(10, 10, local35, local20);
		} else if (Static116.aBoolean188) {
			Static116.method1879();
		} else {
			try {
				@Pc(168) Graphics local168 = Static39.aCanvas1.getGraphics();
				Static99.aClass4_1.method3763(local168);
			} catch (@Pc(176) Exception local176) {
				Static39.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
	public static void method3925(@OriginalArg(0) int arg0) {
		if (Static283.anInt5551 == 0) {
			Static231.aClass8_Sub8_Sub2_3.method2121(arg0);
		} else {
			Static86.anInt1847 = arg0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V")
	public static void method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		Static19.method343(arg3 - arg4, arg0, Static181.anIntArrayArray19[arg2], arg3 + arg4);
		@Pc(23) int local23 = arg4 * arg4;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local29 << 1;
		@Pc(37) int local37 = local23 << 1;
		@Pc(41) int local41 = arg1 << 1;
		@Pc(49) int local49 = local29 - local37 * (local41 - 1);
		@Pc(53) int local53 = local23 << 2;
		@Pc(57) int local57 = local29 << 2;
		@Pc(67) int local67 = local23 * (1 - local41) + local33;
		@Pc(75) int local75 = local37 * ((arg1 << 1) - 3);
		@Pc(83) int local83 = local33 * 3;
		@Pc(89) int local89 = local57;
		@Pc(95) int local95 = (arg1 - 1) * local53;
		while (local25 > 0) {
			if (local67 < 0) {
				while (local67 < 0) {
					local67 += local83;
					local49 += local89;
					local3++;
					local83 += local57;
					local89 += local57;
				}
			}
			local25--;
			@Pc(128) int local128 = arg2 + local25;
			if (local49 < 0) {
				local49 += local89;
				local67 += local83;
				local89 += local57;
				local3++;
				local83 += local57;
			}
			@Pc(153) int local153 = arg2 - local25;
			local67 += -local95;
			local49 += -local75;
			local75 -= local53;
			@Pc(172) int local172 = arg3 - local3;
			@Pc(176) int local176 = local3 + arg3;
			Static19.method343(local172, arg0, Static181.anIntArrayArray19[local153], local176);
			local95 -= local53;
			Static19.method343(local172, arg0, Static181.anIntArrayArray19[local128], local176);
		}
	}
}
