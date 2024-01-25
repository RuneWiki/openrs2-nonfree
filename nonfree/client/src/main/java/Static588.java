import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public static int anInt9618;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public static int anInt9613 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I")
	public static int method8283(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
	public static int method8284() {
		return Static336.anInt6302;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!rq;BI)V")
	public static void method8285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class299 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class3_Sub22 local14 = (Class3_Sub22) Static511.aClass223_55.method5874(); local14 != null; local14 = (Class3_Sub22) Static511.aClass223_55.method5870()) {
			if (local14.anInt3110 == arg0 && arg1 << 9 == local14.anInt3116 && local14.anInt3103 == arg3 << 9 && local14.aClass299_1.anInt8677 == arg2.anInt8677) {
				if (local14.aClass3_Sub7_Sub3_1 != null) {
					Static204.aClass3_Sub7_Sub1_1.method1621(local14.aClass3_Sub7_Sub3_1);
					local14.aClass3_Sub7_Sub3_1 = null;
				}
				if (local14.aClass3_Sub7_Sub3_2 != null) {
					Static204.aClass3_Sub7_Sub1_1.method1621(local14.aClass3_Sub7_Sub3_2);
					local14.aClass3_Sub7_Sub3_2 = null;
				}
				local14.method8769();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
	public static void method8286(@OriginalArg(1) int arg0) {
		Static416.anInt7576 = arg0;
		@Pc(7) Class102 local7 = Static83.aClass102_11;
		synchronized (Static83.aClass102_11) {
			Static83.aClass102_11.method2681();
		}
		local7 = Static613.aClass102_63;
		synchronized (Static613.aClass102_63) {
			Static613.aClass102_63.method2681();
		}
	}
}
