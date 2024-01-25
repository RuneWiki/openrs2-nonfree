import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "[Lclient!sj;")
	public static Class310[] aClass310Array1;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "Lclient!mfa;")
	public static final Class215 aClass215_3 = new Class215(2);

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "[I")
	public static final int[] anIntArray407 = new int[1];

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_95 = new Class130(18, 8);

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "[I")
	public static final int[] anIntArray408 = new int[14];

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_28 = new Class280(64);

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "Lclient!qp;")
	public static Class280 aClass280_29 = new Class280(8);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	public static void method5858() {
		Static422.method6617();
		Static191.aClass200_47 = null;
		Static66.aClass200_16 = null;
		Static149.aClass200_28 = null;
		Static272.anInt4948 = 0;
		Static458.anInt8066 = 0;
		Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
		Static61.aClass200_15 = null;
		Static343.anInt6699 = 0;
		Static209.method3563();
		Static291.method4632();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local30] = null;
		}
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 = null;
		for (@Pc(44) int local44 = 0; local44 < Static294.anInt5193; local44++) {
			@Pc(51) Class4_Sub1_Sub2_Sub1_Sub1 local51 = Static28.aClass3_Sub28Array1[local44].aClass4_Sub1_Sub2_Sub1_Sub1_2;
			if (local51 != null) {
				local51.anInt5744 = -1;
			}
		}
		Static482.method7191();
		Static305.anInt5422 = 1;
		Static331.anInt6175 = -1;
		Static530.anInt9071 = -1;
		Static256.method4279(10);
		for (@Pc(73) int local73 = 0; local73 < 100; local73++) {
			Static477.aBooleanArray21[local73] = true;
		}
		Static48.method1426();
		Static235.aLong130 = 0L;
		Static593.aClass3_Sub42_2 = null;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIZ)Z")
	public static boolean method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
	public static void method5861() {
		if (Static532.aClass304_8 == null) {
			return;
		}
		if (Static532.aClass304_8.anInt8838 == 1) {
			Static532.aClass304_8 = null;
			return;
		}
		if (Static532.aClass304_8.anInt8838 == 2) {
			Static541.method7919(Static443.aClass138_3, 2, Static365.aString76);
			Static532.aClass304_8 = null;
			return;
		}
	}
}
