import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 aClass4_Sub4_Sub5_Sub2_1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!ua;")
	public static Class72 aClass72_19 = new Class72(64);

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
	public static int[] anIntArray236 = new int[50];

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[Lclient!sc;")
	public static Class65[] aClass65Array1 = new Class65[50];

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static final int anInt1726 = 0;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public static int anInt1730 = 2;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!v;")
	private static Class76 aClass76_725 = Static134.method2017("Loading config )2 ");

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_724 = aClass76_725;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	public static boolean method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static39.anIntArrayArray9[local3][local7] = 0;
				Static95.anIntArrayArray17[local3][local7] = 99999999;
			}
		}
		@Pc(35) int local35 = arg10;
		local7 = arg8;
		@Pc(39) int local39 = 0;
		@Pc(41) boolean local41 = false;
		Static39.anIntArrayArray9[arg8][arg10] = 99;
		@Pc(49) byte local49 = 0;
		Static95.anIntArrayArray17[arg8][arg10] = 0;
		Static43.anIntArray43[0] = arg8;
		@Pc(62) int local62 = local49 + 1;
		Static74.anIntArray259[0] = arg10;
		@Pc(67) int local67 = Static43.anIntArray43.length;
		@Pc(72) int[][] local72 = Static52.aClass50Array1[Static124.anInt2712].anIntArrayArray16;
		@Pc(193) int local193;
		while (local39 != local62) {
			local7 = Static43.anIntArray43[local39];
			local35 = Static74.anIntArray259[local39];
			local39 = (local39 + 1) % local67;
			if (local7 == arg2 && arg6 == local35) {
				local41 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static52.aClass50Array1[Static124.anInt2712].method1386(local35, arg3 - 1, arg0, arg2, arg6, local7)) {
					local41 = true;
					break;
				}
				if (arg3 < 10 && Static52.aClass50Array1[Static124.anInt2712].method1383(arg3 - 1, local7, arg2, arg6, local35, arg0)) {
					local41 = true;
					break;
				}
			}
			if (arg4 != 0 && arg7 != 0 && Static52.aClass50Array1[Static124.anInt2712].method1390(arg4, arg7, arg2, local35, arg1, local7, arg6)) {
				local41 = true;
				break;
			}
			local193 = Static95.anIntArrayArray17[local7][local35] + 1;
			if (local7 > 0 && Static39.anIntArrayArray9[local7 - 1][local35] == 0 && (local72[local7 - 1][local35] & 0x12C0108) == 0) {
				Static43.anIntArray43[local62] = local7 - 1;
				Static74.anIntArray259[local62] = local35;
				Static39.anIntArrayArray9[local7 - 1][local35] = 2;
				Static95.anIntArrayArray17[local7 - 1][local35] = local193;
				local62 = (local62 + 1) % local67;
			}
			if (local7 < 103 && Static39.anIntArrayArray9[local7 + 1][local35] == 0 && (local72[local7 + 1][local35] & 0x12C0180) == 0) {
				Static43.anIntArray43[local62] = local7 + 1;
				Static74.anIntArray259[local62] = local35;
				local62 = (local62 + 1) % local67;
				Static39.anIntArrayArray9[local7 + 1][local35] = 8;
				Static95.anIntArrayArray17[local7 + 1][local35] = local193;
			}
			if (local35 > 0 && Static39.anIntArrayArray9[local7][local35 - 1] == 0 && (local72[local7][local35 - 1] & 0x12C0102) == 0) {
				Static43.anIntArray43[local62] = local7;
				Static74.anIntArray259[local62] = local35 - 1;
				Static39.anIntArrayArray9[local7][local35 - 1] = 1;
				Static95.anIntArrayArray17[local7][local35 - 1] = local193;
				local62 = (local62 + 1) % local67;
			}
			if (local35 < 103 && Static39.anIntArrayArray9[local7][local35 + 1] == 0 && (local72[local7][local35 + 1] & 0x12C0120) == 0) {
				Static43.anIntArray43[local62] = local7;
				Static74.anIntArray259[local62] = local35 + 1;
				Static39.anIntArrayArray9[local7][local35 + 1] = 4;
				Static95.anIntArrayArray17[local7][local35 + 1] = local193;
				local62 = (local62 + 1) % local67;
			}
			if (local7 > 0 && local35 > 0 && Static39.anIntArrayArray9[local7 - 1][local35 - 1] == 0 && (local72[local7 - 1][local35 - 1] & 0x12C010E) == 0 && (local72[local7 - 1][local35] & 0x12C0108) == 0 && (local72[local7][local35 - 1] & 0x12C0102) == 0) {
				Static43.anIntArray43[local62] = local7 - 1;
				Static74.anIntArray259[local62] = local35 - 1;
				local62 = (local62 + 1) % local67;
				Static39.anIntArrayArray9[local7 - 1][local35 - 1] = 3;
				Static95.anIntArrayArray17[local7 - 1][local35 - 1] = local193;
			}
			if (local7 < 103 && local35 > 0 && Static39.anIntArrayArray9[local7 + 1][local35 - 1] == 0 && (local72[local7 + 1][local35 - 1] & 0x12C0183) == 0 && (local72[local7 + 1][local35] & 0x12C0180) == 0 && (local72[local7][local35 - 1] & 0x12C0102) == 0) {
				Static43.anIntArray43[local62] = local7 + 1;
				Static74.anIntArray259[local62] = local35 - 1;
				Static39.anIntArrayArray9[local7 + 1][local35 - 1] = 9;
				Static95.anIntArrayArray17[local7 + 1][local35 - 1] = local193;
				local62 = (local62 + 1) % local67;
			}
			if (local7 > 0 && local35 < 103 && Static39.anIntArrayArray9[local7 - 1][local35 + 1] == 0 && (local72[local7 - 1][local35 + 1] & 0x12C0138) == 0 && (local72[local7 - 1][local35] & 0x12C0108) == 0 && (local72[local7][local35 + 1] & 0x12C0120) == 0) {
				Static43.anIntArray43[local62] = local7 - 1;
				Static74.anIntArray259[local62] = local35 + 1;
				local62 = (local62 + 1) % local67;
				Static39.anIntArrayArray9[local7 - 1][local35 + 1] = 6;
				Static95.anIntArrayArray17[local7 - 1][local35 + 1] = local193;
			}
			if (local7 < 103 && local35 < 103 && Static39.anIntArrayArray9[local7 + 1][local35 + 1] == 0 && (local72[local7 + 1][local35 + 1] & 0x12C01E0) == 0 && (local72[local7 + 1][local35] & 0x12C0180) == 0 && (local72[local7][local35 + 1] & 0x12C0120) == 0) {
				Static43.anIntArray43[local62] = local7 + 1;
				Static74.anIntArray259[local62] = local35 + 1;
				Static39.anIntArrayArray9[local7 + 1][local35 + 1] = 12;
				Static95.anIntArrayArray17[local7 + 1][local35 + 1] = local193;
				local62 = (local62 + 1) % local67;
			}
		}
		Static95.anInt2209 = 0;
		@Pc(827) int local827;
		@Pc(832) int local832;
		@Pc(838) int local838;
		if (!local41) {
			if (!arg5) {
				return false;
			}
			local193 = 1000;
			local827 = 100;
			for (local832 = arg2 - 10; local832 <= arg2 + 10; local832++) {
				for (local838 = arg6 - 10; local838 <= arg6 + 10; local838++) {
					if (local832 >= 0 && local838 >= 0 && local832 < 104 && local838 < 104 && Static95.anIntArrayArray17[local832][local838] < 100) {
						@Pc(867) int local867 = 0;
						if (local832 < arg2) {
							local867 = arg2 - local832;
						} else if (arg2 + arg4 - 1 < local832) {
							local867 = local832 + 1 - arg4 - arg2;
						}
						@Pc(904) int local904 = 0;
						if (local838 < arg6) {
							local904 = arg6 - local838;
						} else if (arg7 + arg6 - 1 < local838) {
							local904 = local838 + 1 - arg6 - arg7;
						}
						@Pc(943) int local943 = local904 * local904 + local867 * local867;
						if (local193 > local943 || local943 == local193 && Static95.anIntArrayArray17[local832][local838] < local827) {
							local827 = Static95.anIntArrayArray17[local832][local838];
							local35 = local838;
							local7 = local832;
							local193 = local943;
						}
					}
				}
			}
			if (local193 == 1000) {
				return false;
			}
			if (local7 == arg8 && arg10 == local35) {
				return false;
			}
			Static95.anInt2209 = 1;
		}
		@Pc(1019) byte local1019 = 0;
		Static43.anIntArray43[0] = local7;
		local39 = local1019 + 1;
		Static74.anIntArray259[0] = local35;
		local193 = local827 = Static39.anIntArrayArray9[local7][local35];
		while (local7 != arg8 || local35 != arg10) {
			if (local193 != local827) {
				Static43.anIntArray43[local39] = local7;
				Static74.anIntArray259[local39++] = local35;
				local827 = local193;
			}
			if ((local193 & 0x2) != 0) {
				local7++;
			} else if ((local193 & 0x8) != 0) {
				local7--;
			}
			if ((local193 & 0x1) != 0) {
				local35++;
			} else if ((local193 & 0x4) != 0) {
				local35--;
			}
			local193 = Static39.anIntArrayArray9[local7][local35];
		}
		if (local39 > 0) {
			local67 = local39;
			if (local39 > 25) {
				local67 = 25;
			}
			local39--;
			local832 = Static74.anIntArray259[local39];
			@Pc(1115) int local1115 = Static43.anIntArray43[local39];
			if (arg9 == 0) {
				Static69.aClass4_Sub10_Sub1_2.method611(157);
				Static69.aClass4_Sub10_Sub1_2.method600(local67 + local67 + 3);
			}
			if (arg9 == 1) {
				Static69.aClass4_Sub10_Sub1_2.method611(107);
				Static69.aClass4_Sub10_Sub1_2.method600(local67 + local67 + 14 + 3);
			}
			if (arg9 == 2) {
				Static69.aClass4_Sub10_Sub1_2.method611(229);
				Static69.aClass4_Sub10_Sub1_2.method600(local67 + local67 + 3);
			}
			Static69.aClass4_Sub10_Sub1_2.method592(Static42.aBooleanArray7[82] ? 1 : 0);
			Static69.aClass4_Sub10_Sub1_2.method565(Static64.anInt1649 + local832);
			Static92.anInt2151 = Static74.anIntArray259[0];
			Static51.anInt2078 = Static43.anIntArray43[0];
			for (local838 = 1; local838 < local67; local838++) {
				local39--;
				Static69.aClass4_Sub10_Sub1_2.method570(Static43.anIntArray43[local39] - local1115);
				Static69.aClass4_Sub10_Sub1_2.method562(Static74.anIntArray259[local39] - local832);
			}
			Static69.aClass4_Sub10_Sub1_2.method566(Static51.anInt2080 + local1115);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!la;)Z")
	public static boolean method1137(@OriginalArg(1) int arg0, @OriginalArg(2) Class17 arg1) {
		@Pc(10) byte[] local10 = arg1.method291(arg0);
		if (local10 == null) {
			return false;
		} else {
			Static94.method1511(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!cf;BIILjava/awt/Component;)Lclient!ab;")
	public static Class3 method1138(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static106.anInt2355 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class3 local33 = (Class3) Class.forName("Class3_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt2203 = arg1;
			local33.anIntArray309 = new int[(Static72.aBoolean117 ? 2 : 1) * 256];
			local33.method1531(arg3);
			local33.anInt2196 = (arg1 & 0xFFFFFC00) + 1024;
			if (local33.anInt2196 > 16384) {
				local33.anInt2196 = 16384;
			}
			local33.method1527(local33.anInt2196);
			if (Static84.anInt2021 > 0 && Static10.aClass37_1 == null) {
				Static10.aClass37_1 = new Class37();
				Static10.aClass37_1.aClass14_2 = arg0;
				arg0.method192(Static10.aClass37_1, Static84.anInt2021);
			}
			if (Static10.aClass37_1 != null) {
				if (Static10.aClass37_1.aClass3Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static10.aClass37_1.aClass3Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class3_Sub1 local111 = new Class3_Sub1(arg0, arg2);
				local111.anIntArray309 = new int[(Static72.aBoolean117 ? 2 : 1) * 256];
				local111.anInt2203 = arg1;
				local111.method1531(arg3);
				local111.anInt2196 = 16384;
				local111.method1527(local111.anInt2196);
				if (Static84.anInt2021 > 0 && Static10.aClass37_1 == null) {
					Static10.aClass37_1 = new Class37();
					Static10.aClass37_1.aClass14_2 = arg0;
					arg0.method192(Static10.aClass37_1, Static84.anInt2021);
				}
				if (Static10.aClass37_1 != null) {
					if (Static10.aClass37_1.aClass3Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static10.aClass37_1.aClass3Array1[arg2] = local111;
				}
				return local111;
			} catch (@Pc(175) Throwable local175) {
				return new Class3();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1139(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString5 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local24 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(86) String local86 = local59.substring(local65 + 1, local72);
					@Pc(90) int local90 = local86.indexOf(".java:");
					if (local90 >= 0) {
						local86 = local86.substring(0, local90) + local86.substring(local90 + 5);
						local24 = local24 + local86 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local24 = local24 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1140() {
		aClass4_Sub4_Sub5_Sub2_1 = null;
		anIntArray236 = null;
		aClass65Array1 = null;
		aClass72_19 = null;
		aClass76_724 = null;
		aClass76_725 = null;
	}
}
