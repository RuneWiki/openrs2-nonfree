import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PHDJZMLE")
public final class Class34 {

	@OriginalMember(owner = "client!PHDJZMLE", name = "b", descriptor = "[Lclient!PHDJZMLE;")
	private static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!PHDJZMLE", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "I")
	private static int anInt635 = 18;

	@OriginalMember(owner = "client!PHDJZMLE", name = "c", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!PHDJZMLE", name = "d", descriptor = "Lclient!YMEZTXZW;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!PHDJZMLE", name = "e", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!PHDJZMLE", name = "f", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!PHDJZMLE", name = "g", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!PHDJZMLE", name = "h", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!PHDJZMLE", name = "i", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "(I)V")
	public static void method374(@OriginalArg(0) int arg0) {
		aClass34Array1 = new Class34[arg0 + 1];
		aBooleanArray9 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray9[local11] = true;
		}
	}

	@OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "(B[B)V")
	public static void method375(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub1_Sub4 local7 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			local7.anInt704 = arg0.length - 8;
			@Pc(16) int local16 = local7.method413();
			@Pc(19) int local19 = local7.method413();
			@Pc(22) int local22 = local7.method413();
			@Pc(25) int local25 = local7.method413();
			@Pc(33) Class6_Sub1_Sub4 local33 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			local33.anInt704 = 0;
			@Pc(47) int local47 = local16 + 0 + 2;
			@Pc(53) Class6_Sub1_Sub4 local53 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			local53.anInt704 = local47;
			@Pc(60) int local60 = local47 + local19;
			@Pc(66) Class6_Sub1_Sub4 local66 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			local66.anInt704 = local60;
			@Pc(73) int local73 = local60 + local22;
			@Pc(79) Class6_Sub1_Sub4 local79 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			local79.anInt704 = local73;
			@Pc(86) int local86 = local73 + local25;
			@Pc(92) Class6_Sub1_Sub4 local92 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			local92.anInt704 = local86;
			@Pc(101) Class49 local101 = new Class49(453, local92);
			@Pc(104) int local104 = local33.method413();
			@Pc(107) int[] local107 = new int[500];
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			for (@Pc(118) int local118 = 0; local118 < local104; local118++) {
				@Pc(123) int local123 = local33.method413();
				@Pc(131) Class34 local131 = aClass34Array1[local123] = new Class34();
				local131.anInt636 = local79.method411();
				local131.aClass49_1 = local101;
				@Pc(141) int local141 = local33.method411();
				@Pc(143) int local143 = -1;
				@Pc(145) int local145 = 0;
				@Pc(152) int local152;
				for (@Pc(147) int local147 = 0; local147 < local141; local147++) {
					local152 = local53.method411();
					if (local152 > 0) {
						if (local101.anIntArray207[local147] != 0) {
							for (@Pc(163) int local163 = local147 - 1; local163 > local143; local163--) {
								if (local101.anIntArray207[local163] == 0) {
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
						if (local101.anIntArray207[local147] == 3) {
							local199 = 128;
						}
						if ((local152 & 0x1) == 0) {
							local110[local145] = local199;
						} else {
							local110[local145] = local66.method424();
						}
						if ((local152 & 0x2) == 0) {
							local113[local145] = local199;
						} else {
							local113[local145] = local66.method424();
						}
						if ((local152 & 0x4) == 0) {
							local116[local145] = local199;
						} else {
							local116[local145] = local66.method424();
						}
						local143 = local147;
						local145++;
						if (local101.anIntArray207[local147] == 5) {
							aBooleanArray9[local123] = false;
						}
					}
				}
				local131.anInt637 = local145;
				local131.anIntArray176 = new int[local145];
				local131.anIntArray177 = new int[local145];
				local131.anIntArray178 = new int[local145];
				local131.anIntArray179 = new int[local145];
				for (local152 = 0; local152 < local145; local152++) {
					local131.anIntArray176[local152] = local107[local152];
					local131.anIntArray177[local152] = local110[local152];
					local131.anIntArray178[local152] = local113[local152];
					local131.anIntArray179[local152] = local116[local152];
				}
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("38700, " + -111 + ", " + arg0 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PHDJZMLE", name = "b", descriptor = "(I)V")
	public static void method376() {
		try {
			aClass34Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("65958, " + -29497 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PHDJZMLE", name = "c", descriptor = "(I)Lclient!PHDJZMLE;")
	public static Class34 method377(@OriginalArg(0) int arg0) {
		return aClass34Array1 == null ? null : aClass34Array1[arg0];
	}

	@OriginalMember(owner = "client!PHDJZMLE", name = "a", descriptor = "(BI)Z")
	public static boolean method378(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("59686, " + 9 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PHDJZMLE", name = "<init>", descriptor = "()V")
	private Class34() {
	}
}
