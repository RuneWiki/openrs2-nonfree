import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!wi;")
	public static final Class261 aClass261_1 = new Class261();

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "F")
	public static float aFloat23 = 0.25F;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Lclient!st;")
	public static final Class227 aClass227_4 = new Class227();

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "[Lclient!qc;")
	public static final Class199[] aClass199Array1 = new Class199[4];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V")
	public static void method1213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static335.method4287(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(29) int local29 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(44) int local44 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (Static74.anInt1413 <= arg5 && Static149.anInt7384 >= arg5) {
			@Pc(54) int[] local54 = Static106.anIntArrayArray46[arg5];
			local62 = Static63.method971(Static271.anInt4271, arg2 - arg0, Static13.anInt263);
			local70 = Static63.method971(Static271.anInt4271, arg2 + arg0, Static13.anInt263);
			local79 = Static63.method971(Static271.anInt4271, arg2 - local15, Static13.anInt263);
			local87 = Static63.method971(Static271.anInt4271, arg2 + local15, Static13.anInt263);
			Static298.method3891(local79, local62, local54, arg4);
			Static298.method3891(local87, local79, local54, arg3);
			Static298.method3891(local70, local87, local54, arg4);
		}
		while (local24 > local10) {
			local44 += 2;
			local42 += 2;
			local40 += local44;
			local27 += local42;
			if (local40 >= 0 && local29 >= 1) {
				local29--;
				local40 -= local29 << 1;
				Static28.anIntArray32[local29] = local10;
			}
			local10++;
			@Pc(195) int local195;
			@Pc(204) int local204;
			@Pc(215) int[] local215;
			@Pc(149) int local149;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local149 = arg5 - local24;
				local62 = arg5 + local24;
				if (local62 >= Static74.anInt1413 && Static149.anInt7384 >= local149) {
					if (local15 > local24) {
						local70 = Static28.anIntArray32[local24];
						local79 = Static63.method971(Static271.anInt4271, arg2 + local10, Static13.anInt263);
						local87 = Static63.method971(Static271.anInt4271, arg2 - local10, Static13.anInt263);
						local195 = Static63.method971(Static271.anInt4271, arg2 + local70, Static13.anInt263);
						local204 = Static63.method971(Static271.anInt4271, arg2 - local70, Static13.anInt263);
						if (Static149.anInt7384 >= local62) {
							local215 = Static106.anIntArrayArray46[local62];
							Static298.method3891(local204, local87, local215, arg4);
							Static298.method3891(local195, local204, local215, arg3);
							Static298.method3891(local79, local195, local215, arg4);
						}
						if (local149 >= Static74.anInt1413) {
							local215 = Static106.anIntArrayArray46[local149];
							Static298.method3891(local204, local87, local215, arg4);
							Static298.method3891(local195, local204, local215, arg3);
							Static298.method3891(local79, local195, local215, arg4);
						}
					} else {
						local70 = Static63.method971(Static271.anInt4271, local10 + arg2, Static13.anInt263);
						local79 = Static63.method971(Static271.anInt4271, arg2 - local10, Static13.anInt263);
						if (local62 <= Static149.anInt7384) {
							Static298.method3891(local70, local79, Static106.anIntArrayArray46[local62], arg4);
						}
						if (local149 >= Static74.anInt1413) {
							Static298.method3891(local70, local79, Static106.anIntArrayArray46[local149], arg4);
						}
					}
				}
			}
			local149 = arg5 - local10;
			local62 = local10 + arg5;
			if (local62 >= Static74.anInt1413 && Static149.anInt7384 >= local149) {
				local70 = arg2 + local24;
				local79 = arg2 - local24;
				if (local70 >= Static271.anInt4271 && Static13.anInt263 >= local79) {
					local70 = Static63.method971(Static271.anInt4271, local70, Static13.anInt263);
					local79 = Static63.method971(Static271.anInt4271, local79, Static13.anInt263);
					if (local10 < local15) {
						local87 = local10 > local29 ? Static28.anIntArray32[local10] : local29;
						local195 = Static63.method971(Static271.anInt4271, arg2 + local87, Static13.anInt263);
						local204 = Static63.method971(Static271.anInt4271, arg2 - local87, Static13.anInt263);
						if (Static149.anInt7384 >= local62) {
							local215 = Static106.anIntArrayArray46[local62];
							Static298.method3891(local204, local79, local215, arg4);
							Static298.method3891(local195, local204, local215, arg3);
							Static298.method3891(local70, local195, local215, arg4);
						}
						if (Static74.anInt1413 <= local149) {
							local215 = Static106.anIntArrayArray46[local149];
							Static298.method3891(local204, local79, local215, arg4);
							Static298.method3891(local195, local204, local215, arg3);
							Static298.method3891(local70, local195, local215, arg4);
						}
					} else {
						if (local62 <= Static149.anInt7384) {
							Static298.method3891(local70, local79, Static106.anIntArrayArray46[local62], arg4);
						}
						if (local149 >= Static74.anInt1413) {
							Static298.method3891(local70, local79, Static106.anIntArrayArray46[local149], arg4);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1214(@OriginalArg(1) String arg0) {
		if (Static401.aClass76Array2 != null) {
			Static5.method94(Static315.aClass137_197);
			Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg0));
			Static75.aClass1_Sub11_Sub1_1.method4453(arg0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIC)I")
	public static int method1217(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}
}
