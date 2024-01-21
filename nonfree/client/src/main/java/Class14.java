import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Z")
	private static boolean aBoolean133;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "I")
	private static int anInt597 = 43763;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method323(@OriginalArg(0) int arg0) {
		aClass14Array1 = new Class14[arg0 + 1];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z[B)V")
	public static void method324(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, false);
			local7.anInt778 = arg0.length - 8;
			@Pc(16) int local16 = local7.method498();
			@Pc(19) int local19 = local7.method498();
			@Pc(22) int local22 = local7.method498();
			@Pc(25) int local25 = local7.method498();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, false);
			local33.anInt778 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class1_Sub1_Sub3 local52 = new Class1_Sub1_Sub3(arg0, false);
			local52.anInt778 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class1_Sub1_Sub3 local65 = new Class1_Sub1_Sub3(arg0, false);
			local65.anInt778 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3(arg0, false);
			local78.anInt778 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3(arg0, false);
			local91.anInt778 = local85;
			@Pc(100) Class12 local100 = new Class12(false, local91);
			@Pc(103) int local103 = local33.method498();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method498();
				@Pc(130) Class14 local130 = aClass14Array1[local122] = new Class14();
				local130.anInt598 = local78.method496();
				local130.aClass12_1 = local100;
				@Pc(140) int local140 = local33.method496();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method496();
					if (local151 > 0) {
						if (local100.anIntArray163[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray163[local162] == 0) {
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
						if (local100.anIntArray163[local106[local144]] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method509();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method509();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method509();
						}
						local142 = local146;
						local144++;
					}
				}
				local130.anInt599 = local144;
				local130.anIntArray169 = new int[local144];
				local130.anIntArray170 = new int[local144];
				local130.anIntArray171 = new int[local144];
				local130.anIntArray172 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray169[local151] = local106[local151];
					local130.anIntArray170[local151] = local109[local151];
					local130.anIntArray171[local151] = local112[local151];
					local130.anIntArray172[local151] = local115[local151];
				}
			}
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("26180, " + true + ", " + arg0 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method325(@OriginalArg(0) byte arg0) {
		try {
			aClass14Array1 = null;
			@Pc(6) boolean local6 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("44139, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!h;")
	public static Class14 method326(@OriginalArg(0) int arg0) {
		try {
			return aClass14Array1 == null ? null : aClass14Array1[arg0];
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("88778, " + arg0 + ", " + -58 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
