import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
	public static int anInt5940;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_141 = new Class25(72, -1);

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
	public static final int anInt5941 = 1406;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "[S")
	public static short[] aShortArray85 = new short[256];

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public static int anInt5942 = 0;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
	public static int anInt5943 = -1;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	public static void method4730() {
		if (Static360.anInt6380 != -1) {
			Static67.method1060(Static360.anInt6380, -1, -1, false);
			Static360.anInt6380 = -1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
	public static void method4731() {
		@Pc(7) Class213 local7 = null;
		try {
			@Pc(13) Class136 local13 = Static138.aClass194_2.method4405(true, "2");
			while (local13.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (local13.anInt3418 == 1) {
				local7 = (Class213) local13.anObject10;
				@Pc(41) Class2_Sub17 local41 = new Class2_Sub17(Static429.anInt7277 * 6 + 3);
				local41.method6172(1);
				local41.method6130(Static429.anInt7277);
				for (@Pc(51) int local51 = 0; local51 < Static388.anIntArray542.length; local51++) {
					if (Static203.aBooleanArray15[local51]) {
						local41.method6130(local51);
						local41.method6170(Static388.anIntArray542[local51]);
					}
				}
				local7.method4947(local41.anInt7523, local41.aByteArray94, 0);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method4946();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static206.aLong172 = Static432.method5870();
		Static410.aBoolean468 = false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4732(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local8 = (local8 << 5) + Static13.method316(arg0.charAt(local15)) - local8;
		}
		return local8;
	}
}
