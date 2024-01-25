import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lha", name = "l", descriptor = "I")
	public static int anInt10378 = 0;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method8379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static251.anInt9634 && Static366.anInt6946 >= arg4 && Static251.anInt9634 <= arg2 && Static366.anInt6946 >= arg2 && arg7 >= Static251.anInt9634 && Static366.anInt6946 >= arg7 && Static251.anInt9634 <= arg8 && arg8 <= Static366.anInt6946 && Static444.anInt8258 <= arg0 && arg0 <= Static188.anInt4410 && Static444.anInt8258 <= arg3 && Static188.anInt4410 >= arg3 && arg6 >= Static444.anInt8258 && Static188.anInt4410 >= arg6 && Static444.anInt8258 <= arg5 && Static188.anInt4410 >= arg5) {
			Static406.method6450(arg1, arg7, arg5, arg3, arg8, arg4, arg6, arg0, arg2);
		} else {
			Static355.method5609(arg1, arg5, arg4, arg8, arg2, arg6, arg3, arg7, arg0);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIZII)I")
	public static int method8380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg1 : arg2;
		@Pc(38) int local38 = local12 < 4 ? arg1 : local12 == 12 || local12 == 14 ? arg2 : arg3;
		return ((local12 & 0x2) == 0 ? local38 : -local38) + ((local12 & 0x1) == 0 ? local21 : -local21);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)I")
	public static int method8382() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = gn.class.getDeclaredFields();
		for (@Pc(31) int local31 = 0; local31 < local17.length; local31++) {
			@Pc(37) Field local37 = local17[local31];
			if (qs.class.isAssignableFrom(local37.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!tp;III)V")
	public static void method8383(@OriginalArg(0) Class331 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class1 local13 = arg0.method7750(Static171.aClass16_5);
		if (local13 == null) {
			return;
		}
		Static171.aClass16_5.KA(arg2, arg1, arg2 + arg0.anInt9553, arg0.anInt9505 + arg1);
		if (Static266.anInt5673 >= 3) {
			Static171.aClass16_5.A(-16777216, local13, arg2, arg1);
		} else {
			Static297.aClass21_10.method5780((float) arg2 + (float) arg0.anInt9553 / 2.0F, (float) arg0.anInt9505 / 2.0F + (float) arg1, ((int) -Static499.aFloat185 & 0x3FFF) << 2, local13, arg2, arg1);
		}
	}
}
