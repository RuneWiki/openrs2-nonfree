import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
	public static int anInt6899;

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "Z")
	public static boolean aBoolean496 = true;

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
	public static final int[] anIntArray460 = new int[5];

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
	public static int anInt6903 = 0;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!rl;)V")
	public static void method6021(@OriginalArg(1) Class16_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(19) Class2_Sub27 local19 = (Class2_Sub27) Static289.aClass323_19.method7484((long) arg0.anInt8075);
		if (local19 == null) {
			return;
		}
		if (local19.aClass2_Sub11_Sub4_3 != null) {
			Static622.aClass2_Sub11_Sub2_2.method2950(local19.aClass2_Sub11_Sub4_3);
			local19.aClass2_Sub11_Sub4_3 = null;
		}
		local19.method8920();
	}
}
