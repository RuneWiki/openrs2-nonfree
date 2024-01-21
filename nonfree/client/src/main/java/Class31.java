import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RLONYBCF")
public final class Class31 {

	@OriginalMember(owner = "client!RLONYBCF", name = "b", descriptor = "[Lclient!RLONYBCF;")
	private static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!RLONYBCF", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "I")
	private static int anInt581 = 536;

	@OriginalMember(owner = "client!RLONYBCF", name = "c", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!RLONYBCF", name = "d", descriptor = "Lclient!WHXBCNTD;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!RLONYBCF", name = "e", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!RLONYBCF", name = "f", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!RLONYBCF", name = "g", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!RLONYBCF", name = "h", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!RLONYBCF", name = "i", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "(I)V")
	public static void method384(@OriginalArg(0) int arg0) {
		aClass31Array1 = new Class31[arg0 + 1];
		aBooleanArray10 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray10[local11] = true;
		}
	}

	@OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "(I[B)V")
	public static void method385(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, anInt581);
			local7.anInt78 = arg0.length - 8;
			@Pc(16) int local16 = local7.method57();
			@Pc(19) int local19 = local7.method57();
			@Pc(22) int local22 = local7.method57();
			@Pc(25) int local25 = local7.method57();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, anInt581);
			local33.anInt78 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(51) Class1_Sub1_Sub3 local51 = new Class1_Sub1_Sub3(arg0, anInt581);
			local51.anInt78 = local42;
			@Pc(58) int local58 = local42 + local19;
			@Pc(64) Class1_Sub1_Sub3 local64 = new Class1_Sub1_Sub3(arg0, anInt581);
			local64.anInt78 = local58;
			@Pc(71) int local71 = local58 + local22;
			@Pc(77) Class1_Sub1_Sub3 local77 = new Class1_Sub1_Sub3(arg0, anInt581);
			local77.anInt78 = local71;
			@Pc(84) int local84 = local71 + local25;
			@Pc(90) Class1_Sub1_Sub3 local90 = new Class1_Sub1_Sub3(arg0, anInt581);
			local90.anInt78 = local84;
			@Pc(99) Class42 local99 = new Class42(local90, -890);
			@Pc(102) int local102 = local33.method57();
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
				@Pc(121) int local121 = local33.method57();
				@Pc(129) Class31 local129 = aClass31Array1[local121] = new Class31();
				local129.anInt582 = local77.method55();
				local129.aClass42_1 = local99;
				@Pc(139) int local139 = local33.method55();
				@Pc(141) int local141 = -1;
				@Pc(143) int local143 = 0;
				@Pc(150) int local150;
				for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
					local150 = local51.method55();
					if (local150 > 0) {
						if (local99.anIntArray188[local145] != 0) {
							for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray188[local161] == 0) {
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
						if (local99.anIntArray188[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local64.method68();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local64.method68();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local64.method68();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray188[local145] == 5) {
							aBooleanArray10[local121] = false;
						}
					}
				}
				local129.anInt583 = local143;
				local129.anIntArray147 = new int[local143];
				local129.anIntArray148 = new int[local143];
				local129.anIntArray149 = new int[local143];
				local129.anIntArray150 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray147[local150] = local105[local150];
					local129.anIntArray148[local150] = local108[local150];
					local129.anIntArray149[local150] = local111[local150];
					local129.anIntArray150[local150] = local114[local150];
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("61144, " + 333 + ", " + arg0 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLONYBCF", name = "b", descriptor = "(I)V")
	public static void method386() {
		try {
			aClass31Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("43483, " + -876 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLONYBCF", name = "c", descriptor = "(I)Lclient!RLONYBCF;")
	public static Class31 method387(@OriginalArg(0) int arg0) {
		return aClass31Array1 == null ? null : aClass31Array1[arg0];
	}

	@OriginalMember(owner = "client!RLONYBCF", name = "a", descriptor = "(ZI)Z")
	public static boolean method388(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			return arg1 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("13329, " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLONYBCF", name = "<init>", descriptor = "()V")
	private Class31() {
	}
}
