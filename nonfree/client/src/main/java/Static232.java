import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt2216;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "F")
	public static float aFloat44 = 0.0F;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public static int anInt2218 = 1;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILclient!tk;)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub5 arg3) {
		if (Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static243.method4280(arg0, arg1, arg2);
		}
		Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2].aClass10_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!fa;")
	public static Class59 method2200(@OriginalArg(0) int arg0) {
		@Pc(10) Class11 local10 = Static238.aClass11_102;
		@Pc(19) Class59 local19;
		synchronized (Static238.aClass11_102) {
			local19 = (Class59) Static238.aClass11_102.method209((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(41) byte[] local41 = Static335.aClass143_112.method3745(Static332.method5726(arg0), Static1.method5706(arg0));
		local19 = new Class59();
		local19.anInt1951 = arg0;
		if (local41 != null) {
			local19.method1975(new Class14_Sub4(local41));
		}
		local19.method1972();
		if (!Static191.aBoolean245 && local19.aBoolean130) {
			local19.aStringArray30 = null;
			local19.anIntArray171 = null;
		}
		if (local19.aBoolean132) {
			local19.anInt1960 = 0;
			local19.aBoolean135 = false;
		}
		@Pc(84) Class11 local84 = Static238.aClass11_102;
		synchronized (Static238.aClass11_102) {
			Static238.aClass11_102.method219((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)I")
	public static int method2202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
