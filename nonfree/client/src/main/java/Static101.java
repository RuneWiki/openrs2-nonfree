import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt1909;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public static int anInt1914 = -1;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public static int method1804() {
		if (Static110.aFrame4 == null) {
			return Static245.aBoolean411 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lclient!rg;")
	public static Class5_Sub12 method1806() {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(38);
		local8.method5089(15);
		local8.method5089(Static192.anInt3806);
		local8.method5089(Static258.aBoolean423 ? 1 : 0);
		local8.method5089(Static215.aBoolean349 ? 1 : 0);
		local8.method5089(Static323.aBoolean522 ? 1 : 0);
		local8.method5089(Static352.aBoolean585 ? 1 : 0);
		local8.method5089(0);
		local8.method5089(Static178.aBoolean274 ? 1 : 0);
		local8.method5089(Static306.aBoolean497 ? 1 : 0);
		local8.method5089(Static157.aBoolean233 ? 1 : 0);
		local8.method5089(Static95.anInt1828);
		local8.method5089(Static280.aBoolean452 ? 1 : 0);
		local8.method5089(Static248.aBoolean414 ? 1 : 0);
		local8.method5089(Static34.aBoolean42 ? 1 : 0);
		local8.method5089(Static278.anInt5486);
		local8.method5089(Static230.aBoolean379 ? 1 : 0);
		local8.method5089(Static226.anInt4453);
		local8.method5089(Static349.anInt6699);
		local8.method5089(Static263.anInt5208);
		local8.method5084(Static211.anInt4178);
		local8.method5084(Static124.anInt2371);
		local8.method5089(Static257.method4518());
		local8.method5070(Static208.anInt4114);
		local8.method5089(Static223.anInt4410);
		local8.method5089(Static118.aBoolean168 ? 1 : 0);
		local8.method5089(Static131.aBoolean194 ? 1 : 0);
		local8.method5089(Static161.anInt3186);
		local8.method5089(Static209.aBoolean344 ? 1 : 0);
		local8.method5089(Static351.aBoolean584 ? 1 : 0);
		local8.method5089(Static136.anInt2582);
		local8.method5089(Static326.aBoolean530 ? 1 : 0);
		local8.method5089(Static254.anInt5030);
		local8.method5089(Static344.anInt6622);
		return local8;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI[Lclient!vg;)V")
	public static void method1807(@OriginalArg(1) int arg0, @OriginalArg(2) Class201[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class201 local6 = arg1[local1];
			if (local6 != null) {
				if (local6.anInt6559 == 0) {
					if (local6.aClass201Array121 != null) {
						method1807(arg0, local6.aClass201Array121);
					}
					@Pc(30) Class5_Sub18 local30 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local6.anInt6541);
					if (local30 != null) {
						Static123.method2173(arg0, local30.anInt1871);
					}
				}
				@Pc(49) Class5_Sub17 local49;
				if (arg0 == 0 && local6.anObjectArray30 != null) {
					local49 = new Class5_Sub17();
					local49.aClass201_3 = local6;
					local49.anObjectArray1 = local6.anObjectArray30;
					Static108.method1907(local49);
				}
				if (arg0 == 1 && local6.anObjectArray25 != null) {
					if (local6.anInt6548 >= 0) {
						@Pc(77) Class201 local77 = Static262.method4616(local6.anInt6541);
						if (local77 == null || local77.aClass201Array121 == null || local77.aClass201Array121.length <= local6.anInt6548 || local77.aClass201Array121[local6.anInt6548] != local6) {
							continue;
						}
					}
					local49 = new Class5_Sub17();
					local49.anObjectArray1 = local6.anObjectArray25;
					local49.aClass201_3 = local6;
					Static108.method1907(local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lclient!je;")
	public static Class4_Sub4 method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub4_1 == null ? null : local7.aClass4_Sub4_1;
	}
}
