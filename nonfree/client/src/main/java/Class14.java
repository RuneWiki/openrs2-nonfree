import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!h")
public final class Class14 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
	private static boolean aBoolean143;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Lclient!h;")
	private static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt593;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt594;

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
		aBooleanArray8 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray8[local11] = true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[B)V")
	public static void method325(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, (byte) 3);
			local7.anInt777 = arg1.length - 8;
			@Pc(16) int local16 = local7.method500();
			@Pc(19) int local19 = local7.method500();
			@Pc(22) int local22 = local7.method500();
			@Pc(25) int local25 = local7.method500();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg1, (byte) 3);
			local33.anInt777 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg1, (byte) 3);
			local48.anInt777 = local42;
			@Pc(55) int local55 = local42 + local19;
			if (arg0 < 2 || arg0 > 2) {
				aBoolean143 = !aBoolean143;
			}
			@Pc(73) Class1_Sub1_Sub3 local73 = new Class1_Sub1_Sub3(arg1, (byte) 3);
			local73.anInt777 = local55;
			local42 = local55 + local22;
			@Pc(86) Class1_Sub1_Sub3 local86 = new Class1_Sub1_Sub3(arg1, (byte) 3);
			local86.anInt777 = local42;
			local42 += local25;
			@Pc(99) Class1_Sub1_Sub3 local99 = new Class1_Sub1_Sub3(arg1, (byte) 3);
			local99.anInt777 = local42;
			@Pc(108) Class12 local108 = new Class12(local99, true);
			@Pc(111) int local111 = local33.method500();
			@Pc(114) int[] local114 = new int[500];
			@Pc(117) int[] local117 = new int[500];
			@Pc(120) int[] local120 = new int[500];
			@Pc(123) int[] local123 = new int[500];
			for (@Pc(125) int local125 = 0; local125 < local111; local125++) {
				@Pc(130) int local130 = local33.method500();
				@Pc(138) Class14 local138 = aClass14Array1[local130] = new Class14();
				local138.anInt593 = local86.method498();
				local138.aClass12_1 = local108;
				@Pc(148) int local148 = local33.method498();
				@Pc(150) int local150 = -1;
				@Pc(152) int local152 = 0;
				@Pc(159) int local159;
				for (@Pc(154) int local154 = 0; local154 < local148; local154++) {
					local159 = local48.method498();
					if (local159 > 0) {
						if (local108.anIntArray164[local154] != 0) {
							for (@Pc(170) int local170 = local154 - 1; local170 > local150; local170--) {
								if (local108.anIntArray164[local170] == 0) {
									local114[local152] = local170;
									local117[local152] = 0;
									local120[local152] = 0;
									local123[local152] = 0;
									local152++;
									break;
								}
							}
						}
						local114[local152] = local154;
						@Pc(206) short local206 = 0;
						if (local108.anIntArray164[local154] == 3) {
							local206 = 128;
						}
						if ((local159 & 0x1) == 0) {
							local117[local152] = local206;
						} else {
							local117[local152] = local73.method511();
						}
						if ((local159 & 0x2) == 0) {
							local120[local152] = local206;
						} else {
							local120[local152] = local73.method511();
						}
						if ((local159 & 0x4) == 0) {
							local123[local152] = local206;
						} else {
							local123[local152] = local73.method511();
						}
						local150 = local154;
						local152++;
						if (local108.anIntArray164[local154] == 5) {
							aBooleanArray8[local130] = false;
						}
					}
				}
				local138.anInt594 = local152;
				local138.anIntArray170 = new int[local152];
				local138.anIntArray171 = new int[local152];
				local138.anIntArray172 = new int[local152];
				local138.anIntArray173 = new int[local152];
				for (local159 = 0; local159 < local152; local159++) {
					local138.anIntArray170[local159] = local114[local159];
					local138.anIntArray171[local159] = local117[local159];
					local138.anIntArray172[local159] = local120[local159];
					local138.anIntArray173[local159] = local123[local159];
				}
			}
		} catch (@Pc(337) RuntimeException local337) {
			signlink.reporterror("90059, " + arg0 + ", " + arg1 + ", " + local337.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public static void method326(@OriginalArg(0) int arg0) {
		try {
			aClass14Array1 = null;
			@Pc(5) boolean local5 = false;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("26993, " + arg0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!h;")
	public static Class14 method327(@OriginalArg(1) int arg0) {
		try {
			return aClass14Array1 == null ? null : aClass14Array1[arg0];
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("1286, " + 0 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z")
	public static boolean method328(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 == -1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("70724, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	private Class14() {
	}
}
