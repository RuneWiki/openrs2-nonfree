import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "Lclient!cj;")
	public static Class55 aClass55_7;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static int anInt7474;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Lclient!qk;")
	public static Class288 aClass288_250 = null;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!vj;I)V")
	public static void method6319(@OriginalArg(0) Class2_Sub22 arg0) {
		if (arg0.aByteArray115.length - arg0.anInt10247 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method8547();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray115.length - arg0.anInt10247 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method8546();
		if (arg0.aByteArray115.length - arg0.anInt10247 < local46 * 6) {
			return;
		}
		for (@Pc(69) int local69 = 0; local69 < local46; local69++) {
			@Pc(77) int local77 = arg0.method8546();
			@Pc(81) int local81 = arg0.method8542();
			if (Static171.anIntArray203.length > local77 && Static410.aBooleanArray116[local77] && (Static274.aClass48_1.method919(local77).aChar5 != '1' || local81 >= -1 && local81 <= 1)) {
				Static171.anIntArray203[local77] = local81;
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method6320() {
		if (!Static362.aBoolean421) {
			Static68.aBoolean87 = true;
			Static362.aBoolean421 = true;
			Static16.aFloat3 += (12.0F - Static16.aFloat3) / 2.0F;
		}
	}
}
