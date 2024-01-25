import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public static void method3694() {
		for (@Pc(10) Class3_Sub14 local10 = (Class3_Sub14) Static305.aClass193_49.method4519(); local10 != null; local10 = (Class3_Sub14) Static305.aClass193_49.method4525()) {
			if (local10.anInt1626 > 0) {
				local10.anInt1626--;
			}
			if (local10.anInt1626 != 0) {
				if (local10.anInt1628 > 0) {
					local10.anInt1628--;
				}
				if (local10.anInt1628 == 0 && local10.anInt1627 >= 1 && local10.anInt1629 >= 1 && local10.anInt1627 <= Static373.anInt6324 - 2 && local10.anInt1629 <= Static291.anInt5062 - 2 && (local10.anInt1625 < 0 || Static150.method2339(local10.anInt1620, local10.anInt1625))) {
					Static85.method1525(local10.anInt1619, -1, local10.anInt1627, local10.anInt1625, local10.anInt1629, local10.anInt1621, local10.anInt1623, local10.anInt1620);
					local10.anInt1628 = -1;
					if (local10.anInt1622 == local10.anInt1625 && local10.anInt1622 == -1) {
						local10.method6288();
					} else if (local10.anInt1622 == local10.anInt1625 && local10.anInt1618 == local10.anInt1623 && local10.anInt1620 == local10.anInt1624) {
						local10.method6288();
					}
				}
			} else if (local10.anInt1622 < 0 || Static150.method2339(local10.anInt1624, local10.anInt1622)) {
				Static85.method1525(local10.anInt1619, -1, local10.anInt1627, local10.anInt1622, local10.anInt1629, local10.anInt1621, local10.anInt1618, local10.anInt1624);
				local10.method6288();
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLclient!uu;)V")
	public static void method3695(@OriginalArg(1) Class250 arg0) {
		Static314.aClass250_76 = arg0;
	}
}
