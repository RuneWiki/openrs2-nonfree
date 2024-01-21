import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FGGKJQKK")
public final class Class12 {

	@OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "[Lclient!FGGKJQKK;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!FGGKJQKK", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!FGGKJQKK", name = "b", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!FGGKJQKK", name = "c", descriptor = "Lclient!XZSJUDQY;")
	public Class50 aClass50_1;

	@OriginalMember(owner = "client!FGGKJQKK", name = "d", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!FGGKJQKK", name = "e", descriptor = "[I")
	public int[] anIntArray59;

	@OriginalMember(owner = "client!FGGKJQKK", name = "f", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!FGGKJQKK", name = "g", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!FGGKJQKK", name = "h", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "(I)V")
	public static void method112(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray4 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray4[local11] = true;
		}
	}

	@OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "([BI)V")
	public static void method113(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class3_Sub3_Sub4 local7 = new Class3_Sub3_Sub4((byte) -115, arg0);
			local7.anInt738 = arg0.length - 8;
			@Pc(16) int local16 = local7.method470();
			@Pc(24) int local24 = local7.method470();
			@Pc(27) int local27 = local7.method470();
			@Pc(30) int local30 = local7.method470();
			@Pc(38) Class3_Sub3_Sub4 local38 = new Class3_Sub3_Sub4((byte) -115, arg0);
			local38.anInt738 = 0;
			@Pc(47) int local47 = local16 + 0 + 2;
			@Pc(53) Class3_Sub3_Sub4 local53 = new Class3_Sub3_Sub4((byte) -115, arg0);
			local53.anInt738 = local47;
			@Pc(60) int local60 = local47 + local24;
			@Pc(66) Class3_Sub3_Sub4 local66 = new Class3_Sub3_Sub4((byte) -115, arg0);
			local66.anInt738 = local60;
			@Pc(73) int local73 = local60 + local27;
			@Pc(79) Class3_Sub3_Sub4 local79 = new Class3_Sub3_Sub4((byte) -115, arg0);
			local79.anInt738 = local73;
			@Pc(86) int local86 = local73 + local30;
			@Pc(92) Class3_Sub3_Sub4 local92 = new Class3_Sub3_Sub4((byte) -115, arg0);
			local92.anInt738 = local86;
			@Pc(101) Class50 local101 = new Class50(local92, 0);
			@Pc(104) int local104 = local38.method470();
			@Pc(107) int[] local107 = new int[500];
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			for (@Pc(118) int local118 = 0; local118 < local104; local118++) {
				@Pc(123) int local123 = local38.method470();
				@Pc(131) Class12 local131 = aClass12Array1[local123] = new Class12();
				local131.anInt217 = local79.method468();
				local131.aClass50_1 = local101;
				@Pc(141) int local141 = local38.method468();
				@Pc(143) int local143 = -1;
				@Pc(145) int local145 = 0;
				@Pc(152) int local152;
				for (@Pc(147) int local147 = 0; local147 < local141; local147++) {
					local152 = local53.method468();
					if (local152 > 0) {
						if (local101.anIntArray203[local147] != 0) {
							for (@Pc(163) int local163 = local147 - 1; local163 > local143; local163--) {
								if (local101.anIntArray203[local163] == 0) {
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
						if (local101.anIntArray203[local147] == 3) {
							local199 = 128;
						}
						if ((local152 & 0x1) == 0) {
							local110[local145] = local199;
						} else {
							local110[local145] = local66.method481();
						}
						if ((local152 & 0x2) == 0) {
							local113[local145] = local199;
						} else {
							local113[local145] = local66.method481();
						}
						if ((local152 & 0x4) == 0) {
							local116[local145] = local199;
						} else {
							local116[local145] = local66.method481();
						}
						local143 = local147;
						local145++;
						if (local101.anIntArray203[local147] == 5) {
							aBooleanArray4[local123] = false;
						}
					}
				}
				local131.anInt218 = local145;
				local131.anIntArray59 = new int[local145];
				local131.anIntArray60 = new int[local145];
				local131.anIntArray61 = new int[local145];
				local131.anIntArray62 = new int[local145];
				for (local152 = 0; local152 < local145; local152++) {
					local131.anIntArray59[local152] = local107[local152];
					local131.anIntArray60[local152] = local110[local152];
					local131.anIntArray61[local152] = local113[local152];
					local131.anIntArray62[local152] = local116[local152];
				}
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("15208, " + arg0 + ", " + 0 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGGKJQKK", name = "b", descriptor = "(I)V")
	public static void method114() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("63491, " + 6 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGGKJQKK", name = "c", descriptor = "(I)Lclient!FGGKJQKK;")
	public static Class12 method115(@OriginalArg(0) int arg0) {
		return aClass12Array1 == null ? null : aClass12Array1[arg0];
	}

	@OriginalMember(owner = "client!FGGKJQKK", name = "a", descriptor = "(II)Z")
	public static boolean method116(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("43180, " + arg0 + ", " + 12073 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGGKJQKK", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
