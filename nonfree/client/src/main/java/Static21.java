import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!of;")
	public static Class61 aClass61_2;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!nb;")
	public static Class57 aClass57_20 = new Class57(128);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1049 = Static65.method1172("Versteckt");

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
	public static int[] anIntArray339 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1050 = Static65.method1172("(U");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public static int anInt3035 = 0;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	public static int anInt3036 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 method2161() {
		@Pc(9) Class3_Sub2_Sub3_Sub3 local9 = new Class3_Sub2_Sub3_Sub3();
		local9.anInt2695 = Static116.anInt2760;
		local9.anInt2694 = Static54.anIntArray131[0];
		local9.anInt2698 = Static87.anIntArray219[0];
		local9.anInt2693 = Static71.anIntArray172[0];
		local9.anInt2696 = Static168.anInt3719;
		local9.anInt2697 = Static135.anIntArray363[0];
		@Pc(47) int local47 = local9.anInt2694 * local9.anInt2698;
		local9.anIntArray301 = new int[local47];
		@Pc(55) byte[] local55 = Static32.aByteArrayArray4[0];
		for (@Pc(57) int local57 = 0; local57 < local47; local57++) {
			local9.anIntArray301[local57] = Static90.anIntArray226[local55[local57] & 0xFF];
		}
		Static181.method2896();
		return local9;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	public static void method2162() {
		Static65.aClass57_15.method1715();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method2163() {
		aClass57_20 = null;
		anIntArray339 = null;
		aClass46_1050 = null;
		aClass61_2 = null;
		aClass46_1049 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public static void method2166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static68.anInt1768 != 0 && arg0 != -1) {
			Static40.method845(Static68.anInt1768, 0, arg0, Static91.aClass44_Sub1_9);
			Static150.aBoolean146 = true;
		}
	}
}
