import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QGRLAQIF")
public final class Class32 {

	@OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "[Lclient!QGRLAQIF;")
	private static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!QGRLAQIF", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!QGRLAQIF", name = "b", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!QGRLAQIF", name = "c", descriptor = "Lclient!QZXSFRVC;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!QGRLAQIF", name = "d", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!QGRLAQIF", name = "e", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!QGRLAQIF", name = "f", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!QGRLAQIF", name = "g", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!QGRLAQIF", name = "h", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "(I)V")
	public static void method370(@OriginalArg(0) int arg0) {
		aClass32Array1 = new Class32[arg0 + 1];
		aBooleanArray5 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray5[local11] = true;
		}
	}

	@OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "([BB)V")
	public static void method371(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3((byte) 114, arg0);
			local7.anInt283 = arg0.length - 8;
			@Pc(16) int local16 = local7.method269();
			@Pc(19) int local19 = local7.method269();
			@Pc(22) int local22 = local7.method269();
			@Pc(29) int local29 = local7.method269();
			@Pc(37) Class2_Sub1_Sub3 local37 = new Class2_Sub1_Sub3((byte) 114, arg0);
			local37.anInt283 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class2_Sub1_Sub3 local52 = new Class2_Sub1_Sub3((byte) 114, arg0);
			local52.anInt283 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class2_Sub1_Sub3 local65 = new Class2_Sub1_Sub3((byte) 114, arg0);
			local65.anInt283 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class2_Sub1_Sub3 local78 = new Class2_Sub1_Sub3((byte) 114, arg0);
			local78.anInt283 = local72;
			@Pc(85) int local85 = local72 + local29;
			@Pc(91) Class2_Sub1_Sub3 local91 = new Class2_Sub1_Sub3((byte) 114, arg0);
			local91.anInt283 = local85;
			@Pc(100) Class33 local100 = new Class33(true, local91);
			@Pc(103) int local103 = local37.method269();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method269();
				@Pc(130) Class32 local130 = aClass32Array1[local122] = new Class32();
				local130.anInt442 = local78.method267();
				local130.aClass33_1 = local100;
				@Pc(140) int local140 = local37.method267();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method267();
					if (local151 > 0) {
						if (local100.anIntArray122[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray122[local162] == 0) {
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
						if (local100.anIntArray122[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method280();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method280();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method280();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray122[local146] == 5) {
							aBooleanArray5[local122] = false;
						}
					}
				}
				local130.anInt443 = local144;
				local130.anIntArray118 = new int[local144];
				local130.anIntArray119 = new int[local144];
				local130.anIntArray120 = new int[local144];
				local130.anIntArray121 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray118[local151] = local106[local151];
					local130.anIntArray119[local151] = local109[local151];
					local130.anIntArray120[local151] = local112[local151];
					local130.anIntArray121[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("12751, " + arg0 + ", " + -21 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "(Z)V")
	public static void method372() {
		try {
			aClass32Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("38834, " + false + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGRLAQIF", name = "b", descriptor = "(I)Lclient!QGRLAQIF;")
	public static Class32 method373(@OriginalArg(0) int arg0) {
		return aClass32Array1 == null ? null : aClass32Array1[arg0];
	}

	@OriginalMember(owner = "client!QGRLAQIF", name = "a", descriptor = "(IZ)Z")
	public static boolean method374(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("89221, " + arg0 + ", " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGRLAQIF", name = "<init>", descriptor = "()V")
	private Class32() {
	}
}
