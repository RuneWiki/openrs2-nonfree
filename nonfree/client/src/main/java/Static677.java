import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!za", name = "j", descriptor = "I")
	public static int anInt10679;

	@OriginalMember(owner = "client!za", name = "i", descriptor = "Z")
	public static boolean aBoolean794 = true;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "[S")
	public static short[] aShortArray160 = new short[256];

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(JIII)V")
	public static void method8830(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static240.method3447(0, arg2, local17, true, local10, 0, 0, arg1);
			return;
		}
		@Pc(45) Class81 local45 = Static400.aClass140_4.method2839(local24);
		@Pc(59) int local59;
		@Pc(56) int local56;
		if (local17 == 0 || local17 == 2) {
			local56 = local45.anInt1897;
			local59 = local45.anInt1910;
		} else {
			local56 = local45.anInt1910;
			local59 = local45.anInt1897;
		}
		@Pc(69) int local69 = local45.anInt1907;
		if (local17 != 0) {
			local69 = (local69 << local17 & 0xF) + (local69 >> 4 - local17);
		}
		Static240.method3447(local56, arg2, 0, true, 0, local69, local59, arg1);
	}
}
