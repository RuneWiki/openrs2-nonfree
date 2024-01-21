import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public static int anInt1322;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!ac;")
	public static Class3 aClass3_13;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_658 = Static14.method2017("@yel@");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method962() {
		if (Static42.anInt1111 == 2) {
			Static24.method518(Static39.anInt981 * 2, Static24.anInt626 + (Static65.anInt1669 - Static25.anInt632 << 7), (Static11.anInt264 + -Static23.anInt592 << 7) + Static2.anInt2976);
			if (Static35.anInt935 > -1 && Static113.anInt2952 % 20 < 10) {
				Static18.aClass2_Sub1_Sub1_Sub3Array7[0].method1234(Static35.anInt935 - 12, Static52.anInt1432 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method963() {
		aClass2_Sub1_Sub1_Sub1_14 = null;
		Class35.anIntArray176 = null;
		aClass36_658 = null;
		aClass3_13 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
	public static void method964(@OriginalArg(1) int arg0) {
		Static56.anInt1487 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Lclient!kc;")
	public static Class36 method965(@OriginalArg(0) int arg0) {
		@Pc(9) Class36 local9 = Static57.method1055(arg0);
		for (@Pc(23) int local23 = local9.method1028() - 3; local23 > 0; local23 -= 3) {
			local9 = Static49.method949(new Class36[] { local9.method1018(0, local23), Static56.aClass36_705, local9.method1020(local23) });
		}
		if (local9.method1028() > 8) {
			local9 = Static49.method949(new Class36[] { Static20.aClass36_261, local9.method1018(0, local9.method1028() - 8), Static3.aClass36_642, Static20.aClass36_266, local9, Static13.aClass36_174 });
		} else if (local9.method1028() > 4) {
			local9 = Static49.method949(new Class36[] { Static10.aClass36_146, local9.method1018(0, local9.method1028() - 4), Static29.aClass36_425, Static20.aClass36_266, local9, Static13.aClass36_174 });
		}
		return Static49.method949(new Class36[] { Static34.aClass36_479, local9 });
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method966(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 <= 0 || local11 >= 256) {
			local11 = -1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	public static void method967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static78.anInt2039 != 0 && arg1 != -1) {
			Static113.method2046(Static100.aClass3_Sub1_11, arg1, 1, Static78.anInt2039);
			Static118.anInt3000 = arg0;
		}
	}
}
