import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XZZTWOGF")
public final class Class47 {

	@OriginalMember(owner = "client!XZZTWOGF", name = "b", descriptor = "[Lclient!XZZTWOGF;")
	private static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!XZZTWOGF", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!XZZTWOGF", name = "a", descriptor = "I")
	private static int anInt782 = 28787;

	@OriginalMember(owner = "client!XZZTWOGF", name = "c", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!XZZTWOGF", name = "d", descriptor = "Lclient!TJOELOUM;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!XZZTWOGF", name = "e", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!XZZTWOGF", name = "f", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!XZZTWOGF", name = "g", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!XZZTWOGF", name = "h", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!XZZTWOGF", name = "i", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!XZZTWOGF", name = "a", descriptor = "(I)V")
	public static void method550(@OriginalArg(0) int arg0) {
		aClass47Array1 = new Class47[arg0 + 1];
		aBooleanArray10 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray10[local11] = true;
		}
	}

	@OriginalMember(owner = "client!XZZTWOGF", name = "a", descriptor = "([BI)V")
	public static void method551(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2(-527, arg0);
			local7.anInt257 = arg0.length - 8;
			@Pc(16) int local16 = local7.method91();
			@Pc(19) int local19 = local7.method91();
			@Pc(22) int local22 = local7.method91();
			@Pc(29) int local29 = local7.method91();
			@Pc(37) Class3_Sub1_Sub2 local37 = new Class3_Sub1_Sub2(-527, arg0);
			local37.anInt257 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class3_Sub1_Sub2 local52 = new Class3_Sub1_Sub2(-527, arg0);
			local52.anInt257 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class3_Sub1_Sub2 local65 = new Class3_Sub1_Sub2(-527, arg0);
			local65.anInt257 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class3_Sub1_Sub2 local78 = new Class3_Sub1_Sub2(-527, arg0);
			local78.anInt257 = local72;
			@Pc(85) int local85 = local72 + local29;
			@Pc(91) Class3_Sub1_Sub2 local91 = new Class3_Sub1_Sub2(-527, arg0);
			local91.anInt257 = local85;
			@Pc(100) Class30 local100 = new Class30(local91, 31);
			@Pc(103) int local103 = local37.method91();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method91();
				@Pc(130) Class47 local130 = aClass47Array1[local122] = new Class47();
				local130.anInt783 = local78.method89();
				local130.aClass30_1 = local100;
				@Pc(140) int local140 = local37.method89();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method89();
					if (local151 > 0) {
						if (local100.anIntArray168[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray168[local162] == 0) {
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
						if (local100.anIntArray168[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method102();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method102();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method102();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray168[local146] == 5) {
							aBooleanArray10[local122] = false;
						}
					}
				}
				local130.anInt784 = local144;
				local130.anIntArray199 = new int[local144];
				local130.anIntArray200 = new int[local144];
				local130.anIntArray201 = new int[local144];
				local130.anIntArray202 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray199[local151] = local106[local151];
					local130.anIntArray200[local151] = local109[local151];
					local130.anIntArray201[local151] = local112[local151];
					local130.anIntArray202[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("9688, " + arg0 + ", " + -373 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZZTWOGF", name = "b", descriptor = "(I)V")
	public static void method552() {
		try {
			aClass47Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("48781, " + 2 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZZTWOGF", name = "c", descriptor = "(I)Lclient!XZZTWOGF;")
	public static Class47 method553(@OriginalArg(0) int arg0) {
		return aClass47Array1 == null ? null : aClass47Array1[arg0];
	}

	@OriginalMember(owner = "client!XZZTWOGF", name = "a", descriptor = "(II)Z")
	public static boolean method554(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("17280, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZZTWOGF", name = "<init>", descriptor = "()V")
	private Class47() {
	}
}
