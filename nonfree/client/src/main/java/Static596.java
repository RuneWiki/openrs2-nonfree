import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "[I")
	public static final int[] anIntArray537 = new int[4];

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_14 = new Class409(0, 1);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZIBII)Lclient!tv;")
	public static Class3_Sub52 method8207(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub52 local7 = new Class3_Sub52();
		local7.anInt10201 = arg3;
		local7.anInt10202 = arg2;
		Static170.aClass136_19.method3508((long) arg1, local7);
		Static504.method7229(arg2);
		@Pc(32) Class20 local32 = Static118.method2045(arg1);
		if (local32 != null) {
			Static391.method5905(local32);
		}
		if (Static70.aClass20_4 != null) {
			Static391.method5905(Static70.aClass20_4);
			Static70.aClass20_4 = null;
		}
		Static672.method8911();
		if (local32 != null) {
			Static97.method1292(!arg0, local32);
		}
		if (!arg0) {
			Static185.method2812(arg2);
		}
		if (!arg0 && Static633.anInt3426 != -1) {
			Static49.method650(1, Static633.anInt3426);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIII)I")
	public static int method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) int local14 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(23) int local23 = arg2;
			arg2 = arg1;
			arg1 = local23;
		}
		if (local14 == 0) {
			return arg3;
		} else if (local14 == 1) {
			return arg5;
		} else if (local14 == 2) {
			return 7 + 1 - arg3 - arg2;
		} else {
			return 7 + 1 - arg5 - arg1;
		}
	}
}
