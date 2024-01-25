import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!to", name = "d", descriptor = "[I")
	public static final int[] anIntArray613 = new int[4096];

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	public static int anInt9429 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)I")
	public static int method7643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static540.method7921(arg0 - 1, arg1 + -1) + Static540.method7921(arg0 + 1, arg1 + -1) + Static540.method7921(arg0 + -1, arg1 - -1) + Static540.method7921(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static540.method7921(arg0 - 1, arg1) + Static540.method7921(arg0 + 1, arg1) + Static540.method7921(arg0, arg1 - 1) + Static540.method7921(arg0, arg1 + 1);
		@Pc(83) int local83 = Static540.method7921(arg0, arg1);
		return local83 / 4 + local48 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
	public static void method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static230.anInt4667 + arg1;
		@Pc(11) int local11 = Static563.anInt10006 + arg0;
		if (Static580.aClass125ArrayArrayArray3 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static460.anInt8640 || arg0 >= Static292.anInt7682) {
			return;
		}
		@Pc(43) long local43 = (long) (local11 << 14 | arg2 << 28 | local7);
		@Pc(49) Class3_Sub30 local49 = (Class3_Sub30) Static30.aClass25_5.method946(local43);
		if (local49 == null) {
			Static51.method1280(arg2, arg1, arg0);
			return;
		}
		@Pc(63) Class3_Sub10 local63 = (Class3_Sub10) local49.aClass183_37.method4795();
		if (local63 == null) {
			Static51.method1280(arg2, arg1, arg0);
			return;
		}
		@Pc(77) Class2_Sub5_Sub1 local77 = (Class2_Sub5_Sub1) Static51.method1280(arg2, arg1, arg0);
		if (local77 == null) {
			local77 = new Class2_Sub5_Sub1();
		} else {
			local77.anInt9864 = local77.anInt9862 = -1;
		}
		local77.anInt9855 = local63.anInt1853;
		local77.anInt9860 = local63.anInt1852;
		label46: while (true) {
			@Pc(104) Class3_Sub10 local104 = (Class3_Sub10) local49.aClass183_37.method4793();
			if (local104 == null) {
				break;
			}
			if (local104.anInt1852 != local77.anInt9860) {
				local77.anInt9864 = local104.anInt1852;
				local77.anInt9863 = local104.anInt1853;
				while (true) {
					@Pc(125) Class3_Sub10 local125 = (Class3_Sub10) local49.aClass183_37.method4793();
					if (local125 == null) {
						break label46;
					}
					if (local77.anInt9860 != local125.anInt1852 && local77.anInt9864 != local125.anInt1852) {
						local77.anInt9856 = local125.anInt1853;
						local77.anInt9862 = local125.anInt1852;
					}
				}
			}
		}
		@Pc(170) int local170 = Static274.method4782((arg0 << 9) + 256, arg2, (arg1 << 9) + 256);
		Static444.method6926(arg2, arg1, arg0, local170, local77);
	}
}
