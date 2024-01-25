import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	public static int anInt3743 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLclient!ft;)V")
	public static void method3317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub5 arg2) {
		if (!Static423.aBoolean549) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class5_Sub2_Sub13 local16 = (Class5_Sub2_Sub13) arg2.aClass150_3.method3100(); local16 != null; local16 = (Class5_Sub2_Sub13) arg2.aClass150_3.method3096()) {
			local22 = Static637.method8446(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		local22 = arg2.anInt2821 * 16 + 21;
		Static360.anInt6296 = arg2.anInt2821 * 16 + (Static530.aBoolean635 ? 26 : 22);
		@Pc(63) int local63 = Static342.anInt6177 + Static73.anInt1175;
		if (local63 + local10 > Static563.anInt9176) {
			local63 = Static73.anInt1175 - local10;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(92) int local92 = Static530.aBoolean635 ? 33 : 31;
		@Pc(99) int local99 = arg0 + 13 - local92;
		if (Static316.anInt8165 < local99 + local22) {
			local99 = Static316.anInt8165 - local22;
		}
		Static501.anInt8524 = local63;
		if (local99 < 0) {
			local99 = 0;
		}
		Static212.anInt3404 = local99;
		Static303.aClass5_Sub2_Sub5_1 = arg2;
		Static469.anInt8171 = local10;
	}
}
