import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	private static boolean aBoolean145;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray165;

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
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 185);
			local7.anInt738 = arg0.length - 8;
			@Pc(16) int local16 = local7.method476();
			@Pc(19) int local19 = local7.method476();
			@Pc(22) int local22 = local7.method476();
			@Pc(25) int local25 = local7.method476();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 185);
			local33.anInt738 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 185);
			local48.anInt738 = local42;
			@Pc(64) int local64 = local42 + local19;
			@Pc(70) Class1_Sub1_Sub3 local70 = new Class1_Sub1_Sub3(arg0, 185);
			local70.anInt738 = local64;
			@Pc(77) int local77 = local64 + local22;
			@Pc(83) Class1_Sub1_Sub3 local83 = new Class1_Sub1_Sub3(arg0, 185);
			local83.anInt738 = local77;
			@Pc(90) int local90 = local77 + local25;
			@Pc(96) Class1_Sub1_Sub3 local96 = new Class1_Sub1_Sub3(arg0, 185);
			local96.anInt738 = local90;
			@Pc(105) Class10 local105 = new Class10(true, local96);
			@Pc(108) int local108 = local33.method476();
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			for (@Pc(122) int local122 = 0; local122 < local108; local122++) {
				@Pc(127) int local127 = local33.method476();
				@Pc(135) Class12 local135 = aClass12Array1[local127] = new Class12();
				local135.anInt538 = local83.method474();
				local135.aClass10_1 = local105;
				@Pc(145) int local145 = local33.method474();
				@Pc(147) int local147 = -1;
				@Pc(149) int local149 = 0;
				@Pc(156) int local156;
				for (@Pc(151) int local151 = 0; local151 < local145; local151++) {
					local156 = local48.method474();
					if (local156 > 0) {
						if (local105.anIntArray159[local151] != 0) {
							for (@Pc(167) int local167 = local151 - 1; local167 > local147; local167--) {
								if (local105.anIntArray159[local167] == 0) {
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
						if (local105.anIntArray159[local151] == 3) {
							local203 = 128;
						}
						if ((local156 & 0x1) == 0) {
							local114[local149] = local203;
						} else {
							local114[local149] = local70.method487();
						}
						if ((local156 & 0x2) == 0) {
							local117[local149] = local203;
						} else {
							local117[local149] = local70.method487();
						}
						if ((local156 & 0x4) == 0) {
							local120[local149] = local203;
						} else {
							local120[local149] = local70.method487();
						}
						local147 = local151;
						local149++;
						if (local105.anIntArray159[local151] == 5) {
							aBooleanArray7[local127] = false;
						}
					}
				}
				local135.anInt539 = local149;
				local135.anIntArray162 = new int[local149];
				local135.anIntArray163 = new int[local149];
				local135.anIntArray164 = new int[local149];
				local135.anIntArray165 = new int[local149];
				for (local156 = 0; local156 < local149; local156++) {
					local135.anIntArray162[local156] = local111[local156];
					local135.anIntArray163[local156] = local114[local156];
					local135.anIntArray164[local156] = local117[local156];
					local135.anIntArray165[local156] = local120[local156];
				}
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("5360, " + -635 + ", " + arg0 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method302() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("86382, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Lclient!g;")
	public static Class12 method303(@OriginalArg(0) int arg0) {
		try {
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("9272, " + arg0 + ", " + -104 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return arg1 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("64090, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
