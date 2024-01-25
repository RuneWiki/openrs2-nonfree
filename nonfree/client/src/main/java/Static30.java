import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!tia;")
	public static Class355 aClass355_1;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_10 = new Class349(46, 3);

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_2 = new Class286("", 15);

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_1 = new Class197(0, 2, 2, 1);

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLjava/lang/String;BLclient!nca;)Lclient!um;")
	public static Class372 method434(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class254 arg2) {
		@Pc(10) int local10 = arg2.method6077(arg1);
		if (local10 == -1) {
			return new Class372(0);
		}
		@Pc(37) int[] local37 = arg2.method6088(local10);
		@Pc(43) Class372 local43 = new Class372(local37.length);
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		while (true) {
			while (local45 < local43.anInt10220) {
				@Pc(63) Class2_Sub20 local63 = new Class2_Sub20(arg2.method6087(local37[local47++], local10));
				@Pc(67) int local67 = local63.method8555(-9372);
				@Pc(71) int local71 = local63.method8575();
				@Pc(75) int local75 = local63.method8581(-17416);
				if (!arg0 && local75 == 1) {
					local43.anInt10220--;
				} else {
					local43.anIntArray722[local45] = local67;
					local43.anIntArray723[local45] = local71;
					local45++;
				}
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIIIIII)V")
	public static void method436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = arg2 - arg5;
		@Pc(22) int local22 = arg1 + arg5;
		for (@Pc(24) int local24 = arg1; local24 < local22; local24++) {
			Static494.method7075(arg3, arg0, arg4, Static449.anIntArrayArray48[local24], 18601);
		}
		@Pc(49) int local49 = arg4 - arg5;
		for (@Pc(51) int local51 = arg2; local51 > local17; local51--) {
			Static494.method7075(arg3, arg0, arg4, Static449.anIntArrayArray48[local51], 18601);
		}
		@Pc(77) int local77 = arg3 + arg5;
		for (@Pc(79) int local79 = local22; local79 <= local17; local79++) {
			@Pc(87) int[] local87 = Static449.anIntArrayArray48[local79];
			Static494.method7075(arg3, arg0, local77, local87, 18601);
			Static494.method7075(local49, arg0, arg4, local87, 18601);
		}
	}
}
