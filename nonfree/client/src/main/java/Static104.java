import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	public static int anInt1801;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
	public static int anInt1808;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "[I")
	public static final int[] anIntArray133 = new int[1];

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "[I")
	public static final int[] anIntArray134 = new int[8];

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIILclient!mfa;IILclient!al;IIIII)V")
	public static void method1550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class18 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static337.anInt5203 = arg4;
		Static158.aClass355_5 = null;
		Static213.aClass239_9 = arg3;
		Static620.anInt10230 = arg10;
		Static506.aClass18_13 = arg6;
		Static437.aClass355_4 = null;
		Static30.aClass355_1 = null;
		Static557.anInt8789 = arg7;
		Static236.anInt3729 = arg8;
		Static496.anInt7941 = arg0;
		Static519.anInt8273 = arg5;
		Static676.anInt10486 = arg1;
		Static426.anInt6943 = arg2;
		Static456.anInt7444 = arg9;
		Static192.method2749();
		Static203.aBoolean311 = true;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIBIII)V")
	public static void method1551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(18) Class4_Sub3 local18 = (Class4_Sub3) Static480.aClass320_6.method7605(); local18 != null; local18 = (Class4_Sub3) Static480.aClass320_6.method7608()) {
			if (Static528.anInt8386 >= local18.anInt644) {
				local18.method9416();
			} else {
				Static531.method7478(arg2 >> 1, (local18.anInt651 << 9) + 256, arg1 >> 1, local18.anInt647, local18.anInt649 * 2, (local18.anInt650 << 9) + 256);
				Static387.aClass68_12.method7888(local18.aString2, Static189.anIntArray243[0] + arg0, 0, Static189.anIntArray243[1] + arg3, local18.anInt648 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method1552(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) int local18 = arg2.length();
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) char local24 = 0;
		@Pc(26) char local26 = 0;
		while (local8 > local20 - local24 || local18 > local22 - local26) {
			if (local8 <= local20 - local24) {
				return -1;
			}
			if (local22 - local26 >= local18) {
				return 1;
			}
			@Pc(83) char local83;
			if (local24 == '\u0000') {
				local83 = arg0.charAt(local20++);
			} else {
				local83 = local24;
			}
			@Pc(93) char local93;
			if (local26 == '\u0000') {
				local93 = arg2.charAt(local22++);
			} else {
				local93 = local26;
			}
			local24 = Static301.method8953(local83);
			local26 = Static301.method8953(local93);
			local83 = Static211.method2958(local83, arg1);
			local93 = Static211.method2958(local93, arg1);
			if (local83 != local93 && Character.toUpperCase(local83) != Character.toUpperCase(local93)) {
				local83 = Character.toLowerCase(local83);
				local93 = Character.toLowerCase(local93);
				if (local83 != local93) {
					return Static721.method9619(local83, arg1) - Static721.method9619(local93, arg1);
				}
			}
		}
		@Pc(161) int local161 = Math.min(local8, local18);
		for (@Pc(163) int local163 = 0; local163 < local161; local163++) {
			if (arg1 == 2) {
				local20 = local8 - local163 - 1;
				local22 = local18 - local163 - 1;
			} else {
				local22 = local163;
				local20 = local163;
			}
			@Pc(195) char local195 = arg0.charAt(local20);
			@Pc(199) char local199 = arg2.charAt(local22);
			if (local195 != local199 && Character.toUpperCase(local195) != Character.toUpperCase(local199)) {
				local195 = Character.toLowerCase(local195);
				local199 = Character.toLowerCase(local199);
				if (local199 != local195) {
					return Static721.method9619(local195, arg1) - Static721.method9619(local199, arg1);
				}
			}
		}
		@Pc(247) int local247 = local8 - local18;
		if (local247 != 0) {
			return local247;
		}
		for (@Pc(256) int local256 = 0; local256 < local161; local256++) {
			@Pc(264) char local264 = arg0.charAt(local256);
			@Pc(268) char local268 = arg2.charAt(local256);
			if (local264 != local268) {
				return Static721.method9619(local264, arg1) - Static721.method9619(local268, arg1);
			}
		}
		return 0;
	}
}
