import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
	public static int[] anIntArray653;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "Lclient!sga;")
	public static Class2_Sub13_Sub4 aClass2_Sub13_Sub4_2;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_124 = new Class179(41, 3);

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_330 = new Class288(60, 1);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)V")
	public static void method8001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == Static631.anInt9607 && Static322.anInt5121 == arg0 && arg2 == Static257.anInt4066) {
			return;
		}
		Static322.anInt5121 = arg0;
		Static257.anInt4066 = arg2;
		Static116.aBoolean155 = true;
		Static631.anInt9607 = arg1;
		@Pc(35) double local35 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(45) double local45 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(48) double local48 = Math.cos(local45);
		@Pc(51) double local51 = Math.sin(local45);
		@Pc(54) double local54 = Math.cos(local35);
		@Pc(57) double local57 = Math.sin(local35);
		Static190.aDouble20 = 0.0D;
		Static645.aDouble52 = local48;
		Static384.aDouble33 = -local51 * local54;
		Static388.aDouble36 = local48 * local54;
		Static643.aDouble54 = local54;
		Static416.aDouble38 = local57 * -local48;
		Static225.aDouble22 = local51;
		Static17.aDouble5 = local51 * local57;
		Static191.aDouble21 = local57;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(IIII)I")
	public static int method8003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static619.anInt9953 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(18) int local18 = arg1 - Static193.anInt1548;
		@Pc(23) int local23 = arg0 - Static193.anInt1551;
		for (@Pc(33) Class2_Sub14 local33 = (Class2_Sub14) Static193.aClass109_9.method2325(); local33 != null; local33 = (Class2_Sub14) Static193.aClass109_9.method2318()) {
			if (arg2 == local33.anInt3128) {
				@Pc(46) int local46 = local33.anInt3133;
				@Pc(49) int local49 = local33.anInt3126;
				@Pc(60) int local60 = Static193.anInt1551 + local49 | local46 - -Static193.anInt1548 << 14;
				@Pc(79) int local79 = (local23 - local49) * (-local49 + local23) + (local18 - local46) * (local18 - local46);
				if (local12 < 0 || local79 < local14) {
					local12 = local60;
					local14 = local79;
				}
			}
		}
		return local12;
	}
}
