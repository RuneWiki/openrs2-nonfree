import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SCWTQUFK")
public final class Class37 {

	@OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "[Lclient!SCWTQUFK;")
	private static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!SCWTQUFK", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!SCWTQUFK", name = "b", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!SCWTQUFK", name = "c", descriptor = "Lclient!GCSWWDCL;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!SCWTQUFK", name = "d", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!SCWTQUFK", name = "e", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!SCWTQUFK", name = "f", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!SCWTQUFK", name = "g", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!SCWTQUFK", name = "h", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "(I)V")
	public static void method384(@OriginalArg(0) int arg0) {
		aClass37Array1 = new Class37[arg0 + 1];
		aBooleanArray4 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray4[local11] = true;
		}
	}

	@OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "([BI)V")
	public static void method385(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			local7.anInt101 = arg0.length - 8;
			@Pc(16) int local16 = local7.method104();
			@Pc(19) int local19 = local7.method104();
			@Pc(22) int local22 = local7.method104();
			@Pc(25) int local25 = local7.method104();
			@Pc(33) Class4_Sub1_Sub3 local33 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			local33.anInt101 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class4_Sub1_Sub3 local48 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			local48.anInt101 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class4_Sub1_Sub3 local61 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			local61.anInt101 = local55;
			@Pc(73) int local73 = local55 + local22;
			@Pc(79) Class4_Sub1_Sub3 local79 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			local79.anInt101 = local73;
			@Pc(86) int local86 = local73 + local25;
			@Pc(92) Class4_Sub1_Sub3 local92 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			local92.anInt101 = local86;
			@Pc(101) Class8 local101 = new Class8((byte) -26, local92);
			@Pc(104) int local104 = local33.method104();
			@Pc(107) int[] local107 = new int[500];
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			for (@Pc(118) int local118 = 0; local118 < local104; local118++) {
				@Pc(123) int local123 = local33.method104();
				@Pc(131) Class37 local131 = aClass37Array1[local123] = new Class37();
				local131.anInt532 = local79.method102();
				local131.aClass8_1 = local101;
				@Pc(141) int local141 = local33.method102();
				@Pc(143) int local143 = -1;
				@Pc(145) int local145 = 0;
				@Pc(152) int local152;
				for (@Pc(147) int local147 = 0; local147 < local141; local147++) {
					local152 = local48.method102();
					if (local152 > 0) {
						if (local101.anIntArray16[local147] != 0) {
							for (@Pc(163) int local163 = local147 - 1; local163 > local143; local163--) {
								if (local101.anIntArray16[local163] == 0) {
									local107[local145] = local163;
									local110[local145] = 0;
									local113[local145] = 0;
									local116[local145] = 0;
									local145++;
									break;
								}
							}
						}
						local107[local145] = local147;
						@Pc(199) short local199 = 0;
						if (local101.anIntArray16[local147] == 3) {
							local199 = 128;
						}
						if ((local152 & 0x1) == 0) {
							local110[local145] = local199;
						} else {
							local110[local145] = local61.method115();
						}
						if ((local152 & 0x2) == 0) {
							local113[local145] = local199;
						} else {
							local113[local145] = local61.method115();
						}
						if ((local152 & 0x4) == 0) {
							local116[local145] = local199;
						} else {
							local116[local145] = local61.method115();
						}
						local143 = local147;
						local145++;
						if (local101.anIntArray16[local147] == 5) {
							aBooleanArray4[local123] = false;
						}
					}
				}
				local131.anInt533 = local145;
				local131.anIntArray135 = new int[local145];
				local131.anIntArray136 = new int[local145];
				local131.anIntArray137 = new int[local145];
				local131.anIntArray138 = new int[local145];
				for (local152 = 0; local152 < local145; local152++) {
					local131.anIntArray135[local152] = local107[local152];
					local131.anIntArray136[local152] = local110[local152];
					local131.anIntArray137[local152] = local113[local152];
					local131.anIntArray138[local152] = local116[local152];
				}
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("22604, " + arg0 + ", " + -89 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SCWTQUFK", name = "b", descriptor = "(I)V")
	public static void method386(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			aClass37Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("3503, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SCWTQUFK", name = "c", descriptor = "(I)Lclient!SCWTQUFK;")
	public static Class37 method387(@OriginalArg(0) int arg0) {
		return aClass37Array1 == null ? null : aClass37Array1[arg0];
	}

	@OriginalMember(owner = "client!SCWTQUFK", name = "a", descriptor = "(ZI)Z")
	public static boolean method388(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("60569, " + true + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SCWTQUFK", name = "<init>", descriptor = "()V")
	private Class37() {
	}
}
