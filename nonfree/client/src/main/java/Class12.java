import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt540 = 5706;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private static int anInt541 = -714;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt543;

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

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)V")
	public static void method303(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 58);
			local7.anInt742 = arg0.length - 8;
			@Pc(16) int local16 = local7.method482();
			@Pc(19) int local19 = local7.method482();
			@Pc(22) int local22 = local7.method482();
			@Pc(25) int local25 = local7.method482();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 58);
			local33.anInt742 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 58);
			local48.anInt742 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, 58);
			local61.anInt742 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, 58);
			local74.anInt742 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, 58);
			local87.anInt742 = local81;
			@Pc(96) Class10 local96 = new Class10(3, local87);
			@Pc(99) int local99 = local33.method482();
			@Pc(102) int[] local102 = new int[500];
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local99; local117++) {
				@Pc(122) int local122 = local33.method482();
				@Pc(130) Class12 local130 = aClass12Array1[local122] = new Class12();
				local130.anInt542 = local74.method480();
				local130.aClass10_1 = local96;
				@Pc(140) int local140 = local33.method480();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method480();
					if (local151 > 0) {
						if (local96.anIntArray161[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local96.anIntArray161[local162] == 0) {
									local102[local144] = local162;
									local105[local144] = 0;
									local108[local144] = 0;
									local111[local144] = 0;
									local144++;
									break;
								}
							}
						}
						local102[local144] = local146;
						@Pc(198) short local198 = 0;
						if (local96.anIntArray161[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local105[local144] = local198;
						} else {
							local105[local144] = local61.method493();
						}
						if ((local151 & 0x2) == 0) {
							local108[local144] = local198;
						} else {
							local108[local144] = local61.method493();
						}
						if ((local151 & 0x4) == 0) {
							local111[local144] = local198;
						} else {
							local111[local144] = local61.method493();
						}
						local142 = local146;
						local144++;
						if (local96.anIntArray161[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt543 = local144;
				local130.anIntArray164 = new int[local144];
				local130.anIntArray165 = new int[local144];
				local130.anIntArray166 = new int[local144];
				local130.anIntArray167 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray164[local151] = local102[local151];
					local130.anIntArray165[local151] = local105[local151];
					local130.anIntArray166[local151] = local108[local151];
					local130.anIntArray167[local151] = local111[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("89424, " + arg0 + ", " + 0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method304() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("61539, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!g;")
	public static Class12 method305(@OriginalArg(0) int arg0) {
		try {
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("61298, " + arg0 + ", " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public static boolean method306(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("64643, " + 4 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
