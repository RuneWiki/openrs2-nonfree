import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BKYAWERN")
public final class Class4 {

	@OriginalMember(owner = "client!BKYAWERN", name = "b", descriptor = "[Lclient!BKYAWERN;")
	private static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!BKYAWERN", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "Z")
	private static boolean aBoolean45 = true;

	@OriginalMember(owner = "client!BKYAWERN", name = "c", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!BKYAWERN", name = "d", descriptor = "Lclient!GCTCRUHH;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!BKYAWERN", name = "e", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!BKYAWERN", name = "f", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!BKYAWERN", name = "g", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!BKYAWERN", name = "h", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!BKYAWERN", name = "i", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "(I)V")
	public static void method164(@OriginalArg(0) int arg0) {
		aClass4Array1 = new Class4[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	@OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "([BI)V")
	public static void method165(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg0, -990);
			local7.anInt123 = arg0.length - 8;
			@Pc(16) int local16 = local7.method81();
			@Pc(19) int local19 = local7.method81();
			@Pc(31) int local31 = local7.method81();
			@Pc(34) int local34 = local7.method81();
			@Pc(42) Class2_Sub1_Sub2 local42 = new Class2_Sub1_Sub2(arg0, -990);
			local42.anInt123 = 0;
			@Pc(51) int local51 = local16 + 0 + 2;
			@Pc(57) Class2_Sub1_Sub2 local57 = new Class2_Sub1_Sub2(arg0, -990);
			local57.anInt123 = local51;
			@Pc(64) int local64 = local51 + local19;
			@Pc(70) Class2_Sub1_Sub2 local70 = new Class2_Sub1_Sub2(arg0, -990);
			local70.anInt123 = local64;
			@Pc(77) int local77 = local64 + local31;
			@Pc(83) Class2_Sub1_Sub2 local83 = new Class2_Sub1_Sub2(arg0, -990);
			local83.anInt123 = local77;
			@Pc(90) int local90 = local77 + local34;
			@Pc(96) Class2_Sub1_Sub2 local96 = new Class2_Sub1_Sub2(arg0, -990);
			local96.anInt123 = local90;
			@Pc(105) Class13 local105 = new Class13(-10875, local96);
			@Pc(108) int local108 = local42.method81();
			@Pc(111) int[] local111 = new int[500];
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			for (@Pc(122) int local122 = 0; local122 < local108; local122++) {
				@Pc(127) int local127 = local42.method81();
				@Pc(135) Class4 local135 = aClass4Array1[local127] = new Class4();
				local135.anInt168 = local83.method79();
				local135.aClass13_1 = local105;
				@Pc(145) int local145 = local42.method79();
				@Pc(147) int local147 = -1;
				@Pc(149) int local149 = 0;
				@Pc(156) int local156;
				for (@Pc(151) int local151 = 0; local151 < local145; local151++) {
					local156 = local57.method79();
					if (local156 > 0) {
						if (local105.anIntArray53[local151] != 0) {
							for (@Pc(167) int local167 = local151 - 1; local167 > local147; local167--) {
								if (local105.anIntArray53[local167] == 0) {
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
						if (local105.anIntArray53[local151] == 3) {
							local203 = 128;
						}
						if ((local156 & 0x1) == 0) {
							local114[local149] = local203;
						} else {
							local114[local149] = local70.method92();
						}
						if ((local156 & 0x2) == 0) {
							local117[local149] = local203;
						} else {
							local117[local149] = local70.method92();
						}
						if ((local156 & 0x4) == 0) {
							local120[local149] = local203;
						} else {
							local120[local149] = local70.method92();
						}
						local147 = local151;
						local149++;
						if (local105.anIntArray53[local151] == 5) {
							aBooleanArray3[local127] = false;
						}
					}
				}
				local135.anInt169 = local149;
				local135.anIntArray24 = new int[local149];
				local135.anIntArray25 = new int[local149];
				local135.anIntArray26 = new int[local149];
				local135.anIntArray27 = new int[local149];
				for (local156 = 0; local156 < local149; local156++) {
					local135.anIntArray24[local156] = local111[local156];
					local135.anIntArray25[local156] = local114[local156];
					local135.anIntArray26[local156] = local117[local156];
					local135.anIntArray27[local156] = local120[local156];
				}
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("94965, " + arg0 + ", " + -563 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKYAWERN", name = "b", descriptor = "(I)V")
	public static void method166(@OriginalArg(0) int arg0) {
		try {
			aClass4Array1 = null;
			@Pc(5) int local5 = 51 / arg0;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("46866, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKYAWERN", name = "c", descriptor = "(I)Lclient!BKYAWERN;")
	public static Class4 method167(@OriginalArg(0) int arg0) {
		return aClass4Array1 == null ? null : aClass4Array1[arg0];
	}

	@OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "(BI)Z")
	public static boolean method168(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 7) {
				aBoolean45 = !aBoolean45;
			}
			return arg1 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("51542, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKYAWERN", name = "<init>", descriptor = "()V")
	private Class4() {
	}
}
