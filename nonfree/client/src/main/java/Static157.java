import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public static int anInt3283;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)[Lclient!sda;")
	public static Class306[] method2954() {
		if (Static286.aClass306Array1 == null) {
			@Pc(19) Class306[] local19 = Static517.method6937(Static237.aClass258_3);
			@Pc(23) Class306[] local23 = new Class306[local19.length];
			@Pc(25) int local25 = 0;
			@Pc(30) int local30 = Static405.aClass3_Sub3_Sub1_1.method6310(Static60.anInt1312);
			@Pc(98) int local98;
			@Pc(104) Class306 local104;
			label70: for (@Pc(32) int local32 = 0; local32 < local19.length; local32++) {
				@Pc(38) Class306 local38 = local19[local32];
				if ((local38.anInt7909 <= 0 || local38.anInt7909 >= 24) && local38.anInt7912 >= 800 && local38.anInt7911 >= 600 && (local30 != 2 || local38.anInt7912 <= 800 && local38.anInt7911 <= 600) && (local30 != 1 || local38.anInt7912 <= 1024 && local38.anInt7911 <= 768)) {
					for (local98 = 0; local98 < local25; local98++) {
						local104 = local23[local98];
						if (local38.anInt7912 == local104.anInt7912 && local38.anInt7911 == local104.anInt7911) {
							if (local104.anInt7909 < local38.anInt7909) {
								local23[local98] = local38;
							}
							continue label70;
						}
					}
					local23[local25] = local38;
					local25++;
				}
			}
			Static286.aClass306Array1 = new Class306[local25];
			Static601.method2819(local23, 0, Static286.aClass306Array1, 0, local25);
			@Pc(152) int[] local152 = new int[Static286.aClass306Array1.length];
			for (local98 = 0; local98 < Static286.aClass306Array1.length; local98++) {
				local104 = Static286.aClass306Array1[local98];
				local152[local98] = local104.anInt7912 * local104.anInt7911;
			}
			Static238.method3669(local152, Static286.aClass306Array1);
		}
		return Static286.aClass306Array1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!sp;)V")
	public static void method2955(@OriginalArg(1) Class41_Sub2_Sub1_Sub4 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt9529 == Static506.anInt8251 || arg0.anInt9489 == -1 || arg0.anInt9509 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class185 local33 = Static545.aClass240_2.method5680(arg0.anInt9489);
			if (local33.aBoolean362 || local33.anIntArray282[arg0.anInt9473] < arg0.anInt9478 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(61) int local61 = arg0.anInt9529 - arg0.anInt9506;
			@Pc(67) int local67 = Static506.anInt8251 - arg0.anInt9506;
			@Pc(78) int local78 = arg0.anInt9492 * 512 + arg0.method7858() * 256;
			@Pc(90) int local90 = arg0.anInt9453 * 512 + arg0.method7858() * 256;
			@Pc(102) int local102 = arg0.anInt9507 * 512 + arg0.method7858() * 256;
			@Pc(115) int local115 = arg0.anInt9516 * 512 + arg0.method7858() * 256;
			arg0.anInt9442 = (local90 * (local61 - local67) + local67 * local115) / local61;
			arg0.anInt9444 = (local78 * (local61 - local67) + local67 * local102) / local61;
		}
		arg0.anInt9533 = 0;
		if (arg0.anInt9524 == 0) {
			arg0.method7855(8192, false);
		}
		if (arg0.anInt9524 == 1) {
			arg0.method7855(12288, false);
		}
		if (arg0.anInt9524 == 2) {
			arg0.method7855(0, false);
		}
		if (arg0.anInt9524 == 3) {
			arg0.method7855(4096, false);
		}
	}
}
