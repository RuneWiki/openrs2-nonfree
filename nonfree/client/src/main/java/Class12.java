import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
	private static boolean aBoolean141;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt508 = -32;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method302(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BB)V")
	public static void method303(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0, (byte) -93);
			local11.anInt720 = arg0.length - 8;
			@Pc(20) int local20 = local11.method482();
			@Pc(23) int local23 = local11.method482();
			@Pc(26) int local26 = local11.method482();
			@Pc(29) int local29 = local11.method482();
			@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0, (byte) -93);
			local37.anInt720 = 0;
			@Pc(46) int local46 = local20 + 0 + 2;
			@Pc(52) Class1_Sub1_Sub3 local52 = new Class1_Sub1_Sub3(arg0, (byte) -93);
			local52.anInt720 = local46;
			@Pc(59) int local59 = local46 + local23;
			@Pc(65) Class1_Sub1_Sub3 local65 = new Class1_Sub1_Sub3(arg0, (byte) -93);
			local65.anInt720 = local59;
			@Pc(72) int local72 = local59 + local26;
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3(arg0, (byte) -93);
			local78.anInt720 = local72;
			@Pc(85) int local85 = local72 + local29;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3(arg0, (byte) -93);
			local91.anInt720 = local85;
			@Pc(100) Class10 local100 = new Class10(local91, -238);
			@Pc(103) int local103 = local37.method482();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method482();
				@Pc(130) Class12 local130 = aClass12Array1[local122] = new Class12();
				local130.anInt509 = local78.method480();
				local130.aClass10_1 = local100;
				@Pc(140) int local140 = local37.method480();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method480();
					if (local151 > 0) {
						if (local100.anIntArray161[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray161[local162] == 0) {
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
						if (local100.anIntArray161[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method493();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method493();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method493();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray161[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt510 = local144;
				local130.anIntArray164 = new int[local144];
				local130.anIntArray165 = new int[local144];
				local130.anIntArray166 = new int[local144];
				local130.anIntArray167 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray164[local151] = local106[local151];
					local130.anIntArray165[local151] = local109[local151];
					local130.anIntArray166[local151] = local112[local151];
					local130.anIntArray167[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("1555, " + arg0 + ", " + 35 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method304() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("33631, " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)Lclient!g;")
	public static Class12 method305(@OriginalArg(1) int arg0) {
		try {
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("52276, " + -14 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method306(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("62791, " + 577 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
