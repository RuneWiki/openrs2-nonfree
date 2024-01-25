import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt10566 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ)I")
	public static int method9061(@OriginalArg(0) int arg0) {
		@Pc(21) Class5_Sub48 local21 = Static507.method7441(arg0, false);
		if (local21 == null) {
			return Static163.aClass122_1.method2209(arg0).anInt1098;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local21.anIntArray523.length; local34++) {
			if (local21.anIntArray523[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static163.aClass122_1.method2209(arg0).anInt1098 - local21.anIntArray523.length;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method9062() {
		if (Static28.anInt9247 <= 1) {
			Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub20_1);
		} else {
			Static637.aClass5_Sub20_31.method3194(4, Static637.aClass5_Sub20_31.aClass24_Sub20_1);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBILclient!pda;)V")
	public static void method9066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub5_Sub18 arg2) {
		if (!Static526.aBoolean669) {
			return;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(17) Class5_Sub5_Sub19 local17 = (Class5_Sub5_Sub19) arg2.aClass149_8.method2890(); local17 != null; local17 = (Class5_Sub5_Sub19) arg2.aClass149_8.method2894()) {
			@Pc(23) int local23 = Static195.method2803(local17);
			if (local23 > local11) {
				local11 = local23;
			}
		}
		local11 += 8;
		@Pc(56) int local56 = arg2.anInt7610 * 16 + 21;
		Static101.anInt1607 = arg2.anInt7610 * 16 + (Static519.aBoolean664 ? 26 : 22);
		@Pc(74) int local74 = Static498.anInt8306 + Static327.anInt5831;
		if (local74 + local11 > Static70.anInt1125) {
			local74 = Static327.anInt5831 - local11;
		}
		if (local74 < 0) {
			local74 = 0;
		}
		@Pc(96) int local96 = Static519.aBoolean664 ? 33 : 31;
		@Pc(103) int local103 = arg0 + 13 - local96;
		if (local56 + local103 > Static631.anInt10283) {
			local103 = Static631.anInt10283 - local56;
		}
		Static652.anInt10541 = local74;
		if (local103 < 0) {
			local103 = 0;
		}
		Static422.anInt7304 = local103;
		Static604.aClass5_Sub5_Sub18_1 = arg2;
		Static493.anInt8236 = local11;
	}
}
