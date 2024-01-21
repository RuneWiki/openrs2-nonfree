import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!ua;")
	public static Class72 aClass72_5;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_29;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!sa;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1651 = Static106.method1849("flash2:");

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt2828 = 0;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1652 = Static106.method1849("auf der Hautpseite)3");

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public static int anInt2829 = 1;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1653 = aClass66_1651;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1654 = Static106.method1849(":trade:");

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1655 = Static106.method1849("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!va", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[112];

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1656 = Static106.method1849("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1657 = aClass66_1651;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public static int anInt2833 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1992() {
		aClass66_1655 = null;
		aClass66_1657 = null;
		aClass66_1656 = null;
		aClass66_1654 = null;
		aBooleanArray17 = null;
		aClass66_1653 = null;
		aClass66_1652 = null;
		aClass5_Sub1_29 = null;
		aClass72_5 = null;
		aClass64_1 = null;
		aClass66_1651 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!he;I)I")
	public static int method1993(@OriginalArg(1) Class1_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray14 == null || arg1 >= arg0.anIntArrayArray14.length) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg0.anIntArrayArray14[arg1];
			@Pc(31) int local31 = 0;
			@Pc(33) byte local33 = 0;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(37) int local37 = 0;
				@Pc(39) byte local39 = 0;
				@Pc(44) int local44 = local29[local35++];
				if (local44 == 0) {
					return local31;
				}
				if (local44 == 15) {
					local39 = 1;
				}
				if (local44 == 16) {
					local39 = 2;
				}
				if (local44 == 1) {
					local37 = Static4.anIntArray31[local29[local35++]];
				}
				if (local44 == 17) {
					local39 = 3;
				}
				if (local44 == 2) {
					local37 = Static50.anIntArray234[local29[local35++]];
				}
				if (local44 == 3) {
					local37 = Static127.anIntArray495[local29[local35++]];
				}
				@Pc(109) int local109;
				@Pc(120) Class1_Sub10 local120;
				@Pc(125) int local125;
				@Pc(137) int local137;
				if (local44 == 4) {
					local109 = local29[local35++] << 16;
					@Pc(116) int local116 = local109 + local29[local35++];
					local120 = Static38.method2002(local116);
					local125 = local29[local35++];
					if (local125 != -1 && (!Static20.method496(local125).aBoolean64 || Static32.aBoolean35)) {
						for (local137 = 0; local137 < local120.anIntArray201.length; local137++) {
							if (local125 + 1 == local120.anIntArray201[local137]) {
								local37 += local120.anIntArray206[local137];
							}
						}
					}
				}
				if (local44 == 5) {
					local37 = Static103.anIntArray429[local29[local35++]];
				}
				if (local44 == 6) {
					local37 = Class1_Sub1_Sub17.anIntArray492[Static50.anIntArray234[local29[local35++]] - 1];
				}
				if (local44 == 7) {
					local37 = Static103.anIntArray429[local29[local35++]] * 100 / 46875;
				}
				if (local44 == 8) {
					local37 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1314;
				}
				if (local44 == 9) {
					for (local109 = 0; local109 < 25; local109++) {
						if (Static35.aBooleanArray5[local109]) {
							local37 += Static50.anIntArray234[local109];
						}
					}
				}
				if (local44 == 10) {
					local109 = local29[local35++] << 16;
					local109 += local29[local35++];
					local120 = Static38.method2002(local109);
					local125 = local29[local35++];
					if (local125 != -1 && (!Static20.method496(local125).aBoolean64 || Static32.aBoolean35)) {
						for (local137 = 0; local137 < local120.anIntArray201.length; local137++) {
							if (local125 + 1 == local120.anIntArray201[local137]) {
								local37 = 999999999;
								break;
							}
						}
					}
				}
				if (local44 == 11) {
					local37 = Static1.anInt79;
				}
				if (local44 == 12) {
					local37 = Static127.anInt2905;
				}
				if (local44 == 13) {
					local109 = Static103.anIntArray429[local29[local35++]];
					@Pc(324) int local324 = local29[local35++];
					local37 = (local109 & 0x1 << local324) == 0 ? 0 : 1;
				}
				if (local44 == 14) {
					local109 = local29[local35++];
					local37 = Static52.method1096(local109);
				}
				if (local44 == 18) {
					local37 = (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7) + Static48.anInt1496;
				}
				if (local44 == 19) {
					local37 = (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 >> 7) + Static52.anInt1603;
				}
				if (local44 == 20) {
					local37 = local29[local35++];
				}
				if (local39 == 0) {
					if (local33 == 0) {
						local31 += local37;
					}
					if (local33 == 1) {
						local31 -= local37;
					}
					if (local33 == 2 && local37 != 0) {
						local31 /= local37;
					}
					if (local33 == 3) {
						local31 *= local37;
					}
					local33 = 0;
				} else {
					local33 = local39;
				}
			}
		} catch (@Pc(427) Exception local427) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!qa;")
	public static Class1_Sub1_Sub12 method1994(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static82.aClass60_64.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static74.aClass5_61.method107(arg0, 13);
		local10 = new Class1_Sub1_Sub12();
		local10.anInt2336 = arg0;
		if (local20 != null) {
			local10.method1644(new Class1_Sub12(local20));
		}
		Static82.aClass60_64.method1741((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lclient!nd;")
	public static Class1_Sub1_Sub9 method1995(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static17.aClass60_26.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static20.aClass5_21.method107(arg0, 6);
		local10 = new Class1_Sub1_Sub9();
		local10.anInt2066 = arg0;
		if (local20 != null) {
			local10.method1443(new Class1_Sub12(local20));
		}
		local10.method1447();
		if (local10.aBoolean86) {
			local10.aBoolean85 = false;
			local10.anInt2084 = 0;
		}
		Static17.aClass60_26.method1741((long) arg0, local10);
		return local10;
	}
}
