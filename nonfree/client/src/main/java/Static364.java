import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
	public static int anInt6864;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
	public static final int anInt6865 = 50;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[anInt6865];

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "[I")
	public static final int[] anIntArray526 = new int[anInt6865];

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "[I")
	public static final int[] anIntArray527 = new int[anInt6865];

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "[I")
	public static final int[] anIntArray528 = new int[anInt6865];

	@OriginalMember(owner = "client!pca", name = "v", descriptor = "[I")
	public static final int[] anIntArray529 = new int[anInt6865];

	@OriginalMember(owner = "client!pca", name = "w", descriptor = "[I")
	public static final int[] anIntArray530 = new int[anInt6865];

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "[I")
	public static final int[] anIntArray531 = new int[anInt6865];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!no;)V")
	public static void method5844(@OriginalArg(1) Class2_Sub29_Sub2 arg0) {
		arg0.method5244();
		@Pc(10) int local10 = Static174.anInt3154;
		@Pc(20) Class1_Sub1_Sub2_Sub1 local20 = Static266.aClass1_Sub1_Sub2_Sub1_1 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local10] = new Class1_Sub1_Sub2_Sub1();
		local20.anInt5076 = local10;
		@Pc(28) int local28 = arg0.method5248(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray450[0] = local39 - Static238.anInt4280;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt7660 = (local20.anIntArray450[0] << 7) + (local20.method4394() << 6);
		local20.anIntArray449[0] = local51 - Static371.anInt6936;
		local20.anInt7659 = (local20.anIntArray449[0] << 7) + (local20.method4394() << 6);
		Static208.anInt3742 = local20.aByte90 = local33;
		if (Static12.aClass2_Sub29Array1[local10] != null) {
			local20.method2942(Static12.aClass2_Sub29Array1[local10]);
		}
		Static16.anInt362 = 0;
		Static325.anIntArray473[Static16.anInt362++] = local10;
		Static408.aByteArray119[local10] = 0;
		Static179.anInt3323 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local10 != local127) {
				@Pc(141) int local141 = arg0.method5248(18);
				@Pc(145) int local145 = local141 >> 16;
				@Pc(151) int local151 = local141 >> 8 & 0xFF;
				@Pc(155) int local155 = local141 & 0xFF;
				@Pc(163) Class317 local163 = Static370.aClass317Array1[local127] = new Class317();
				local163.anInt9354 = 0;
				local163.anInt9352 = -1;
				local163.aBoolean676 = false;
				local163.anInt9356 = local155 + (local145 << 28) + (local151 << 14);
				Static537.anIntArray757[Static179.anInt3323++] = local127;
				Static408.aByteArray119[local127] = 0;
			}
		}
		arg0.method5241();
	}
}
