import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_65 = new Class71(25, -1);

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IBLclient!ei;I)V")
	public static void method4544(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub5_Sub6 arg1, @OriginalArg(3) int arg2) {
		if (!Static211.aBoolean370) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class8_Sub5_Sub7 local16 = (Class8_Sub5_Sub7) arg1.aClass302_2.method7327(); local16 != null; local16 = (Class8_Sub5_Sub7) arg1.aClass302_2.method7326()) {
			local22 = Static170.method3366(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		local22 = arg1.anInt3391 * 16 + 21;
		Static331.anInt10704 = arg1.anInt3391 * 16 + (Static238.aBoolean398 ? 26 : 22);
		@Pc(63) int local63 = Static465.anInt8462 + Static306.anInt6216;
		if (Static235.anInt5298 < local63 + local10) {
			local63 = Static465.anInt8462 - local10;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(90) int local90 = Static238.aBoolean398 ? 33 : 31;
		@Pc(97) int local97 = arg0 + 13 - local90;
		if (local22 + local97 > Static313.anInt6355) {
			local97 = Static313.anInt6355 - local22;
		}
		if (local97 < 0) {
			local97 = 0;
		}
		Static264.anInt5648 = local63;
		Static479.aClass8_Sub5_Sub6_1 = arg1;
		Static528.anInt9126 = local97;
		Static358.anInt6868 = local10;
	}
}
