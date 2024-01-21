import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array9;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1351 = Static65.method1172("Enter your username (V password)3");

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1352 = aClass46_1351;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public static int anInt3770 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method2721() {
		aClass46_1351 = null;
		aClass46_1352 = null;
		aClass3_Sub2_Sub3_Sub2Array9 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!mc;)V")
	public static void method2722(@OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anInt1682 == 0) {
			return;
		}
		@Pc(41) int local41;
		@Pc(35) int local35;
		if (arg0.anInt1723 != -1 && arg0.anInt1723 < 32768) {
			@Pc(27) Class3_Sub2_Sub1_Sub1_Sub2 local27 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[arg0.anInt1723];
			if (local27 != null) {
				local35 = arg0.anInt1711 - local27.anInt1711;
				local41 = arg0.anInt1700 - local27.anInt1700;
				if (local41 != 0 || local35 != 0) {
					arg0.anInt1732 = (int) (Math.atan2((double) local41, (double) local35) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(66) int local66;
		if (arg0.anInt1723 >= 32768) {
			local66 = arg0.anInt1723 - 32768;
			if (local66 == Static6.anInt137) {
				local66 = 2047;
			}
			@Pc(79) Class3_Sub2_Sub1_Sub1_Sub1 local79 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local66];
			if (local79 != null) {
				local35 = arg0.anInt1700 - local79.anInt1700;
				@Pc(93) int local93 = arg0.anInt1711 - local79.anInt1711;
				if (local35 != 0 || local93 != 0) {
					arg0.anInt1732 = (int) (Math.atan2((double) local35, (double) local93) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1718 != 0 || arg0.anInt1708 != 0) && (arg0.anInt1724 == 0 || arg0.anInt1709 > 0)) {
			local66 = arg0.anInt1700 - (arg0.anInt1718 - Static42.anInt1173 - Static42.anInt1173) * 64;
			local41 = arg0.anInt1711 - (arg0.anInt1708 - Static58.anInt1578 - Static58.anInt1578) * 64;
			if (local66 != 0 || local41 != 0) {
				arg0.anInt1732 = (int) (Math.atan2((double) local66, (double) local41) * 325.949D) & 0x7FF;
			}
			arg0.anInt1718 = 0;
			arg0.anInt1708 = 0;
		}
		local66 = arg0.anInt1732 - arg0.anInt1736 & 0x7FF;
		if (local66 == 0) {
			arg0.anInt1702 = 0;
			return;
		}
		arg0.anInt1702++;
		@Pc(218) boolean local218;
		if (local66 <= 1024) {
			arg0.anInt1736 += arg0.anInt1682;
			local218 = true;
			if (arg0.anInt1682 > local66 || 2048 - arg0.anInt1682 < local66) {
				arg0.anInt1736 = arg0.anInt1732;
				local218 = false;
			}
			if (arg0.anInt1719 == arg0.anInt1683 && (arg0.anInt1702 > 25 || local218)) {
				if (arg0.anInt1714 == -1) {
					arg0.anInt1719 = arg0.anInt1713;
				} else {
					arg0.anInt1719 = arg0.anInt1714;
				}
			}
		} else {
			arg0.anInt1736 -= arg0.anInt1682;
			local218 = true;
			if (local66 < arg0.anInt1682 || 2048 - arg0.anInt1682 < local66) {
				local218 = false;
				arg0.anInt1736 = arg0.anInt1732;
			}
			if (arg0.anInt1719 == arg0.anInt1683 && (arg0.anInt1702 > 25 || local218)) {
				if (arg0.anInt1699 == -1) {
					arg0.anInt1719 = arg0.anInt1713;
				} else {
					arg0.anInt1719 = arg0.anInt1699;
				}
			}
		}
		arg0.anInt1736 &= 0x7FF;
	}
}
