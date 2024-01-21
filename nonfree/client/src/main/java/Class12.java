import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt541 = 39405;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method302(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)V")
	public static void method303(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, -26728);
			local7.anInt742 = arg0.length - 8;
			@Pc(16) int local16 = local7.method482();
			@Pc(19) int local19 = local7.method482();
			@Pc(22) int local22 = local7.method482();
			@Pc(25) int local25 = local7.method482();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, -26728);
			local33.anInt742 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, -26728);
			local48.anInt742 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, -26728);
			local61.anInt742 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, -26728);
			local87.anInt742 = local68;
			@Pc(94) int local94 = local68 + local25;
			@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(arg0, -26728);
			local100.anInt742 = local94;
			@Pc(109) Class10 local109 = new Class10(local100, true);
			@Pc(112) int local112 = local33.method482();
			@Pc(115) int[] local115 = new int[500];
			@Pc(118) int[] local118 = new int[500];
			@Pc(121) int[] local121 = new int[500];
			@Pc(124) int[] local124 = new int[500];
			for (@Pc(126) int local126 = 0; local126 < local112; local126++) {
				@Pc(131) int local131 = local33.method482();
				@Pc(139) Class12 local139 = aClass12Array1[local131] = new Class12();
				local139.anInt542 = local87.method480();
				local139.aClass10_1 = local109;
				@Pc(149) int local149 = local33.method480();
				@Pc(151) int local151 = -1;
				@Pc(153) int local153 = 0;
				@Pc(160) int local160;
				for (@Pc(155) int local155 = 0; local155 < local149; local155++) {
					local160 = local48.method480();
					if (local160 > 0) {
						if (local109.anIntArray161[local155] != 0) {
							for (@Pc(171) int local171 = local155 - 1; local171 > local151; local171--) {
								if (local109.anIntArray161[local171] == 0) {
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
						if (local109.anIntArray161[local155] == 3) {
							local207 = 128;
						}
						if ((local160 & 0x1) == 0) {
							local118[local153] = local207;
						} else {
							local118[local153] = local61.method493();
						}
						if ((local160 & 0x2) == 0) {
							local121[local153] = local207;
						} else {
							local121[local153] = local61.method493();
						}
						if ((local160 & 0x4) == 0) {
							local124[local153] = local207;
						} else {
							local124[local153] = local61.method493();
						}
						local151 = local155;
						local153++;
						if (local109.anIntArray161[local155] == 5) {
							aBooleanArray7[local131] = false;
						}
					}
				}
				local139.anInt543 = local153;
				local139.anIntArray164 = new int[local153];
				local139.anIntArray165 = new int[local153];
				local139.anIntArray166 = new int[local153];
				local139.anIntArray167 = new int[local153];
				for (local160 = 0; local160 < local153; local160++) {
					local139.anIntArray164[local160] = local115[local160];
					local139.anIntArray165[local160] = local118[local160];
					local139.anIntArray166[local160] = local121[local160];
					local139.anIntArray167[local160] = local124[local160];
				}
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("72701, " + 3 + ", " + arg0 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method304() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("52133, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)Lclient!g;")
	public static Class12 method305(@OriginalArg(1) int arg0) {
		try {
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("28717, " + true + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method306(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("65640, " + arg0 + ", " + 45733 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
