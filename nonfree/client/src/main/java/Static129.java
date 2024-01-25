import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_60 = new Class381(10, -1);

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	public static int anInt2160 = 0;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg3);
		@Pc(17) int local17 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg4);
		@Pc(30) int local30 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg1);
		@Pc(36) int local36 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0);
		for (@Pc(38) int local38 = local11; local38 <= local17; local38++) {
			Static161.method2977(local30, arg2, local36, Static120.anIntArrayArray18[local38], -113);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(CBI)I")
	public static int method1924(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(24) char local24 = Character.toLowerCase(arg0);
			local13 = (local24 << 4) + 1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!eg;ZB)V")
	public static void method1925(@OriginalArg(0) Class5_Sub4_Sub2 arg0) {
		Static604.aClass45_2.method7457(arg0);
		Static573.method7715(arg0, Static612.aClass126_279, Static535.aClass126_240, Static543.aClass126_247, Static604.aClass45_2);
	}
}
