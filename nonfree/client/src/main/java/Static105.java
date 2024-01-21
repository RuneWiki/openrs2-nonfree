import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public static int anInt2400;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1207 = Static38.method736("gr-Un:");

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt2401 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JI)V")
	public static void method1655(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static33.anInt935; local19++) {
			if (arg0 == Static78.aLongArray4[local19]) {
				Static33.anInt935--;
				Static28.aBoolean33 = true;
				for (@Pc(43) int local43 = local19; local43 < Static33.anInt935; local43++) {
					Static78.aLongArray4[local43] = Static78.aLongArray4[local43 + 1];
				}
				Static61.aClass5_Sub11_Sub1_8.method1553(199);
				Static61.aClass5_Sub11_Sub1_8.method1548(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!me;)Z")
	public static boolean method1656(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		@Pc(6) int local6 = arg0.anInt1764;
		if (Static39.anInt1031 == 2) {
			if (local6 == 201) {
				Static58.aBoolean66 = true;
				Static38.aClass71_573 = Static38.aClass71_568;
				Static68.aBoolean72 = true;
				Static27.anInt759 = 1;
				Static77.anInt1917 = 0;
				Static38.aClass71_569 = Static107.aClass71_1256;
			}
			if (local6 == 202) {
				Static77.anInt1917 = 0;
				Static38.aClass71_573 = Static38.aClass71_568;
				Static58.aBoolean66 = true;
				Static38.aClass71_569 = Static116.aClass71_1334;
				Static27.anInt759 = 2;
				Static68.aBoolean72 = true;
			}
		}
		if (local6 == 205) {
			Static24.anInt734 = 250;
			return true;
		}
		if (local6 == 501) {
			Static77.anInt1917 = 0;
			Static38.aClass71_573 = Static38.aClass71_568;
			Static38.aClass71_569 = Static119.aClass71_1397;
			Static68.aBoolean72 = true;
			Static27.anInt759 = 4;
			Static58.aBoolean66 = true;
		}
		if (local6 == 502) {
			Static38.aClass71_569 = Static68.aClass71_825;
			Static77.anInt1917 = 0;
			Static68.aBoolean72 = true;
			Static58.aBoolean66 = true;
			Static38.aClass71_573 = Static38.aClass71_568;
			Static27.anInt759 = 5;
		}
		@Pc(98) int local98;
		@Pc(102) int local102;
		if (local6 >= 300 && local6 <= 313) {
			local98 = (local6 - 300) / 2;
			local102 = local6 & 0x1;
			Static30.aClass32_1.method933(local102 == 1, local98);
		}
		if (local6 >= 314 && local6 <= 323) {
			local98 = (local6 - 314) / 2;
			local102 = local6 & 0x1;
			Static30.aClass32_1.method929(local98, local102 == 1);
		}
		if (local6 == 324) {
			Static30.aClass32_1.method925(false);
		}
		if (local6 == 325) {
			Static30.aClass32_1.method925(true);
		}
		if (local6 == 326) {
			Static61.aClass5_Sub11_Sub1_8.method1553(188);
			Static30.aClass32_1.method934(Static61.aClass5_Sub11_Sub1_8);
			return true;
		}
		if (local6 == 620) {
			Static38.aBoolean44 = !Static38.aBoolean44;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static2.method1237();
			if (Static38.aClass71_571.method1784() > 0) {
				Static61.aClass5_Sub11_Sub1_8.method1553(234);
				Static61.aClass5_Sub11_Sub1_8.method1548(Static38.aClass71_571.method1817());
				Static61.aClass5_Sub11_Sub1_8.method1545(local6 - 601);
				Static61.aClass5_Sub11_Sub1_8.method1545(Static38.aBoolean44 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1657() {
		aClass71_1207 = null;
		aCanvas1 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)I")
	public static int method1658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static106.method1685(arg0 - 1, arg1 + -1) + Static106.method1685(arg0 + 1, arg1 - 1) + Static106.method1685(arg0 + -1, arg1 + 1) + Static106.method1685(arg0 + 1, arg1 + 1);
		@Pc(70) int local70 = Static106.method1685(arg0 - 1, arg1) + Static106.method1685(arg0 + 1, arg1) + Static106.method1685(arg0, arg1 - 1) + Static106.method1685(arg0, arg1 + 1);
		@Pc(80) int local80 = Static106.method1685(arg0, arg1);
		return local80 / 4 + local70 / 8 + local40 / 16;
	}
}
