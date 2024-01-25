import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!paa", name = "R", descriptor = "Lclient!vk;")
	public static Class102_Sub1 aClass102_Sub1_2;

	@OriginalMember(owner = "client!paa", name = "V", descriptor = "Lclient!gr;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!paa", name = "ab", descriptor = "Z")
	public static boolean aBoolean484;

	@OriginalMember(owner = "client!paa", name = "L", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_339 = new Class305(92, 8);

	@OriginalMember(owner = "client!paa", name = "W", descriptor = "[I")
	public static final int[] anIntArray636 = new int[8];

	@OriginalMember(owner = "client!paa", name = "Y", descriptor = "I")
	public static final int anInt6548 = 4;

	@OriginalMember(owner = "client!paa", name = "Z", descriptor = "I")
	public static int anInt6549 = 0;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIBII)V")
	public static void method5895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static286.aClass1_Sub15_Sub1_1.anInt7030 != 0 && arg1 != 0 && Static482.anInt8558 < 50 && arg3 != -1) {
			Static314.aClass182Array1[Static482.anInt8558++] = new Class182((byte) 2, arg3, arg1, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!wda;Lclient!wda;I)V")
	public static void method5896(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_284 != null) {
			arg0.method8239();
		}
		arg0.aClass1_283 = arg1;
		arg0.aClass1_284 = arg1.aClass1_284;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aClass1_283.aClass1_284 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZIILclient!dn;)Lclient!fc;")
	public static Class96 method5898(@OriginalArg(2) int arg0, @OriginalArg(3) Class69 arg1) {
		@Pc(9) byte[] local9 = arg1.method1888(0, arg0);
		return local9 == null ? null : new Class96(local9);
	}
}
