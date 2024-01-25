import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!fh;I)Z")
	public static boolean method2122(@OriginalArg(0) Class107 arg0) {
		return Static299.aClass107_4 == arg0 || Static223.aClass107_3 == arg0 || Static354.aClass107_6 == arg0 || arg0 == Static118.aClass107_1;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IBZLclient!in;III)V")
	public static void method2123(@OriginalArg(0) int arg0, @OriginalArg(3) Class157 arg1, @OriginalArg(4) int arg2) {
		Static267.anInt5676 = arg0;
		Static122.aBoolean721 = false;
		Static603.aClass2_Sub8_Sub3_5 = null;
		Static177.anInt4267 = arg2;
		Static436.anInt8106 = 2;
		Static614.anInt10750 = 1;
		Static77.anInt10672 = 0;
		Static42.aClass157_33 = arg1;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILclient!ke;)I")
	public static int method2125(@OriginalArg(1) Class3_Sub1_Sub3_Sub3_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6139;
		@Pc(12) Class311 local12 = arg0.method5200();
		if (arg0.anInt6064 == -1 || arg0.aBoolean450) {
			local8 = arg0.anInt6123;
		} else if (arg0.anInt6064 == local12.anInt9389 || local12.anInt9390 == arg0.anInt6064 || arg0.anInt6064 == local12.anInt9414 || local12.anInt9385 == arg0.anInt6064) {
			local8 = arg0.anInt6108;
		} else if (arg0.anInt6064 == local12.anInt9406 || arg0.anInt6064 == local12.anInt9394 || local12.anInt9412 == arg0.anInt6064 || local12.anInt9422 == arg0.anInt6064) {
			local8 = arg0.anInt6114;
		}
		return local8;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)Z")
	public static boolean method2126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static370.method6241(arg1, arg0) || Static586.method8661(arg0, arg1);
	}
}
