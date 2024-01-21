import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ke", name = "Cb", descriptor = "Lclient!td;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!ke", name = "tb", descriptor = "Lclient!he;")
	public static Class26 aClass26_934 = Static6.method100("<col=ff0000>");

	@OriginalMember(owner = "client!ke", name = "ub", descriptor = "I")
	public static int anInt1885 = 0;

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "[S")
	public static short[] aShortArray15 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ke", name = "Db", descriptor = "Lclient!he;")
	public static Class26 aClass26_935 = Static6.method100("Null");

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "I")
	public static int anInt1894 = 0;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
	public static void method1230() {
		aClass69_1 = null;
		aClass26_935 = null;
		aShortArray15 = null;
		aClass26_934 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!fb;Z)V")
	public static void method1231(@OriginalArg(0) Class3_Sub1_Sub5_Sub1 arg0) {
		if (arg0.anInt2713 == 0) {
			arg0.anInt2691 = 1024;
		}
		@Pc(18) int local18 = arg0.anInt2712 * 64 + arg0.anInt2740 * 128;
		if (arg0.anInt2713 == 1) {
			arg0.anInt2691 = 1536;
		}
		@Pc(36) int local36 = arg0.anInt2709 * 128 + arg0.anInt2712 * 64;
		@Pc(41) int local41 = arg0.anInt2696 - Static4.anInt136;
		if (arg0.anInt2713 == 2) {
			arg0.anInt2691 = 0;
		}
		arg0.anInt2730 = 0;
		arg0.anInt2733 += (local36 - arg0.anInt2733) / local41;
		if (arg0.anInt2713 == 3) {
			arg0.anInt2691 = 512;
		}
		arg0.anInt2731 += (local18 - arg0.anInt2731) / local41;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
	public static void method1232(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = anInt1885;
		if (Static1.anInt8 == Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7 && Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 >> 7 == Static110.anInt2946) {
			Static1.anInt8 = 0;
		}
		if (arg0) {
			local12 = 1;
		}
		for (@Pc(36) int local36 = 0; local36 < local12; local36++) {
			@Pc(46) Class3_Sub1_Sub5_Sub1_Sub1 local46;
			@Pc(52) int local52;
			if (arg0) {
				local52 = 33538048;
				local46 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1;
			} else {
				local46 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[Static117.anIntArray370[local36]];
				local52 = Static117.anIntArray370[local36] << 14;
			}
			if (local46 != null && local46.method1880()) {
				local46.aBoolean41 = false;
				@Pc(72) int local72 = local46.anInt2733 >> 7;
				if ((Static98.aBoolean151 && anInt1885 > 50 || anInt1885 > 200) && !arg0 && local46.anInt2729 == local46.anInt2723) {
					local46.aBoolean41 = true;
				}
				@Pc(101) int local101 = local46.anInt2731 >> 7;
				if (local72 >= 0 && local72 < 104 && local101 >= 0 && local101 < 104) {
					if (local46.aClass3_Sub1_Sub5_Sub7_1 == null || local46.anInt838 > Static4.anInt136 || Static4.anInt136 >= local46.anInt833) {
						if ((local46.anInt2733 & 0x7F) == 64 && (local46.anInt2731 & 0x7F) == 64) {
							if (Static67.anInt2785 == Static125.anIntArrayArray29[local72][local101]) {
								continue;
							}
							Static125.anIntArrayArray29[local72][local101] = Static67.anInt2785;
						}
						local46.anInt835 = Static110.method2006(local46.anInt2733, local46.anInt2731, Static132.anInt3270);
						aClass69_1.method2048(Static132.anInt3270, local46.anInt2733, local46.anInt2731, local46.anInt835, 60, local46, local46.anInt2692, local52, local46.aBoolean157);
					} else {
						local46.aBoolean41 = false;
						local46.anInt835 = Static110.method2006(local46.anInt2733, local46.anInt2731, Static132.anInt3270);
						aClass69_1.method2016(Static132.anInt3270, local46.anInt2733, local46.anInt2731, local46.anInt835, local46, local46.anInt2692, local52, local46.anInt839, local46.anInt836, local46.anInt840, local46.anInt829);
					}
				}
			}
		}
	}
}
