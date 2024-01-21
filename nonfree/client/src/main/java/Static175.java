import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt4257;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
	public static int anInt4256 = 0;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1173 = Static158.method3034(" ");

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1174 = Static158.method3034(" loggt sich aus)3");

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1175 = aClass60_1173;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
	public static int anInt4268 = 0;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1176 = Static158.method3034(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIILclient!hi;II)V")
	public static void method3272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class35 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) long local5 = 0L;
		if (arg4 == 0) {
			local5 = Static197.method3579(arg0, arg2, arg5);
		}
		if (arg4 == 1) {
			local5 = Static102.method2330(arg0, arg2, arg5);
		}
		if (arg4 == 2) {
			local5 = Static41.method911(arg0, arg2, arg5);
		}
		if (arg4 == 3) {
			local5 = Static160.method1485(arg0, arg2, arg5);
		}
		if (local5 == 0L) {
			return;
		}
		@Pc(62) int local62 = (int) local5 >> 14 & 0x1F;
		@Pc(69) int local69 = (int) local5 >> 20 & 0x3;
		@Pc(76) int local76 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
		@Pc(80) Class2_Sub1_Sub9 local80 = Static158.method3037(local76);
		if (arg4 == 0) {
			Static50.method1147(arg0, arg2, arg5);
			if (local80.anInt1674 != 0) {
				arg3.method1675(arg5, local69, local62, local80.aBoolean63, arg2);
			}
		}
		if (arg4 == 1) {
			Static82.method1926(arg0, arg2, arg5);
		}
		if (arg4 == 2) {
			Static112.method2468(arg0, arg2, arg5);
			if (local80.anInt1674 != 0 && arg2 + local80.anInt1688 < 104 && arg5 + local80.anInt1688 < 104 && local80.anInt1683 + arg2 < 104 && local80.anInt1683 + arg5 < 104) {
				arg3.method1668(arg5, local80.aBoolean63, arg2, local80.anInt1688, local80.anInt1683, local69);
			}
		}
		if (arg4 != 3) {
			return;
		}
		Static90.method2062(arg0, arg2, arg5);
		if (local80.anInt1674 == 1) {
			arg3.method1674(arg2, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class2_Sub6 local12 = null;
		for (@Pc(17) Class2_Sub6 local17 = (Class2_Sub6) Static190.aClass67_14.method2848(); local17 != null; local17 = (Class2_Sub6) Static190.aClass67_14.method2851()) {
			if (local17.anInt1915 == arg7 && arg1 == local17.anInt1921 && local17.anInt1926 == arg6 && local17.anInt1928 == arg4) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class2_Sub6();
			local12.anInt1915 = arg7;
			local12.anInt1926 = arg6;
			local12.anInt1928 = arg4;
			local12.anInt1921 = arg1;
			Static168.method3120(local12);
			Static190.aClass67_14.method2843(local12);
		}
		local12.anInt1927 = arg2;
		local12.anInt1929 = arg3;
		local12.anInt1913 = arg0;
		local12.anInt1916 = arg8;
		local12.anInt1912 = arg5;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!pe;ZIIII)V")
	public static void method3276(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) int arg2) {
		Static22.anInt704 = 2;
		Static179.anInt4363 = 1;
		Static165.aBoolean161 = false;
		Static52.anInt1623 = 0;
		Static53.anInt1661 = arg2;
		Static108.aClass13_24 = arg1;
		Static163.anInt4052 = arg0;
	}
}
