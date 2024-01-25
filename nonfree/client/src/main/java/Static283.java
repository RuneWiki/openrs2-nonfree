import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public static int anInt4897;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	public static int anInt4900;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public static int anInt4895 = -1;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "F")
	public static float aFloat70 = 0.0F;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "[I")
	public static final int[] anIntArray962 = new int[3];

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
	public static final int anInt4899 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method4311(@OriginalArg(1) Class4 arg0) {
		if (!Static110.aBoolean180) {
			return;
		}
		Static216.method3597(Static225.aClass11_67);
		Static372.aClass2_Sub16_Sub2_4.method5355(arg0.anInt94);
		Static372.aClass2_Sub16_Sub2_4.method5318(Static284.anInt4920);
		Static372.aClass2_Sub16_Sub2_4.method5365(arg0.lb);
		Static372.aClass2_Sub16_Sub2_4.method5355(Static23.anInt501);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg0.anInt58);
		Static372.aClass2_Sub16_Sub2_4.method5365(Static309.anInt5189);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	public static void method4312(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub10_Sub2 local10 = Static217.method3611(arg0, 11);
		local10.method859();
	}
}
