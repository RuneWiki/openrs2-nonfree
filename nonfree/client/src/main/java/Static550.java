import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "Lclient!daa;")
	public static final Class60 aClass60_5 = new Class60();

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILclient!oe;ILclient!ada;IIB)V")
	public static void method7818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class249 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class7 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		Static204.aClass112_2 = null;
		Static45.aClass112_1 = null;
		Static15.anInt440 = arg4;
		Static615.anInt10064 = arg10;
		Static318.anInt5395 = arg3;
		Static375.anInt6323 = arg2;
		Static445.aClass112_3 = null;
		Static579.anInt9555 = arg5;
		Static381.anInt7650 = arg7;
		Static255.aClass249_9 = arg6;
		Static433.anInt7405 = arg1;
		Static86.anInt1676 = arg9;
		Static176.aClass7_5 = arg8;
		Static490.anInt8335 = arg0;
		Static487.method7082();
		Static636.aBoolean722 = true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLclient!ns;)V")
	public static void method7819(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt5100 > Static90.anInt1698) {
			Static100.method1649(arg1);
		} else if (arg1.anInt5117 >= Static90.anInt1698) {
			Static32.method788(arg1);
		} else {
			Static635.method8719(arg1, false);
			local9 = Static449.anInt7502;
			local7 = Static417.anInt7257;
		}
		@Pc(119) int local119;
		if (arg1.anInt10006 < 512 || arg1.anInt10001 < 512 || (Static491.anInt9856 - 1) * 512 <= arg1.anInt10006 || (Static393.anInt6574 - 1) * 512 <= arg1.anInt10001) {
			arg1.anInt5077 = -1;
			arg1.anInt5117 = 0;
			local7 = -1;
			local9 = 0;
			arg1.anInt5100 = 0;
			arg1.anIntArray296 = null;
			arg1.anInt10006 = arg1.anIntArray302[0] * 512 + arg1.method4326() * 256;
			arg1.anInt10001 = arg1.anIntArray301[0] * 512 + arg1.method4326() * 256;
			arg1.method4329();
			for (local119 = 0; local119 < arg1.aClass118Array3.length; local119++) {
				arg1.aClass118Array3[local119].anInt2965 = -1;
			}
		}
		if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 == arg1 && (arg1.anInt10006 < 6144 || arg1.anInt10001 < 6144 || arg1.anInt10006 >= Static491.anInt9856 * 512 - 6144 || arg1.anInt10001 >= Static393.anInt6574 * 512 - 6144)) {
			local9 = 0;
			local7 = -1;
			arg1.anInt5117 = 0;
			arg1.anInt5077 = -1;
			arg1.anInt5100 = 0;
			arg1.anIntArray296 = null;
			arg1.anInt10006 = arg1.anIntArray302[0] * 512 + arg1.method4326() * 256;
			arg1.anInt10001 = arg1.anIntArray301[0] * 512 + arg1.method4326() * 256;
			arg1.method4329();
			for (local119 = 0; local119 < arg1.aClass118Array3.length; local119++) {
				arg1.aClass118Array3[local119].anInt2965 = -1;
			}
		}
		local119 = Static555.method7832(arg1);
		Static29.method5712(arg1);
		Static559.method7888(local7, local119, local9, arg1);
		Static282.method4111(local7, arg1);
		Static148.method2141(arg1);
	}
}
