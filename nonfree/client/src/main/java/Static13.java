import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
	public static int anInt166;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
	public static int anInt168;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
	public static int anInt162 = 100;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBI)Z")
	public static boolean method204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!mk;I)V")
	public static void method205(@OriginalArg(0) Class5_Sub1_Sub13 arg0) {
		if (Static490.aBoolean536) {
			return;
		}
		arg0.method9222();
		Static651.anInt10662--;
		if (!arg0.aBoolean413) {
			@Pc(30) long local30 = arg0.aLong177;
			@Pc(36) Class5_Sub1_Sub20 local36;
			for (local36 = (Class5_Sub1_Sub20) Static99.aClass306_8.method6943(local30); local36 != null && !local36.aString114.equals(arg0.aString74); local36 = (Class5_Sub1_Sub20) Static99.aClass306_8.method6945()) {
			}
			if (local36 != null && local36.method8388(arg0)) {
				Static19.method290(local36);
				return;
			}
			return;
		}
		for (@Pc(76) Class5_Sub1_Sub20 local76 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local76 != null; local76 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
			if (local76.aString114.equals(arg0.aString74)) {
				@Pc(88) boolean local88 = false;
				for (@Pc(94) Class5_Sub1_Sub13 local94 = (Class5_Sub1_Sub13) local76.aClass388_14.method9027(); local94 != null; local94 = (Class5_Sub1_Sub13) local76.aClass388_14.method9024()) {
					if (local94 == arg0) {
						local88 = true;
						if (local76.method8388(arg0)) {
							Static19.method290(local76);
						}
						break;
					}
				}
				if (local88) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIII)V")
	public static void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static319.anInt5445 || Static573.anInt8986 > arg4) {
			return;
		}
		@Pc(44) boolean local44;
		if (Static230.anInt3962 > arg1) {
			local44 = false;
			arg1 = Static230.anInt3962;
		} else if (arg1 <= Static463.anInt7530) {
			local44 = true;
		} else {
			local44 = false;
			arg1 = Static463.anInt7530;
		}
		@Pc(61) boolean local61;
		if (arg3 < Static230.anInt3962) {
			local61 = false;
			arg3 = Static230.anInt3962;
		} else if (Static463.anInt7530 < arg3) {
			local61 = false;
			arg3 = Static463.anInt7530;
		} else {
			local61 = true;
		}
		if (arg0 < Static573.anInt8986) {
			arg0 = Static573.anInt8986;
		} else {
			Static161.method2977(arg1, arg2, arg3, Static120.anIntArrayArray18[arg0++], -115);
		}
		if (Static319.anInt5445 >= arg4) {
			Static161.method2977(arg1, arg2, arg3, Static120.anIntArrayArray18[arg4--], -124);
		} else {
			arg4 = Static319.anInt5445;
		}
		@Pc(130) int local130;
		if (local44 && local61) {
			for (local130 = arg0; local130 <= arg4; local130++) {
				@Pc(179) int[] local179 = Static120.anIntArrayArray18[local130];
				local179[arg1] = local179[arg3] = arg2;
			}
		} else if (local44) {
			for (local130 = arg0; local130 <= arg4; local130++) {
				Static120.anIntArrayArray18[local130][arg1] = arg2;
			}
		} else if (local61) {
			for (local130 = arg0; local130 <= arg4; local130++) {
				Static120.anIntArrayArray18[local130][arg3] = arg2;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	public static void method207() {
		Static62.anInt1051 = -2;
		Static438.anInt7237 = -2;
		Static205.anInt3674 = 0;
	}
}
