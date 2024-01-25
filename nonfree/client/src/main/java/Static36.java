import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Lclient!ck;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_8 = new Class154(32);

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[128][128];

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
	public static void method672() {
		for (@Pc(10) Class4_Sub18 local10 = (Class4_Sub18) Static248.aClass130_112.method3499(); local10 != null; local10 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			if (Static153.method2977(local10.anInt2905)) {
				Static134.method2703(local10);
			}
		}
		if (Static282.anInt5713 == 1) {
			Static173.aBoolean319 = false;
			Static222.method3817(Static223.anInt4637, Static111.anInt2450, Static111.anInt2449, Static87.anInt1931);
			return;
		}
		Static222.method3817(Static223.anInt4637, Static111.anInt2450, Static111.anInt2449, Static87.anInt1931);
		@Pc(43) int local43 = Static242.aClass106_7.method2879(Static291.aString220);
		for (@Pc(48) Class4_Sub18 local48 = (Class4_Sub18) Static248.aClass130_112.method3499(); local48 != null; local48 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			@Pc(54) int local54 = Static57.method1021(local48);
			if (local43 < local54) {
				local43 = local54;
			}
		}
		Static223.anInt4637 = (Static104.aBoolean594 ? 26 : 22) + Static282.anInt5713 * 16;
		Static111.anInt2450 = local43 + 8;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method673() {
		@Pc(5) Class154 local5 = Static100.aClass154_35;
		synchronized (Static100.aClass154_35) {
			Static100.aClass154_35.method4219();
		}
		local5 = Static195.aClass154_67;
		synchronized (Static195.aClass154_67) {
			Static195.aClass154_67.method4219();
		}
		local5 = Static277.aClass154_85;
		synchronized (Static277.aClass154_85) {
			Static277.aClass154_85.method4219();
		}
		local5 = Static81.aClass154_26;
		synchronized (Static81.aClass154_26) {
			Static81.aClass154_26.method4219();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!lp;")
	public static Class123 method674(@OriginalArg(1) int arg0) {
		@Pc(10) Class123 local10 = (Class123) Static111.aClass154_38.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static232.aClass11_95.method288(arg0, 29);
		local10 = new Class123();
		if (local22 != null) {
			local10.method3341(new Class4_Sub7(local22), arg0);
		}
		Static111.aClass154_38.method4221((long) arg0, local10);
		return local10;
	}
}
