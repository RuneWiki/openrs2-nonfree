import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
	public static int anInt3328 = -2;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!r;Lclient!jn;I)V")
	public static void method2974(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class176 arg1) {
		@Pc(10) Class261[] local10 = Static598.method6315(arg1, Static501.anInt6753);
		Static45.aClass78Array4 = new Class78[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static45.aClass78Array4[local16] = arg0.method5018(local10[local16], true);
		}
		local10 = Static598.method6315(arg1, Static219.anInt4026);
		Static31.aClass78Array2 = new Class78[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static31.aClass78Array2[local47] = arg0.method5018(local10[local47], true);
		}
		local10 = Static598.method6315(arg1, Static347.anInt6680);
		Static163.aClass78Array9 = new Class78[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static163.aClass78Array9[local74] = arg0.method5018(local10[local74], true);
		}
		local10 = Static598.method6315(arg1, Static459.anInt8549);
		Static410.aClass78Array17 = new Class78[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static410.aClass78Array17[local101] = arg0.method5018(local10[local101], true);
		}
		local10 = Static598.method6315(arg1, Static445.anInt8285);
		client.lb = new Class78[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			client.lb[local128] = arg0.method5018(local10[local128], true);
		}
		local10 = Static598.method6315(arg1, Static306.anInt6141);
		Static273.aClass78Array16 = new Class78[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static273.aClass78Array16[local155] = arg0.method5018(local10[local155], true);
		}
		local10 = Static598.method6315(arg1, Static207.anInt3873);
		Static32.aClass78Array3 = new Class78[local10.length];
		for (@Pc(182) int local182 = 0; local182 < local10.length; local182++) {
			Static32.aClass78Array3[local182] = arg0.method5018(local10[local182], true);
		}
		local10 = Static598.method6315(arg1, Static16.anInt268);
		Static31.aClass78Array1 = new Class78[local10.length];
		for (@Pc(213) int local213 = 0; local213 < local10.length; local213++) {
			Static31.aClass78Array1[local213] = arg0.method5018(local10[local213], true);
		}
		local10 = Static598.method6315(arg1, Static357.anInt6964);
		Static156.aClass78Array7 = new Class78[local10.length];
		for (@Pc(245) int local245 = 0; local245 < local10.length; local245++) {
			Static156.aClass78Array7[local245] = arg0.method5018(local10[local245], true);
		}
		local10 = Static598.method6315(arg1, Static307.anInt6167);
		Static102.aClass78Array14 = new Class78[local10.length];
		for (@Pc(276) int local276 = 0; local276 < local10.length; local276++) {
			Static102.aClass78Array14[local276] = arg0.method5018(local10[local276], true);
		}
		local10 = Static598.method6315(arg1, Static346.anInt6666);
		Static565.aClass78Array19 = new Class78[local10.length];
		for (@Pc(303) int local303 = 0; local303 < local10.length; local303++) {
			Static565.aClass78Array19[local303] = arg0.method5018(local10[local303], true);
		}
		local10 = Static598.method6315(arg1, Static492.anInt8941);
		Static188.aClass78Array10 = new Class78[local10.length];
		for (@Pc(330) int local330 = 0; local330 < local10.length; local330++) {
			Static188.aClass78Array10[local330] = arg0.method5018(local10[local330], true);
		}
		Static299.aClass78_11 = arg0.method5018(Static598.method6312(arg1, Static162.anInt3312, 0), true);
		Static32.aClass78_1 = arg0.method5018(Static598.method6312(arg1, Static512.anInt9189, 0), true);
		local10 = Static598.method6315(arg1, Static499.anInt3410);
		Static353.aClass78Array15 = new Class78[local10.length];
		for (@Pc(373) int local373 = 0; local373 < local10.length; local373++) {
			Static353.aClass78Array15[local373] = arg0.method5018(local10[local373], true);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!n;Z)Lclient!n;")
	public static Class225 method2975(@OriginalArg(0) Class225 arg0) {
		@Pc(11) Class225 local11 = Static69.method1182(arg0);
		if (local11 == null) {
			local11 = arg0.aClass225_31;
		}
		return local11;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([Lclient!ub;II)V")
	public static void method2976(@OriginalArg(0) Class1_Sub4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class1_Sub4 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9938;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9938 > local27 + (local29 & 0x1)) {
				@Pc(44) Class1_Sub4 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method2976(arg0, arg1, local10 - 1);
		method2976(arg0, local10 + 1, arg2);
	}
}
