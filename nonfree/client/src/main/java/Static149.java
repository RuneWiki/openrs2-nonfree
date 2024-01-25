import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)Lclient!jg;")
	public static Class11_Sub1_Sub3 method1878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class216 local11 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class11_Sub1_Sub3 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class259 local27 = local11.aClass259_1; local27 != null; local27 = local27.aClass259_4) {
			@Pc(31) Class11_Sub1 local31 = local27.aClass11_Sub1_2;
			if (local31 instanceof Class11_Sub1_Sub3) {
				@Pc(37) Class11_Sub1_Sub3 local37 = (Class11_Sub1_Sub3) local31;
				@Pc(47) int local47 = (local37.method2635() - 1) * 64 + 60;
				@Pc(54) int local54 = local37.anInt6428 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt6430 - local47 >> 7;
				@Pc(69) int local69 = local37.anInt6428 + local47 >> 7;
				@Pc(76) int local76 = local37.anInt6430 + local47 >> 7;
				if (local54 <= arg1 && arg2 >= local62 && arg1 <= local69 && local76 >= arg2) {
					@Pc(109) int local109 = (local76 + 1 - arg2) * (-arg1 + 1 + local69);
					if (local109 > local24) {
						local24 = local109;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!za;Lclient!d;I)I")
	public static int method1880(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class49 arg1) {
		if (arg1.anInt1003 != -1) {
			return arg1.anInt1003;
		}
		if (arg1.anInt1007 != -1) {
			@Pc(29) Class25 local29 = arg0.anInterface4_10.method5090(arg0.method5689() ? arg1.anInt1007 : arg1.anInt999);
			if (!local29.aBoolean60) {
				return local29.aShort16;
			}
		}
		return arg1.anInt1001;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class160 local16 = Static369.aClass160ArrayArray1[arg1][arg0];
		if (local16 != null) {
			Static205.anInt3788 = local16.anInt4574;
			Static128.anInt1965 = local16.anInt4572;
			Static217.anInt1119 = local16.anInt4573;
		}
		Static380.method4903();
	}
}
