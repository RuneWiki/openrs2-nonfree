import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XMRZESBN")
public final class Class45 {

	@OriginalMember(owner = "client!XMRZESBN", name = "b", descriptor = "[Lclient!XMRZESBN;")
	private static Class45[] aClass45Array1;

	@OriginalMember(owner = "client!XMRZESBN", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "I")
	private static int anInt791 = 9;

	@OriginalMember(owner = "client!XMRZESBN", name = "c", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!XMRZESBN", name = "d", descriptor = "Lclient!JLLLGAIH;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!XMRZESBN", name = "e", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!XMRZESBN", name = "f", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!XMRZESBN", name = "g", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!XMRZESBN", name = "h", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!XMRZESBN", name = "i", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "(I)V")
	public static void method553(@OriginalArg(0) int arg0) {
		aClass45Array1 = new Class45[arg0 + 1];
		aBooleanArray10 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray10[local11] = true;
		}
	}

	@OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "([BB)V")
	public static void method554(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			local7.anInt81 = arg0.length - 8;
			@Pc(16) int local16 = local7.method96();
			@Pc(19) int local19 = local7.method96();
			@Pc(22) int local22 = local7.method96();
			@Pc(25) int local25 = local7.method96();
			@Pc(33) Class2_Sub1_Sub2 local33 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			local33.anInt81 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class2_Sub1_Sub2 local48 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			local48.anInt81 = local42;
			@Pc(60) int local60 = local42 + local19;
			@Pc(66) Class2_Sub1_Sub2 local66 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			local66.anInt81 = local60;
			@Pc(73) int local73 = local60 + local22;
			@Pc(79) Class2_Sub1_Sub2 local79 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			local79.anInt81 = local73;
			@Pc(86) int local86 = local73 + local25;
			@Pc(92) Class2_Sub1_Sub2 local92 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			local92.anInt81 = local86;
			@Pc(101) Class21 local101 = new Class21(local92, false);
			@Pc(104) int local104 = local33.method96();
			@Pc(107) int[] local107 = new int[500];
			@Pc(110) int[] local110 = new int[500];
			@Pc(113) int[] local113 = new int[500];
			@Pc(116) int[] local116 = new int[500];
			for (@Pc(118) int local118 = 0; local118 < local104; local118++) {
				@Pc(123) int local123 = local33.method96();
				@Pc(131) Class45 local131 = aClass45Array1[local123] = new Class45();
				local131.anInt792 = local79.method94();
				local131.aClass21_1 = local101;
				@Pc(141) int local141 = local33.method94();
				@Pc(143) int local143 = -1;
				@Pc(145) int local145 = 0;
				@Pc(152) int local152;
				for (@Pc(147) int local147 = 0; local147 < local141; local147++) {
					local152 = local48.method94();
					if (local152 > 0) {
						if (local101.anIntArray63[local147] != 0) {
							for (@Pc(163) int local163 = local147 - 1; local163 > local143; local163--) {
								if (local101.anIntArray63[local163] == 0) {
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
						if (local101.anIntArray63[local147] == 3) {
							local199 = 128;
						}
						if ((local152 & 0x1) == 0) {
							local110[local145] = local199;
						} else {
							local110[local145] = local66.method107();
						}
						if ((local152 & 0x2) == 0) {
							local113[local145] = local199;
						} else {
							local113[local145] = local66.method107();
						}
						if ((local152 & 0x4) == 0) {
							local116[local145] = local199;
						} else {
							local116[local145] = local66.method107();
						}
						local143 = local147;
						local145++;
						if (local101.anIntArray63[local147] == 5) {
							aBooleanArray10[local123] = false;
						}
					}
				}
				local131.anInt793 = local145;
				local131.anIntArray187 = new int[local145];
				local131.anIntArray188 = new int[local145];
				local131.anIntArray189 = new int[local145];
				local131.anIntArray190 = new int[local145];
				for (local152 = 0; local152 < local145; local152++) {
					local131.anIntArray187[local152] = local107[local152];
					local131.anIntArray188[local152] = local110[local152];
					local131.anIntArray189[local152] = local113[local152];
					local131.anIntArray190[local152] = local116[local152];
				}
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("75166, " + arg0 + ", " + -75 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XMRZESBN", name = "b", descriptor = "(I)V")
	public static void method555() {
		try {
			aClass45Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("89618, " + -308 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XMRZESBN", name = "c", descriptor = "(I)Lclient!XMRZESBN;")
	public static Class45 method556(@OriginalArg(0) int arg0) {
		return aClass45Array1 == null ? null : aClass45Array1[arg0];
	}

	@OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "(ZI)Z")
	public static boolean method557(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("40766, " + true + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XMRZESBN", name = "<init>", descriptor = "()V")
	private Class45() {
	}
}
