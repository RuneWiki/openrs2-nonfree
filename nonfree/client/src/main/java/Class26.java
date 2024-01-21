import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NXEWQQJO")
public final class Class26 {

	@OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "I")
	private static int anInt254;

	@OriginalMember(owner = "client!NXEWQQJO", name = "b", descriptor = "[Lclient!NXEWQQJO;")
	private static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!NXEWQQJO", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!NXEWQQJO", name = "c", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!NXEWQQJO", name = "d", descriptor = "Lclient!IIXTARMC;")
	public Class14 aClass14_1;

	@OriginalMember(owner = "client!NXEWQQJO", name = "e", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!NXEWQQJO", name = "f", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!NXEWQQJO", name = "g", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!NXEWQQJO", name = "h", descriptor = "[I")
	public int[] anIntArray107;

	@OriginalMember(owner = "client!NXEWQQJO", name = "i", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "(I)V")
	public static void method219(@OriginalArg(0) int arg0) {
		aClass26Array1 = new Class26[arg0 + 1];
		aBooleanArray5 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray5[local11] = true;
		}
	}

	@OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "([BI)V")
	public static void method220(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3(arg0, true);
			local7.anInt136 = arg0.length - 8;
			@Pc(16) int local16 = local7.method99();
			@Pc(19) int local19 = local7.method99();
			@Pc(22) int local22 = local7.method99();
			@Pc(25) int local25 = local7.method99();
			@Pc(33) Class2_Sub1_Sub3 local33 = new Class2_Sub1_Sub3(arg0, true);
			local33.anInt136 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class2_Sub1_Sub3 local48 = new Class2_Sub1_Sub3(arg0, true);
			local48.anInt136 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class2_Sub1_Sub3 local61 = new Class2_Sub1_Sub3(arg0, true);
			local61.anInt136 = local55;
			@Pc(72) int local72 = local55 + local22;
			@Pc(78) Class2_Sub1_Sub3 local78 = new Class2_Sub1_Sub3(arg0, true);
			local78.anInt136 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class2_Sub1_Sub3 local91 = new Class2_Sub1_Sub3(arg0, true);
			local91.anInt136 = local85;
			@Pc(100) Class14 local100 = new Class14(local91, 9);
			@Pc(103) int local103 = local33.method99();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method99();
				@Pc(130) Class26 local130 = aClass26Array1[local122] = new Class26();
				local130.anInt255 = local78.method97();
				local130.aClass14_1 = local100;
				@Pc(140) int local140 = local33.method97();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method97();
					if (local151 > 0) {
						if (local100.anIntArray77[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray77[local162] == 0) {
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
						if (local100.anIntArray77[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method110();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method110();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method110();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray77[local146] == 5) {
							aBooleanArray5[local122] = false;
						}
					}
				}
				local130.anInt256 = local144;
				local130.anIntArray105 = new int[local144];
				local130.anIntArray106 = new int[local144];
				local130.anIntArray107 = new int[local144];
				local130.anIntArray108 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray105[local151] = local106[local151];
					local130.anIntArray106[local151] = local109[local151];
					local130.anIntArray107[local151] = local112[local151];
					local130.anIntArray108[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("88520, " + arg0 + ", " + 0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "(Z)V")
	public static void method221() {
		try {
			aClass26Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("42348, " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXEWQQJO", name = "b", descriptor = "(I)Lclient!NXEWQQJO;")
	public static Class26 method222(@OriginalArg(0) int arg0) {
		return aClass26Array1 == null ? null : aClass26Array1[arg0];
	}

	@OriginalMember(owner = "client!NXEWQQJO", name = "a", descriptor = "(BI)Z")
	public static boolean method223(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == 0) {
				@Pc(5) boolean local5 = false;
			} else {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			return arg1 == -1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("91763, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXEWQQJO", name = "<init>", descriptor = "()V")
	private Class26() {
	}
}
