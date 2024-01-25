import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Lclient!rp;")
	private static Class313 aClass313_1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!tn;")
	private static Class342 aClass342_2;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "[J")
	private static long[] aLongArray9;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "[I")
	private static int[] anIntArray260;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!ofa;")
	private static Class265 aClass265_6;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray30;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "Lclient!hr;")
	private static Class3_Sub26 aClass3_Sub26_3;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Lclient!ofa;")
	private static Class265 aClass265_7;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	private static int anInt4416 = 0;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "[I")
	private static final int[] anIntArray259 = new int[1000];

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "[I")
	private static final int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "[Lclient!wia;")
	private static final Class388[] aClass388Array1 = new Class388[50];

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	private static int anInt4420 = 0;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_17 = new Class295(4);

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "[J")
	private static final long[] aLongArray10 = new long[1000];

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "[[I")
	private static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
	private static int anInt4424 = 0;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "[I")
	private static final int[] anIntArray262 = new int[3];

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
	private static int anInt4427 = 0;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[1000];

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
	private static int anInt4429 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wh;)V")
	public static void method3767(@OriginalArg(0) Class3_Sub53 arg0) {
		method3774(arg0, 200000);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method3769(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static185.method2900(arg0)) {
			return;
		}
		@Pc(12) Class265[] local12 = Static270.aClass265ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class265 local19 = local12[local14];
			if (local19.anObjectArray25 != null) {
				@Pc(26) Class3_Sub53 local26 = new Class3_Sub53();
				local26.aClass265_16 = local19;
				local26.anObjectArray35 = local19.anObjectArray25;
				method3774(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	private static void method3770(@OriginalArg(0) int arg0) {
		@Pc(3) Class265 local3 = Static223.method3278(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class265[] local13 = Static78.aClass265ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class265[] local19 = Static270.aClass265ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static78.aClass265ArrayArray1[local9] = new Class265[local22];
			Static681.method4033(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static681.method4033(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method3771(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass342_2.method7738(Static227.aClass203_4.anInt5389 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)J")
	private static long method3772(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass342_2.method7742(Static227.aClass203_4.anInt5389 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)I")
	private static int method3773(@OriginalArg(0) int arg0) {
		@Pc(4) Class120 local4 = Static286.aClass319_1.method6997(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass342_2.method7731(local4.anInt3368, local4.anInt3369, Static227.aClass203_4.anInt5389 << 16 | local4.anInt3372);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wh;I)V")
	private static void method3774(@OriginalArg(0) Class3_Sub53 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub5_Sub14 local12 = Static320.method4597(local8);
		if (local12 == null) {
			return;
		}
		anIntArray260 = new int[local12.anInt6494];
		@Pc(21) int local21 = 0;
		aStringArray30 = new String[local12.anInt6490];
		@Pc(27) int local27 = 0;
		aLongArray9 = new long[local12.anInt6493];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt10769;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt10767;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass265_16 == null ? -1 : arg0.aClass265_16.anInt7032;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt10766;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass265_16 == null ? -1 : arg0.aClass265_16.anInt7004;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass265_15 == null ? -1 : arg0.aClass265_15.anInt7032;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass265_15 == null ? -1 : arg0.aClass265_15.anInt7004;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt10770;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt10773;
				}
				anIntArray260[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString118;
				}
				aStringArray30[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray9[local33++] = local165;
			}
		}
		anInt4429 = arg0.anInt10771;
		method3775(local12, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!nba;I)V")
	private static void method3775(@OriginalArg(0) Class3_Sub5_Sub14 arg0, @OriginalArg(1) int arg1) {
		anInt4427 = 0;
		anInt4424 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray344;
		@Pc(11) int[] local11 = arg0.anIntArray343;
		@Pc(13) byte local13 = -1;
		anInt4416 = 0;
		@Pc(639) int local639;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 150) {
					@Pc(1134) boolean local1134;
					if (local11[local5] == 1) {
						local1134 = true;
					} else {
						local1134 = false;
					}
					if (local31 >= 150 && local31 < 5000) {
						method3778(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3777(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray259[anInt4427++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray259[anInt4427++] = Static210.aClass262_1.anIntArray368[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static210.aClass262_1.method5782(anIntArray259[--anInt4427], local54);
					} else if (local31 == 3) {
						aStringArray31[anInt4424++] = arg0.aStringArray46[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4427 -= 2;
						if (anIntArray259[anInt4427] != anIntArray259[anInt4427 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4427 -= 2;
						if (anIntArray259[anInt4427] == anIntArray259[anInt4427 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4427 -= 2;
						if (anIntArray259[anInt4427] < anIntArray259[anInt4427 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4427 -= 2;
						if (anIntArray259[anInt4427] > anIntArray259[anInt4427 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4416 == 0) {
							return;
						}
						@Pc(216) Class388 local216 = aClass388Array1[--anInt4416];
						arg0 = local216.aClass3_Sub5_Sub14_1;
						local8 = arg0.anIntArray344;
						local11 = arg0.anIntArray343;
						local5 = local216.anInt10798;
						anIntArray260 = local216.anIntArray617;
						aStringArray30 = local216.aStringArray68;
						aLongArray9 = local216.aLongArray22;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray259[anInt4427++] = Static210.aClass262_1.method5777(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static210.aClass262_1.method5783(local54, anIntArray259[--anInt4427]);
					} else if (local31 == 31) {
						anInt4427 -= 2;
						if (anIntArray259[anInt4427] <= anIntArray259[anInt4427 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4427 -= 2;
						if (anIntArray259[anInt4427] >= anIntArray259[anInt4427 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray259[anInt4427++] = anIntArray260[local11[local5]];
					} else if (local31 == 34) {
						anIntArray260[local11[local5]] = anIntArray259[--anInt4427];
					} else if (local31 == 35) {
						aStringArray31[anInt4424++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						aStringArray30[local11[local5]] = aStringArray31[--anInt4424];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4424 -= local54;
						@Pc(403) String local403 = Static397.method7854(aStringArray31, anInt4424, local54);
						aStringArray31[anInt4424++] = local403;
					} else if (local31 == 38) {
						anInt4427--;
					} else if (local31 == 39) {
						anInt4424--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class3_Sub5_Sub14 local439 = Static320.method4597(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt6494];
						@Pc(453) String[] local453 = new String[local439.anInt6490];
						@Pc(457) long[] local457 = new long[local439.anInt6493];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt6498; local459++) {
							local449[local459] = anIntArray259[anInt4427 + local459 - local439.anInt6498];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt6496; local478++) {
							local453[local478] = aStringArray31[anInt4424 + local478 - local439.anInt6496];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt6491; local497++) {
							local457[local497] = aLongArray10[anInt4420 + local497 - local439.anInt6491];
						}
						anInt4427 -= local439.anInt6498;
						anInt4424 -= local439.anInt6496;
						anInt4420 -= local439.anInt6491;
						@Pc(533) Class388 local533 = new Class388();
						local533.aClass3_Sub5_Sub14_1 = arg0;
						local533.anInt10798 = local5;
						local533.anIntArray617 = anIntArray260;
						local533.aStringArray68 = aStringArray30;
						local533.aLongArray22 = aLongArray9;
						if (anInt4416 >= aClass388Array1.length) {
							throw new RuntimeException();
						}
						aClass388Array1[anInt4416++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray344;
						local11 = local439.anIntArray343;
						local5 = -1;
						anIntArray260 = local449;
						aStringArray30 = local453;
						aLongArray9 = local457;
					} else if (local31 == 42) {
						anIntArray259[anInt4427++] = Static484.anIntArray417[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static484.anIntArray417[local54] = anIntArray259[--anInt4427];
						Static285.method4141(local54);
						Static24.aBoolean32 |= Static373.aBooleanArray21[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray259[--anInt4427];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray261[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray30[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray259[--anInt4427];
						if (local639 < 0 || local639 >= anIntArray261[local54]) {
							throw new RuntimeException();
						}
						anIntArray259[anInt4427++] = anIntArrayArray30[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt4427 -= 2;
						local639 = anIntArray259[anInt4427];
						if (local639 < 0 || local639 >= anIntArray261[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray30[local54][local639] = anIntArray259[anInt4427 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static364.aStringArray42[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray31[anInt4424++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static364.aStringArray42[local54] = aStringArray31[--anInt4424];
						Static44.method790(local54);
					} else if (local31 == 51) {
						@Pc(810) Class333 local810 = arg0.aClass333Array1[local11[local5]];
						@Pc(823) Class3_Sub24 local823 = (Class3_Sub24) local810.method7489((long) anIntArray259[--anInt4427]);
						if (local823 != null) {
							local5 += local823.anInt3846;
						}
					} else if (local31 == 54) {
						aLongArray10[anInt4420++] = arg0.aLongArray13[local5];
					} else if (local31 == 55) {
						anInt4420--;
					} else if (local31 == 66) {
						aLongArray10[anInt4420++] = aLongArray9[local11[local5]];
					} else if (local31 == 67) {
						aLongArray9[local11[local5]] = aLongArray10[--anInt4420];
					} else if (local31 == 68) {
						anInt4420 -= 2;
						if (aLongArray10[anInt4420] != aLongArray10[anInt4420 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt4420 -= 2;
						if (aLongArray10[anInt4420] == aLongArray10[anInt4420 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt4420 -= 2;
						if (aLongArray10[anInt4420] < aLongArray10[anInt4420 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt4420 -= 2;
						if (aLongArray10[anInt4420] > aLongArray10[anInt4420 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt4420 -= 2;
						if (aLongArray10[anInt4420] <= aLongArray10[anInt4420 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt4420 -= 2;
						if (aLongArray10[anInt4420] >= aLongArray10[anInt4420 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray259[--anInt4427] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray259[--anInt4427] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray259[anInt4427++] = method3782(local11[local5]);
					} else if (local31 == 113) {
						anIntArray259[anInt4427++] = method3773(local11[local5]);
					} else if (local31 == 114) {
						aLongArray10[anInt4420++] = method3772(local11[local5]);
					} else if (local31 == 115) {
						aStringArray31[anInt4424++] = method3771(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString82 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong313).append(" ");
				for (local639 = anInt4416 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass388Array1[local639].aClass3_Sub5_Sub14_1.aLong313).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static456.method6140(local1188.toString(), local1169);
			} else {
				Static342.method4988("Clientscript error in: " + arg0.aString82);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString82).append("\n");
				for (local639 = anInt4416 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass388Array1[local639].aClass3_Sub5_Sub14_1.aString82).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static456.method6140(local1188.toString(), local1169);
				Static85.method1345(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!tq;II)V")
	public static void method3776(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub5_Sub14 local5 = Static145.method2353(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray260 = new int[local5.anInt6494];
		aStringArray30 = new String[local5.anInt6490];
		if (local5.aClass343_6 == Static459.aClass343_8 || local5.aClass343_6 == Static304.aClass343_4 || local5.aClass343_6 == Static375.aClass343_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static118.aClass265_13 != null) {
				local30 = Static118.aClass265_13.anInt6993;
				local32 = Static118.aClass265_13.anInt6968;
			}
			anIntArray260[0] = Static627.aClass48_1.method7512() - local30;
			anIntArray260[1] = Static627.aClass48_1.method7511() - local32;
		}
		method3775(local5, 200000);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
	private static void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class3_Sub37 local52;
		@Pc(776) int local776;
		@Pc(97) int local97;
		@Pc(83) String local83;
		@Pc(175) int local175;
		@Pc(1496) boolean local1496;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray259[anInt4427++] = Static209.anInt3642;
				return;
			}
			if (arg0 == 5001) {
				anInt4427 -= 3;
				Static209.anInt3642 = anIntArray259[anInt4427];
				Static335.aClass70_3 = Static407.method5606(anIntArray259[anInt4427 + 1]);
				if (Static335.aClass70_3 == null) {
					Static335.aClass70_3 = Static238.aClass70_4;
				}
				Static223.anInt3850 = anIntArray259[anInt4427 + 2];
				local52 = Static90.method1509(Static49.aClass240_19, Static226.aClass144_2);
				local52.aClass3_Sub4_Sub1_2.method7948(Static209.anInt3642);
				local52.aClass3_Sub4_Sub1_2.method7948(Static335.aClass70_3.anInt1944);
				local52.aClass3_Sub4_Sub1_2.method7948(Static223.anInt3850);
				Static301.method2678(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt4424 -= 2;
				local83 = aStringArray31[anInt4424];
				local89 = aStringArray31[anInt4424 + 1];
				anInt4427 -= 2;
				local97 = anIntArray259[anInt4427];
				local103 = anIntArray259[anInt4427 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub37 local125 = Static90.method1509(Static35.aClass240_13, Static226.aClass144_2);
				local125.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(local83) + Static345.method5022(local89) + 2);
				local125.aClass3_Sub4_Sub1_2.method7901(local83);
				local125.aClass3_Sub4_Sub1_2.method7948(local97 - 1);
				local125.aClass3_Sub4_Sub1_2.method7948(local103);
				local125.aClass3_Sub4_Sub1_2.method7901(local89);
				Static301.method2678(local125);
				return;
			}
			@Pc(179) Class2 local179;
			if (arg0 == 5003) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local181 = "";
				if (local179 != null && local179.aString4 != null) {
					local181 = local179.aString4;
				}
				aStringArray31[anInt4424++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt12;
				}
				anIntArray259[anInt4427++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static335.aClass70_3 == null) {
					anIntArray259[anInt4427++] = -1;
					return;
				}
				anIntArray259[anInt4427++] = Static335.aClass70_3.anInt1944;
				return;
			}
			@Pc(269) Class3_Sub37 local269;
			if (arg0 == 5006) {
				local175 = anIntArray259[--anInt4427];
				local269 = Static90.method1509(Static101.aClass240_24, Static226.aClass144_2);
				local269.aClass3_Sub4_Sub1_2.method7948(local175);
				Static301.method2678(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray31[--anInt4424];
				method3783(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4424 -= 2;
				local83 = aStringArray31[anInt4424];
				local89 = aStringArray31[anInt4424 + 1];
				if (Static512.anInt8070 != 0 || (!Static511.aBoolean563 || Static14.aBoolean14) && !Static656.aBoolean736) {
					@Pc(328) Class3_Sub37 local328 = Static90.method1509(Static285.aClass240_48, Static226.aClass144_2);
					local328.aClass3_Sub4_Sub1_2.method7948(0);
					local103 = local328.aClass3_Sub4_Sub1_2.anInt9739;
					local328.aClass3_Sub4_Sub1_2.method7901(local83);
					Static332.method4726(local89, local328.aClass3_Sub4_Sub1_2);
					local328.aClass3_Sub4_Sub1_2.method7949(local328.aClass3_Sub4_Sub1_2.anInt9739 - local103);
					Static301.method2678(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local181 = "";
				if (local179 != null && local179.aString3 != null) {
					local181 = local179.aString3;
				}
				aStringArray31[anInt4424++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local181 = "";
				if (local179 != null && local179.aString5 != null) {
					local181 = local179.aString5;
				}
				aStringArray31[anInt4424++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9;
				}
				anIntArray259[anInt4427++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == null || Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString24 == null) {
					local83 = "";
				} else {
					local83 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method1482();
				}
				aStringArray31[anInt4424++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray259[anInt4427++] = Static223.anInt3850;
				return;
			}
			if (arg0 == 5017) {
				anIntArray259[anInt4427++] = Static358.method5173();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt10;
				}
				anIntArray259[anInt4427++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local181 = "";
				if (local179 != null && local179.aString1 != null) {
					local181 = local179.aString1;
				}
				aStringArray31[anInt4424++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == null || Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString24 == null) {
					local83 = "";
				} else {
					local83 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method1485();
				}
				aStringArray31[anInt4424++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt11;
				}
				anIntArray259[anInt4427++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt13;
				}
				anIntArray259[anInt4427++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray259[--anInt4427];
				local179 = Static224.method3291(local175);
				local181 = "";
				if (local179 != null && local179.aString2 != null) {
					local181 = local179.aString2;
				}
				aStringArray31[anInt4424++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray259[--anInt4427];
				aStringArray31[anInt4424++] = Static107.aClass116_1.method2749(local175).aString72;
				return;
			}
			@Pc(736) Class3_Sub5_Sub12 local736;
			if (arg0 == 5051) {
				local175 = anIntArray259[--anInt4427];
				local736 = Static107.aClass116_1.method2749(local175);
				if (local736.anIntArray309 == null) {
					anIntArray259[anInt4427++] = 0;
					return;
				}
				anIntArray259[anInt4427++] = local736.anIntArray309.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				@Pc(781) Class3_Sub5_Sub12 local781 = Static107.aClass116_1.method2749(local175);
				local103 = local781.anIntArray309[local776];
				anIntArray259[anInt4427++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray259[--anInt4427];
				local736 = Static107.aClass116_1.method2749(local175);
				if (local736.anIntArray308 == null) {
					anIntArray259[anInt4427++] = 0;
					return;
				}
				anIntArray259[anInt4427++] = local736.anIntArray308.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				anIntArray259[anInt4427++] = Static107.aClass116_1.method2749(local175).anIntArray308[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray259[--anInt4427];
				aStringArray31[anInt4424++] = Static116.aClass284_1.method6224(local175).method6751();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray259[--anInt4427];
				@Pc(907) Class3_Sub5_Sub16 local907 = Static116.aClass284_1.method6224(local175);
				if (local907.anIntArray435 == null) {
					anIntArray259[anInt4427++] = 0;
					return;
				}
				anIntArray259[anInt4427++] = local907.anIntArray435.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				anIntArray259[anInt4427++] = Static116.aClass284_1.method6224(local175).anIntArray435[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass313_1 = new Class313();
				aClass313_1.anInt8328 = anIntArray259[--anInt4427];
				aClass313_1.aClass3_Sub5_Sub16_1 = Static116.aClass284_1.method6224(aClass313_1.anInt8328);
				aClass313_1.anIntArray444 = new int[aClass313_1.aClass3_Sub5_Sub16_1.method6744()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static90.method1509(Static460.aClass240_77, Static226.aClass144_2);
				local52.aClass3_Sub4_Sub1_2.method7948(0);
				local776 = local52.aClass3_Sub4_Sub1_2.anInt9739;
				local52.aClass3_Sub4_Sub1_2.method7948(0);
				local52.aClass3_Sub4_Sub1_2.method7956(aClass313_1.anInt8328);
				aClass313_1.aClass3_Sub5_Sub16_1.method6749(aClass313_1.anIntArray444, local52.aClass3_Sub4_Sub1_2);
				local52.aClass3_Sub4_Sub1_2.method7949(local52.aClass3_Sub4_Sub1_2.anInt9739 - local776);
				Static301.method2678(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray31[--anInt4424];
				local269 = Static90.method1509(Static557.aClass240_97, Static226.aClass144_2);
				local269.aClass3_Sub4_Sub1_2.method7948(0);
				local97 = local269.aClass3_Sub4_Sub1_2.anInt9739;
				local269.aClass3_Sub4_Sub1_2.method7901(local83);
				local269.aClass3_Sub4_Sub1_2.method7956(aClass313_1.anInt8328);
				aClass313_1.aClass3_Sub5_Sub16_1.method6749(aClass313_1.anIntArray444, local269.aClass3_Sub4_Sub1_2);
				local269.aClass3_Sub4_Sub1_2.method7949(local269.aClass3_Sub4_Sub1_2.anInt9739 - local97);
				Static301.method2678(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static90.method1509(Static460.aClass240_77, Static226.aClass144_2);
				local52.aClass3_Sub4_Sub1_2.method7948(0);
				local776 = local52.aClass3_Sub4_Sub1_2.anInt9739;
				local52.aClass3_Sub4_Sub1_2.method7948(1);
				local52.aClass3_Sub4_Sub1_2.method7956(aClass313_1.anInt8328);
				aClass313_1.aClass3_Sub5_Sub16_1.method6749(aClass313_1.anIntArray444, local52.aClass3_Sub4_Sub1_2);
				local52.aClass3_Sub4_Sub1_2.method7949(local52.aClass3_Sub4_Sub1_2.anInt9739 - local776);
				Static301.method2678(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				anIntArray259[anInt4427++] = Static107.aClass116_1.method2749(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				anIntArray259[anInt4427++] = Static107.aClass116_1.method2749(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				if (local776 == -1) {
					anIntArray259[anInt4427++] = -1;
					return;
				}
				anIntArray259[anInt4427++] = Static107.aClass116_1.method2749(local175).method4703((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				if (local776 == -1) {
					anIntArray259[anInt4427++] = -1;
					return;
				}
				anIntArray259[anInt4427++] = Static107.aClass116_1.method2749(local175).method4698((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray259[--anInt4427];
				anIntArray259[anInt4427++] = Static116.aClass284_1.method6224(local175).method6744();
				return;
			}
			if (arg0 == 5067) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				local97 = Static116.aClass284_1.method6224(local175).method6754(local776).anInt2270;
				anIntArray259[anInt4427++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				aClass313_1.anIntArray444[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt4427 -= 2;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				aClass313_1.anIntArray444[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt4427 -= 3;
				local175 = anIntArray259[anInt4427];
				local776 = anIntArray259[anInt4427 + 1];
				local97 = anIntArray259[anInt4427 + 2];
				@Pc(1448) Class3_Sub5_Sub16 local1448 = Static116.aClass284_1.method6224(local175);
				if (local1448.method6754(local776).anInt2270 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray259[anInt4427++] = local1448.method6753(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray31[--anInt4424];
				local1496 = anIntArray259[--anInt4427] == 1;
				Static241.method3663(local1496, local83);
				anIntArray259[anInt4427++] = Static41.anInt867;
				return;
			}
			if (arg0 == 5072) {
				if (Static413.aShortArray74 != null && Static553.anInt8951 < Static41.anInt867) {
					anIntArray259[anInt4427++] = Static413.aShortArray74[Static553.anInt8951++] & 0xFFFF;
					return;
				}
				anIntArray259[anInt4427++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static553.anInt8951 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static90.method1509(Static460.aClass240_77, Static226.aClass144_2);
				local52.aClass3_Sub4_Sub1_2.method7948(0);
				local776 = local52.aClass3_Sub4_Sub1_2.anInt9739;
				local52.aClass3_Sub4_Sub1_2.method7948(2);
				local52.aClass3_Sub4_Sub1_2.method7956(aClass313_1.anInt8328);
				aClass313_1.aClass3_Sub5_Sub16_1.method6749(aClass313_1.anIntArray444, local52.aClass3_Sub4_Sub1_2);
				local52.aClass3_Sub4_Sub1_2.method7949(local52.aClass3_Sub4_Sub1_2.anInt9739 - local776);
				Static301.method2678(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static90.method1509(Static460.aClass240_77, Static226.aClass144_2);
				local52.aClass3_Sub4_Sub1_2.method7948(0);
				local776 = local52.aClass3_Sub4_Sub1_2.anInt9739;
				local52.aClass3_Sub4_Sub1_2.method7948(3);
				local52.aClass3_Sub4_Sub1_2.method7956(aClass313_1.anInt8328);
				aClass313_1.aClass3_Sub5_Sub16_1.method6749(aClass313_1.anIntArray444, local52.aClass3_Sub4_Sub1_2);
				local52.aClass3_Sub4_Sub1_2.method7949(local52.aClass3_Sub4_Sub1_2.anInt9739 - local776);
				Static301.method2678(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static413.aClass154_1.method5014(86)) {
					anIntArray259[anInt4427++] = 1;
					return;
				}
				anIntArray259[anInt4427++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static413.aClass154_1.method5014(82)) {
					anIntArray259[anInt4427++] = 1;
					return;
				}
				anIntArray259[anInt4427++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static413.aClass154_1.method5014(81)) {
					anIntArray259[anInt4427++] = 1;
					return;
				}
				anIntArray259[anInt4427++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static262.method3912(anIntArray259[--anInt4427]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray259[anInt4427++] = Static430.method5940();
					return;
				}
				if (arg0 == 5205) {
					Static117.method1799(-1, anIntArray259[--anInt4427], false, -1);
					return;
				}
				@Pc(1794) Class3_Sub5_Sub4 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static671.method7626(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = local1794.anInt1308;
					return;
				}
				@Pc(1827) Class3_Sub5_Sub4 local1827;
				if (arg0 == 5207) {
					local1827 = Static671.method7619(anIntArray259[--anInt4427]);
					if (local1827 != null && local1827.aString20 != null) {
						aStringArray31[anInt4424++] = local1827.aString20;
						return;
					}
					aStringArray31[anInt4424++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray259[anInt4427++] = Static377.anInt7878;
					anIntArray259[anInt4427++] = Static127.anInt2265;
					return;
				}
				if (arg0 == 5209) {
					anIntArray259[anInt4427++] = Static81.anInt10273 + Static671.anInt9357;
					anIntArray259[anInt4427++] = Static594.anInt9606 + Static671.anInt9358;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static671.method7619(local175);
					if (local1794 == null) {
						anIntArray259[anInt4427++] = 0;
						anIntArray259[anInt4427++] = 0;
						return;
					}
					anIntArray259[anInt4427++] = local1794.anInt1301 >> 14 & 0x3FFF;
					anIntArray259[anInt4427++] = local1794.anInt1301 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static671.method7619(local175);
					if (local1794 == null) {
						anIntArray259[anInt4427++] = 0;
						anIntArray259[anInt4427++] = 0;
						return;
					}
					anIntArray259[anInt4427++] = local1794.anInt1318 - local1794.anInt1312;
					anIntArray259[anInt4427++] = local1794.anInt1309 - local1794.anInt1305;
					return;
				}
				@Pc(2017) Class3_Sub46 local2017;
				if (arg0 == 5212) {
					local2017 = Static253.method3816();
					if (local2017 == null) {
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = local2017.anInt9112;
					local776 = local2017.anInt9114 << 28 | local2017.anInt9116 + Static671.anInt9357 << 14 | local2017.anInt9118 + Static671.anInt9358;
					anIntArray259[anInt4427++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static230.method3489();
					if (local2017 == null) {
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = local2017.anInt9112;
					local776 = local2017.anInt9114 << 28 | local2017.anInt9116 + Static671.anInt9357 << 14 | local2017.anInt9118 + Static671.anInt9358;
					anIntArray259[anInt4427++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static420.method5784();
					if (local1794 != null) {
						local2165 = local1794.method1153(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray262, local175 >> 28 & 0x3);
						if (local2165) {
							Static473.method6298(anIntArray262[1], anIntArray262[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local776 = anIntArray259[anInt4427 + 1];
					@Pc(2203) Class243 local2203 = Static671.method7627(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class3_Sub5_Sub4 local2210 = (Class3_Sub5_Sub4) local2203.method5459(); local2210 != null; local2210 = (Class3_Sub5_Sub4) local2203.method5453()) {
						if (local2210.anInt1308 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray259[anInt4427++] = 1;
						return;
					}
					anIntArray259[anInt4427++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static671.method7619(local175);
					if (local1794 == null) {
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = local1794.anInt1310;
					return;
				}
				if (arg0 == 5220) {
					anIntArray259[anInt4427++] = Static306.anInt5140 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray259[--anInt4427];
					Static473.method6298(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static420.method5784();
					if (local1827 != null) {
						local1496 = local1827.method1152(Static81.anInt10273 + Static671.anInt9357, anIntArray262, Static594.anInt9606 + Static671.anInt9358);
						if (local1496) {
							anIntArray259[anInt4427++] = anIntArray262[1];
							anIntArray259[anInt4427++] = anIntArray262[2];
							return;
						}
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = -1;
					anIntArray259[anInt4427++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local776 = anIntArray259[anInt4427 + 1];
					Static117.method1799(local776 >> 14 & 0x3FFF, local175, false, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static420.method5784();
					if (local1794 != null) {
						local2165 = local1794.method1153(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray262, local175 >> 28 & 0x3);
						if (local2165) {
							anIntArray259[anInt4427++] = anIntArray262[1];
							anIntArray259[anInt4427++] = anIntArray262[2];
							return;
						}
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = -1;
					anIntArray259[anInt4427++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray259[--anInt4427];
					local1794 = Static420.method5784();
					if (local1794 != null) {
						local2165 = local1794.method1152(local175 >> 14 & 0x3FFF, anIntArray262, local175 & 0x3FFF);
						if (local2165) {
							anIntArray259[anInt4427++] = anIntArray262[1];
							anIntArray259[anInt4427++] = anIntArray262[2];
							return;
						}
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = -1;
					anIntArray259[anInt4427++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static625.method8446(anIntArray259[--anInt4427]);
					return;
				}
				if (arg0 == 5227) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local776 = anIntArray259[anInt4427 + 1];
					Static117.method1799(local776 >> 14 & 0x3FFF, local175, true, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static359.aBoolean426 = anIntArray259[--anInt4427] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray259[anInt4427++] = Static359.aBoolean426 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray259[--anInt4427];
					Static219.method3249(local175);
					return;
				}
				@Pc(2723) Class3 local2723;
				if (arg0 == 5231) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local1496 = anIntArray259[anInt4427 + 1] == 1;
					if (Static617.aClass333_23 != null) {
						local2723 = Static617.aClass333_23.method7489((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9034();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class3();
							Static617.aClass333_23.method7488((long) local175, local2723);
						}
					}
					return;
				}
				@Pc(2765) Class3 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray259[--anInt4427];
					if (Static617.aClass333_23 != null) {
						local2765 = Static617.aClass333_23.method7489((long) local175);
						anIntArray259[anInt4427++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray259[anInt4427++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local1496 = anIntArray259[anInt4427 + 1] == 1;
					if (Static163.aClass333_13 != null) {
						local2723 = Static163.aClass333_13.method7489((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9034();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class3();
							Static163.aClass333_13.method7488((long) local175, local2723);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray259[--anInt4427];
					if (Static163.aClass333_13 != null) {
						local2765 = Static163.aClass333_13.method7489((long) local175);
						anIntArray259[anInt4427++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray259[anInt4427++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray259[anInt4427++] = Static671.aClass3_Sub5_Sub4_3 == null ? -1 : Static671.aClass3_Sub5_Sub4_3.anInt1308;
					return;
				}
				if (arg0 == 5236) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local776 = anIntArray259[anInt4427 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static384.method5388(local103, local175, local97);
					if (local2931 < 0) {
						anIntArray259[anInt4427++] = -1;
						return;
					}
					anIntArray259[anInt4427++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static232.method3503();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4427 -= 2;
					local175 = anIntArray259[anInt4427];
					local776 = anIntArray259[anInt4427 + 1];
					Static551.method7076(false, 3, local776, local175);
					anIntArray259[anInt4427++] = Static438.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static438.aFrame1 != null) {
						Static551.method7076(false, Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class304[] local3017 = Static613.method8317();
					anIntArray259[anInt4427++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray259[--anInt4427];
					@Pc(3041) Class304[] local3041 = Static613.method8317();
					anIntArray259[anInt4427++] = local3041[local175].anInt8105;
					anIntArray259[anInt4427++] = local3041[local175].anInt8107;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static320.anInt5361;
					local776 = Static463.anInt7388;
					local97 = -1;
					@Pc(3076) Class304[] local3076 = Static613.method8317();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class304 local3083 = local3076[local2931];
						if (local3083.anInt8105 == local175 && local3083.anInt8107 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray259[anInt4427++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray259[anInt4427++] = Static241.method3664();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray259[--anInt4427];
					if (local175 >= 1 && local175 <= 2) {
						Static551.method7076(false, local175, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray259[--anInt4427];
					if (local175 >= 1 && local175 <= 2) {
						Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub13_2);
						Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub13_1);
						Static219.method3247();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt4424 -= 2;
						local83 = aStringArray31[anInt4424];
						local89 = aStringArray31[anInt4424 + 1];
						local97 = anIntArray259[--anInt4427];
						@Pc(3231) Class3_Sub37 local3231 = Static90.method1509(Static447.aClass240_76, Static226.aClass144_2);
						local3231.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(local83) + Static345.method5022(local89) + 1);
						local3231.aClass3_Sub4_Sub1_2.method7901(local83);
						local3231.aClass3_Sub4_Sub1_2.method7901(local89);
						local3231.aClass3_Sub4_Sub1_2.method7948(local97);
						Static301.method2678(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt4427 -= 2;
						Static385.aShortArray73[anIntArray259[anInt4427]] = (short) Static594.method7829(anIntArray259[anInt4427 + 1]);
						Static117.aClass197_2.method4526();
						Static117.aClass197_2.method4528();
						Static267.aClass196_1.method4475();
						Static184.method2885();
						return;
					}
					if (arg0 == 5405) {
						anInt4427 -= 2;
						local175 = anIntArray259[anInt4427];
						local776 = anIntArray259[anInt4427 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static324.anIntArrayArrayArray10[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt4427 -= 7;
						local175 = anIntArray259[anInt4427];
						local776 = anIntArray259[anInt4427 + 1] << 1;
						local97 = anIntArray259[anInt4427 + 2];
						local103 = anIntArray259[anInt4427 + 3];
						local2931 = anIntArray259[anInt4427 + 4];
						local3369 = anIntArray259[anInt4427 + 5];
						@Pc(3375) int local3375 = anIntArray259[anInt4427 + 6];
						if (local175 >= 0 && local175 < 2 && Static324.anIntArrayArrayArray10[local175] != null && local776 >= 0 && local776 < Static324.anIntArrayArrayArray10[local175].length) {
							Static324.anIntArrayArrayArray10[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static324.anIntArrayArrayArray10[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static324.anIntArrayArrayArray10[anIntArray259[--anInt4427]].length >> 1;
						anIntArray259[anInt4427++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static438.aFrame1 != null) {
							Static551.method7076(false, Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, -1);
						}
						if (Static572.aFrame2 != null) {
							Static5.method85();
							System.exit(0);
							return;
						}
						local83 = Static304.aString65 == null ? Static285.method4145() : Static304.aString65;
						Static473.method6299(Static566.aClass92_6, local83, false, Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 1);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static633.aClass338_15 != null) {
							if (Static633.aClass338_15.anObject18 == null) {
								local83 = Static195.method3010(Static633.aClass338_15.anInt9319);
							} else {
								local83 = (String) Static633.aClass338_15.anObject18;
							}
						}
						aStringArray31[anInt4424++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray259[anInt4427++] = Static566.aClass92_6.aBoolean172 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static438.aFrame1 != null) {
							Static551.method7076(false, Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, -1);
						}
						local83 = aStringArray31[--anInt4424];
						local1496 = anIntArray259[--anInt4427] == 1;
						local181 = Static285.method4145() + local83;
						Static473.method6299(Static566.aClass92_6, local181, local1496, Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt4424 -= 2;
						local83 = aStringArray31[anInt4424];
						local89 = aStringArray31[anInt4424 + 1];
						local97 = anIntArray259[--anInt4427];
						if (local83.length() > 0) {
							if (Static439.aStringArray53 == null) {
								Static439.aStringArray53 = new String[Static197.anIntArray185[Static227.aClass203_4.anInt5389]];
							}
							Static439.aStringArray53[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static381.aStringArray44 == null) {
								Static381.aStringArray44 = new String[Static197.anIntArray185[Static227.aClass203_4.anInt5389]];
							}
							Static381.aStringArray44[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray31[--anInt4424]);
						return;
					}
					if (arg0 == 5424) {
						anInt4427 -= 11;
						Static666.anInt10802 = anIntArray259[anInt4427];
						Static176.anInt3210 = anIntArray259[anInt4427 + 1];
						Static465.anInt7408 = anIntArray259[anInt4427 + 2];
						Static278.anInt4731 = anIntArray259[anInt4427 + 3];
						Static54.anInt1152 = anIntArray259[anInt4427 + 4];
						Static622.anInt10291 = anIntArray259[anInt4427 + 5];
						Static63.anInt1304 = anIntArray259[anInt4427 + 6];
						Static90.anInt1844 = anIntArray259[anInt4427 + 7];
						Static286.anInt4851 = anIntArray259[anInt4427 + 8];
						Static468.anInt7423 = anIntArray259[anInt4427 + 9];
						Static147.anInt2708 = anIntArray259[anInt4427 + 10];
						Static142.aClass362_32.method8365(Static54.anInt1152);
						Static142.aClass362_32.method8365(Static622.anInt10291);
						Static142.aClass362_32.method8365(Static63.anInt1304);
						Static142.aClass362_32.method8365(Static90.anInt1844);
						Static142.aClass362_32.method8365(Static286.anInt4851);
						Static50.aClass6_3 = null;
						Static212.aClass6_13 = null;
						Static534.aClass6_34 = null;
						Static333.aClass6_17 = null;
						Static669.aClass6_38 = null;
						Static197.aClass6_12 = null;
						Static6.aClass6_1 = null;
						Static161.aClass6_15 = null;
						Static653.aBoolean735 = true;
						return;
					}
					if (arg0 == 5425) {
						Static220.method3262();
						Static653.aBoolean735 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt4427 -= 2;
						Static452.anInt7275 = anIntArray259[anInt4427];
						Static677.anInt10939 = anIntArray259[anInt4427 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt4427 -= 2;
						Static271.anInt4679 = anIntArray259[anInt4427 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt4427 -= 2;
						local175 = anIntArray259[anInt4427];
						local776 = anIntArray259[anInt4427 + 1];
						anIntArray259[anInt4427++] = Static163.method2600(local175, local776) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static367.method9035(false, false, aStringArray31[--anInt4424]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static680.method795(Static339.anApplet2, "accountcreated");
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static680.method795(Static339.anApplet2, "accountcreatestarted");
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static390.aClipboard1 != null) {
							@Pc(3940) Transferable local3940 = Static390.aClipboard1.getContents((Object) null);
							if (local3940 != null) {
								try {
									local83 = (String) local3940.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3953) Exception local3953) {
								}
							}
						}
						aStringArray31[anInt4424++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static167.anInt3059 = anIntArray259[--anInt4427];
						return;
					}
					if (arg0 == 5435) {
						anIntArray259[anInt4427++] = Static158.aBoolean218 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt4427 -= 4;
						local175 = anIntArray259[anInt4427];
						local776 = anIntArray259[anInt4427 + 1];
						local97 = anIntArray259[anInt4427 + 2];
						local103 = anIntArray259[anInt4427 + 3];
						Static225.method3319(local103, local776 << 2, (local175 >> 14 & 0x3FFF) - Static534.anInt8358, false, (local175 & 0x3FFF) - Static402.anInt6661, local97);
						return;
					}
					if (arg0 == 5501) {
						anInt4427 -= 4;
						local175 = anIntArray259[anInt4427];
						local776 = anIntArray259[anInt4427 + 1];
						local97 = anIntArray259[anInt4427 + 2];
						local103 = anIntArray259[anInt4427 + 3];
						Static651.method8744(local97, local776 << 2, (local175 & 0x3FFF) - Static402.anInt6661, (local175 >> 14 & 0x3FFF) - Static534.anInt8358, local103);
						return;
					}
					if (arg0 == 5502) {
						anInt4427 -= 6;
						local175 = anIntArray259[anInt4427];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static405.anInt6667 = local175;
						local776 = anIntArray259[anInt4427 + 1];
						if (local776 + 1 >= Static324.anIntArrayArrayArray10[Static405.anInt6667].length >> 1) {
							throw new RuntimeException();
						}
						Static674.anInt10900 = local776;
						Static246.anInt4349 = 0;
						Static113.anInt2069 = anIntArray259[anInt4427 + 2];
						Static408.anInt6690 = anIntArray259[anInt4427 + 3];
						local97 = anIntArray259[anInt4427 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static614.anInt10208 = local97;
						local103 = anIntArray259[anInt4427 + 5];
						if (local103 + 1 >= Static324.anIntArrayArrayArray10[Static614.anInt10208].length >> 1) {
							throw new RuntimeException();
						}
						Static99.anInt1969 = local103;
						Static451.anInt7263 = 3;
						Static468.anInt7425 = -1;
						Static351.anInt6038 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static304.method4414();
						return;
					}
					if (arg0 == 5504) {
						anInt4427 -= 2;
						Static276.method4052(anIntArray259[anInt4427 + 1], anIntArray259[anInt4427]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray259[anInt4427++] = (int) Static376.aFloat104 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray259[anInt4427++] = (int) Static318.aFloat81 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static228.method3418();
						return;
					}
					if (arg0 == 5508) {
						Static264.method3916();
						return;
					}
					if (arg0 == 5509) {
						Static198.method3031();
						return;
					}
					if (arg0 == 5510) {
						Static481.method8661();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray259[--anInt4427];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static534.anInt8358;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static98.anInt361) {
							local776 = Static98.anInt361;
						}
						local97 -= Static402.anInt6661;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static438.anInt7120) {
							local97 = Static438.anInt7120;
						}
						Static82.anInt1511 = (local776 << 9) + 256;
						Static8.anInt108 = (local97 << 9) + 256;
						Static451.anInt7263 = 4;
						Static468.anInt7425 = -1;
						Static351.anInt6038 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static523.method6797();
						return;
					}
					if (arg0 == 5514) {
						Static501.anInt7936 = anIntArray259[--anInt4427];
						return;
					}
					if (arg0 == 5516) {
						anIntArray259[anInt4427++] = Static501.anInt7936;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray259[--anInt4427];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static534.anInt8358;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static98.anInt361) {
								local776 = Static98.anInt361;
							}
							local97 -= Static402.anInt6661;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static438.anInt7120) {
								local97 = Static438.anInt7120;
							}
							Static351.anInt6038 = (local776 << 9) + 256;
							Static468.anInt7425 = (local97 << 9) + 256;
							return;
						}
						Static351.anInt6038 = -1;
						Static468.anInt7425 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt4424 -= 2;
						local83 = aStringArray31[anInt4424];
						local89 = aStringArray31[anInt4424 + 1];
						local97 = anIntArray259[--anInt4427];
						if (local83.length() > 320) {
							return;
						}
						if (Static221.anInt3831 != 3) {
							return;
						}
						if (Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							Static525.aString100 = local83;
							Static330.aString71 = local89;
							Static399.anInt6574 = local97;
							Static279.method4069(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static608.method8261();
						return;
					}
					if (arg0 == 5602) {
						if (Static474.anInt7575 == 0) {
							Static61.anInt1285 = -2;
							Static355.anInt6076 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt4424--;
						if (Static221.anInt3831 != 3) {
							return;
						}
						if (Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							Static46.method810(aStringArray31[anInt4424]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt4424 -= 2;
						anInt4427 -= 2;
						if (Static221.anInt3831 != 3) {
							return;
						}
						if (Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							Static565.method7442(anIntArray259[anInt4427 + 1] == 1, anIntArray259[anInt4427], aStringArray31[anInt4424], aStringArray31[anInt4424 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static613.anInt10200 == 0) {
							Static290.anInt4896 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray259[anInt4427++] = Static355.anInt6076;
						return;
					}
					if (arg0 == 5608) {
						anIntArray259[anInt4427++] = Static285.anInt4838;
						return;
					}
					if (arg0 == 5609) {
						anIntArray259[anInt4427++] = Static290.anInt4896;
						return;
					}
					if (arg0 == 5611) {
						anIntArray259[anInt4427++] = Static237.anInt4212;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray259[--anInt4427];
						if (Static221.anInt3831 != 7) {
							return;
						}
						if (Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							if (Static12.aClass26_1 != null) {
								Static12.aClass26_1.method746();
								Static12.aClass26_1 = null;
							}
							Static399.anInt6574 = local175;
							Static279.method4069(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray259[anInt4427++] = Static355.anInt6076;
						return;
					}
					if (arg0 == 5615) {
						anInt4424 -= 2;
						local83 = aStringArray31[anInt4424];
						local89 = aStringArray31[anInt4424 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static221.anInt3831 != 3) {
							return;
						}
						if (Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							if (Static12.aClass26_1 != null) {
								Static12.aClass26_1.method746();
								Static12.aClass26_1 = null;
							}
							Static525.aString100 = local83;
							Static330.aString71 = local89;
							Static279.method4069(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static316.method4541(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray259[anInt4427++] = Static61.anInt1285;
						return;
					}
					if (arg0 == 5618) {
						anInt4427--;
						return;
					}
					if (arg0 == 5619) {
						anInt4427--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray259[anInt4427++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt4424 -= 2;
						anInt4427 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static464.aString94 != null) {
							anIntArray259[anInt4427++] = 1;
							return;
						}
						anIntArray259[anInt4427++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray259[anInt4427++] = (int) (Static566.aLong254 >> 32);
						anIntArray259[anInt4427++] = (int) (Static566.aLong254 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray259[anInt4427++] = Static281.aBoolean315 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static281.aBoolean315 = true;
						Static34.method719();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray259[--anInt4427];
						Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub14_1);
						Static364.method5249();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					@Pc(4900) boolean local4900;
					if (arg0 == 6002) {
						local4900 = anIntArray259[--anInt4427] == 1;
						Static336.aClass3_Sub41_18.method6705(local4900 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub25_2);
						Static336.aClass3_Sub41_18.method6705(local4900 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub25_1);
						Static364.method5249();
						Static495.method6508();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6003) {
						local4900 = anIntArray259[--anInt4427] == 1;
						Static336.aClass3_Sub41_18.method6705(local4900 ? 2 : 1, Static336.aClass3_Sub41_18.aClass14_Sub19_1);
						Static336.aClass3_Sub41_18.method6705(local4900 ? 2 : 1, Static336.aClass3_Sub41_18.aClass14_Sub19_2);
						Static495.method6508();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6005) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub23_1);
						Static364.method5249();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6007) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub4_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6008) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub11_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6010) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub20_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6011) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub5_1);
						Static364.method5249();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6012) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub17_1);
						Static136.method2278();
						Static451.method6102();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6014) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 2 : 0, Static336.aClass3_Sub41_18.aClass14_Sub27_1);
						Static364.method5249();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6015) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub16_1);
						Static364.method5249();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6016) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub10_2);
						Static168.method2665(false, Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899());
						Static219.method3247();
						return;
					}
					if (arg0 == 6017) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub6_1);
						Static32.method674();
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6018) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub9_4);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray259[--anInt4427];
						local776 = Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998();
						if (local175 != local776) {
							if (Static487.method6425(Static221.anInt3831)) {
								if (local776 == 0 && Static189.anInt3426 != -1) {
									Static58.method7696(Static214.aClass362_141, local175, Static189.anInt3426);
									Static115.method1733();
									Static501.aBoolean551 = false;
								} else if (local175 == 0) {
									Static412.method5624();
									Static501.aBoolean551 = false;
								} else {
									Static565.method7444(local175);
								}
							}
							Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub9_3);
							Static219.method3247();
							Static74.aBoolean102 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub9_2);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static336.aClass3_Sub41_18.aClass14_Sub19_1.method5938();
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 0 : local175, Static336.aClass3_Sub41_18.aClass14_Sub19_2);
						Static495.method6508();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray259[--anInt4427];
						Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub18_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6024) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub10_1);
						Static219.method3247();
						return;
					}
					if (arg0 == 6025) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub22_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray259[--anInt4427];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static645.method8679(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 0 ? 0 : 1, Static336.aClass3_Sub41_18.aClass14_Sub3_1);
						Static219.method3247();
						return;
					}
					if (arg0 == 6029) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub4_1);
						Static219.method3247();
						return;
					}
					if (arg0 == 6030) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 0 ? 0 : 1, Static336.aClass3_Sub41_18.aClass14_Sub21_1);
						Static219.method3247();
						Static364.method5249();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray259[--anInt4427];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static168.method2665(false, local175);
						return;
					}
					if (arg0 == 6032) {
						anInt4427 -= 2;
						local175 = anIntArray259[anInt4427];
						local1496 = anIntArray259[anInt4427 + 1] == 1;
						Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
						if (!local1496) {
							Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub15_1);
						}
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6033) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub26_1);
						Static219.method3247();
						return;
					}
					if (arg0 == 6034) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : 0, Static336.aClass3_Sub41_18.aClass14_Sub8_1);
						Static219.method3247();
						Static136.method2278();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static336.aClass3_Sub41_18.aClass14_Sub25_2.method6576();
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427] == 1 ? 1 : local175, Static336.aClass3_Sub41_18.aClass14_Sub25_1);
						Static364.method5249();
						Static495.method6508();
						return;
					}
					if (arg0 == 6036) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub29_1);
						Static219.method3247();
						Static88.aBoolean149 = true;
						return;
					}
					if (arg0 == 6037) {
						Static336.aClass3_Sub41_18.method6705(anIntArray259[--anInt4427], Static336.aClass3_Sub41_18.aClass14_Sub9_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray259[--anInt4427];
						local776 = Static336.aClass3_Sub41_18.aClass14_Sub9_5.method2998();
						if (local175 != local776 && Static189.anInt3426 == Static339.anInt5830) {
							if (!Static487.method6425(Static221.anInt3831)) {
								if (local776 == 0) {
									Static58.method7696(Static214.aClass362_141, local175, Static189.anInt3426);
									Static115.method1733();
									Static501.aBoolean551 = false;
								} else if (local175 == 0) {
									Static412.method5624();
									Static501.aBoolean551 = false;
								} else {
									Static565.method7444(local175);
								}
							}
							Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub9_5);
							Static219.method3247();
							Static74.aBoolean102 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray259[--anInt4427];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static336.aClass3_Sub41_18.aClass14_Sub1_1.method420()) {
							Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub1_1);
							Static219.method3247();
							Static74.aBoolean102 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray259[--anInt4427];
						if (local175 != Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1015()) {
							Static336.aClass3_Sub41_18.method6705(local175, Static336.aClass3_Sub41_18.aClass14_Sub2_1);
							Static219.method3247();
							Static74.aBoolean102 = false;
							Static587.method7789();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub14_1.method4344();
						return;
					}
					if (arg0 == 6102) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub25_2.method6576() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub19_1.method5938() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub23_1.method6428() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub4_1.method1810();
						return;
					}
					if (arg0 == 6108) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub11_1.method3289() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub20_1.method6068() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511();
						return;
					}
					if (arg0 == 6112) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub17_1.method5487() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub27_1.method8410() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub16_1.method4688() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub10_2.method3046();
						return;
					}
					if (arg0 == 6117) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub6_1.method2689() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub9_4.method2998();
						return;
					}
					if (arg0 == 6119) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998();
						return;
					}
					if (arg0 == 6120) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub9_2.method2998();
						return;
					}
					if (arg0 == 6123) {
						anIntArray259[anInt4427++] = Static120.method1816();
						return;
					}
					if (arg0 == 6124) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub10_1.method3046();
						return;
					}
					if (arg0 == 6125) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub22_1.method6221();
						return;
					}
					if (arg0 == 6127) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub24_1.method6457() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub3_1.method1528() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub4_1.method1810();
						return;
					}
					if (arg0 == 6130) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub21_1.method6184() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899();
						return;
					}
					if (arg0 == 6132) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub7_1.method2899();
						return;
					}
					if (arg0 == 6133) {
						anIntArray259[anInt4427++] = Static566.aClass92_6.aBoolean172 && !Static566.aClass92_6.aBoolean170 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub26_1.method7784();
						return;
					}
					if (arg0 == 6136) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub8_1.method2916() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray259[anInt4427++] = Static434.method5948(200, Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899());
						return;
					}
					if (arg0 == 6139) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub29_1.method8914();
						return;
					}
					if (arg0 == 6142) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub9_1.method2998();
						return;
					}
					if (arg0 == 6143) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub9_5.method2998();
						return;
					}
					if (arg0 == 6144) {
						anIntArray259[anInt4427++] = Static556.aBoolean627 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub1_1.method420();
						return;
					}
					if (arg0 == 6146) {
						anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1015();
						return;
					}
					if (arg0 == 6147) {
						anIntArray259[anInt4427++] = Static395.aClass3_Sub28_1.anInt4590 < 512 || Static556.aBoolean627 || Static45.aBoolean57 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray259[anInt4427++] = Static123.aBoolean167 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt4427 -= 2;
						Static469.aShort65 = (short) anIntArray259[anInt4427];
						if (Static469.aShort65 <= 0) {
							Static469.aShort65 = 256;
						}
						Static486.aShort71 = (short) anIntArray259[anInt4427 + 1];
						if (Static486.aShort71 <= 0) {
							Static486.aShort71 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt4427 -= 2;
						Static349.aShort52 = (short) anIntArray259[anInt4427];
						if (Static349.aShort52 <= 0) {
							Static349.aShort52 = 256;
						}
						Static412.aShort57 = (short) anIntArray259[anInt4427 + 1];
						if (Static412.aShort57 <= 0) {
							Static412.aShort57 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt4427 -= 4;
						Static382.aShort55 = (short) anIntArray259[anInt4427];
						if (Static382.aShort55 <= 0) {
							Static382.aShort55 = 1;
						}
						Static241.aShort44 = (short) anIntArray259[anInt4427 + 1];
						if (Static241.aShort44 <= 0) {
							Static241.aShort44 = 32767;
						} else if (Static241.aShort44 < Static382.aShort55) {
							Static241.aShort44 = Static382.aShort55;
						}
						Static343.aShort51 = (short) anIntArray259[anInt4427 + 2];
						if (Static343.aShort51 <= 0) {
							Static343.aShort51 = 1;
						}
						Static464.aShort64 = (short) anIntArray259[anInt4427 + 3];
						if (Static464.aShort64 <= 0) {
							Static464.aShort64 = 32767;
							return;
						}
						if (Static464.aShort64 < Static343.aShort51) {
							Static464.aShort64 = Static343.aShort51;
						}
						return;
					}
					if (arg0 == 6203) {
						Static279.method4070(0, false, Static434.aClass265_11.anInt6997, 0, Static434.aClass265_11.anInt7024);
						anIntArray259[anInt4427++] = Static397.anInt9628;
						anIntArray259[anInt4427++] = Static635.anInt10497;
						return;
					}
					if (arg0 == 6204) {
						anIntArray259[anInt4427++] = Static349.aShort52;
						anIntArray259[anInt4427++] = Static412.aShort57;
						return;
					}
					if (arg0 == 6205) {
						anIntArray259[anInt4427++] = Static469.aShort65;
						anIntArray259[anInt4427++] = Static486.aShort71;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray259[anInt4427++] = (int) (Static15.method380() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray259[anInt4427++] = (int) (Static15.method380() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt4427 -= 3;
						local175 = anIntArray259[anInt4427];
						local776 = anIntArray259[anInt4427 + 1];
						local97 = anIntArray259[anInt4427 + 2];
						@Pc(6709) long local6709 = Static263.method1779(local175, local97, local776);
						local3369 = Static133.method2249(local6709);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray259[anInt4427++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray259[anInt4427++] = Static88.method1496(Static15.method380());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray259[--anInt4427];
						local1496 = true;
						if (local175 < 0) {
							local1496 = (local175 + 1) % 4 == 0;
						} else if (local175 < 1582) {
							local1496 = local175 % 4 == 0;
						} else if (local175 % 4 != 0) {
							local1496 = false;
						} else if (local175 % 100 != 0) {
							local1496 = true;
						} else if (local175 % 400 != 0) {
							local1496 = false;
						}
						anIntArray259[anInt4427++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray259[--anInt4427];
						@Pc(6827) int[] local6827 = Static584.method7732(local175);
						Static681.method4031(local6827, 0, anIntArray259, anInt4427, 3);
						anInt4427 += 3;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray259[anInt4427++] = Static660.method8808() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray259[anInt4427++] = Static536.method7453() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static221.anInt3831 == 7 && Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							if (Static238.aBoolean398) {
								anIntArray259[anInt4427++] = 0;
								return;
							}
							if (Static607.aLong277 > Static15.method380() - 1000L) {
								anIntArray259[anInt4427++] = 1;
								return;
							}
							Static238.aBoolean398 = true;
							local52 = Static90.method1509(Static33.aClass240_93, Static226.aClass144_2);
							local52.aClass3_Sub4_Sub1_2.method7909(Static587.anInt9548);
							Static301.method2678(local52);
							anIntArray259[anInt4427++] = 0;
							return;
						}
						anIntArray259[anInt4427++] = 1;
						return;
					}
					@Pc(6987) Class90 local6987;
					@Pc(6954) Class236_Sub1 local6954;
					if (arg0 == 6501) {
						local6954 = Static108.method1703();
						if (local6954 != null) {
							anIntArray259[anInt4427++] = local6954.anInt6389;
							anIntArray259[anInt4427++] = local6954.anInt6386;
							aStringArray31[anInt4424++] = local6954.aString80;
							local6987 = local6954.method5368();
							anIntArray259[anInt4427++] = local6987.anInt2194;
							aStringArray31[anInt4424++] = local6987.aString32;
							anIntArray259[anInt4427++] = local6954.anInt6385;
							anIntArray259[anInt4427++] = local6954.anInt6388;
							aStringArray31[anInt4424++] = local6954.aString81;
							return;
						}
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						anIntArray259[anInt4427++] = 0;
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6954 = Static381.method5370();
						if (local6954 != null) {
							anIntArray259[anInt4427++] = local6954.anInt6389;
							anIntArray259[anInt4427++] = local6954.anInt6386;
							aStringArray31[anInt4424++] = local6954.aString80;
							local6987 = local6954.method5368();
							anIntArray259[anInt4427++] = local6987.anInt2194;
							aStringArray31[anInt4424++] = local6987.aString32;
							anIntArray259[anInt4427++] = local6954.anInt6385;
							anIntArray259[anInt4427++] = local6954.anInt6388;
							aStringArray31[anInt4424++] = local6954.aString81;
							return;
						}
						anIntArray259[anInt4427++] = -1;
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						anIntArray259[anInt4427++] = 0;
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray259[--anInt4427];
						local89 = aStringArray31[--anInt4424];
						if (Static221.anInt3831 == 7 && Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
							anIntArray259[anInt4427++] = Static16.method8272(local89, local175) ? 1 : 0;
							return;
						}
						anIntArray259[anInt4427++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray259[--anInt4427];
						@Pc(7314) Class236_Sub1 local7314 = Static429.method5921(local175);
						if (local7314 != null) {
							anIntArray259[anInt4427++] = local7314.anInt6386;
							aStringArray31[anInt4424++] = local7314.aString80;
							@Pc(7338) Class90 local7338 = local7314.method5368();
							anIntArray259[anInt4427++] = local7338.anInt2194;
							aStringArray31[anInt4424++] = local7338.aString32;
							anIntArray259[anInt4427++] = local7314.anInt6385;
							anIntArray259[anInt4427++] = local7314.anInt6388;
							aStringArray31[anInt4424++] = local7314.aString81;
							return;
						}
						anIntArray259[anInt4427++] = -1;
						aStringArray31[anInt4424++] = "";
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						anIntArray259[anInt4427++] = 0;
						anIntArray259[anInt4427++] = 0;
						aStringArray31[anInt4424++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt4427 -= 4;
						local175 = anIntArray259[anInt4427];
						local1496 = anIntArray259[anInt4427 + 1] == 1;
						local97 = anIntArray259[anInt4427 + 2];
						local2205 = anIntArray259[anInt4427 + 3] == 1;
						Static27.method608(local175, local2205, local97, local1496);
						return;
					}
					if (arg0 == 6508) {
						Static341.method4980();
						return;
					}
					if (arg0 == 6509) {
						if (Static221.anInt3831 != 7) {
							return;
						}
						Static562.aBoolean635 = anIntArray259[--anInt4427] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray259[anInt4427++] = Static622.anInt10292;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static431.aClass16_3 == Static555.aClass16_4) {
						if (arg0 == 6700) {
							local175 = Static513.aClass333_33.method7486();
							if (Static187.anInt3418 != -1) {
								local175++;
							}
							anIntArray259[anInt4427++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray259[--anInt4427];
							if (Static187.anInt3418 != -1) {
								if (local175 == 0) {
									anIntArray259[anInt4427++] = Static187.anInt3418;
									return;
								}
								local175--;
							}
							@Pc(7586) Class3_Sub25 local7586 = (Class3_Sub25) Static513.aClass333_33.method7490();
							while (local175-- > 0) {
								local7586 = (Class3_Sub25) Static513.aClass333_33.method7487();
							}
							anIntArray259[anInt4427++] = local7586.anInt3959;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray259[--anInt4427];
							if (Static270.aClass265ArrayArray2[local175] == null) {
								aStringArray31[anInt4424++] = "";
								return;
							}
							local89 = Static270.aClass265ArrayArray2[local175][0].aString87;
							if (local89 == null) {
								aStringArray31[anInt4424++] = "";
								return;
							}
							aStringArray31[anInt4424++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray259[--anInt4427];
							if (Static270.aClass265ArrayArray2[local175] == null) {
								anIntArray259[anInt4427++] = 0;
								return;
							}
							anIntArray259[anInt4427++] = Static270.aClass265ArrayArray2[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt4427 -= 2;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							if (Static270.aClass265ArrayArray2[local175] == null) {
								aStringArray31[anInt4424++] = "";
								return;
							}
							local181 = Static270.aClass265ArrayArray2[local175][local776].aString87;
							if (local181 == null) {
								aStringArray31[anInt4424++] = "";
								return;
							}
							aStringArray31[anInt4424++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt4427 -= 2;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							if (Static270.aClass265ArrayArray2[local175] == null) {
								anIntArray259[anInt4427++] = 0;
								return;
							}
							anIntArray259[anInt4427++] = Static270.aClass265ArrayArray2[local175][local776].anInt6966;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 1);
							return;
						}
						if (arg0 == 6708) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 2);
							return;
						}
						if (arg0 == 6709) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 3);
							return;
						}
						if (arg0 == 6710) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 4);
							return;
						}
						if (arg0 == 6711) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 5);
							return;
						}
						if (arg0 == 6712) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 6);
							return;
						}
						if (arg0 == 6713) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 7);
							return;
						}
						if (arg0 == 6714) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 8);
							return;
						}
						if (arg0 == 6715) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 9);
							return;
						}
						if (arg0 == 6716) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							Static272.method4018(local97, local175 << 16 | local776, "", 10);
							return;
						}
						if (arg0 == 6717) {
							anInt4427 -= 3;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							local97 = anIntArray259[anInt4427 + 2];
							@Pc(8174) Class265 local8174 = Static212.method3145(local175 << 16 | local776, local97);
							Static252.method3806();
							@Pc(8179) Class3_Sub40 local8179 = Static86.method1383(local8174);
							Static410.method5612(local8179.anInt7828, local8174, local8179.method6484());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8207) Class188 local8207;
						if (arg0 == 6800) {
							local175 = anIntArray259[--anInt4427];
							local8207 = Static61.aClass378_1.method8708(local175);
							if (local8207.aString62 == null) {
								aStringArray31[anInt4424++] = "";
								return;
							}
							aStringArray31[anInt4424++] = local8207.aString62;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray259[--anInt4427];
							local8207 = Static61.aClass378_1.method8708(local175);
							anIntArray259[anInt4427++] = local8207.anInt4962;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray259[--anInt4427];
							local8207 = Static61.aClass378_1.method8708(local175);
							anIntArray259[anInt4427++] = local8207.anInt4967;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray259[--anInt4427];
							local8207 = Static61.aClass378_1.method8708(local175);
							anIntArray259[anInt4427++] = local8207.anInt4980;
							return;
						}
						if (arg0 == 6804) {
							anInt4427 -= 2;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							@Pc(8329) Class281 local8329 = Static389.aClass335_2.method7504(local776);
							if (local8329.method6170()) {
								aStringArray31[anInt4424++] = Static61.aClass378_1.method8708(local175).method4290(local8329.aString92, local776);
								return;
							}
							anIntArray259[anInt4427++] = Static61.aClass378_1.method8708(local175).method4288(local776, local8329.anInt7362);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray259[anInt4427++] = Static511.aBoolean563 && !Static14.aBoolean14 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray259[anInt4427++] = (int) (Static662.aLong303 / 60000L);
							anIntArray259[anInt4427++] = (int) ((Static662.aLong303 - Static15.method380() - Static222.aLong102) / 60000L);
							anIntArray259[anInt4427++] = Static365.aBoolean436 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray259[anInt4427++] = Static335.anInt5701;
							return;
						}
						if (arg0 == 6903) {
							anIntArray259[anInt4427++] = Static151.anInt8950;
							return;
						}
						if (arg0 == 6904) {
							anIntArray259[anInt4427++] = Static193.anInt3508;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static633.aClass338_15 != null) {
								if (Static633.aClass338_15.anObject18 == null) {
									local83 = Static195.method3010(Static633.aClass338_15.anInt9319);
								} else {
									local83 = (String) Static633.aClass338_15.anObject18;
								}
							}
							aStringArray31[anInt4424++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray259[anInt4427++] = Static239.anInt4249;
							return;
						}
						if (arg0 == 6907) {
							anIntArray259[anInt4427++] = Static530.anInt8326;
							return;
						}
						if (arg0 == 6908) {
							anIntArray259[anInt4427++] = Static514.anInt8104;
							return;
						}
						if (arg0 == 6909) {
							anIntArray259[anInt4427++] = Static375.aBoolean530 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray259[anInt4427++] = Static455.anInt7321;
							return;
						}
						if (arg0 == 6911) {
							anIntArray259[anInt4427++] = Static517.anInt8128;
							return;
						}
						if (arg0 == 6912) {
							anIntArray259[anInt4427++] = Static301.anInt3096;
							return;
						}
						if (arg0 == 6913) {
							anIntArray259[anInt4427++] = Static75.anInt1476;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static501.method6574();
							anIntArray259[anInt4427++] = Static199.anInt3549 = Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899();
							anIntArray259[anInt4427++] = local175;
							Static364.method5249();
							Static219.method3247();
							Static74.aBoolean102 = false;
							return;
						}
						if (arg0 == 7001) {
							Static443.method6043();
							Static364.method5249();
							Static219.method3247();
							Static74.aBoolean102 = false;
							return;
						}
						if (arg0 == 7002) {
							Static623.method8412();
							Static364.method5249();
							Static219.method3247();
							Static74.aBoolean102 = false;
							return;
						}
						if (arg0 == 7003) {
							Static386.method5403();
							Static364.method5249();
							Static219.method3247();
							Static74.aBoolean102 = false;
							return;
						}
						if (arg0 == 7004) {
							Static677.method9019();
							Static364.method5249();
							Static219.method3247();
							Static74.aBoolean102 = false;
							return;
						}
						if (arg0 == 7005) {
							Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub15_1);
							Static219.method3247();
							Static74.aBoolean102 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static199.anInt3549 == 2) {
								Static574.aBoolean646 = true;
								return;
							}
							if (Static199.anInt3549 == 1) {
								Static594.aBoolean666 = true;
								return;
							}
							if (Static199.anInt3549 == 3) {
								Static353.aBoolean419 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub15_1.method4556();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt4427 -= 2;
							local175 = anIntArray259[anInt4427];
							local776 = anIntArray259[anInt4427 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static402.method5589(local175, local776, false);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray259[--anInt4427];
							if (local175 != -1) {
								Static344.method5009(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray259[--anInt4427];
							if (local175 != -1) {
								Static663.method8843(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray259[anInt4427++] = Static66.method1168("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub23_1.method6424() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub20_1.method6069() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2510() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub27_1.method8409() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub10_1.method3044() && Static119.aClass95_4.method8017() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub18_1.method5808() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub22_1.method6222() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub24_1.method6454() && Static119.aClass95_4.method8003() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub21_1.method6181() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub8_1.method2918() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub29_1.method8913() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub16_1.method4687() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1013() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub7_1.method2903() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub23_1.method8912(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub20_1.method8912(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub5_1.method8912(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub27_1.method8912(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray259[--anInt4427];
							if (!Static119.aClass95_4.method8017()) {
								anIntArray259[anInt4427++] = 3;
								return;
							}
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub10_1.method8912(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub18_1.method8912(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub22_1.method8912(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray259[--anInt4427];
							if (!Static119.aClass95_4.method8003()) {
								anIntArray259[anInt4427++] = 3;
								return;
							}
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub24_1.method8912(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub21_1.method8912(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub8_1.method8912(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub29_1.method8912(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub16_1.method8912(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub2_1.method8912(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray259[--anInt4427];
							anIntArray259[anInt4427++] = Static336.aClass3_Sub41_18.aClass14_Sub7_1.method8912(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
	private static void method3778(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class265 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class265 local35;
		@Pc(158) Class265 local158;
		@Pc(210) Class265 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt4427 -= 3;
				local13 = anIntArray259[anInt4427];
				local19 = anIntArray259[anInt4427 + 1];
				local25 = anIntArray259[anInt4427 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static223.method3278(local13);
				if (local35.aClass265Array4 == null) {
					local35.aClass265Array4 = new Class265[local25 + 1];
				}
				if (local35.aClass265Array4.length <= local25) {
					@Pc(54) Class265[] local54 = new Class265[local25 + 1];
					for (local56 = 0; local56 < local35.aClass265Array4.length; local56++) {
						local54[local56] = local35.aClass265Array4[local56];
					}
					local35.aClass265Array4 = local54;
				}
				if (local25 > 0 && local35.aClass265Array4[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class265 local99 = new Class265();
				local99.anInt6967 = local19;
				local99.anInt6985 = local99.anInt7032 = local35.anInt7032;
				local99.anInt7004 = local25;
				local35.aClass265Array4[local25] = local99;
				if (arg1) {
					aClass265_7 = local99;
				} else {
					aClass265_6 = local99;
				}
				Static218.method3194(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass265_7 : aClass265_6;
				if (local137.anInt7004 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static223.method3278(local137.anInt7032);
				local158.aClass265Array4[local137.anInt7004] = null;
				Static218.method3194(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static223.method3278(anIntArray259[--anInt4427]);
				local137.aClass265Array4 = null;
				Static218.method3194(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4427 -= 2;
				local13 = anIntArray259[anInt4427];
				local19 = anIntArray259[anInt4427 + 1];
				local210 = Static212.method3145(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray259[anInt4427++] = 1;
					if (arg1) {
						aClass265_7 = local210;
						return;
					}
					aClass265_6 = local210;
					return;
				}
				anIntArray259[anInt4427++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray259[--anInt4427];
				local158 = Static223.method3278(local13);
				if (local158 != null) {
					anIntArray259[anInt4427++] = 1;
					if (arg1) {
						aClass265_7 = local158;
						return;
					}
					aClass265_6 = local158;
					return;
				}
				anIntArray259[anInt4427++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray259[--anInt4427];
				method3780(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray259[--anInt4427];
				method3770(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4427 -= 2;
					local13 = anIntArray259[anInt4427];
					local19 = anIntArray259[anInt4427 + 1];
					if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static492.anIntArray40.length; local25++) {
						if (Static492.anIntArray40[local25] == local13) {
							Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.method8675(local25, local19, Static538.aClass114_2);
							return;
						}
					}
					for (local357 = 0; local357 < Static130.anIntArray532.length; local357++) {
						if (Static130.anIntArray532[local357] == local13) {
							Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.method8675(local357, local19, Static538.aClass114_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4427 -= 2;
					local13 = anIntArray259[anInt4427];
					local19 = anIntArray259[anInt4427 + 1];
					if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 == null) {
						return;
					}
					Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.method8682(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray259[--anInt4427] != 0;
					if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 == null) {
						return;
					}
					Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.method8683(local420);
					return;
				}
				if (arg0 == 411) {
					anInt4427 -= 2;
					local13 = anIntArray259[anInt4427];
					local19 = anIntArray259[anInt4427 + 1];
					if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 == null) {
						return;
					}
					Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.method8684(local19, Static117.aClass197_2, local13);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static223.method3278(anIntArray259[--anInt4427]);
					} else {
						local137 = arg1 ? aClass265_7 : aClass265_6;
					}
					if (arg0 == 1100) {
						anInt4427 -= 2;
						local137.anInt7033 = anIntArray259[anInt4427];
						if (local137.anInt7033 > local137.anInt7000 - local137.anInt7024) {
							local137.anInt7033 = local137.anInt7000 - local137.anInt7024;
						}
						if (local137.anInt7033 < 0) {
							local137.anInt7033 = 0;
						}
						local137.anInt7002 = anIntArray259[anInt4427 + 1];
						if (local137.anInt7002 > local137.anInt7020 - local137.anInt6997) {
							local137.anInt7002 = local137.anInt7020 - local137.anInt6997;
						}
						if (local137.anInt7002 < 0) {
							local137.anInt7002 = 0;
						}
						Static218.method3194(local137);
						if (local137.anInt7004 == -1) {
							Static192.method2977(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6999 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						if (local137.anInt7004 == -1) {
							Static33.method6981(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean490 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6965 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7034 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray259[--anInt4427];
						if (local137.anInt7012 != local19) {
							local137.anInt7012 = local19;
							Static218.method3194(local137);
						}
						if (local137.anInt7004 == -1) {
							Static207.method7398(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6998 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean493 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7023 = 1;
						local137.anInt7050 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4427 -= 6;
						local137.anInt7037 = anIntArray259[anInt4427];
						local137.anInt7027 = anIntArray259[anInt4427 + 1];
						local137.anInt7030 = anIntArray259[anInt4427 + 2];
						local137.anInt7036 = anIntArray259[anInt4427 + 3];
						local137.anInt6982 = anIntArray259[anInt4427 + 4];
						local137.anInt6969 = anIntArray259[anInt4427 + 5];
						Static218.method3194(local137);
						if (local137.anInt7004 == -1) {
							Static25.method588(local137.anInt7032);
							Static198.method3032(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray259[--anInt4427];
						if (local137.anInt7026 != local19) {
							local137.anInt7026 = local19;
							local137.anInt6979 = 0;
							local137.anInt7022 = 1;
							local137.anInt7041 = 0;
							@Pc(1110) Class239 local1110 = local137.anInt7026 == -1 ? null : Static13.aClass213_1.method5008(local137.anInt7026);
							if (local1110 != null) {
								Static367.method9033(local137.anInt6979, local1110);
							}
							Static218.method3194(local137);
						}
						if (local137.anInt7004 == -1) {
							Static116.method1791(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean500 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray31[--anInt4424];
						if (!local1161.equals(local137.aString86)) {
							local137.aString86 = local1161;
							Static218.method3194(local137);
						}
						if (local137.anInt7004 == -1) {
							Static147.method2357(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6975 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						if (local137.anInt7004 == -1) {
							Static660.method8809(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4427 -= 3;
						local137.anInt7013 = anIntArray259[anInt4427];
						local137.anInt7049 = anIntArray259[anInt4427 + 1];
						local137.anInt7021 = anIntArray259[anInt4427 + 2];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean498 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6971 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt7051 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean497 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean502 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4427 -= 2;
						local137.anInt7000 = anIntArray259[anInt4427];
						local137.anInt7020 = anIntArray259[anInt4427 + 1];
						Static218.method3194(local137);
						if (local137.anInt6967 == 0) {
							Static463.method6195(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean503 = anIntArray259[--anInt4427] == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6969 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						if (local137.anInt7004 == -1) {
							Static25.method588(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray259[--anInt4427];
						local137.aBoolean501 = local19 == 1;
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4427 -= 2;
						local137.anInt7044 = anIntArray259[anInt4427];
						local137.anInt6984 = anIntArray259[anInt4427 + 1];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6972 = anIntArray259[--anInt4427];
						Static218.method3194(local137);
						return;
					}
					@Pc(1489) Class281 local1489;
					if (arg0 == 1127) {
						anInt4427 -= 2;
						local19 = anIntArray259[anInt4427];
						local25 = anIntArray259[anInt4427 + 1];
						local1489 = Static389.aClass335_2.method7504(local19);
						if (local25 != local1489.anInt7362) {
							local137.method5903(local19, local25);
							return;
						}
						local137.method5901(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray259[--anInt4427];
						local1523 = aStringArray31[--anInt4424];
						local1489 = Static389.aClass335_2.method7504(local19);
						if (!local1489.aString92.equals(local1523)) {
							local137.method5899(local19, local1523);
							return;
						}
						local137.method5901(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray259[--anInt4427];
						if (local137.anInt6967 != 5 && arg0 == 1129 || local137.anInt6967 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt6964 != local19) {
							local137.anInt6964 = local19;
							Static218.method3194(local137);
						}
						if (local137.anInt7004 == -1) {
							Static673.method8970(local137.anInt7032);
						}
						return;
					}
					@Pc(1617) short local1617;
					@Pc(1610) short local1610;
					if (arg0 == 1131) {
						anInt4427 -= 3;
						local19 = anIntArray259[anInt4427];
						local1610 = (short) anIntArray259[anInt4427 + 1];
						local1617 = (short) anIntArray259[anInt4427 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method5904(local1610, local19, local1617);
							Static218.method3194(local137);
							if (local137.anInt7004 == -1) {
								Static53.method1022(local137.anInt7032, local19);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt4427 -= 3;
						local19 = anIntArray259[anInt4427];
						local1610 = (short) anIntArray259[anInt4427 + 1];
						local1617 = (short) anIntArray259[anInt4427 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method5915(local1617, local19, local1610);
							Static218.method3194(local137);
							if (local137.anInt7004 == -1) {
								Static157.method2509(local19, local137.anInt7032);
							}
							return;
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static223.method3278(anIntArray259[--anInt4427]);
					} else {
						local137 = arg1 ? aClass265_7 : aClass265_6;
					}
					Static218.method3194(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4427 -= 2;
						local19 = anIntArray259[anInt4427];
						local25 = anIntArray259[anInt4427 + 1];
						if (local137.anInt7004 == -1) {
							Static465.method6210(local137.anInt7032);
							Static25.method588(local137.anInt7032);
							Static198.method3032(local137.anInt7032);
						}
						if (local19 == -1) {
							local137.anInt7023 = 1;
							local137.anInt7050 = -1;
							local137.anInt7005 = -1;
							return;
						}
						local137.anInt7005 = local19;
						local137.anInt7045 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean494 = true;
						} else {
							local137.aBoolean494 = false;
						}
						@Pc(1813) Class15 local1813 = Static117.aClass197_2.method4518(local19);
						local137.anInt7030 = local1813.anInt464;
						local137.anInt7036 = local1813.anInt432;
						local137.anInt6982 = local1813.anInt480;
						local137.anInt7037 = local1813.anInt448;
						local137.anInt7027 = local1813.anInt477;
						local137.anInt6969 = local1813.anInt469;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7039 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7039 = 1;
						} else {
							local137.anInt7039 = 2;
						}
						if (local137.anInt7043 > 0) {
							local137.anInt6969 = local137.anInt6969 * 32 / local137.anInt7043;
							return;
						}
						if (local137.anInt7011 > 0) {
							local137.anInt6969 = local137.anInt6969 * 32 / local137.anInt7011;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7023 = 2;
						local137.anInt7050 = anIntArray259[--anInt4427];
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7023 = 3;
						local137.anInt7050 = -1;
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7023 = 6;
						local137.anInt7050 = anIntArray259[--anInt4427];
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7023 = 5;
						local137.anInt7050 = anIntArray259[--anInt4427];
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4427 -= 4;
						local137.anInt6962 = anIntArray259[anInt4427];
						local137.anInt7038 = anIntArray259[anInt4427 + 1];
						local137.anInt7042 = anIntArray259[anInt4427 + 2];
						local137.anInt6992 = anIntArray259[anInt4427 + 3];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4427 -= 2;
						local137.anInt7017 = anIntArray259[anInt4427];
						local137.anInt6994 = anIntArray259[anInt4427 + 1];
						Static218.method3194(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4427 -= 4;
						local137.anInt7050 = anIntArray259[anInt4427];
						local137.anInt6988 = anIntArray259[anInt4427 + 1];
						if (anIntArray259[anInt4427 + 2] == 1) {
							local137.anInt7023 = 9;
						} else {
							local137.anInt7023 = 8;
						}
						if (anIntArray259[anInt4427 + 3] == 1) {
							local137.aBoolean494 = true;
						} else {
							local137.aBoolean494 = false;
						}
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7023 = 5;
						local137.anInt7050 = Static291.anInt4955;
						local137.anInt6988 = 0;
						if (local137.anInt7004 == -1) {
							Static296.method4349(local137.anInt7032);
						}
						return;
					}
				} else {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static223.method3278(anIntArray259[--anInt4427]);
							} else {
								local137 = arg1 ? aClass265_7 : aClass265_6;
							}
							if (arg0 == 1499) {
								local137.method5902();
								return;
							}
							local1161 = aStringArray31[--anInt4424];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray259[--anInt4427];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray259[--anInt4427];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray31[--anInt4424];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray10[--anInt4420]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray259[--anInt4427]);
								}
							}
							local56 = anIntArray259[--anInt4427];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray27 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray33 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray12 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray29 = local2611;
								local137.anIntArray376 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray5 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray18 = local2611;
								local137.anIntArray382 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray23 = local2611;
								local137.anIntArray383 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray10 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray19 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray2 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray15 = local2611;
								local137.anIntArray374 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray16 = local2611;
								local137.anIntArray377 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray1 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray21 = local2611;
							}
							local137.aBoolean496 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass265_7 : aClass265_6;
							if (arg0 == 1500) {
								anIntArray259[anInt4427++] = local137.anInt6993;
								return;
							}
							if (arg0 == 1501) {
								anIntArray259[anInt4427++] = local137.anInt6968;
								return;
							}
							if (arg0 == 1502) {
								anIntArray259[anInt4427++] = local137.anInt7024;
								return;
							}
							if (arg0 == 1503) {
								anIntArray259[anInt4427++] = local137.anInt6997;
								return;
							}
							if (arg0 == 1504) {
								anIntArray259[anInt4427++] = local137.aBoolean495 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray259[anInt4427++] = local137.anInt6985;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static26.method591(local137);
								anIntArray259[anInt4427++] = local158 == null ? -1 : local158.anInt7032;
								return;
							}
						} else {
							@Pc(3242) Class281 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass265_7 : aClass265_6;
								if (arg0 == 1600) {
									anIntArray259[anInt4427++] = local137.anInt7033;
									return;
								}
								if (arg0 == 1601) {
									anIntArray259[anInt4427++] = local137.anInt7002;
									return;
								}
								if (arg0 == 1602) {
									aStringArray31[anInt4424++] = local137.aString86;
									return;
								}
								if (arg0 == 1603) {
									anIntArray259[anInt4427++] = local137.anInt7000;
									return;
								}
								if (arg0 == 1604) {
									anIntArray259[anInt4427++] = local137.anInt7020;
									return;
								}
								if (arg0 == 1605) {
									anIntArray259[anInt4427++] = local137.anInt6969;
									return;
								}
								if (arg0 == 1606) {
									anIntArray259[anInt4427++] = local137.anInt7030;
									return;
								}
								if (arg0 == 1607) {
									anIntArray259[anInt4427++] = local137.anInt6982;
									return;
								}
								if (arg0 == 1608) {
									anIntArray259[anInt4427++] = local137.anInt7036;
									return;
								}
								if (arg0 == 1609) {
									anIntArray259[anInt4427++] = local137.anInt6965;
									return;
								}
								if (arg0 == 1610) {
									anIntArray259[anInt4427++] = local137.anInt7037;
									return;
								}
								if (arg0 == 1611) {
									anIntArray259[anInt4427++] = local137.anInt7027;
									return;
								}
								if (arg0 == 1612) {
									anIntArray259[anInt4427++] = local137.anInt7012;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray259[--anInt4427];
									local3242 = Static389.aClass335_2.method7504(local19);
									if (local3242.method6170()) {
										aStringArray31[anInt4424++] = local137.method5914(local3242.aString92, local19);
										return;
									}
									anIntArray259[anInt4427++] = local137.method5918(local3242.anInt7362, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray259[anInt4427++] = local137.anInt6998;
									return;
								}
								if (arg0 == 2614) {
									anIntArray259[anInt4427++] = local137.anInt7023 == 1 ? local137.anInt7050 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass265_7 : aClass265_6;
								if (arg0 == 1700) {
									anIntArray259[anInt4427++] = local137.anInt7005;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt7005 != -1) {
										anIntArray259[anInt4427++] = local137.anInt7045;
										return;
									}
									anIntArray259[anInt4427++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray259[anInt4427++] = local137.anInt7004;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass265_7 : aClass265_6;
								if (arg0 == 1800) {
									anIntArray259[anInt4427++] = Static86.method1383(local137).method6484();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray259[--anInt4427];
									local19--;
									if (local137.aStringArray50 != null && local19 < local137.aStringArray50.length && local137.aStringArray50[local19] != null) {
										aStringArray31[anInt4424++] = local137.aStringArray50[local19];
										return;
									}
									aStringArray31[anInt4424++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString90 == null) {
										aStringArray31[anInt4424++] = "";
										return;
									}
									aStringArray31[anInt4424++] = local137.aString90;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static223.method3278(anIntArray259[--anInt4427]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass265_7 : aClass265_6;
								}
								if (anInt4429 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray2 == null) {
										return;
									}
									@Pc(3511) Class3_Sub53 local3511 = new Class3_Sub53();
									local3511.aClass265_16 = local137;
									local3511.anObjectArray35 = local137.anObjectArray2;
									local3511.anInt10771 = anInt4429 + 1;
									Static221.aClass302_22.method6613(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static223.method3278(anIntArray259[--anInt4427]);
								if (arg0 == 2500) {
									anIntArray259[anInt4427++] = local137.anInt6993;
									return;
								}
								if (arg0 == 2501) {
									anIntArray259[anInt4427++] = local137.anInt6968;
									return;
								}
								if (arg0 == 2502) {
									anIntArray259[anInt4427++] = local137.anInt7024;
									return;
								}
								if (arg0 == 2503) {
									anIntArray259[anInt4427++] = local137.anInt6997;
									return;
								}
								if (arg0 == 2504) {
									anIntArray259[anInt4427++] = local137.aBoolean495 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray259[anInt4427++] = local137.anInt6985;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static26.method591(local137);
									anIntArray259[anInt4427++] = local158 == null ? -1 : local158.anInt7032;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static223.method3278(anIntArray259[--anInt4427]);
								if (arg0 == 2600) {
									anIntArray259[anInt4427++] = local137.anInt7033;
									return;
								}
								if (arg0 == 2601) {
									anIntArray259[anInt4427++] = local137.anInt7002;
									return;
								}
								if (arg0 == 2602) {
									aStringArray31[anInt4424++] = local137.aString86;
									return;
								}
								if (arg0 == 2603) {
									anIntArray259[anInt4427++] = local137.anInt7000;
									return;
								}
								if (arg0 == 2604) {
									anIntArray259[anInt4427++] = local137.anInt7020;
									return;
								}
								if (arg0 == 2605) {
									anIntArray259[anInt4427++] = local137.anInt6969;
									return;
								}
								if (arg0 == 2606) {
									anIntArray259[anInt4427++] = local137.anInt7030;
									return;
								}
								if (arg0 == 2607) {
									anIntArray259[anInt4427++] = local137.anInt6982;
									return;
								}
								if (arg0 == 2608) {
									anIntArray259[anInt4427++] = local137.anInt7036;
									return;
								}
								if (arg0 == 2609) {
									anIntArray259[anInt4427++] = local137.anInt6965;
									return;
								}
								if (arg0 == 2610) {
									anIntArray259[anInt4427++] = local137.anInt7037;
									return;
								}
								if (arg0 == 2611) {
									anIntArray259[anInt4427++] = local137.anInt7027;
									return;
								}
								if (arg0 == 2612) {
									anIntArray259[anInt4427++] = local137.anInt7012;
									return;
								}
								if (arg0 == 2613) {
									anIntArray259[anInt4427++] = local137.anInt6998;
									return;
								}
								if (arg0 == 2614) {
									anIntArray259[anInt4427++] = local137.anInt7023 == 1 ? local137.anInt7050 : -1;
									return;
								}
							} else {
								@Pc(4040) Class3_Sub25 local4040;
								@Pc(3938) Class3_Sub25 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static223.method3278(anIntArray259[--anInt4427]);
										anIntArray259[anInt4427++] = local137.anInt7005;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static223.method3278(anIntArray259[--anInt4427]);
										if (local137.anInt7005 != -1) {
											anIntArray259[anInt4427++] = local137.anInt7045;
											return;
										}
										anIntArray259[anInt4427++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray259[--anInt4427];
										local3938 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local13);
										if (local3938 != null) {
											anIntArray259[anInt4427++] = 1;
											return;
										}
										anIntArray259[anInt4427++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static223.method3278(anIntArray259[--anInt4427]);
										if (local137.aClass265Array4 == null) {
											anIntArray259[anInt4427++] = 0;
											return;
										}
										local19 = local137.aClass265Array4.length;
										for (local25 = 0; local25 < local137.aClass265Array4.length; local25++) {
											if (local137.aClass265Array4[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray259[anInt4427++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt4427 -= 2;
										local13 = anIntArray259[anInt4427];
										local19 = anIntArray259[anInt4427 + 1];
										local4040 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local13);
										if (local4040 != null && local4040.anInt3959 == local19) {
											anIntArray259[anInt4427++] = 1;
											return;
										}
										anIntArray259[anInt4427++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static223.method3278(anIntArray259[--anInt4427]);
									if (arg0 == 2800) {
										anIntArray259[anInt4427++] = Static86.method1383(local137).method6484();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray259[--anInt4427];
										local19--;
										if (local137.aStringArray50 != null && local19 < local137.aStringArray50.length && local137.aStringArray50[local19] != null) {
											aStringArray31[anInt4424++] = local137.aStringArray50[local19];
											return;
										}
										aStringArray31[anInt4424++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString90 == null) {
											aStringArray31[anInt4424++] = "";
											return;
										}
										aStringArray31[anInt4424++] = local137.aString90;
										return;
									}
								} else {
									@Pc(4266) Class3_Sub37 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray31[--anInt4424];
											Static207.method7399(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt4427 -= 2;
											Static220.method3263(anIntArray259[anInt4427], anIntArray259[anInt4427 + 1], Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1);
											return;
										}
										if (arg0 == 3103) {
											Static331.method4725();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray31[--anInt4424];
											local19 = 0;
											if (Static346.method5030(local4177)) {
												local19 = Static505.method6599(local4177);
											}
											@Pc(4237) Class3_Sub37 local4237 = Static90.method1509(Static488.aClass240_83, Static226.aClass144_2);
											local4237.aClass3_Sub4_Sub1_2.method7909(local19);
											Static301.method2678(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray31[--anInt4424];
											local4266 = Static90.method1509(Static9.aClass240_1, Static226.aClass144_2);
											local4266.aClass3_Sub4_Sub1_2.method7948(local4177.length() + 1);
											local4266.aClass3_Sub4_Sub1_2.method7901(local4177);
											Static301.method2678(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray31[--anInt4424];
											local4266 = Static90.method1509(Static537.aClass240_91, Static226.aClass144_2);
											local4266.aClass3_Sub4_Sub1_2.method7948(local4177.length() + 1);
											local4266.aClass3_Sub4_Sub1_2.method7901(local4177);
											Static301.method2678(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray259[--anInt4427];
											local1161 = aStringArray31[--anInt4424];
											Static144.method2347(local1161, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt4427 -= 3;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local25 = anIntArray259[anInt4427 + 2];
											local35 = Static223.method3278(local25);
											Static22.method531(local13, local19, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local210 = arg1 ? aClass265_7 : aClass265_6;
											Static22.method531(local13, local19, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray259[--anInt4427];
											local4266 = Static90.method1509(Static203.aClass240_37, Static226.aClass144_2);
											local4266.aClass3_Sub4_Sub1_2.method7956(local13);
											Static301.method2678(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local4040 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local13);
											if (local4040 != null) {
												Static186.method2905(local4040, local4040.anInt3959 != local19, true);
											}
											Static569.method7479(local19, 3, local13, true);
											return;
										}
										if (arg0 == 3112) {
											anInt4427--;
											local13 = anIntArray259[anInt4427];
											local3938 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local13);
											if (local3938 != null && local3938.anInt3966 == 3) {
												Static186.method2905(local3938, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static637.method1837(aStringArray31[--anInt4424]);
											return;
										}
										if (arg0 == 3114) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local1523 = aStringArray31[--anInt4424];
											Static390.method5455(local19, local1523, "", local13, "", "");
											return;
										}
										if (arg0 == 3115) {
											anInt4427 -= 11;
											@Pc(4567) Class266[] local4567 = Static404.method5594();
											@Pc(4570) Class131[] local4570 = Static296.method4347();
											Static236.method3577(anIntArray259[anInt4427 + 8], anIntArray259[anInt4427 + 7], anIntArray259[anInt4427 + 4], anIntArray259[anInt4427 + 2], anIntArray259[anInt4427 + 5], local4570[anIntArray259[anInt4427 + 1]], anIntArray259[anInt4427 + 3], anIntArray259[anInt4427 + 6], anIntArray259[anInt4427 + 9], anIntArray259[anInt4427 + 10], local4567[anIntArray259[anInt4427]]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray259[--anInt4427];
											local4266 = Static90.method1509(Static513.aClass240_87, Static226.aClass144_2);
											local4266.aClass3_Sub4_Sub1_2.method7956(local13);
											Static301.method2678(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray31[--anInt4424];
											local4266 = Static90.method1509(Static188.aClass240_36, Static226.aClass144_2);
											local4266.aClass3_Sub4_Sub1_2.method7948(local4177.length() + 1);
											local4266.aClass3_Sub4_Sub1_2.method7901(local4177);
											Static301.method2678(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt4427 -= 3;
											Static248.method4092(anIntArray259[anInt4427], anIntArray259[anInt4427 + 2], 255, 256, anIntArray259[anInt4427 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static353.method5114(50, 255, anIntArray259[--anInt4427]);
											return;
										}
										if (arg0 == 3202) {
											anInt4427 -= 2;
											Static511.method6668(255, anIntArray259[anInt4427], anIntArray259[anInt4427 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt4427 -= 4;
											Static248.method4092(anIntArray259[anInt4427], anIntArray259[anInt4427 + 2], anIntArray259[anInt4427 + 3], 256, anIntArray259[anInt4427 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt4427 -= 3;
											Static353.method5114(anIntArray259[anInt4427 + 2], anIntArray259[anInt4427 + 1], anIntArray259[anInt4427]);
											return;
										}
										if (arg0 == 3205) {
											anInt4427 -= 3;
											Static511.method6668(anIntArray259[anInt4427 + 2], anIntArray259[anInt4427], anIntArray259[anInt4427 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt4427 -= 4;
											Static224.method3294(256, anIntArray259[anInt4427 + 1], anIntArray259[anInt4427], anIntArray259[anInt4427 + 3], false, anIntArray259[anInt4427 + 2]);
											return;
										}
										if (arg0 == 3207) {
											anInt4427 -= 4;
											Static224.method3294(256, anIntArray259[anInt4427 + 1], anIntArray259[anInt4427], anIntArray259[anInt4427 + 3], true, anIntArray259[anInt4427 + 2]);
											return;
										}
										if (arg0 == 3208) {
											anInt4427 -= 5;
											Static248.method4092(anIntArray259[anInt4427], anIntArray259[anInt4427 + 2], anIntArray259[anInt4427 + 3], anIntArray259[anInt4427 + 4], anIntArray259[anInt4427 + 1]);
											return;
										}
										if (arg0 == 3209) {
											anInt4427 -= 5;
											Static224.method3294(anIntArray259[anInt4427 + 4], anIntArray259[anInt4427 + 1], anIntArray259[anInt4427], anIntArray259[anInt4427 + 3], false, anIntArray259[anInt4427 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray259[anInt4427++] = Static122.anInt2190;
											return;
										}
										if (arg0 == 3301) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static83.method1327(local19, local13, false);
											return;
										}
										if (arg0 == 3302) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static654.method8756(false, local19, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static569.method7482(local13, false, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static578.aClass230_1.method5294(local13).anInt10543;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static244.anIntArray256[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static375.anIntArray405[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static211.anIntArray204[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132;
											local19 = (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9) + Static534.anInt8358;
											local25 = (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9) + Static402.anInt6661;
											anIntArray259[anInt4427++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray259[anInt4427++] = Static20.aBoolean23 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static83.method1327(local19, local13, true);
											return;
										}
										if (arg0 == 3314) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static654.method8756(true, local19, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static569.method7482(local13, true, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static512.anInt8070 >= 2) {
												anIntArray259[anInt4427++] = Static512.anInt8070;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray259[anInt4427++] = Static226.anInt3963;
											return;
										}
										if (arg0 == 3318) {
											anIntArray259[anInt4427++] = Static98.aClass275_2.anInt7235;
											return;
										}
										if (arg0 == 3321) {
											anIntArray259[anInt4427++] = Static156.anInt2892;
											return;
										}
										if (arg0 == 3322) {
											anIntArray259[anInt4427++] = Static155.anInt2872;
											return;
										}
										if (arg0 == 3323) {
											if (Static154.anInt6135 >= 5 && Static154.anInt6135 <= 9) {
												anIntArray259[anInt4427++] = 1;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static154.anInt6135 >= 5 && Static154.anInt6135 <= 9) {
												anIntArray259[anInt4427++] = Static154.anInt6135;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray259[anInt4427++] = Static118.aBoolean679 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray259[anInt4427++] = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791;
											return;
										}
										if (arg0 == 3327) {
											anIntArray259[anInt4427++] = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 != null && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.aBoolean733 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray259[anInt4427++] = Static656.aBoolean736 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static18.method457(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static429.method5922(local13, local19, false);
											return;
										}
										if (arg0 == 3332) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											anIntArray259[anInt4427++] = Static429.method5922(local13, local19, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray259[anInt4427++] = Static399.anInt6574;
											return;
										}
										if (arg0 == 3335) {
											anIntArray259[anInt4427++] = Static654.anInt10668;
											return;
										}
										if (arg0 == 3336) {
											anInt4427 -= 4;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local25 = anIntArray259[anInt4427 + 2];
											local357 = anIntArray259[anInt4427 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray259[anInt4427++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray259[anInt4427++] = Static224.anInt3866;
											return;
										}
										if (arg0 == 3338) {
											anIntArray259[anInt4427++] = Static596.method5956();
											return;
										}
										if (arg0 == 3339) {
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray259[anInt4427++] = Static584.aBoolean658 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray259[anInt4427++] = Static452.aBoolean521 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray259[anInt4427++] = Static627.aClass48_1.method7512();
											return;
										}
										if (arg0 == 3343) {
											anIntArray259[anInt4427++] = Static627.aClass48_1.method7511();
											return;
										}
										if (arg0 == 3344) {
											aStringArray31[anInt4424++] = Static390.method5461();
											return;
										}
										if (arg0 == 3345) {
											aStringArray31[anInt4424++] = Static326.method4646();
											return;
										}
										if (arg0 == 3346) {
											anIntArray259[anInt4427++] = Static218.method3191();
											return;
										}
										if (arg0 == 3347) {
											anIntArray259[anInt4427++] = Static152.anInt10400;
											return;
										}
										if (arg0 == 3349) {
											anIntArray259[anInt4427++] = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass292_7.method6390() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5908) Class25 local5908;
										if (arg0 == 3400) {
											anInt4427 -= 2;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local5908 = Static597.aClass311_1.method6836(local13);
											aStringArray31[anInt4424++] = local5908.method728(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt4427 -= 4;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local25 = anIntArray259[anInt4427 + 2];
											local357 = anIntArray259[anInt4427 + 3];
											@Pc(5954) Class25 local5954 = Static597.aClass311_1.method6836(local25);
											if (local5954.aChar2 == local13 && local5954.aChar1 == local19) {
												if (local19 == 115) {
													aStringArray31[anInt4424++] = local5954.method728(local357);
													return;
												}
												anIntArray259[anInt4427++] = local5954.method725(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt4427 -= 3;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local25 = anIntArray259[anInt4427 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6040) Class25 local6040 = Static597.aClass311_1.method6836(local19);
											if (local6040.aChar1 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray259[anInt4427++] = local6040.method727(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray259[--anInt4427];
											local1161 = aStringArray31[--anInt4424];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5908 = Static597.aClass311_1.method6836(local13);
											if (local5908.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray259[anInt4427++] = local5908.method726(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray259[--anInt4427];
											@Pc(6138) Class25 local6138 = Static597.aClass311_1.method6836(local13);
											anIntArray259[anInt4427++] = local6138.aClass333_4.method7486();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static390.anInt6507 == 0) {
												anIntArray259[anInt4427++] = -2;
												return;
											}
											if (Static390.anInt6507 == 1) {
												anIntArray259[anInt4427++] = -1;
												return;
											}
											anIntArray259[anInt4427++] = Static345.anInt5912;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 == 2 && local13 < Static345.anInt5912) {
												aStringArray31[anInt4424++] = Static651.aStringArray66[local13];
												if (Static87.aStringArray15[local13] != null) {
													aStringArray31[anInt4424++] = Static87.aStringArray15[local13];
													return;
												}
												aStringArray31[anInt4424++] = "";
												return;
											}
											aStringArray31[anInt4424++] = "";
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 == 2 && local13 < Static345.anInt5912) {
												anIntArray259[anInt4427++] = Static639.anIntArray557[local13];
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 == 2 && local13 < Static345.anInt5912) {
												anIntArray259[anInt4427++] = Static413.anIntArray351[local13];
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray31[--anInt4424];
											local19 = anIntArray259[--anInt4427];
											Static565.method7435(local4177, local19);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray31[--anInt4424];
											Static475.method6318(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray31[--anInt4424];
											Static479.method7875(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray31[--anInt4424];
											Static181.method2864(false, local4177);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray31[--anInt4424];
											Static104.method1685(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray31[--anInt4424];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray259[anInt4427++] = Static299.method4367(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 == 2 && local13 < Static345.anInt5912) {
												aStringArray31[anInt4424++] = Static109.aStringArray17[local13];
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static20.aString7 != null) {
												aStringArray31[anInt4424++] = Static447.method6067(Static20.aString7);
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static20.aString7 != null) {
												anIntArray259[anInt4427++] = Static63.anInt1316;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray259[--anInt4427];
											if (Static20.aString7 != null && local13 < Static63.anInt1316) {
												aStringArray31[anInt4424++] = Static603.aClass24Array1[local13].aString9;
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray259[--anInt4427];
											if (Static20.aString7 != null && local13 < Static63.anInt1316) {
												anIntArray259[anInt4427++] = Static603.aClass24Array1[local13].anInt821;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray259[--anInt4427];
											if (Static20.aString7 != null && local13 < Static63.anInt1316) {
												anIntArray259[anInt4427++] = Static603.aClass24Array1[local13].aByte5;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray259[anInt4427++] = Static316.aByte74;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray31[--anInt4424];
											Static606.method8257(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray259[anInt4427++] = Static327.aByte78;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray31[--anInt4424];
											Static416.method5665(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static25.method587();
											return;
										}
										if (arg0 == 3621) {
											if (Static390.anInt6507 == 0) {
												anIntArray259[anInt4427++] = -1;
												return;
											}
											anIntArray259[anInt4427++] = Static31.anInt753;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 != 0 && local13 < Static31.anInt753) {
												aStringArray31[anInt4424++] = Static137.aStringArray22[local13];
												if (Static632.aStringArray64[local13] != null) {
													aStringArray31[anInt4424++] = Static632.aStringArray64[local13];
													return;
												}
												aStringArray31[anInt4424++] = "";
												return;
											}
											aStringArray31[anInt4424++] = "";
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray31[--anInt4424];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray259[anInt4427++] = Static86.method1379(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray259[--anInt4427];
											if (Static603.aClass24Array1 != null && local13 < Static63.anInt1316 && Static603.aClass24Array1[local13].aString10.equalsIgnoreCase(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25)) {
												anIntArray259[anInt4427++] = 1;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static648.aString113 != null) {
												aStringArray31[anInt4424++] = Static648.aString113;
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray259[--anInt4427];
											if (Static20.aString7 != null && local13 < Static63.anInt1316) {
												aStringArray31[anInt4424++] = Static603.aClass24Array1[local13].aString8;
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 == 2 && local13 >= 0 && local13 < Static345.anInt5912) {
												anIntArray259[anInt4427++] = Static83.aBooleanArray6[local13] ? 1 : 0;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray31[--anInt4424];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray259[anInt4427++] = Static601.method7986(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray259[anInt4427++] = Static579.anInt9385;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray31[--anInt4424];
											Static181.method2864(true, local4177);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static18.aBooleanArray1[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray259[--anInt4427];
											if (Static20.aString7 != null && local13 < Static63.anInt1316) {
												aStringArray31[anInt4424++] = Static603.aClass24Array1[local13].aString10;
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray259[--anInt4427];
											if (Static390.anInt6507 != 0 && local13 < Static31.anInt753) {
												aStringArray31[anInt4424++] = Static459.aStringArray54[local13];
												return;
											}
											aStringArray31[anInt4424++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static234.aClass342_1 != null) {
												anIntArray259[anInt4427++] = 1;
												aClass342_2 = Static234.aClass342_1;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static465.aClass342_3 != null) {
												anIntArray259[anInt4427++] = 1;
												aClass342_2 = Static465.aClass342_3;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray31[anInt4424++] = aClass342_2.aString107;
											return;
										}
										if (arg0 == 3703) {
											anIntArray259[anInt4427++] = aClass342_2.aBoolean659 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray259[anInt4427++] = aClass342_2.aByte130;
											return;
										}
										if (arg0 == 3705) {
											anIntArray259[anInt4427++] = aClass342_2.aByte127;
											return;
										}
										if (arg0 == 3706) {
											anIntArray259[anInt4427++] = aClass342_2.aByte128;
											return;
										}
										if (arg0 == 3707) {
											anIntArray259[anInt4427++] = aClass342_2.aByte129;
											return;
										}
										if (arg0 == 3709) {
											anIntArray259[anInt4427++] = aClass342_2.anInt9482;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray259[--anInt4427];
											aStringArray31[anInt4424++] = aClass342_2.aStringArray62[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = aClass342_2.aByteArray87[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray259[anInt4427++] = aClass342_2.anInt9493;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray259[--anInt4427];
											aStringArray31[anInt4424++] = aClass342_2.aStringArray61[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt4427 -= 3;
											local13 = anIntArray259[anInt4427];
											local19 = anIntArray259[anInt4427 + 1];
											local25 = anIntArray259[anInt4427 + 2];
											anIntArray259[anInt4427++] = aClass342_2.method7741(local25, local19, local13);
											return;
										}
										if (arg0 == 3715) {
											anIntArray259[anInt4427++] = aClass342_2.anInt9497;
											return;
										}
										if (arg0 == 3716) {
											anIntArray259[anInt4427++] = aClass342_2.anInt9496;
											return;
										}
										if (arg0 == 3717) {
											anIntArray259[anInt4427++] = aClass342_2.method7747(aStringArray31[--anInt4424]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray259[anInt4427 - 1] = aClass342_2.method7743()[anIntArray259[anInt4427 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static213.aClass3_Sub26_2 != null) {
												anIntArray259[anInt4427++] = 1;
												aClass3_Sub26_3 = Static213.aClass3_Sub26_2;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static121.aClass3_Sub26_1 != null) {
												anIntArray259[anInt4427++] = 1;
												aClass3_Sub26_3 = Static121.aClass3_Sub26_1;
												return;
											}
											anIntArray259[anInt4427++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray31[anInt4424++] = aClass3_Sub26_3.aString53;
											return;
										}
										if (arg0 == 3753) {
											anIntArray259[anInt4427++] = aClass3_Sub26_3.aByte66;
											return;
										}
										if (arg0 == 3754) {
											anIntArray259[anInt4427++] = aClass3_Sub26_3.aByte65;
											return;
										}
										if (arg0 == 3755) {
											anIntArray259[anInt4427++] = aClass3_Sub26_3.anInt4134;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray259[--anInt4427];
											aStringArray31[anInt4424++] = aClass3_Sub26_3.aClass78Array1[local13].aString30;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = aClass3_Sub26_3.aClass78Array1[local13].aByte39;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = aClass3_Sub26_3.aClass78Array1[local13].anInt2026;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray259[--anInt4427];
											Static356.method5148(local13, aClass3_Sub26_3 == Static121.aClass3_Sub26_1);
											return;
										}
										if (arg0 == 3760) {
											anIntArray259[anInt4427++] = aClass3_Sub26_3.method3519(aStringArray31[--anInt4424]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray259[anInt4427 - 1] = aClass3_Sub26_3.method3520()[anIntArray259[anInt4427 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static439.aClass199Array1[local13].method4558();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static439.aClass199Array1[local13].anInt5309;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static439.aClass199Array1[local13].anInt5307;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static439.aClass199Array1[local13].anInt5308;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static439.aClass199Array1[local13].anInt5311;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray259[--anInt4427];
											anIntArray259[anInt4427++] = Static439.aClass199Array1[local13].anInt5306;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray259[--anInt4427];
											local19 = Static439.aClass199Array1[local13].method4560();
											anIntArray259[anInt4427++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray259[--anInt4427];
											local19 = Static439.aClass199Array1[local13].method4560();
											anIntArray259[anInt4427++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray259[--anInt4427];
											local19 = Static439.aClass199Array1[local13].method4560();
											anIntArray259[anInt4427++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray259[--anInt4427];
											local19 = Static439.aClass199Array1[local13].method4560();
											anIntArray259[anInt4427++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8207) long local8207;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt4427 -= 5;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local25 = anIntArray259[anInt4427 + 2];
												local357 = anIntArray259[anInt4427 + 3];
												local2473 = anIntArray259[anInt4427 + 4];
												anIntArray259[anInt4427++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8214) long local8214;
											if (arg0 == 4007) {
												anInt4427 -= 2;
												local8207 = (long) anIntArray259[anInt4427];
												local8214 = (long) anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = (int) (local8207 + local8207 * local8214 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												if (local13 == 0) {
													anIntArray259[anInt4427++] = 0;
													return;
												}
												anIntArray259[anInt4427++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												if (local13 == 0) {
													anIntArray259[anInt4427++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray259[anInt4427++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray259[anInt4427++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt4427 -= 3;
												local8207 = (long) anIntArray259[anInt4427];
												local8214 = (long) anIntArray259[anInt4427 + 1];
												@Pc(8595) long local8595 = (long) anIntArray259[anInt4427 + 2];
												anIntArray259[anInt4427++] = (int) (local8207 * local8595 / local8214);
												return;
											}
											if (arg0 == 4019) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray259[anInt4427++] = 256;
												}
												@Pc(8654) double local8654 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray259[anInt4427++] = (int) (Math.pow(2.0D, local8654) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static321.anIntArray550[Static81.method8383(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray31[--anInt4424];
												local19 = anIntArray259[--anInt4427];
												aStringArray31[anInt4424++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt4424 -= 2;
												local4177 = aStringArray31[anInt4424];
												local1161 = aStringArray31[anInt4424 + 1];
												aStringArray31[anInt4424++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray31[--anInt4424];
												local19 = anIntArray259[--anInt4427];
												aStringArray31[anInt4424++] = local4177 + Static556.method7330(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray31[--anInt4424];
												aStringArray31[anInt4424++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray31[anInt4424++] = Static394.method5498(Static654.anInt10668, Static604.method8233(anIntArray259[--anInt4427]));
												return;
											}
											if (arg0 == 4105) {
												anInt4424 -= 2;
												local4177 = aStringArray31[anInt4424];
												local1161 = aStringArray31[anInt4424 + 1];
												if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 != null && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1.aBoolean733) {
													aStringArray31[anInt4424++] = local1161;
													return;
												}
												aStringArray31[anInt4424++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray259[--anInt4427];
												aStringArray31[anInt4424++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt4424 -= 2;
												anIntArray259[anInt4427++] = Static539.method6917(aStringArray31[anInt4424 + 1], aStringArray31[anInt4424], Static654.anInt10668);
												return;
											}
											@Pc(8967) Class91 local8967;
											if (arg0 == 4108) {
												local4177 = aStringArray31[--anInt4424];
												anInt4427 -= 2;
												local19 = anIntArray259[anInt4427];
												local25 = anIntArray259[anInt4427 + 1];
												local8967 = Static362.method5238(Static583.aClass362_138, local25);
												anIntArray259[anInt4427++] = local8967.method1845(Static266.aClass6Array8, local4177, local19);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray31[--anInt4424];
												anInt4427 -= 2;
												local19 = anIntArray259[anInt4427];
												local25 = anIntArray259[anInt4427 + 1];
												local8967 = Static362.method5238(Static583.aClass362_138, local25);
												anIntArray259[anInt4427++] = local8967.method1856(Static266.aClass6Array8, local4177, local19);
												return;
											}
											if (arg0 == 4110) {
												anInt4424 -= 2;
												local4177 = aStringArray31[anInt4424];
												local1161 = aStringArray31[anInt4424 + 1];
												if (anIntArray259[--anInt4427] == 1) {
													aStringArray31[anInt4424++] = local4177;
													return;
												}
												aStringArray31[anInt4424++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray31[--anInt4424];
												aStringArray31[anInt4424++] = Static495.method6507(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray31[--anInt4424];
												local19 = anIntArray259[--anInt4427];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray31[anInt4424++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = method3779((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static669.method8387((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static298.method4358((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static97.method1625((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray31[--anInt4424];
												if (local4177 != null) {
													anIntArray259[anInt4427++] = local4177.length();
													return;
												}
												anIntArray259[anInt4427++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray31[--anInt4424];
												anInt4427 -= 2;
												local19 = anIntArray259[anInt4427];
												local25 = anIntArray259[anInt4427 + 1];
												aStringArray31[anInt4424++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray31[--anInt4424];
												@Pc(9325) StringBuffer local9325 = new StringBuffer(local4177.length());
												@Pc(9327) boolean local9327 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9334) char local9334 = local4177.charAt(local357);
													if (local9334 == '<') {
														local9327 = true;
													} else if (local9334 == '>') {
														local9327 = false;
													} else if (!local9327) {
														local9325.append(local9334);
													}
												}
												aStringArray31[anInt4424++] = local9325.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray31[--anInt4424];
												anInt4427 -= 2;
												local19 = anIntArray259[anInt4427];
												local25 = anIntArray259[anInt4427 + 1];
												anIntArray259[anInt4427++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt4424 -= 2;
												local4177 = aStringArray31[anInt4424];
												local1161 = aStringArray31[anInt4424 + 1];
												local25 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray259[--anInt4427] != 0;
												local19 = anIntArray259[--anInt4427];
												aStringArray31[anInt4424++] = Static106.method1696(Static654.anInt10668, 0, (long) local19, local420);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray31[--anInt4424];
												local19 = anIntArray259[--anInt4427];
												@Pc(9548) Class91 local9548 = Static362.method5238(Static583.aClass362_138, local19);
												anIntArray259[anInt4427++] = local9548.method1857(local4177, Static266.aClass6Array8);
												return;
											}
											if (arg0 == 4126) {
												aStringArray31[anInt4424++] = Static355.method5146((long) anIntArray259[--anInt4427] * 60000L, Static654.anInt10668) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8207 = aLongArray10[--anInt4420];
												aStringArray31[anInt4424++] = local8207 == -1L ? "" : Long.toString(local8207, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray259[--anInt4427];
												aStringArray31[anInt4424++] = Static117.aClass197_2.method4518(local13).aString6;
												return;
											}
											@Pc(9671) Class15 local9671;
											if (arg0 == 4201) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local9671 = Static117.aClass197_2.method4518(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray5[local19 - 1] != null) {
													aStringArray31[anInt4424++] = local9671.aStringArray5[local19 - 1];
													return;
												}
												aStringArray31[anInt4424++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local9671 = Static117.aClass197_2.method4518(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray4[local19 - 1] != null) {
													aStringArray31[anInt4424++] = local9671.aStringArray4[local19 - 1];
													return;
												}
												aStringArray31[anInt4424++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static117.aClass197_2.method4518(local13).anInt461;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static117.aClass197_2.method4518(local13).anInt454 == 1 ? 1 : 0;
												return;
											}
											@Pc(9834) Class15 local9834;
											if (arg0 == 4205) {
												local13 = anIntArray259[--anInt4427];
												local9834 = Static117.aClass197_2.method4518(local13);
												if (local9834.anInt436 == -1 && local9834.anInt476 >= 0) {
													anIntArray259[anInt4427++] = local9834.anInt476;
													return;
												}
												anIntArray259[anInt4427++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray259[--anInt4427];
												local9834 = Static117.aClass197_2.method4518(local13);
												if (local9834.anInt436 >= 0 && local9834.anInt476 >= 0) {
													anIntArray259[anInt4427++] = local9834.anInt476;
													return;
												}
												anIntArray259[anInt4427++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static117.aClass197_2.method4518(local13).aBoolean22 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local3242 = Static389.aClass335_2.method7504(local19);
												if (local3242.method6170()) {
													aStringArray31[anInt4424++] = Static117.aClass197_2.method4518(local13).method466(local3242.aString92, local19);
													return;
												}
												anIntArray259[anInt4427++] = Static117.aClass197_2.method4518(local13).method461(local3242.anInt7362, local19);
												return;
											}
											if (arg0 == 4209) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1] - 1;
												local9671 = Static117.aClass197_2.method4518(local13);
												if (local9671.anInt468 == local19) {
													anIntArray259[anInt4427++] = local9671.anInt470;
													return;
												}
												if (local9671.anInt463 == local19) {
													anIntArray259[anInt4427++] = local9671.anInt422;
													return;
												}
												anIntArray259[anInt4427++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray31[--anInt4424];
												local19 = anIntArray259[--anInt4427];
												Static332.method4727(local19 == 1, local4177);
												anIntArray259[anInt4427++] = Static41.anInt867;
												return;
											}
											if (arg0 == 4211) {
												if (Static413.aShortArray74 != null && Static553.anInt8951 < Static41.anInt867) {
													anIntArray259[anInt4427++] = Static413.aShortArray74[Static553.anInt8951++] & 0xFFFF;
													return;
												}
												anIntArray259[anInt4427++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static553.anInt8951 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray259[--anInt4427];
												anIntArray259[anInt4427++] = Static117.aClass197_2.method4518(local13).anInt450;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray31[--anInt4424];
												anInt4427 -= 3;
												local19 = anIntArray259[anInt4427];
												local25 = anIntArray259[anInt4427 + 1];
												local357 = anIntArray259[anInt4427 + 2];
												Static10.method336(local357, local4177, local25, local19 == 1);
												anIntArray259[anInt4427++] = Static41.anInt867;
												return;
											}
											if (arg0 == 4215) {
												anInt4424 -= 2;
												anInt4427 -= 2;
												local4177 = aStringArray31[anInt4424];
												local19 = anIntArray259[anInt4427];
												local25 = anIntArray259[anInt4427 + 1];
												@Pc(10233) String local10233 = aStringArray31[anInt4424 + 1];
												Static402.method5587(local19 == 1, local25, local10233, local4177);
												anIntArray259[anInt4427++] = Static41.anInt867;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local3242 = Static389.aClass335_2.method7504(local19);
												if (local3242.method6170()) {
													aStringArray31[anInt4424++] = Static267.aClass196_1.method4478(local13).method5762(local3242.aString92, local19);
													return;
												}
												anIntArray259[anInt4427++] = Static267.aClass196_1.method4478(local13).method5769(local3242.anInt7362, local19);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local3242 = Static389.aClass335_2.method7504(local19);
												if (local3242.method6170()) {
													aStringArray31[anInt4424++] = Static466.aClass340_6.method7665(local13).method5051(local19, local3242.aString92);
													return;
												}
												anIntArray259[anInt4427++] = Static466.aClass340_6.method7665(local13).method5038(local3242.anInt7362, local19);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt4427 -= 2;
												local13 = anIntArray259[anInt4427];
												local19 = anIntArray259[anInt4427 + 1];
												local3242 = Static389.aClass335_2.method7504(local19);
												if (local3242.method6170()) {
													aStringArray31[anInt4424++] = Static88.aClass273_1.method6039(local13).method3576(local19, local3242.aString92);
													return;
												}
												anIntArray259[anInt4427++] = Static88.aClass273_1.method6039(local13).method3578(local3242.anInt7362, local19);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray259[--anInt4427];
												@Pc(10461) Class286 local10461 = Static461.aClass223_42.method5169(local13);
												if (local10461.anIntArray408 != null && local10461.anIntArray408.length > 0) {
													local25 = 0;
													local357 = local10461.anIntArray409[0];
													for (local2473 = 1; local2473 < local10461.anIntArray408.length; local2473++) {
														if (local10461.anIntArray409[local2473] > local357) {
															local25 = local2473;
															local357 = local10461.anIntArray409[local2473];
														}
													}
													anIntArray259[anInt4427++] = local10461.anIntArray408[local25];
													return;
												}
												anIntArray259[anInt4427++] = local10461.anInt7516;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray259[anInt4427++] = Static15.aBoolean15 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray31[--anInt4424];
												if (Static221.anInt3831 == 7 && Static474.anInt7575 == 0) {
													if (local4177.length() > 20) {
														Static389.aByte90 = -4;
														return;
													}
													Static389.aByte90 = -1;
													local4266 = Static90.method1509(Static52.aClass240_20, Static226.aClass144_2);
													local4266.aClass3_Sub4_Sub1_2.method7948(0);
													local25 = local4266.aClass3_Sub4_Sub1_2.anInt9739;
													local4266.aClass3_Sub4_Sub1_2.method7901(local4177);
													local4266.aClass3_Sub4_Sub1_2.method7949(local4266.aClass3_Sub4_Sub1_2.anInt9739 - local25);
													Static301.method2678(local4266);
													return;
												}
												Static389.aByte90 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray259[anInt4427++] = Static389.aByte90;
												if (Static389.aByte90 != -1) {
													Static389.aByte90 = -6;
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
							local137 = Static223.method3278(anIntArray259[--anInt4427]);
						} else {
							local137 = arg1 ? aClass265_7 : aClass265_6;
						}
						if (arg0 == 1300) {
							local19 = anIntArray259[--anInt4427] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5907(local19, aStringArray31[--anInt4424]);
								return;
							}
							anInt4424--;
							return;
						}
						if (arg0 == 1301) {
							anInt4427 -= 2;
							local19 = anIntArray259[anInt4427];
							local25 = anIntArray259[anInt4427 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass265_10 = null;
								return;
							}
							local137.aClass265_10 = Static212.method3145(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray259[--anInt4427];
							if (local19 != Static178.anInt3276 && local19 != Static480.anInt7636 && local19 != Static58.anInt9437) {
								return;
							}
							local137.anInt7007 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt7031 = anIntArray259[--anInt4427];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6978 = anIntArray259[--anInt4427];
							return;
						}
						if (arg0 == 1305) {
							local137.aString90 = aStringArray31[--anInt4424];
							return;
						}
						if (arg0 == 1306) {
							local137.aString89 = aStringArray31[--anInt4424];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray50 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt7028 = anIntArray259[--anInt4427];
							local137.anInt7006 = anIntArray259[--anInt4427];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray259[--anInt4427];
							local25 = anIntArray259[--anInt4427];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5913(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString88 = aStringArray31[--anInt4424];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6977 = anIntArray259[--anInt4427];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4427 -= 3;
								local19 = anIntArray259[anInt4427] - 1;
								local25 = anIntArray259[anInt4427 + 1];
								local357 = anIntArray259[anInt4427 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4427 -= 2;
								local19 = 10;
								local25 = anIntArray259[anInt4427];
								local357 = anIntArray259[anInt4427 + 1];
							}
							if (local137.aByteArray65 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray65 = new byte[11];
								local137.aByteArray64 = new byte[11];
								local137.anIntArray375 = new int[11];
							}
							local137.aByteArray65[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean504 = false;
								for (local2473 = 0; local2473 < local137.aByteArray65.length; local2473++) {
									if (local137.aByteArray65[local2473] != 0) {
										local137.aBoolean504 = true;
										break;
									}
								}
							} else {
								local137.aBoolean504 = true;
							}
							local137.aByteArray64[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt7001 = anIntArray259[--anInt4427];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static223.method3278(anIntArray259[--anInt4427]);
				} else {
					local137 = arg1 ? aClass265_7 : aClass265_6;
				}
				if (arg0 == 1000) {
					anInt4427 -= 4;
					local137.anInt7048 = anIntArray259[anInt4427];
					local137.anInt7035 = anIntArray259[anInt4427 + 1];
					local19 = anIntArray259[anInt4427 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray259[anInt4427 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte108 = (byte) local19;
					local137.aByte109 = (byte) local25;
					Static218.method3194(local137);
					Static119.method1811(local137);
					if (local137.anInt7004 == -1) {
						Static94.method1607(local137.anInt7032);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4427 -= 4;
					local137.anInt7011 = anIntArray259[anInt4427];
					local137.anInt6990 = anIntArray259[anInt4427 + 1];
					local137.anInt7043 = 0;
					local137.anInt6963 = 0;
					local19 = anIntArray259[anInt4427 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray259[anInt4427 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte110 = (byte) local19;
					local137.aByte111 = (byte) local25;
					Static218.method3194(local137);
					Static119.method1811(local137);
					if (local137.anInt6967 == 0) {
						Static463.method6195(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray259[--anInt4427] == 1;
					if (local137.aBoolean495 != local661) {
						local137.aBoolean495 = local661;
						Static218.method3194(local137);
					}
					if (local137.anInt7004 == -1) {
						Static396.method5507(local137.anInt7032);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4427 -= 2;
					local137.anInt6976 = anIntArray259[anInt4427];
					local137.anInt7003 = anIntArray259[anInt4427 + 1];
					Static218.method3194(local137);
					Static119.method1811(local137);
					if (local137.anInt6967 == 0) {
						Static463.method6195(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.lb = anIntArray259[--anInt4427] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(C)I")
	private static int method3779(@OriginalArg(0) char arg0) {
		return Static95.method7685(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	private static void method3780(@OriginalArg(0) int arg0) {
		@Pc(3) Class265 local3 = Static223.method3278(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class265[] local13 = Static78.aClass265ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class265[] local19 = Static270.aClass265ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static78.aClass265ArrayArray1[local9] = new Class265[local22];
			Static681.method4033(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static681.method4033(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()V")
	public static void method3781() {
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)I")
	private static int method3782(@OriginalArg(0) int arg0) {
		@Pc(4) Class120 local4 = Static286.aClass319_1.method6997(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass342_2.method7735(Static227.aClass203_4.anInt5389 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar3 == 'i' || local4.aChar3 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3783(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static512.anInt8070 == 0 && (Static511.aBoolean563 && !Static14.aBoolean14 || Static656.aBoolean736)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static114.aClass84_47.method1729(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static114.aClass84_47.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_48.method1729(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static114.aClass84_48.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_49.method1729(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static114.aClass84_49.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_50.method1729(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static114.aClass84_50.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_51.method1729(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static114.aClass84_51.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_52.method1729(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static114.aClass84_52.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_53.method1729(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static114.aClass84_53.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_54.method1729(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static114.aClass84_54.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_55.method1729(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static114.aClass84_55.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_56.method1729(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static114.aClass84_56.method1729(0).length());
		} else if (local11.startsWith(Class84.lb.method1729(0))) {
			local13 = 10;
			arg0 = arg0.substring(Class84.lb.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_57.method1729(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static114.aClass84_57.method1729(0).length());
		} else if (Static654.anInt10668 != 0) {
			if (local11.startsWith(Static114.aClass84_47.method1729(Static654.anInt10668))) {
				local13 = 0;
				arg0 = arg0.substring(Static114.aClass84_47.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_48.method1729(Static654.anInt10668))) {
				local13 = 1;
				arg0 = arg0.substring(Static114.aClass84_48.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_49.method1729(Static654.anInt10668))) {
				local13 = 2;
				arg0 = arg0.substring(Static114.aClass84_49.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_50.method1729(Static654.anInt10668))) {
				local13 = 3;
				arg0 = arg0.substring(Static114.aClass84_50.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_51.method1729(Static654.anInt10668))) {
				local13 = 4;
				arg0 = arg0.substring(Static114.aClass84_51.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_52.method1729(Static654.anInt10668))) {
				local13 = 5;
				arg0 = arg0.substring(Static114.aClass84_52.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_53.method1729(Static654.anInt10668))) {
				local13 = 6;
				arg0 = arg0.substring(Static114.aClass84_53.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_54.method1729(Static654.anInt10668))) {
				local13 = 7;
				arg0 = arg0.substring(Static114.aClass84_54.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_55.method1729(Static654.anInt10668))) {
				local13 = 8;
				arg0 = arg0.substring(Static114.aClass84_55.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_56.method1729(Static654.anInt10668))) {
				local13 = 9;
				arg0 = arg0.substring(Static114.aClass84_56.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Class84.lb.method1729(Static654.anInt10668))) {
				local13 = 10;
				arg0 = arg0.substring(Class84.lb.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_57.method1729(Static654.anInt10668))) {
				local13 = 11;
				arg0 = arg0.substring(Static114.aClass84_57.method1729(Static654.anInt10668).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static114.aClass84_58.method1729(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static114.aClass84_58.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_59.method1729(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static114.aClass84_59.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_60.method1729(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static114.aClass84_60.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_61.method1729(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static114.aClass84_61.method1729(0).length());
		} else if (local11.startsWith(Static114.aClass84_62.method1729(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static114.aClass84_62.method1729(0).length());
		} else if (Static654.anInt10668 != 0) {
			if (local11.startsWith(Static114.aClass84_58.method1729(Static654.anInt10668))) {
				local451 = 1;
				arg0 = arg0.substring(Static114.aClass84_58.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_59.method1729(Static654.anInt10668))) {
				local451 = 2;
				arg0 = arg0.substring(Static114.aClass84_59.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_60.method1729(Static654.anInt10668))) {
				local451 = 3;
				arg0 = arg0.substring(Static114.aClass84_60.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_61.method1729(Static654.anInt10668))) {
				local451 = 4;
				arg0 = arg0.substring(Static114.aClass84_61.method1729(Static654.anInt10668).length());
			} else if (local11.startsWith(Static114.aClass84_62.method1729(Static654.anInt10668))) {
				local451 = 5;
				arg0 = arg0.substring(Static114.aClass84_62.method1729(Static654.anInt10668).length());
			}
		}
		@Pc(641) Class3_Sub37 local641 = Static90.method1509(Static287.aClass240_49, Static226.aClass144_2);
		local641.aClass3_Sub4_Sub1_2.method7948(0);
		@Pc(650) int local650 = local641.aClass3_Sub4_Sub1_2.anInt9739;
		local641.aClass3_Sub4_Sub1_2.method7948(local13);
		local641.aClass3_Sub4_Sub1_2.method7948(local451);
		Static332.method4726(arg0, local641.aClass3_Sub4_Sub1_2);
		local641.aClass3_Sub4_Sub1_2.method7949(local641.aClass3_Sub4_Sub1_2.anInt9739 - local650);
		Static301.method2678(local641);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IZ)V")
	public static void method3784() {
	}
}
