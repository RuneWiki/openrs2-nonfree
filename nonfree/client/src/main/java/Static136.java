import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(II)I")
	public static int method2201(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!bu;B)V")
	public static void method2202(@OriginalArg(0) Class6_Sub6 arg0) {
		if (Static272.aClass97ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface12 local8 = null;
		if (arg0.anInt1251 == 0) {
			local8 = (Interface12) Static245.method5549(arg0.anInt1248, arg0.anInt1247, arg0.anInt1250);
		}
		if (arg0.anInt1251 == 1) {
			local8 = (Interface12) Static578.method5708(arg0.anInt1248, arg0.anInt1247, arg0.anInt1250);
		}
		if (arg0.anInt1251 == 2) {
			local8 = (Interface12) Static366.method5797(arg0.anInt1248, arg0.anInt1247, arg0.anInt1250, jn.class);
		}
		if (arg0.anInt1251 == 3) {
			local8 = (Interface12) Static158.method2999(arg0.anInt1248, arg0.anInt1247, arg0.anInt1250);
		}
		if (local8 == null) {
			arg0.anInt1246 = 0;
			arg0.anInt1254 = -1;
			arg0.anInt1249 = 0;
		} else {
			arg0.anInt1254 = local8.method9026();
			arg0.anInt1249 = local8.method9032();
			arg0.anInt1246 = local8.method9029();
		}
	}
}
