import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
	private static boolean aBoolean153;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt597;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method324(@OriginalArg(0) int arg0) {
		aClass14Array1 = new Class14[arg0 + 1];
		aBooleanArray8 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray8[local11] = true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BI)V")
	public static void method325(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(16, arg0);
			local7.anInt776 = arg0.length - 8;
			@Pc(16) int local16 = local7.method500();
			@Pc(19) int local19 = local7.method500();
			@Pc(22) int local22 = local7.method500();
			@Pc(25) int local25 = local7.method500();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(16, arg0);
			local33.anInt776 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(16, arg0);
			local48.anInt776 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(16, arg0);
			local61.anInt776 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(16, arg0);
			local74.anInt776 = local68;
			@Pc(90) int local90 = local68 + local25;
			@Pc(96) Class1_Sub1_Sub3 local96 = new Class1_Sub1_Sub3(16, arg0);
			local96.anInt776 = local90;
			@Pc(105) Class12 local105 = new Class12(local96, 12574);
			@Pc(108) int local108 = local33.method500();
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			for (@Pc(122) int local122 = 0; local122 < local108; local122++) {
				@Pc(127) int local127 = local33.method500();
				@Pc(135) Class14 local135 = aClass14Array1[local127] = new Class14();
				local135.anInt597 = local74.method498();
				local135.aClass12_1 = local105;
				@Pc(145) int local145 = local33.method498();
				@Pc(147) int local147 = -1;
				@Pc(149) int local149 = 0;
				@Pc(156) int local156;
				for (@Pc(151) int local151 = 0; local151 < local145; local151++) {
					local156 = local48.method498();
					if (local156 > 0) {
						if (local105.anIntArray164[local151] != 0) {
							for (@Pc(167) int local167 = local151 - 1; local167 > local147; local167--) {
								if (local105.anIntArray164[local167] == 0) {
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
						if (local105.anIntArray164[local151] == 3) {
							local203 = 128;
						}
						if ((local156 & 0x1) == 0) {
							local114[local149] = local203;
						} else {
							local114[local149] = local61.method511();
						}
						if ((local156 & 0x2) == 0) {
							local117[local149] = local203;
						} else {
							local117[local149] = local61.method511();
						}
						if ((local156 & 0x4) == 0) {
							local120[local149] = local203;
						} else {
							local120[local149] = local61.method511();
						}
						local147 = local151;
						local149++;
						if (local105.anIntArray164[local151] == 5) {
							aBooleanArray8[local127] = false;
						}
					}
				}
				local135.anInt598 = local149;
				local135.anIntArray170 = new int[local149];
				local135.anIntArray171 = new int[local149];
				local135.anIntArray172 = new int[local149];
				local135.anIntArray173 = new int[local149];
				for (local156 = 0; local156 < local149; local156++) {
					local135.anIntArray170[local156] = local111[local156];
					local135.anIntArray171[local156] = local114[local156];
					local135.anIntArray172[local156] = local117[local156];
					local135.anIntArray173[local156] = local120[local156];
				}
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("8073, " + arg0 + ", " + 473 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method326() {
		try {
			aClass14Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("59320, " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Lclient!h;")
	public static Class14 method327(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				aBoolean153 = !aBoolean153;
			}
			return aClass14Array1 == null ? null : aClass14Array1[arg1];
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("16479, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z")
	public static boolean method328(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("51468, " + 17 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
