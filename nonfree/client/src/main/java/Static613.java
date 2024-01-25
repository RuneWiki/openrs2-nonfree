import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_110 = new Class286(88, 7);

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Lclient!kr;")
	public static final Class216 aClass216_12 = new Class216();

	@OriginalMember(owner = "client!th", name = "r", descriptor = "[I")
	public static final int[] anIntArray549 = new int[500];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
	public static int method8355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local14 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local14;
		} else {
			return local14;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	public static void method8356(@OriginalArg(1) int arg0) {
		Static407.anInt7261 = -1;
		Static332.anInt5824 = -1;
		Static481.anInt8380 = arg0;
		Static276.method4222(0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method8358(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(4, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!mka;IIII)V")
	public static void method8359(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class3_Sub53 local15 = null;
		for (@Pc(20) Class3_Sub53 local20 = (Class3_Sub53) Static3.aClass357_1.method8391(); local20 != null; local20 = (Class3_Sub53) Static3.aClass357_1.method8392()) {
			if (arg3 == local20.anInt10313 && local20.anInt10319 == arg0 && arg4 == local20.anInt10317 && arg2 == local20.anInt10320) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class3_Sub53();
			local15.anInt10320 = arg2;
			local15.anInt10317 = arg4;
			local15.anInt10313 = arg3;
			local15.anInt10319 = arg0;
			Static3.aClass357_1.method8401(local15);
		}
		local15.aClass241_2 = arg1;
		local15.aBoolean745 = false;
		local15.aBoolean746 = true;
	}
}
