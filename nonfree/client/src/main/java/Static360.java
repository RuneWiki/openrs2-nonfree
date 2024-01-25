import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
	public static int anInt1763;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
	public static int anInt1771;

	@OriginalMember(owner = "client!nv", name = "N", descriptor = "Z")
	private static boolean aBoolean137;

	@OriginalMember(owner = "client!nv", name = "O", descriptor = "Z")
	private static boolean aBoolean138;

	@OriginalMember(owner = "client!nv", name = "P", descriptor = "Z")
	private static boolean aBoolean139;

	@OriginalMember(owner = "client!nv", name = "Q", descriptor = "I")
	private static int anInt1790;

	@OriginalMember(owner = "client!nv", name = "R", descriptor = "Z")
	private static boolean aBoolean140;

	@OriginalMember(owner = "client!nv", name = "S", descriptor = "I")
	private static int anInt1791;

	@OriginalMember(owner = "client!nv", name = "T", descriptor = "I")
	private static int anInt1792;

	@OriginalMember(owner = "client!nv", name = "U", descriptor = "Z")
	private static boolean aBoolean141;

	@OriginalMember(owner = "client!nv", name = "V", descriptor = "I")
	private static int anInt1793;

	@OriginalMember(owner = "client!nv", name = "W", descriptor = "Z")
	private static boolean aBoolean142;

	@OriginalMember(owner = "client!nv", name = "X", descriptor = "Z")
	private static boolean aBoolean143;

	@OriginalMember(owner = "client!nv", name = "Y", descriptor = "Z")
	private static boolean aBoolean144;

	@OriginalMember(owner = "client!nv", name = "Z", descriptor = "I")
	private static int anInt1794;

	@OriginalMember(owner = "client!nv", name = "ab", descriptor = "Z")
	private static boolean aBoolean145;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!tc;")
	public static Class305 aClass305_3 = null;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Z")
	public static boolean aBoolean136 = true;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!mea;)V")
	public static void method1686(@OriginalArg(0) Class212 arg0) {
		if (Static464.anInt8684 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub28 local6 = arg0.aClass3_Sub28_2;
		Static464.aClass212Array1[Static464.anInt8684] = arg0;
		Static395.aBooleanArray16[Static464.anInt8684] = false;
		Static464.anInt8684++;
		@Pc(21) int local21 = arg0.anInt6629;
		if (arg0.aBoolean571) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6629;
		if (arg0.aBoolean572) {
			local29 = Static264.anInt8587 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8158() + Static377.anInt7321 - local6.method8154() >> Static309.anInt6172;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8158() + local6.method8154() - Static377.anInt7321 >> Static309.anInt6172;
			if (local73 >= Static416.anInt10065) {
				local73 = Static416.anInt10065 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray97[local41++];
				@Pc(105) int local105 = (local6.method8156() + Static377.anInt7321 - local6.method8154() >> Static309.anInt6172) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static223.anInt4520) {
					local113 = Static223.anInt4520 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static272.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static272.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static464.anInt8684;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static272.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static464.anInt8684 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static272.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static464.anInt8684 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static272.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static464.anInt8684 << 48;
					}
				}
			}
		}
	}
}
