import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_76 = new Class40("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I")
	public static int method4242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4243(@OriginalArg(0) Class62 arg0) {
		if (Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 != Static193.anInt3734 && (Static152.aClass37ArrayArrayArray1 != null && Static320.method5148(arg0, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91))) {
			Static193.anInt3734 = Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91;
		}
	}
}
