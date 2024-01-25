import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!to;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "Lclient!os;")
	public static final Class184 aClass184_1 = new Class184();

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIBI)V")
	public static void method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static176.aClass113ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(25) Class2_Sub21 local25 = (Class2_Sub21) Static383.aClass240_34.method5439(local19);
		if (local25 == null) {
			Static3.method90(arg0, arg1, arg2);
			return;
		}
		@Pc(47) Class2_Sub45 local47 = (Class2_Sub45) local25.aClass265_28.method6005();
		if (local47 == null) {
			Static3.method90(arg0, arg1, arg2);
			return;
		}
		@Pc(61) Class4_Sub5_Sub1 local61 = (Class4_Sub5_Sub1) Static3.method90(arg0, arg1, arg2);
		if (local61 == null) {
			local61 = new Class4_Sub5_Sub1();
		} else {
			local61.anInt7595 = local61.anInt7594 = -1;
		}
		local61.anInt7600 = local47.anInt7832;
		local61.anInt7597 = local47.anInt7831;
		label44: while (true) {
			@Pc(89) Class2_Sub45 local89 = (Class2_Sub45) local25.aClass265_28.method6001();
			if (local89 == null) {
				break;
			}
			if (local89.anInt7831 != local61.anInt7597) {
				local61.anInt7595 = local89.anInt7831;
				local61.anInt7592 = local89.anInt7832;
				while (true) {
					@Pc(114) Class2_Sub45 local114 = (Class2_Sub45) local25.aClass265_28.method6001();
					if (local114 == null) {
						break label44;
					}
					if (local114.anInt7831 != local61.anInt7597 && local61.anInt7595 != local114.anInt7831) {
						local61.anInt7594 = local114.anInt7831;
						local61.anInt7596 = local114.anInt7832;
					}
				}
			}
		}
		@Pc(154) int local154 = Static66.method1200(arg0, (arg1 << 7) + 64, (arg2 << 7) + 64);
		Static19.method262(arg0, arg1, arg2, local154, local61);
	}
}
