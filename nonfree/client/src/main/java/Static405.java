import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_40 = new Class27(32);

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public static int anInt7213 = 0;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_120 = new Class237(98, 5);

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_181 = new Class131(44, 7);

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lclient!ls;")
	public static Class1_Sub28 method5577() {
		if (Static7.aClass266_18 == null || Static229.aClass93_3 == null) {
			return null;
		}
		Static229.aClass93_3.method1881(Static7.aClass266_18);
		@Pc(26) Class1_Sub28 local26 = (Class1_Sub28) Static229.aClass93_3.method1880();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class231 local36 = Static7.aClass224_3.method5302(local26.anInt4274);
			return local36 != null && local36.aBoolean446 && local36.method5358(Static7.anInterface12_2) ? local26 : Static395.method5365();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg4 < 1 || Static135.anInt2314 - 2 < arg1 || Static352.anInt6022 - 2 < arg4) {
			return;
		}
		@Pc(23) int local23 = arg0;
		if (arg0 < 3 && Static340.method4799(arg4, arg1)) {
			local23 = arg0 + 1;
		}
		if (!Static389.aClass128_Sub1_1.method2984(Static285.anInt7839) && !Static266.method3895(arg1, arg4, Static424.anInt7348, local23)) {
			return;
		}
		if (Static268.aClass211ArrayArrayArray4 == null) {
			return;
		}
		Static59.aClass155_Sub1_2.method3658(arg0, arg7, Static276.aClass109_10, arg4, Static170.aClass112Array1[arg0], arg1);
		if (arg3 >= 0) {
			@Pc(64) boolean local64 = Static389.aClass128_Sub1_1.aBoolean240;
			Static389.aClass128_Sub1_1.aBoolean240 = true;
			Static59.aClass155_Sub1_2.method3659(arg3, Static276.aClass109_10, arg1, arg5, arg2, arg4, arg0, Static170.aClass112Array1[arg0], local23, arg6);
			Static389.aClass128_Sub1_1.aBoolean240 = local64;
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)J")
	public static long method5579() {
		return Static397.aClass63_1.method5558();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZ)V")
	public static void method5580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static285.anInt7839 == 0) {
			Static157.method2372(false);
		} else {
			Static444.anInt7609 = Static285.anInt7839;
			Static262.method3812(0);
		}
		Static183.aBoolean196 = arg3;
		Static244.anInt4358 = arg1;
		Static407.anInt7049 = arg2;
		Static7.method2286(arg0);
	}
}
