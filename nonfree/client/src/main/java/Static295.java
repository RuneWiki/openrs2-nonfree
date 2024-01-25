import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!os", name = "D", descriptor = "[I")
	public static int[] anIntArray444;

	@OriginalMember(owner = "client!os", name = "E", descriptor = "I")
	public static int anInt5430;

	@OriginalMember(owner = "client!os", name = "A", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_72 = new Class212(64, 3);

	@OriginalMember(owner = "client!os", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray106 = new boolean[100];

	@OriginalMember(owner = "client!os", name = "C", descriptor = "I")
	public static int anInt5429 = 0;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!os", name = "H", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_167 = new Class214(70, -1);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!pg;ILclient!pg;)V")
	public static void method4509(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (arg1.aClass4_Sub1_58 != null) {
			arg1.method5985();
		}
		arg1.aClass4_Sub1_58 = arg0;
		arg1.aClass4_Sub1_57 = arg0.aClass4_Sub1_57;
		arg1.aClass4_Sub1_58.aClass4_Sub1_57 = arg1;
		arg1.aClass4_Sub1_57.aClass4_Sub1_58 = arg1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!sh;)V")
	public static void method4511(@OriginalArg(1) Class4_Sub36 arg0) {
		if (Static294.aClass162ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface12 local8 = null;
		if (arg0.anInt6598 == 0) {
			local8 = (Interface12) Static278.method4397(arg0.anInt6599, arg0.anInt6592, arg0.anInt6587);
		}
		if (arg0.anInt6598 == 1) {
			local8 = (Interface12) Static177.method3233(arg0.anInt6599, arg0.anInt6592, arg0.anInt6587);
		}
		if (arg0.anInt6598 == 2) {
			local8 = (Interface12) Static422.method5870(arg0.anInt6599, arg0.anInt6592, arg0.anInt6587, wo.class);
		}
		if (arg0.anInt6598 == 3) {
			local8 = (Interface12) Static241.method4021(arg0.anInt6599, arg0.anInt6592, arg0.anInt6587);
		}
		if (local8 == null) {
			arg0.anInt6593 = 0;
			arg0.anInt6590 = -1;
			arg0.anInt6586 = 0;
		} else {
			arg0.anInt6590 = local8.method6320();
			arg0.anInt6586 = local8.method6318();
			arg0.anInt6593 = local8.method6316();
		}
	}
}
