import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt530;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private static int anInt531 = 2;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method300(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)V")
	public static void method301(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 15787);
			local7.anInt734 = arg0.length - 8;
			@Pc(16) int local16 = local7.method478();
			@Pc(19) int local19 = local7.method478();
			@Pc(22) int local22 = local7.method478();
			@Pc(25) int local25 = local7.method478();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 15787);
			local33.anInt734 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 15787);
			local48.anInt734 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, 15787);
			local61.anInt734 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, 15787);
			local74.anInt734 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, 15787);
			local87.anInt734 = local81;
			@Pc(96) Class10 local96 = new Class10(local87, anInt530);
			@Pc(99) int local99 = local33.method478();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local99; local117++) {
				@Pc(122) int local122 = local33.method478();
				@Pc(130) Class12 local130 = aClass12Array1[local122] = new Class12();
				local130.anInt532 = local74.method476();
				local130.aClass10_1 = local96;
				@Pc(140) int local140 = local33.method476();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method476();
					if (local151 > 0) {
						if (local96.anIntArray161[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local96.anIntArray161[local162] == 0) {
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
						if (local96.anIntArray161[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method489();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method489();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method489();
						}
						local142 = local146;
						local144++;
						if (local96.anIntArray161[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt533 = local144;
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
			signlink.reporterror("77261, " + 2 + ", " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method302() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("94238, " + 42 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Lclient!g;")
	public static Class12 method303(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 4) {
				@Pc(4) boolean local4 = false;
			} else {
				anInt531 = -60;
			}
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("52733, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method304(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("34856, " + arg0 + ", " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
