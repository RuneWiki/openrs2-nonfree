import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sh", name = "pb", descriptor = "Lclient!ah;")
	public static Class7 aClass7_28;

	@OriginalMember(owner = "client!sh", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_553 = Static170.method3101("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!sh", name = "sb", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!sh", name = "Rb", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
	public static void method1433(@OriginalArg(0) int arg0) {
		Static30.anInt948 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static90.anInt2564; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static87.anInt2536; local6++) {
				if (Static149.aClass3_Sub20ArrayArrayArray1[arg0][local3][local6] == null) {
					Static149.aClass3_Sub20ArrayArrayArray1[arg0][local3][local6] = new Class3_Sub20(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)V")
	public static void method1434() {
		aClass28_553 = null;
		aClass7_28 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!sh;)V")
	public static void method1435(@OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt1816 == 0) {
			return;
		}
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (arg0.anInt1796 != -1 && arg0.anInt1796 < 32768) {
			@Pc(22) Class3_Sub2_Sub1_Sub2_Sub2 local22 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[arg0.anInt1796];
			if (local22 != null) {
				local31 = arg0.anInt1800 - local22.anInt1800;
				local37 = arg0.anInt1792 - local22.anInt1792;
				if (local31 != 0 || local37 != 0) {
					arg0.anInt1793 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(65) int local65;
		if (arg0.anInt1796 >= 32768) {
			local65 = arg0.anInt1796 - 32768;
			if (Static155.anInt3857 == local65) {
				local65 = 2047;
			}
			@Pc(74) Class3_Sub2_Sub1_Sub2_Sub1 local74 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local65];
			if (local74 != null) {
				local37 = arg0.anInt1800 - local74.anInt1800;
				@Pc(89) int local89 = arg0.anInt1792 - local74.anInt1792;
				if (local37 != 0 || local89 != 0) {
					arg0.anInt1793 = (int) (Math.atan2((double) local37, (double) local89) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1811 != 0 || arg0.anInt1826 != 0) && (arg0.anInt1783 == 0 || arg0.anInt1784 > 0)) {
			local65 = arg0.anInt1800 - (arg0.anInt1811 - Static111.anInt2843 - Static111.anInt2843) * 64;
			local31 = arg0.anInt1792 - (arg0.anInt1826 - Static29.anInt907 - Static29.anInt907) * 64;
			if (local65 != 0 || local31 != 0) {
				arg0.anInt1793 = (int) (Math.atan2((double) local65, (double) local31) * 325.949D) & 0x7FF;
			}
			arg0.anInt1826 = 0;
			arg0.anInt1811 = 0;
		}
		local65 = arg0.anInt1793 - arg0.anInt1795 & 0x7FF;
		if (local65 == 0) {
			arg0.anInt1815 = 0;
			return;
		}
		arg0.anInt1815++;
		@Pc(216) boolean local216;
		if (local65 <= 1024) {
			arg0.anInt1795 += arg0.anInt1816;
			local216 = true;
			if (local65 < arg0.anInt1816 || local65 > 2048 - arg0.anInt1816) {
				local216 = false;
				arg0.anInt1795 = arg0.anInt1793;
			}
			if (arg0.anInt1827 == arg0.anInt1821 && (arg0.anInt1815 > 25 || local216)) {
				if (arg0.anInt1786 == -1) {
					arg0.anInt1827 = arg0.anInt1831;
				} else {
					arg0.anInt1827 = arg0.anInt1786;
				}
			}
		} else {
			arg0.anInt1795 -= arg0.anInt1816;
			local216 = true;
			if (arg0.anInt1816 > local65 || local65 > 2048 - arg0.anInt1816) {
				arg0.anInt1795 = arg0.anInt1793;
				local216 = false;
			}
			if (arg0.anInt1821 == arg0.anInt1827 && (arg0.anInt1815 > 25 || local216)) {
				if (arg0.anInt1823 == -1) {
					arg0.anInt1827 = arg0.anInt1831;
				} else {
					arg0.anInt1827 = arg0.anInt1823;
				}
			}
		}
		arg0.anInt1795 &= 0x7FF;
	}
}
