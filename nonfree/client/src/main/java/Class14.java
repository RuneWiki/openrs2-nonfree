import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	private static int anInt607 = 3;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method324(@OriginalArg(0) int arg0) {
		aClass14Array1 = new Class14[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BZ)V")
	public static void method325(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(45427, arg0);
			local7.anInt796 = arg0.length - 8;
			@Pc(16) int local16 = local7.method500();
			@Pc(19) int local19 = local7.method500();
			@Pc(22) int local22 = local7.method500();
			@Pc(25) int local25 = local7.method500();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(45427, arg0);
			local33.anInt796 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(45427, arg0);
			local48.anInt796 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(45427, arg0);
			local61.anInt796 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3(45427, arg0);
			local78.anInt796 = local68;
			@Pc(85) int local85 = local68 + local25;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3(45427, arg0);
			local91.anInt796 = local85;
			@Pc(100) Class12 local100 = new Class12(false, local91);
			@Pc(103) int local103 = local33.method500();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method500();
				@Pc(130) Class14 local130 = aClass14Array1[local122] = new Class14();
				local130.anInt608 = local78.method498();
				local130.aClass12_1 = local100;
				@Pc(140) int local140 = local33.method498();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method498();
					if (local151 > 0) {
						if (local100.anIntArray164[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray164[local162] == 0) {
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
						if (local100.anIntArray164[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method511();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method511();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method511();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray164[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt609 = local144;
				local130.anIntArray170 = new int[local144];
				local130.anIntArray171 = new int[local144];
				local130.anIntArray172 = new int[local144];
				local130.anIntArray173 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray170[local151] = local106[local151];
					local130.anIntArray171[local151] = local109[local151];
					local130.anIntArray172[local151] = local112[local151];
					local130.anIntArray173[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("87752, " + arg0 + ", " + true + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method326() {
		try {
			aClass14Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("75021, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!h;")
	public static Class14 method327(@OriginalArg(1) int arg0) {
		try {
			return aClass14Array1 == null ? null : aClass14Array1[arg0];
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("72420, " + 0 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z")
	public static boolean method328(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 == -1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("79552, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
