import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EMBMBPSC")
public final class Class13 {

	@OriginalMember(owner = "client!EMBMBPSC", name = "c", descriptor = "I")
	private static int anInt141;

	@OriginalMember(owner = "client!EMBMBPSC", name = "d", descriptor = "[Lclient!EMBMBPSC;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!EMBMBPSC", name = "l", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!EMBMBPSC", name = "a", descriptor = "I")
	private static int anInt140 = 8;

	@OriginalMember(owner = "client!EMBMBPSC", name = "b", descriptor = "Z")
	private static boolean aBoolean48 = true;

	@OriginalMember(owner = "client!EMBMBPSC", name = "e", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!EMBMBPSC", name = "f", descriptor = "Lclient!NSCXCZCZ;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!EMBMBPSC", name = "g", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!EMBMBPSC", name = "h", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!EMBMBPSC", name = "i", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!EMBMBPSC", name = "j", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!EMBMBPSC", name = "k", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!EMBMBPSC", name = "a", descriptor = "(I)V")
	public static void method143(@OriginalArg(0) int arg0) {
		aClass13Array1 = new Class13[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	@OriginalMember(owner = "client!EMBMBPSC", name = "a", descriptor = "([BI)V")
	public static void method144(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 8);
			local7.anInt352 = arg0.length - 8;
			@Pc(16) int local16 = local7.method240();
			@Pc(19) int local19 = local7.method240();
			@Pc(22) int local22 = local7.method240();
			@Pc(25) int local25 = local7.method240();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 8);
			local33.anInt352 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 8);
			local48.anInt352 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, 8);
			local61.anInt352 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, 8);
			local74.anInt352 = local68;
			@Pc(89) int local89 = local68 + local25;
			@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(arg0, 8);
			local95.anInt352 = local89;
			@Pc(104) Class29 local104 = new Class29(false, local95);
			@Pc(107) int local107 = local33.method240();
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			@Pc(119) int[] local119 = new int[500];
			for (@Pc(121) int local121 = 0; local121 < local107; local121++) {
				@Pc(126) int local126 = local33.method240();
				@Pc(134) Class13 local134 = aClass13Array1[local126] = new Class13();
				local134.anInt142 = local74.method238();
				local134.aClass29_1 = local104;
				@Pc(144) int local144 = local33.method238();
				@Pc(146) int local146 = -1;
				@Pc(148) int local148 = 0;
				@Pc(155) int local155;
				for (@Pc(150) int local150 = 0; local150 < local144; local150++) {
					local155 = local48.method238();
					if (local155 > 0) {
						if (local104.anIntArray92[local150] != 0) {
							for (@Pc(166) int local166 = local150 - 1; local166 > local146; local166--) {
								if (local104.anIntArray92[local166] == 0) {
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
						if (local104.anIntArray92[local150] == 3) {
							local202 = 128;
						}
						if ((local155 & 0x1) == 0) {
							local113[local148] = local202;
						} else {
							local113[local148] = local61.method251();
						}
						if ((local155 & 0x2) == 0) {
							local116[local148] = local202;
						} else {
							local116[local148] = local61.method251();
						}
						if ((local155 & 0x4) == 0) {
							local119[local148] = local202;
						} else {
							local119[local148] = local61.method251();
						}
						local146 = local150;
						local148++;
						if (local104.anIntArray92[local150] == 5) {
							aBooleanArray3[local126] = false;
						}
					}
				}
				local134.anInt143 = local148;
				local134.anIntArray30 = new int[local148];
				local134.anIntArray31 = new int[local148];
				local134.anIntArray32 = new int[local148];
				local134.anIntArray33 = new int[local148];
				for (local155 = 0; local155 < local148; local155++) {
					local134.anIntArray30[local155] = local110[local155];
					local134.anIntArray31[local155] = local113[local155];
					local134.anIntArray32[local155] = local116[local155];
					local134.anIntArray33[local155] = local119[local155];
				}
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("46703, " + arg0 + ", " + 0 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMBMBPSC", name = "b", descriptor = "(I)V")
	public static void method145() {
		try {
			aClass13Array1 = null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("35932, " + 1 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMBMBPSC", name = "a", descriptor = "(ZI)Lclient!EMBMBPSC;")
	public static Class13 method146(@OriginalArg(1) int arg0) {
		try {
			return aClass13Array1 == null ? null : aClass13Array1[arg0];
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("88555, " + false + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMBMBPSC", name = "a", descriptor = "(II)Z")
	public static boolean method147(@OriginalArg(0) int arg0) {
		try {
			if (anInt140 != 8) {
				anInt141 = 312;
			}
			return arg0 == -1;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("92814, " + arg0 + ", " + 8 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMBMBPSC", name = "<init>", descriptor = "()V")
	private Class13() {
	}
}
