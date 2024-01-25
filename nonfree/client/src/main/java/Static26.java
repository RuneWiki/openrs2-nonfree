import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "[[Lclient!wc;")
	public static Class382[][] aClass382ArrayArray1;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
	public static int anInt630;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!ef;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	public static int anInt627 = -1;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "Lclient!tca;")
	public static final Class333 aClass333_3 = new Class333(512);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)Z")
	public static boolean method590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ofa;B)Lclient!ofa;")
	public static Class265 method591(@OriginalArg(0) Class265 arg0) {
		if (arg0.anInt6985 != -1) {
			return Static223.method3278(arg0.anInt6985);
		}
		@Pc(24) int local24 = arg0.anInt7032 >>> 16;
		@Pc(29) Class129 local29 = new Class129(Static513.aClass333_33);
		for (@Pc(34) Class3_Sub25 local34 = (Class3_Sub25) local29.method3011(); local34 != null; local34 = (Class3_Sub25) local29.method3007()) {
			if (local34.anInt3959 == local24) {
				return Static223.method3278((int) local34.aLong313);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(JZ)V")
	public static void method592(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static231.method4620(arg0 - 1L);
			Static231.method4620(1L);
		} else {
			Static231.method4620(arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	public static void method594() {
		Static413.aClass154_1.method5016();
		Static627.aClass48_1.method7510();
		Static548.aClient1.method1364();
		Static330.aCanvas5.setBackground(Color.black);
		Static152.anInt10400 = -1;
		Static413.aClass154_1 = Static604.method8231(Static330.aCanvas5);
		Static627.aClass48_1 = Static217.method8414(Static330.aCanvas5);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V")
	public static void method595() {
		Static491.aClass95_11.L(Static148.anInt2713, Static336.aClass3_Sub41_18.aClass14_Sub16_1.method4688() == 1 ? Static403.anInt10573 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZLclient!kha;)V")
	public static void method596(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub33 arg1) {
		if (arg1.aBoolean341) {
			if (arg1.anInt5167 < 0 || Static311.method4474(arg1.anInt5167, arg1.anInt5171)) {
				if (arg0) {
					Static94.method1608(arg1.anInt5157, arg1.anInt5169, arg1.anInt5163, arg1.anInt5170, (Class173) null);
				} else {
					Static101.method1643(arg1.anInt5169, arg1.anInt5159, arg1.anInt5170, arg1.anInt5157, arg1.anInt5163, arg1.anInt5167, arg1.anInt5171, -1);
				}
				arg1.method9034();
			}
		} else if (arg1.aBoolean342 && arg1.anInt5169 >= 1 && arg1.anInt5170 >= 1 && arg1.anInt5169 <= Static98.anInt361 - 2 && Static438.anInt7120 - 2 >= arg1.anInt5170 && (arg1.anInt5166 < 0 || Static311.method4474(arg1.anInt5166, arg1.anInt5162))) {
			if (arg0) {
				Static94.method1608(arg1.anInt5157, arg1.anInt5169, arg1.anInt5163, arg1.anInt5170, arg1.aClass173_2);
			} else {
				Static101.method1643(arg1.anInt5169, arg1.anInt5168, arg1.anInt5170, arg1.anInt5157, arg1.anInt5163, arg1.anInt5166, arg1.anInt5162, -1);
			}
			arg1.aBoolean342 = false;
			if (!arg0 && arg1.anInt5167 == arg1.anInt5166 && arg1.anInt5167 == -1) {
				arg1.method9034();
			} else if (!arg0 && arg1.anInt5166 == arg1.anInt5167 && arg1.anInt5159 == arg1.anInt5168 && arg1.anInt5162 == arg1.anInt5171) {
				arg1.method9034();
			}
		}
	}
}
