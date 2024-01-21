import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PLSPTEPI")
public final class Class30 {

	@OriginalMember(owner = "client!PLSPTEPI", name = "c", descriptor = "[Lclient!PLSPTEPI;")
	private static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!PLSPTEPI", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "Z")
	private static boolean aBoolean111 = true;

	@OriginalMember(owner = "client!PLSPTEPI", name = "b", descriptor = "I")
	private static int anInt530 = -858;

	@OriginalMember(owner = "client!PLSPTEPI", name = "d", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!PLSPTEPI", name = "e", descriptor = "Lclient!MJXROMKT;")
	public Class23 aClass23_1;

	@OriginalMember(owner = "client!PLSPTEPI", name = "f", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!PLSPTEPI", name = "g", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!PLSPTEPI", name = "h", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!PLSPTEPI", name = "i", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!PLSPTEPI", name = "j", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "(I)V")
	public static void method330(@OriginalArg(0) int arg0) {
		aClass30Array1 = new Class30[arg0 + 1];
		aBooleanArray6 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray6[local11] = true;
		}
	}

	@OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "(B[B)V")
	public static void method331(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(arg0, true);
			local7.anInt624 = arg0.length - 8;
			@Pc(16) int local16 = local7.method407();
			@Pc(19) int local19 = local7.method407();
			@Pc(22) int local22 = local7.method407();
			@Pc(25) int local25 = local7.method407();
			@Pc(37) Class1_Sub1_Sub4 local37 = new Class1_Sub1_Sub4(arg0, true);
			local37.anInt624 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class1_Sub1_Sub4 local52 = new Class1_Sub1_Sub4(arg0, true);
			local52.anInt624 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class1_Sub1_Sub4 local65 = new Class1_Sub1_Sub4(arg0, true);
			local65.anInt624 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class1_Sub1_Sub4 local78 = new Class1_Sub1_Sub4(arg0, true);
			local78.anInt624 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class1_Sub1_Sub4 local91 = new Class1_Sub1_Sub4(arg0, true);
			local91.anInt624 = local85;
			@Pc(100) Class23 local100 = new Class23(aBoolean111, local91);
			@Pc(103) int local103 = local37.method407();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method407();
				@Pc(130) Class30 local130 = aClass30Array1[local122] = new Class30();
				local130.anInt531 = local78.method405();
				local130.aClass23_1 = local100;
				@Pc(140) int local140 = local37.method405();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method405();
					if (local151 > 0) {
						if (local100.anIntArray117[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray117[local162] == 0) {
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
						if (local100.anIntArray117[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method418();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method418();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method418();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray117[local146] == 5) {
							aBooleanArray6[local122] = false;
						}
					}
				}
				local130.anInt532 = local144;
				local130.anIntArray148 = new int[local144];
				local130.anIntArray149 = new int[local144];
				local130.anIntArray150 = new int[local144];
				local130.anIntArray151 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray148[local151] = local106[local151];
					local130.anIntArray149[local151] = local109[local151];
					local130.anIntArray150[local151] = local112[local151];
					local130.anIntArray151[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("87644, " + 9 + ", " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PLSPTEPI", name = "b", descriptor = "(I)V")
	public static void method332() {
		try {
			aClass30Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("55761, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PLSPTEPI", name = "c", descriptor = "(I)Lclient!PLSPTEPI;")
	public static Class30 method333(@OriginalArg(0) int arg0) {
		return aClass30Array1 == null ? null : aClass30Array1[arg0];
	}

	@OriginalMember(owner = "client!PLSPTEPI", name = "a", descriptor = "(II)Z")
	public static boolean method334(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("30613, " + 61 + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PLSPTEPI", name = "<init>", descriptor = "()V")
	private Class30() {
	}
}
