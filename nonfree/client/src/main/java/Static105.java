import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!re", name = "R", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1299 = Static108.method1915("Von:");

	@OriginalMember(owner = "client!re", name = "V", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1300 = Static108.method1915("null");

	@OriginalMember(owner = "client!re", name = "X", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1301 = Static108.method1915("<col=ff0000>");

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1302 = Static108.method1915(":chalreq:");

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1304 = Static108.method1915("Add friend");

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1303 = aClass39_1304;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!r;III)V")
	public static void method1877(@OriginalArg(0) Class1_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2526 == arg1 && arg1 != -1) {
			@Pc(54) int local54 = Static82.method1398(arg1).anInt1049;
			if (local54 == 1) {
				arg0.anInt2534 = 0;
				arg0.anInt2492 = arg2;
				arg0.anInt2485 = 0;
				arg0.anInt2518 = 0;
			}
			if (local54 == 2) {
				arg0.anInt2518 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt2526 == -1 || Static82.method1398(arg1).anInt1038 >= Static82.method1398(arg0.anInt2526).anInt1038) {
			arg0.anInt2485 = 0;
			arg0.anInt2526 = arg1;
			arg0.anInt2482 = arg0.anInt2527;
			arg0.anInt2518 = 0;
			arg0.anInt2534 = 0;
			arg0.anInt2492 = arg2;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!tb;)V")
	public static void method1879(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt2821 == 0) {
			local5 = Static32.aClass5_2.method141(arg0.anInt2827, arg0.anInt2830, arg0.anInt2818);
		}
		if (arg0.anInt2821 == 1) {
			local5 = Static32.aClass5_2.method142(arg0.anInt2827, arg0.anInt2830, arg0.anInt2818);
		}
		if (arg0.anInt2821 == 2) {
			local5 = Static32.aClass5_2.method123(arg0.anInt2827, arg0.anInt2830, arg0.anInt2818);
		}
		if (arg0.anInt2821 == 3) {
			local5 = Static32.aClass5_2.method102(arg0.anInt2827, arg0.anInt2830, arg0.anInt2818);
		}
		if (local5 != 0) {
			local7 = local5 >> 14 & 0x7FFF;
			@Pc(98) int local98 = Static32.aClass5_2.method122(arg0.anInt2827, arg0.anInt2830, arg0.anInt2818, local5);
			local11 = local98 & 0x1F;
			local9 = local98 >> 6 & 0x3;
		}
		arg0.anInt2831 = local9;
		arg0.anInt2835 = local11;
		arg0.anInt2839 = local7;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
	public static void method1882() {
		aClass39_1299 = null;
		aClass39_1303 = null;
		aClass39_1300 = null;
		aClass39_1301 = null;
		aClass39_1304 = null;
		aClass39_1302 = null;
	}
}
