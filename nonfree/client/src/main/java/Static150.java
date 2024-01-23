import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "Lclient!gi;")
	public static Class39 aClass39_4;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "[Lclient!lj;")
	public static Class60[] aClass60Array36;

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lclient!cf;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lclient!ud;")
	public static Class96 aClass96_4;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_937 = Static184.method2923(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lclient!wi;")
	public static Class108 aClass108_13 = new Class108();

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Lclient!gd;II)V")
	public static void method2346(@OriginalArg(0) int arg0, @OriginalArg(1) Class37[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(12) int local12 = arg0 - 1;
		@Pc(18) int local18 = (arg0 + arg2) / 2;
		@Pc(22) int local22 = arg2 + 1;
		@Pc(26) Class37 local26 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local26;
		while (local12 < local22) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(75) int local75;
			@Pc(58) int local58;
			do {
				local22--;
				for (local43 = 0; local43 < 4; local43++) {
					if (Static25.anIntArray495[local43] == 2) {
						local75 = arg1[local22].anInt1669;
						local58 = local26.anInt1669;
					} else if (Static25.anIntArray495[local43] == 1) {
						local58 = local26.anInt1667;
						if (local58 == -1 && Static78.anIntArray196[local43] == 1) {
							local58 = 2001;
						}
						local75 = arg1[local22].anInt1667;
						if (local75 == -1 && Static78.anIntArray196[local43] == 1) {
							local75 = 2001;
						}
					} else if (Static25.anIntArray495[local43] == 3) {
						local75 = arg1[local22].aBoolean91 ? 1 : 0;
						local58 = local26.aBoolean91 ? 1 : 0;
					} else {
						local75 = arg1[local22].anInt1671;
						local58 = local26.anInt1671;
					}
					if (local75 != local58) {
						if ((Static78.anIntArray196[local43] != 1 || local75 <= local58) && (Static78.anIntArray196[local43] != 0 || local75 >= local58)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local12++;
				for (local43 = 0; local43 < 4; local43++) {
					if (Static25.anIntArray495[local43] == 2) {
						local75 = arg1[local12].anInt1669;
						local58 = local26.anInt1669;
					} else if (Static25.anIntArray495[local43] == 1) {
						local75 = arg1[local12].anInt1667;
						if (local75 == -1 && Static78.anIntArray196[local43] == 1) {
							local75 = 2001;
						}
						local58 = local26.anInt1667;
						if (local58 == -1 && Static78.anIntArray196[local43] == 1) {
							local58 = 2001;
						}
					} else if (Static25.anIntArray495[local43] == 3) {
						local75 = arg1[local12].aBoolean91 ? 1 : 0;
						local58 = local26.aBoolean91 ? 1 : 0;
					} else {
						local75 = arg1[local12].anInt1671;
						local58 = local26.anInt1671;
					}
					if (local75 != local58) {
						if ((Static78.anIntArray196[local43] != 1 || local75 >= local58) && (Static78.anIntArray196[local43] != 0 || local75 <= local58)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local22 > local12) {
				@Pc(335) Class37 local335 = arg1[local12];
				arg1[local12] = arg1[local22];
				arg1[local22] = local335;
			}
		}
		method2346(arg0, arg1, local22);
		method2346(local22 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	public static void method2347() {
		for (@Pc(3) int local3 = 0; local3 < Static50.anInt2134; local3++) {
			@Pc(9) int local9 = Static23.anIntArray47[local3];
			@Pc(13) Class12_Sub3_Sub2 local13 = Static199.aClass12_Sub3_Sub2Array1[local9];
			if (local13 != null) {
				Static67.method1228(local13.aClass2_Sub2_Sub12_1.anInt2676, local13);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Lclient!eb;")
	public static Class2_Sub2_Sub6 method2351(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub2_Sub6 local6 = (Class2_Sub2_Sub6) Static1.aClass43_18.method1464((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static178.aClass15_37.method387(Static177.method2841(arg0), Static166.method2405(arg0));
		local6 = new Class2_Sub2_Sub6();
		if (local29 != null) {
			local6.method897(new Class2_Sub3(local29));
		}
		Static1.aClass43_18.method1462((long) arg0, local6);
		return local6;
	}
}
