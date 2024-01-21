import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DFGNFGZH")
public final class Class7 {

	@OriginalMember(owner = "client!DFGNFGZH", name = "a", descriptor = "[Lclient!DFGNFGZH;")
	private static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!DFGNFGZH", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!DFGNFGZH", name = "b", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!DFGNFGZH", name = "c", descriptor = "Lclient!BIWBGZXL;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!DFGNFGZH", name = "d", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!DFGNFGZH", name = "e", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!DFGNFGZH", name = "f", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!DFGNFGZH", name = "g", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!DFGNFGZH", name = "h", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!DFGNFGZH", name = "a", descriptor = "(I)V")
	public static void method90(@OriginalArg(0) int arg0) {
		aClass7Array1 = new Class7[arg0 + 1];
		aBooleanArray5 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray5[local11] = true;
		}
	}

	@OriginalMember(owner = "client!DFGNFGZH", name = "a", descriptor = "(I[B)V")
	public static void method91(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2(true, arg1);
			local7.anInt429 = arg1.length - 8;
			@Pc(16) int local16 = local7.method202();
			@Pc(19) int local19 = local7.method202();
			@Pc(22) int local22 = local7.method202();
			@Pc(25) int local25 = local7.method202();
			@Pc(33) Class3_Sub1_Sub2 local33 = new Class3_Sub1_Sub2(true, arg1);
			local33.anInt429 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class3_Sub1_Sub2 local48 = new Class3_Sub1_Sub2(true, arg1);
			local48.anInt429 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class3_Sub1_Sub2 local61 = new Class3_Sub1_Sub2(true, arg1);
			local61.anInt429 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class3_Sub1_Sub2 local74 = new Class3_Sub1_Sub2(true, arg1);
			local74.anInt429 = local68;
			@Pc(81) boolean local81 = false;
			@Pc(85) int local85 = local68 + local25;
			@Pc(91) Class3_Sub1_Sub2 local91 = new Class3_Sub1_Sub2(true, arg1);
			local91.anInt429 = local85;
			@Pc(100) Class1 local100 = new Class1(local91, -23713);
			@Pc(103) int local103 = local33.method202();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method202();
				@Pc(130) Class7 local130 = aClass7Array1[local122] = new Class7();
				local130.anInt176 = local74.method200();
				local130.aClass1_1 = local100;
				@Pc(140) int local140 = local33.method200();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method200();
					if (local151 > 0) {
						if (local100.anIntArray1[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray1[local162] == 0) {
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
						if (local100.anIntArray1[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method213();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method213();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method213();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray1[local146] == 5) {
							aBooleanArray5[local122] = false;
						}
					}
				}
				local130.anInt177 = local144;
				local130.anIntArray83 = new int[local144];
				local130.anIntArray84 = new int[local144];
				local130.anIntArray85 = new int[local144];
				local130.anIntArray86 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray83[local151] = local106[local151];
					local130.anIntArray84[local151] = local109[local151];
					local130.anIntArray85[local151] = local112[local151];
					local130.anIntArray86[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("36025, " + arg0 + ", " + arg1 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DFGNFGZH", name = "b", descriptor = "(I)V")
	public static void method92(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == -38190) {
				aClass7Array1 = null;
			}
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("68727, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DFGNFGZH", name = "c", descriptor = "(I)Lclient!DFGNFGZH;")
	public static Class7 method93(@OriginalArg(0) int arg0) {
		return aClass7Array1 == null ? null : aClass7Array1[arg0];
	}

	@OriginalMember(owner = "client!DFGNFGZH", name = "a", descriptor = "(ZI)Z")
	public static boolean method94(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("12014, " + false + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DFGNFGZH", name = "<init>", descriptor = "()V")
	private Class7() {
	}
}
