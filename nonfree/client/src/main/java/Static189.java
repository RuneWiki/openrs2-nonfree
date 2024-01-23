import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	public static int anInt3778;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray41;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	public static int anInt3780 = 0;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "[I")
	public static int[] anIntArray312 = new int[100];

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Z")
	public static boolean aBoolean263 = false;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString125 = "Created gameworld";

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString126 = "Discard";

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIBIIIIIIIII)V")
	public static void method3076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class1_Sub31 local7 = new Class1_Sub31();
		local7.anInt5706 = arg8;
		local7.anInt5704 = arg11;
		local7.anInt5708 = arg5;
		local7.anInt5701 = arg3;
		local7.anInt5696 = arg7;
		local7.anInt5707 = arg0;
		local7.anInt5699 = arg1;
		local7.anInt5702 = arg6;
		local7.anInt5705 = arg4;
		local7.anInt5697 = arg2;
		local7.anInt5703 = arg10;
		local7.anInt5700 = arg9;
		Static91.aClass24_14.method473(local7);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public static void method3078() {
		if (Static17.aBoolean17) {
			return;
		}
		if (Static51.aBoolean77) {
			Static15.aFloat2 = (int) Static15.aFloat2 - 17 & 0xFFFFFFF0;
		} else {
			Static60.aFloat10 += (-12.0F - Static60.aFloat10) / 2.0F;
		}
		Static104.aBoolean149 = true;
		Static17.aBoolean17 = true;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)V")
	public static void method3079(@OriginalArg(0) int arg0) {
		if (Static177.anIntArray183 == null || Static177.anIntArray183.length < arg0) {
			Static177.anIntArray183 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)Lclient!ei;")
	public static Class43 method3080(@OriginalArg(1) int arg0) {
		@Pc(10) Class43 local10 = (Class43) Static199.aClass169_111.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static233.aClass138_63.method3346(Static177.method1744(arg0), Static37.method680(arg0));
		local10 = new Class43();
		local10.anInt1198 = arg0;
		if (local28 != null) {
			local10.method1014(new Class1_Sub14(local28));
		}
		local10.method1003();
		if (!Static89.aBoolean128 && local10.aBoolean90) {
			local10.aStringArray9 = null;
		}
		if (local10.aBoolean96) {
			local10.anInt1181 = 0;
			local10.aBoolean85 = false;
		}
		Static199.aClass169_111.method4016(local10, (long) arg0);
		return local10;
	}
}
