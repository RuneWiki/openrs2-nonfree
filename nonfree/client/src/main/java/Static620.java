import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
	public static int anInt10145;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_218 = new Class200(41, -1);

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_18 = new Class117(4, 1, 1, 1);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!nd;)I")
	public static int method8618(@OriginalArg(1) Class238 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5568(Static208.anInt4026)) {
			local5++;
		}
		if (arg0.method5568(Static640.anInt10331)) {
			local5++;
		}
		if (arg0.method5568(Static238.anInt8043)) {
			local5++;
		}
		if (arg0.method5568(Static162.anInt3285)) {
			local5++;
		}
		if (arg0.method5568(Static457.anInt8802)) {
			local5++;
		}
		if (arg0.method5568(Static248.anInt4779)) {
			local5++;
		}
		if (arg0.method5568(Static649.anInt10496)) {
			local5++;
		}
		if (arg0.method5568(Static411.anInt6923)) {
			local5++;
		}
		if (arg0.method5568(Static547.anInt8826)) {
			local5++;
		}
		if (arg0.method5568(Static352.anInt6101)) {
			local5++;
		}
		if (arg0.method5568(Static54.anInt1392)) {
			local5++;
		}
		if (arg0.method5568(Static602.anInt9969)) {
			local5++;
		}
		if (arg0.method5568(Static228.anInt4212)) {
			local5++;
		}
		if (arg0.method5568(Static550.anInt8852)) {
			local5++;
		}
		if (arg0.method5568(Static318.anInt5619)) {
			local5++;
		}
		if (arg0.method5568(Static269.anInt5045)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ria;I)V")
	public static void method8619(@OriginalArg(0) Class303 arg0) {
		@Pc(7) Class303 local7 = Static436.method6287(arg0);
		@Pc(20) int local20;
		@Pc(17) int local17;
		if (local7 == null) {
			local17 = Static71.anInt1925;
			local20 = Class16_Sub1_Sub5_Sub1.lb;
		} else {
			local17 = local7.anInt7971;
			local20 = local7.anInt7914;
		}
		Static409.method6033(arg0, local17, false, local20);
		Static124.method2239(local17, arg0, local20);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)I")
	public static int method8620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(14) int local14 = local7 >= 8 ? arg1 : arg0;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg3) : arg1;
		return ((local7 & 0x2) == 0 ? local33 : -local33) + ((local7 & 0x1) == 0 ? local14 : -local14);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;ILclient!nd;)Lclient!ha;")
	public static Class13 method8621(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class238 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg1 != null) {
			@Pc(12) Dimension local12 = arg1.getSize();
			local7 = local12.height;
			local5 = local12.width;
		}
		return Static199.method8159(arg2, arg4, arg1, arg3, local5, local7, arg0);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZIILclient!vl;I)V")
	public static void method8623(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class16_Sub1_Sub1_Sub3 arg2, @OriginalArg(6) int arg3) {
		Static144.method2588(arg2.anInt8034, 0, arg1, arg3, arg2.anInt8037, arg2.aByte109, arg0);
	}
}
