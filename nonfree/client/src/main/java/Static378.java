import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "[Lclient!p;")
	public static final Class135_Sub1[] aClass135_Sub1Array6 = new Class135_Sub1[29];

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
	public static int anInt4759 = 0;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
	public static int anInt4760 = -1;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
	public static final int[] anIntArray392 = new int[14];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ab;IZ)V")
	public static void method4266(@OriginalArg(0) Class3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt76 == 0 ? arg0.anInt64 : arg0.anInt76;
		@Pc(29) int local29 = arg0.anInt111 == 0 ? arg0.anInt116 : arg0.anInt111;
		Static94.method1603(local12, arg0.anInt94, local29, arg1, Static272.aClass3ArrayArray1[arg0.anInt94 >> 16]);
		if (arg0.aClass3Array1 != null) {
			Static94.method1603(local12, arg0.anInt94, local29, arg1, arg0.aClass3Array1);
		}
		@Pc(62) Class2_Sub26 local62 = (Class2_Sub26) Static273.aClass243_20.method5967((long) arg0.anInt94);
		if (local62 != null) {
			Static232.method4182(local12, local29, local62.anInt4145, arg1);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4269(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static97.anInt2139;
		@Pc(9) int[] local9 = Static321.anIntArray512;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(30) Class1_Sub2_Sub1_Sub1 local30 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local9[local13]];
			if (local30 != null && Static182.aClass1_Sub2_Sub1_Sub1_1 != local30 && local30.aString12 != null && local30.aString12.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static77.method1332(Static222.aClass183_65);
					Static76.aClass2_Sub24_Sub2_7.method5746(0);
					Static76.aClass2_Sub24_Sub2_7.method5735(local9[local13]);
				} else if (arg1 == 4) {
					Static77.method1332(Static115.aClass183_33);
					Static76.aClass2_Sub24_Sub2_7.method5746(0);
					Static76.aClass2_Sub24_Sub2_7.method5715(local9[local13]);
				} else if (arg1 == 5) {
					Static77.method1332(Static315.aClass183_89);
					Static76.aClass2_Sub24_Sub2_7.method5735(local9[local13]);
					Static76.aClass2_Sub24_Sub2_7.method5746(0);
				} else if (arg1 == 6) {
					Static77.method1332(Static287.aClass183_79);
					Static76.aClass2_Sub24_Sub2_7.method5746(0);
					Static76.aClass2_Sub24_Sub2_7.method5726(local9[local13]);
				} else if (arg1 == 7) {
					Static77.method1332(Static291.aClass183_82);
					Static76.aClass2_Sub24_Sub2_7.method5775(0);
					Static76.aClass2_Sub24_Sub2_7.method5726(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static79.method1369(Static146.aClass62_104.method1389(Static200.anInt4144) + arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method4271(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(28) int local28 = arg1[arg2 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(44) char local44 = Static322.aCharArray6[local28 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local28 = local44;
				}
				local8[local15++] = (char) local28;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class73 method4272(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static20.aFloat52 == 3.0D) {
				return Static10.aClass73_13;
			}
			if ((double) Static20.aFloat52 == 4.0D) {
				return Static41.aClass73_4;
			}
			if ((double) Static20.aFloat52 == 6.0D) {
				return Static297.aClass73_11;
			}
			if ((double) Static20.aFloat52 >= 8.0D) {
				return Static147.aClass73_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static20.aFloat52 == 3.0D) {
				return Static297.aClass73_11;
			}
			if ((double) Static20.aFloat52 == 4.0D) {
				return Static147.aClass73_7;
			}
			if ((double) Static20.aFloat52 == 6.0D) {
				return Static17.aClass73_3;
			}
			if ((double) Static20.aFloat52 >= 8.0D) {
				return Static295.aClass73_10;
			}
		} else if (arg0 == 2) {
			if ((double) Static20.aFloat52 == 3.0D) {
				return Static17.aClass73_3;
			}
			if ((double) Static20.aFloat52 == 4.0D) {
				return Static295.aClass73_10;
			}
			if ((double) Static20.aFloat52 == 6.0D) {
				return Static123.aClass73_12;
			}
			if ((double) Static20.aFloat52 >= 8.0D) {
				return Static194.aClass73_8;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
	public static void method4274() {
		Static257.anIntArray403 = Static328.method5289(0.4F);
	}
}
