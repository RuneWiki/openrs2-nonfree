import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YPRWORMV")
public final class Class49 {

	@OriginalMember(owner = "client!YPRWORMV", name = "b", descriptor = "[Lclient!YPRWORMV;")
	private static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!YPRWORMV", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "I")
	private static int anInt800 = 394;

	@OriginalMember(owner = "client!YPRWORMV", name = "c", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!YPRWORMV", name = "d", descriptor = "Lclient!RHIQJAPF;")
	public Class35 aClass35_1;

	@OriginalMember(owner = "client!YPRWORMV", name = "e", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!YPRWORMV", name = "f", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!YPRWORMV", name = "g", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!YPRWORMV", name = "h", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!YPRWORMV", name = "i", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "(I)V")
	public static void method569(@OriginalArg(0) int arg0) {
		aClass49Array1 = new Class49[arg0 + 1];
		aBooleanArray9 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray9[local11] = true;
		}
	}

	@OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "([BZ)V")
	public static void method570(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(0, arg0);
			local7.anInt529 = arg0.length - 8;
			@Pc(16) int local16 = local7.method296();
			@Pc(19) int local19 = local7.method296();
			@Pc(22) int local22 = local7.method296();
			@Pc(25) int local25 = local7.method296();
			@Pc(33) Class1_Sub1_Sub4 local33 = new Class1_Sub1_Sub4(0, arg0);
			local33.anInt529 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub4 local48 = new Class1_Sub1_Sub4(0, arg0);
			local48.anInt529 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub4 local61 = new Class1_Sub1_Sub4(0, arg0);
			local61.anInt529 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub4 local74 = new Class1_Sub1_Sub4(0, arg0);
			local74.anInt529 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub4 local87 = new Class1_Sub1_Sub4(0, arg0);
			local87.anInt529 = local81;
			@Pc(96) Class35 local96 = new Class35(local87, 664);
			@Pc(108) int local108 = local33.method296();
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			for (@Pc(122) int local122 = 0; local122 < local108; local122++) {
				@Pc(127) int local127 = local33.method296();
				@Pc(135) Class49 local135 = aClass49Array1[local127] = new Class49();
				local135.anInt801 = local74.method294();
				local135.aClass35_1 = local96;
				@Pc(145) int local145 = local33.method294();
				@Pc(147) int local147 = -1;
				@Pc(149) int local149 = 0;
				@Pc(156) int local156;
				for (@Pc(151) int local151 = 0; local151 < local145; local151++) {
					local156 = local48.method294();
					if (local156 > 0) {
						if (local96.anIntArray164[local151] != 0) {
							for (@Pc(167) int local167 = local151 - 1; local167 > local147; local167--) {
								if (local96.anIntArray164[local167] == 0) {
									local111[local149] = local167;
									local114[local149] = 0;
									local117[local149] = 0;
									local120[local149] = 0;
									local149++;
									break;
								}
							}
						}
						local111[local149] = local151;
						@Pc(203) short local203 = 0;
						if (local96.anIntArray164[local151] == 3) {
							local203 = 128;
						}
						if ((local156 & 0x1) == 0) {
							local114[local149] = local203;
						} else {
							local114[local149] = local61.method307();
						}
						if ((local156 & 0x2) == 0) {
							local117[local149] = local203;
						} else {
							local117[local149] = local61.method307();
						}
						if ((local156 & 0x4) == 0) {
							local120[local149] = local203;
						} else {
							local120[local149] = local61.method307();
						}
						local147 = local151;
						local149++;
						if (local96.anIntArray164[local151] == 5) {
							aBooleanArray9[local127] = false;
						}
					}
				}
				local135.anInt802 = local149;
				local135.anIntArray206 = new int[local149];
				local135.anIntArray207 = new int[local149];
				local135.anIntArray208 = new int[local149];
				local135.anIntArray209 = new int[local149];
				for (local156 = 0; local156 < local149; local156++) {
					local135.anIntArray206[local156] = local111[local156];
					local135.anIntArray207[local156] = local114[local156];
					local135.anIntArray208[local156] = local117[local156];
					local135.anIntArray209[local156] = local120[local156];
				}
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("54844, " + arg0 + ", " + true + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "(Z)V")
	public static void method571() {
		try {
			aClass49Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("9531, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPRWORMV", name = "b", descriptor = "(I)Lclient!YPRWORMV;")
	public static Class49 method572(@OriginalArg(0) int arg0) {
		return aClass49Array1 == null ? null : aClass49Array1[arg0];
	}

	@OriginalMember(owner = "client!YPRWORMV", name = "a", descriptor = "(IZ)Z")
	public static boolean method573(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("77043, " + arg0 + ", " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPRWORMV", name = "<init>", descriptor = "()V")
	private Class49() {
	}
}
