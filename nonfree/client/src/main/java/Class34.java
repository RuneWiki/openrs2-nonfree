import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SGSYCWFB")
public final class Class34 {

	@OriginalMember(owner = "client!SGSYCWFB", name = "b", descriptor = "[Lclient!SGSYCWFB;")
	private static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!SGSYCWFB", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "I")
	private static int anInt546 = 8;

	@OriginalMember(owner = "client!SGSYCWFB", name = "c", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!SGSYCWFB", name = "d", descriptor = "Lclient!QICGPMWF;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!SGSYCWFB", name = "e", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!SGSYCWFB", name = "f", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!SGSYCWFB", name = "g", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!SGSYCWFB", name = "h", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!SGSYCWFB", name = "i", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "(I)V")
	public static void method327(@OriginalArg(0) int arg0) {
		aClass34Array1 = new Class34[arg0 + 1];
		aBooleanArray9 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray9[local11] = true;
		}
	}

	@OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "([BB)V")
	public static void method328(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg0, -631);
			local7.anInt620 = arg0.length - 8;
			@Pc(16) int local16 = local7.method408();
			@Pc(19) int local19 = local7.method408();
			@Pc(22) int local22 = local7.method408();
			@Pc(25) int local25 = local7.method408();
			@Pc(33) Class8_Sub1_Sub3 local33 = new Class8_Sub1_Sub3(arg0, -631);
			local33.anInt620 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class8_Sub1_Sub3 local48 = new Class8_Sub1_Sub3(arg0, -631);
			local48.anInt620 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class8_Sub1_Sub3 local61 = new Class8_Sub1_Sub3(arg0, -631);
			local61.anInt620 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(73) boolean local73 = false;
			@Pc(82) Class8_Sub1_Sub3 local82 = new Class8_Sub1_Sub3(arg0, -631);
			local82.anInt620 = local68;
			@Pc(89) int local89 = local68 + local25;
			@Pc(95) Class8_Sub1_Sub3 local95 = new Class8_Sub1_Sub3(arg0, -631);
			local95.anInt620 = local89;
			@Pc(104) Class30 local104 = new Class30(local95, anInt546);
			@Pc(107) int local107 = local33.method408();
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			@Pc(119) int[] local119 = new int[500];
			for (@Pc(121) int local121 = 0; local121 < local107; local121++) {
				@Pc(126) int local126 = local33.method408();
				@Pc(134) Class34 local134 = aClass34Array1[local126] = new Class34();
				local134.anInt547 = local82.method406();
				local134.aClass30_1 = local104;
				@Pc(144) int local144 = local33.method406();
				@Pc(146) int local146 = -1;
				@Pc(148) int local148 = 0;
				@Pc(155) int local155;
				for (@Pc(150) int local150 = 0; local150 < local144; local150++) {
					local155 = local48.method406();
					if (local155 > 0) {
						if (local104.anIntArray151[local150] != 0) {
							for (@Pc(166) int local166 = local150 - 1; local166 > local146; local166--) {
								if (local104.anIntArray151[local166] == 0) {
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
						if (local104.anIntArray151[local150] == 3) {
							local202 = 128;
						}
						if ((local155 & 0x1) == 0) {
							local113[local148] = local202;
						} else {
							local113[local148] = local61.method419();
						}
						if ((local155 & 0x2) == 0) {
							local116[local148] = local202;
						} else {
							local116[local148] = local61.method419();
						}
						if ((local155 & 0x4) == 0) {
							local119[local148] = local202;
						} else {
							local119[local148] = local61.method419();
						}
						local146 = local150;
						local148++;
						if (local104.anIntArray151[local150] == 5) {
							aBooleanArray9[local126] = false;
						}
					}
				}
				local134.anInt548 = local148;
				local134.anIntArray156 = new int[local148];
				local134.anIntArray157 = new int[local148];
				local134.anIntArray158 = new int[local148];
				local134.anIntArray159 = new int[local148];
				for (local155 = 0; local155 < local148; local155++) {
					local134.anIntArray156[local155] = local110[local155];
					local134.anIntArray157[local155] = local113[local155];
					local134.anIntArray158[local155] = local116[local155];
					local134.anIntArray159[local155] = local119[local155];
				}
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("38904, " + arg0 + ", " + arg1 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SGSYCWFB", name = "b", descriptor = "(I)V")
	public static void method329() {
		try {
			aClass34Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("2899, " + 5 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SGSYCWFB", name = "c", descriptor = "(I)Lclient!SGSYCWFB;")
	public static Class34 method330(@OriginalArg(0) int arg0) {
		return aClass34Array1 == null ? null : aClass34Array1[arg0];
	}

	@OriginalMember(owner = "client!SGSYCWFB", name = "a", descriptor = "(II)Z")
	public static boolean method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 41952) {
				throw new NullPointerException();
			}
			return arg0 == -1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("68831, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SGSYCWFB", name = "<init>", descriptor = "()V")
	private Class34() {
	}
}
