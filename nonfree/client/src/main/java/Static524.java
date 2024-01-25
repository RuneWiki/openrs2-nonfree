import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public static void method7014() {
		@Pc(16) Class3_Sub42 local16 = Static591.method7910(Static9.aClass199_3, Static198.aClass303_42);
		local16.aClass3_Sub11_Sub1_1.method5213(0);
		Static511.method6885(local16);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!sp;I)V")
	public static void method7016(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41_Sub2_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class365 local13 = arg2.method7861();
		@Pc(22) int local22 = arg2.anInt9522 - arg2.aClass259_7.anInt7038 & 0x3FFF;
		if (arg1 == -1) {
			if (local22 != 0 || arg2.anInt9496 > 25) {
				if (arg0 < 0 && local13.anInt9755 != -1) {
					arg2.anInt9512 = local13.anInt9755;
				} else if (arg0 <= 0 || local13.anInt9739 == -1) {
					arg2.anInt9512 = local13.anInt9724;
				} else {
					arg2.anInt9512 = local13.anInt9739;
				}
				arg2.aBoolean739 = false;
			} else if (!arg2.aBoolean739 || !local13.method7940(arg2.anInt9512)) {
				arg2.anInt9512 = local13.method7941();
				arg2.aBoolean739 = arg2.anInt9512 != -1;
			}
		} else if (arg2.anInt9483 != -1 && (local22 >= 10240 || local22 <= 2048)) {
			@Pc(217) int local217 = Static584.anIntArray620[arg3] - arg2.aClass259_7.anInt7038 & 0x3FFF;
			arg2.aBoolean739 = false;
			if (arg1 == 2 && local13.anInt9746 != -1) {
				if (local217 > 2048 && local217 <= 6144 && local13.anInt9733 != -1) {
					arg2.anInt9512 = local13.anInt9733;
				} else if (local217 >= 10240 && local217 < 14336 && local13.anInt9761 != -1) {
					arg2.anInt9512 = local13.anInt9761;
				} else if (local217 <= 6144 || local217 >= 10240 || local13.anInt9727 == -1) {
					arg2.anInt9512 = local13.anInt9746;
				} else {
					arg2.anInt9512 = local13.anInt9727;
				}
			} else if (arg1 == 0 && local13.anInt9747 != -1) {
				if (local217 > 2048 && local217 <= 6144 && local13.anInt9728 != -1) {
					arg2.anInt9512 = local13.anInt9728;
				} else if (local217 >= 10240 && local217 < 14336 && local13.anInt9729 != -1) {
					arg2.anInt9512 = local13.anInt9729;
				} else if (local217 <= 6144 || local217 >= 10240 || local13.anInt9730 == -1) {
					arg2.anInt9512 = local13.anInt9747;
				} else {
					arg2.anInt9512 = local13.anInt9730;
				}
			} else if (local217 > 2048 && local217 <= 6144 && local13.anInt9756 != -1) {
				arg2.anInt9512 = local13.anInt9756;
			} else if (local217 >= 10240 && local217 < 14336 && local13.anInt9758 != -1) {
				arg2.anInt9512 = local13.anInt9758;
			} else if (local217 <= 6144 || local217 >= 10240 || local13.anInt9736 == -1) {
				arg2.anInt9512 = local13.anInt9724;
			} else {
				arg2.anInt9512 = local13.anInt9736;
			}
		} else if (local22 == 0 && arg2.anInt9496 <= 25) {
			if (arg1 == 2 && local13.anInt9746 != -1) {
				arg2.anInt9512 = local13.anInt9746;
			} else if (arg1 == 0 && local13.anInt9747 != -1) {
				arg2.anInt9512 = local13.anInt9747;
			} else {
				arg2.anInt9512 = local13.anInt9724;
			}
			arg2.aBoolean739 = false;
		} else {
			arg2.aBoolean739 = false;
			if (arg1 == 2 && local13.anInt9746 != -1) {
				if (arg0 < 0 && local13.anInt9757 != -1) {
					arg2.anInt9512 = local13.anInt9757;
				} else if (arg0 <= 0 || local13.anInt9742 == -1) {
					arg2.anInt9512 = local13.anInt9746;
				} else {
					arg2.anInt9512 = local13.anInt9742;
				}
			} else if (arg1 == 0 && local13.anInt9747 != -1) {
				if (arg0 < 0 && local13.anInt9734 != -1) {
					arg2.anInt9512 = local13.anInt9734;
				} else if (arg0 <= 0 || local13.anInt9722 == -1) {
					arg2.anInt9512 = local13.anInt9747;
				} else {
					arg2.anInt9512 = local13.anInt9722;
				}
			} else if (arg0 < 0 && local13.anInt9744 != -1) {
				arg2.anInt9512 = local13.anInt9744;
			} else if (arg0 <= 0 || local13.anInt9726 == -1) {
				arg2.anInt9512 = local13.anInt9724;
			} else {
				arg2.anInt9512 = local13.anInt9726;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V")
	public static void method7017() {
		Static323.aClass3_Sub4_Sub3_2.method6335();
		Static24.aClass322_5 = null;
		Static565.anInt9228 = 1;
	}
}
