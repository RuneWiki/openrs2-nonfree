import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private static int anInt514;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt513 = 599;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method299(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)V")
	public static void method300(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 3, arg0);
			local7.anInt715 = arg0.length - 8;
			@Pc(16) int local16 = local7.method474();
			@Pc(19) int local19 = local7.method474();
			@Pc(22) int local22 = local7.method474();
			@Pc(25) int local25 = local7.method474();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3((byte) 3, arg0);
			local33.anInt715 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3((byte) 3, arg0);
			local48.anInt715 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3((byte) 3, arg0);
			local61.anInt715 = local55;
			@Pc(68) boolean local68 = false;
			@Pc(72) int local72 = local55 + local22;
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3((byte) 3, arg0);
			local78.anInt715 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3((byte) 3, arg0);
			local91.anInt715 = local85;
			@Pc(100) Class10 local100 = new Class10(anInt514, local91);
			@Pc(103) int local103 = local33.method474();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method474();
				@Pc(130) Class12 local130 = aClass12Array1[local122] = new Class12();
				local130.anInt515 = local78.method472();
				local130.aClass10_1 = local100;
				@Pc(140) int local140 = local33.method472();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method472();
					if (local151 > 0) {
						if (local100.anIntArray159[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray159[local162] == 0) {
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
						if (local100.anIntArray159[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method485();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method485();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method485();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray159[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt516 = local144;
				local130.anIntArray162 = new int[local144];
				local130.anIntArray163 = new int[local144];
				local130.anIntArray164 = new int[local144];
				local130.anIntArray165 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray162[local151] = local106[local151];
					local130.anIntArray163[local151] = local109[local151];
					local130.anIntArray164[local151] = local112[local151];
					local130.anIntArray165[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("33584, " + arg0 + ", " + arg1 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method301(@OriginalArg(0) byte arg0) {
		try {
			aClass12Array1 = null;
			@Pc(6) boolean local6 = false;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("14132, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)Lclient!g;")
	public static Class12 method302(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			return aClass12Array1 == null ? null : aClass12Array1[arg1];
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("76220, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 == -1;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("92416, " + arg0 + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
