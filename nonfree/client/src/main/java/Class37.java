import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SQHJOGRT")
public final class Class37 {

	@OriginalMember(owner = "client!SQHJOGRT", name = "b", descriptor = "[Lclient!SQHJOGRT;")
	private static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!SQHJOGRT", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "I")
	private static int anInt653 = -715;

	@OriginalMember(owner = "client!SQHJOGRT", name = "c", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!SQHJOGRT", name = "d", descriptor = "Lclient!KVCQPLIW;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!SQHJOGRT", name = "e", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!SQHJOGRT", name = "f", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!SQHJOGRT", name = "g", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!SQHJOGRT", name = "h", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!SQHJOGRT", name = "i", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "(I)V")
	public static void method452(@OriginalArg(0) int arg0) {
		aClass37Array1 = new Class37[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "([BZ)V")
	public static void method453(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 891);
			local7.anInt468 = arg0.length - 8;
			@Pc(16) int local16 = local7.method270();
			@Pc(19) int local19 = local7.method270();
			@Pc(22) int local22 = local7.method270();
			@Pc(25) int local25 = local7.method270();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 891);
			local33.anInt468 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 891);
			local48.anInt468 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, 891);
			local61.anInt468 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, 891);
			local74.anInt468 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, 891);
			local87.anInt468 = local81;
			@Pc(105) Class20 local105 = new Class20(0, local87);
			@Pc(108) int local108 = local33.method270();
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			for (@Pc(122) int local122 = 0; local122 < local108; local122++) {
				@Pc(127) int local127 = local33.method270();
				@Pc(135) Class37 local135 = aClass37Array1[local127] = new Class37();
				local135.anInt654 = local74.method268();
				local135.aClass20_1 = local105;
				@Pc(145) int local145 = local33.method268();
				@Pc(147) int local147 = -1;
				@Pc(149) int local149 = 0;
				@Pc(156) int local156;
				for (@Pc(151) int local151 = 0; local151 < local145; local151++) {
					local156 = local48.method268();
					if (local156 > 0) {
						if (local105.anIntArray75[local151] != 0) {
							for (@Pc(167) int local167 = local151 - 1; local167 > local147; local167--) {
								if (local105.anIntArray75[local167] == 0) {
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
						if (local105.anIntArray75[local151] == 3) {
							local203 = 128;
						}
						if ((local156 & 0x1) == 0) {
							local114[local149] = local203;
						} else {
							local114[local149] = local61.method281();
						}
						if ((local156 & 0x2) == 0) {
							local117[local149] = local203;
						} else {
							local117[local149] = local61.method281();
						}
						if ((local156 & 0x4) == 0) {
							local120[local149] = local203;
						} else {
							local120[local149] = local61.method281();
						}
						local147 = local151;
						local149++;
						if (local105.anIntArray75[local151] == 5) {
							aBooleanArray7[local127] = false;
						}
					}
				}
				local135.anInt655 = local149;
				local135.anIntArray121 = new int[local149];
				local135.anIntArray122 = new int[local149];
				local135.anIntArray123 = new int[local149];
				local135.anIntArray124 = new int[local149];
				for (local156 = 0; local156 < local149; local156++) {
					local135.anIntArray121[local156] = local111[local156];
					local135.anIntArray122[local156] = local114[local156];
					local135.anIntArray123[local156] = local117[local156];
					local135.anIntArray124[local156] = local120[local156];
				}
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("72235, " + arg0 + ", " + false + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQHJOGRT", name = "b", descriptor = "(I)V")
	public static void method454() {
		try {
			aClass37Array1 = null;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("26556, " + -501 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "(II)Lclient!SQHJOGRT;")
	public static Class37 method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 9) {
				throw new NullPointerException();
			}
			return aClass37Array1 == null ? null : aClass37Array1[arg1];
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("96908, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "(IZ)Z")
	public static boolean method456(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("73746, " + arg0 + ", " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQHJOGRT", name = "<init>", descriptor = "()V")
	private Class37() {
	}
}
