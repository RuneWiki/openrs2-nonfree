import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
	public static void method5660(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9 local10 = (Class5_Sub9) Static134.aClass291_12.method6993((long) arg0, 1);
		if (local10 != null) {
			local10.aBoolean143 = !local10.aBoolean143;
			local10.aClass272_Sub1_1.method6469(local10.aBoolean143);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLclient!hs;)V")
	public static void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) Class165 arg1) {
		if (Static21.anInt322 >= 50 || (arg1 == null || arg1.anIntArrayArray26 == null || arg0 >= arg1.anIntArrayArray26.length || arg1.anIntArrayArray26[arg0] == null)) {
			return;
		}
		@Pc(40) int local40 = arg1.anIntArrayArray26[arg0][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(77) int local77;
		if (arg1.anIntArrayArray26[arg0].length > 1) {
			local77 = (int) ((double) arg1.anIntArrayArray26[arg0].length * Math.random());
			if (local77 > 0) {
				local44 = arg1.anIntArrayArray26[arg0][local77];
			}
		}
		local77 = 256;
		if (arg1.anIntArray224 != null && arg1.anIntArray222 != null) {
			local77 = Static104.method1522(arg1.anIntArray222[arg0], arg1.anIntArray224[arg0]);
		}
		if (arg1.aBoolean305) {
			Static391.method5714(255, 0, local44, local77, local50, false);
		} else {
			Static443.method6563(0, local77, local50, 255, local44);
		}
	}
}
