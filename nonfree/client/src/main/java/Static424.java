import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method6214(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZC)B")
	public static byte method6215(@OriginalArg(1) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIII[I)V")
	public static void method6216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(13) int local13 = arg0 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (arg2 < local16) {
			@Pc(20) int local20 = arg2 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg1;
			arg2 = local50 + 1;
			arg3[arg2] = arg1;
		}
		while (local13 > arg2) {
			arg2++;
			arg3[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	public static void method6218() {
		Static74.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V")
	public static void method6219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static470.anInt7897 + arg0;
		@Pc(13) int local13 = Static534.anInt9007 + arg1;
		if (Static242.aClass255ArrayArrayArray2 == null || arg0 < 0 || arg1 < 0 || Static459.anInt7799 <= arg0 || arg1 >= Static482.anInt7990) {
			return;
		}
		@Pc(48) long local48 = (long) (local13 << 14 | arg2 << 28 | local9);
		@Pc(54) Class1_Sub26 local54 = (Class1_Sub26) Static255.aClass17_20.method738(local48);
		if (local54 == null) {
			Static448.method6400(arg2, arg0, arg1);
			return;
		}
		@Pc(73) Class1_Sub38 local73 = (Class1_Sub38) local54.aClass37_48.method977();
		if (local73 == null) {
			Static448.method6400(arg2, arg0, arg1);
			return;
		}
		@Pc(87) Class49_Sub4_Sub1 local87 = (Class49_Sub4_Sub1) Static448.method6400(arg2, arg0, arg1);
		if (local87 == null) {
			local87 = new Class49_Sub4_Sub1();
		} else {
			local87.anInt5786 = local87.anInt5775 = -1;
		}
		local87.anInt5777 = local73.anInt7119;
		local87.anInt5780 = local73.anInt7117;
		label46: while (true) {
			@Pc(115) Class1_Sub38 local115 = (Class1_Sub38) local54.aClass37_48.method971();
			if (local115 == null) {
				break;
			}
			if (local115.anInt7117 != local87.anInt5780) {
				local87.anInt5786 = local115.anInt7117;
				local87.anInt5783 = local115.anInt7119;
				while (true) {
					@Pc(136) Class1_Sub38 local136 = (Class1_Sub38) local54.aClass37_48.method971();
					if (local136 == null) {
						break label46;
					}
					if (local136.anInt7117 != local87.anInt5780 && local87.anInt5786 != local136.anInt7117) {
						local87.anInt5784 = local136.anInt7119;
						local87.anInt5775 = local136.anInt7117;
					}
				}
			}
		}
		@Pc(184) int local184 = Static38.method884(arg2, (arg0 << 9) + 256, (arg1 << 9) - -256);
		Static405.method7484(arg2, arg0, arg1, local184, local87);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZIII)V")
	public static void method6220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static267.anInt5095 == 1) {
			Static411.aClass2Array13[Static456.anInt7775 / 100].method7364(Static515.anInt8604 - 8, Static34.anInt785 - 8);
		}
		if (Static267.anInt5095 == 2) {
			Static411.aClass2Array13[Static456.anInt7775 / 100 + 4].method7364(Static515.anInt8604 - 8, Static34.anInt785 + -8);
		}
		Static65.method6656();
	}
}
