import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RYVJCVCB")
public final class Class40 {

	@OriginalMember(owner = "client!RYVJCVCB", name = "c", descriptor = "[Lclient!RYVJCVCB;")
	private static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!RYVJCVCB", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!RYVJCVCB", name = "a", descriptor = "I")
	private static int anInt647 = 1;

	@OriginalMember(owner = "client!RYVJCVCB", name = "b", descriptor = "I")
	private static int anInt648 = 754;

	@OriginalMember(owner = "client!RYVJCVCB", name = "d", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!RYVJCVCB", name = "e", descriptor = "Lclient!ANHDGPPA;")
	public Class4 aClass4_1;

	@OriginalMember(owner = "client!RYVJCVCB", name = "f", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!RYVJCVCB", name = "g", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!RYVJCVCB", name = "h", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!RYVJCVCB", name = "i", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!RYVJCVCB", name = "j", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!RYVJCVCB", name = "a", descriptor = "(I)V")
	public static void method363(@OriginalArg(0) int arg0) {
		aClass40Array1 = new Class40[arg0 + 1];
		aBooleanArray8 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray8[local11] = true;
		}
	}

	@OriginalMember(owner = "client!RYVJCVCB", name = "a", descriptor = "([BI)V")
	public static void method364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 9, arg0);
			local7.anInt806 = arg0.length - 8;
			@Pc(16) int local16 = local7.method500();
			@Pc(19) int local19 = local7.method500();
			@Pc(22) int local22 = local7.method500();
			@Pc(25) int local25 = local7.method500();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3((byte) 9, arg0);
			local33.anInt806 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3((byte) 9, arg0);
			local48.anInt806 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3((byte) 9, arg0);
			local61.anInt806 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3((byte) 9, arg0);
			local74.anInt806 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3((byte) 9, arg0);
			if (arg1 == 0) {
				local87.anInt806 = local81;
				@Pc(99) Class4 local99 = new Class4(anInt648, local87);
				@Pc(102) int local102 = local33.method500();
				@Pc(105) int[] local105 = new int[500];
				@Pc(108) int[] local108 = new int[500];
				@Pc(111) int[] local111 = new int[500];
				@Pc(114) int[] local114 = new int[500];
				for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
					@Pc(121) int local121 = local33.method500();
					@Pc(129) Class40 local129 = aClass40Array1[local121] = new Class40();
					local129.anInt649 = local74.method498();
					local129.aClass4_1 = local99;
					@Pc(139) int local139 = local33.method498();
					@Pc(141) int local141 = -1;
					@Pc(143) int local143 = 0;
					@Pc(150) int local150;
					for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
						local150 = local48.method498();
						if (local150 > 0) {
							if (local99.anIntArray4[local145] != 0) {
								for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
									if (local99.anIntArray4[local161] == 0) {
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
							if (local99.anIntArray4[local145] == 3) {
								local197 = 128;
							}
							if ((local150 & 0x1) == 0) {
								local108[local143] = local197;
							} else {
								local108[local143] = local61.method511();
							}
							if ((local150 & 0x2) == 0) {
								local111[local143] = local197;
							} else {
								local111[local143] = local61.method511();
							}
							if ((local150 & 0x4) == 0) {
								local114[local143] = local197;
							} else {
								local114[local143] = local61.method511();
							}
							local141 = local145;
							local143++;
							if (local99.anIntArray4[local145] == 5) {
								aBooleanArray8[local121] = false;
							}
						}
					}
					local129.anInt650 = local143;
					local129.anIntArray160 = new int[local143];
					local129.anIntArray161 = new int[local143];
					local129.anIntArray162 = new int[local143];
					local129.anIntArray163 = new int[local143];
					for (local150 = 0; local150 < local143; local150++) {
						local129.anIntArray160[local150] = local105[local150];
						local129.anIntArray161[local150] = local108[local150];
						local129.anIntArray162[local150] = local111[local150];
						local129.anIntArray163[local150] = local114[local150];
					}
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("13344, " + arg0 + ", " + arg1 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RYVJCVCB", name = "b", descriptor = "(I)V")
	public static void method365() {
		try {
			aClass40Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("8448, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RYVJCVCB", name = "a", descriptor = "(ZI)Lclient!RYVJCVCB;")
	public static Class40 method366(@OriginalArg(1) int arg0) {
		try {
			return aClass40Array1 == null ? null : aClass40Array1[arg0];
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("37015, " + true + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RYVJCVCB", name = "a", descriptor = "(II)Z")
	public static boolean method367(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("17641, " + 4 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RYVJCVCB", name = "<init>", descriptor = "()V")
	private Class40() {
	}
}
