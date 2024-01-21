import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FIYHSKKC")
public final class Class11 {

	@OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "I")
	private static int anInt225;

	@OriginalMember(owner = "client!FIYHSKKC", name = "b", descriptor = "[Lclient!FIYHSKKC;")
	private static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!FIYHSKKC", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!FIYHSKKC", name = "c", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!FIYHSKKC", name = "d", descriptor = "Lclient!EHKAWURP;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!FIYHSKKC", name = "e", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!FIYHSKKC", name = "f", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!FIYHSKKC", name = "g", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!FIYHSKKC", name = "h", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!FIYHSKKC", name = "i", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "(I)V")
	public static void method119(@OriginalArg(0) int arg0) {
		aClass11Array1 = new Class11[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	@OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "([BB)V")
	public static void method120(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) Class1_Sub2_Sub3 local7 = new Class1_Sub2_Sub3(arg0, -670);
			local7.anInt474 = arg0.length - 8;
			@Pc(16) int local16 = local7.method309();
			@Pc(19) int local19 = local7.method309();
			@Pc(22) int local22 = local7.method309();
			@Pc(25) int local25 = local7.method309();
			@Pc(33) Class1_Sub2_Sub3 local33 = new Class1_Sub2_Sub3(arg0, -670);
			local33.anInt474 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub2_Sub3 local48 = new Class1_Sub2_Sub3(arg0, -670);
			@Pc(53) boolean local53 = false;
			local48.anInt474 = local42;
			@Pc(64) int local64 = local42 + local19;
			@Pc(70) Class1_Sub2_Sub3 local70 = new Class1_Sub2_Sub3(arg0, -670);
			local70.anInt474 = local64;
			@Pc(77) int local77 = local64 + local22;
			@Pc(83) Class1_Sub2_Sub3 local83 = new Class1_Sub2_Sub3(arg0, -670);
			local83.anInt474 = local77;
			@Pc(90) int local90 = local77 + local25;
			@Pc(96) Class1_Sub2_Sub3 local96 = new Class1_Sub2_Sub3(arg0, -670);
			local96.anInt474 = local90;
			@Pc(105) Class8 local105 = new Class8(local96, false);
			@Pc(108) int local108 = local33.method309();
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			for (@Pc(122) int local122 = 0; local122 < local108; local122++) {
				@Pc(127) int local127 = local33.method309();
				@Pc(135) Class11 local135 = aClass11Array1[local127] = new Class11();
				local135.anInt226 = local83.method307();
				local135.aClass8_1 = local105;
				@Pc(145) int local145 = local33.method307();
				@Pc(147) int local147 = -1;
				@Pc(149) int local149 = 0;
				@Pc(156) int local156;
				for (@Pc(151) int local151 = 0; local151 < local145; local151++) {
					local156 = local48.method307();
					if (local156 > 0) {
						if (local105.anIntArray23[local151] != 0) {
							for (@Pc(167) int local167 = local151 - 1; local167 > local147; local167--) {
								if (local105.anIntArray23[local167] == 0) {
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
						if (local105.anIntArray23[local151] == 3) {
							local203 = 128;
						}
						if ((local156 & 0x1) == 0) {
							local114[local149] = local203;
						} else {
							local114[local149] = local70.method320();
						}
						if ((local156 & 0x2) == 0) {
							local117[local149] = local203;
						} else {
							local117[local149] = local70.method320();
						}
						if ((local156 & 0x4) == 0) {
							local120[local149] = local203;
						} else {
							local120[local149] = local70.method320();
						}
						local147 = local151;
						local149++;
						if (local105.anIntArray23[local151] == 5) {
							aBooleanArray3[local127] = false;
						}
					}
				}
				local135.anInt227 = local149;
				local135.anIntArray24 = new int[local149];
				local135.anIntArray25 = new int[local149];
				local135.anIntArray26 = new int[local149];
				local135.anIntArray27 = new int[local149];
				for (local156 = 0; local156 < local149; local156++) {
					local135.anIntArray24[local156] = local111[local156];
					local135.anIntArray25[local156] = local114[local156];
					local135.anIntArray26[local156] = local117[local156];
					local135.anIntArray27[local156] = local120[local156];
				}
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("21731, " + arg0 + ", " + arg1 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FIYHSKKC", name = "b", descriptor = "(I)V")
	public static void method121() {
		try {
			aClass11Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("90337, " + 7 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FIYHSKKC", name = "c", descriptor = "(I)Lclient!FIYHSKKC;")
	public static Class11 method122(@OriginalArg(0) int arg0) {
		return aClass11Array1 == null ? null : aClass11Array1[arg0];
	}

	@OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "(II)Z")
	public static boolean method123(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("28012, " + arg0 + ", " + 47525 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FIYHSKKC", name = "<init>", descriptor = "()V")
	private Class11() {
	}
}
