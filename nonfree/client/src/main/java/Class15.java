import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HQHBJEDA")
public final class Class15 {

	@OriginalMember(owner = "client!HQHBJEDA", name = "b", descriptor = "[Lclient!HQHBJEDA;")
	private static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!HQHBJEDA", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!HQHBJEDA", name = "a", descriptor = "Z")
	private static boolean aBoolean73 = true;

	@OriginalMember(owner = "client!HQHBJEDA", name = "c", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!HQHBJEDA", name = "d", descriptor = "Lclient!YPJRJNAP;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!HQHBJEDA", name = "e", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!HQHBJEDA", name = "f", descriptor = "[I")
	public int[] anIntArray47;

	@OriginalMember(owner = "client!HQHBJEDA", name = "g", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!HQHBJEDA", name = "h", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!HQHBJEDA", name = "i", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!HQHBJEDA", name = "a", descriptor = "(I)V")
	public static void method121(@OriginalArg(0) int arg0) {
		aClass15Array1 = new Class15[arg0 + 1];
		aBooleanArray2 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray2[local11] = true;
		}
	}

	@OriginalMember(owner = "client!HQHBJEDA", name = "a", descriptor = "([BB)V")
	public static void method122(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) Class3_Sub1_Sub3 local7 = new Class3_Sub1_Sub3(0, arg0);
			local7.anInt243 = arg0.length - 8;
			@Pc(16) int local16 = local7.method148();
			@Pc(19) int local19 = local7.method148();
			@Pc(22) int local22 = local7.method148();
			@Pc(25) int local25 = local7.method148();
			@Pc(33) Class3_Sub1_Sub3 local33 = new Class3_Sub1_Sub3(0, arg0);
			local33.anInt243 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class3_Sub1_Sub3 local48 = new Class3_Sub1_Sub3(0, arg0);
			local48.anInt243 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class3_Sub1_Sub3 local61 = new Class3_Sub1_Sub3(0, arg0);
			local61.anInt243 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class3_Sub1_Sub3 local74 = new Class3_Sub1_Sub3(0, arg0);
			local74.anInt243 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(86) boolean local86 = false;
			@Pc(95) Class3_Sub1_Sub3 local95 = new Class3_Sub1_Sub3(0, arg0);
			local95.anInt243 = local81;
			@Pc(104) Class47 local104 = new Class47(local95, 0);
			@Pc(107) int local107 = local33.method148();
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			@Pc(119) int[] local119 = new int[500];
			for (@Pc(121) int local121 = 0; local121 < local107; local121++) {
				@Pc(126) int local126 = local33.method148();
				@Pc(134) Class15 local134 = aClass15Array1[local126] = new Class15();
				local134.anInt230 = local74.method146();
				local134.aClass47_1 = local104;
				@Pc(144) int local144 = local33.method146();
				@Pc(146) int local146 = -1;
				@Pc(148) int local148 = 0;
				@Pc(155) int local155;
				for (@Pc(150) int local150 = 0; local150 < local144; local150++) {
					local155 = local48.method146();
					if (local155 > 0) {
						if (local104.anIntArray205[local150] != 0) {
							for (@Pc(166) int local166 = local150 - 1; local166 > local146; local166--) {
								if (local104.anIntArray205[local166] == 0) {
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
						if (local104.anIntArray205[local150] == 3) {
							local202 = 128;
						}
						if ((local155 & 0x1) == 0) {
							local113[local148] = local202;
						} else {
							local113[local148] = local61.method159();
						}
						if ((local155 & 0x2) == 0) {
							local116[local148] = local202;
						} else {
							local116[local148] = local61.method159();
						}
						if ((local155 & 0x4) == 0) {
							local119[local148] = local202;
						} else {
							local119[local148] = local61.method159();
						}
						local146 = local150;
						local148++;
						if (local104.anIntArray205[local150] == 5) {
							aBooleanArray2[local126] = false;
						}
					}
				}
				local134.anInt231 = local148;
				local134.anIntArray47 = new int[local148];
				local134.anIntArray48 = new int[local148];
				local134.anIntArray49 = new int[local148];
				local134.anIntArray50 = new int[local148];
				for (local155 = 0; local155 < local148; local155++) {
					local134.anIntArray47[local155] = local110[local155];
					local134.anIntArray48[local155] = local113[local155];
					local134.anIntArray49[local155] = local116[local155];
					local134.anIntArray50[local155] = local119[local155];
				}
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("53564, " + arg0 + ", " + arg1 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQHBJEDA", name = "b", descriptor = "(I)V")
	public static void method123(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			aClass15Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("20918, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQHBJEDA", name = "a", descriptor = "(IB)Lclient!HQHBJEDA;")
	public static Class15 method124(@OriginalArg(0) int arg0) {
		try {
			return aClass15Array1 == null ? null : aClass15Array1[arg0];
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("56054, " + arg0 + ", " + -27 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQHBJEDA", name = "a", descriptor = "(IZ)Z")
	public static boolean method125(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("66537, " + arg0 + ", " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQHBJEDA", name = "<init>", descriptor = "()V")
	private Class15() {
	}
}
