import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NLIOLBXV")
public final class Class29 {

	@OriginalMember(owner = "client!NLIOLBXV", name = "d", descriptor = "[Lclient!NLIOLBXV;")
	private static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!NLIOLBXV", name = "l", descriptor = "[Z")
	private static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!NLIOLBXV", name = "a", descriptor = "Z")
	private static boolean aBoolean125 = true;

	@OriginalMember(owner = "client!NLIOLBXV", name = "b", descriptor = "I")
	private static int anInt493 = 4;

	@OriginalMember(owner = "client!NLIOLBXV", name = "c", descriptor = "I")
	private static int anInt494 = 7;

	@OriginalMember(owner = "client!NLIOLBXV", name = "e", descriptor = "I")
	public int anInt495;

	@OriginalMember(owner = "client!NLIOLBXV", name = "f", descriptor = "Lclient!HSGACJOH;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!NLIOLBXV", name = "g", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!NLIOLBXV", name = "h", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!NLIOLBXV", name = "i", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!NLIOLBXV", name = "j", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!NLIOLBXV", name = "k", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!NLIOLBXV", name = "a", descriptor = "(I)V")
	public static void method292(@OriginalArg(0) int arg0) {
		aClass29Array1 = new Class29[arg0 + 1];
		aBooleanArray6 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray6[local11] = true;
		}
	}

	@OriginalMember(owner = "client!NLIOLBXV", name = "a", descriptor = "(I[B)V")
	public static void method293(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(arg0, aBoolean125);
			local7.anInt166 = arg0.length - 8;
			@Pc(16) int local16 = local7.method96();
			@Pc(19) int local19 = local7.method96();
			@Pc(22) int local22 = local7.method96();
			@Pc(25) int local25 = local7.method96();
			@Pc(33) Class2_Sub1_Sub4 local33 = new Class2_Sub1_Sub4(arg0, aBoolean125);
			local33.anInt166 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class2_Sub1_Sub4 local48 = new Class2_Sub1_Sub4(arg0, aBoolean125);
			local48.anInt166 = local42;
			@Pc(59) int local59 = local42 + local19;
			@Pc(65) Class2_Sub1_Sub4 local65 = new Class2_Sub1_Sub4(arg0, aBoolean125);
			local65.anInt166 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class2_Sub1_Sub4 local78 = new Class2_Sub1_Sub4(arg0, aBoolean125);
			local78.anInt166 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class2_Sub1_Sub4 local91 = new Class2_Sub1_Sub4(arg0, aBoolean125);
			local91.anInt166 = local85;
			@Pc(100) Class16 local100 = new Class16((byte) 70, local91);
			@Pc(103) int local103 = local33.method96();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method96();
				@Pc(130) Class29 local130 = aClass29Array1[local122] = new Class29();
				local130.anInt495 = local78.method94();
				local130.aClass16_1 = local100;
				@Pc(140) int local140 = local33.method94();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method94();
					if (local151 > 0) {
						if (local100.anIntArray58[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray58[local162] == 0) {
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
						if (local100.anIntArray58[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method107();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method107();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method107();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray58[local146] == 5) {
							aBooleanArray6[local122] = false;
						}
					}
				}
				local130.anInt496 = local144;
				local130.anIntArray84 = new int[local144];
				local130.anIntArray85 = new int[local144];
				local130.anIntArray86 = new int[local144];
				local130.anIntArray87 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray84[local151] = local106[local151];
					local130.anIntArray85[local151] = local109[local151];
					local130.anIntArray86[local151] = local112[local151];
					local130.anIntArray87[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("90774, " + 0 + ", " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NLIOLBXV", name = "b", descriptor = "(I)V")
	public static void method294() {
		try {
			aClass29Array1 = null;
			if (anInt493 > 4 || anInt493 < 4) {
				anInt493 = -184;
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("35045, " + 4 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NLIOLBXV", name = "c", descriptor = "(I)Lclient!NLIOLBXV;")
	public static Class29 method295(@OriginalArg(0) int arg0) {
		return aClass29Array1 == null ? null : aClass29Array1[arg0];
	}

	@OriginalMember(owner = "client!NLIOLBXV", name = "a", descriptor = "(BI)Z")
	public static boolean method296(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("7959, " + 68 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NLIOLBXV", name = "<init>", descriptor = "()V")
	private Class29() {
	}
}
