import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public static int anInt9462;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public static int anInt9445 = 0;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_91 = new Class269(12, 4);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt9449 = 0;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!fs;")
	public static final Class117 aClass117_9 = new Class117(16);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7901(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static571.anInt9395;
		@Pc(7) int[] local7 = Static131.anIntArray213;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < local5; local11++) {
			@Pc(18) Class11_Sub1_Sub1_Sub2_Sub1 local18 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local7[local11]];
			if (local18 != null && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 != local18 && local18.aString4 != null && local18.aString4.equalsIgnoreCase(arg0)) {
				local9 = true;
				@Pc(58) Class2_Sub50 local58;
				if (arg1 == 1) {
					local58 = Static595.method8194(Static610.aClass310_2, Static49.aClass269_12);
					local58.aClass2_Sub34_Sub2_2.method6916(local7[local11]);
					local58.aClass2_Sub34_Sub2_2.method6912(0);
					Static311.method4754(local58);
				} else if (arg1 == 4) {
					local58 = Static595.method8194(Static610.aClass310_2, Static174.aClass269_38);
					local58.aClass2_Sub34_Sub2_2.method6912(0);
					local58.aClass2_Sub34_Sub2_2.method6854(local7[local11]);
					Static311.method4754(local58);
				} else if (arg1 == 5) {
					local58 = Static595.method8194(Static610.aClass310_2, Static64.aClass269_14);
					local58.aClass2_Sub34_Sub2_2.method6857(local7[local11]);
					local58.aClass2_Sub34_Sub2_2.method6894(0);
					Static311.method4754(local58);
				} else if (arg1 == 6) {
					local58 = Static595.method8194(Static610.aClass310_2, Static217.aClass269_45);
					local58.aClass2_Sub34_Sub2_2.method6860(0);
					local58.aClass2_Sub34_Sub2_2.method6854(local7[local11]);
					Static311.method4754(local58);
				} else if (arg1 == 7) {
					local58 = Static595.method8194(Static610.aClass310_2, Static43.aClass269_9);
					local58.aClass2_Sub34_Sub2_2.method6912(0);
					local58.aClass2_Sub34_Sub2_2.method6857(local7[local11]);
					Static311.method4754(local58);
				}
				break;
			}
		}
		if (!local9) {
			Static74.method1384(Static628.aClass369_21.method8475(Static377.anInt6756) + arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method7903() {
		Static196.method3475();
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public static void method7909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg1 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		Static259.method4236(arg3 - arg4, arg3 + arg4, arg2, Static618.anIntArrayArray101[arg0]);
		@Pc(96) int local96 = (arg1 - 1) * local51;
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local47 += local77;
					local39 += local63;
					local77 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local39 += local63;
				local47 += local77;
				local77 += local55;
				local7++;
				local63 += local55;
			}
			local39 += -local96;
			local47 += -local71;
			local9--;
			local96 -= local51;
			local71 -= local51;
			@Pc(170) int local170 = arg0 - local9;
			@Pc(174) int local174 = arg0 + local9;
			@Pc(178) int local178 = arg3 + local7;
			@Pc(183) int local183 = arg3 - local7;
			Static259.method4236(local183, local178, arg2, Static618.anIntArrayArray101[local170]);
			Static259.method4236(local183, local178, arg2, Static618.anIntArrayArray101[local174]);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!d;IILjava/awt/Canvas;Lclient!eq;II)Lclient!ha;")
	public static synchronized Class87 method7941(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class97 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 0) {
			return Static618.method8412(arg3, arg5, arg0, arg1);
		} else if (arg2 == 2) {
			return Static275.method4419(arg5, arg1, arg3, arg0);
		} else if (arg2 == 1) {
			return Static372.method5613(arg0, arg6, arg3);
		} else if (arg2 == 5) {
			return Static506.method7172(arg6, arg4, arg0, arg3);
		} else if (arg2 == 3) {
			return Static645.method2917(arg3, arg4, arg0, arg6);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!ud;)V")
	public static void method7971(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(19) byte[] local19 = new byte[24];
		if (Static215.aClass31_4 != null) {
			@Pc(31) int local31;
			try {
				Static215.aClass31_4.method755(0L);
				Static215.aClass31_4.method757(local19);
				for (local31 = 0; local31 < 24 && local19[local31] == 0; local31++) {
				}
				if (local31 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(54) Exception local54) {
				for (local31 = 0; local31 < 24; local31++) {
					local19[local31] = -1;
				}
			}
		}
		arg0.method6914(0, local19, 24);
	}
}
