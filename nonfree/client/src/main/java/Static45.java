import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt7314 = 0;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[Lclient!pn;")
	public static final Class192[] aClass192Array4 = new Class192[4];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method5774(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static309.aClass11ArrayArrayArray2 = Static36.aClass11ArrayArrayArray1;
			Static332.aClass154Array3 = Static173.aClass154Array1;
		} else {
			Static309.aClass11ArrayArrayArray2 = Static345.aClass11ArrayArrayArray3;
			Static332.aClass154Array3 = Static256.aClass154Array2;
		}
		Static285.anInt5004 = Static309.aClass11ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public static void method5775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass24_Sub5_1 != null) {
			local7.aClass24_Sub5_1 = null;
		}
		if (local7.aClass24_Sub5_2 != null) {
			local7.aClass24_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!ms;I)V")
	public static void method5778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class6 local9 = arg2.method4923();
		@Pc(19) int local19 = arg2.anInt6243 - arg2.aClass145_7.anInt4147 & 0x3FFF;
		if (arg0 == -1) {
			if (local19 != 0 || arg2.anInt6269 > 25) {
				arg2.aBoolean403 = false;
				if (arg3 < 0 && local9.anInt59 != -1) {
					arg2.anInt6238 = local9.anInt59;
				} else if (arg3 <= 0 || local9.anInt50 == -1) {
					arg2.anInt6238 = local9.anInt42;
				} else {
					arg2.anInt6238 = local9.anInt50;
				}
			} else if (!arg2.aBoolean403 || !local9.method36(arg2.anInt6238)) {
				arg2.anInt6238 = local9.method37();
				arg2.aBoolean403 = arg2.anInt6238 != -1;
			}
		} else if (arg2.anInt6241 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(216) int local216 = Static324.anIntArray546[arg1] - arg2.aClass145_7.anInt4147 & 0x3FFF;
			arg2.aBoolean403 = false;
			if (arg0 == 2 && local9.anInt77 != -1) {
				if (local216 > 2048 && local216 <= 6144 && local9.anInt41 != -1) {
					arg2.anInt6238 = local9.anInt41;
				} else if (local216 >= 10240 && local216 < 14336 && local9.anInt70 != -1) {
					arg2.anInt6238 = local9.anInt70;
				} else if (local216 <= 6144 || local216 >= 10240 || local9.anInt65 == -1) {
					arg2.anInt6238 = local9.anInt77;
				} else {
					arg2.anInt6238 = local9.anInt65;
				}
			} else if (arg0 == 0 && local9.anInt74 != -1) {
				if (local216 > 2048 && local216 <= 6144 && local9.anInt58 != -1) {
					arg2.anInt6238 = local9.anInt58;
				} else if (local216 >= 10240 && local216 < 14336 && local9.anInt38 != -1) {
					arg2.anInt6238 = local9.anInt38;
				} else if (local216 <= 6144 || local216 >= 10240 || local9.anInt54 == -1) {
					arg2.anInt6238 = local9.anInt74;
				} else {
					arg2.anInt6238 = local9.anInt54;
				}
			} else if (local216 > 2048 && local216 <= 6144 && local9.anInt76 != -1) {
				arg2.anInt6238 = local9.anInt76;
			} else if (local216 >= 10240 && local216 < 14336 && local9.anInt75 != -1) {
				arg2.anInt6238 = local9.anInt75;
			} else if (local216 <= 6144 || local216 >= 10240 || local9.anInt53 == -1) {
				arg2.anInt6238 = local9.anInt42;
			} else {
				arg2.anInt6238 = local9.anInt53;
			}
		} else if (local19 == 0 && arg2.anInt6269 <= 25) {
			arg2.aBoolean403 = false;
			if (arg0 == 2 && local9.anInt77 != -1) {
				arg2.anInt6238 = local9.anInt77;
			} else if (arg0 == 0 && local9.anInt74 != -1) {
				arg2.anInt6238 = local9.anInt74;
			} else {
				arg2.anInt6238 = local9.anInt42;
			}
		} else {
			if (arg0 == 2 && local9.anInt77 != -1) {
				if (arg3 < 0 && local9.anInt67 != -1) {
					arg2.anInt6238 = local9.anInt67;
				} else if (arg3 <= 0 || local9.anInt57 == -1) {
					arg2.anInt6238 = local9.anInt77;
				} else {
					arg2.anInt6238 = local9.anInt57;
				}
			} else if (arg0 == 0 && local9.anInt74 != -1) {
				if (arg3 < 0 && local9.anInt47 != -1) {
					arg2.anInt6238 = local9.anInt47;
				} else if (arg3 <= 0 || local9.anInt69 == -1) {
					arg2.anInt6238 = local9.anInt74;
				} else {
					arg2.anInt6238 = local9.anInt69;
				}
			} else if (arg3 < 0 && local9.anInt36 != -1) {
				arg2.anInt6238 = local9.anInt36;
			} else if (arg3 <= 0 || local9.anInt46 == -1) {
				arg2.anInt6238 = local9.anInt42;
			} else {
				arg2.anInt6238 = local9.anInt46;
			}
			arg2.aBoolean403 = false;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	public static void method5779(@OriginalArg(0) int arg0) {
		if (!Static361.aClass85_Sub1_1.aBoolean176) {
			arg0 = -1;
		}
		if (arg0 == Static428.anInt7198) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class252 local29 = Static400.aClass165_1.method3683(arg0);
			@Pc(33) Class66 local33 = local29.method5450();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static171.aClass159_1.method3507(local33.method1658(), local33.method1656(), Static412.aCanvas7, new Point(local29.anInt6940, local29.anInt6938), local33.method1667());
				Static428.anInt7198 = arg0;
			}
		}
		if (arg0 == -1 && Static428.anInt7198 != -1) {
			Static171.aClass159_1.method3507(-1, -1, Static412.aCanvas7, new Point(), null);
			Static428.anInt7198 = -1;
		}
	}
}
