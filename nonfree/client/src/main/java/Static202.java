import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt3588;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt3586 = 0;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
	public static final int[] anIntArray294 = new int[50];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method3170() {
		@Pc(16) byte[] local16;
		if (Static281.anObject3 == null) {
			@Pc(9) Class221_Sub2_Sub2 local9 = new Class221_Sub2_Sub2();
			local16 = local9.method7482();
			Static281.anObject3 = Static434.method6481(local16);
		}
		if (Static544.anObject17 == null) {
			@Pc(31) Class221_Sub1_Sub2 local31 = new Class221_Sub1_Sub2();
			local16 = local31.method7175();
			Static544.anObject17 = Static434.method6481(local16);
		}
	}
}
