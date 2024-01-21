import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt534;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray163;

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
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, true);
			local7.anInt766 = arg0.length - 8;
			@Pc(29) int local29 = local7.method505();
			@Pc(32) int local32 = local7.method505();
			@Pc(35) int local35 = local7.method505();
			@Pc(38) int local38 = local7.method505();
			@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0, true);
			local46.anInt766 = 0;
			@Pc(55) int local55 = local29 + 0 + 2;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, true);
			local61.anInt766 = local55;
			@Pc(68) int local68 = local55 + local32;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, true);
			local74.anInt766 = local68;
			@Pc(81) int local81 = local68 + local35;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, true);
			local87.anInt766 = local81;
			@Pc(94) int local94 = local81 + local38;
			@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(arg0, true);
			local100.anInt766 = local94;
			@Pc(109) Class10 local109 = new Class10(local100, (byte) 4);
			@Pc(112) int local112 = local46.method505();
			@Pc(115) int[] local115 = new int[500];
			@Pc(118) int[] local118 = new int[500];
			@Pc(121) int[] local121 = new int[500];
			@Pc(124) int[] local124 = new int[500];
			for (@Pc(126) int local126 = 0; local126 < local112; local126++) {
				@Pc(131) int local131 = local46.method505();
				@Pc(139) Class12 local139 = aClass12Array1[local131] = new Class12();
				local139.anInt535 = local87.method503();
				local139.aClass10_1 = local109;
				@Pc(149) int local149 = local46.method503();
				@Pc(151) int local151 = -1;
				@Pc(153) int local153 = 0;
				@Pc(160) int local160;
				for (@Pc(155) int local155 = 0; local155 < local149; local155++) {
					local160 = local61.method503();
					if (local160 > 0) {
						if (local109.anIntArray154[local155] != 0) {
							for (@Pc(171) int local171 = local155 - 1; local171 > local151; local171--) {
								if (local109.anIntArray154[local171] == 0) {
									local115[local153] = local171;
									local118[local153] = 0;
									local121[local153] = 0;
									local124[local153] = 0;
									local153++;
									break;
								}
							}
						}
						local115[local153] = local155;
						@Pc(207) short local207 = 0;
						if (local109.anIntArray154[local155] == 3) {
							local207 = 128;
						}
						if ((local160 & 0x1) == 0) {
							local118[local153] = local207;
						} else {
							local118[local153] = local74.method516();
						}
						if ((local160 & 0x2) == 0) {
							local121[local153] = local207;
						} else {
							local121[local153] = local74.method516();
						}
						if ((local160 & 0x4) == 0) {
							local124[local153] = local207;
						} else {
							local124[local153] = local74.method516();
						}
						local151 = local155;
						local153++;
						if (local109.anIntArray154[local155] == 5) {
							aBooleanArray7[local131] = false;
						}
					}
				}
				local139.anInt536 = local153;
				local139.anIntArray160 = new int[local153];
				local139.anIntArray161 = new int[local153];
				local139.anIntArray162 = new int[local153];
				local139.anIntArray163 = new int[local153];
				for (local160 = 0; local160 < local153; local160++) {
					local139.anIntArray160[local160] = local115[local160];
					local139.anIntArray161[local160] = local118[local160];
					local139.anIntArray162[local160] = local121[local160];
					local139.anIntArray163[local160] = local124[local160];
				}
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("88532, " + 6 + ", " + arg0 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method302() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("26061, " + 0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!g;")
	public static Class12 method303(@OriginalArg(0) int arg0) {
		try {
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("21736, " + arg0 + ", " + 196 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public static boolean method304(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("77550, " + arg0 + ", " + 62 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
