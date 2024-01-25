import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!ut;")
	public static Class356 aClass356_2;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_129 = new Class200(66, 2);

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_130 = new Class200(7, 12);

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_131 = new Class200(57, -1);

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public static int anInt5839 = 0;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public static int anInt5840 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V")
	public static void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static43.method1103(local7.aClass16_Sub1_Sub2_1);
		Static43.method1103(local7.aClass16_Sub1_Sub2_2);
		if (local7.aClass16_Sub1_Sub2_1 != null) {
			local7.aClass16_Sub1_Sub2_1 = null;
		}
		if (local7.aClass16_Sub1_Sub2_2 != null) {
			local7.aClass16_Sub1_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BZILjava/lang/String;)V")
	public static void method5065(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static164.method2810();
		Static153.method2688();
		Static314.method4857();
		Static45.method1179(arg1, arg0, arg2);
		Static103.method1952();
		Static508.method7061(Static141.aClass13_27);
		Static343.method5197(Static141.aClass13_27);
		Static151.method2656(Static497.aClass238_223, Static141.aClass13_27);
		Static228.method3700();
		Static385.method5686(Static435.aClass31Array12);
		Static569.method7932();
		Static350.method5257();
		if (Static454.anInt7416 == 3) {
			Static213.method3541(4);
		} else if (Static454.anInt7416 == 7) {
			Static213.method3541(8);
		} else if (Static454.anInt7416 == 10) {
			Static213.method3541(11);
		} else if (Static454.anInt7416 == 1 || Static454.anInt7416 == 2) {
			Static29.method635();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	public static int method5066() {
		return Static420.anInt7024++;
	}
}
