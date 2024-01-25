import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_2 = new Class91(16);

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_13 = new Class83(0, -2);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!vv;Z)V")
	public static void method557(@OriginalArg(0) Class11_Sub1 arg0) {
		if (Static336.aBoolean470) {
			Static198.aClass187Array1[Static198.aClass187Array1.length - 1].method3893(arg0);
		} else {
			Static426.method6096(arg0, Static575.aClass1_Sub24Array6);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)I")
	public static int method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIII)I")
	public static int method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 4095 - arg0;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Z")
	public static boolean method560(@OriginalArg(1) int arg0) {
		return arg0 == 5 || arg0 == 45 || arg0 == 1011 || arg0 == 2 || arg0 == 20;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(III)Z")
	public static boolean method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
