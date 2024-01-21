import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_89 = Static129.method2060("Abbrechen");

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!r;")
	private static Class61 aClass61_92 = Static129.method2060("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_90 = aClass61_92;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public static int anInt232 = 0;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
	public static int[] anIntArray52 = new int[50];

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_91 = Static129.method2060(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public static void method186(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7 = Static92.anInt2219;
		if (Static96.anInt2502 == Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 >> 7 && Static104.anInt2719 == Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 >> 7) {
			Static96.anInt2502 = 0;
		}
		if (arg0) {
			local7 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(47) Class5_Sub2_Sub2_Sub3_Sub2 local47;
			@Pc(41) int local41;
			if (arg0) {
				local47 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10;
				local41 = 33538048;
			} else {
				local41 = Static66.anIntArray236[local31] << 14;
				local47 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local31]];
			}
			if (local47 != null && local47.method1855()) {
				@Pc(64) int local64 = local47.anInt2912 >> 7;
				local47.aBoolean102 = false;
				@Pc(72) int local72 = local47.anInt2875 >> 7;
				if ((Static61.aBoolean57 && Static92.anInt2219 > 50 || Static92.anInt2219 > 200) && !arg0 && local47.anInt2917 == local47.anInt2916) {
					local47.aBoolean102 = true;
				}
				if (local64 >= 0 && local64 < 104 && local72 >= 0 && local72 < 104) {
					if (local47.aClass5_Sub2_Sub2_Sub6_1 == null || Static58.anInt1422 < local47.anInt2942 || Static58.anInt1422 >= local47.anInt2940) {
						if ((local47.anInt2912 & 0x7F) == 64 && (local47.anInt2875 & 0x7F) == 64) {
							if (Static45.anIntArrayArray11[local64][local72] == Static134.anInt3404) {
								continue;
							}
							Static45.anIntArrayArray11[local64][local72] = Static134.anInt3404;
						}
						local47.anInt2948 = Static42.method757(Static93.anInt2428, local47.anInt2912, local47.anInt2875);
						Static61.aClass81_1.method2115(Static93.anInt2428, local47.anInt2912, local47.anInt2875, local47.anInt2948, 60, local47, local47.anInt2919, local41, local47.aBoolean101);
					} else {
						local47.aBoolean102 = false;
						local47.anInt2948 = Static42.method757(Static93.anInt2428, local47.anInt2912, local47.anInt2875);
						Static61.aClass81_1.method2082(Static93.anInt2428, local47.anInt2912, local47.anInt2875, local47.anInt2948, local47, local47.anInt2919, local41, local47.anInt2951, local47.anInt2953, local47.anInt2935, local47.anInt2939);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ff;I)V")
	public static void method187(@OriginalArg(0) Class26 arg0) {
		Static109.aClass26_27 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
	public static int method188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	public static boolean method189(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method191() {
		@Pc(9) int local9 = Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method544(Static47.aClass61_371);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static36.anInt1015; local11++) {
			local19 = Static100.aClass5_Sub2_Sub1_Sub1_Sub1_4.method544(Static86.method1532(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		Static64.anInt2727 = Static36.anInt1015 * 15 + 22;
		local9 += 8;
		Static117.aBoolean105 = true;
		Static127.anInt3201 = local9;
		local19 = Static36.anInt1015 * 15 + 21;
		@Pc(51) int local51 = Static12.anInt308;
		@Pc(58) int local58 = Static26.anInt613 - local9 / 2;
		if (local9 + local58 > 765) {
			local58 = 765 - local9;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		if (local19 + local51 > 503) {
			local51 = 503 - local19;
		}
		Static117.anInt3014 = local58;
		if (local51 < 0) {
			local51 = 0;
		}
		Static81.anInt3355 = local51;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lclient!sc;[BIII)V")
	public static void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg1 + local7 > 0 && local7 + arg1 < 103 && local11 + arg4 > 0 && arg4 + local11 < 103) {
						arg2[local3].anIntArrayArray22[arg1 + local7][arg4 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class5_Sub14 local87 = new Class5_Sub14(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					Static119.method1900(local87, 0, arg5, local11, local93 + arg1, arg4 + local97, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method193() {
		aClass61_92 = null;
		aClass61_89 = null;
		anIntArray52 = null;
		aClass61_90 = null;
		aClass61_91 = null;
	}
}
