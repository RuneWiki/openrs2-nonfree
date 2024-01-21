import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TTZHVWEG")
public final class Class35 {

	@OriginalMember(owner = "client!TTZHVWEG", name = "a", descriptor = "Z")
	private static boolean aBoolean145;

	@OriginalMember(owner = "client!TTZHVWEG", name = "b", descriptor = "Z")
	private static boolean aBoolean146;

	@OriginalMember(owner = "client!TTZHVWEG", name = "d", descriptor = "[Lclient!TTZHVWEG;")
	private static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!TTZHVWEG", name = "l", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!TTZHVWEG", name = "c", descriptor = "I")
	private static int anInt652 = 1;

	@OriginalMember(owner = "client!TTZHVWEG", name = "e", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!TTZHVWEG", name = "f", descriptor = "Lclient!AECNGNXZ;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!TTZHVWEG", name = "g", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!TTZHVWEG", name = "h", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!TTZHVWEG", name = "i", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!TTZHVWEG", name = "j", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!TTZHVWEG", name = "k", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!TTZHVWEG", name = "a", descriptor = "(I)V")
	public static void method444(@OriginalArg(0) int arg0) {
		aClass35Array1 = new Class35[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!TTZHVWEG", name = "a", descriptor = "(Z[B)V")
	public static void method445(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg0, -49015);
			local7.anInt253 = arg0.length - 8;
			@Pc(16) int local16 = local7.method167();
			@Pc(19) int local19 = local7.method167();
			@Pc(22) int local22 = local7.method167();
			@Pc(25) int local25 = local7.method167();
			@Pc(33) Class8_Sub1_Sub3 local33 = new Class8_Sub1_Sub3(arg0, -49015);
			local33.anInt253 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class8_Sub1_Sub3 local48 = new Class8_Sub1_Sub3(arg0, -49015);
			local48.anInt253 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class8_Sub1_Sub3 local61 = new Class8_Sub1_Sub3(arg0, -49015);
			local61.anInt253 = local55;
			@Pc(76) int local76 = local55 + local22;
			@Pc(82) Class8_Sub1_Sub3 local82 = new Class8_Sub1_Sub3(arg0, -49015);
			local82.anInt253 = local76;
			@Pc(89) int local89 = local76 + local25;
			@Pc(95) Class8_Sub1_Sub3 local95 = new Class8_Sub1_Sub3(arg0, -49015);
			local95.anInt253 = local89;
			@Pc(104) Class1 local104 = new Class1(false, local95);
			@Pc(107) int local107 = local33.method167();
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			@Pc(119) int[] local119 = new int[500];
			for (@Pc(121) int local121 = 0; local121 < local107; local121++) {
				@Pc(126) int local126 = local33.method167();
				@Pc(134) Class35 local134 = aClass35Array1[local126] = new Class35();
				local134.anInt653 = local82.method165();
				local134.aClass1_1 = local104;
				@Pc(144) int local144 = local33.method165();
				@Pc(146) int local146 = -1;
				@Pc(148) int local148 = 0;
				@Pc(155) int local155;
				for (@Pc(150) int local150 = 0; local150 < local144; local150++) {
					local155 = local48.method165();
					if (local155 > 0) {
						if (local104.anIntArray1[local150] != 0) {
							for (@Pc(166) int local166 = local150 - 1; local166 > local146; local166--) {
								if (local104.anIntArray1[local166] == 0) {
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
						if (local104.anIntArray1[local150] == 3) {
							local202 = 128;
						}
						if ((local155 & 0x1) == 0) {
							local113[local148] = local202;
						} else {
							local113[local148] = local61.method178();
						}
						if ((local155 & 0x2) == 0) {
							local116[local148] = local202;
						} else {
							local116[local148] = local61.method178();
						}
						if ((local155 & 0x4) == 0) {
							local119[local148] = local202;
						} else {
							local119[local148] = local61.method178();
						}
						local146 = local150;
						local148++;
						if (local104.anIntArray1[local150] == 5) {
							aBooleanArray7[local126] = false;
						}
					}
				}
				local134.anInt654 = local148;
				local134.anIntArray103 = new int[local148];
				local134.anIntArray104 = new int[local148];
				local134.anIntArray105 = new int[local148];
				local134.anIntArray106 = new int[local148];
				for (local155 = 0; local155 < local148; local155++) {
					local134.anIntArray103[local155] = local110[local155];
					local134.anIntArray104[local155] = local113[local155];
					local134.anIntArray105[local155] = local116[local155];
					local134.anIntArray106[local155] = local119[local155];
				}
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("75302, " + false + ", " + arg0 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTZHVWEG", name = "b", descriptor = "(I)V")
	public static void method446() {
		try {
			aClass35Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("74232, " + 2 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTZHVWEG", name = "a", descriptor = "(BI)Lclient!TTZHVWEG;")
	public static Class35 method447(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) boolean local6 = false;
			return aClass35Array1 == null ? null : aClass35Array1[arg1];
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("58296, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTZHVWEG", name = "a", descriptor = "(IB)Z")
	public static boolean method448(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 1) {
				@Pc(4) boolean local4 = false;
			} else {
				anInt652 = 340;
			}
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("44772, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTZHVWEG", name = "<init>", descriptor = "()V")
	private Class35() {
	}
}
