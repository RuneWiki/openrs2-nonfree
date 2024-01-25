import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "Lclient!om;")
	public static Class246 aClass246_105;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_79 = new Class298(67, -1);

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	public static int anInt4190 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public static void method3701(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class203 local8 = Static582.method7699(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray29 != null) {
			@Pc(18) Class3_Sub45 local18 = new Class3_Sub45();
			local18.anObjectArray33 = local8.anObjectArray29;
			local18.aString115 = arg0;
			local18.anInt8340 = arg2;
			local18.aClass203_136 = local8;
			Static149.method2778(local18);
		}
		if (Static246.anInt4542 != 10 || !Static69.method1651(local8).method570(arg2 - 1)) {
			return;
		}
		@Pc(62) Class3_Sub34 local62;
		if (arg2 == 1) {
			local62 = Static374.method5522(Static113.aClass298_49, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 2) {
			local62 = Static374.method5522(Static391.aClass298_139, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 3) {
			local62 = Static374.method5522(Static334.aClass298_128, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 4) {
			local62 = Static374.method5522(Static129.aClass298_52, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 5) {
			local62 = Static374.method5522(Static545.aClass298_170, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 6) {
			local62 = Static374.method5522(Static568.aClass298_173, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 7) {
			local62 = Static374.method5522(Static81.aClass298_36, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 8) {
			local62 = Static374.method5522(Static366.aClass298_133, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 9) {
			local62 = Static374.method5522(Static52.aClass298_113, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
		if (arg2 == 10) {
			local62 = Static374.method5522(Static78.aClass298_58, Static220.aClass287_2);
			Static67.method1534(arg1, arg3, local62, local8.anInt5507);
			Static131.method2572(local62);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(DI)V")
	public static void method3703(@OriginalArg(0) double arg0) {
		if (Static178.aDouble11 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static273.anIntArray591[local7] = local19 <= 255 ? local19 : 255;
		}
		Static178.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class3_Sub3_Sub4 method3704(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub4 local10 = (Class3_Sub3_Sub4) Static261.aClass189_2.method4445((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static151.aClass246_77.method5653(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local10 = Static597.method7820(local25);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static261.aClass189_2.method4442((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method3708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = (arg0 & 0x37) == 0 ? Static330.method5099(arg0, arg1) : Static230.method3918(arg0, arg1);
		return local24 | (arg1 & 0x10000) != 0 | Static188.method3226(arg1, arg0);
	}
}
