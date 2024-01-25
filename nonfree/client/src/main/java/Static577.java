import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!rw", name = "Ic", descriptor = "Lclient!jj;")
	public static Class193 aClass193_7;

	@OriginalMember(owner = "client!rw", name = "ad", descriptor = "Lclient!lea;")
	public static Class223 aClass223_12;

	@OriginalMember(owner = "client!rw", name = "kd", descriptor = "[I")
	public static final int[] anIntArray645 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!rw", name = "Rc", descriptor = "Lclient!nda;")
	public static final Class258 aClass258_3 = new Class258("RC", 1);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(FFFI)F")
	public static float method7499(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 * (arg1 - arg0) + arg0;
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(I)V")
	public static void method7503() {
		Static552.anIntArray612 = Static229.method3356(0.4F);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IBIII)Lclient!jr;")
	public static Class200 method7507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(40) long local40 = ((long) arg0 & 0xFFFFL) << 32 | (long) arg2 << 48 & 0xFFFFL << 48 | 0xFFFFL << 16 & (long) arg3 << 16 | (long) arg1 & 0xFFFFL;
		@Pc(48) Class200 local48 = (Class200) Static435.aClass307_68.method7002(local40);
		if (local48 == null) {
			local48 = Class3_Sub33_Sub3.lb.method6968(arg0, arg2, arg1, arg3, Static499.aClass297_1);
			Static435.aClass307_68.method7000(local48, local40);
		}
		return local48;
	}
}
