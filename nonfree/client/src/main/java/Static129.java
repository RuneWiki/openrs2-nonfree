import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt2386;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "[Lclient!ij;")
	public static Class77[] aClass77Array3;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_48 = new Class117("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_24 = new Class16();

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2387 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lclient!kh;")
	public static Class11_Sub25 method1987() {
		@Pc(8) Class11_Sub25 local8 = new Class11_Sub25(38);
		local8.method5186(15);
		local8.method5186(Static37.anInt693);
		local8.method5186(Static193.aBoolean249 ? 1 : 0);
		local8.method5186(Static147.aBoolean182 ? 1 : 0);
		local8.method5186(Static280.aBoolean11 ? 1 : 0);
		local8.method5186(Static39.aBoolean43 ? 1 : 0);
		local8.method5186(0);
		local8.method5186(Static347.aBoolean422 ? 1 : 0);
		local8.method5186(Static107.aBoolean127 ? 1 : 0);
		local8.method5186(Static190.aBoolean248 ? 1 : 0);
		local8.method5186(Static103.anInt1883);
		local8.method5186(Static52.aBoolean313 ? 1 : 0);
		local8.method5186(Static36.aBoolean36 ? 1 : 0);
		local8.method5186(Static117.aBoolean145 ? 1 : 0);
		local8.method5186(Static17.anInt285);
		local8.method5186(Static210.aBoolean289 ? 1 : 0);
		local8.method5186(Static289.anInt5719);
		local8.method5186(Static249.anInt4975);
		local8.method5186(Static326.anInt5865);
		local8.method5204(Static9.anInt151);
		local8.method5204(Static285.anInt5644);
		local8.method5186(Static59.method895());
		local8.method5168(Static104.anInt1926);
		local8.method5186(Static70.anInt1316);
		local8.method5186(Static279.aBoolean362 ? 1 : 0);
		local8.method5186(Static210.aBoolean290 ? 1 : 0);
		local8.method5186(Static344.anInt6591);
		local8.method5186(Static193.aBoolean250 ? 1 : 0);
		local8.method5186(Static79.aBoolean341 ? 1 : 0);
		local8.method5186(Static54.anInt1026);
		local8.method5186(Static55.aBoolean65 ? 1 : 0);
		local8.method5186(Static276.anInt5525);
		local8.method5186(Static150.anInt2727);
		return local8;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method1988(@OriginalArg(1) int arg0) {
		@Pc(5) Class26 local5 = Static34.aClass26_4;
		synchronized (Static34.aClass26_4) {
			Static34.aClass26_4.method333();
			Static34.aClass26_4 = new Class26(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public static void method1989() {
		if (!Static103.aBoolean118) {
			return;
		}
		@Pc(11) Class137 local11 = Static188.method3467(Static219.anInt4454, Static122.anInt2282);
		if (local11 != null && local11.anObjectArray10 != null) {
			@Pc(28) Class11_Sub13 local28 = new Class11_Sub13();
			local28.aClass137_5 = local11;
			local28.anObjectArray3 = local11.anObjectArray10;
			Static93.method1353(local28);
		}
		Static103.aBoolean118 = false;
		Static66.anInt2101 = -1;
		Static288.anInt5695 = -1;
		if (local11 != null) {
			Static69.method1039(local11);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1991(@OriginalArg(1) String arg0) {
		if (Static314.aStringArray21 == null) {
			Static321.method5337();
		}
		@Pc(20) String[] local20 = Static313.method5273('\n', arg0);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			for (@Pc(26) int local26 = Static6.anInt4028; local26 > 0; local26--) {
				Static314.aStringArray21[local26] = Static314.aStringArray21[local26 - 1];
			}
			Static314.aStringArray21[0] = local20[local22];
			if (Static6.anInt4028 < Static314.aStringArray21.length - 1) {
				if (Static23.anInt431 > 0) {
					Static23.anInt431++;
				}
				Static6.anInt4028++;
			}
		}
	}
}
