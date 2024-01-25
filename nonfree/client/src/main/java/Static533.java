import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!kfa;)I")
	public static int method7755(@OriginalArg(1) Class1_Sub4_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) Class283 local8 = arg0.aClass283_1;
		if (local8.anIntArray453 != null) {
			local8 = local8.method6834(Static45.aClass148_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt8261;
		@Pc(29) Class316 local29 = arg0.method6921();
		if (arg0.anInt8409 == -1 || arg0.aBoolean589) {
			local23 = local8.anInt8254;
		} else if (local29.anInt9146 == arg0.anInt8409 || local29.anInt9142 == arg0.anInt8409 || arg0.anInt8409 == local29.anInt9157 || arg0.anInt8409 == local29.anInt9121) {
			local23 = local8.anInt8262;
		} else if (arg0.anInt8409 == local29.anInt9149 || local29.anInt9151 == arg0.anInt8409 || arg0.anInt8409 == local29.anInt9162 || arg0.anInt8409 == local29.anInt9138) {
			local23 = local8.anInt8271;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method7756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg2) {
			Static306.method5239(Static46.anIntArrayArray4[arg0], arg1, arg3, arg2);
		} else {
			Static306.method5239(Static46.anIntArrayArray4[arg0], arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	public static void method7757() {
		if (Static400.anInterface14Array1 == null) {
			return;
		}
		@Pc(13) Interface14[] local13 = Static400.anInterface14Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Interface14 local21 = local13[local15];
			local21.method7593();
		}
	}
}
