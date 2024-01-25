import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!ir;")
	public static Class182 aClass182_2;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public static int anInt8716 = 0;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_173 = new Class126(43, -1);

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_174 = new Class126(18, 17);

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	public static void method7376() {
		Static487.aClient1.method1743();
		Static254.method4038();
		Static67.aClass3_Sub17_Sub2_4.lb = 0;
		Static215.aClass126_116 = null;
		Static213.aClass126_73 = null;
		Static253.anInt4788 = 0;
		Static3.aClass126_2 = null;
		Static253.anInt4769 = 0;
		Static71.method1575();
		Static58.aString15 = null;
		Static199.aClass172Array30 = null;
		Static280.anInt5246 = 0;
		Static45.aClass308_1 = null;
		Static338.aClass308_2 = null;
		Static168.anInt3046 = 0;
		Static121.anInt2381 = 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)I")
	public static int method7377(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
