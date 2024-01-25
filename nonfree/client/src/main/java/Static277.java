import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array11;

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
	public static int anInt5091 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public static void method4433() {
		if (Static563.anIntArray661 != null) {
			return;
		}
		Static563.anIntArray661 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
			@Pc(40) float local40 = ((float) (local27 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(49) float local49 = (float) (local27 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(51) int local51 = 0; local51 < 128; local51++) {
				@Pc(58) float local58 = (float) local51 / 128.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(68) float local68 = local40 / 60.0F;
				@Pc(71) int local71 = (int) local68;
				@Pc(75) int local75 = local71 % 6;
				@Pc(81) float local81 = (float) -local71 + local68;
				@Pc(87) float local87 = local58 * (1.0F - local49);
				@Pc(96) float local96 = (1.0F - local49 * local81) * local58;
				@Pc(107) float local107 = (1.0F - local49 * (1.0F - local81)) * local58;
				if (local75 == 0) {
					local64 = local87;
					local62 = local107;
					local60 = local58;
				} else if (local75 == 1) {
					local62 = local58;
					local60 = local96;
					local64 = local87;
				} else if (local75 == 2) {
					local62 = local58;
					local60 = local87;
					local64 = local107;
				} else if (local75 == 3) {
					local62 = local96;
					local60 = local87;
					local64 = local58;
				} else if (local75 == 4) {
					local64 = local58;
					local60 = local107;
					local62 = local87;
				} else if (local75 == 5) {
					local64 = local96;
					local60 = local58;
					local62 = local87;
				}
				local60 = (float) Math.pow((double) local60, local23);
				local62 = (float) Math.pow((double) local62, local23);
				local64 = (float) Math.pow((double) local64, local23);
				@Pc(197) int local197 = (int) (local60 * 256.0F);
				@Pc(202) int local202 = (int) (local62 * 256.0F);
				@Pc(207) int local207 = (int) (local64 * 256.0F);
				@Pc(219) int local219 = local207 + (local202 << 8) + (local197 << 16) - 16777216;
				Static563.anIntArray661[local25++] = local219;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method4435(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static590.anInt9377; local11++) {
			if (arg0.equalsIgnoreCase(Static595.aStringArray49[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIBII)V")
	public static void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg1 < 0 || arg3 >= Static400.anInt6818 - 1 || Static271.anInt5050 - 1 <= arg1) {
			return;
		}
		if (Static554.aClass63ArrayArrayArray4 == null) {
			return;
		}
		@Pc(42) Interface22 local42;
		if (arg0 == 0) {
			local42 = (Interface22) Static247.method4031(arg4, arg3, arg1);
			@Pc(48) Interface22 local48 = (Interface22) Static296.method4709(arg4, arg3, arg1);
			if (local42 != null && arg5 != 2) {
				if (local42 instanceof Class9_Sub1_Sub4_Sub1) {
					((Class9_Sub1_Sub4_Sub1) local42).aClass335_3.method7046(arg2);
				} else {
					Static20.method435(arg0, arg2, arg3, arg6, local42.method7088(), arg1, arg5, arg4);
				}
			}
			if (local48 != null) {
				if (local48 instanceof Class9_Sub1_Sub4_Sub1) {
					((Class9_Sub1_Sub4_Sub1) local48).aClass335_3.method7046(arg2);
					return;
				}
				Static20.method435(arg0, arg2, arg3, arg6, local48.method7088(), arg1, arg5, arg4);
				return;
			}
			return;
		}
		if (arg0 != 1) {
			if (arg0 == 2) {
				local42 = (Interface22) Static417.method5998(arg4, arg3, arg1, qu.class);
				if (local42 != null) {
					if (arg5 == 11) {
						arg5 = 10;
					}
					if (local42 instanceof Class9_Sub1_Sub1_Sub5) {
						((Class9_Sub1_Sub1_Sub5) local42).aClass335_4.method7046(arg2);
						return;
					}
					Static20.method435(arg0, arg2, arg3, arg6, local42.method7088(), arg1, arg5, arg4);
					return;
				}
			} else if (arg0 == 3) {
				local42 = (Interface22) Static168.method7472(arg4, arg3, arg1);
				if (local42 == null) {
					return;
				}
				if (!(local42 instanceof Class9_Sub1_Sub3_Sub1)) {
					Static20.method435(arg0, arg2, arg3, arg6, local42.method7088(), arg1, arg5, arg4);
					return;
				}
				((Class9_Sub1_Sub3_Sub1) local42).aClass335_2.method7046(arg2);
			} else {
				return;
			}
			return;
		}
		local42 = (Interface22) Static339.method5173(arg4, arg3, arg1);
		if (local42 == null) {
			return;
		}
		if (local42 instanceof Class9_Sub1_Sub2_Sub1) {
			((Class9_Sub1_Sub2_Sub1) local42).aClass335_1.method7046(arg2);
			return;
		}
		@Pc(209) int local209 = local42.method7088();
		if (arg5 != 4 && arg5 != 5) {
			if (arg5 != 6) {
				if (arg5 == 7) {
					Static20.method435(arg0, arg2, arg3, (arg6 + 2 & 0x3) + 4, local209, arg1, 4, arg4);
				} else if (arg5 == 8) {
					Static20.method435(arg0, arg2, arg3, arg6 + 4, local209, arg1, 4, arg4);
					Static20.method435(arg0, arg2, arg3, (arg6 + 2 & 0x3) + 4, local209, arg1, 4, arg4);
					return;
				}
				return;
			}
			Static20.method435(arg0, arg2, arg3, arg6 + 4, local209, arg1, 4, arg4);
			return;
		}
		Static20.method435(arg0, arg2, arg3, arg6, local209, arg1, 4, arg4);
		return;
	}
}
