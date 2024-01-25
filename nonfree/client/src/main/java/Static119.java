import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIZ)V")
	public static void method2268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static667.aFloat212 = (float) local11;
		Static618.aFloat207 = (float) local15;
		if (Static428.anInt6834 == 2) {
			Static520.anInt8367 = local11;
			Static57.anInt1188 = local15;
			Static631.anInt10060 = 0;
		}
		Static58.method1275();
		Static214.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!or;)Lclient!or;")
	public static Class260 method2271(@OriginalArg(1) Class260 arg0) {
		if (arg0.anInt6993 != -1) {
			return Static383.method5492(arg0.anInt6993);
		}
		@Pc(24) int local24 = arg0.anInt6930 >>> 16;
		@Pc(29) Class394 local29 = new Class394(Static455.aClass83_31);
		for (@Pc(34) Class3_Sub46 local34 = (Class3_Sub46) local29.method9370(); local34 != null; local34 = (Class3_Sub46) local29.method9366()) {
			if (local34.anInt7855 == local24) {
				return Static383.method5492((int) local34.aLong311);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
	public static void method2272() {
		Static300.aClass63_4.method1440();
		Static468.aClass306_5.method7678();
		Static635.aClass386_2.method9138();
		Static652.aClass267_4.method6679();
		Static580.aClass36_2.method1062();
		Static170.aClass370_1.method8897();
		Static243.aClass343_3.method8350();
		Static354.aClass236_2.method5614();
		Static264.aClass110_1.method3158();
		Static411.aClass70_1.method1706();
		Static210.aClass199_2.method5032();
		Static282.aClass52_1.method1312();
		Static84.aClass27_1.method696();
		Static370.aClass377_4.method9042();
		Static467.aClass367_1.method8817();
		Static617.aClass320_1.method7840();
		Static559.aClass340_1.method8285();
		Static38.aClass75_1.method2034();
		Static74.aClass86_1.method2443();
		Static634.aClass253_2.method6176();
		Static155.aClass275_1.method6769();
		Static138.aClass131_1.method3758();
		Static128.method2419();
		Static375.method5439();
		Static655.method9117();
		Static47.method1146();
		Static136.method2520();
		Static349.aClass165_37.method4394(5);
		Static291.aClass165_33.method4394(5);
		Static658.aClass165_85.method4394(5);
		Static403.aClass165_45.method4394(5);
		Static565.aClass165_64.method4394(5);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)V")
	public static void method2273(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub11_Sub4 local15 = Static583.method8201(10, (long) arg0);
		local15.method2194();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V")
	public static void method2274(@OriginalArg(1) int arg0) {
		Static316.anInt5278 = arg0;
		@Pc(7) Class165 local7 = Static312.aClass165_36;
		synchronized (Static312.aClass165_36) {
			Static312.aClass165_36.method4403();
		}
	}
}
