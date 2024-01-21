import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HVIFHYEW")
public final class Class16 {

	@OriginalMember(owner = "client!HVIFHYEW", name = "c", descriptor = "I")
	private static int anInt264;

	@OriginalMember(owner = "client!HVIFHYEW", name = "d", descriptor = "[Lclient!HVIFHYEW;")
	private static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!HVIFHYEW", name = "l", descriptor = "[Z")
	private static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!HVIFHYEW", name = "a", descriptor = "Z")
	private static boolean aBoolean80 = true;

	@OriginalMember(owner = "client!HVIFHYEW", name = "b", descriptor = "I")
	private static int anInt263 = -48545;

	@OriginalMember(owner = "client!HVIFHYEW", name = "e", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!HVIFHYEW", name = "f", descriptor = "Lclient!XEMMPKIX;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!HVIFHYEW", name = "g", descriptor = "I")
	public int anInt266;

	@OriginalMember(owner = "client!HVIFHYEW", name = "h", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!HVIFHYEW", name = "i", descriptor = "[I")
	public int[] anIntArray42;

	@OriginalMember(owner = "client!HVIFHYEW", name = "j", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!HVIFHYEW", name = "k", descriptor = "[I")
	public int[] anIntArray44;

	@OriginalMember(owner = "client!HVIFHYEW", name = "a", descriptor = "(I)V")
	public static void method189(@OriginalArg(0) int arg0) {
		aClass16Array1 = new Class16[arg0 + 1];
		aBooleanArray4 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray4[local11] = true;
		}
	}

	@OriginalMember(owner = "client!HVIFHYEW", name = "a", descriptor = "(Z[B)V")
	public static void method190(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class4_Sub1_Sub4 local7 = new Class4_Sub1_Sub4(5, arg1);
			local7.anInt506 = arg1.length - 8;
			@Pc(16) int local16 = local7.method357();
			@Pc(19) int local19 = local7.method357();
			@Pc(22) int local22 = local7.method357();
			@Pc(25) int local25 = local7.method357();
			@Pc(33) Class4_Sub1_Sub4 local33 = new Class4_Sub1_Sub4(5, arg1);
			local33.anInt506 = 0;
			if (arg0) {
				@Pc(45) int local45 = local16 + 0 + 2;
				@Pc(51) Class4_Sub1_Sub4 local51 = new Class4_Sub1_Sub4(5, arg1);
				local51.anInt506 = local45;
				@Pc(58) int local58 = local45 + local19;
				@Pc(64) Class4_Sub1_Sub4 local64 = new Class4_Sub1_Sub4(5, arg1);
				local64.anInt506 = local58;
				@Pc(71) int local71 = local58 + local22;
				@Pc(77) Class4_Sub1_Sub4 local77 = new Class4_Sub1_Sub4(5, arg1);
				local77.anInt506 = local71;
				@Pc(84) int local84 = local71 + local25;
				@Pc(90) Class4_Sub1_Sub4 local90 = new Class4_Sub1_Sub4(5, arg1);
				local90.anInt506 = local84;
				@Pc(99) Class42 local99 = new Class42(local90, 428);
				@Pc(102) int local102 = local33.method357();
				@Pc(105) int[] local105 = new int[500];
				@Pc(108) int[] local108 = new int[500];
				@Pc(111) int[] local111 = new int[500];
				@Pc(114) int[] local114 = new int[500];
				for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
					@Pc(121) int local121 = local33.method357();
					@Pc(129) Class16 local129 = aClass16Array1[local121] = new Class16();
					local129.anInt265 = local77.method355();
					local129.aClass42_1 = local99;
					@Pc(139) int local139 = local33.method355();
					@Pc(141) int local141 = -1;
					@Pc(143) int local143 = 0;
					@Pc(150) int local150;
					for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
						local150 = local51.method355();
						if (local150 > 0) {
							if (local99.anIntArray157[local145] != 0) {
								for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
									if (local99.anIntArray157[local161] == 0) {
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
							if (local99.anIntArray157[local145] == 3) {
								local197 = 128;
							}
							if ((local150 & 0x1) == 0) {
								local108[local143] = local197;
							} else {
								local108[local143] = local64.method368();
							}
							if ((local150 & 0x2) == 0) {
								local111[local143] = local197;
							} else {
								local111[local143] = local64.method368();
							}
							if ((local150 & 0x4) == 0) {
								local114[local143] = local197;
							} else {
								local114[local143] = local64.method368();
							}
							local141 = local145;
							local143++;
							if (local99.anIntArray157[local145] == 5) {
								aBooleanArray4[local121] = false;
							}
						}
					}
					local129.anInt266 = local143;
					local129.anIntArray41 = new int[local143];
					local129.anIntArray42 = new int[local143];
					local129.anIntArray43 = new int[local143];
					local129.anIntArray44 = new int[local143];
					for (local150 = 0; local150 < local143; local150++) {
						local129.anIntArray41[local150] = local105[local150];
						local129.anIntArray42[local150] = local108[local150];
						local129.anIntArray43[local150] = local111[local150];
						local129.anIntArray44[local150] = local114[local150];
					}
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("35908, " + arg0 + ", " + arg1 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVIFHYEW", name = "b", descriptor = "(I)V")
	public static void method191() {
		try {
			if (anInt263 != -48545) {
				anInt264 = 56;
			}
			aClass16Array1 = null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("48879, " + -48545 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVIFHYEW", name = "c", descriptor = "(I)Lclient!HVIFHYEW;")
	public static Class16 method192(@OriginalArg(0) int arg0) {
		return aClass16Array1 == null ? null : aClass16Array1[arg0];
	}

	@OriginalMember(owner = "client!HVIFHYEW", name = "a", descriptor = "(II)Z")
	public static boolean method193(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("83073, " + arg0 + ", " + -13619 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVIFHYEW", name = "<init>", descriptor = "()V")
	private Class16() {
	}
}
