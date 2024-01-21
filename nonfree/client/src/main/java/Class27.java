import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NFWEZFJY")
public final class Class27 {

	@OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "Z")
	private static boolean aBoolean92;

	@OriginalMember(owner = "client!NFWEZFJY", name = "b", descriptor = "[Lclient!NFWEZFJY;")
	private static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!NFWEZFJY", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!NFWEZFJY", name = "c", descriptor = "I")
	public int anInt345;

	@OriginalMember(owner = "client!NFWEZFJY", name = "d", descriptor = "Lclient!MJPGHGEY;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!NFWEZFJY", name = "e", descriptor = "I")
	public int anInt346;

	@OriginalMember(owner = "client!NFWEZFJY", name = "f", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!NFWEZFJY", name = "g", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!NFWEZFJY", name = "h", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!NFWEZFJY", name = "i", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "(I)V")
	public static void method181(@OriginalArg(0) int arg0) {
		aClass27Array1 = new Class27[arg0 + 1];
		aBooleanArray6 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray6[local11] = true;
		}
	}

	@OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "([BZ)V")
	public static void method182(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(7) Class6_Sub1_Sub4 local7 = new Class6_Sub1_Sub4(888, arg0);
			local7.anInt390 = arg0.length - 8;
			@Pc(16) int local16 = local7.method241();
			@Pc(19) int local19 = local7.method241();
			@Pc(22) int local22 = local7.method241();
			@Pc(25) int local25 = local7.method241();
			@Pc(33) Class6_Sub1_Sub4 local33 = new Class6_Sub1_Sub4(888, arg0);
			local33.anInt390 = 0;
			@Pc(42) int local42 = 0 + local16 + 2;
			@Pc(48) Class6_Sub1_Sub4 local48 = new Class6_Sub1_Sub4(888, arg0);
			local48.anInt390 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class6_Sub1_Sub4 local61 = new Class6_Sub1_Sub4(888, arg0);
			local61.anInt390 = local55;
			if (arg1) {
				local42 = local55 + local22;
				@Pc(77) Class6_Sub1_Sub4 local77 = new Class6_Sub1_Sub4(888, arg0);
				local77.anInt390 = local42;
				local42 += local25;
				@Pc(90) Class6_Sub1_Sub4 local90 = new Class6_Sub1_Sub4(888, arg0);
				local90.anInt390 = local42;
				@Pc(99) Class26 local99 = new Class26(local90, 0);
				@Pc(102) int local102 = local33.method241();
				@Pc(105) int[] local105 = new int[500];
				@Pc(108) int[] local108 = new int[500];
				@Pc(111) int[] local111 = new int[500];
				@Pc(114) int[] local114 = new int[500];
				for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
					@Pc(121) int local121 = local33.method241();
					@Pc(129) Class27 local129 = aClass27Array1[local121] = new Class27();
					local129.anInt345 = local77.method239();
					local129.aClass26_1 = local99;
					@Pc(139) int local139 = local33.method239();
					@Pc(141) int local141 = -1;
					@Pc(143) int local143 = 0;
					@Pc(150) int local150;
					for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
						local150 = local48.method239();
						if (local150 > 0) {
							if (local99.anIntArray111[local145] != 0) {
								for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
									if (local99.anIntArray111[local161] == 0) {
										local105[local143] = local161;
										local108[local143] = 0;
										local111[local143] = 0;
										local114[local143] = 0;
										local143++;
										break;
									}
								}
							}
							local105[local143] = local145;
							@Pc(197) short local197 = 0;
							if (local99.anIntArray111[local145] == 3) {
								local197 = 128;
							}
							if ((local150 & 0x1) == 0) {
								local108[local143] = local197;
							} else {
								local108[local143] = local61.method252();
							}
							if ((local150 & 0x2) == 0) {
								local111[local143] = local197;
							} else {
								local111[local143] = local61.method252();
							}
							if ((local150 & 0x4) == 0) {
								local114[local143] = local197;
							} else {
								local114[local143] = local61.method252();
							}
							local141 = local145;
							local143++;
							if (local99.anIntArray111[local145] == 5) {
								aBooleanArray6[local121] = false;
							}
						}
					}
					local129.anInt346 = local143;
					local129.anIntArray113 = new int[local143];
					local129.anIntArray114 = new int[local143];
					local129.anIntArray115 = new int[local143];
					local129.anIntArray116 = new int[local143];
					for (local150 = 0; local150 < local143; local150++) {
						local129.anIntArray113[local150] = local105[local150];
						local129.anIntArray114[local150] = local108[local150];
						local129.anIntArray115[local150] = local111[local150];
						local129.anIntArray116[local150] = local114[local150];
					}
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("44316, " + arg0 + ", " + arg1 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "(Z)V")
	public static void method183() {
		try {
			aClass27Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("35776, " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NFWEZFJY", name = "b", descriptor = "(I)Lclient!NFWEZFJY;")
	public static Class27 method184(@OriginalArg(0) int arg0) {
		return aClass27Array1 == null ? null : aClass27Array1[arg0];
	}

	@OriginalMember(owner = "client!NFWEZFJY", name = "a", descriptor = "(ZI)Z")
	public static boolean method185(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("28155, " + true + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NFWEZFJY", name = "<init>", descriptor = "()V")
	private Class27() {
	}
}
