import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UIZESDZR")
public final class Class42 {

	@OriginalMember(owner = "client!UIZESDZR", name = "a", descriptor = "Z")
	private static boolean aBoolean170;

	@OriginalMember(owner = "client!UIZESDZR", name = "b", descriptor = "[Lclient!UIZESDZR;")
	private static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!UIZESDZR", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!UIZESDZR", name = "c", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!UIZESDZR", name = "d", descriptor = "Lclient!KLNBCMBU;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!UIZESDZR", name = "e", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!UIZESDZR", name = "f", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!UIZESDZR", name = "g", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!UIZESDZR", name = "h", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!UIZESDZR", name = "i", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!UIZESDZR", name = "a", descriptor = "(I)V")
	public static void method475(@OriginalArg(0) int arg0) {
		aClass42Array1 = new Class42[arg0 + 1];
		aBooleanArray10 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray10[local11] = true;
		}
	}

	@OriginalMember(owner = "client!UIZESDZR", name = "a", descriptor = "(I[B)V")
	public static void method476(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(false, arg0);
			local7.anInt10 = arg0.length - 8;
			@Pc(16) int local16 = local7.method24();
			@Pc(19) int local19 = local7.method24();
			@Pc(22) int local22 = local7.method24();
			@Pc(25) int local25 = local7.method24();
			@Pc(33) Class1_Sub1_Sub2 local33 = new Class1_Sub1_Sub2(false, arg0);
			local33.anInt10 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub2 local48 = new Class1_Sub1_Sub2(false, arg0);
			local48.anInt10 = local42;
			@Pc(63) int local63 = local42 + local19;
			@Pc(69) Class1_Sub1_Sub2 local69 = new Class1_Sub1_Sub2(false, arg0);
			local69.anInt10 = local63;
			@Pc(76) int local76 = local63 + local22;
			@Pc(82) Class1_Sub1_Sub2 local82 = new Class1_Sub1_Sub2(false, arg0);
			local82.anInt10 = local76;
			@Pc(89) int local89 = local76 + local25;
			@Pc(95) Class1_Sub1_Sub2 local95 = new Class1_Sub1_Sub2(false, arg0);
			local95.anInt10 = local89;
			@Pc(104) Class19 local104 = new Class19(local95, (byte) 2);
			@Pc(107) int local107 = local33.method24();
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			@Pc(119) int[] local119 = new int[500];
			for (@Pc(121) int local121 = 0; local121 < local107; local121++) {
				@Pc(126) int local126 = local33.method24();
				@Pc(134) Class42 local134 = aClass42Array1[local126] = new Class42();
				local134.anInt726 = local82.method22();
				local134.aClass19_1 = local104;
				@Pc(144) int local144 = local33.method22();
				@Pc(146) int local146 = -1;
				@Pc(148) int local148 = 0;
				@Pc(155) int local155;
				for (@Pc(150) int local150 = 0; local150 < local144; local150++) {
					local155 = local48.method22();
					if (local155 > 0) {
						if (local104.anIntArray112[local150] != 0) {
							for (@Pc(166) int local166 = local150 - 1; local166 > local146; local166--) {
								if (local104.anIntArray112[local166] == 0) {
									local110[local148] = local166;
									local113[local148] = 0;
									local116[local148] = 0;
									local119[local148] = 0;
									local148++;
									break;
								}
							}
						}
						local110[local148] = local150;
						@Pc(202) short local202 = 0;
						if (local104.anIntArray112[local150] == 3) {
							local202 = 128;
						}
						if ((local155 & 0x1) == 0) {
							local113[local148] = local202;
						} else {
							local113[local148] = local69.method35();
						}
						if ((local155 & 0x2) == 0) {
							local116[local148] = local202;
						} else {
							local116[local148] = local69.method35();
						}
						if ((local155 & 0x4) == 0) {
							local119[local148] = local202;
						} else {
							local119[local148] = local69.method35();
						}
						local146 = local150;
						local148++;
						if (local104.anIntArray112[local150] == 5) {
							aBooleanArray10[local126] = false;
						}
					}
				}
				local134.anInt727 = local148;
				local134.anIntArray183 = new int[local148];
				local134.anIntArray184 = new int[local148];
				local134.anIntArray185 = new int[local148];
				local134.anIntArray186 = new int[local148];
				for (local155 = 0; local155 < local148; local155++) {
					local134.anIntArray183[local155] = local110[local155];
					local134.anIntArray184[local155] = local113[local155];
					local134.anIntArray185[local155] = local116[local155];
					local134.anIntArray186[local155] = local119[local155];
				}
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("39276, " + 0 + ", " + arg0 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIZESDZR", name = "a", descriptor = "(B)V")
	public static void method477() {
		try {
			aClass42Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("2490, " + 113 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIZESDZR", name = "a", descriptor = "(II)Lclient!UIZESDZR;")
	public static Class42 method478(@OriginalArg(1) int arg0) {
		try {
			return aClass42Array1 == null ? null : aClass42Array1[arg0];
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("12982, " + 1 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIZESDZR", name = "a", descriptor = "(BI)Z")
	public static boolean method479(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("31732, " + 8 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UIZESDZR", name = "<init>", descriptor = "()V")
	private Class42() {
	}
}
