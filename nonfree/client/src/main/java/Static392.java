import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Z")
	public static boolean aBoolean641;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!pe;")
	public static Class254 aClass254_104;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)I")
	public static int method6251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg1 : arg3;
		@Pc(41) int local41 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg3 : arg0;
		return ((local7 & 0x2) == 0 ? local41 : -local41) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Z")
	public static boolean method6253() {
		@Pc(7) Class3 local7 = Static342.aClass183_44.aClass3_161.aClass3_287;
		if (local7 == null || local7 == Static342.aClass183_44.aClass3_161) {
			return false;
		}
		@Pc(23) Class3_Sub40 local23 = (Class3_Sub40) local7;
		if (local23.anInt7324 >= 2000) {
			local23.anInt7324 -= 2000;
		}
		return local23.anInt7324 == 1003;
	}
}
