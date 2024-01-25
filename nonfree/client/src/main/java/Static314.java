import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_106 = new Class133(16, 6);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!tt;II)V")
	public static void method5089(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt8592 && arg0 != -1) {
			@Pc(20) Class122 local20 = Static46.aClass247_1.method6029(arg0);
			@Pc(23) int local23 = local20.anInt4145;
			if (local23 == 1) {
				arg1.anInt8579 = 1;
				arg1.anInt8584 = 0;
				arg1.anInt8575 = arg2;
				arg1.anInt8580 = 0;
				arg1.anInt8583 = 0;
				Static448.method6790(false, arg1.anInt8811, arg1.anInt8813, arg1.aByte100, local20, arg1.anInt8584);
			}
			if (local23 == 2) {
				arg1.anInt8583 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt8592 == -1 || Static46.aClass247_1.method6029(arg0).anInt4146 >= Static46.aClass247_1.method6029(arg1.anInt8592).anInt4146) {
			arg1.anInt8600 = arg1.anInt8599;
			arg1.anInt8584 = 0;
			arg1.anInt8579 = 1;
			arg1.anInt8580 = 0;
			arg1.anInt8575 = arg2;
			arg1.anInt8592 = arg0;
			arg1.anInt8583 = 0;
			if (arg1.anInt8592 != -1) {
				Static448.method6790(false, arg1.anInt8811, arg1.anInt8813, arg1.aByte100, Static46.aClass247_1.method6029(arg1.anInt8592), arg1.anInt8584);
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILclient!bw;Lclient!bw;)V")
	public static void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub2 arg3, @OriginalArg(4) Class6_Sub2 arg4) {
		@Pc(4) Class290 local4 = Static326.method5207(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass6_Sub2_2 = arg3;
			local4.aClass6_Sub2_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
	public static int method5092(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)Z")
	public static boolean method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static85.method1757(arg0, arg1) || Static372.method5860(arg0, arg1);
	}
}
