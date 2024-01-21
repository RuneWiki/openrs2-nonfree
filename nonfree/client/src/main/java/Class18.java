import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KDJQGGIG")
public final class Class18 {

	@OriginalMember(owner = "client!KDJQGGIG", name = "b", descriptor = "[Lclient!KDJQGGIG;")
	private static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!KDJQGGIG", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!KDJQGGIG", name = "a", descriptor = "I")
	private static int anInt395 = 732;

	@OriginalMember(owner = "client!KDJQGGIG", name = "c", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!KDJQGGIG", name = "d", descriptor = "Lclient!USEDATIW;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!KDJQGGIG", name = "e", descriptor = "I")
	public int anInt397;

	@OriginalMember(owner = "client!KDJQGGIG", name = "f", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!KDJQGGIG", name = "g", descriptor = "[I")
	public int[] anIntArray107;

	@OriginalMember(owner = "client!KDJQGGIG", name = "h", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!KDJQGGIG", name = "i", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!KDJQGGIG", name = "a", descriptor = "(I)V")
	public static void method206(@OriginalArg(0) int arg0) {
		aClass18Array1 = new Class18[arg0 + 1];
		aBooleanArray5 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray5[local11] = true;
		}
	}

	@OriginalMember(owner = "client!KDJQGGIG", name = "a", descriptor = "([BZ)V")
	public static void method207(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3((byte) -103, arg0);
			local7.anInt441 = arg0.length - 8;
			@Pc(16) int local16 = local7.method276();
			@Pc(19) int local19 = local7.method276();
			@Pc(22) int local22 = local7.method276();
			@Pc(25) int local25 = local7.method276();
			@Pc(33) Class3_Sub1_Sub3 local33 = new Class3_Sub1_Sub3((byte) -103, arg0);
			local33.anInt441 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class3_Sub1_Sub3 local48 = new Class3_Sub1_Sub3((byte) -103, arg0);
			local48.anInt441 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class3_Sub1_Sub3 local61 = new Class3_Sub1_Sub3((byte) -103, arg0);
			local61.anInt441 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(77) Class3_Sub1_Sub3 local77 = new Class3_Sub1_Sub3((byte) -103, arg0);
			local77.anInt441 = local68;
			@Pc(84) int local84 = local68 + local25;
			@Pc(90) Class3_Sub1_Sub3 local90 = new Class3_Sub1_Sub3((byte) -103, arg0);
			local90.anInt441 = local84;
			@Pc(99) Class40 local99 = new Class40(false, local90);
			@Pc(102) int local102 = local33.method276();
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
				@Pc(121) int local121 = local33.method276();
				@Pc(129) Class18 local129 = aClass18Array1[local121] = new Class18();
				local129.anInt396 = local77.method274();
				local129.aClass40_1 = local99;
				@Pc(139) int local139 = local33.method274();
				@Pc(141) int local141 = -1;
				@Pc(143) int local143 = 0;
				@Pc(150) int local150;
				for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
					local150 = local48.method274();
					if (local150 > 0) {
						if (local99.anIntArray186[local145] != 0) {
							for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray186[local161] == 0) {
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
						if (local99.anIntArray186[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local61.method287();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local61.method287();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local61.method287();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray186[local145] == 5) {
							aBooleanArray5[local121] = false;
						}
					}
				}
				local129.anInt397 = local143;
				local129.anIntArray106 = new int[local143];
				local129.anIntArray107 = new int[local143];
				local129.anIntArray108 = new int[local143];
				local129.anIntArray109 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray106[local150] = local105[local150];
					local129.anIntArray107[local150] = local108[local150];
					local129.anIntArray108[local150] = local111[local150];
					local129.anIntArray109[local150] = local114[local150];
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("44884, " + arg0 + ", " + false + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KDJQGGIG", name = "a", descriptor = "(Z)V")
	public static void method208() {
		try {
			aClass18Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("15747, " + false + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KDJQGGIG", name = "b", descriptor = "(I)Lclient!KDJQGGIG;")
	public static Class18 method209(@OriginalArg(0) int arg0) {
		return aClass18Array1 == null ? null : aClass18Array1[arg0];
	}

	@OriginalMember(owner = "client!KDJQGGIG", name = "a", descriptor = "(II)Z")
	public static boolean method210(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("83031, " + 0 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KDJQGGIG", name = "<init>", descriptor = "()V")
	private Class18() {
	}
}
