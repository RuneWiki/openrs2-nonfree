import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	public static int anInt8445;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
	public static int anInt8451;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "[Lclient!eia;")
	public static Class96[] aClass96Array1;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
	public static int anInt8454;

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "Lclient!cb;")
	public static Class50 aClass50_147;

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIIIII)V")
	public static void method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(164) Class313 local164 = Static129.aClass313ArrayArrayArray7[arg4][arg2][arg0];
			if (local164 == null) {
				local164 = new Class313(arg4);
			}
			if (arg3 == 1) {
				local164.aShort97 = (short) arg5;
				local164.aShort99 = (short) arg1;
			} else if (arg3 == 2) {
				local164.aShort100 = (short) arg1;
				local164.aShort98 = (short) arg5;
			}
			if (Static652.aBoolean748) {
				Static226.method3207();
			}
			return;
		}
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(56) int local56;
		if (arg3 != 8) {
			local22 = Static108.anInt1949 + (arg2 << Static138.anInt2287);
			local27 = local22 - Static108.anInt1949;
			local31 = arg0 << Static138.anInt2287;
			local36 = Static108.anInt1949 + local31;
			local44 = Static230.aClass88Array2[arg4].method8749(arg2 + 1, arg0);
			local56 = Static230.aClass88Array2[arg4].method8749(arg2, arg0 + 1);
			Static105.aClass180Array4[Static252.anInt4008++] = new Class180(arg3, arg4, local22, local27, local27, local22, local44, local56, local56 - arg1, -arg1 + local44, local31, local36, local36, local31);
			return;
		}
		local22 = arg2 << Static138.anInt2287;
		local27 = local22 + Static108.anInt1949;
		local31 = arg0 << Static138.anInt2287;
		local36 = local31 + Static108.anInt1949;
		local44 = Static230.aClass88Array2[arg4].method8749(arg2, arg0);
		local56 = Static230.aClass88Array2[arg4].method8749(arg2 + 1, arg0 + 1);
		Static105.aClass180Array4[Static252.anInt4008++] = new Class180(arg3, arg4, local22, local27, local27, local22, local44, local56, local56 - arg1, local44 - arg1, local31, local36, local36, local31);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!oga;Lclient!ha;BIILclient!or;ILclient!ip;I)V")
	public static void method7188(@OriginalArg(0) Class5_Sub40 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class262 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class170 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 - arg5 / 2 - 5;
		@Pc(15) int local15 = arg3 + 2;
		if (arg4.anInt7645 != 0) {
			arg1.method6252(local15, local11, arg4.anInt7645, arg3 + arg2 * arg6.method3590() + 1 - local15, arg5 + 10);
		}
		if (arg4.anInt7631 != 0) {
			arg1.method6235(local15, arg5 + 10, arg3 + 1 + arg6.method3590() * arg2 + -local15, arg4.anInt7631, local11);
		}
		@Pc(69) int local69 = arg4.anInt7619;
		if (arg0.aBoolean548 && arg4.anInt7639 != -1) {
			local69 = arg4.anInt7639;
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			@Pc(94) String local94 = Static444.aStringArray29[local82];
			if (local82 < arg2 - 1) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg6.method3595(arg1, local94, arg7, arg3, local69);
			arg3 += arg6.method3590();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method7189(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(13) int local13 = arg1.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (arg0 == arg1.charAt(local15)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
	public static void method7191() {
		@Pc(8) int local8 = Static655.aClass5_Sub36_29.aClass2_Sub21_1.method7492();
		if (local8 == 0) {
			Static664.aByteArrayArrayArray18 = null;
			Static149.method2217(0);
		} else if (local8 == 1) {
			Static29.method391((byte) 0);
			Static149.method2217(512);
			if (Static317.aByteArrayArrayArray13 != null) {
				Static112.method1808();
			}
		} else {
			Static29.method391((byte) (Static219.anInt3472 - 4 & 0xFF));
			Static149.method2217(2);
		}
		Static658.anInt9444 = Static458.anInt7955;
	}
}
