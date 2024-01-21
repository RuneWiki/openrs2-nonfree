import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DHMWVSMI")
public final class Class5 {

	@OriginalMember(owner = "client!DHMWVSMI", name = "d", descriptor = "[Lclient!DHMWVSMI;")
	private static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!DHMWVSMI", name = "l", descriptor = "[Z")
	private static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "Z")
	private static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!DHMWVSMI", name = "b", descriptor = "I")
	private static int anInt83 = -23862;

	@OriginalMember(owner = "client!DHMWVSMI", name = "c", descriptor = "I")
	private static int anInt84 = 602;

	@OriginalMember(owner = "client!DHMWVSMI", name = "e", descriptor = "I")
	public int anInt85;

	@OriginalMember(owner = "client!DHMWVSMI", name = "f", descriptor = "Lclient!URJIIMJU;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!DHMWVSMI", name = "g", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!DHMWVSMI", name = "h", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!DHMWVSMI", name = "i", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!DHMWVSMI", name = "j", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!DHMWVSMI", name = "k", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "(I)V")
	public static void method60(@OriginalArg(0) int arg0) {
		aClass5Array1 = new Class5[arg0 + 1];
		aBooleanArray1 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray1[local11] = true;
		}
	}

	@OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "(Z[B)V")
	public static void method61(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub1_Sub4 local7 = new Class3_Sub1_Sub4((byte) -58, arg0);
			local7.anInt666 = arg0.length - 8;
			@Pc(16) int local16 = local7.method460();
			@Pc(19) int local19 = local7.method460();
			@Pc(22) int local22 = local7.method460();
			@Pc(29) int local29 = local7.method460();
			@Pc(37) Class3_Sub1_Sub4 local37 = new Class3_Sub1_Sub4((byte) -58, arg0);
			local37.anInt666 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class3_Sub1_Sub4 local52 = new Class3_Sub1_Sub4((byte) -58, arg0);
			local52.anInt666 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class3_Sub1_Sub4 local65 = new Class3_Sub1_Sub4((byte) -58, arg0);
			local65.anInt666 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class3_Sub1_Sub4 local78 = new Class3_Sub1_Sub4((byte) -58, arg0);
			local78.anInt666 = local72;
			@Pc(85) int local85 = local72 + local29;
			@Pc(91) Class3_Sub1_Sub4 local91 = new Class3_Sub1_Sub4((byte) -58, arg0);
			local91.anInt666 = local85;
			@Pc(100) Class40 local100 = new Class40(local91, -32222);
			@Pc(103) int local103 = local37.method460();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method460();
				@Pc(130) Class5 local130 = aClass5Array1[local122] = new Class5();
				local130.anInt85 = local78.method458();
				local130.aClass40_1 = local100;
				@Pc(140) int local140 = local37.method458();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method458();
					if (local151 > 0) {
						if (local100.anIntArray170[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray170[local162] == 0) {
									local106[local144] = local162;
									local109[local144] = 0;
									local112[local144] = 0;
									local115[local144] = 0;
									local144++;
									break;
								}
							}
						}
						local106[local144] = local146;
						@Pc(198) short local198 = 0;
						if (local100.anIntArray170[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method471();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method471();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method471();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray170[local146] == 5) {
							aBooleanArray1[local122] = false;
						}
					}
				}
				local130.anInt86 = local144;
				local130.anIntArray14 = new int[local144];
				local130.anIntArray15 = new int[local144];
				local130.anIntArray16 = new int[local144];
				local130.anIntArray17 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray14[local151] = local106[local151];
					local130.anIntArray15[local151] = local109[local151];
					local130.anIntArray16[local151] = local112[local151];
					local130.anIntArray17[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("68398, " + true + ", " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHMWVSMI", name = "b", descriptor = "(I)V")
	public static void method62() {
		try {
			aClass5Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("36716, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHMWVSMI", name = "c", descriptor = "(I)Lclient!DHMWVSMI;")
	public static Class5 method63(@OriginalArg(0) int arg0) {
		return aClass5Array1 == null ? null : aClass5Array1[arg0];
	}

	@OriginalMember(owner = "client!DHMWVSMI", name = "a", descriptor = "(II)Z")
	public static boolean method64(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("31746, " + arg0 + ", " + 688 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DHMWVSMI", name = "<init>", descriptor = "()V")
	private Class5() {
	}
}
