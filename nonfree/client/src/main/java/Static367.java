import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_92 = new Class71(22, 3);

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	public static int anInt6975 = -1;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Lclient!tp;")
	public static Class331 aClass331_11 = null;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "[I")
	public static final int[] anIntArray389 = new int[13];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oh;I)V")
	public static void method5729(@OriginalArg(0) Class237 arg0) {
		Static324.aClass237_86 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILclient!vp;)V")
	public static void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub1_Sub3 arg3) {
		@Pc(4) Class56 local4 = Static262.method4601(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass15_Sub1_Sub3_1 = arg3;
		@Pc(16) int local16 = Static34.aClass86Array5 == Static253.aClass86Array4 ? 1 : 0;
		if (arg3.method8320()) {
			if (arg3.method8328()) {
				arg3.aClass15_Sub1_23 = Static351.aClass15_Sub1Array4[local16];
				Static351.aClass15_Sub1Array4[local16] = arg3;
				return;
			}
			arg3.aClass15_Sub1_23 = Static234.aClass15_Sub1Array3[local16];
			Static234.aClass15_Sub1Array3[local16] = arg3;
			Static147.aBoolean271 = true;
			return;
		}
		arg3.aClass15_Sub1_23 = Static16.aClass15_Sub1Array1[local16];
		Static16.aClass15_Sub1Array1[local16] = arg3;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([[[Lclient!cj;I)V")
	public static void method5736(@OriginalArg(0) Class56[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class56[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class56 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass15_Sub1_Sub3_1 instanceof Interface27) {
							((Interface27) local31.aClass15_Sub1_Sub3_1).method8338();
						}
						if (local31.aClass15_Sub1_Sub5_1 instanceof Interface27) {
							((Interface27) local31.aClass15_Sub1_Sub5_1).method8338();
						}
						if (local31.aClass15_Sub1_Sub5_2 instanceof Interface27) {
							((Interface27) local31.aClass15_Sub1_Sub5_2).method8338();
						}
						if (local31.aClass15_Sub1_Sub4_2 instanceof Interface27) {
							((Interface27) local31.aClass15_Sub1_Sub4_2).method8338();
						}
						if (local31.aClass15_Sub1_Sub4_1 instanceof Interface27) {
							((Interface27) local31.aClass15_Sub1_Sub4_1).method8338();
						}
						for (@Pc(81) Class152 local81 = local31.aClass152_2; local81 != null; local81 = local81.aClass152_3) {
							@Pc(86) Class15_Sub1_Sub2 local86 = local81.aClass15_Sub1_Sub2_1;
							if (local86 instanceof Interface27) {
								((Interface27) local86).method8338();
							}
						}
					}
				}
			}
		}
	}
}
