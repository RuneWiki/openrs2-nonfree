import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
	private static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method324(@OriginalArg(0) int arg0) {
		aClass14Array1 = new Class14[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[B)V")
	public static void method325(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 337);
			local7.anInt768 = arg0.length - 8;
			@Pc(16) int local16 = local7.method500();
			@Pc(19) int local19 = local7.method500();
			@Pc(22) int local22 = local7.method500();
			@Pc(25) int local25 = local7.method500();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 337);
			local33.anInt768 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 337);
			local48.anInt768 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, 337);
			local61.anInt768 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, 337);
			local74.anInt768 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, 337);
			local87.anInt768 = local81;
			@Pc(96) Class12 local96 = new Class12(local87, aBoolean140);
			@Pc(99) int local99 = local33.method500();
			@Pc(107) int[] local107 = new int[500];
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			for (@Pc(118) int local118 = 0; local118 < local99; local118++) {
				@Pc(123) int local123 = local33.method500();
				@Pc(131) Class14 local131 = aClass14Array1[local123] = new Class14();
				local131.anInt587 = local74.method498();
				local131.aClass12_1 = local96;
				@Pc(141) int local141 = local33.method498();
				@Pc(143) int local143 = -1;
				@Pc(145) int local145 = 0;
				@Pc(152) int local152;
				for (@Pc(147) int local147 = 0; local147 < local141; local147++) {
					local152 = local48.method498();
					if (local152 > 0) {
						if (local96.anIntArray164[local147] != 0) {
							for (@Pc(163) int local163 = local147 - 1; local163 > local143; local163--) {
								if (local96.anIntArray164[local163] == 0) {
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
						if (local96.anIntArray164[local147] == 3) {
							local199 = 128;
						}
						if ((local152 & 0x1) == 0) {
							local110[local145] = local199;
						} else {
							local110[local145] = local61.method511();
						}
						if ((local152 & 0x2) == 0) {
							local113[local145] = local199;
						} else {
							local113[local145] = local61.method511();
						}
						if ((local152 & 0x4) == 0) {
							local116[local145] = local199;
						} else {
							local116[local145] = local61.method511();
						}
						local143 = local147;
						local145++;
						if (local96.anIntArray164[local147] == 5) {
							aBooleanArray7[local123] = false;
						}
					}
				}
				local131.anInt588 = local145;
				local131.anIntArray170 = new int[local145];
				local131.anIntArray171 = new int[local145];
				local131.anIntArray172 = new int[local145];
				local131.anIntArray173 = new int[local145];
				for (local152 = 0; local152 < local145; local152++) {
					local131.anIntArray170[local152] = local107[local152];
					local131.anIntArray171[local152] = local110[local152];
					local131.anIntArray172[local152] = local113[local152];
					local131.anIntArray173[local152] = local116[local152];
				}
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("95337, " + -25 + ", " + arg0 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method326() {
		try {
			aClass14Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("31132, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Lclient!h;")
	public static Class14 method327(@OriginalArg(0) int arg0) {
		try {
			return aClass14Array1 == null ? null : aClass14Array1[arg0];
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("70668, " + arg0 + ", " + -18 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
	public static boolean method328(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("40780, " + 0 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
