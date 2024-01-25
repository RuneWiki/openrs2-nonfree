import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!o;")
	public static Class80 aClass80_17;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_119 = new Class217(0, -1);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZBLclient!ig;)V")
	public static void method4314(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class24_Sub3_Sub2_Sub1 arg1) {
		if (Static207.anInt4055 >= 400) {
			return;
		}
		@Pc(12) Class222 local12 = arg1.aClass222_1;
		if (local12.anIntArray613 != null) {
			local12 = local12.method4938(Static329.aClass201_9);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean415) {
			return;
		}
		@Pc(35) String local35 = local12.aString59;
		if (local12.anInt6344 != 0) {
			@Pc(51) String local51 = Static102.aClass147_3 == Static424.aClass147_4 ? Static278.aClass182_212.method4155(Static191.anInt3842) : Static445.aClass182_256.method4155(Static191.anInt3842);
			local35 = local35 + Static81.method1537(local12.anInt6344, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314) + " (" + local51 + local12.anInt6344 + ")";
		}
		if (!Static401.aBoolean489) {
			if (!arg0) {
				@Pc(136) String[] local136 = local12.aStringArray43;
				if (Static301.aBoolean353) {
					local136 = Static425.method5653(local136);
				}
				@Pc(146) int local146;
				if (local136 != null) {
					for (local146 = 4; local146 >= 0; local146--) {
						if (local136[local146] != null && (local12.aByte79 == 0 || !local136[local146].equalsIgnoreCase(Static440.aClass182_253.method4155(Static191.anInt3842)))) {
							@Pc(169) byte local169 = 0;
							@Pc(171) int local171 = Static244.anInt4706;
							if (local146 == 0) {
								local169 = 51;
							}
							if (local146 == 1) {
								local169 = 9;
							}
							if (local146 == 2) {
								local169 = 6;
							}
							if (local146 == 3) {
								local169 = 22;
							}
							if (local12.anInt6360 == local146) {
								local171 = local12.anInt6340;
							}
							if (local146 == 4) {
								local169 = 20;
							}
							if (local146 == local12.anInt6367) {
								local171 = local12.anInt6343;
							}
							Static260.method3744(local136[local146], local169, (long) arg1.anInt6228, 0, false, local136[local146].equalsIgnoreCase(Static440.aClass182_253.method4155(Static191.anInt3842)) ? local12.anInt6330 : local171, "<col=ffff00>" + local35, true, -1, 0);
						}
					}
				}
				if (local12.aByte79 == 1 && local136 != null) {
					for (local146 = 4; local146 >= 0; local146--) {
						if (local136[local146] != null && local136[local146].equalsIgnoreCase(Static440.aClass182_253.method4155(Static191.anInt3842))) {
							@Pc(290) short local290 = 0;
							if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314 < local12.anInt6344) {
								local290 = 2000;
							}
							@Pc(303) short local303 = 0;
							if (local146 == 0) {
								local303 = 51;
							}
							if (local146 == 1) {
								local303 = 9;
							}
							if (local146 == 2) {
								local303 = 6;
							}
							if (local146 == 3) {
								local303 = 22;
							}
							if (local146 == 4) {
								local303 = 20;
							}
							if (local303 != 0) {
								local303 += local290;
							}
							Static260.method3744(local136[local146], local303, (long) arg1.anInt6228, 0, false, local12.anInt6330, "<col=ffff00>" + local35, true, -1, 0);
						}
					}
				}
			}
			Static260.method3744(Static67.aClass182_55.method4155(Static191.anInt3842), 1012, (long) arg1.anInt6228, 0, arg0, Static405.anInt6817, "<col=ffff00>" + local35, true, -1, 0);
		} else if (!arg0) {
			@Pc(88) Class155 local88 = Static218.anInt4149 == -1 ? null : Static376.aClass204_1.method4526(Static218.anInt4149);
			if ((Static46.anInt880 & 0x2) != 0) {
				if (local88 == null || local12.method4941(local88.anInt4302, Static218.anInt4149) != local88.anInt4302) {
					Static260.method3744(Static312.aString52, 11, (long) arg1.anInt6228, 0, false, Static24.anInt394, Static70.aString10 + " -> <col=ffff00>" + local35, true, -1, 0);
				}
				return;
			}
		}
	}
}
