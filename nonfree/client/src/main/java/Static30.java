import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public static void method426() {
		@Pc(7) int local7 = Static97.anInt1902;
		@Pc(9) int[] local9 = Static105.anIntArray107;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class47_Sub1_Sub5_Sub2 local19 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static379.method5350(local19.method4317(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)I")
	public static int method427(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(15) int local15 = local5 | local5 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public static void method428() {
		if (Static222.aBoolean314) {
			return;
		}
		if (Static327.aClass230_Sub1_1.aBoolean621) {
			Static147.aFloat59 = (int) Static147.aFloat59 + 191 & 0xFFFFFF80;
		} else {
			Static285.aFloat4 += (24.0F - Static285.aFloat4) / 2.0F;
		}
		Static222.aBoolean314 = true;
		Static5.aBoolean541 = true;
	}
}
