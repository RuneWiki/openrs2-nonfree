import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
	private static boolean aBoolean116 = true;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method327(@OriginalArg(0) int arg0) {
		aClass14Array1 = new Class14[arg0 + 1];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[B)V")
	public static void method328(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(699, arg0);
			local7.anInt771 = arg0.length - 8;
			@Pc(16) int local16 = local7.method469();
			@Pc(19) int local19 = local7.method469();
			@Pc(22) int local22 = local7.method469();
			@Pc(25) int local25 = local7.method469();
			@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(699, arg0);
			local37.anInt771 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class1_Sub1_Sub3 local52 = new Class1_Sub1_Sub3(699, arg0);
			local52.anInt771 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class1_Sub1_Sub3 local65 = new Class1_Sub1_Sub3(699, arg0);
			local65.anInt771 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3(699, arg0);
			local78.anInt771 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3(699, arg0);
			local91.anInt771 = local85;
			@Pc(100) Class12 local100 = new Class12((byte) 79, local91);
			@Pc(103) int local103 = local37.method469();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method469();
				@Pc(130) Class14 local130 = aClass14Array1[local122] = new Class14();
				local130.anInt614 = local78.method467();
				local130.aClass12_1 = local100;
				@Pc(140) int local140 = local37.method467();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method467();
					if (local151 > 0) {
						if (local100.anIntArray157[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray157[local162] == 0) {
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
						if (local100.anIntArray157[local106[local144]] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method480();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method480();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method480();
						}
						local142 = local146;
						local144++;
					}
				}
				local130.anInt615 = local144;
				local130.anIntArray163 = new int[local144];
				local130.anIntArray164 = new int[local144];
				local130.anIntArray165 = new int[local144];
				local130.anIntArray166 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray163[local151] = local106[local151];
					local130.anIntArray164[local151] = local109[local151];
					local130.anIntArray165[local151] = local112[local151];
					local130.anIntArray166[local151] = local115[local151];
				}
			}
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("30570, " + 4 + ", " + arg0 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method329() {
		try {
			aClass14Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("17312, " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!h;")
	public static Class14 method330(@OriginalArg(0) int arg0) {
		try {
			return aClass14Array1 == null ? null : aClass14Array1[arg0];
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("5970, " + arg0 + ", " + -30419 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
