import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AOFTXYIM")
public final class Class3 {

	@OriginalMember(owner = "client!AOFTXYIM", name = "a", descriptor = "[Lclient!AOFTXYIM;")
	private static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!AOFTXYIM", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!AOFTXYIM", name = "b", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!AOFTXYIM", name = "c", descriptor = "Lclient!WPDTVMXY;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!AOFTXYIM", name = "d", descriptor = "I")
	public int anInt14;

	@OriginalMember(owner = "client!AOFTXYIM", name = "e", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!AOFTXYIM", name = "f", descriptor = "[I")
	public int[] anIntArray2;

	@OriginalMember(owner = "client!AOFTXYIM", name = "g", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!AOFTXYIM", name = "h", descriptor = "[I")
	public int[] anIntArray4;

	@OriginalMember(owner = "client!AOFTXYIM", name = "a", descriptor = "(I)V")
	public static void method1(@OriginalArg(0) int arg0) {
		aClass3Array1 = new Class3[arg0 + 1];
		aBooleanArray1 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray1[local11] = true;
		}
	}

	@OriginalMember(owner = "client!AOFTXYIM", name = "a", descriptor = "(I[B)V")
	public static void method2(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg0, 0);
			local7.anInt429 = arg0.length - 8;
			@Pc(16) int local16 = local7.method242();
			@Pc(19) int local19 = local7.method242();
			@Pc(22) int local22 = local7.method242();
			@Pc(25) int local25 = local7.method242();
			@Pc(33) Class5_Sub1_Sub4 local33 = new Class5_Sub1_Sub4(arg0, 0);
			local33.anInt429 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class5_Sub1_Sub4 local48 = new Class5_Sub1_Sub4(arg0, 0);
			local48.anInt429 = local42;
			@Pc(58) int local58 = local42 + local19;
			@Pc(64) Class5_Sub1_Sub4 local64 = new Class5_Sub1_Sub4(arg0, 0);
			local64.anInt429 = local58;
			@Pc(71) int local71 = local58 + local22;
			@Pc(77) Class5_Sub1_Sub4 local77 = new Class5_Sub1_Sub4(arg0, 0);
			local77.anInt429 = local71;
			@Pc(84) int local84 = local71 + local25;
			@Pc(90) Class5_Sub1_Sub4 local90 = new Class5_Sub1_Sub4(arg0, 0);
			local90.anInt429 = local84;
			@Pc(99) Class47 local99 = new Class47(local90, true);
			@Pc(102) int local102 = local33.method242();
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
				@Pc(121) int local121 = local33.method242();
				@Pc(129) Class3 local129 = aClass3Array1[local121] = new Class3();
				local129.anInt13 = local77.method240();
				local129.aClass47_1 = local99;
				@Pc(139) int local139 = local33.method240();
				@Pc(141) int local141 = -1;
				@Pc(143) int local143 = 0;
				@Pc(150) int local150;
				for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
					local150 = local48.method240();
					if (local150 > 0) {
						if (local99.anIntArray193[local145] != 0) {
							for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray193[local161] == 0) {
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
						if (local99.anIntArray193[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local64.method253();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local64.method253();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local64.method253();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray193[local145] == 5) {
							aBooleanArray1[local121] = false;
						}
					}
				}
				local129.anInt14 = local143;
				local129.anIntArray1 = new int[local143];
				local129.anIntArray2 = new int[local143];
				local129.anIntArray3 = new int[local143];
				local129.anIntArray4 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray1[local150] = local105[local150];
					local129.anIntArray2[local150] = local108[local150];
					local129.anIntArray3[local150] = local111[local150];
					local129.anIntArray4[local150] = local114[local150];
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("49486, " + 250 + ", " + arg0 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOFTXYIM", name = "a", descriptor = "(B)V")
	public static void method3() {
		try {
			aClass3Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("72585, " + 0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOFTXYIM", name = "b", descriptor = "(I)Lclient!AOFTXYIM;")
	public static Class3 method4(@OriginalArg(0) int arg0) {
		return aClass3Array1 == null ? null : aClass3Array1[arg0];
	}

	@OriginalMember(owner = "client!AOFTXYIM", name = "a", descriptor = "(BI)Z")
	public static boolean method5(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("42075, " + 2 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOFTXYIM", name = "<init>", descriptor = "()V")
	private Class3() {
	}
}
