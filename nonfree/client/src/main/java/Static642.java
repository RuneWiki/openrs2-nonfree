import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "D")
	public static double aDouble25;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Lclient!pu;")
	public static Class50 aClass50_37;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public static int anInt10417;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_102 = new Class305(2, 2);

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean889 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method8657(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class65 arg2) {
		Static374.aClass65_12 = arg2;
		Static504.aClass254_7 = Static374.aClass65_12.method6955();
		Static65.aClass254_1 = Static374.aClass65_12.method6955();
		Static572.aClass254_9 = Static374.aClass65_12.method6955();
		Static516.anIntArray483 = null;
		Static420.anInterface15Array5 = null;
		Static414.anInt7335 = 100;
		Static5.anInt59 = 100;
		Static1.anInt9943 = 0;
		Static273.method4247(arg1, arg0);
		Static35.anInt561 = -1;
		Static273.anInt5013 = -1;
		Static184.anInt3598 = -1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!vba;IIIIIIIILclient!ha;)V")
	public static void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub3_Sub20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class65 arg10) {
		if (arg0 < arg3 && arg0 + arg4 > arg3 && arg6 - 13 < arg9 && arg9 < arg6 + 3 && arg2.aBoolean870) {
			arg8 = arg5;
		}
		@Pc(44) int[] local44 = null;
		if (Static408.method5981(arg2.anInt10178)) {
			local44 = Static110.aClass105_1.method2659((int) arg2.aLong289).anIntArray390;
		} else if (arg2.anInt10174 != -1) {
			local44 = Static110.aClass105_1.method2659(arg2.anInt10174).anIntArray390;
		} else if (Static335.method5134(arg2.anInt10178)) {
			@Pc(121) Class5_Sub25 local121 = (Class5_Sub25) Static56.aClass300_8.method7188((long) (int) arg2.aLong289);
			if (local121 != null) {
				@Pc(126) Class28_Sub1_Sub4_Sub2_Sub1 local126 = local121.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				@Pc(129) Class134 local129 = local126.aClass134_1;
				if (local129.anIntArray191 != null) {
					local129 = local129.method3276(Static161.aClass237_3);
				}
				if (local129 != null) {
					local44 = local129.anIntArray192;
				}
			}
		} else if (Static591.method8116(arg2.anInt10178)) {
			@Pc(90) Class164 local90;
			if (arg2.anInt10178 == 1009) {
				local90 = Static568.aClass315_5.method7511((int) arg2.aLong289);
			} else {
				local90 = Static568.aClass315_5.method7511((int) (arg2.aLong289 >>> 32 & 0x7FFFFFFFL));
			}
			if (local90.anIntArray247 != null) {
				local90 = local90.method3908(Static161.aClass237_3);
			}
			if (local90 != null) {
				local44 = local90.anIntArray244;
			}
		}
		@Pc(154) String local154 = Static161.method4598(arg2);
		if (local44 != null) {
			local154 = local154 + Static496.method7110(local44);
		}
		Static231.aClass73_8.method5784(local154, arg8, Static364.aClass50Array8, arg0 + 3, arg6, Static5.anIntArray4);
		if (arg2.aBoolean869) {
			aClass50_37.method5996(Static299.aClass247_11.method5759(local154) + arg0 + 5, arg6 - 12);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ha;IIILclient!fca;)V")
	public static void method8660(@OriginalArg(0) Class65 arg0, @OriginalArg(4) Class114 arg1) {
		Static38.aClass114_4.method2808();
		if (Static208.aBoolean319) {
			return;
		}
		for (@Pc(34) Class5_Sub36 local34 = (Class5_Sub36) arg1.method2805(); local34 != null; local34 = (Class5_Sub36) arg1.method2814()) {
			@Pc(41) Class103 local41 = Static330.aClass93_3.method2280(local34.anInt5984);
			if (Static342.method5200(local41)) {
				@Pc(53) boolean local53 = Static665.method7141(local34, local41, arg0);
				if (local53) {
					Static471.method8948(local34, arg0, local41);
				}
			}
		}
	}
}
