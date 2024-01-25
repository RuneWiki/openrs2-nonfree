import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!aj;")
	public static Class15 aClass15_135;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	public static int anInt8768;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_177 = new Class180(118, -2);

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
	public static int[] anIntArray747 = null;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!wea;Z[[[BIB)Z")
	public static boolean method7681(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static163.aBoolean249) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10729 >> Static391.anInt10262;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10731 >> Static391.anInt10262;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class28_Sub1_Sub1) {
			local10 = ((Class28_Sub1_Sub1) arg0).aShort124;
			local17 = ((Class28_Sub1_Sub1) arg0).aShort122;
			local8 = ((Class28_Sub1_Sub1) arg0).aShort125;
			local15 = ((Class28_Sub1_Sub1) arg0).aShort123;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte173 < Static183.anInt3720 && local38 >= Static431.anInt6884 && local38 < Static518.anInt8353 && local41 >= Static445.anInt7311 && local41 < Static581.anInt8281) {
					if ((arg2 == null || arg0.aByte174 < arg3 || arg2[arg0.aByte174][local38][local41] != arg4) && arg0.method9280() && !arg0.method9295(Static671.aClass13_21)) {
						return false;
					}
					if (!arg1 && local38 >= Static220.anInt4183 - 16 && local38 <= Static220.anInt4183 + 16 && local41 >= Static547.anInt8968 - 16 && local41 <= Static547.anInt8968 + 16) {
						if (Static140.aBoolean220) {
							Static324.aClass148Array1[Static439.anInt6969++].method4032(arg0);
							Static439.anInt6969 %= Static406.anInt6453;
						} else {
							arg0.method9288(Static671.aClass13_21);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)Lclient!kf;")
	public static Class3_Sub34 method7682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub34 local5 = null;
		if (arg1 == 0) {
			local5 = Static172.method3123(Static163.aClass375_1, Static485.aClass218_122);
		}
		if (arg1 == 1) {
			local5 = Static172.method3123(Static163.aClass375_1, Static484.aClass218_121);
		}
		local5.aClass3_Sub25_Sub1_2.method8616(arg2 + Static72.anInt1361);
		local5.aClass3_Sub25_Sub1_2.method8597(arg0 + Static287.anInt4910);
		local5.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
		Static27.aBoolean43 = false;
		Static661.anInt10551 = arg0;
		Static514.anInt8261 = arg2;
		Static518.method7283();
		return local5;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!oba;Z)Ljava/lang/String;")
	public static String method7683(@OriginalArg(0) Class3_Sub11_Sub14 arg0) {
		if (arg0.aString66 == null || arg0.aString66.length() == 0) {
			return arg0.aString67 == null || arg0.aString67.length() <= 0 ? arg0.aString65 : arg0.aString65 + Static601.aClass346_34.method8440(Static609.anInt9834) + arg0.aString67;
		} else if (arg0.aString67 == null || arg0.aString67.length() <= 0) {
			return arg0.aString65 + Static601.aClass346_34.method8440(Static609.anInt9834) + arg0.aString66;
		} else {
			return arg0.aString65 + Static601.aClass346_34.method8440(Static609.anInt9834) + arg0.aString67 + Static601.aClass346_34.method8440(Static609.anInt9834) + arg0.aString66;
		}
	}
}
