import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public static int anInt9102;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!qga;")
	public static Class299 aClass299_9 = null;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt9101 = -1;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!cg;")
	public static final Class59 aClass59_8 = new Class59("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public static int anInt9105 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)Lclient!rha;")
	public static Class312 method7847(@OriginalArg(1) int arg0) {
		@Pc(10) Class312 local10 = (Class312) Static609.aClass317_67.method7882((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23 = Static327.aClass310_63.method7803(arg0, 1);
		local10 = new Class312();
		local10.anInt9072 = arg0;
		if (local23 != null) {
			local10.method7836(new Class14_Sub21(local23));
		}
		local10.method7835();
		if (local10.anInt9074 == 2 && Static352.aClass125_41.method2630((long) arg0) == null) {
			Static352.aClass125_41.method2626(new Class14_Sub30(Static169.anInt2629), (long) arg0);
			Static633.aClass312Array31[Static169.anInt2629++] = local10;
		}
		Static609.aClass317_67.method7875((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ma;Lclient!ha;IIILclient!hga;Lclient!qp;BI)V")
	public static void method7848(@OriginalArg(0) Class228 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class152 arg5, @OriginalArg(6) Class14_Sub39 arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = arg7 - arg2 / 2 - 5;
		@Pc(23) int local23 = arg3 + 2;
		if (arg5.anInt4303 != 0) {
			arg1.method6887(local23, arg5.anInt4303, arg2 + 10, -local23 + 1 + arg4 * arg0.method5505() + arg3, local19);
		}
		if (arg5.anInt4319 != 0) {
			arg1.method6906(local19, arg3 + arg0.method5505() * arg4 + 1 - local23, arg2 + 10, arg5.anInt4319, local23);
		}
		@Pc(85) int local85 = arg5.anInt4291;
		if (arg6.aBoolean620 && arg5.anInt4328 != -1) {
			local85 = arg5.anInt4328;
		}
		for (@Pc(99) int local99 = 0; local99 < arg4; local99++) {
			@Pc(104) String local104 = Static555.aStringArray40[local99];
			if (local99 < arg4 - 1) {
				local104 = local104.substring(0, local104.length() - 4);
			}
			arg0.method5508(arg1, local104, arg7, arg3, local85);
			arg3 += arg0.method5505();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(JB)I")
	public static int method7849(@OriginalArg(0) long arg0) {
		Static586.method8349(arg0);
		return Static183.aCalendar2.get(1);
	}
}
