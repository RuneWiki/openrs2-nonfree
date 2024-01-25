import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qk", name = "J", descriptor = "[Lclient!jb;")
	public static Class126[] aClass126Array2;

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "[S")
	public static final short[] aShortArray55 = new short[] { 16, 21, 10, 13, 3, 22, 60, 17 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
	public static void method2431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) float local17 = (float) Static137.anInt5580 / (float) Static137.anInt5588;
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = arg1;
		if (local17 < 1.0F) {
			local21 = (int) (local17 * (float) arg2);
		} else {
			local19 = (int) ((float) arg1 / local17);
		}
		@Pc(48) int local48 = arg0 - (arg1 - local21) / 2;
		@Pc(57) int local57 = arg3 - (arg2 - local19) / 2;
		Static4.anInt162 = Static137.anInt5580 - local48 * Static137.anInt5580 / local21;
		Static367.anInt6516 = -1;
		Static348.anInt6296 = local57 * Static137.anInt5588 / local19;
		Static97.anInt2094 = -1;
		Static28.method540();
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public static void method2432() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static278.anInt7278 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!m;BLclient!ns;)V")
	public static void method2433(@OriginalArg(0) Interface10 arg0, @OriginalArg(2) Class166 arg1) {
		Static227.aClass166_163 = arg1;
		Static376.anInterface10_8 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
	public static void method2434() {
		Static413.aClass30_12.ua(((float) Static126.aClass67_Sub1_1.anInt5842 * 0.1F + 0.7F) * 1.1523438F);
		Static413.aClass30_12.XA(Static356.anInt6380, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static413.aClass30_12.V(Static91.anInt1984, -1, 256);
		Static413.aClass30_12.method4667(Static437.aClass59_4);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method2435(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(22) byte[] local22 = (byte[]) arg0;
			return arg1 ? Static202.method2933(local22) : local22;
		} else if (arg0 instanceof Class122) {
			@Pc(36) Class122 local36 = (Class122) arg0;
			return local36.method2592();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLclient!uf;ZIILclient!uf;I)I")
	public static int method2436(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class84_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = Static439.method5661(arg1, arg2, arg3, arg4);
		if (local12 != 0) {
			return arg2 ? -local12 : local12;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static439.method5661(arg1, arg0, arg5, arg4);
			return arg0 ? -local39 : local39;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIII)V")
	public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static209.method2982(Static272.aClass36_88);
		}
		if (arg0 == 1) {
			Static209.method2982(Static12.aClass36_7);
		}
		Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
		Static116.aClass4_Sub30_Sub1_1.method4828(Static285.anInt5187 + arg2);
		Static116.aClass4_Sub30_Sub1_1.method4835(arg1 + Static381.anInt6688);
		Static319.aBoolean380 = false;
		Static454.anInt7591 = arg1;
		Static52.anInt1390 = arg2;
		Static200.method2884();
	}
}
