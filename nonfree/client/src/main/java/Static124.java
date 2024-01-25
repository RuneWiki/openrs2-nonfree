import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
	public static final int[] anIntArray130 = new int[1];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ[B)V")
	public static void method2319(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static663.aClass6_Sub15_176 == null) {
			Static663.aClass6_Sub15_176 = new Class6_Sub15(20000);
		}
		Static663.aClass6_Sub15_176.method2988(0, arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static257.method4501(Static663.aClass6_Sub15_176.aByteArray20);
		Static59.aClass204_Sub1Array1 = new Class204_Sub1[Static253.anInt4796];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = Static535.anInt4137; local42 <= Static39.anInt536; local42++) {
			@Pc(50) Class204_Sub1 local50 = Static517.method7487(local42);
			if (local50 != null) {
				Static59.aClass204_Sub1Array1[local40++] = local50;
			}
		}
		Static112.aBoolean191 = false;
		Static235.aLong138 = Static549.method7758();
		Static663.aClass6_Sub15_176 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
	public static void method2320(@OriginalArg(1) boolean arg0) {
		Static568.aClass109_13.method4595(Static409.aClass75_13.method6636());
		@Pc(10) int[] local10 = Static409.aClass75_13.Y();
		Static314.anInt5449 = local10[0];
		Static18.anInt253 = local10[2];
		Static197.anInt4041 = local10[3];
		Static101.anInt2046 = local10[1];
		if (arg0) {
			Static409.aClass75_13.DA(Static358.anInt6041, Static239.anInt4631, Static652.anInt10041, Static142.anInt2953);
			Static645.method8045(Static683.aDouble56);
		} else {
			Static409.aClass75_13.DA(Static649.anInt10005, Static92.anInt1370, Static508.anInt3295, Static373.anInt6283);
			Static645.method8045(Static276.aDouble20);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)[Lclient!gia;")
	public static Class136[] method2322() {
		return new Class136[] { Static608.aClass136_4, Static91.aClass136_2, Static71.aClass136_1 };
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[S)[S")
	public static short[] method2323(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(21) short[] local21 = new short[arg0.length];
			Static695.method5642(arg0, 0, local21, 0, arg0.length);
			return local21;
		}
	}
}
