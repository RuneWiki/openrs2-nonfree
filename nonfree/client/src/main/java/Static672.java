import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "Lclient!je;")
	private static Class184 aClass184_1;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "Lclient!aq;")
	private static Class23 aClass23_2;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lclient!qga;")
	private static Class299 aClass299_13;

	@OriginalMember(owner = "client!wfa", name = "H", descriptor = "Lclient!uq;")
	private static Class14_Sub48 aClass14_Sub48_3;

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "Lclient!qga;")
	private static Class299 aClass299_14;

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "[I")
	private static int[] anIntArray588;

	@OriginalMember(owner = "client!wfa", name = "y", descriptor = "[J")
	private static long[] aLongArray22;

	@OriginalMember(owner = "client!wfa", name = "x", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray49;

	@OriginalMember(owner = "client!wfa", name = "F", descriptor = "[Lclient!oq;")
	private static final Class277[] aClass277Array1 = new Class277[50];

	@OriginalMember(owner = "client!wfa", name = "C", descriptor = "I")
	private static int anInt10952 = 0;

	@OriginalMember(owner = "client!wfa", name = "w", descriptor = "I")
	private static int anInt10954 = 0;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "[I")
	private static final int[] anIntArray587 = new int[5];

	@OriginalMember(owner = "client!wfa", name = "D", descriptor = "[[I")
	private static final int[][] anIntArrayArray67 = new int[5][5000];

	@OriginalMember(owner = "client!wfa", name = "s", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_71 = new Class317(4);

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray48 = new String[1000];

	@OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
	private static int anInt10958 = 0;

	@OriginalMember(owner = "client!wfa", name = "o", descriptor = "[J")
	private static final long[] aLongArray21 = new long[1000];

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
	private static int anInt10960 = 0;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "[I")
	private static final int[] anIntArray589 = new int[3];

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "[I")
	private static final int[] anIntArray590 = new int[1000];

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString122 = null;

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
	private static int anInt10965 = 0;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "Z")
	public static boolean aBoolean765 = false;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(C)I")
	private static int method9292(@OriginalArg(0) char arg0) {
		return Static270.method4527(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!qga;)V")
	private static void method9293(@OriginalArg(0) Class299 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class299[] local71;
		if (arg0.anInt8590 == -1) {
			@Pc(119) int local119 = arg0.anInt8526 >>> 16;
			@Pc(123) Class299[] local123 = Static359.aClass299ArrayArray2[local119];
			if (local123 == null) {
				local71 = Static339.aClass299ArrayArray1[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static359.aClass299ArrayArray2[local119] = new Class299[local132];
				Static691.method86(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static691.method86(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class299 local12 = Static391.method5936(arg0.anInt8527);
		if (local12 == null) {
			return;
		}
		if (local12.aClass299Array2 == local12.aClass299Array1) {
			local12.aClass299Array2 = new Class299[local12.aClass299Array1.length];
			local12.aClass299Array2[local12.aClass299Array2.length - 1] = arg0;
			Static691.method86(local12.aClass299Array1, 0, local12.aClass299Array2, 0, arg0.anInt8590);
			Static691.method86(local12.aClass299Array1, arg0.anInt8590 + 1, local12.aClass299Array2, arg0.anInt8590, local12.aClass299Array1.length - arg0.anInt8590 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass299Array2;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static691.method86(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass299Array2.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
	public static void method9294(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static558.method8063(arg0)) {
			return;
		}
		@Pc(14) Class299[] local14 = Static339.aClass299ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class299 local21 = local14[local16];
			if (local21.anObjectArray12 != null) {
				@Pc(28) Class14_Sub10 local28 = new Class14_Sub10();
				local28.aClass299_2 = local21;
				local28.anObjectArray1 = local21.anObjectArray12;
				method9296(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(Lclient!qga;)V")
	private static void method9295(@OriginalArg(0) Class299 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class299[] local69;
		if (arg0.anInt8590 == -1) {
			@Pc(106) int local106 = arg0.anInt8526 >>> 16;
			@Pc(110) Class299[] local110 = Static359.aClass299ArrayArray2[local106];
			if (local110 == null) {
				local69 = Static339.aClass299ArrayArray1[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static359.aClass299ArrayArray2[local106] = new Class299[local119];
				Static691.method86(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static691.method86(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class299 local12 = Static391.method5936(arg0.anInt8527);
		if (local12 == null) {
			return;
		}
		if (local12.aClass299Array2 == local12.aClass299Array1) {
			local12.aClass299Array2 = new Class299[local12.aClass299Array1.length];
			local12.aClass299Array2[0] = arg0;
			Static691.method86(local12.aClass299Array1, 0, local12.aClass299Array2, 1, arg0.anInt8590);
			Static691.method86(local12.aClass299Array1, arg0.anInt8590 + 1, local12.aClass299Array2, arg0.anInt8590 + 1, local12.aClass299Array1.length - arg0.anInt8590 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass299Array2;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static691.method86(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!ce;I)V")
	private static void method9296(@OriginalArg(0) Class14_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class14_Sub2_Sub6 local12 = Static247.method4199(local8);
		if (local12 == null) {
			return;
		}
		anIntArray588 = new int[local12.anInt1452];
		@Pc(22) int local22 = 0;
		aStringArray49 = new String[local12.anInt1447];
		@Pc(28) int local28 = 0;
		aLongArray22 = new long[local12.anInt1448];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt1053;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt1058;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass299_2 == null ? -1 : arg0.aClass299_2.anInt8526;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt1054;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass299_2 == null ? -1 : arg0.aClass299_2.anInt8590;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass299_1 == null ? -1 : arg0.aClass299_1.anInt8526;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass299_1 == null ? -1 : arg0.aClass299_1.anInt8590;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt1049;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt1057;
				}
				anIntArray588[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString20;
				}
				aStringArray49[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray22[local34++] = local180;
			}
		}
		anInt10965 = arg0.anInt1050;
		method9301(local12, arg1);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(IZ)V")
	public static void method9297() {
	}

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "(I)J")
	private static long method9298(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass23_2.method355(Static161.aClass80_6.anInt1861 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!hs;II)V")
	public static void method9299(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class14_Sub2_Sub6 local5 = Static145.method2167(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray588 = new int[local5.anInt1452];
		aStringArray49 = new String[local5.anInt1447];
		if (local5.aClass162_2 == Static635.aClass162_15 || local5.aClass162_2 == Static485.aClass162_10 || local5.aClass162_2 == Static533.aClass162_11) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static125.aClass299_4 != null) {
				local35 = Static125.aClass299_4.anInt8534;
				local37 = Static125.aClass299_4.anInt8603;
			}
			anIntArray588[0] = Static656.aClass118_1.method7586() - local35;
			anIntArray588[1] = Static656.aClass118_1.method7590() - local37;
		}
		method9301(local5, 200000);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9300(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static469.anInt11068 == 0 && (Static321.aBoolean403 && !Static586.aBoolean669 || Static292.aBoolean395)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static21.aClass21_46.method324(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static21.aClass21_46.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_47.method324(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static21.aClass21_47.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_48.method324(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static21.aClass21_48.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_49.method324(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static21.aClass21_49.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_50.method324(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static21.aClass21_50.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_51.method324(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static21.aClass21_51.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_52.method324(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static21.aClass21_52.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_53.method324(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static21.aClass21_53.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_54.method324(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static21.aClass21_54.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_55.method324(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static21.aClass21_55.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_56.method324(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static21.aClass21_56.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_57.method324(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static21.aClass21_57.method324(0).length());
		} else if (Static26.anInt352 != 0) {
			if (local18.startsWith(Static21.aClass21_46.method324(Static26.anInt352))) {
				local20 = 0;
				arg0 = arg0.substring(Static21.aClass21_46.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_47.method324(Static26.anInt352))) {
				local20 = 1;
				arg0 = arg0.substring(Static21.aClass21_47.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_48.method324(Static26.anInt352))) {
				local20 = 2;
				arg0 = arg0.substring(Static21.aClass21_48.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_49.method324(Static26.anInt352))) {
				local20 = 3;
				arg0 = arg0.substring(Static21.aClass21_49.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_50.method324(Static26.anInt352))) {
				local20 = 4;
				arg0 = arg0.substring(Static21.aClass21_50.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_51.method324(Static26.anInt352))) {
				local20 = 5;
				arg0 = arg0.substring(Static21.aClass21_51.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_52.method324(Static26.anInt352))) {
				local20 = 6;
				arg0 = arg0.substring(Static21.aClass21_52.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_53.method324(Static26.anInt352))) {
				local20 = 7;
				arg0 = arg0.substring(Static21.aClass21_53.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_54.method324(Static26.anInt352))) {
				local20 = 8;
				arg0 = arg0.substring(Static21.aClass21_54.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_55.method324(Static26.anInt352))) {
				local20 = 9;
				arg0 = arg0.substring(Static21.aClass21_55.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_56.method324(Static26.anInt352))) {
				local20 = 10;
				arg0 = arg0.substring(Static21.aClass21_56.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_57.method324(Static26.anInt352))) {
				local20 = 11;
				arg0 = arg0.substring(Static21.aClass21_57.method324(Static26.anInt352).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static21.aClass21_58.method324(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static21.aClass21_58.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_59.method324(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static21.aClass21_59.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_60.method324(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static21.aClass21_60.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_61.method324(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static21.aClass21_61.method324(0).length());
		} else if (local18.startsWith(Static21.aClass21_62.method324(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static21.aClass21_62.method324(0).length());
		} else if (Static26.anInt352 != 0) {
			if (local18.startsWith(Static21.aClass21_58.method324(Static26.anInt352))) {
				local460 = 1;
				arg0 = arg0.substring(Static21.aClass21_58.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_59.method324(Static26.anInt352))) {
				local460 = 2;
				arg0 = arg0.substring(Static21.aClass21_59.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_60.method324(Static26.anInt352))) {
				local460 = 3;
				arg0 = arg0.substring(Static21.aClass21_60.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_61.method324(Static26.anInt352))) {
				local460 = 4;
				arg0 = arg0.substring(Static21.aClass21_61.method324(Static26.anInt352).length());
			} else if (local18.startsWith(Static21.aClass21_62.method324(Static26.anInt352))) {
				local460 = 5;
				arg0 = arg0.substring(Static21.aClass21_62.method324(Static26.anInt352).length());
			}
		}
		@Pc(650) Class347 local650 = Static435.method6495();
		@Pc(656) Class14_Sub54 local656 = Static72.method1195(local650.aClass197_2, Static484.aClass251_188);
		local656.aClass14_Sub21_Sub2_2.method7747(0);
		@Pc(665) int local665 = local656.aClass14_Sub21_Sub2_2.anInt8936;
		local656.aClass14_Sub21_Sub2_2.method7747(local20);
		local656.aClass14_Sub21_Sub2_2.method7747(local460);
		Static582.method8305(arg0, local656.aClass14_Sub21_Sub2_2);
		local656.aClass14_Sub21_Sub2_2.method7715(local656.aClass14_Sub21_Sub2_2.anInt8936 - local665);
		local650.method8308(local656);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!co;I)V")
	private static void method9301(@OriginalArg(0) Class14_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		anInt10958 = 0;
		anInt10960 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray78;
		@Pc(11) int[] local11 = arg0.anIntArray79;
		@Pc(13) byte local13 = -1;
		anInt10952 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label381: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean765 && (aString122 == null || arg0.aString27 != null && arg0.aString27.indexOf(aString122) != -1)) {
					System.out.println(arg0.aString27 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method9305(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method9306(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray590[anInt10958++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray590[anInt10958++] = Static188.aClass238_1.anIntArray347[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static188.aClass238_1.method5868(local96, anIntArray590[--anInt10958]);
					} else if (local34 == 3) {
						aStringArray48[anInt10960++] = arg0.aStringArray10[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt10958 -= 2;
						if (anIntArray590[anInt10958] != anIntArray590[anInt10958 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt10958 -= 2;
						if (anIntArray590[anInt10958] == anIntArray590[anInt10958 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt10958 -= 2;
						if (anIntArray590[anInt10958] < anIntArray590[anInt10958 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt10958 -= 2;
						if (anIntArray590[anInt10958] > anIntArray590[anInt10958 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt10952 == 0) {
							return;
						}
						@Pc(270) Class277 local270 = aClass277Array1[--anInt10952];
						arg0 = local270.aClass14_Sub2_Sub6_1;
						local8 = arg0.anIntArray78;
						local11 = arg0.anIntArray79;
						local5 = local270.anInt7498;
						anIntArray588 = local270.anIntArray397;
						aStringArray49 = local270.aStringArray31;
						aLongArray22 = local270.aLongArray15;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray590[anInt10958++] = Static188.aClass238_1.method5864(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static188.aClass238_1.method5871(anIntArray590[--anInt10958], local96);
					} else if (local34 == 31) {
						anInt10958 -= 2;
						if (anIntArray590[anInt10958] <= anIntArray590[anInt10958 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt10958 -= 2;
						if (anIntArray590[anInt10958] >= anIntArray590[anInt10958 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray590[anInt10958++] = anIntArray588[local11[local5]];
					} else if (local34 == 34) {
						anIntArray588[local11[local5]] = anIntArray590[--anInt10958];
					} else if (local34 == 35) {
						aStringArray48[anInt10960++] = aStringArray49[local11[local5]];
					} else if (local34 == 36) {
						aStringArray49[local11[local5]] = aStringArray48[--anInt10960];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt10960 -= local96;
							local465 = Static613.method8647(anInt10960, aStringArray48, local96);
							aStringArray48[anInt10960++] = local465;
						} else if (local34 == 38) {
							anInt10958--;
						} else if (local34 == 39) {
							anInt10960--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class14_Sub2_Sub6 local503 = Static247.method4199(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt1452];
							@Pc(518) String[] local518 = new String[local503.anInt1447];
							@Pc(522) long[] local522 = new long[local503.anInt1448];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt1450; local524++) {
								local514[local524] = anIntArray590[anInt10958 + local524 - local503.anInt1450];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt1449; local543++) {
								local518[local543] = aStringArray48[anInt10960 + local543 - local503.anInt1449];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt1451; local562++) {
								local522[local562] = aLongArray21[anInt10954 + local562 - local503.anInt1451];
							}
							anInt10958 -= local503.anInt1450;
							anInt10960 -= local503.anInt1449;
							anInt10954 -= local503.anInt1451;
							@Pc(598) Class277 local598 = new Class277();
							local598.aClass14_Sub2_Sub6_1 = arg0;
							local598.anInt7498 = local5;
							local598.anIntArray397 = anIntArray588;
							local598.aStringArray31 = aStringArray49;
							local598.aLongArray15 = aLongArray22;
							if (anInt10952 >= aClass277Array1.length) {
								throw new RuntimeException();
							}
							aClass277Array1[anInt10952++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray78;
							local11 = local503.anIntArray79;
							local5 = -1;
							anIntArray588 = local514;
							aStringArray49 = local518;
							aLongArray22 = local522;
						} else if (local34 == 42) {
							anIntArray590[anInt10958++] = Static184.anIntArray401[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static184.anIntArray401[local96] = anIntArray590[--anInt10958];
							Static306.method5439(local96);
							Static610.aBoolean693 |= Static195.aBooleanArray6[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray590[--anInt10958];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray587[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray67[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray590[--anInt10958];
							if (local706 < 0 || local706 >= anIntArray587[local96]) {
								throw new RuntimeException();
							}
							anIntArray590[anInt10958++] = anIntArrayArray67[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt10958 -= 2;
							local706 = anIntArray590[anInt10958];
							if (local706 < 0 || local706 >= anIntArray587[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray67[local96][local706] = anIntArray590[anInt10958 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static110.aStringArray14[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray48[anInt10960++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static110.aStringArray14[local96] = aStringArray48[--anInt10960];
							Static475.method7126(local96);
						} else if (local34 == 51) {
							@Pc(889) Class125 local889 = arg0.aClass125Array1[local11[local5]];
							@Pc(902) Class14_Sub30 local902 = (Class14_Sub30) local889.method2630((long) anIntArray590[--anInt10958]);
							if (local902 != null) {
								local5 += local902.anInt6793;
							}
						} else if (local34 == 54) {
							aLongArray21[anInt10954++] = arg0.aLongArray6[local5];
						} else if (local34 == 55) {
							anInt10954--;
						} else if (local34 == 66) {
							aLongArray21[anInt10954++] = aLongArray22[local11[local5]];
						} else if (local34 == 67) {
							aLongArray22[local11[local5]] = aLongArray21[--anInt10954];
						} else if (local34 == 68) {
							anInt10954 -= 2;
							if (aLongArray21[anInt10954] != aLongArray21[anInt10954 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt10954 -= 2;
							if (aLongArray21[anInt10954] == aLongArray21[anInt10954 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt10954 -= 2;
							if (aLongArray21[anInt10954] < aLongArray21[anInt10954 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt10954 -= 2;
							if (aLongArray21[anInt10954] > aLongArray21[anInt10954 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt10954 -= 2;
							if (aLongArray21[anInt10954] <= aLongArray21[anInt10954 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt10954 -= 2;
							if (aLongArray21[anInt10954] >= aLongArray21[anInt10954 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray590[--anInt10958] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray590[--anInt10958] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static576.anObjectArray36[local96];
							if (local1178 == null) {
								@Pc(1185) Class10 local1185 = Static258.aClass370_1.method8886(local96);
								if (local1185.aChar1 == 'i' || local1185.aChar1 == '1') {
									anIntArray590[anInt10958++] = 0;
								} else {
									anIntArray590[anInt10958++] = -1;
								}
							} else {
								anIntArray590[anInt10958++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class10 local1236 = Static258.aClass370_1.method8886(local96);
							if (local1236.aChar1 != '\u0001') {
								anIntArray590[anInt10958++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static576.anObjectArray36[local1236.anInt80];
							if (local1256 == null) {
								anIntArray590[anInt10958++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt79 == 31 ? -1 : (0x1 << local1236.anInt79 + 1) - 1;
								anIntArray590[anInt10958++] = (local1256 & local1284) >>> local1236.anInt84;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static576.anObjectArray36[local96];
							if (local1311 == null) {
								aLongArray21[anInt10954++] = -1L;
							} else {
								aLongArray21[anInt10954++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static576.anObjectArray36[local96];
							if (local465 == null) {
								aStringArray48[anInt10960++] = "";
							} else {
								aStringArray48[anInt10960++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray590[anInt10958++] = method9307(local11[local5]);
						} else if (local34 == 113) {
							anIntArray590[anInt10958++] = method9308(local11[local5]);
						} else if (local34 == 114) {
							aLongArray21[anInt10954++] = method9298(local11[local5]);
						} else if (local34 == 115) {
							aStringArray48[anInt10960++] = method9302(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.aLong324).append(" ");
			for (local706 = anInt10952 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass277Array1[local706].aClass14_Sub2_Sub6_1.aLong324).append(" ");
			}
			local1484.append("op: ").append(local13);
			Static629.method8829(local1484.toString(), local1479);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method9302(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass23_2.method354(Static161.aClass80_6.anInt1861 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "()V")
	public static void method9303() {
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!ce;)V")
	public static void method9304(@OriginalArg(0) Class14_Sub10 arg0) {
		method9296(arg0, 200000);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)V")
	private static void method9305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class299 local220;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(72) int local72;
		@Pc(38) Class299 local38;
		@Pc(303) Class299 local303;
		@Pc(15) int local15;
		@Pc(248) Class299 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt10958 -= 3;
				local15 = anIntArray590[anInt10958];
				local21 = anIntArray590[anInt10958 + 1];
				local27 = anIntArray590[anInt10958 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static391.method5936(local15);
				if (local38.aClass299Array1 == null) {
					local38.aClass299Array1 = new Class299[local27 + 1];
					local38.aClass299Array2 = local38.aClass299Array1;
				}
				if (local38.aClass299Array1.length <= local27) {
					@Pc(70) Class299[] local70;
					if (local38.aClass299Array1 == local38.aClass299Array2) {
						local70 = new Class299[local27 + 1];
						for (local72 = 0; local72 < local38.aClass299Array1.length; local72++) {
							local70[local72] = local38.aClass299Array1[local72];
						}
						local38.aClass299Array1 = local38.aClass299Array2 = local70;
					} else {
						local70 = new Class299[local27 + 1];
						@Pc(104) Class299[] local104 = new Class299[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass299Array1.length; local106++) {
							local70[local106] = local38.aClass299Array1[local106];
							local104[local106] = local38.aClass299Array2[local106];
						}
						local38.aClass299Array1 = local70;
						local38.aClass299Array2 = local104;
					}
				}
				if (local27 > 0 && local38.aClass299Array1[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class299 local166 = new Class299();
				local166.anInt8610 = local21;
				local166.anInt8527 = local166.anInt8526 = local38.anInt8526;
				local166.anInt8590 = local27;
				local38.aClass299Array1[local27] = local166;
				if (local38.aClass299Array2 != local38.aClass299Array1) {
					local38.aClass299Array2[local27] = local166;
				}
				if (arg1) {
					aClass299_14 = local166;
				} else {
					aClass299_13 = local166;
				}
				Static538.method7933(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass299_14 : aClass299_13;
				if (local220.anInt8590 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static391.method5936(local220.anInt8526);
				local248.aClass299Array1[local220.anInt8590] = null;
				Static538.method7933(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static391.method5936(anIntArray590[--anInt10958]);
				local220.aClass299Array1 = null;
				local220.aClass299Array2 = null;
				Static538.method7933(local220);
				return;
			}
			if (arg0 == 200) {
				anInt10958 -= 2;
				local15 = anIntArray590[anInt10958];
				local21 = anIntArray590[anInt10958 + 1];
				local303 = Static384.method5875(local15, local21);
				if (local303 != null && local21 != -1) {
					anIntArray590[anInt10958++] = 1;
					if (arg1) {
						aClass299_14 = local303;
						return;
					}
					aClass299_13 = local303;
					return;
				}
				anIntArray590[anInt10958++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray590[--anInt10958];
				local248 = Static391.method5936(local15);
				if (local248 != null) {
					anIntArray590[anInt10958++] = 1;
					if (arg1) {
						aClass299_14 = local248;
						return;
					}
					aClass299_13 = local248;
					return;
				}
				anIntArray590[anInt10958++] = 0;
				return;
			}
			if (arg0 == 202 || arg0 == 204) {
				if (arg0 == 202) {
					local21 = anIntArray590[--anInt10958];
					local220 = Static391.method5936(local21);
				} else {
					local220 = arg1 ? aClass299_14 : aClass299_13;
				}
				method9293(local220);
				return;
			}
			if (arg0 == 203 || arg0 == 205) {
				if (arg0 == 203) {
					local21 = anIntArray590[--anInt10958];
					local220 = Static391.method5936(local21);
				} else {
					local220 = arg1 ? aClass299_14 : aClass299_13;
				}
				method9295(local220);
				return;
			}
		} else {
			@Pc(506) int local506;
			@Pc(575) boolean local575;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt10958 -= 2;
					local15 = anIntArray590[anInt10958];
					local21 = anIntArray590[anInt10958 + 1];
					if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static46.anIntArray49.length; local27++) {
						if (Static46.anIntArray49[local27] == local15) {
							Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.method9450(local27, local21, Static265.aClass103_2);
							return;
						}
					}
					for (local506 = 0; local506 < Static513.anIntArray428.length; local506++) {
						if (Static513.anIntArray428[local506] == local15) {
							Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.method9450(local506, local21, Static265.aClass103_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt10958 -= 2;
					local15 = anIntArray590[anInt10958];
					local21 = anIntArray590[anInt10958 + 1];
					if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 == null) {
						return;
					}
					Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.method9458(local21, local15);
					return;
				}
				if (arg0 == 410) {
					local575 = anIntArray590[--anInt10958] != 0;
					if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 == null) {
						return;
					}
					Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.method9449(local575);
					return;
				}
				if (arg0 == 411) {
					anInt10958 -= 2;
					local15 = anIntArray590[anInt10958];
					local21 = anIntArray590[anInt10958 + 1];
					if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 == null) {
						return;
					}
					Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.method9459(Static252.aClass56_1, local21, local15);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static391.method5936(anIntArray590[--anInt10958]);
				} else {
					local220 = arg1 ? aClass299_14 : aClass299_13;
				}
				if (arg0 == 1000) {
					anInt10958 -= 4;
					local220.anInt8532 = anIntArray590[anInt10958];
					local220.anInt8529 = anIntArray590[anInt10958 + 1];
					local21 = anIntArray590[anInt10958 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = anIntArray590[anInt10958 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local220.aByte109 = (byte) local21;
					local220.aByte107 = (byte) local27;
					Static538.method7933(local220);
					Static176.method2616(local220);
					if (local220.anInt8590 == -1) {
						Static86.method1435(local220.anInt8526);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt10958 -= 4;
					local220.anInt8583 = anIntArray590[anInt10958];
					local220.anInt8608 = anIntArray590[anInt10958 + 1];
					local220.anInt8545 = 0;
					local220.anInt8612 = 0;
					local21 = anIntArray590[anInt10958 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = anIntArray590[anInt10958 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local220.aByte108 = (byte) local21;
					local220.aByte110 = (byte) local27;
					Static538.method7933(local220);
					Static176.method2616(local220);
					if (local220.anInt8610 == 0) {
						Static683.method9420(local220, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(834) boolean local834 = anIntArray590[--anInt10958] == 1;
					if (local220.aBoolean604 != local834) {
						local220.aBoolean604 = local834;
						Static538.method7933(local220);
					}
					if (local220.anInt8590 == -1) {
						Static322.method5061(local220.anInt8526);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt10958 -= 2;
					local220.anInt8577 = anIntArray590[anInt10958];
					local220.anInt8594 = anIntArray590[anInt10958 + 1];
					Static538.method7933(local220);
					Static176.method2616(local220);
					if (local220.anInt8610 == 0) {
						Static683.method9420(local220, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local220.aBoolean614 = anIntArray590[--anInt10958] == 1;
					return;
				}
			} else {
				@Pc(1791) String local1791;
				@Pc(1394) String local1394;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static391.method5936(anIntArray590[--anInt10958]);
					} else {
						local220 = arg1 ? aClass299_14 : aClass299_13;
					}
					if (arg0 == 1100) {
						anInt10958 -= 2;
						local220.anInt8552 = anIntArray590[anInt10958];
						if (local220.anInt8552 > local220.anInt8560 - local220.anInt8573) {
							local220.anInt8552 = local220.anInt8560 - local220.anInt8573;
						}
						if (local220.anInt8552 < 0) {
							local220.anInt8552 = 0;
						}
						local220.anInt8617 = anIntArray590[anInt10958 + 1];
						if (local220.anInt8617 > local220.anInt8599 - local220.anInt8547) {
							local220.anInt8617 = local220.anInt8599 - local220.anInt8547;
						}
						if (local220.anInt8617 < 0) {
							local220.anInt8617 = 0;
						}
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static472.method7071(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1101) {
						local220.anInt8566 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static200.method8475(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1102) {
						local220.aBoolean605 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1103) {
						local220.anInt8568 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1104) {
						local220.anInt8597 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1105) {
						local21 = anIntArray590[--anInt10958];
						if (local220.anInt8611 != local21) {
							local220.anInt8611 = local21;
							Static538.method7933(local220);
						}
						if (local220.anInt8590 == -1) {
							Static614.method8650(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1106) {
						local220.anInt8541 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1107) {
						local220.aBoolean615 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1108) {
						local220.anInt8543 = 1;
						local220.anInt8546 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt10958 -= 6;
						local220.anInt8554 = anIntArray590[anInt10958];
						local220.anInt8574 = anIntArray590[anInt10958 + 1];
						local220.anInt8593 = anIntArray590[anInt10958 + 2];
						local220.anInt8598 = anIntArray590[anInt10958 + 3];
						local220.anInt8585 = anIntArray590[anInt10958 + 4];
						local220.anInt8587 = anIntArray590[anInt10958 + 5];
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static157.method2252(local220.anInt8526);
							Static418.method6271(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = anIntArray590[--anInt10958];
						if (local21 != local220.anInt8567) {
							if (local21 == -1) {
								local220.aClass181_11 = null;
							} else {
								if (local220.aClass181_11 == null) {
									local220.aClass181_11 = new Class181_Sub1();
								}
								local220.aClass181_11.method8964(local21, 0);
							}
							local220.anInt8567 = local21;
							Static538.method7933(local220);
						}
						if (local220.anInt8590 == -1) {
							Static23.method348(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1111) {
						local220.aBoolean610 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1112) {
						local1394 = aStringArray48[--anInt10960];
						if (!local1394.equals(local220.aString96)) {
							local220.aString96 = local1394;
							Static538.method7933(local220);
						}
						if (local220.anInt8590 == -1) {
							Static462.method6810(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1113) {
						local220.anInt8575 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static401.method6099(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt10958 -= 3;
						local220.anInt8562 = anIntArray590[anInt10958];
						local220.anInt8605 = anIntArray590[anInt10958 + 1];
						local220.anInt8606 = anIntArray590[anInt10958 + 2];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1115) {
						local220.aBoolean609 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1116) {
						local220.anInt8623 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1117) {
						local220.anInt8530 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1118) {
						local220.aBoolean602 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1119) {
						local220.aBoolean616 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1120) {
						anInt10958 -= 2;
						local220.anInt8560 = anIntArray590[anInt10958];
						local220.anInt8599 = anIntArray590[anInt10958 + 1];
						Static538.method7933(local220);
						if (local220.anInt8610 == 0) {
							Static683.method9420(local220, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local220.aBoolean601 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1123) {
						local220.anInt8587 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static157.method2252(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = anIntArray590[--anInt10958];
						local220.aBoolean611 = local21 == 1;
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1125) {
						anInt10958 -= 2;
						local220.anInt8551 = anIntArray590[anInt10958];
						local220.anInt8615 = anIntArray590[anInt10958 + 1];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1126) {
						local220.anInt8571 = anIntArray590[--anInt10958];
						Static538.method7933(local220);
						return;
					}
					@Pc(1756) Class108 local1756;
					if (arg0 == 1127) {
						anInt10958 -= 2;
						local21 = anIntArray590[anInt10958];
						local27 = anIntArray590[anInt10958 + 1];
						local1756 = Static653.aClass104_2.method2173(local21);
						if (local27 != local1756.anInt2348) {
							local220.method7446(local27, local21);
							return;
						}
						local220.method7440(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = anIntArray590[--anInt10958];
						local1791 = aStringArray48[--anInt10960];
						local1756 = Static653.aClass104_2.method2173(local21);
						if (!local1756.aString32.equals(local1791)) {
							local220.method7430(local21, local1791);
							return;
						}
						local220.method7440(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = anIntArray590[--anInt10958];
						if ((local220.anInt8610 == 5 || arg0 != 1129) && (local220.anInt8610 == 4 || arg0 != 1130)) {
							if (local220.anInt8582 != local21) {
								local220.anInt8582 = local21;
								Static538.method7933(local220);
							}
							if (local220.anInt8590 == -1) {
								Static62.method9407(local220.anInt8526);
							}
							return;
						}
						return;
					}
					@Pc(1892) short local1892;
					@Pc(1899) short local1899;
					if (arg0 == 1131) {
						anInt10958 -= 3;
						local21 = anIntArray590[anInt10958];
						local1892 = (short) anIntArray590[anInt10958 + 1];
						local1899 = (short) anIntArray590[anInt10958 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method7441(local1899, local1892, local21);
							Static538.method7933(local220);
							if (local220.anInt8590 == -1) {
								Static615.method8662(local21, local220.anInt8526);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt10958 -= 3;
						local21 = anIntArray590[anInt10958];
						local1892 = (short) anIntArray590[anInt10958 + 1];
						local1899 = (short) anIntArray590[anInt10958 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method7432(local1892, local1899, local21);
							Static538.method7933(local220);
							if (local220.anInt8590 == -1) {
								Static189.method2828(local220.anInt8526, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1133) {
						local220.aBoolean607 = anIntArray590[--anInt10958] == 1;
						Static538.method7933(local220);
						if (local220.anInt8590 == -1) {
							Static551.method7977(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1134) {
						anInt10958 -= 2;
						local21 = anIntArray590[anInt10958];
						local27 = anIntArray590[anInt10958 + 1];
						local1756 = Static653.aClass104_2.method2173(local21);
						if (local27 != local1756.anInt2348) {
							local220.method7446(local27, local21);
							return;
						}
						local220.method7440(local21);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static391.method5936(anIntArray590[--anInt10958]);
					} else {
						local220 = arg1 ? aClass299_14 : aClass299_13;
					}
					Static538.method7933(local220);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt10958 -= 2;
						local21 = anIntArray590[anInt10958];
						local27 = anIntArray590[anInt10958 + 1];
						if (local220.anInt8590 == -1) {
							Static633.method9096(local220.anInt8526);
							Static157.method2252(local220.anInt8526);
							Static418.method6271(local220.anInt8526);
						}
						if (local21 == -1) {
							local220.anInt8543 = 1;
							local220.anInt8546 = -1;
							local220.anInt8621 = -1;
							return;
						}
						local220.anInt8621 = local21;
						local220.anInt8565 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local220.aBoolean608 = true;
						} else {
							local220.aBoolean608 = false;
						}
						@Pc(2202) Class284 local2202 = Static252.aClass56_1.method1052(local21);
						local220.anInt8593 = local2202.anInt7781;
						local220.anInt8598 = local2202.anInt7734;
						local220.anInt8585 = local2202.anInt7732;
						local220.anInt8554 = local2202.anInt7764;
						local220.anInt8574 = local2202.anInt7745;
						local220.anInt8587 = local2202.anInt7724;
						if (arg0 == 1205 || arg0 == 1209) {
							local220.anInt8536 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local220.anInt8536 = 1;
						} else {
							local220.anInt8536 = 2;
						}
						if (local220.anInt8545 > 0) {
							local220.anInt8587 = local220.anInt8587 * 32 / local220.anInt8545;
							return;
						}
						if (local220.anInt8583 > 0) {
							local220.anInt8587 = local220.anInt8587 * 32 / local220.anInt8583;
						}
						return;
					}
					if (arg0 == 1201) {
						local220.anInt8543 = 2;
						local220.anInt8546 = anIntArray590[--anInt10958];
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1202) {
						local220.anInt8543 = 3;
						local220.anInt8546 = -1;
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1203) {
						local220.anInt8543 = 6;
						local220.anInt8546 = anIntArray590[--anInt10958];
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1204) {
						local220.anInt8543 = 5;
						local220.anInt8546 = anIntArray590[--anInt10958];
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt10958 -= 4;
						local220.anInt8622 = anIntArray590[anInt10958];
						local220.anInt8579 = anIntArray590[anInt10958 + 1];
						local220.anInt8537 = anIntArray590[anInt10958 + 2];
						local220.anInt8540 = anIntArray590[anInt10958 + 3];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1207) {
						anInt10958 -= 2;
						local220.anInt8614 = anIntArray590[anInt10958];
						local220.anInt8581 = anIntArray590[anInt10958 + 1];
						Static538.method7933(local220);
						return;
					}
					if (arg0 == 1210) {
						anInt10958 -= 4;
						local220.anInt8546 = anIntArray590[anInt10958];
						local220.anInt8559 = anIntArray590[anInt10958 + 1];
						if (anIntArray590[anInt10958 + 2] == 1) {
							local220.anInt8543 = 9;
						} else {
							local220.anInt8543 = 8;
						}
						if (anIntArray590[anInt10958 + 3] == 1) {
							local220.aBoolean608 = true;
						} else {
							local220.aBoolean608 = false;
						}
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
					if (arg0 == 1211) {
						local220.anInt8543 = 5;
						local220.anInt8546 = Static597.anInt9858;
						local220.anInt8559 = 0;
						if (local220.anInt8590 == -1) {
							Static355.method5402(local220.anInt8526);
						}
						return;
					}
				} else {
					@Pc(2944) int local2944;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local220 = Static391.method5936(anIntArray590[--anInt10958]);
							} else {
								local220 = arg1 ? aClass299_14 : aClass299_13;
							}
							if (arg0 == 1499) {
								local220.method7433();
								return;
							}
							local1394 = aStringArray48[--anInt10960];
							@Pc(3043) int[] local3043 = null;
							if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
								local506 = anIntArray590[--anInt10958];
								if (local506 > 0) {
									local3043 = new int[local506];
									while (local506-- > 0) {
										local3043[local506] = anIntArray590[--anInt10958];
									}
								}
								local1394 = local1394.substring(0, local1394.length() - 1);
							}
							@Pc(3097) Object[] local3097 = new Object[local1394.length() + 1];
							for (local2944 = local3097.length - 1; local2944 >= 1; local2944--) {
								if (local1394.charAt(local2944 - 1) == 's') {
									local3097[local2944] = aStringArray48[--anInt10960];
								} else if (local1394.charAt(local2944 - 1) == '§') {
									local3097[local2944] = Long.valueOf(aLongArray21[--anInt10954]);
								} else {
									local3097[local2944] = Integer.valueOf(anIntArray590[--anInt10958]);
								}
							}
							local72 = anIntArray590[--anInt10958];
							if (local72 == -1) {
								local3097 = null;
							} else {
								local3097[0] = Integer.valueOf(local72);
							}
							if (arg0 == 1400) {
								local220.anObjectArray34 = local3097;
							} else if (arg0 == 1401) {
								local220.anObjectArray8 = local3097;
							} else if (arg0 == 1402) {
								local220.anObjectArray28 = local3097;
							} else if (arg0 == 1403) {
								local220.anObjectArray33 = local3097;
							} else if (arg0 == 1404) {
								local220.anObjectArray21 = local3097;
							} else if (arg0 == 1405) {
								local220.anObjectArray18 = local3097;
							} else if (arg0 == 1406) {
								local220.anObjectArray20 = local3097;
							} else if (arg0 == 1407) {
								local220.anObjectArray30 = local3097;
								local220.anIntArray445 = local3043;
							} else if (arg0 == 1408) {
								local220.anObjectArray31 = local3097;
							} else if (arg0 == 1409) {
								local220.anObjectArray15 = local3097;
							} else if (arg0 == 1410) {
								local220.anObjectArray4 = local3097;
							} else if (arg0 == 1411) {
								local220.anObjectArray23 = local3097;
							} else if (arg0 == 1412) {
								local220.anObjectArray9 = local3097;
							} else if (arg0 == 1414) {
								local220.anObjectArray32 = local3097;
								local220.anIntArray442 = local3043;
							} else if (arg0 == 1415) {
								local220.anObjectArray6 = local3097;
								local220.anIntArray444 = local3043;
							} else if (arg0 == 1416) {
								local220.anObjectArray22 = local3097;
							} else if (arg0 == 1417) {
								local220.anObjectArray26 = local3097;
							} else if (arg0 == 1418) {
								local220.anObjectArray5 = local3097;
							} else if (arg0 == 1419) {
								local220.anObjectArray11 = local3097;
							} else if (arg0 == 1420) {
								local220.anObjectArray16 = local3097;
							} else if (arg0 == 1421) {
								local220.anObjectArray2 = local3097;
							} else if (arg0 == 1422) {
								local220.anObjectArray19 = local3097;
							} else if (arg0 == 1423) {
								local220.anObjectArray24 = local3097;
							} else if (arg0 == 1424) {
								local220.anObjectArray17 = local3097;
							} else if (arg0 == 1425) {
								local220.lb = local3097;
							} else if (arg0 == 1426) {
								local220.anObjectArray3 = local3097;
							} else if (arg0 == 1427) {
								local220.anObjectArray25 = local3097;
							} else if (arg0 == 1428) {
								local220.anObjectArray27 = local3097;
								local220.anIntArray446 = local3043;
							} else if (arg0 == 1429) {
								local220.anObjectArray10 = local3097;
								local220.anIntArray439 = local3043;
							} else if (arg0 == 1430) {
								local220.anObjectArray29 = local3097;
							} else if (arg0 == 1431) {
								local220.anObjectArray14 = local3097;
							} else if (arg0 == 1432) {
								local220.anObjectArray13 = local3097;
							} else if (arg0 == 1433) {
								local220.anObjectArray7 = local3097;
							}
							local220.aBoolean617 = true;
							return;
						}
						if (arg0 < 1600) {
							local220 = arg1 ? aClass299_14 : aClass299_13;
							if (arg0 == 1500) {
								anIntArray590[anInt10958++] = local220.anInt8534;
								return;
							}
							if (arg0 == 1501) {
								anIntArray590[anInt10958++] = local220.anInt8603;
								return;
							}
							if (arg0 == 1502) {
								anIntArray590[anInt10958++] = local220.anInt8573;
								return;
							}
							if (arg0 == 1503) {
								anIntArray590[anInt10958++] = local220.anInt8547;
								return;
							}
							if (arg0 == 1504) {
								anIntArray590[anInt10958++] = local220.aBoolean604 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray590[anInt10958++] = local220.anInt8527;
								return;
							}
							if (arg0 == 1506) {
								local248 = Static197.method2950(local220);
								anIntArray590[anInt10958++] = local248 == null ? -1 : local248.anInt8526;
								return;
							}
							if (arg0 == 1507) {
								anIntArray590[anInt10958++] = local220.anInt8566;
								return;
							}
						} else {
							@Pc(3814) Class108 local3814;
							if (arg0 < 1700) {
								local220 = arg1 ? aClass299_14 : aClass299_13;
								if (arg0 == 1600) {
									anIntArray590[anInt10958++] = local220.anInt8552;
									return;
								}
								if (arg0 == 1601) {
									anIntArray590[anInt10958++] = local220.anInt8617;
									return;
								}
								if (arg0 == 1602) {
									aStringArray48[anInt10960++] = local220.aString96;
									return;
								}
								if (arg0 == 1603) {
									anIntArray590[anInt10958++] = local220.anInt8560;
									return;
								}
								if (arg0 == 1604) {
									anIntArray590[anInt10958++] = local220.anInt8599;
									return;
								}
								if (arg0 == 1605) {
									anIntArray590[anInt10958++] = local220.anInt8587;
									return;
								}
								if (arg0 == 1606) {
									anIntArray590[anInt10958++] = local220.anInt8593;
									return;
								}
								if (arg0 == 1607) {
									anIntArray590[anInt10958++] = local220.anInt8585;
									return;
								}
								if (arg0 == 1608) {
									anIntArray590[anInt10958++] = local220.anInt8598;
									return;
								}
								if (arg0 == 1609) {
									anIntArray590[anInt10958++] = local220.anInt8568;
									return;
								}
								if (arg0 == 1610) {
									anIntArray590[anInt10958++] = local220.anInt8554;
									return;
								}
								if (arg0 == 1611) {
									anIntArray590[anInt10958++] = local220.anInt8574;
									return;
								}
								if (arg0 == 1612) {
									anIntArray590[anInt10958++] = local220.anInt8611;
									return;
								}
								if (arg0 == 1613) {
									local21 = anIntArray590[--anInt10958];
									local3814 = Static653.aClass104_2.method2173(local21);
									if (local3814.method2205()) {
										aStringArray48[anInt10960++] = local220.method7442(local3814.aString32, local21);
										return;
									}
									anIntArray590[anInt10958++] = local220.method7434(local3814.anInt2348, local21);
									return;
								}
								if (arg0 == 1614) {
									anIntArray590[anInt10958++] = local220.anInt8541;
									return;
								}
								if (arg0 == 2614) {
									anIntArray590[anInt10958++] = local220.anInt8543 == 1 ? local220.anInt8546 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local220 = arg1 ? aClass299_14 : aClass299_13;
								if (arg0 == 1700) {
									anIntArray590[anInt10958++] = local220.anInt8621;
									return;
								}
								if (arg0 == 1701) {
									if (local220.anInt8621 != -1) {
										anIntArray590[anInt10958++] = local220.anInt8565;
										return;
									}
									anIntArray590[anInt10958++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray590[anInt10958++] = local220.anInt8590;
									return;
								}
							} else if (arg0 < 1900) {
								local220 = arg1 ? aClass299_14 : aClass299_13;
								if (arg0 == 1800) {
									anIntArray590[anInt10958++] = Static80.method1360(local220).method482();
									return;
								}
								if (arg0 == 1801) {
									local21 = anIntArray590[--anInt10958];
									local21--;
									if (local220.aStringArray36 != null && local21 < local220.aStringArray36.length && local220.aStringArray36[local21] != null) {
										aStringArray48[anInt10960++] = local220.aStringArray36[local21];
										return;
									}
									aStringArray48[anInt10960++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local220.aString95 == null) {
										aStringArray48[anInt10960++] = "";
										return;
									}
									aStringArray48[anInt10960++] = local220.aString95;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local220 = Static391.method5936(anIntArray590[--anInt10958]);
									arg0 -= 1000;
								} else {
									local220 = arg1 ? aClass299_14 : aClass299_13;
								}
								if (anInt10965 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local220.anObjectArray25 == null) {
										return;
									}
									@Pc(4121) Class14_Sub10 local4121 = new Class14_Sub10();
									local4121.aClass299_2 = local220;
									local4121.anObjectArray1 = local220.anObjectArray25;
									local4121.anInt1050 = anInt10965 + 1;
									Static97.aClass32_6.method582(local4121);
									return;
								}
							} else if (arg0 < 2600) {
								local220 = Static391.method5936(anIntArray590[--anInt10958]);
								if (arg0 == 2500) {
									anIntArray590[anInt10958++] = local220.anInt8534;
									return;
								}
								if (arg0 == 2501) {
									anIntArray590[anInt10958++] = local220.anInt8603;
									return;
								}
								if (arg0 == 2502) {
									anIntArray590[anInt10958++] = local220.anInt8573;
									return;
								}
								if (arg0 == 2503) {
									anIntArray590[anInt10958++] = local220.anInt8547;
									return;
								}
								if (arg0 == 2504) {
									anIntArray590[anInt10958++] = local220.aBoolean604 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray590[anInt10958++] = local220.anInt8527;
									return;
								}
								if (arg0 == 2506) {
									local248 = Static197.method2950(local220);
									anIntArray590[anInt10958++] = local248 == null ? -1 : local248.anInt8526;
									return;
								}
								if (arg0 == 2507) {
									anIntArray590[anInt10958++] = local220.anInt8566;
									return;
								}
							} else if (arg0 < 2700) {
								local220 = Static391.method5936(anIntArray590[--anInt10958]);
								if (arg0 == 2600) {
									anIntArray590[anInt10958++] = local220.anInt8552;
									return;
								}
								if (arg0 == 2601) {
									anIntArray590[anInt10958++] = local220.anInt8617;
									return;
								}
								if (arg0 == 2602) {
									aStringArray48[anInt10960++] = local220.aString96;
									return;
								}
								if (arg0 == 2603) {
									anIntArray590[anInt10958++] = local220.anInt8560;
									return;
								}
								if (arg0 == 2604) {
									anIntArray590[anInt10958++] = local220.anInt8599;
									return;
								}
								if (arg0 == 2605) {
									anIntArray590[anInt10958++] = local220.anInt8587;
									return;
								}
								if (arg0 == 2606) {
									anIntArray590[anInt10958++] = local220.anInt8593;
									return;
								}
								if (arg0 == 2607) {
									anIntArray590[anInt10958++] = local220.anInt8585;
									return;
								}
								if (arg0 == 2608) {
									anIntArray590[anInt10958++] = local220.anInt8598;
									return;
								}
								if (arg0 == 2609) {
									anIntArray590[anInt10958++] = local220.anInt8568;
									return;
								}
								if (arg0 == 2610) {
									anIntArray590[anInt10958++] = local220.anInt8554;
									return;
								}
								if (arg0 == 2611) {
									anIntArray590[anInt10958++] = local220.anInt8574;
									return;
								}
								if (arg0 == 2612) {
									anIntArray590[anInt10958++] = local220.anInt8611;
									return;
								}
								if (arg0 == 2613) {
									anIntArray590[anInt10958++] = local220.anInt8541;
									return;
								}
								if (arg0 == 2614) {
									anIntArray590[anInt10958++] = local220.anInt8543 == 1 ? local220.anInt8546 : -1;
									return;
								}
							} else {
								@Pc(4698) Class14_Sub13 local4698;
								@Pc(4591) Class14_Sub13 local4591;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local220 = Static391.method5936(anIntArray590[--anInt10958]);
										anIntArray590[anInt10958++] = local220.anInt8621;
										return;
									}
									if (arg0 == 2701) {
										local220 = Static391.method5936(anIntArray590[--anInt10958]);
										if (local220.anInt8621 != -1) {
											anIntArray590[anInt10958++] = local220.anInt8565;
											return;
										}
										anIntArray590[anInt10958++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local15 = anIntArray590[--anInt10958];
										local4591 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local15);
										if (local4591 != null) {
											anIntArray590[anInt10958++] = 1;
											return;
										}
										anIntArray590[anInt10958++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local220 = Static391.method5936(anIntArray590[--anInt10958]);
										if (local220.aClass299Array1 == null) {
											anIntArray590[anInt10958++] = 0;
											return;
										}
										local21 = local220.aClass299Array1.length;
										for (local27 = 0; local27 < local220.aClass299Array1.length; local27++) {
											if (local220.aClass299Array1[local27] == null) {
												local21 = local27;
												break;
											}
										}
										anIntArray590[anInt10958++] = local21;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt10958 -= 2;
										local15 = anIntArray590[anInt10958];
										local21 = anIntArray590[anInt10958 + 1];
										local4698 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local15);
										if (local4698 != null && local4698.anInt1465 == local21) {
											anIntArray590[anInt10958++] = 1;
											return;
										}
										anIntArray590[anInt10958++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local220 = Static391.method5936(anIntArray590[--anInt10958]);
									if (arg0 == 2800) {
										anIntArray590[anInt10958++] = Static80.method1360(local220).method482();
										return;
									}
									if (arg0 == 2801) {
										local21 = anIntArray590[--anInt10958];
										local21--;
										if (local220.aStringArray36 != null && local21 < local220.aStringArray36.length && local220.aStringArray36[local21] != null) {
											aStringArray48[anInt10960++] = local220.aStringArray36[local21];
											return;
										}
										aStringArray48[anInt10960++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local220.aString95 == null) {
											aStringArray48[anInt10960++] = "";
											return;
										}
										aStringArray48[anInt10960++] = local220.aString95;
										return;
									}
								} else {
									@Pc(4943) Class14_Sub54 local4943;
									@Pc(4849) String local4849;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4849 = aStringArray48[--anInt10960];
											Static607.method8542(local4849);
											return;
										}
										if (arg0 == 3101) {
											anInt10958 -= 2;
											Static254.method4275(anIntArray590[anInt10958 + 1], Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1, anIntArray590[anInt10958]);
											return;
										}
										if (arg0 == 3103) {
											Static631.method8877();
											return;
										}
										if (arg0 == 3104) {
											local4849 = aStringArray48[--anInt10960];
											local21 = 0;
											if (Static334.method5155(local4849)) {
												local21 = Static297.method4858(local4849, -123);
											}
											@Pc(4912) Class14_Sub54 local4912 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static435.aClass251_179);
											local4912.aClass14_Sub21_Sub2_2.method7730(local21);
											Static277.aClass347_2.method8308(local4912);
											return;
										}
										if (arg0 == 3105) {
											local4849 = aStringArray48[--anInt10960];
											local4943 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static498.aClass251_204);
											local4943.aClass14_Sub21_Sub2_2.method7747(local4849.length() + 1);
											local4943.aClass14_Sub21_Sub2_2.method7690(local4849);
											Static277.aClass347_2.method8308(local4943);
											return;
										}
										if (arg0 == 3106) {
											local4849 = aStringArray48[--anInt10960];
											local4943 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static99.aClass251_57);
											local4943.aClass14_Sub21_Sub2_2.method7747(local4849.length() + 1);
											local4943.aClass14_Sub21_Sub2_2.method7690(local4849);
											Static277.aClass347_2.method8308(local4943);
											return;
										}
										if (arg0 == 3107) {
											local15 = anIntArray590[--anInt10958];
											local1394 = aStringArray48[--anInt10960];
											Static92.method9433(local1394, local15);
											return;
										}
										if (arg0 == 3108) {
											anInt10958 -= 3;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local27 = anIntArray590[anInt10958 + 2];
											local38 = Static391.method5936(local27);
											Static1.method6045(local38, local15, local21);
											return;
										}
										if (arg0 == 3109) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local303 = arg1 ? aClass299_14 : aClass299_13;
											Static1.method6045(local303, local15, local21);
											return;
										}
										if (arg0 == 3110) {
											local15 = anIntArray590[--anInt10958];
											local4943 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static447.aClass251_186);
											local4943.aClass14_Sub21_Sub2_2.method7751(local15);
											Static277.aClass347_2.method8308(local4943);
											return;
										}
										if (arg0 == 3111) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local4698 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local15);
											if (local4698 != null) {
												Static69.method1092(local4698, true, local4698.anInt1465 != local21);
											}
											Static385.method5886(local21, 3, true, local15);
											return;
										}
										if (arg0 == 3112) {
											anInt10958--;
											local15 = anIntArray590[anInt10958];
											local4591 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local15);
											if (local4591 != null && local4591.anInt1466 == 3) {
												Static69.method1092(local4591, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static357.method5425(aStringArray48[--anInt10960]);
											return;
										}
										if (arg0 == 3114) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local1791 = aStringArray48[--anInt10960];
											Static187.method2752(local1791, local21, "", "", local15, "");
											return;
										}
										if (arg0 == 3115) {
											anInt10958 -= 11;
											@Pc(5258) Class258[] local5258 = Static428.method6432();
											@Pc(5261) Class205[] local5261 = Static43.method711();
											Static112.method1788(anIntArray590[anInt10958 + 4], anIntArray590[anInt10958 + 5], anIntArray590[anInt10958 + 9], anIntArray590[anInt10958 + 8], local5261[anIntArray590[anInt10958 + 1]], anIntArray590[anInt10958 + 3], anIntArray590[anInt10958 + 7], anIntArray590[anInt10958 + 2], anIntArray590[anInt10958 + 10], local5258[anIntArray590[anInt10958]], anIntArray590[anInt10958 + 6]);
											return;
										}
										if (arg0 == 3116) {
											local15 = anIntArray590[--anInt10958];
											local4943 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static622.aClass251_247);
											local4943.aClass14_Sub21_Sub2_2.method7751(local15);
											Static277.aClass347_2.method8308(local4943);
											return;
										}
										if (arg0 == 3117) {
											local4849 = aStringArray48[--anInt10960];
											local4943 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static181.aClass251_90);
											local4943.aClass14_Sub21_Sub2_2.method7747(local4849.length() + 1);
											local4943.aClass14_Sub21_Sub2_2.method7690(local4849);
											Static277.aClass347_2.method8308(local4943);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt10958 -= 3;
											Static400.method968(255, anIntArray590[anInt10958], anIntArray590[anInt10958 + 2], 256, anIntArray590[anInt10958 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static358.method5441(anIntArray590[--anInt10958], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt10958 -= 2;
											Static360.method5460(anIntArray590[anInt10958 + 1], 255, anIntArray590[anInt10958]);
											return;
										}
										if (arg0 == 3203) {
											anInt10958 -= 4;
											Static400.method968(anIntArray590[anInt10958 + 3], anIntArray590[anInt10958], anIntArray590[anInt10958 + 2], 256, anIntArray590[anInt10958 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt10958 -= 3;
											Static358.method5441(anIntArray590[anInt10958], anIntArray590[anInt10958 + 2], anIntArray590[anInt10958 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt10958 -= 3;
											Static360.method5460(anIntArray590[anInt10958 + 1], anIntArray590[anInt10958 + 2], anIntArray590[anInt10958]);
											return;
										}
										if (arg0 == 3206) {
											anInt10958 -= 4;
											Static676.method9511(anIntArray590[anInt10958 + 1], anIntArray590[anInt10958 + 3], false, anIntArray590[anInt10958], 256, anIntArray590[anInt10958 + 2]);
											return;
										}
										if (arg0 == 3207) {
											anInt10958 -= 4;
											Static676.method9511(anIntArray590[anInt10958 + 1], anIntArray590[anInt10958 + 3], true, anIntArray590[anInt10958], 256, anIntArray590[anInt10958 + 2]);
											return;
										}
										if (arg0 == 3208) {
											anInt10958 -= 5;
											Static400.method968(anIntArray590[anInt10958 + 3], anIntArray590[anInt10958], anIntArray590[anInt10958 + 2], anIntArray590[anInt10958 + 4], anIntArray590[anInt10958 + 1]);
											return;
										}
										if (arg0 == 3209) {
											anInt10958 -= 5;
											Static676.method9511(anIntArray590[anInt10958 + 1], anIntArray590[anInt10958 + 3], false, anIntArray590[anInt10958], anIntArray590[anInt10958 + 4], anIntArray590[anInt10958 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray590[anInt10958++] = Static530.anInt9105;
											return;
										}
										if (arg0 == 3301) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static676.method9509(false, local15, local21);
											return;
										}
										if (arg0 == 3302) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static384.method5879(local21, false, local15);
											return;
										}
										if (arg0 == 3303) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static343.method5238(local15, local21, false);
											return;
										}
										if (arg0 == 3304) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static688.aClass232_1.method5791(local15).anInt9313;
											return;
										}
										if (arg0 == 3305) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static462.anIntArray408[local15];
											return;
										}
										if (arg0 == 3306) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static185.anIntArray184[local15];
											return;
										}
										if (arg0 == 3307) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static105.anIntArray504[local15];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5867) byte local5867 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146;
											local21 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9) + Static36.anInt617;
											local27 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9) + Static550.anInt9242;
											anIntArray590[anInt10958++] = (local5867 << 28) + (local21 << 14) + local27;
											return;
										}
										if (arg0 == 3309) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = local15 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = local15 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = local15 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray590[anInt10958++] = Static212.aBoolean270 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static676.method9509(true, local15, local21);
											return;
										}
										if (arg0 == 3314) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static384.method5879(local21, true, local15);
											return;
										}
										if (arg0 == 3315) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static343.method5238(local15, local21, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static469.anInt11068 >= 2) {
												anIntArray590[anInt10958++] = Static469.anInt11068;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray590[anInt10958++] = Static132.anInt2081;
											return;
										}
										if (arg0 == 3318) {
											anIntArray590[anInt10958++] = Static564.aClass357_4.anInt9936;
											return;
										}
										if (arg0 == 3321) {
											anIntArray590[anInt10958++] = Static575.anInt9548;
											return;
										}
										if (arg0 == 3322) {
											anIntArray590[anInt10958++] = Static258.anInt4845;
											return;
										}
										if (arg0 == 3323) {
											if (Static496.anInt8375 >= 5 && Static496.anInt8375 <= 9) {
												anIntArray590[anInt10958++] = 1;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static496.anInt8375 >= 5 && Static496.anInt8375 <= 9) {
												anIntArray590[anInt10958++] = Static496.anInt8375;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray590[anInt10958++] = Static459.aBoolean734 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray590[anInt10958++] = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338;
											return;
										}
										if (arg0 == 3327) {
											anIntArray590[anInt10958++] = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 != null && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.aBoolean776 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray590[anInt10958++] = Static292.aBoolean395 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static327.method5106(local15);
											return;
										}
										if (arg0 == 3331) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static541.method7944(local15, local21, false);
											return;
										}
										if (arg0 == 3332) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											anIntArray590[anInt10958++] = Static541.method7944(local15, local21, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray590[anInt10958++] = Static388.method5917();
											return;
										}
										if (arg0 == 3335) {
											anIntArray590[anInt10958++] = Static26.anInt352;
											return;
										}
										if (arg0 == 3336) {
											anInt10958 -= 4;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local27 = anIntArray590[anInt10958 + 2];
											local506 = anIntArray590[anInt10958 + 3];
											local15 += local21 << 14;
											local15 += local27 << 28;
											local15 += local506;
											anIntArray590[anInt10958++] = local15;
											return;
										}
										if (arg0 == 3337) {
											anIntArray590[anInt10958++] = Static449.anInt7513;
											return;
										}
										if (arg0 == 3338) {
											anIntArray590[anInt10958++] = Static346.method5277();
											return;
										}
										if (arg0 == 3339) {
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray590[anInt10958++] = Static271.aBoolean373 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray590[anInt10958++] = Static125.aBoolean141 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray590[anInt10958++] = Static656.aClass118_1.method7586();
											return;
										}
										if (arg0 == 3343) {
											anIntArray590[anInt10958++] = Static656.aClass118_1.method7590();
											return;
										}
										if (arg0 == 3344) {
											aStringArray48[anInt10960++] = Static438.method6537();
											return;
										}
										if (arg0 == 3345) {
											aStringArray48[anInt10960++] = Static188.method2821();
											return;
										}
										if (arg0 == 3346) {
											anIntArray590[anInt10958++] = Static608.method8582();
											return;
										}
										if (arg0 == 3347) {
											anIntArray590[anInt10958++] = Static582.anInt9621;
											return;
										}
										if (arg0 == 3349) {
											anIntArray590[anInt10958++] = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass200_7.method4987() >> 3;
											return;
										}
										if (arg0 == 3350) {
											local4849 = aStringArray48[--anInt10960];
											if (Static532.aString103 != null && Static532.aString103.equalsIgnoreCase(local4849)) {
												anIntArray590[anInt10958++] = 1;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(6709) Class33 local6709;
										if (arg0 == 3400) {
											anInt10958 -= 2;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local6709 = Static153.aClass322_1.method7940(local15);
											aStringArray48[anInt10960++] = local6709.method656(local21);
											return;
										}
										if (arg0 == 3408) {
											anInt10958 -= 4;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local27 = anIntArray590[anInt10958 + 2];
											local506 = anIntArray590[anInt10958 + 3];
											@Pc(6755) Class33 local6755 = Static153.aClass322_1.method7940(local27);
											if (local6755.aChar3 == local15 && local6755.aChar4 == local21) {
												if (local21 == 115) {
													aStringArray48[anInt10960++] = local6755.method656(local506);
													return;
												}
												anIntArray590[anInt10958++] = local6755.method662(local506);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
										}
										if (arg0 == 3409) {
											anInt10958 -= 3;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local27 = anIntArray590[anInt10958 + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6850) Class33 local6850 = Static153.aClass322_1.method7940(local21);
											if (local6850.aChar4 != local15) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray590[anInt10958++] = local6850.method657(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = anIntArray590[--anInt10958];
											local1394 = aStringArray48[--anInt10960];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6709 = Static153.aClass322_1.method7940(local15);
											if (local6709.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray590[anInt10958++] = local6709.method654(local1394) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = anIntArray590[--anInt10958];
											@Pc(6959) Class33 local6959 = Static153.aClass322_1.method7940(local15);
											anIntArray590[anInt10958++] = local6959.method660();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static187.anInt3100 == 0) {
												anIntArray590[anInt10958++] = -2;
												return;
											}
											if (Static187.anInt3100 == 1) {
												anIntArray590[anInt10958++] = -1;
												return;
											}
											anIntArray590[anInt10958++] = Static261.anInt4885;
											return;
										}
										if (arg0 == 3601) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 == 2 && local15 < Static261.anInt4885) {
												aStringArray48[anInt10960++] = Static265.aStringArray23[local15];
												if (Static557.aStringArray37[local15] != null) {
													aStringArray48[anInt10960++] = Static557.aStringArray37[local15];
													return;
												}
												aStringArray48[anInt10960++] = "";
												return;
											}
											aStringArray48[anInt10960++] = "";
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 == 2 && local15 < Static261.anInt4885) {
												anIntArray590[anInt10958++] = Static591.anIntArray508[local15];
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 == 2 && local15 < Static261.anInt4885) {
												anIntArray590[anInt10958++] = Static286.anIntArray292[local15];
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4849 = aStringArray48[--anInt10960];
											local21 = anIntArray590[--anInt10958];
											Static204.method3035(local4849, local21);
											return;
										}
										if (arg0 == 3605) {
											local4849 = aStringArray48[--anInt10960];
											Static669.method9282(local4849);
											return;
										}
										if (arg0 == 3606) {
											local4849 = aStringArray48[--anInt10960];
											Static38.method665(local4849);
											return;
										}
										if (arg0 == 3607) {
											local4849 = aStringArray48[--anInt10960];
											Static322.method5059(false, local4849);
											return;
										}
										if (arg0 == 3608) {
											local4849 = aStringArray48[--anInt10960];
											Static151.method2202(local4849);
											return;
										}
										if (arg0 == 3609) {
											local4849 = aStringArray48[--anInt10960];
											if (local4849.startsWith("<img=0>") || local4849.startsWith("<img=1>")) {
												local4849 = local4849.substring(7);
											}
											anIntArray590[anInt10958++] = Static597.method8452(local4849) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 == 2 && local15 < Static261.anInt4885) {
												aStringArray48[anInt10960++] = Static654.aStringArray46[local15];
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static360.aString77 != null) {
												aStringArray48[anInt10960++] = Static302.method4912(Static360.aString77);
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static360.aString77 != null) {
												anIntArray590[anInt10958++] = Static67.anInt1036;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = anIntArray590[--anInt10958];
											if (Static360.aString77 != null && local15 < Static67.anInt1036) {
												aStringArray48[anInt10960++] = Static293.aClass165Array1[local15].aString54;
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = anIntArray590[--anInt10958];
											if (Static360.aString77 != null && local15 < Static67.anInt1036) {
												anIntArray590[anInt10958++] = Static293.aClass165Array1[local15].anInt4578;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = anIntArray590[--anInt10958];
											if (Static360.aString77 != null && local15 < Static67.anInt1036) {
												anIntArray590[anInt10958++] = Static293.aClass165Array1[local15].aByte86;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray590[anInt10958++] = Static58.aByte16;
											return;
										}
										if (arg0 == 3617) {
											local4849 = aStringArray48[--anInt10960];
											Static456.method6730(local4849);
											return;
										}
										if (arg0 == 3618) {
											anIntArray590[anInt10958++] = Static36.aByte14;
											return;
										}
										if (arg0 == 3619) {
											local4849 = aStringArray48[--anInt10960];
											Static146.method2174(local4849);
											return;
										}
										if (arg0 == 3620) {
											Static82.method1407();
											return;
										}
										if (arg0 == 3621) {
											if (Static187.anInt3100 == 0) {
												anIntArray590[anInt10958++] = -1;
												return;
											}
											anIntArray590[anInt10958++] = Static458.anInt7639;
											return;
										}
										if (arg0 == 3622) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 != 0 && local15 < Static458.anInt7639) {
												aStringArray48[anInt10960++] = Static292.aStringArray24[local15];
												if (Static466.aStringArray34[local15] != null) {
													aStringArray48[anInt10960++] = Static466.aStringArray34[local15];
													return;
												}
												aStringArray48[anInt10960++] = "";
												return;
											}
											aStringArray48[anInt10960++] = "";
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4849 = aStringArray48[--anInt10960];
											if (local4849.startsWith("<img=0>") || local4849.startsWith("<img=1>")) {
												local4849 = local4849.substring(7);
											}
											anIntArray590[anInt10958++] = Static130.method2006(local4849) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = anIntArray590[--anInt10958];
											if (Static293.aClass165Array1 != null && local15 < Static67.anInt1036 && Static293.aClass165Array1[local15].aString53.equalsIgnoreCase(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37)) {
												anIntArray590[anInt10958++] = 1;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static51.aString18 != null) {
												aStringArray48[anInt10960++] = Static51.aString18;
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = anIntArray590[--anInt10958];
											if (Static360.aString77 != null && local15 < Static67.anInt1036) {
												aStringArray48[anInt10960++] = Static293.aClass165Array1[local15].aString52;
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 == 2 && local15 >= 0 && local15 < Static261.anInt4885) {
												anIntArray590[anInt10958++] = Static218.aBooleanArray11[local15] ? 1 : 0;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4849 = aStringArray48[--anInt10960];
											if (local4849.startsWith("<img=0>") || local4849.startsWith("<img=1>")) {
												local4849 = local4849.substring(7);
											}
											anIntArray590[anInt10958++] = Static558.method8062(local4849);
											return;
										}
										if (arg0 == 3629) {
											anIntArray590[anInt10958++] = Static538.anInt9200;
											return;
										}
										if (arg0 == 3630) {
											local4849 = aStringArray48[--anInt10960];
											Static322.method5059(true, local4849);
											return;
										}
										if (arg0 == 3631) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static566.aBooleanArray23[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = anIntArray590[--anInt10958];
											if (Static360.aString77 != null && local15 < Static67.anInt1036) {
												aStringArray48[anInt10960++] = Static293.aClass165Array1[local15].aString53;
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 != 0 && local15 < Static458.anInt7639) {
												aStringArray48[anInt10960++] = Static331.aStringArray26[local15];
												return;
											}
											aStringArray48[anInt10960++] = "";
											return;
										}
										if (arg0 == 3634) {
											local15 = anIntArray590[--anInt10958];
											if (Static187.anInt3100 == 2 && local15 < Static261.anInt4885) {
												anIntArray590[anInt10958++] = Static153.aBooleanArray3[local15] ? 1 : 0;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static466.aClass23_1 != null) {
												anIntArray590[anInt10958++] = 1;
												aClass23_2 = Static466.aClass23_1;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static686.aClass23_3 != null) {
												anIntArray590[anInt10958++] = 1;
												aClass23_2 = Static686.aClass23_3;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray48[anInt10960++] = aClass23_2.aString7;
											return;
										}
										if (arg0 == 3703) {
											anIntArray590[anInt10958++] = aClass23_2.aBoolean24 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray590[anInt10958++] = aClass23_2.aByte4;
											return;
										}
										if (arg0 == 3705) {
											anIntArray590[anInt10958++] = aClass23_2.aByte1;
											return;
										}
										if (arg0 == 3706) {
											anIntArray590[anInt10958++] = aClass23_2.aByte2;
											return;
										}
										if (arg0 == 3707) {
											anIntArray590[anInt10958++] = aClass23_2.aByte3;
											return;
										}
										if (arg0 == 3709) {
											anIntArray590[anInt10958++] = aClass23_2.anInt299;
											return;
										}
										if (arg0 == 3710) {
											local15 = anIntArray590[--anInt10958];
											aStringArray48[anInt10960++] = aClass23_2.aStringArray5[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = aClass23_2.aByteArray5[local15];
											return;
										}
										if (arg0 == 3712) {
											anIntArray590[anInt10958++] = aClass23_2.anInt298;
											return;
										}
										if (arg0 == 3713) {
											local15 = anIntArray590[--anInt10958];
											aStringArray48[anInt10960++] = aClass23_2.aStringArray4[local15];
											return;
										}
										if (arg0 == 3714) {
											anInt10958 -= 3;
											local15 = anIntArray590[anInt10958];
											local21 = anIntArray590[anInt10958 + 1];
											local27 = anIntArray590[anInt10958 + 2];
											anIntArray590[anInt10958++] = aClass23_2.method332(local27, local21, local15);
											return;
										}
										if (arg0 == 3715) {
											anIntArray590[anInt10958++] = aClass23_2.anInt304;
											return;
										}
										if (arg0 == 3716) {
											anIntArray590[anInt10958++] = aClass23_2.anInt327;
											return;
										}
										if (arg0 == 3717) {
											anIntArray590[anInt10958++] = aClass23_2.method351(aStringArray48[--anInt10960]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray590[anInt10958 - 1] = aClass23_2.method342()[anIntArray590[anInt10958 - 1]];
											return;
										}
										if (arg0 == 3719) {
											Static192.method9268(anIntArray590[--anInt10958]);
											return;
										}
										if (arg0 == 3720) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = aClass23_2.anIntArray26[local15];
											return;
										}
										if (arg0 == 3750) {
											if (Static412.aClass14_Sub48_2 != null) {
												anIntArray590[anInt10958++] = 1;
												aClass14_Sub48_3 = Static412.aClass14_Sub48_2;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static71.aClass14_Sub48_1 != null) {
												anIntArray590[anInt10958++] = 1;
												aClass14_Sub48_3 = Static71.aClass14_Sub48_1;
												return;
											}
											anIntArray590[anInt10958++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray48[anInt10960++] = aClass14_Sub48_3.aString118;
											return;
										}
										if (arg0 == 3753) {
											anIntArray590[anInt10958++] = aClass14_Sub48_3.aByte136;
											return;
										}
										if (arg0 == 3754) {
											anIntArray590[anInt10958++] = aClass14_Sub48_3.aByte135;
											return;
										}
										if (arg0 == 3755) {
											anIntArray590[anInt10958++] = aClass14_Sub48_3.anInt10291;
											return;
										}
										if (arg0 == 3756) {
											local15 = anIntArray590[--anInt10958];
											aStringArray48[anInt10960++] = aClass14_Sub48_3.aClass155Array1[local15].aString45;
											return;
										}
										if (arg0 == 3757) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = aClass14_Sub48_3.aClass155Array1[local15].aByte85;
											return;
										}
										if (arg0 == 3758) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = aClass14_Sub48_3.aClass155Array1[local15].anInt4349;
											return;
										}
										if (arg0 == 3759) {
											local15 = anIntArray590[--anInt10958];
											Static603.method8517(local15, aClass14_Sub48_3 == Static71.aClass14_Sub48_1);
											return;
										}
										if (arg0 == 3760) {
											anIntArray590[anInt10958++] = aClass14_Sub48_3.method8807(aStringArray48[--anInt10960]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray590[anInt10958 - 1] = aClass14_Sub48_3.method8802()[anIntArray590[anInt10958 - 1]];
											return;
										}
										if (arg0 == 3790) {
											anIntArray590[anInt10958++] = Static576.anObjectArray36 == null ? 0 : 1;
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static481.aClass76Array6[local15].method1766();
											return;
										}
										if (arg0 == 3904) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static481.aClass76Array6[local15].anInt1848;
											return;
										}
										if (arg0 == 3905) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static481.aClass76Array6[local15].anInt1841;
											return;
										}
										if (arg0 == 3906) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static481.aClass76Array6[local15].anInt1844;
											return;
										}
										if (arg0 == 3907) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static481.aClass76Array6[local15].anInt1845;
											return;
										}
										if (arg0 == 3908) {
											local15 = anIntArray590[--anInt10958];
											anIntArray590[anInt10958++] = Static481.aClass76Array6[local15].anInt1846;
											return;
										}
										if (arg0 == 3910) {
											local15 = anIntArray590[--anInt10958];
											local21 = Static481.aClass76Array6[local15].method1767();
											anIntArray590[anInt10958++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = anIntArray590[--anInt10958];
											local21 = Static481.aClass76Array6[local15].method1767();
											anIntArray590[anInt10958++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = anIntArray590[--anInt10958];
											local21 = Static481.aClass76Array6[local15].method1767();
											anIntArray590[anInt10958++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = anIntArray590[--anInt10958];
											local21 = Static481.aClass76Array6[local15].method1767();
											anIntArray590[anInt10958++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(9264) long local9264;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt10958 -= 5;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local27 = anIntArray590[anInt10958 + 2];
												local506 = anIntArray590[anInt10958 + 3];
												local2944 = anIntArray590[anInt10958 + 4];
												anIntArray590[anInt10958++] = local15 + (local21 - local15) * (local2944 - local27) / (local506 - local27);
												return;
											}
											@Pc(9271) long local9271;
											if (arg0 == 4007) {
												anInt10958 -= 2;
												local9264 = (long) anIntArray590[anInt10958];
												local9271 = (long) anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = (int) (local9264 + local9264 * local9271 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												if (local15 == 0) {
													anIntArray590[anInt10958++] = 0;
													return;
												}
												anIntArray590[anInt10958++] = (int) Math.pow((double) local15, (double) local21);
												return;
											}
											if (arg0 == 4013) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												if (local15 == 0) {
													anIntArray590[anInt10958++] = 0;
													return;
												}
												if (local21 == 0) {
													anIntArray590[anInt10958++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray590[anInt10958++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												anInt10958 -= 3;
												local9264 = (long) anIntArray590[anInt10958];
												local9271 = (long) anIntArray590[anInt10958 + 1];
												@Pc(9658) long local9658 = (long) anIntArray590[anInt10958 + 2];
												anIntArray590[anInt10958++] = (int) (local9264 * local9658 / local9271);
												return;
											}
											if (arg0 == 4019) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												if (local15 > 700 || local21 > 700) {
													anIntArray590[anInt10958++] = 256;
												}
												@Pc(9721) double local9721 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												anIntArray590[anInt10958++] = (int) (Math.pow(2.0D, local9721) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static441.anIntArray394[Static644.method9055(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4849 = aStringArray48[--anInt10960];
												local21 = anIntArray590[--anInt10958];
												aStringArray48[anInt10960++] = local4849 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt10960 -= 2;
												local4849 = aStringArray48[anInt10960];
												local1394 = aStringArray48[anInt10960 + 1];
												aStringArray48[anInt10960++] = local4849 + local1394;
												return;
											}
											if (arg0 == 4102) {
												local4849 = aStringArray48[--anInt10960];
												local21 = anIntArray590[--anInt10958];
												aStringArray48[anInt10960++] = local4849 + Static545.method5449(true, local21);
												return;
											}
											if (arg0 == 4103) {
												local4849 = aStringArray48[--anInt10960];
												aStringArray48[anInt10960++] = local4849.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray48[anInt10960++] = Static141.method2131(Static26.anInt352, Static338.method5179(anIntArray590[--anInt10958]));
												return;
											}
											if (arg0 == 4105) {
												anInt10960 -= 2;
												local4849 = aStringArray48[anInt10960];
												local1394 = aStringArray48[anInt10960 + 1];
												if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 != null && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1.aBoolean776) {
													aStringArray48[anInt10960++] = local1394;
													return;
												}
												aStringArray48[anInt10960++] = local4849;
												return;
											}
											if (arg0 == 4106) {
												local15 = anIntArray590[--anInt10958];
												aStringArray48[anInt10960++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt10960 -= 2;
												anIntArray590[anInt10958++] = Static480.method7251(aStringArray48[anInt10960 + 1], Static26.anInt352, aStringArray48[anInt10960]);
												return;
											}
											@Pc(10041) Class350 local10041;
											if (arg0 == 4108) {
												local4849 = aStringArray48[--anInt10960];
												anInt10958 -= 2;
												local21 = anIntArray590[anInt10958];
												local27 = anIntArray590[anInt10958 + 1];
												local10041 = Static584.method8114(local27, Static130.aClass310_31);
												anIntArray590[anInt10958++] = local10041.method8358(local4849, local21, Static610.aClass45Array31);
												return;
											}
											if (arg0 == 4109) {
												local4849 = aStringArray48[--anInt10960];
												anInt10958 -= 2;
												local21 = anIntArray590[anInt10958];
												local27 = anIntArray590[anInt10958 + 1];
												local10041 = Static584.method8114(local27, Static130.aClass310_31);
												anIntArray590[anInt10958++] = local10041.method8352(Static610.aClass45Array31, local21, local4849);
												return;
											}
											if (arg0 == 4110) {
												anInt10960 -= 2;
												local4849 = aStringArray48[anInt10960];
												local1394 = aStringArray48[anInt10960 + 1];
												if (anIntArray590[--anInt10958] == 1) {
													aStringArray48[anInt10960++] = local4849;
													return;
												}
												aStringArray48[anInt10960++] = local1394;
												return;
											}
											if (arg0 == 4111) {
												local4849 = aStringArray48[--anInt10960];
												aStringArray48[anInt10960++] = Static159.method2265(local4849);
												return;
											}
											if (arg0 == 4112) {
												local4849 = aStringArray48[--anInt10960];
												local21 = anIntArray590[--anInt10958];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray48[anInt10960++] = local4849 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = method9292((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static237.method3983((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static444.method6623((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static689.method9507((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4849 = aStringArray48[--anInt10960];
												if (local4849 != null) {
													anIntArray590[anInt10958++] = local4849.length();
													return;
												}
												anIntArray590[anInt10958++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4849 = aStringArray48[--anInt10960];
												anInt10958 -= 2;
												local21 = anIntArray590[anInt10958];
												local27 = anIntArray590[anInt10958 + 1];
												aStringArray48[anInt10960++] = local4849.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4849 = aStringArray48[--anInt10960];
												@Pc(10407) StringBuffer local10407 = new StringBuffer(local4849.length());
												@Pc(10409) boolean local10409 = false;
												for (local506 = 0; local506 < local4849.length(); local506++) {
													@Pc(10416) char local10416 = local4849.charAt(local506);
													if (local10416 == '<') {
														local10409 = true;
													} else if (local10416 == '>') {
														local10409 = false;
													} else if (!local10409) {
														local10407.append(local10416);
													}
												}
												aStringArray48[anInt10960++] = local10407.toString();
												return;
											}
											if (arg0 == 4120) {
												local4849 = aStringArray48[--anInt10960];
												anInt10958 -= 2;
												local21 = anIntArray590[anInt10958];
												local27 = anIntArray590[anInt10958 + 1];
												anIntArray590[anInt10958++] = local4849.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt10960 -= 2;
												local4849 = aStringArray48[anInt10960];
												local1394 = aStringArray48[anInt10960 + 1];
												local27 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = local4849.indexOf(local1394, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local575 = anIntArray590[--anInt10958] != 0;
												local21 = anIntArray590[--anInt10958];
												aStringArray48[anInt10960++] = Static465.method6863(0, local575, (long) local21, Static26.anInt352);
												return;
											}
											if (arg0 == 4125) {
												local4849 = aStringArray48[--anInt10960];
												local21 = anIntArray590[--anInt10958];
												@Pc(10636) Class350 local10636 = Static584.method8114(local21, Static130.aClass310_31);
												anIntArray590[anInt10958++] = local10636.method8357(Static610.aClass45Array31, local4849);
												return;
											}
											if (arg0 == 4126) {
												aStringArray48[anInt10960++] = Static227.method3838((long) anIntArray590[--anInt10958] * 60000L, Static26.anInt352) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local9264 = aLongArray21[--anInt10954];
												aStringArray48[anInt10960++] = local9264 == -1L ? "" : Long.toString(local9264, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = anIntArray590[--anInt10958];
												aStringArray48[anInt10960++] = Static252.aClass56_1.method1052(local15).aString89;
												return;
											}
											@Pc(10765) Class284 local10765;
											if (arg0 == 4201) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local10765 = Static252.aClass56_1.method1052(local15);
												if (local21 >= 1 && local21 <= 5 && local10765.aStringArray33[local21 - 1] != null) {
													aStringArray48[anInt10960++] = local10765.aStringArray33[local21 - 1];
													return;
												}
												aStringArray48[anInt10960++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local10765 = Static252.aClass56_1.method1052(local15);
												if (local21 >= 1 && local21 <= 5 && local10765.aStringArray32[local21 - 1] != null) {
													aStringArray48[anInt10960++] = local10765.aStringArray32[local21 - 1];
													return;
												}
												aStringArray48[anInt10960++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static252.aClass56_1.method1052(local15).anInt7760;
												return;
											}
											if (arg0 == 4204) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static252.aClass56_1.method1052(local15).lb == 1 ? 1 : 0;
												return;
											}
											@Pc(10939) Class284 local10939;
											if (arg0 == 4205) {
												local15 = anIntArray590[--anInt10958];
												local10939 = Static252.aClass56_1.method1052(local15);
												if (local10939.anInt7752 == -1 && local10939.anInt7779 >= 0) {
													anIntArray590[anInt10958++] = local10939.anInt7779;
													return;
												}
												anIntArray590[anInt10958++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = anIntArray590[--anInt10958];
												local10939 = Static252.aClass56_1.method1052(local15);
												if (local10939.anInt7752 >= 0 && local10939.anInt7779 >= 0) {
													anIntArray590[anInt10958++] = local10939.anInt7779;
													return;
												}
												anIntArray590[anInt10958++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static252.aClass56_1.method1052(local15).aBoolean543 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local3814 = Static653.aClass104_2.method2173(local21);
												if (local3814.method2205()) {
													aStringArray48[anInt10960++] = Static252.aClass56_1.method1052(local15).method6833(local21, local3814.aString32);
													return;
												}
												anIntArray590[anInt10958++] = Static252.aClass56_1.method1052(local15).method6828(local3814.anInt2348, local21);
												return;
											}
											if (arg0 == 4209) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1] - 1;
												local10765 = Static252.aClass56_1.method1052(local15);
												if (local10765.anInt7756 == local21) {
													anIntArray590[anInt10958++] = local10765.anInt7739;
													return;
												}
												if (local10765.anInt7751 == local21) {
													anIntArray590[anInt10958++] = local10765.anInt7735;
													return;
												}
												anIntArray590[anInt10958++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4849 = aStringArray48[--anInt10960];
												local21 = anIntArray590[--anInt10958];
												Static51.method944(local4849, local21 == 1);
												anIntArray590[anInt10958++] = Static280.anInt5164;
												return;
											}
											if (arg0 == 4211) {
												if (Static345.aShortArray74 != null && Static505.anInt8752 < Static280.anInt5164) {
													anIntArray590[anInt10958++] = Static345.aShortArray74[Static505.anInt8752++] & 0xFFFF;
													return;
												}
												anIntArray590[anInt10958++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static505.anInt8752 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = anIntArray590[--anInt10958];
												anIntArray590[anInt10958++] = Static252.aClass56_1.method1052(local15).anInt7755;
												return;
											}
											if (arg0 == 4214) {
												local4849 = aStringArray48[--anInt10960];
												anInt10958 -= 3;
												local21 = anIntArray590[anInt10958];
												local27 = anIntArray590[anInt10958 + 1];
												local506 = anIntArray590[anInt10958 + 2];
												Static521.method7679(local27, local4849, local21 == 1, local506);
												anIntArray590[anInt10958++] = Static280.anInt5164;
												return;
											}
											if (arg0 == 4215) {
												anInt10960 -= 2;
												anInt10958 -= 2;
												local4849 = aStringArray48[anInt10960];
												local21 = anIntArray590[anInt10958];
												local27 = anIntArray590[anInt10958 + 1];
												@Pc(11356) String local11356 = aStringArray48[anInt10960 + 1];
												Static201.method3011(local4849, local21 == 1, local11356, local27);
												anIntArray590[anInt10958++] = Static280.anInt5164;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local3814 = Static653.aClass104_2.method2173(local21);
												if (local3814.method2205()) {
													aStringArray48[anInt10960++] = Static152.aClass61_1.method1230(local15).method8643(local3814.aString32, local21);
													return;
												}
												anIntArray590[anInt10958++] = Static152.aClass61_1.method1230(local15).method8636(local21, local3814.anInt2348);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local3814 = Static653.aClass104_2.method2173(local21);
												if (local3814.method2205()) {
													aStringArray48[anInt10960++] = Static212.aClass249_4.method6119(local15).method2680(local21, local3814.aString32);
													return;
												}
												anIntArray590[anInt10958++] = Static212.aClass249_4.method6119(local15).method2677(local3814.anInt2348, local21);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt10958 -= 2;
												local15 = anIntArray590[anInt10958];
												local21 = anIntArray590[anInt10958 + 1];
												local3814 = Static653.aClass104_2.method2173(local21);
												if (local3814.method2205()) {
													aStringArray48[anInt10960++] = Static241.aClass253_1.method6174(local15).method8004(local3814.aString32, local21);
													return;
												}
												anIntArray590[anInt10958++] = Static241.aClass253_1.method6174(local15).method7999(local3814.anInt2348, local21);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = anIntArray590[--anInt10958];
												@Pc(11596) Class141 local11596 = Static52.aClass175_1.method4257(local15);
												if (local11596.anIntArray205 != null && local11596.anIntArray205.length > 0) {
													local27 = 0;
													local506 = local11596.anIntArray209[0];
													for (local2944 = 1; local2944 < local11596.anIntArray205.length; local2944++) {
														if (local11596.anIntArray209[local2944] > local506) {
															local27 = local2944;
															local506 = local11596.anIntArray209[local2944];
														}
													}
													anIntArray590[anInt10958++] = local11596.anIntArray205[local27];
													return;
												}
												anIntArray590[anInt10958++] = local11596.anInt3544;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray590[anInt10958++] = Static217.aBoolean326 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4849 = aStringArray48[--anInt10960];
												if (Static387.anInt9114 == 7 && !Static355.method5401()) {
													if (local4849.length() > 20) {
														Static177.aByte62 = -4;
														return;
													}
													Static177.aByte62 = -1;
													local4943 = Static72.method1195(Static277.aClass347_1.aClass197_2, Static288.aClass251_125);
													local4943.aClass14_Sub21_Sub2_2.method7747(0);
													local27 = local4943.aClass14_Sub21_Sub2_2.anInt8936;
													local4943.aClass14_Sub21_Sub2_2.method7690(local4849);
													local4943.aClass14_Sub21_Sub2_2.method7715(local4943.aClass14_Sub21_Sub2_2.anInt8936 - local27);
													Static277.aClass347_1.method8308(local4943);
													return;
												}
												Static177.aByte62 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray590[anInt10958++] = Static177.aByte62;
												if (Static177.aByte62 != -1) {
													Static177.aByte62 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static391.method5936(anIntArray590[--anInt10958]);
						} else {
							local220 = arg1 ? aClass299_14 : aClass299_13;
						}
						if (arg0 == 1300) {
							local21 = anIntArray590[--anInt10958] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local220.method7438(aStringArray48[--anInt10960], local21);
								return;
							}
							anInt10960--;
							return;
						}
						if (arg0 == 1301) {
							anInt10958 -= 2;
							local21 = anIntArray590[anInt10958];
							local27 = anIntArray590[anInt10958 + 1];
							if (local21 == -1 && local27 == -1) {
								local220.aClass299_8 = null;
								return;
							}
							local220.aClass299_8 = Static384.method5875(local21, local27);
							return;
						}
						if (arg0 == 1302) {
							local21 = anIntArray590[--anInt10958];
							if (local21 != Static629.anInt10319 && local21 != Static557.anInt8792 && local21 != Static267.anInt4946) {
								return;
							}
							local220.anInt8556 = local21;
							return;
						}
						if (arg0 == 1303) {
							local220.anInt8592 = anIntArray590[--anInt10958];
							return;
						}
						if (arg0 == 1304) {
							local220.anInt8601 = anIntArray590[--anInt10958];
							return;
						}
						if (arg0 == 1305) {
							local220.aString95 = aStringArray48[--anInt10960];
							return;
						}
						if (arg0 == 1306) {
							local220.aString97 = aStringArray48[--anInt10960];
							return;
						}
						if (arg0 == 1307) {
							local220.aStringArray36 = null;
							return;
						}
						if (arg0 == 1308) {
							local220.anInt8550 = anIntArray590[--anInt10958];
							local220.anInt8572 = anIntArray590[--anInt10958];
							return;
						}
						if (arg0 == 1309) {
							local21 = anIntArray590[--anInt10958];
							local27 = anIntArray590[--anInt10958];
							if (local27 >= 1 && local27 <= 10) {
								local220.method7444(local27 - 1, local21);
							}
							return;
						}
						if (arg0 == 1310) {
							local220.aString98 = aStringArray48[--anInt10960];
							return;
						}
						if (arg0 == 1311) {
							local220.anInt8533 = anIntArray590[--anInt10958];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt10958 -= 3;
								local21 = anIntArray590[anInt10958] - 1;
								local27 = anIntArray590[anInt10958 + 1];
								local506 = anIntArray590[anInt10958 + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt10958 -= 2;
								local21 = 10;
								local27 = anIntArray590[anInt10958];
								local506 = anIntArray590[anInt10958 + 1];
							}
							if (local220.aByteArray91 == null) {
								if (local27 == 0) {
									return;
								}
								local220.aByteArray91 = new byte[11];
								local220.aByteArray90 = new byte[11];
								local220.anIntArray443 = new int[11];
							}
							local220.aByteArray91[local21] = (byte) local27;
							if (local27 == 0) {
								local220.aBoolean606 = false;
								for (local2944 = 0; local2944 < local220.aByteArray91.length; local2944++) {
									if (local220.aByteArray91[local2944] != 0) {
										local220.aBoolean606 = true;
										break;
									}
								}
							} else {
								local220.aBoolean606 = true;
							}
							local220.aByteArray90[local21] = (byte) local506;
							return;
						}
						if (arg0 == 1314) {
							local220.anInt8553 = anIntArray590[--anInt10958];
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(IZ)V")
	private static void method9306(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray590[anInt10958++] = Static242.anInt4629;
				return;
			}
			@Pc(57) Class347 local57;
			@Pc(63) Class14_Sub54 local63;
			if (arg0 == 5001) {
				anInt10958 -= 3;
				Static242.anInt4629 = anIntArray590[anInt10958];
				Static275.aClass305_4 = Static431.method6454(anIntArray590[anInt10958 + 1]);
				if (Static275.aClass305_4 == null) {
					Static275.aClass305_4 = Static49.aClass305_2;
				}
				Static664.anInt10860 = anIntArray590[anInt10958 + 2];
				local57 = Static435.method6495();
				local63 = Static72.method1195(local57.aClass197_2, Static79.aClass251_46);
				local63.aClass14_Sub21_Sub2_2.method7747(Static242.anInt4629);
				local63.aClass14_Sub21_Sub2_2.method7747(Static275.aClass305_4.anInt8872);
				local63.aClass14_Sub21_Sub2_2.method7747(Static664.anInt10860);
				local57.method8308(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt10960 -= 2;
				local95 = aStringArray48[anInt10960];
				local101 = aStringArray48[anInt10960 + 1];
				anInt10958 -= 2;
				local109 = anIntArray590[anInt10958];
				local115 = anIntArray590[anInt10958 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class347 local135 = Static435.method6495();
				@Pc(141) Class14_Sub54 local141 = Static72.method1195(local135.aClass197_2, Static72.aClass251_41);
				local141.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(local95) + Static418.method6276(local101) + 2);
				local141.aClass14_Sub21_Sub2_2.method7690(local95);
				local141.aClass14_Sub21_Sub2_2.method7747(local109 - 1);
				local141.aClass14_Sub21_Sub2_2.method7747(local115);
				local141.aClass14_Sub21_Sub2_2.method7690(local101);
				local135.method8308(local141);
				return;
			}
			@Pc(196) Class30 local196;
			if (arg0 == 5003) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local198 = "";
				if (local196 != null && local196.aString12 != null) {
					local198 = local196.aString12;
				}
				aStringArray48[anInt10960++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt535;
				}
				anIntArray590[anInt10958++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static275.aClass305_4 == null) {
					anIntArray590[anInt10958++] = -1;
					return;
				}
				anIntArray590[anInt10958++] = Static275.aClass305_4.anInt8872;
				return;
			}
			@Pc(295) Class14_Sub54 local295;
			@Pc(289) Class347 local289;
			if (arg0 == 5006) {
				local192 = anIntArray590[--anInt10958];
				local289 = Static435.method6495();
				local295 = Static72.method1195(local289.aClass197_2, Static658.aClass251_266);
				local295.aClass14_Sub21_Sub2_2.method7747(local192);
				local289.method8308(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray48[--anInt10960];
				method9300(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt10960 -= 2;
				local95 = aStringArray48[anInt10960];
				local101 = aStringArray48[anInt10960 + 1];
				if (Static469.anInt11068 != 0 || (!Static321.aBoolean403 || Static586.aBoolean669) && !Static292.aBoolean395) {
					@Pc(360) Class347 local360 = Static435.method6495();
					@Pc(366) Class14_Sub54 local366 = Static72.method1195(local360.aClass197_2, Static252.aClass251_110);
					local366.aClass14_Sub21_Sub2_2.method7747(0);
					local375 = local366.aClass14_Sub21_Sub2_2.anInt8936;
					local366.aClass14_Sub21_Sub2_2.method7690(local95);
					Static582.method8305(local101, local366.aClass14_Sub21_Sub2_2);
					local366.aClass14_Sub21_Sub2_2.method7715(local366.aClass14_Sub21_Sub2_2.anInt8936 - local375);
					local360.method8308(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local198 = "";
				if (local196 != null && local196.aString11 != null) {
					local198 = local196.aString11;
				}
				aStringArray48[anInt10960++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local198 = "";
				if (local196 != null && local196.aString13 != null) {
					local198 = local196.aString13;
				}
				aStringArray48[anInt10960++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt534;
				}
				anIntArray590[anInt10958++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == null || Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString38 == null) {
					local95 = "";
				} else {
					local95 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2888();
				}
				aStringArray48[anInt10960++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray590[anInt10958++] = Static664.anInt10860;
				return;
			}
			if (arg0 == 5017) {
				anIntArray590[anInt10958++] = Static318.method5038();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt532;
				}
				anIntArray590[anInt10958++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local198 = "";
				if (local196 != null && local196.aString10 != null) {
					local198 = local196.aString10;
				}
				aStringArray48[anInt10960++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == null || Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString38 == null) {
					local95 = "";
				} else {
					local95 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2887();
				}
				aStringArray48[anInt10960++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt536;
				}
				anIntArray590[anInt10958++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt537;
				}
				anIntArray590[anInt10958++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray590[--anInt10958];
				local196 = Static257.method4319(local192);
				local198 = "";
				if (local196 != null && local196.aString14 != null) {
					local198 = local196.aString14;
				}
				aStringArray48[anInt10960++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray590[--anInt10958];
				aStringArray48[anInt10960++] = Static541.aClass77_1.method1768(local192).aString111;
				return;
			}
			@Pc(793) Class14_Sub2_Sub19 local793;
			if (arg0 == 5051) {
				local192 = anIntArray590[--anInt10958];
				local793 = Static541.aClass77_1.method1768(local192);
				if (local793.anIntArray538 == null) {
					anIntArray590[anInt10958++] = 0;
					return;
				}
				anIntArray590[anInt10958++] = local793.anIntArray538.length;
				return;
			}
			if (arg0 == 5052) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				@Pc(839) Class14_Sub2_Sub19 local839 = Static541.aClass77_1.method1768(local192);
				local115 = local839.anIntArray538[local834];
				anIntArray590[anInt10958++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray590[--anInt10958];
				local793 = Static541.aClass77_1.method1768(local192);
				if (local793.anIntArray539 == null) {
					anIntArray590[anInt10958++] = 0;
					return;
				}
				anIntArray590[anInt10958++] = local793.anIntArray539.length;
				return;
			}
			if (arg0 == 5054) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				anIntArray590[anInt10958++] = Static541.aClass77_1.method1768(local192).anIntArray539[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray590[--anInt10958];
				aStringArray48[anInt10960++] = Static592.aClass46_2.method897(local192).method1671();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray590[--anInt10958];
				@Pc(966) Class14_Sub2_Sub8 local966 = Static592.aClass46_2.method897(local192);
				if (local966.anIntArray92 == null) {
					anIntArray590[anInt10958++] = 0;
					return;
				}
				anIntArray590[anInt10958++] = local966.anIntArray92.length;
				return;
			}
			if (arg0 == 5057) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				anIntArray590[anInt10958++] = Static592.aClass46_2.method897(local192).anIntArray92[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass184_1 = new Class184();
				aClass184_1.anInt5127 = anIntArray590[--anInt10958];
				aClass184_1.aClass14_Sub2_Sub8_1 = Static592.aClass46_2.method897(aClass184_1.anInt5127);
				aClass184_1.anIntArray280 = new int[aClass184_1.aClass14_Sub2_Sub8_1.method1676()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static435.method6495();
				local63 = Static72.method1195(local57.aClass197_2, Static640.aClass251_257);
				local63.aClass14_Sub21_Sub2_2.method7747(0);
				local109 = local63.aClass14_Sub21_Sub2_2.anInt8936;
				local63.aClass14_Sub21_Sub2_2.method7747(0);
				local63.aClass14_Sub21_Sub2_2.method7751(aClass184_1.anInt5127);
				aClass184_1.aClass14_Sub2_Sub8_1.method1673(aClass184_1.anIntArray280, local63.aClass14_Sub21_Sub2_2);
				local63.aClass14_Sub21_Sub2_2.method7715(local63.aClass14_Sub21_Sub2_2.anInt8936 - local109);
				local57.method8308(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray48[--anInt10960];
				local289 = Static435.method6495();
				local295 = Static72.method1195(local289.aClass197_2, Static146.aClass251_81);
				local295.aClass14_Sub21_Sub2_2.method7747(0);
				local115 = local295.aClass14_Sub21_Sub2_2.anInt8936;
				local295.aClass14_Sub21_Sub2_2.method7690(local95);
				local295.aClass14_Sub21_Sub2_2.method7751(aClass184_1.anInt5127);
				aClass184_1.aClass14_Sub2_Sub8_1.method1673(aClass184_1.anIntArray280, local295.aClass14_Sub21_Sub2_2);
				local295.aClass14_Sub21_Sub2_2.method7715(local295.aClass14_Sub21_Sub2_2.anInt8936 - local115);
				local289.method8308(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static435.method6495();
				local63 = Static72.method1195(local57.aClass197_2, Static640.aClass251_257);
				local63.aClass14_Sub21_Sub2_2.method7747(0);
				local109 = local63.aClass14_Sub21_Sub2_2.anInt8936;
				local63.aClass14_Sub21_Sub2_2.method7747(1);
				local63.aClass14_Sub21_Sub2_2.method7751(aClass184_1.anInt5127);
				aClass184_1.aClass14_Sub2_Sub8_1.method1673(aClass184_1.anIntArray280, local63.aClass14_Sub21_Sub2_2);
				local63.aClass14_Sub21_Sub2_2.method7715(local63.aClass14_Sub21_Sub2_2.anInt8936 - local109);
				local57.method8308(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				anIntArray590[anInt10958++] = Static541.aClass77_1.method1768(local192).aCharArray12[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				anIntArray590[anInt10958++] = Static541.aClass77_1.method1768(local192).aCharArray11[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				if (local834 == -1) {
					anIntArray590[anInt10958++] = -1;
					return;
				}
				anIntArray590[anInt10958++] = Static541.aClass77_1.method1768(local192).method8531((char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				if (local834 == -1) {
					anIntArray590[anInt10958++] = -1;
					return;
				}
				anIntArray590[anInt10958++] = Static541.aClass77_1.method1768(local192).method8535((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray590[--anInt10958];
				anIntArray590[anInt10958++] = Static592.aClass46_2.method897(local192).method1676();
				return;
			}
			if (arg0 == 5067) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				local109 = Static592.aClass46_2.method897(local192).method1670(local834).anInt10732;
				anIntArray590[anInt10958++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				aClass184_1.anIntArray280[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt10958 -= 2;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				aClass184_1.anIntArray280[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt10958 -= 3;
				local192 = anIntArray590[anInt10958];
				local834 = anIntArray590[anInt10958 + 1];
				local109 = anIntArray590[anInt10958 + 2];
				@Pc(1526) Class14_Sub2_Sub8 local1526 = Static592.aClass46_2.method897(local192);
				if (local1526.method1670(local834).anInt10732 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray590[anInt10958++] = local1526.method1678(local834, local109);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray48[--anInt10960];
				local1578 = anIntArray590[--anInt10958] == 1;
				Static256.method4309(local95, local1578);
				anIntArray590[anInt10958++] = Static280.anInt5164;
				return;
			}
			if (arg0 == 5072) {
				if (Static345.aShortArray74 != null && Static505.anInt8752 < Static280.anInt5164) {
					anIntArray590[anInt10958++] = Static345.aShortArray74[Static505.anInt8752++] & 0xFFFF;
					return;
				}
				anIntArray590[anInt10958++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static505.anInt8752 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static435.method6495();
				local63 = Static72.method1195(local57.aClass197_2, Static640.aClass251_257);
				local63.aClass14_Sub21_Sub2_2.method7747(0);
				local109 = local63.aClass14_Sub21_Sub2_2.anInt8936;
				local63.aClass14_Sub21_Sub2_2.method7747(2);
				local63.aClass14_Sub21_Sub2_2.method7751(aClass184_1.anInt5127);
				aClass184_1.aClass14_Sub2_Sub8_1.method1673(aClass184_1.anIntArray280, local63.aClass14_Sub21_Sub2_2);
				local63.aClass14_Sub21_Sub2_2.method7715(local63.aClass14_Sub21_Sub2_2.anInt8936 - local109);
				local57.method8308(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static435.method6495();
				local63 = Static72.method1195(local57.aClass197_2, Static640.aClass251_257);
				local63.aClass14_Sub21_Sub2_2.method7747(0);
				local109 = local63.aClass14_Sub21_Sub2_2.anInt8936;
				local63.aClass14_Sub21_Sub2_2.method7747(3);
				local63.aClass14_Sub21_Sub2_2.method7751(aClass184_1.anInt5127);
				aClass184_1.aClass14_Sub2_Sub8_1.method1673(aClass184_1.anIntArray280, local63.aClass14_Sub21_Sub2_2);
				local63.aClass14_Sub21_Sub2_2.method7715(local63.aClass14_Sub21_Sub2_2.anInt8936 - local109);
				local57.method8308(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static89.aClass207_3.method5068(86)) {
					anIntArray590[anInt10958++] = 1;
					return;
				}
				anIntArray590[anInt10958++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static89.aClass207_3.method5068(82)) {
					anIntArray590[anInt10958++] = 1;
					return;
				}
				anIntArray590[anInt10958++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static89.aClass207_3.method5068(81)) {
					anIntArray590[anInt10958++] = 1;
					return;
				}
				anIntArray590[anInt10958++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static276.method4677(anIntArray590[--anInt10958]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray590[anInt10958++] = Static665.method9232();
					return;
				}
				if (arg0 == 5205) {
					Static503.method7576(false, -1, anIntArray590[--anInt10958], -1);
					return;
				}
				@Pc(1908) Class14_Sub2_Sub10 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static224.method1312(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = local1908.anInt4813;
					return;
				}
				@Pc(1942) Class14_Sub2_Sub10 local1942;
				if (arg0 == 5207) {
					local1942 = Static224.method1315(anIntArray590[--anInt10958]);
					if (local1942 != null && local1942.aString67 != null) {
						aStringArray48[anInt10960++] = local1942.aString67;
						return;
					}
					aStringArray48[anInt10960++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray590[anInt10958++] = Static661.anInt10786;
					anIntArray590[anInt10958++] = Static176.anInt2886;
					return;
				}
				if (arg0 == 5209) {
					anIntArray590[anInt10958++] = Static97.anInt1683 + Static224.anInt1291;
					anIntArray590[anInt10958++] = Static381.anInt6704 + Static224.anInt1292;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static224.method1315(local192);
					if (local1908 == null) {
						anIntArray590[anInt10958++] = 0;
						anIntArray590[anInt10958++] = 0;
						return;
					}
					anIntArray590[anInt10958++] = local1908.anInt4801 >> 14 & 0x3FFF;
					anIntArray590[anInt10958++] = local1908.anInt4801 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static224.method1315(local192);
					if (local1908 == null) {
						anIntArray590[anInt10958++] = 0;
						anIntArray590[anInt10958++] = 0;
						return;
					}
					anIntArray590[anInt10958++] = local1908.anInt4802 - local1908.anInt4809;
					anIntArray590[anInt10958++] = local1908.anInt4811 - local1908.anInt4814;
					return;
				}
				@Pc(2139) Class14_Sub39 local2139;
				if (arg0 == 5212) {
					local2139 = Static404.method6115();
					if (local2139 == null) {
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = local2139.anInt8785;
					local834 = local2139.anInt8789 << 28 | local2139.anInt8788 + Static224.anInt1291 << 14 | local2139.anInt8790 + Static224.anInt1292;
					anIntArray590[anInt10958++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static89.method8699();
					if (local2139 == null) {
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = local2139.anInt8785;
					local834 = local2139.anInt8789 << 28 | local2139.anInt8788 + Static224.anInt1291 << 14 | local2139.anInt8790 + Static224.anInt1292;
					anIntArray590[anInt10958++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static494.method7449();
					if (local1908 != null) {
						local2289 = local1908.method4289(anIntArray589, local192 & 0x3FFF, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF);
						if (local2289) {
							Static380.method5855(anIntArray589[2], anIntArray589[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local834 = anIntArray590[anInt10958 + 1];
					@Pc(2329) Class269 local2329 = Static224.method1306(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class14_Sub2_Sub10 local2336 = (Class14_Sub2_Sub10) local2329.method6494(); local2336 != null; local2336 = (Class14_Sub2_Sub10) local2329.method6491()) {
						if (local2336.anInt4813 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray590[anInt10958++] = 1;
						return;
					}
					anIntArray590[anInt10958++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static224.method1315(local192);
					if (local1908 == null) {
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = local1908.anInt4810;
					return;
				}
				if (arg0 == 5220) {
					anIntArray590[anInt10958++] = Static120.anInt1937 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray590[--anInt10958];
					Static380.method5855(local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static494.method7449();
					if (local1942 != null) {
						local1578 = local1942.method4290(Static381.anInt6704 + Static224.anInt1292, anIntArray589, Static97.anInt1683 + Static224.anInt1291);
						if (local1578) {
							anIntArray590[anInt10958++] = anIntArray589[1];
							anIntArray590[anInt10958++] = anIntArray589[2];
							return;
						}
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = -1;
					anIntArray590[anInt10958++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local834 = anIntArray590[anInt10958 + 1];
					Static503.method7576(false, local834 >> 14 & 0x3FFF, local192, local834 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static494.method7449();
					if (local1908 != null) {
						local2289 = local1908.method4289(anIntArray589, local192 & 0x3FFF, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF);
						if (local2289) {
							anIntArray590[anInt10958++] = anIntArray589[1];
							anIntArray590[anInt10958++] = anIntArray589[2];
							return;
						}
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = -1;
					anIntArray590[anInt10958++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray590[--anInt10958];
					local1908 = Static494.method7449();
					if (local1908 != null) {
						local2289 = local1908.method4290(local192 & 0x3FFF, anIntArray589, local192 >> 14 & 0x3FFF);
						if (local2289) {
							anIntArray590[anInt10958++] = anIntArray589[1];
							anIntArray590[anInt10958++] = anIntArray589[2];
							return;
						}
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = -1;
					anIntArray590[anInt10958++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static289.method4813(anIntArray590[--anInt10958]);
					return;
				}
				if (arg0 == 5227) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local834 = anIntArray590[anInt10958 + 1];
					Static503.method7576(true, local834 >> 14 & 0x3FFF, local192, local834 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static626.aBoolean722 = anIntArray590[--anInt10958] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray590[anInt10958++] = Static626.aBoolean722 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray590[--anInt10958];
					Static555.method8018(local192);
					return;
				}
				@Pc(2867) Class14 local2867;
				if (arg0 == 5231) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local1578 = anIntArray590[anInt10958 + 1] == 1;
					if (Static276.aClass125_16 != null) {
						local2867 = Static276.aClass125_16.method2630((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9513();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class14();
							Static276.aClass125_16.method2626(local2867, (long) local192);
						}
					}
					return;
				}
				@Pc(2914) Class14 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray590[--anInt10958];
					if (Static276.aClass125_16 != null) {
						local2914 = Static276.aClass125_16.method2630((long) local192);
						anIntArray590[anInt10958++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray590[anInt10958++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local1578 = anIntArray590[anInt10958 + 1] == 1;
					if (Static558.aClass125_39 != null) {
						local2867 = Static558.aClass125_39.method2630((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9513();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class14();
							Static558.aClass125_39.method2626(local2867, (long) local192);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray590[--anInt10958];
					if (Static558.aClass125_39 != null) {
						local2914 = Static558.aClass125_39.method2630((long) local192);
						anIntArray590[anInt10958++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray590[anInt10958++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray590[anInt10958++] = Static224.aClass14_Sub2_Sub10_2 == null ? -1 : Static224.aClass14_Sub2_Sub10_2.anInt4813;
					return;
				}
				if (arg0 == 5236) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local834 = anIntArray590[anInt10958 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static112.method1790(local115, local109, local192);
					if (local375 < 0) {
						anIntArray590[anInt10958++] = -1;
						return;
					}
					anIntArray590[anInt10958++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static662.method9211();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt10958 -= 2;
					local192 = anIntArray590[anInt10958];
					local834 = anIntArray590[anInt10958 + 1];
					Static89.method8701(false, local834, 3, local192);
					anIntArray590[anInt10958++] = Static12.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static12.aFrame1 != null) {
						Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class386[] local3186 = Static637.method8918();
					anIntArray590[anInt10958++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray590[--anInt10958];
					@Pc(3210) Class386[] local3210 = Static637.method8918();
					anIntArray590[anInt10958++] = local3210[local192].anInt10886;
					anIntArray590[anInt10958++] = local3210[local192].anInt10883;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static69.anInt1061;
					local834 = Static621.anInt10188;
					local109 = -1;
					@Pc(3245) Class386[] local3245 = Static637.method8918();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class386 local3252 = local3245[local375];
						if (local3252.anInt10886 == local192 && local3252.anInt10883 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray590[anInt10958++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray590[anInt10958++] = Static141.method2141();
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray590[--anInt10958];
					if (local192 >= 1 && local192 <= 2) {
						Static89.method8701(false, -1, local192, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray590[--anInt10958];
					if (local192 >= 1 && local192 <= 2) {
						Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub15_1);
						Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub15_2);
						Static574.method8188();
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt10960 -= 2;
						local95 = aStringArray48[anInt10960];
						local101 = aStringArray48[anInt10960 + 1];
						local109 = anIntArray590[--anInt10958];
						@Pc(3411) Class347 local3411 = Static435.method6495();
						@Pc(3417) Class14_Sub54 local3417 = Static72.method1195(local3411.aClass197_2, Static33.aClass251_19);
						local3417.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(local95) + Static418.method6276(local101) + 1);
						local3417.aClass14_Sub21_Sub2_2.method7690(local95);
						local3417.aClass14_Sub21_Sub2_2.method7690(local101);
						local3417.aClass14_Sub21_Sub2_2.method7747(local109);
						local3411.method8308(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt10958 -= 2;
						Static365.aShortArray90[anIntArray590[anInt10958]] = (short) Static636.method8900(anIntArray590[anInt10958 + 1]);
						Static252.aClass56_1.method1053();
						Static252.aClass56_1.method1047();
						Static152.aClass61_1.method1234();
						Static438.method6532();
						return;
					}
					if (arg0 == 5405) {
						anInt10958 -= 2;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static636.anIntArrayArrayArray19[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt10958 -= 7;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1] << 1;
						local109 = anIntArray590[anInt10958 + 2];
						local115 = anIntArray590[anInt10958 + 3];
						local375 = anIntArray590[anInt10958 + 4];
						local3561 = anIntArray590[anInt10958 + 5];
						@Pc(3567) int local3567 = anIntArray590[anInt10958 + 6];
						if (local192 >= 0 && local192 < 2 && Static636.anIntArrayArrayArray19[local192] != null && local834 >= 0 && local834 < Static636.anIntArrayArrayArray19[local192].length) {
							Static636.anIntArrayArrayArray19[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static636.anIntArrayArrayArray19[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static636.anIntArrayArrayArray19[anIntArray590[--anInt10958]].length >> 1;
						anIntArray590[anInt10958++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static12.aFrame1 != null) {
							Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
						}
						if (Static613.aFrame2 != null) {
							Static32.method9346();
							System.exit(0);
							return;
						}
						local95 = Static315.aString73 == null ? Static555.method8017() : Static315.aString73;
						Static381.method5860(Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 1, false, Static344.aClass173_5, local95);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static470.aClass230_8 != null) {
							if (Static470.aClass230_8.anObject12 == null) {
								local95 = Static213.method5252(Static470.aClass230_8.anInt6254);
							} else {
								local95 = (String) Static470.aClass230_8.anObject12;
							}
						}
						aStringArray48[anInt10960++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray590[anInt10958++] = Static344.aClass173_5.aBoolean358 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static12.aFrame1 != null) {
							Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
						}
						local95 = aStringArray48[--anInt10960];
						local1578 = anIntArray590[--anInt10958] == 1;
						local198 = Static555.method8017() + local95;
						Static381.method5860(Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 1, local1578, Static344.aClass173_5, local198);
						return;
					}
					if (arg0 == 5422) {
						anInt10960 -= 2;
						local95 = aStringArray48[anInt10960];
						local101 = aStringArray48[anInt10960 + 1];
						local109 = anIntArray590[--anInt10958];
						if (local95.length() > 0) {
							if (Static603.aStringArray42 == null) {
								Static603.aStringArray42 = new String[Static464.anIntArray412[Static161.aClass80_6.anInt1861]];
							}
							Static603.aStringArray42[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static217.aStringArray20 == null) {
								Static217.aStringArray20 = new String[Static464.anIntArray412[Static161.aClass80_6.anInt1861]];
							}
							Static217.aStringArray20[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray48[--anInt10960]);
						return;
					}
					if (arg0 == 5424) {
						anInt10958 -= 11;
						Static634.anInt10389 = anIntArray590[anInt10958];
						Static662.anInt10793 = anIntArray590[anInt10958 + 1];
						Static331.anInt5679 = anIntArray590[anInt10958 + 2];
						Static308.anInt5463 = anIntArray590[anInt10958 + 3];
						Static591.anInt9781 = anIntArray590[anInt10958 + 4];
						Static339.anInt5776 = anIntArray590[anInt10958 + 5];
						Static95.anInt1678 = anIntArray590[anInt10958 + 6];
						Static485.anInt8382 = anIntArray590[anInt10958 + 7];
						Static307.anInt5460 = anIntArray590[anInt10958 + 8];
						Static220.anInt4304 = anIntArray590[anInt10958 + 9];
						Static338.anInt5748 = anIntArray590[anInt10958 + 10];
						Static99.aClass310_23.method7785(Static591.anInt9781);
						Static99.aClass310_23.method7785(Static339.anInt5776);
						Static99.aClass310_23.method7785(Static95.anInt1678);
						Static99.aClass310_23.method7785(Static485.anInt8382);
						Static99.aClass310_23.method7785(Static307.anInt5460);
						Static260.aClass45_15 = null;
						Static87.aClass45_2 = null;
						Static236.aClass45_13 = null;
						Static284.aClass45_17 = null;
						Static606.aClass45_31 = null;
						Static283.aClass45_16 = null;
						Static310.aClass45_18 = null;
						Static201.aClass45_12 = null;
						Static575.aBoolean661 = true;
						return;
					}
					if (arg0 == 5425) {
						Static249.method4223();
						Static575.aBoolean661 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt10958 -= 2;
						Static292.anInt5309 = anIntArray590[anInt10958];
						Static179.anInt2917 = anIntArray590[anInt10958 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt10958 -= 2;
						return;
					}
					if (arg0 == 5428) {
						anInt10958 -= 2;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1];
						anIntArray590[anInt10958++] = Static100.method1681(local834, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static367.method5514(false, false, aStringArray48[--anInt10960]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static698.method8237(Static531.anApplet2, "accountcreated");
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static698.method8237(Static531.anApplet2, "accountcreatestarted");
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static661.aClipboard1 != null) {
							@Pc(4173) Transferable local4173 = Static661.aClipboard1.getContents((Object) null);
							if (local4173 != null) {
								try {
									local95 = (String) local4173.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4186) Exception local4186) {
								}
							}
						}
						aStringArray48[anInt10960++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static187.anInt3103 = anIntArray590[--anInt10958];
						return;
					}
					if (arg0 == 5435) {
						anIntArray590[anInt10958++] = Static571.aBoolean654 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static526.aClass14_Sub12_1.anInt1229 < 6) {
							anIntArray590[anInt10958++] = 0;
							return;
						}
						if (Static526.aClass14_Sub12_1.anInt1229 == 6 && Static526.aClass14_Sub12_1.anInt1225 < 10) {
							anIntArray590[anInt10958++] = 0;
							return;
						}
						anIntArray590[anInt10958++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt10958 -= 4;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1];
						local109 = anIntArray590[anInt10958 + 2];
						local115 = anIntArray590[anInt10958 + 3];
						Static93.method1579(false, local109, local834 << 2, (local192 & 0x3FFF) - Static550.anInt9242, (local192 >> 14 & 0x3FFF) - Static36.anInt617, local115);
						return;
					}
					if (arg0 == 5501) {
						anInt10958 -= 4;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1];
						local109 = anIntArray590[anInt10958 + 2];
						local115 = anIntArray590[anInt10958 + 3];
						Static229.method3852(local109, (local192 & 0x3FFF) - Static550.anInt9242, local834 << 2, (local192 >> 14 & 0x3FFF) - Static36.anInt617, local115);
						return;
					}
					if (arg0 == 5502) {
						anInt10958 -= 6;
						local192 = anIntArray590[anInt10958];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static627.anInt10294 = local192;
						local834 = anIntArray590[anInt10958 + 1];
						if (local834 + 1 >= Static636.anIntArrayArrayArray19[Static627.anInt10294].length >> 1) {
							throw new RuntimeException();
						}
						Static633.anInt10642 = local834;
						Static238.anInt4577 = 0;
						Static639.anInt10498 = anIntArray590[anInt10958 + 2];
						Static284.anInt5240 = anIntArray590[anInt10958 + 3];
						local109 = anIntArray590[anInt10958 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static600.anInt9908 = local109;
						local115 = anIntArray590[anInt10958 + 5];
						if (local115 + 1 >= Static636.anIntArrayArrayArray19[Static600.anInt9908].length >> 1) {
							throw new RuntimeException();
						}
						Static406.anInt7028 = local115;
						Static304.anInt5410 = 3;
						Static124.anInt2024 = -1;
						Static507.anInt8817 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static535.method7897();
						return;
					}
					if (arg0 == 5504) {
						anInt10958 -= 2;
						Static517.method7663(anIntArray590[anInt10958], anIntArray590[anInt10958 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray590[anInt10958++] = (int) Static680.aFloat210 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray590[anInt10958++] = (int) Static139.aFloat16 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static499.method7526();
						return;
					}
					if (arg0 == 5508) {
						Static505.method7573();
						return;
					}
					if (arg0 == 5509) {
						Static94.method1602();
						return;
					}
					if (arg0 == 5510) {
						Static320.method5050();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray590[--anInt10958];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static36.anInt617;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static380.anInt6689) {
							local834 = Static380.anInt6689;
						}
						local109 -= Static550.anInt9242;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static542.anInt9214) {
							local109 = Static542.anInt9214;
						}
						Static295.anInt5319 = (local834 << 9) + 256;
						Static351.anInt11027 = (local109 << 9) + 256;
						Static304.anInt5410 = 4;
						Static124.anInt2024 = -1;
						Static507.anInt8817 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static615.method8658();
						return;
					}
					if (arg0 == 5514) {
						Static481.anInt10751 = anIntArray590[--anInt10958];
						return;
					}
					if (arg0 == 5516) {
						anIntArray590[anInt10958++] = Static481.anInt10751;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray590[--anInt10958];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static36.anInt617;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static380.anInt6689) {
								local834 = Static380.anInt6689;
							}
							local109 -= Static550.anInt9242;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static542.anInt9214) {
								local109 = Static542.anInt9214;
							}
							Static507.anInt8817 = (local834 << 9) + 256;
							Static124.anInt2024 = (local109 << 9) + 256;
							return;
						}
						Static507.anInt8817 = -1;
						Static124.anInt2024 = -1;
						return;
					}
					if (arg0 == 5547) {
						anIntArray590[anInt10958++] = Static304.anInt5410;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt10960 -= 2;
						local95 = aStringArray48[anInt10960];
						local101 = aStringArray48[anInt10960 + 1];
						local109 = anIntArray590[--anInt10958];
						Static119.method1854(local101, local95, local109);
						return;
					}
					if (arg0 == 5601) {
						Static189.method2830();
						return;
					}
					if (arg0 == 5602) {
						if (!Static355.method5401()) {
							Static532.method7880();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt10960--;
						if (Static387.anInt9114 != 3) {
							return;
						}
						if (!Static355.method5401() && Static465.anInt7807 == 0) {
							Static15.method269(aStringArray48[anInt10960]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt10960 -= 2;
						anInt10958 -= 2;
						if (Static387.anInt9114 != 3) {
							return;
						}
						if (!Static355.method5401() && Static465.anInt7807 == 0) {
							Static250.method4230(aStringArray48[anInt10960], anIntArray590[anInt10958], anIntArray590[anInt10958 + 1] == 1, aStringArray48[anInt10960 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static465.anInt7807 == 0) {
							Static689.anInt11198 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray590[anInt10958++] = Static203.anInt3512;
						return;
					}
					if (arg0 == 5608) {
						anIntArray590[anInt10958++] = Static270.anInt5019;
						return;
					}
					if (arg0 == 5609) {
						anIntArray590[anInt10958++] = Static689.anInt11198;
						return;
					}
					if (arg0 == 5611) {
						anIntArray590[anInt10958++] = Static368.anInt6246;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray590[--anInt10958];
						Static324.method5079(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray590[anInt10958++] = Static203.anInt3512;
						return;
					}
					if (arg0 == 5615) {
						anInt10960 -= 2;
						local95 = aStringArray48[anInt10960];
						local101 = aStringArray48[anInt10960 + 1];
						Static477.method7149(local95, local101);
						return;
					}
					if (arg0 == 5616) {
						Static334.method5151(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray590[anInt10958++] = Static493.anInt8525;
						return;
					}
					if (arg0 == 5618) {
						anInt10958--;
						return;
					}
					if (arg0 == 5619) {
						anInt10958--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray590[anInt10958++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt10960 -= 2;
						anInt10958 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static624.aByteArray106 != null) {
							anIntArray590[anInt10958++] = 1;
							return;
						}
						anIntArray590[anInt10958++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray590[anInt10958++] = (int) (Static653.aLong311 >> 32);
						anIntArray590[anInt10958++] = (int) (Static653.aLong311 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray590[anInt10958++] = Static32.aBoolean770 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static32.aBoolean770 = true;
						Static474.method7102();
						return;
					}
					if (arg0 == 5627) {
						anIntArray590[anInt10958++] = Static160.anInt2462;
						anIntArray590[anInt10958++] = Static600.anInt9920;
						anIntArray590[anInt10958++] = Static466.anInt7823;
						Static160.anInt2462 = -2;
						Static600.anInt9920 = -1;
						Static466.anInt7823 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray590[anInt10958++] = Static355.method5401() ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray590[anInt10958++] = Static445.anInt7494;
						return;
					}
					if (arg0 == 5630) {
						Static116.method1822();
						return;
					}
					if (arg0 == 5631) {
						anInt10958 -= 2;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1];
						Static55.method998(local192, local834);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray590[--anInt10958];
						Static108.method1771(local192);
						return;
					}
					if (arg0 == 5633) {
						anIntArray590[anInt10958++] = Static301.anInt5895;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray590[--anInt10958];
						Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub22_1);
						Static535.method7899();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					@Pc(5330) boolean local5330;
					if (arg0 == 6002) {
						local5330 = anIntArray590[--anInt10958] == 1;
						Static181.aClass14_Sub26_9.method5270(local5330 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub19_2);
						Static181.aClass14_Sub26_9.method5270(local5330 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub19_1);
						Static535.method7899();
						Static357.method5426();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6003) {
						local5330 = anIntArray590[--anInt10958] == 1;
						Static181.aClass14_Sub26_9.method5270(local5330 ? 2 : 1, Static181.aClass14_Sub26_9.aClass43_Sub7_2);
						Static181.aClass14_Sub26_9.method5270(local5330 ? 2 : 1, Static181.aClass14_Sub26_9.aClass43_Sub7_1);
						Static357.method5426();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6005) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub27_1);
						Static535.method7899();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6007) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub2_1);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6008) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub20_1);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6010) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub12_1);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6011) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub8_1);
						Static535.method7899();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6012) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub16_1);
						Static38.method661();
						Static452.method6681();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6014) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 2 : 0, Static181.aClass14_Sub26_9.aClass43_Sub14_1);
						Static535.method7899();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6015) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub21_1);
						Static535.method7899();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6016) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub17_2);
						Static459.method8986(false, Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801());
						Static574.method8188();
						return;
					}
					if (arg0 == 6017) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub25_1);
						Static682.method9409();
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6018) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub11_3);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray590[--anInt10958];
						local834 = Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829();
						if (local192 != local834) {
							if (Static111.method1779(Static387.anInt9114)) {
								if (local834 == 0 && Static184.anInt7567 != -1) {
									Static494.method7429(local192, Static341.aClass310_67, Static184.anInt7567);
									Static285.method4779();
									Static460.aBoolean599 = false;
								} else if (local192 == 0) {
									Static377.method5814();
									Static460.aBoolean599 = false;
								} else {
									Static598.method8465(local192);
								}
							}
							Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub11_1);
							Static574.method8188();
							Static411.aBoolean499 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub11_5);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static181.aClass14_Sub26_9.aClass43_Sub7_2.method2650();
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 0 : local192, Static181.aClass14_Sub26_9.aClass43_Sub7_1);
						Static357.method5426();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray590[--anInt10958];
						Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub28_1);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6024) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub17_1);
						Static574.method8188();
						return;
					}
					if (arg0 == 6025) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub29_1);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray590[--anInt10958];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static282.method4746(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 0 ? 0 : 1, Static181.aClass14_Sub26_9.aClass43_Sub4_1);
						Static574.method8188();
						return;
					}
					if (arg0 == 6029) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub2_1);
						Static574.method8188();
						return;
					}
					if (arg0 == 6030) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 0 ? 0 : 1, Static181.aClass14_Sub26_9.aClass43_Sub24_1);
						Static574.method8188();
						Static535.method7899();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray590[--anInt10958];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static459.method8986(false, local192);
						return;
					}
					if (arg0 == 6032) {
						anInt10958 -= 2;
						local192 = anIntArray590[anInt10958];
						local1578 = anIntArray590[anInt10958 + 1] == 1;
						Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
						if (!local1578) {
							Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub26_1);
						}
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6033) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub9_1);
						Static574.method8188();
						return;
					}
					if (arg0 == 6034) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : 0, Static181.aClass14_Sub26_9.aClass43_Sub5_1);
						Static574.method8188();
						Static38.method661();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static181.aClass14_Sub26_9.aClass43_Sub19_2.method5412();
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958] == 1 ? 1 : local192, Static181.aClass14_Sub26_9.aClass43_Sub19_1);
						Static535.method7899();
						Static357.method5426();
						return;
					}
					if (arg0 == 6036) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub3_1);
						Static574.method8188();
						Static178.aBoolean203 = true;
						return;
					}
					if (arg0 == 6037) {
						Static181.aClass14_Sub26_9.method5270(anIntArray590[--anInt10958], Static181.aClass14_Sub26_9.aClass43_Sub11_4);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray590[--anInt10958];
						local834 = Static181.aClass14_Sub26_9.aClass43_Sub11_2.method3829();
						if (local192 != local834 && Static184.anInt7567 == Static350.anInt6000) {
							if (!Static111.method1779(Static387.anInt9114)) {
								if (local834 == 0) {
									Static494.method7429(local192, Static341.aClass310_67, Static184.anInt7567);
									Static285.method4779();
									Static460.aBoolean599 = false;
								} else if (local192 == 0) {
									Static377.method5814();
									Static460.aBoolean599 = false;
								} else {
									Static598.method8465(local192);
								}
							}
							Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub11_2);
							Static574.method8188();
							Static411.aBoolean499 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray590[--anInt10958];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static181.aClass14_Sub26_9.aClass43_Sub6_1.method2623()) {
							Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub6_1);
							Static574.method8188();
							Static411.aBoolean499 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray590[--anInt10958];
						if (local192 != Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4215()) {
							Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub13_1);
							Static574.method8188();
							Static411.aBoolean499 = false;
							Static350.method5351();
						}
						return;
					}
					if (arg0 == 6041) {
						local192 = anIntArray590[--anInt10958];
						if (local192 != Static181.aClass14_Sub26_9.aClass43_Sub10_1.method3094()) {
							Static181.aClass14_Sub26_9.method5270(local192, Static181.aClass14_Sub26_9.aClass43_Sub10_1);
							Static574.method8188();
							Static411.aBoolean499 = false;
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub22_1.method6272();
						return;
					}
					if (arg0 == 6102) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub19_2.method5412() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub7_2.method2650() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub27_1.method7915() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub2_1.method996();
						return;
					}
					if (arg0 == 6108) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub20_1.method5523() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub12_1.method4071() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751();
						return;
					}
					if (arg0 == 6112) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub16_1.method4851() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub14_1.method4225() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub21_1.method5857() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub17_2.method4949();
						return;
					}
					if (arg0 == 6117) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub25_1.method7568() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub11_3.method3829();
						return;
					}
					if (arg0 == 6119) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829();
						return;
					}
					if (arg0 == 6120) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub11_5.method3829();
						return;
					}
					if (arg0 == 6123) {
						anIntArray590[anInt10958++] = Static632.method8880();
						return;
					}
					if (arg0 == 6124) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub17_1.method4949();
						return;
					}
					if (arg0 == 6125) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub29_1.method8277();
						return;
					}
					if (arg0 == 6127) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub23_1.method7067() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub4_1.method1830() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub2_1.method996();
						return;
					}
					if (arg0 == 6130) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub24_1.method7390() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801();
						return;
					}
					if (arg0 == 6132) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub1_2.method801();
						return;
					}
					if (arg0 == 6133) {
						anIntArray590[anInt10958++] = Static344.aClass173_5.aBoolean358 && !Static344.aClass173_5.aBoolean359 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub9_1.method3015();
						return;
					}
					if (arg0 == 6136) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub5_1.method1872() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray590[anInt10958++] = Static12.method243(200, Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801());
						return;
					}
					if (arg0 == 6139) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub3_1.method1380();
						return;
					}
					if (arg0 == 6142) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub11_4.method3829();
						return;
					}
					if (arg0 == 6143) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub11_2.method3829();
						return;
					}
					if (arg0 == 6144) {
						anIntArray590[anInt10958++] = Static84.aBoolean103 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub6_1.method2623();
						return;
					}
					if (arg0 == 6146) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4215();
						return;
					}
					if (arg0 == 6147) {
						anIntArray590[anInt10958++] = Static526.aClass14_Sub12_1.anInt1226 < 512 || Static84.aBoolean103 || Static162.aBoolean173 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray590[anInt10958++] = Static479.aBoolean587 ? 1 : 0;
						return;
					}
					if (arg0 == 6149) {
						anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub10_1.method3094();
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt10958 -= 2;
						Static626.aShort111 = (short) anIntArray590[anInt10958];
						if (Static626.aShort111 <= 0) {
							Static626.aShort111 = 256;
						}
						Static124.aShort10 = (short) anIntArray590[anInt10958 + 1];
						if (Static124.aShort10 <= 0) {
							Static124.aShort10 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt10958 -= 2;
						Static436.aShort76 = (short) anIntArray590[anInt10958];
						if (Static436.aShort76 <= 0) {
							Static436.aShort76 = 256;
						}
						Static587.aShort102 = (short) anIntArray590[anInt10958 + 1];
						if (Static587.aShort102 <= 0) {
							Static587.aShort102 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt10958 -= 4;
						Static518.aShort86 = (short) anIntArray590[anInt10958];
						if (Static518.aShort86 <= 0) {
							Static518.aShort86 = 1;
						}
						Static528.aShort87 = (short) anIntArray590[anInt10958 + 1];
						if (Static528.aShort87 <= 0) {
							Static528.aShort87 = 32767;
						} else if (Static528.aShort87 < Static518.aShort86) {
							Static528.aShort87 = Static518.aShort86;
						}
						Static462.aShort82 = (short) anIntArray590[anInt10958 + 2];
						if (Static462.aShort82 <= 0) {
							Static462.aShort82 = 1;
						}
						Static27.aShort1 = (short) anIntArray590[anInt10958 + 3];
						if (Static27.aShort1 <= 0) {
							Static27.aShort1 = 32767;
							return;
						}
						if (Static27.aShort1 < Static462.aShort82) {
							Static27.aShort1 = Static462.aShort82;
						}
						return;
					}
					if (arg0 == 6203) {
						Static194.method2930(Static76.aClass299_3.anInt8573, Static76.aClass299_3.anInt8547, 0, 0, false);
						anIntArray590[anInt10958++] = Static351.anInt11020;
						anIntArray590[anInt10958++] = Static517.anInt8884;
						return;
					}
					if (arg0 == 6204) {
						anIntArray590[anInt10958++] = Static436.aShort76;
						anIntArray590[anInt10958++] = Static587.aShort102;
						return;
					}
					if (arg0 == 6205) {
						anIntArray590[anInt10958++] = Static626.aShort111;
						anIntArray590[anInt10958++] = Static124.aShort10;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray590[anInt10958++] = (int) (Static26.method382() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray590[anInt10958++] = (int) (Static26.method382() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt10958 -= 3;
						local192 = anIntArray590[anInt10958];
						local834 = anIntArray590[anInt10958 + 1];
						local109 = anIntArray590[anInt10958 + 2];
						@Pc(7377) long local7377 = Static431.method6457(local109, local192, local834);
						local3561 = Static178.method2632(local7377);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray590[anInt10958++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray590[anInt10958++] = Static530.method7849(Static26.method382());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray590[--anInt10958];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						anIntArray590[anInt10958++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray590[--anInt10958];
						@Pc(7505) int[] local7505 = Static84.method1423(local192);
						Static691.method84(local7505, 0, anIntArray590, anInt10958, 3);
						anInt10958 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray590[--anInt10958];
						anIntArray590[anInt10958++] = (int) (Static338.method5179(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray590[anInt10958++] = Static589.method8391() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray590[anInt10958++] = Static136.method2058() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static387.anInt9114 == 7 && !Static355.method5401() && Static465.anInt7807 == 0) {
							if (Static604.aBoolean688) {
								anIntArray590[anInt10958++] = 0;
								return;
							}
							if (Static598.aLong272 > Static26.method382() - 1000L) {
								anIntArray590[anInt10958++] = 1;
								return;
							}
							Static604.aBoolean688 = true;
							@Pc(7655) Class14_Sub54 local7655 = Static72.method1195(Static277.aClass347_1.aClass197_2, Static346.aClass251_149);
							local7655.aClass14_Sub21_Sub2_2.method7730(Static408.anInt7044);
							Static277.aClass347_1.method8308(local7655);
							anIntArray590[anInt10958++] = 0;
							return;
						}
						anIntArray590[anInt10958++] = 1;
						return;
					}
					@Pc(7712) Class105 local7712;
					@Pc(7679) Class169_Sub1 local7679;
					if (arg0 == 6501) {
						local7679 = Static54.method986();
						if (local7679 != null) {
							anIntArray590[anInt10958++] = local7679.anInt4675;
							anIntArray590[anInt10958++] = local7679.anInt4662;
							aStringArray48[anInt10960++] = local7679.aString56;
							local7712 = local7679.method4088();
							anIntArray590[anInt10958++] = local7712.anInt2299;
							aStringArray48[anInt10960++] = local7712.aString31;
							anIntArray590[anInt10958++] = local7679.anInt4665;
							anIntArray590[anInt10958++] = local7679.anInt4673;
							aStringArray48[anInt10960++] = local7679.aString57;
							return;
						}
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						anIntArray590[anInt10958++] = 0;
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7679 = Static418.method6270();
						if (local7679 != null) {
							anIntArray590[anInt10958++] = local7679.anInt4675;
							anIntArray590[anInt10958++] = local7679.anInt4662;
							aStringArray48[anInt10960++] = local7679.aString56;
							local7712 = local7679.method4088();
							anIntArray590[anInt10958++] = local7712.anInt2299;
							aStringArray48[anInt10960++] = local7712.aString31;
							anIntArray590[anInt10958++] = local7679.anInt4665;
							anIntArray590[anInt10958++] = local7679.anInt4673;
							aStringArray48[anInt10960++] = local7679.aString57;
							return;
						}
						anIntArray590[anInt10958++] = -1;
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						anIntArray590[anInt10958++] = 0;
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray590[--anInt10958];
						local101 = aStringArray48[--anInt10960];
						if (Static387.anInt9114 == 7 && !Static355.method5401() && Static465.anInt7807 == 0) {
							anIntArray590[anInt10958++] = Static332.method5147(local192, local101) ? 1 : 0;
							return;
						}
						anIntArray590[anInt10958++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray590[--anInt10958];
						@Pc(8046) Class169_Sub1 local8046 = Static434.method6484(local192);
						if (local8046 != null) {
							anIntArray590[anInt10958++] = local8046.anInt4662;
							aStringArray48[anInt10960++] = local8046.aString56;
							@Pc(8070) Class105 local8070 = local8046.method4088();
							anIntArray590[anInt10958++] = local8070.anInt2299;
							aStringArray48[anInt10960++] = local8070.aString31;
							anIntArray590[anInt10958++] = local8046.anInt4665;
							anIntArray590[anInt10958++] = local8046.anInt4673;
							aStringArray48[anInt10960++] = local8046.aString57;
							return;
						}
						anIntArray590[anInt10958++] = -1;
						aStringArray48[anInt10960++] = "";
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						anIntArray590[anInt10958++] = 0;
						anIntArray590[anInt10958++] = 0;
						aStringArray48[anInt10960++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt10958 -= 4;
						local192 = anIntArray590[anInt10958];
						local1578 = anIntArray590[anInt10958 + 1] == 1;
						local109 = anIntArray590[anInt10958 + 2];
						local2331 = anIntArray590[anInt10958 + 3] == 1;
						Static170.method2465(local1578, local192, local109, local2331);
						return;
					}
					if (arg0 == 6508) {
						Static277.method4686();
						return;
					}
					if (arg0 == 6509) {
						if (Static387.anInt9114 != 7) {
							return;
						}
						Static541.aBoolean639 = anIntArray590[--anInt10958] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray590[anInt10958++] = Static528.anInt9083;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static108.aClass229_1 == Static312.aClass229_4) {
						if (arg0 == 6700) {
							local192 = Static27.aClass125_3.method2624();
							if (Static358.anInt6145 != -1) {
								local192++;
							}
							anIntArray590[anInt10958++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray590[--anInt10958];
							if (Static358.anInt6145 != -1) {
								if (local192 == 0) {
									anIntArray590[anInt10958++] = Static358.anInt6145;
									return;
								}
								local192--;
							}
							@Pc(8337) Class14_Sub13 local8337 = (Class14_Sub13) Static27.aClass125_3.method2633();
							while (local192-- > 0) {
								local8337 = (Class14_Sub13) Static27.aClass125_3.method2627();
							}
							anIntArray590[anInt10958++] = local8337.anInt1465;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray590[--anInt10958];
							if (Static339.aClass299ArrayArray1[local192] == null) {
								aStringArray48[anInt10960++] = "";
								return;
							}
							local101 = Static339.aClass299ArrayArray1[local192][0].aString94;
							if (local101 == null) {
								aStringArray48[anInt10960++] = "";
								return;
							}
							aStringArray48[anInt10960++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray590[--anInt10958];
							if (Static339.aClass299ArrayArray1[local192] == null) {
								anIntArray590[anInt10958++] = 0;
								return;
							}
							anIntArray590[anInt10958++] = Static339.aClass299ArrayArray1[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt10958 -= 2;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							if (Static339.aClass299ArrayArray1[local192] == null) {
								aStringArray48[anInt10960++] = "";
								return;
							}
							local198 = Static339.aClass299ArrayArray1[local192][local834].aString94;
							if (local198 == null) {
								aStringArray48[anInt10960++] = "";
								return;
							}
							aStringArray48[anInt10960++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt10958 -= 2;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							if (Static339.aClass299ArrayArray1[local192] == null) {
								anIntArray590[anInt10958++] = 0;
								return;
							}
							anIntArray590[anInt10958++] = Static339.aClass299ArrayArray1[local192][local834].anInt8576;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 1, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6708) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 2, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6709) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 3, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6710) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 4, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6711) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 5, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6712) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 6, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6713) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 7, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6714) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 8, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6715) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 9, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6716) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							Static77.method1251("", 10, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6717) {
							anInt10958 -= 3;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							local109 = anIntArray590[anInt10958 + 2];
							@Pc(8933) Class299 local8933 = Static384.method5875(local192 << 16 | local834, local109);
							Static214.method3269();
							@Pc(8938) Class14_Sub6 local8938 = Static80.method1360(local8933);
							Static135.method2054(local8933, local8938.anInt455, local8938.method482());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8968) Class152 local8968;
						if (arg0 == 6800) {
							local192 = anIntArray590[--anInt10958];
							local8968 = Static690.aClass274_7.method6614(local192);
							if (local8968.aString43 == null) {
								aStringArray48[anInt10960++] = "";
								return;
							}
							aStringArray48[anInt10960++] = local8968.aString43;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray590[--anInt10958];
							local8968 = Static690.aClass274_7.method6614(local192);
							anIntArray590[anInt10958++] = local8968.anInt4322;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray590[--anInt10958];
							local8968 = Static690.aClass274_7.method6614(local192);
							anIntArray590[anInt10958++] = local8968.anInt4318;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray590[--anInt10958];
							local8968 = Static690.aClass274_7.method6614(local192);
							anIntArray590[anInt10958++] = local8968.anInt4296;
							return;
						}
						if (arg0 == 6804) {
							anInt10958 -= 2;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							@Pc(9091) Class108 local9091 = Static653.aClass104_2.method2173(local834);
							if (local9091.method2205()) {
								aStringArray48[anInt10960++] = Static690.aClass274_7.method6614(local192).method3801(local9091.aString32, local834);
								return;
							}
							anIntArray590[anInt10958++] = Static690.aClass274_7.method6614(local192).method3798(local9091.anInt2348, local834);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray590[anInt10958++] = Static321.aBoolean403 && !Static586.aBoolean669 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray590[anInt10958++] = (int) (Static549.aLong58 / 60000L);
							anIntArray590[anInt10958++] = (int) ((Static549.aLong58 - Static26.method382() - Static647.aLong306) / 60000L);
							anIntArray590[anInt10958++] = Static111.aBoolean132 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray590[anInt10958++] = Static449.anInt7516;
							return;
						}
						if (arg0 == 6903) {
							anIntArray590[anInt10958++] = Static286.anInt5253;
							return;
						}
						if (arg0 == 6904) {
							anIntArray590[anInt10958++] = Static37.anInt629;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static470.aClass230_8 != null) {
								if (Static470.aClass230_8.anObject12 == null) {
									local95 = Static213.method5252(Static470.aClass230_8.anInt6254);
								} else {
									local95 = (String) Static470.aClass230_8.anObject12;
								}
							}
							aStringArray48[anInt10960++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray590[anInt10958++] = Static459.anInt10511;
							return;
						}
						if (arg0 == 6907) {
							anIntArray590[anInt10958++] = Static313.anInt5514;
							return;
						}
						if (arg0 == 6908) {
							anIntArray590[anInt10958++] = Static502.anInt8747;
							return;
						}
						if (arg0 == 6909) {
							anIntArray590[anInt10958++] = Static339.aBoolean411 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray590[anInt10958++] = Static563.anInt4929;
							return;
						}
						if (arg0 == 6911) {
							anIntArray590[anInt10958++] = Static489.anInt8467;
							return;
						}
						if (arg0 == 6912) {
							anIntArray590[anInt10958++] = Static309.anInt8730;
							return;
						}
						if (arg0 == 6913) {
							anIntArray590[anInt10958++] = Static73.anInt1202;
							return;
						}
						if (arg0 == 6914) {
							anIntArray590[anInt10958++] = Static593.aBoolean673 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray590[anInt10958++] = Static561.anInt9368;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static158.method2259();
							anIntArray590[anInt10958++] = Static102.anInt1770 = Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801();
							anIntArray590[anInt10958++] = local192;
							Static535.method7899();
							Static574.method8188();
							Static411.aBoolean499 = false;
							return;
						}
						if (arg0 == 7001) {
							Static354.method5383();
							Static535.method7899();
							Static574.method8188();
							Static411.aBoolean499 = false;
							return;
						}
						if (arg0 == 7002) {
							Static682.method9410();
							Static535.method7899();
							Static574.method8188();
							Static411.aBoolean499 = false;
							return;
						}
						if (arg0 == 7003) {
							Static285.method4778();
							Static535.method7899();
							Static574.method8188();
							Static411.aBoolean499 = false;
							return;
						}
						if (arg0 == 7004) {
							Static620.method8714();
							Static535.method7899();
							Static574.method8188();
							Static411.aBoolean499 = false;
							return;
						}
						if (arg0 == 7005) {
							Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub26_1);
							Static574.method8188();
							Static411.aBoolean499 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static102.anInt1770 == 2) {
								Static284.aBoolean386 = true;
								return;
							}
							if (Static102.anInt1770 == 1) {
								Static284.aBoolean385 = true;
								return;
							}
							if (Static102.anInt1770 == 3) {
								Static74.aBoolean73 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub26_1.method7898();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt10958 -= 2;
							local192 = anIntArray590[anInt10958];
							local834 = anIntArray590[anInt10958 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static265.method4405(local834, local192, false);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray590[--anInt10958];
							if (local192 != -1) {
								Static687.method9464(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray590[--anInt10958];
							if (local192 != -1) {
								Static213.method5246(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray590[anInt10958++] = Static327.method5103("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub27_1.method7913() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub12_1.method4069() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2754() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub14_1.method4227() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub17_1.method4950() && Static103.aClass144_3.method6973() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub28_1.method8245() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub29_1.method8278() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub23_1.method7068() && Static103.aClass144_3.method6904() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub24_1.method7393() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub5_1.method1874() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub3_1.method1383() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub21_1.method5853() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4211() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub1_2.method802() ? 1 : 0;
							return;
						}
						if (arg0 == 7215) {
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub10_1.method3096() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub27_1.method8894(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub12_1.method8894(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub8_1.method8894(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub14_1.method8894(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray590[--anInt10958];
							if (!Static103.aClass144_3.method6973()) {
								anIntArray590[anInt10958++] = 3;
								return;
							}
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub17_1.method8894(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub28_1.method8894(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub29_1.method8894(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray590[--anInt10958];
							if (!Static103.aClass144_3.method6904()) {
								anIntArray590[anInt10958++] = 3;
								return;
							}
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub23_1.method8894(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub24_1.method8894(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub5_1.method8894(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub3_1.method8894(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub21_1.method8894(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub13_1.method8894(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub1_2.method8894(local192);
							return;
						}
						if (arg0 == 7315) {
							local192 = anIntArray590[--anInt10958];
							anIntArray590[anInt10958++] = Static181.aClass14_Sub26_9.aClass43_Sub10_1.method8894(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(I)I")
	private static int method9307(@OriginalArg(0) int arg0) {
		@Pc(4) Class247 local4 = Static485.aClass264_1.method6446(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass23_2.method343(Static161.aClass80_6.anInt1861 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar6 == 'i' || local4.aChar6 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I")
	private static int method9308(@OriginalArg(0) int arg0) {
		@Pc(4) Class247 local4 = Static485.aClass264_1.method6446(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass23_2.method330(local4.anInt6989, local4.anInt6991, Static161.aClass80_6.anInt1861 << 16 | local4.anInt6990);
		return local29 == null ? 0 : local29;
	}
}
