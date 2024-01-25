import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_157 = new Class296(23, 3);

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_23 = new Class313(4);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBILclient!jc;ILclient!bu;Lclient!dg;I)V")
	public static void method2614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class49_Sub2_Sub2_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class36 arg4, @OriginalArg(6) Class49_Sub2_Sub2_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub10 local7 = new Class1_Sub10();
		local7.anInt1210 = arg3 << 9;
		local7.anInt1203 = arg6 << 9;
		local7.anInt1205 = arg0;
		if (arg4 != null) {
			local7.aClass36_1 = arg4;
			@Pc(140) int local140 = arg4.anInt975;
			@Pc(143) int local143 = arg4.anInt947;
			if (arg1 == 1 || arg1 == 3) {
				local143 = arg4.anInt975;
				local140 = arg4.anInt947;
			}
			local7.anInt1208 = local143 + arg3 << 9;
			local7.anInt1199 = arg4.anInt953 << 9;
			local7.anInt1215 = local140 + arg6 << 9;
			local7.anInt1211 = arg4.anInt954;
			local7.anInt1213 = arg4.anInt965;
			local7.anInt1200 = arg4.anInt995;
			local7.anInt1214 = arg4.anInt973;
			local7.anIntArray150 = arg4.anIntArray125;
			if (arg4.anIntArray127 != null) {
				local7.aBoolean74 = true;
				local7.method1182();
			}
			if (local7.anIntArray150 != null) {
				local7.anInt1202 = (int) (Math.random() * (double) (local7.anInt1213 - local7.anInt1200)) + local7.anInt1200;
			}
			Static237.aClass37_49.method970(local7);
			return;
		}
		if (arg2 != null) {
			local7.aClass49_Sub2_Sub2_Sub2_1 = arg2;
			@Pc(38) Class196 local38 = arg2.aClass196_1;
			if (local38.anIntArray570 != null) {
				local7.aBoolean74 = true;
				local38 = local38.method4855(Static251.aClass119_1);
			}
			if (local38 != null) {
				local7.anInt1208 = arg3 + local38.anInt5718 << 9;
				local7.anInt1215 = arg6 + local38.anInt5718 << 9;
				local7.anInt1214 = Static74.method1286(arg2);
				local7.anInt1199 = local38.anInt5695 << 9;
				local7.anInt1211 = local38.anInt5694;
			}
			Static487.aClass37_88.method970(local7);
			return;
		}
		if (arg5 == null) {
			return;
		}
		local7.aClass49_Sub2_Sub2_Sub1_2 = arg5;
		local7.anInt1215 = arg5.method3788() + arg6 << 9;
		local7.anInt1208 = arg5.method3788() + arg3 << 9;
		local7.anInt1214 = Static290.method6962(arg5);
		local7.anInt1199 = arg5.anInt1763 << 9;
		local7.anInt1211 = arg5.anInt1772;
		Static403.aClass17_31.method737(local7, (long) arg5.anInt4295);
		return;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z")
	public static boolean method2615(@OriginalArg(1) int arg0) {
		if (arg0 == 12 || arg0 == 23 || arg0 == 46 || arg0 == 15 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)I")
	public static int method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
	public static int method2617(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method2622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static483.method6631(arg1, arg0) || Static399.method6031(arg0, arg1);
	}
}
