import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_71 = new Class265(36, -2);

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "Lclient!di;")
	public static final Class54 aClass54_51 = new Class54(72, 7);

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "[Lclient!gf;")
	public static final Class92[] aClass92Array1 = new Class92[6];

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_72 = new Class265(5, 5);

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "[I")
	public static int[] anIntArray306 = new int[1];

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "[I")
	public static final int[] anIntArray307 = new int[1024];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILclient!vr;Lclient!vr;)V")
	public static void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub5 arg3, @OriginalArg(4) Class3_Sub5 arg4) {
		@Pc(4) Class106 local4 = Static292.method4206(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub5_1 = arg3;
			local4.aClass3_Sub5_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!mg;Lclient!ya;Lclient!mg;B)V")
	public static void method2818(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class160 arg2) {
		Static86.aClass58_10 = Static334.method4661(arg2, Static400.anInt7453);
		Static291.aClass116_3 = arg1.method4479(Static86.aClass58_10, Static459.method2071(arg0, Static400.anInt7453));
		Static270.aClass58_11 = Static334.method4661(arg2, Static192.anInt3704);
		Static368.aClass116_4 = arg1.method4479(Static270.aClass58_11, Static459.method2071(arg0, Static192.anInt3704));
		Static172.aClass58_5 = Static334.method4661(arg2, Static398.anInt6645);
		Static114.aClass116_1 = arg1.method4479(Static172.aClass58_5, Static459.method2071(arg0, Static398.anInt6645));
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ds;I)V")
	public static void method2819(@OriginalArg(0) Class2_Sub11 arg0) {
		if (Static440.aClass106ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt1611 == 0) {
			local8 = (Interface6) Static215.method3376(arg0.anInt1613, arg0.anInt1614, arg0.anInt1615);
		}
		if (arg0.anInt1611 == 1) {
			local8 = (Interface6) Static414.method5443(arg0.anInt1613, arg0.anInt1614, arg0.anInt1615);
		}
		if (arg0.anInt1611 == 2) {
			local8 = (Interface6) Static455.method4456(arg0.anInt1613, arg0.anInt1614, arg0.anInt1615, jn.class);
		}
		if (arg0.anInt1611 == 3) {
			local8 = (Interface6) Static139.method2376(arg0.anInt1613, arg0.anInt1614, arg0.anInt1615);
		}
		if (local8 == null) {
			arg0.anInt1616 = -1;
			arg0.anInt1610 = 0;
			arg0.anInt1605 = 0;
		} else {
			arg0.anInt1616 = local8.method5153();
			arg0.anInt1610 = local8.method5149();
			arg0.anInt1605 = local8.method5155();
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
	public static void method2820() {
		if (Static140.aBoolean233) {
			return;
		}
		Static140.aBoolean233 = true;
		Static243.aBoolean333 = true;
		if (Static12.aClass79_Sub1_1.aBoolean363) {
			Static202.aFloat62 = (int) Static202.aFloat62 + 191 & 0xFFFFFF80;
		} else {
			Static118.aFloat53 += (24.0F - Static118.aFloat53) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Lclient!dn;")
	public static Class56 method2821(@OriginalArg(0) int arg0) {
		@Pc(13) Class56[] local13 = Static10.method228();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class56 local21 = local13[local15];
			if (local21.anInt1569 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
