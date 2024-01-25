import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_138 = new Class133(109, -2);

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	public static int anInt7803 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!gea;")
	public static final Class3_Sub10_Sub6[] aClass3_Sub10_Sub6Array5 = new Class3_Sub10_Sub6[14];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method6461(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 14);
		local8.method6212();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILclient!eca;)V")
	public static void method6463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1_Sub2_Sub1 arg2) {
		if (arg2.anInt8592 == arg1 && arg1 != -1) {
			@Pc(24) Class122 local24 = Static46.aClass247_1.method6029(arg1);
			@Pc(27) int local27 = local24.anInt4145;
			if (local27 == 1) {
				arg2.anInt8575 = arg0;
				arg2.anInt8584 = 0;
				arg2.anInt8579 = 1;
				arg2.anInt8580 = 0;
				arg2.anInt8583 = 0;
				Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg2, arg2.anInt8811, arg2.anInt8813, arg2.aByte100, local24, arg2.anInt8584);
			}
			if (local27 == 2) {
				arg2.anInt8583 = 0;
				return;
			}
		} else if (arg1 == -1 || arg2.anInt8592 == -1 || Static46.aClass247_1.method6029(arg1).anInt4146 >= Static46.aClass247_1.method6029(arg2.anInt8592).anInt4146) {
			arg2.anInt8592 = arg1;
			arg2.anInt8600 = arg2.anInt8599;
			arg2.anInt8575 = arg0;
			arg2.anInt8579 = 1;
			arg2.anInt8580 = 0;
			arg2.anInt8584 = 0;
			arg2.anInt8583 = 0;
			if (arg2.anInt8592 == -1) {
				return;
			}
			Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg2, arg2.anInt8811, arg2.anInt8813, arg2.aByte100, Static46.aClass247_1.method6029(arg2.anInt8592), arg2.anInt8584);
		}
	}
}
