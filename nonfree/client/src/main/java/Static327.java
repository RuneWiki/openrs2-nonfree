import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!dp;")
	public static Class53 aClass53_90;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	public static int anInt3029;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Z")
	public static boolean aBoolean227;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "Lclient!of;")
	public static Class40 aClass40_6;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	public static int anInt3039 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[III[I[B[[B[[B)I")
	public static int method3199(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg3[arg2];
		@Pc(16) int local16 = local9 + arg1[arg2];
		@Pc(25) int local25 = arg3[arg0];
		@Pc(31) int local31 = arg1[arg0] + local25;
		@Pc(33) int local33 = local9;
		if (local25 > local9) {
			local33 = local25;
		}
		@Pc(44) int local44 = local16;
		if (local16 > local31) {
			local44 = local31;
		}
		@Pc(59) int local59 = arg4[arg2] & 0xFF;
		if (local59 > (arg4[arg0] & 0xFF)) {
			local59 = arg4[arg0] & 0xFF;
		}
		@Pc(80) byte[] local80 = arg6[arg2];
		@Pc(84) byte[] local84 = arg5[arg0];
		@Pc(88) int local88 = local33 - local9;
		@Pc(92) int local92 = local33 - local25;
		for (@Pc(94) int local94 = local33; local94 < local44; local94++) {
			@Pc(106) int local106 = local84[local92++] + local80[local88++];
			if (local59 > local106) {
				local59 = local106;
			}
		}
		return -local59;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lclient!lq;")
	public static Class129 method3200(@OriginalArg(1) int arg0) {
		@Pc(10) Class129 local10 = (Class129) Static338.aClass70_106.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static95.aClass53_46.method1033(arg0, 31);
		local10 = new Class129();
		if (local25 != null) {
			local10.method3471(new Class6_Sub10(local25), arg0);
		}
		Static338.aClass70_106.method1406(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3202(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static57.anInt1094 >= 100 && !Static256.aBoolean335 || Static57.anInt1094 >= 200) {
			Static23.method356(Static255.aString199);
			return;
		}
		@Pc(26) String local26 = Static205.method5718(arg0);
		if (local26 == null) {
			return;
		}
		@Pc(70) String local70;
		for (@Pc(35) int local35 = 0; local35 < Static57.anInt1094; local35++) {
			@Pc(43) String local43 = Static205.method5718(Static86.aStringArray11[local35]);
			if (local43 != null && local43.equals(local26)) {
				Static23.method356(arg0 + Static164.aString128);
				return;
			}
			if (Static328.aStringArray42[local35] != null) {
				local70 = Static205.method5718(Static328.aStringArray42[local35]);
				if (local70 != null && local70.equals(local26)) {
					Static23.method356(arg0 + Static164.aString128);
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static71.anInt1344; local97++) {
			local70 = Static205.method5718(Static39.aStringArray3[local97]);
			if (local70 != null && local70.equals(local26)) {
				Static23.method356(Static82.aString54 + arg0 + Static68.aString179);
				return;
			}
			if (Static215.aStringArray26[local97] != null) {
				@Pc(134) String local134 = Static205.method5718(Static215.aStringArray26[local97]);
				if (local134 != null && local134.equals(local26)) {
					Static23.method356(Static82.aString54 + arg0 + Static68.aString179);
					return;
				}
			}
		}
		if (Static205.method5718(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207).equals(local26)) {
			Static23.method356(Static302.aString263);
		} else {
			Static131.aClass6_Sub10_Sub1_2.method2886(198);
			Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(arg0));
			Static131.aClass6_Sub10_Sub1_2.method3966(arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
	public static void method3203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = Static62.anInt1130 * arg0 >> 8;
		if (local5 != 0 && arg2 != -1) {
			Static177.method3430(local5, Static243.aClass53_113, arg2);
			Static40.aBoolean54 = true;
		}
	}
}
