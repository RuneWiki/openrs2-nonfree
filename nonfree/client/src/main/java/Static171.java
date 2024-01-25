import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gca", name = "fb", descriptor = "I")
	public static int anInt3808;

	@OriginalMember(owner = "client!gca", name = "T", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_49 = new Class274(50, 3);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!ha;Lclient!fd;ILclient!gba;IBILclient!nd;)V")
	public static void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class125 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub36 arg7) {
		@Pc(12) int local12 = arg5 - arg6 / 2 - 5;
		@Pc(16) int local16 = arg3 + 2;
		if (arg2.anInt3346 != 0) {
			arg1.method7898(arg3 + arg4.method3114() * arg0 + 1 - local16, arg6 + 10, arg2.anInt3346, local16, local12);
		}
		if (arg2.anInt3321 != 0) {
			arg1.method7933(arg2.anInt3321, local16, arg4.method3114() * arg0 + arg3 + 1 - local16, arg6 + 10, local12);
		}
		@Pc(73) int local73 = arg2.anInt3347;
		if (arg7.aBoolean488 && arg2.anInt3327 != -1) {
			local73 = arg2.anInt3327;
		}
		for (@Pc(85) int local85 = 0; local85 < arg0; local85++) {
			@Pc(95) String local95 = Static264.aStringArray13[local85];
			if (arg0 - 1 > local85) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg4.method3113(arg1, local95, arg5, arg3, local73);
			arg3 += arg4.method3114();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZBI)V")
	public static void method3176(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(15) Class2_Sub50 local15 = Static595.method8194(Static610.aClass310_2, Static556.aClass269_89);
			local15.aClass2_Sub34_Sub2_2.method6854(arg1);
			Static311.method4754(local15);
		} else {
			Static639.method8548(Static14.aClass188_1, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "(B)V")
	public static void method3178() {
		if (!Static301.aBoolean423) {
			return;
		}
		@Pc(15) Class78 local15 = Static496.method7080(Static342.anInt6258, Static590.anInt9763);
		if (local15 != null && local15.anObjectArray31 != null) {
			@Pc(24) Class2_Sub42 local24 = new Class2_Sub42();
			local24.aClass78_9 = local15;
			local24.anObjectArray33 = local15.anObjectArray31;
			Static639.method8539(local24);
		}
		Static301.aBoolean423 = false;
		Static352.anInt6475 = -1;
		Static385.anInt6934 = -1;
		if (local15 != null) {
			Static397.method6022(local15);
		}
	}
}
