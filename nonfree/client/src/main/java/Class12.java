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

	@OriginalMember(owner = "client!g", name = "a", descriptor = "B")
	private static byte aByte29 = 59;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt548;

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
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(false, arg0);
			local7.anInt757 = arg0.length - 8;
			@Pc(16) int local16 = local7.method482();
			@Pc(19) int local19 = local7.method482();
			@Pc(25) int local25 = local7.method482();
			@Pc(28) int local28 = local7.method482();
			@Pc(36) Class1_Sub1_Sub3 local36 = new Class1_Sub1_Sub3(false, arg0);
			local36.anInt757 = 0;
			@Pc(45) int local45 = local16 + 0 + 2;
			@Pc(51) Class1_Sub1_Sub3 local51 = new Class1_Sub1_Sub3(false, arg0);
			local51.anInt757 = local45;
			@Pc(58) int local58 = local45 + local19;
			@Pc(64) Class1_Sub1_Sub3 local64 = new Class1_Sub1_Sub3(false, arg0);
			local64.anInt757 = local58;
			@Pc(71) int local71 = local58 + local25;
			@Pc(77) Class1_Sub1_Sub3 local77 = new Class1_Sub1_Sub3(false, arg0);
			local77.anInt757 = local71;
			@Pc(84) int local84 = local71 + local28;
			@Pc(90) Class1_Sub1_Sub3 local90 = new Class1_Sub1_Sub3(false, arg0);
			local90.anInt757 = local84;
			@Pc(99) Class10 local99 = new Class10(local90, false);
			@Pc(102) int local102 = local36.method482();
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
				@Pc(121) int local121 = local36.method482();
				@Pc(129) Class12 local129 = aClass12Array1[local121] = new Class12();
				local129.anInt547 = local77.method480();
				local129.aClass10_1 = local99;
				@Pc(139) int local139 = local36.method480();
				@Pc(141) int local141 = -1;
				@Pc(143) int local143 = 0;
				@Pc(150) int local150;
				for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
					local150 = local51.method480();
					if (local150 > 0) {
						if (local99.anIntArray161[local145] != 0) {
							for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray161[local161] == 0) {
									local105[local143] = local161;
									local108[local143] = 0;
									local111[local143] = 0;
									local114[local143] = 0;
									local143++;
									break;
								}
							}
						}
						local105[local143] = local145;
						@Pc(197) short local197 = 0;
						if (local99.anIntArray161[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local64.method493();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local64.method493();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local64.method493();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray161[local145] == 5) {
							aBooleanArray7[local121] = false;
						}
					}
				}
				local129.anInt548 = local143;
				local129.anIntArray164 = new int[local143];
				local129.anIntArray165 = new int[local143];
				local129.anIntArray166 = new int[local143];
				local129.anIntArray167 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray164[local150] = local105[local150];
					local129.anIntArray165[local150] = local108[local150];
					local129.anIntArray166[local150] = local111[local150];
					local129.anIntArray167[local150] = local114[local150];
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("74895, " + 958 + ", " + arg0 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method304(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != aByte29) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			aClass12Array1 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("90849, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!g;")
	public static Class12 method305(@OriginalArg(0) int arg0) {
		try {
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("88296, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public static boolean method306(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("71347, " + arg0 + ", " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
