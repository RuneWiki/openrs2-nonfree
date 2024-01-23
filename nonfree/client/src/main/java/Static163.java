import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!sf;")
	public static Class157 aClass157_31 = new Class157(5);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method2981(@OriginalArg(0) Class2_Sub29 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt5694 == 0) {
			local5 = Static160.method4114(arg0.anInt5692, arg0.anInt5687, arg0.anInt5681);
		}
		if (arg0.anInt5694 == 1) {
			local5 = Static89.method1579(arg0.anInt5692, arg0.anInt5687, arg0.anInt5681);
		}
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg0.anInt5694 == 2) {
			local5 = Static166.method3026(arg0.anInt5692, arg0.anInt5687, arg0.anInt5681);
		}
		if (arg0.anInt5694 == 3) {
			local5 = Static202.method2141(arg0.anInt5692, arg0.anInt5687, arg0.anInt5681);
		}
		if (local5 != 0L) {
			local39 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local41 = (int) local5 >> 14 & 0x1F;
			local43 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt5684 = local41;
		arg0.anInt5689 = local39;
		arg0.anInt5691 = local43;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method2983(@OriginalArg(0) int arg0) {
		Static18.aFloatArray1[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static18.aFloatArray1[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static18.aFloatArray1[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static30.method576(3);
		Static30.method576(4);
	}
}
