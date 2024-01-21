import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MOOJSKCU")
public final class Class23 {

	@OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "[Lclient!MOOJSKCU;")
	private static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!MOOJSKCU", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!MOOJSKCU", name = "b", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!MOOJSKCU", name = "c", descriptor = "Lclient!TULKBDIJ;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!MOOJSKCU", name = "d", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!MOOJSKCU", name = "e", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!MOOJSKCU", name = "f", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!MOOJSKCU", name = "g", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!MOOJSKCU", name = "h", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "(I)V")
	public static void method339(@OriginalArg(0) int arg0) {
		aClass23Array1 = new Class23[arg0 + 1];
		aBooleanArray8 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray8[local11] = true;
		}
	}

	@OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "([BB)V")
	public static void method340(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, 0);
			local7.anInt301 = arg0.length - 8;
			@Pc(16) int local16 = local7.method157();
			@Pc(19) int local19 = local7.method157();
			@Pc(22) int local22 = local7.method157();
			@Pc(25) int local25 = local7.method157();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, 0);
			local33.anInt301 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, 0);
			local48.anInt301 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, 0);
			local61.anInt301 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, 0);
			local74.anInt301 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(87) Class1_Sub1_Sub3 local87 = new Class1_Sub1_Sub3(arg0, 0);
			local87.anInt301 = local81;
			@Pc(96) Class38 local96 = new Class38(local87, true);
			@Pc(99) int local99 = local33.method157();
			@Pc(102) int[] local102 = new int[500];
			@Pc(105) int[] local105 = new int[500];
			@Pc(108) int[] local108 = new int[500];
			@Pc(111) int[] local111 = new int[500];
			for (@Pc(123) int local123 = 0; local123 < local99; local123++) {
				@Pc(128) int local128 = local33.method157();
				@Pc(136) Class23 local136 = aClass23Array1[local128] = new Class23();
				local136.anInt543 = local74.method155();
				local136.aClass38_1 = local96;
				@Pc(146) int local146 = local33.method155();
				@Pc(148) int local148 = -1;
				@Pc(150) int local150 = 0;
				@Pc(157) int local157;
				for (@Pc(152) int local152 = 0; local152 < local146; local152++) {
					local157 = local48.method155();
					if (local157 > 0) {
						if (local96.anIntArray168[local152] != 0) {
							for (@Pc(168) int local168 = local152 - 1; local168 > local148; local168--) {
								if (local96.anIntArray168[local168] == 0) {
									local102[local150] = local168;
									local105[local150] = 0;
									local108[local150] = 0;
									local111[local150] = 0;
									local150++;
									break;
								}
							}
						}
						local102[local150] = local152;
						@Pc(204) short local204 = 0;
						if (local96.anIntArray168[local152] == 3) {
							local204 = 128;
						}
						if ((local157 & 0x1) == 0) {
							local105[local150] = local204;
						} else {
							local105[local150] = local61.method168();
						}
						if ((local157 & 0x2) == 0) {
							local108[local150] = local204;
						} else {
							local108[local150] = local61.method168();
						}
						if ((local157 & 0x4) == 0) {
							local111[local150] = local204;
						} else {
							local111[local150] = local61.method168();
						}
						local148 = local152;
						local150++;
						if (local96.anIntArray168[local152] == 5) {
							aBooleanArray8[local128] = false;
						}
					}
				}
				local136.anInt544 = local150;
				local136.anIntArray82 = new int[local150];
				local136.anIntArray83 = new int[local150];
				local136.anIntArray84 = new int[local150];
				local136.anIntArray85 = new int[local150];
				for (local157 = 0; local157 < local150; local157++) {
					local136.anIntArray82[local157] = local102[local157];
					local136.anIntArray83[local157] = local105[local157];
					local136.anIntArray84[local157] = local108[local157];
					local136.anIntArray85[local157] = local111[local157];
				}
			}
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("2748, " + arg0 + ", " + 2 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOOJSKCU", name = "b", descriptor = "(I)V")
	public static void method341(@OriginalArg(0) int arg0) {
		try {
			aClass23Array1 = null;
			if (arg0 < 7 || arg0 > 7) {
				;
			}
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("37502, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOOJSKCU", name = "c", descriptor = "(I)Lclient!MOOJSKCU;")
	public static Class23 method342(@OriginalArg(0) int arg0) {
		return aClass23Array1 == null ? null : aClass23Array1[arg0];
	}

	@OriginalMember(owner = "client!MOOJSKCU", name = "a", descriptor = "(IB)Z")
	public static boolean method343(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 == -1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("41712, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MOOJSKCU", name = "<init>", descriptor = "()V")
	private Class23() {
	}
}
