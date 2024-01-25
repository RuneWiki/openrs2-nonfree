import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!of", name = "db", descriptor = "I")
	public static int anInt6396;

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "S")
	public static short aShort84 = 205;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!fca;")
	public static Class6_Sub17 method5450() {
		if (Static217.aClass361_25 == null || Static558.aClass36_1 == null) {
			return null;
		}
		for (@Pc(21) Class6_Sub17 local21 = (Class6_Sub17) Static558.aClass36_1.method1052(); local21 != null; local21 = (Class6_Sub17) Static558.aClass36_1.method1052()) {
			@Pc(29) Class176 local29 = Static217.aClass213_2.method5127(local21.anInt2970);
			if (local29 != null && local29.aBoolean355 && local29.method4379(Static217.anInterface2_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!cb;")
	public static Class42 method5466(@OriginalArg(0) int arg0) {
		@Pc(10) Class42 local10 = (Class42) Static147.aClass136_104.method3473((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static14.aClass251_9.method5772(arg0, 1);
		local10 = new Class42();
		local10.anInt1166 = arg0;
		if (local20 != null) {
			local10.method1161(new Class6_Sub21(local20));
		}
		local10.method1160();
		if (local10.anInt1164 == 2 && Static315.aClass128_26.method3263((long) arg0) == null) {
			Static315.aClass128_26.method3267(new Class6_Sub35(Static130.anInt2954), (long) arg0);
			Static339.aClass42Array1[Static130.anInt2954++] = local10;
		}
		Static147.aClass136_104.method3482((long) arg0, local10);
		return local10;
	}
}
