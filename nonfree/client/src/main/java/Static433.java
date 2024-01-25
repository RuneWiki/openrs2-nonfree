import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_13 = new Class158(4, 1, 1, 1);

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
	public static int anInt7164 = 0;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "[I")
	public static final int[] anIntArray565 = new int[1];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!r;Lclient!hga;II)V")
	public static void method6086(@OriginalArg(1) Class43 arg0, @OriginalArg(2) Class130 arg1) {
		Static552.aClass130_63.method3541();
		if (Static239.aBoolean347) {
			return;
		}
		for (@Pc(25) Class3_Sub41 local25 = (Class3_Sub41) arg1.method3543(); local25 != null; local25 = (Class3_Sub41) arg1.method3551()) {
			@Pc(33) Class40 local33 = Static284.aClass168_4.method4062(local25.anInt7163);
			if (Static10.method121(local33)) {
				@Pc(45) boolean local45 = Static418.method6007(local33, arg0, local25);
				if (local45) {
					Static219.method3813(local33, local25, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBIIIII)Lclient!js;")
	public static Class55 method6087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg2 * 76724863L ^ (long) arg1 * 32147369L ^ (long) arg5 * 475427L ^ (long) arg4 * 67481L ^ (long) arg0 * 97549L ^ (long) arg3 * 986053L;
		@Pc(44) Class55 local44 = (Class55) Static532.aClass10_61.method250(local38);
		if (local44 == null) {
			local44 = Static131.aClass43_5.method7208(arg4, arg0, arg5, arg3, arg1, arg2);
			Static532.aClass10_61.method254(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}
}
