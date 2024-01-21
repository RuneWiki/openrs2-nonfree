import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "J")
	public static long aLong120;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1751 = Static193.method3027("gr-Un:");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ke;IZZIII)V")
	public static void method2793(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2) {
		Static78.aClass52_18 = arg0;
		Static26.anInt553 = 2;
		Static185.anInt3774 = 0;
		Static81.aBoolean92 = false;
		Static6.anInt123 = arg2;
		Static79.anInt1588 = 1;
		Static210.anInt4241 = arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lclient!oc;")
	public static Class70 method2794(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = new Class70();
		local10.aByteArray30 = new byte[arg0];
		local10.anInt2899 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method2796() {
		for (@Pc(10) Class3_Sub27 local10 = (Class3_Sub27) Static87.aClass10_125.method267(); local10 != null; local10 = (Class3_Sub27) Static87.aClass10_125.method268()) {
			if (local10.aClass3_Sub3_Sub9_1 != null) {
				local10.method3234();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method2797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass35_1 = null;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!b;)Lclient!oc;")
	public static Class70 method2798(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		if (!Static24.method1263(Static157.method2365(arg1), arg0) && arg1.anObjectArray3 == null) {
			return null;
		} else if (arg1.aClass70Array5 == null || arg1.aClass70Array5.length <= arg0 || arg1.aClass70Array5[arg0] == null || arg1.aClass70Array5[arg0].method2056().method2045() == 0) {
			return Static58.aBoolean74 ? Static207.method3296(new Class70[] { Static40.aClass70_422, Static107.method2404(arg0) }) : null;
		} else {
			return arg1.aClass70Array5[arg0];
		}
	}
}
