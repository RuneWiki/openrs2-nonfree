import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
	public static final int[] anIntArray218 = new int[2];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!paa;ZII)V")
	public static void method2759(@OriginalArg(0) Class261 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static444.aClass261_9 != null || Static627.aBoolean736 || (arg0 == null || Static108.method1609(arg0) == null)) {
			return;
		}
		Static444.aClass261_9 = arg0;
		Static583.aClass261_12 = Static108.method1609(arg0);
		Static118.aBoolean156 = false;
		Static280.anInt4507 = arg1;
		Static339.anInt5386 = 0;
		Static434.anInt7016 = arg2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public static void method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub40 local20 = Static464.method6285(Static251.aClass131_1, Static171.aClass179_44);
		local20.aClass2_Sub22_Sub2_2.method8552(arg0);
		local20.aClass2_Sub22_Sub2_2.method8507(arg1);
		Static528.method7295(local20);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BCI)I")
	public static int method2761(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(24) char local24 = Character.toLowerCase(arg0);
			local15 = (local24 << 4) + 1;
		}
		return local15;
	}
}
