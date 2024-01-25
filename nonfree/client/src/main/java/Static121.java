import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_77 = new Class119(8);

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_51 = new Class93("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ae;BILclient!wq;I)V")
	public static void method2511(@OriginalArg(0) Class4 arg0, @OriginalArg(3) Class216 arg1) {
		Static56.aClass216_19.method5991();
		if (Static209.aBoolean434) {
			return;
		}
		for (@Pc(24) Class2_Sub31 local24 = (Class2_Sub31) arg1.method5992(); local24 != null; local24 = (Class2_Sub31) arg1.method6000()) {
			@Pc(31) Class120 local31 = Static278.method5042(local24.anInt4062);
			if (Static341.method5889(local31)) {
				@Pc(43) boolean local43 = Static216.method3813(local24, local31, arg0);
				if (local43) {
					Static225.method3967(local31, local24, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
	public static int method2513(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZZ)V")
	public static void method2514(@OriginalArg(1) boolean arg0) {
		Static159.method3016(Static136.anInt2829, arg0, Static198.anInt3876, Static111.anInt2471);
	}
}
