import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt6058;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Lclient!fc;")
	public static Class71 method5092(@OriginalArg(1) int arg0) {
		@Pc(10) Class71 local10 = (Class71) Static322.aClass154_100.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static241.aClass11_103.method288(arg0, 4);
		local10 = new Class71();
		if (local22 != null) {
			local10.method1498(arg0, new Class4_Sub7(local22));
		}
		local10.method1497(arg0);
		Static322.aClass154_100.method4221((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ur;B)I")
	public static int method5100(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) Class34 local8 = arg0.aClass34_1;
		if (local8.anIntArray108 != null) {
			local8 = local8.method748();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local8.anInt849;
		@Pc(26) Class10 local26 = arg0.method5428();
		if (arg0.aBoolean569) {
			local22 = local8.anInt853;
		} else if (arg0.anInt6540 == local26.anInt247 || local26.anInt211 == arg0.anInt6540 || arg0.anInt6540 == local26.anInt234 || arg0.anInt6540 == local26.anInt239) {
			local22 = local8.anInt864;
		} else if (arg0.anInt6540 == local26.anInt248 || local26.anInt224 == arg0.anInt6540 || local26.anInt238 == arg0.anInt6540 || arg0.anInt6540 == local26.anInt208) {
			local22 = local8.anInt873;
		}
		return local22;
	}
}
