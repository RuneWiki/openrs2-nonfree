import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	public static int anInt6192 = 0;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_5 = new Class166(128);

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_88 = new Class11(49, 8);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIJI)V")
	public static void method5391(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static208.method3513(Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0], 0, 0, arg0, Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0], true, local15, local22, 0, arg2);
			return;
		}
		@Pc(47) Class172 local47 = Static221.aClass118_6.method2858(local29);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (local22 == 0 || local22 == 2) {
			local60 = local47.anInt4106;
			local57 = local47.anInt4113;
		} else {
			local57 = local47.anInt4106;
			local60 = local47.anInt4113;
		}
		@Pc(71) int local71 = local47.anInt4150;
		if (local22 != 0) {
			local71 = (local71 << local22 & 0xF) + (local71 >> 4 - local22);
		}
		Static208.method3513(Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0], local57, local71, arg0, Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0], true, 0, 0, local60, arg2);
	}
}
