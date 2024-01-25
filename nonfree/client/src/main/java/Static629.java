import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "Lclient!efa;")
	public static final Class85 aClass85_6 = new Class85();

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "Z")
	public static boolean aBoolean741 = false;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method8436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class325 local13 = local7.aClass325_1; local13 != null; local13 = local13.aClass325_3) {
			@Pc(17) Class13_Sub1_Sub1 local17 = local13.aClass13_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort117 == arg1 && local17.aShort119 == arg2) {
				Static12.method182(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(III)Lclient!c;")
	public static Class13_Sub1_Sub2 method8438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass13_Sub1_Sub2_1 == null ? null : local7.aClass13_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!qc;)Lclient!qc;")
	public static Class2_Sub13_Sub3 method8440(@OriginalArg(1) Class2_Sub13_Sub3 arg0) {
		@Pc(14) Class2_Sub13_Sub3 local14 = arg0 == null ? new Class2_Sub13_Sub3() : new Class2_Sub13_Sub3(arg0);
		local14.method6153();
		return local14;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!wu;)V")
	public static void method8441(@OriginalArg(1) Class380 arg0) {
		Static219.anInt3586 = arg0.method8609("hitmarks");
		Static255.anInt4054 = arg0.method8609("hitbar_default");
		Static198.anInt8168 = arg0.method8609("timerbar_default");
		Static50.anInt1047 = arg0.method8609("headicons_pk");
		Static392.anInt6183 = arg0.method8609("headicons_prayer");
		Static311.anInt5006 = arg0.method8609("hint_headicons");
		Static617.anInt9939 = arg0.method8609("hint_mapmarkers");
		Static200.anInt3400 = arg0.method8609("mapflag");
		Static96.anInt1823 = arg0.method8609("cross");
		Static211.anInt3250 = arg0.method8609("mapdots");
		Static81.anInt1424 = arg0.method8609("scrollbar");
		Static197.anInt3366 = arg0.method8609("name_icons");
		Static497.anInt8117 = arg0.method8609("floorshadows");
		Static179.anInt3513 = arg0.method8609("compass");
		Static410.anInt6384 = arg0.method8609("otherlevel");
		Static5.anInt80 = arg0.method8609("hint_mapedge");
	}
}
