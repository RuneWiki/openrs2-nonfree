import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
	public static int anInt4703 = 0;

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)Lclient!fh;")
	public static Class61 method4285(@OriginalArg(0) int arg0) {
		@Pc(5) Class140 local5 = Static99.aClass140_56;
		@Pc(14) Class61 local14;
		synchronized (Static99.aClass140_56) {
			local14 = (Class61) Static99.aClass140_56.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static268.aClass165_79.method4508(Static228.method4138(arg0), Static223.method4082(arg0));
		local14 = new Class61();
		local14.anInt1826 = arg0;
		if (local34 != null) {
			local14.method1736(new Class1_Sub7(local34));
		}
		local14.method1728();
		if (local14.anInt1827 != -1) {
			local14.method1737(method4285(local14.anInt1827), method4285(local14.anInt1831));
		}
		if (local14.anInt1782 != -1) {
			local14.method1735(method4285(local14.anInt1782), method4285(local14.anInt1794));
		}
		if (!Static300.aBoolean508 && local14.aBoolean159) {
			local14.aBoolean160 = false;
			local14.aStringArray10 = Static111.aStringArray22;
			local14.anIntArray228 = null;
			local14.anInt1834 = 0;
			local14.aStringArray11 = Static119.aStringArray17;
			local14.aString74 = Static24.aString19;
		}
		@Pc(113) Class140 local113 = Static99.aClass140_56;
		synchronized (Static99.aClass140_56) {
			Static99.aClass140_56.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!rg;B)Lclient!rg;")
	public static Class177 method4286(@OriginalArg(0) Class177 arg0) {
		@Pc(13) Class177 local13 = Static47.method1092(arg0);
		if (local13 == null) {
			local13 = arg0.aClass177_18;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)V")
	public static void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static211.anInt4208 * arg1 >> 8;
		if (local9 != 0 && arg2 != -1) {
			Static299.method5095(Static334.aClass165_103, arg2, local9);
			Static275.aBoolean463 = true;
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)I")
	public static int method4290(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method4292(@OriginalArg(0) Class165 arg0) {
		Static25.aClass165_8 = arg0;
	}
}
