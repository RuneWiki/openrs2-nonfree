import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "I")
	private static int anInt616 = 336;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method328(@OriginalArg(0) int arg0) {
		aClass14Array1 = new Class14[arg0 + 1];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[B)V")
	public static void method329(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, true);
			local7.anInt777 = arg0.length - 8;
			@Pc(16) int local16 = local7.method470();
			@Pc(19) int local19 = local7.method470();
			@Pc(22) int local22 = local7.method470();
			@Pc(25) int local25 = local7.method470();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, true);
			local33.anInt777 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, true);
			local48.anInt777 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, true);
			local61.anInt777 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, true);
			local74.anInt777 = local68;
			@Pc(85) int local85 = local68 + local25;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3(arg0, true);
			local91.anInt777 = local85;
			@Pc(100) Class12 local100 = new Class12(0, local91);
			@Pc(103) int local103 = local33.method470();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method470();
				@Pc(130) Class14 local130 = aClass14Array1[local122] = new Class14();
				local130.anInt617 = local74.method468();
				local130.aClass12_1 = local100;
				@Pc(140) int local140 = local33.method468();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method468();
					if (local151 > 0) {
						if (local100.anIntArray157[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray157[local162] == 0) {
									local106[local144] = local162;
									local109[local144] = 0;
									local112[local144] = 0;
									local115[local144] = 0;
									local144++;
									break;
								}
							}
						}
						local106[local144] = local146;
						@Pc(198) short local198 = 0;
						if (local100.anIntArray157[local106[local144]] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method481();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method481();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method481();
						}
						local142 = local146;
						local144++;
					}
				}
				local130.anInt618 = local144;
				local130.anIntArray163 = new int[local144];
				local130.anIntArray164 = new int[local144];
				local130.anIntArray165 = new int[local144];
				local130.anIntArray166 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray163[local151] = local106[local151];
					local130.anIntArray164[local151] = local109[local151];
					local130.anIntArray165[local151] = local112[local151];
					local130.anIntArray166[local151] = local115[local151];
				}
			}
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("37240, " + -137 + ", " + arg0 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method330() {
		try {
			aClass14Array1 = null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("94570, " + 7 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!h;")
	public static Class14 method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				throw new NullPointerException();
			} else if (aClass14Array1 == null) {
				return null;
			} else {
				return aClass14Array1[arg0];
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("73447, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
