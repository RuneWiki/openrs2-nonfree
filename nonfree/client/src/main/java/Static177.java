import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt4018;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!nd;")
	public static Class59 aClass59_30 = new Class59(5);

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1406 = Static120.method2057("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILclient!fb;J)V")
	public static void method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub1 arg4, @OriginalArg(5) long arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class42 local6 = new Class42();
		local6.aClass1_Sub2_Sub1_3 = arg4;
		local6.anInt1834 = arg1 * 128 + 64;
		local6.anInt1830 = arg2 * 128 + 64;
		local6.anInt1836 = arg3;
		local6.aLong66 = arg5;
		if (Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local6;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!tg;)V")
	public static void method3059(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		Static104.aClass1_Sub8_Sub1_2.method366(103);
		Static104.aClass1_Sub8_Sub1_2.method335(arg1.method2821());
		Static104.aClass1_Sub8_Sub1_2.method340(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I")
	public static int method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg1 > 0) {
			local8 = local8 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local8;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method3061() {
		aClass81_1406 = null;
		aClass59_30 = null;
	}
}
