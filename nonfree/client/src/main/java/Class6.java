import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CANZHIOT")
public final class Class6 {

	@OriginalMember(owner = "client!CANZHIOT", name = "a", descriptor = "Z")
	private static boolean aBoolean26;

	@OriginalMember(owner = "client!CANZHIOT", name = "b", descriptor = "[Lclient!CANZHIOT;")
	private static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!CANZHIOT", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!CANZHIOT", name = "c", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!CANZHIOT", name = "d", descriptor = "Lclient!AQXKJVRI;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!CANZHIOT", name = "e", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!CANZHIOT", name = "f", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!CANZHIOT", name = "g", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!CANZHIOT", name = "h", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!CANZHIOT", name = "i", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!CANZHIOT", name = "a", descriptor = "(I)V")
	public static void method40(@OriginalArg(0) int arg0) {
		aClass6Array1 = new Class6[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	@OriginalMember(owner = "client!CANZHIOT", name = "a", descriptor = "(I[B)V")
	public static void method41(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(arg0, 792);
			local7.anInt153 = arg0.length - 8;
			@Pc(16) int local16 = local7.method61();
			@Pc(19) int local19 = local7.method61();
			@Pc(22) int local22 = local7.method61();
			@Pc(25) int local25 = local7.method61();
			@Pc(33) Class1_Sub1_Sub2 local33 = new Class1_Sub1_Sub2(arg0, 792);
			local33.anInt153 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub2 local48 = new Class1_Sub1_Sub2(arg0, 792);
			local48.anInt153 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub2 local61 = new Class1_Sub1_Sub2(arg0, 792);
			local61.anInt153 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub2 local74 = new Class1_Sub1_Sub2(arg0, 792);
			local74.anInt153 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub2 local87 = new Class1_Sub1_Sub2(arg0, 792);
			local87.anInt153 = local81;
			@Pc(99) Class2 local99 = new Class2(local87, (byte) 9);
			@Pc(102) int local102 = local33.method61();
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			for (@Pc(116) int local116 = 0; local116 < local102; local116++) {
				@Pc(121) int local121 = local33.method61();
				@Pc(129) Class6 local129 = aClass6Array1[local121] = new Class6();
				local129.anInt137 = local74.method59();
				local129.aClass2_1 = local99;
				@Pc(139) int local139 = local33.method59();
				@Pc(141) int local141 = -1;
				@Pc(143) int local143 = 0;
				@Pc(150) int local150;
				for (@Pc(145) int local145 = 0; local145 < local139; local145++) {
					local150 = local48.method59();
					if (local150 > 0) {
						if (local99.anIntArray11[local145] != 0) {
							for (@Pc(161) int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray11[local161] == 0) {
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
						if (local99.anIntArray11[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local61.method72();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local61.method72();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local61.method72();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray11[local145] == 5) {
							aBooleanArray3[local121] = false;
						}
					}
				}
				local129.anInt138 = local143;
				local129.anIntArray14 = new int[local143];
				local129.anIntArray15 = new int[local143];
				local129.anIntArray16 = new int[local143];
				local129.anIntArray17 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray14[local150] = local105[local150];
					local129.anIntArray15[local150] = local108[local150];
					local129.anIntArray16[local150] = local111[local150];
					local129.anIntArray17[local150] = local114[local150];
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("3205, " + 444 + ", " + arg0 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CANZHIOT", name = "a", descriptor = "(Z)V")
	public static void method42() {
		try {
			aClass6Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("63741, " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CANZHIOT", name = "a", descriptor = "(II)Lclient!CANZHIOT;")
	public static Class6 method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 0 || arg1 > 0) {
				throw new NullPointerException();
			}
			return aClass6Array1 == null ? null : aClass6Array1[arg0];
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("65805, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CANZHIOT", name = "a", descriptor = "(IZ)Z")
	public static boolean method44(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("16767, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CANZHIOT", name = "<init>", descriptor = "()V")
	private Class6() {
	}
}
