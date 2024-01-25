import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dja", name = "F", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!dja", name = "A", descriptor = "Lclient!si;")
	public static final Class331 aClass331_1 = new Class331();

	@OriginalMember(owner = "client!dja", name = "E", descriptor = "I")
	public static int anInt2070 = -1;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IZ)V")
	public static void method2021() {
		@Pc(14) Class4_Sub48 local14 = Static335.method4615(Static359.aClass216_95, Static669.aClass196_2);
		Static410.method5170(local14);
		for (@Pc(22) Class4_Sub28 local22 = (Class4_Sub28) Static242.aClass66_17.method1992(); local22 != null; local22 = (Class4_Sub28) Static242.aClass66_17.method1984()) {
			if (!local22.method9002()) {
				local22 = (Class4_Sub28) Static242.aClass66_17.method1992();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt4696 == 0) {
				Static601.method7899(true, true, local22);
			}
		}
		if (Static451.aClass199_11 != null) {
			Static331.method4565(Static451.aClass199_11);
			Static451.aClass199_11 = null;
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "()V")
	public static void method2023() {
		Static73.method1562(Static539.anInt8345);
	}

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "(B)Lclient!cf;")
	public static Class22_Sub1 method2024() {
		return Static93.anInt1937 < Static382.aClass22_Sub1Array1.length ? Static382.aClass22_Sub1Array1[Static93.anInt1937++] : null;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIIIZ)V")
	public static void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static106.anInt2134 != 1) {
			return;
		}
		@Pc(15) int local15 = arg2 / Static614.anInt9423;
		@Pc(19) int local19 = arg1 / Static614.anInt9423;
		@Pc(23) int local23 = arg0 / Static567.anInt8756;
		@Pc(27) int local27 = arg3 / Static567.anInt8756;
		if (Static217.anInt3516 <= local15 || local19 < 0 || Static257.anInt4179 <= local23 || local27 < 0) {
			return;
		}
		if (Static217.anInt3516 <= local19) {
			local19 = Static217.anInt3516 - 1;
		}
		if (Static257.anInt4179 <= local27) {
			local27 = Static257.anInt4179 - 1;
		}
		if (local23 < 0) {
			local23 = 0;
		}
		if (local15 < 0) {
			local15 = 0;
		}
		for (@Pc(72) int local72 = local23; local72 <= local27; local72++) {
			@Pc(84) int local84 = Static130.method2322(local72 + Static280.anInt10342, Static257.anInt4179) * Static217.anInt3516;
			for (@Pc(86) int local86 = local15; local86 <= local19; local86++) {
				@Pc(97) int local97 = local84 + Static130.method2322(Static473.anInt7504 + local86, Static217.anInt3516);
				Static131.anIntArray159[local97] = Static604.anInt9294;
			}
		}
	}
}
