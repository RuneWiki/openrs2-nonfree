import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public static int anInt7340;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!wm;")
	public static Class348 aClass348_2;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public static int anInt7341;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void method6185() {
		@Pc(16) byte[] local16;
		if (Static23.anObject1 == null) {
			@Pc(9) Class45_Sub2_Sub1 local9 = new Class45_Sub2_Sub1();
			local16 = local9.method3979();
			Static23.anObject1 = Static399.method8034(local16);
		}
		if (Static497.anObject21 == null) {
			@Pc(32) Class45_Sub1_Sub1 local32 = new Class45_Sub1_Sub1();
			local16 = local32.method1198();
			Static497.anObject21 = Static399.method8034(local16);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)Z")
	public static boolean method6186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
