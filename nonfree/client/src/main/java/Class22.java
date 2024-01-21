import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JULFQTYK")
public final class Class22 {

	@OriginalMember(owner = "client!JULFQTYK", name = "b", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!JULFQTYK", name = "c", descriptor = "[Lclient!JULFQTYK;")
	private static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!JULFQTYK", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "I")
	private static int anInt237 = 217;

	@OriginalMember(owner = "client!JULFQTYK", name = "d", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!JULFQTYK", name = "e", descriptor = "Lclient!VPIFXIOD;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!JULFQTYK", name = "f", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!JULFQTYK", name = "g", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!JULFQTYK", name = "h", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!JULFQTYK", name = "i", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!JULFQTYK", name = "j", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "(I)V")
	public static void method165(@OriginalArg(0) int arg0) {
		aClass22Array1 = new Class22[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	@OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "([BZ)V")
	public static void method166(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class10_Sub1_Sub3 local7 = new Class10_Sub1_Sub3(true, arg0);
			local7.anInt428 = arg0.length - 8;
			@Pc(16) int local16 = local7.method313();
			@Pc(19) int local19 = local7.method313();
			@Pc(22) int local22 = local7.method313();
			@Pc(28) int local28 = local7.method313();
			@Pc(36) Class10_Sub1_Sub3 local36 = new Class10_Sub1_Sub3(true, arg0);
			local36.anInt428 = 0;
			@Pc(45) int local45 = local16 + 0 + 2;
			@Pc(51) Class10_Sub1_Sub3 local51 = new Class10_Sub1_Sub3(true, arg0);
			local51.anInt428 = local45;
			@Pc(58) int local58 = local45 + local19;
			@Pc(64) Class10_Sub1_Sub3 local64 = new Class10_Sub1_Sub3(true, arg0);
			local64.anInt428 = local58;
			@Pc(71) int local71 = local58 + local22;
			@Pc(77) Class10_Sub1_Sub3 local77 = new Class10_Sub1_Sub3(true, arg0);
			local77.anInt428 = local71;
			@Pc(84) int local84 = local71 + local28;
			@Pc(90) Class10_Sub1_Sub3 local90 = new Class10_Sub1_Sub3(true, arg0);
			local90.anInt428 = local84;
			@Pc(99) Class42 local99 = new Class42(local90, 0);
			@Pc(102) int local102 = local36.method313();
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
				@Pc(121) int local121 = local36.method313();
				@Pc(129) Class22 local129 = aClass22Array1[local121] = new Class22();
				local129.anInt238 = local77.method311();
				local129.aClass42_1 = local99;
				@Pc(139) int local139 = local36.method311();
				@Pc(141) int local141 = -1;
				@Pc(143) int local143 = 0;
				@Pc(150) int local150;
				for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
					local150 = local51.method311();
					if (local150 > 0) {
						if (local99.anIntArray172[local145] != 0) {
							for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray172[local161] == 0) {
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
						if (local99.anIntArray172[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local64.method324();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local64.method324();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local64.method324();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray172[local145] == 5) {
							aBooleanArray3[local121] = false;
						}
					}
				}
				local129.anInt239 = local143;
				local129.anIntArray81 = new int[local143];
				local129.anIntArray82 = new int[local143];
				local129.anIntArray83 = new int[local143];
				local129.anIntArray84 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray81[local150] = local105[local150];
					local129.anIntArray82[local150] = local108[local150];
					local129.anIntArray83[local150] = local111[local150];
					local129.anIntArray84[local150] = local114[local150];
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("6319, " + arg0 + ", " + true + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "(Z)V")
	public static void method167() {
		try {
			aClass22Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("60321, " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JULFQTYK", name = "b", descriptor = "(I)Lclient!JULFQTYK;")
	public static Class22 method168(@OriginalArg(0) int arg0) {
		return aClass22Array1 == null ? null : aClass22Array1[arg0];
	}

	@OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "(ZI)Z")
	public static boolean method169(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				aBoolean75 = !aBoolean75;
			}
			return arg1 == -1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("71201, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JULFQTYK", name = "<init>", descriptor = "()V")
	private Class22() {
	}
}
