import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public static int anInt7318;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_17 = new Class163(8, 7);

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "[I")
	public static int[] anIntArray491 = new int[2];

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method5798() {
		if (Static50.aBoolean74) {
			return;
		}
		Static68.method1035(Static107.aClass258ArrayArrayArray2);
		if (Static102.aClass258ArrayArrayArray1 != null) {
			Static68.method1035(Static102.aClass258ArrayArrayArray1);
		}
		Static50.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!uu;Z)V")
	public static void method5802(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		arg0.method5605();
		@Pc(10) int local10 = Static43.anInt5302;
		@Pc(20) Class2_Sub1_Sub3_Sub2 local20 = Static220.aClass2_Sub1_Sub3_Sub2_1 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local10] = new Class2_Sub1_Sub3_Sub2();
		local20.anInt6126 = local10;
		@Pc(28) int local28 = arg0.method5610(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray434[0] = local39 - Static31.anInt618;
		@Pc(55) int local55 = local28 & 0x3FFF;
		local20.anInt7500 = (local20.anIntArray434[0] << 7) + (local20.method4913() << 6);
		local20.anIntArray433[0] = local55 - Static226.anInt3768;
		local20.anInt7502 = (local20.anIntArray433[0] << 7) + (local20.method4913() << 6);
		Static6.anInt131 = local20.aByte105 = local33;
		if (Static21.aClass5_Sub15Array1[local10] != null) {
			local20.method4923(Static21.aClass5_Sub15Array1[local10]);
		}
		Static31.anInt622 = 0;
		Static334.anIntArray387[Static31.anInt622++] = local10;
		Static56.aByteArray9[local10] = 0;
		Static288.anInt4491 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local10 != local125) {
				@Pc(135) int local135 = arg0.method5610(18);
				@Pc(139) int local139 = local135 >> 16;
				@Pc(145) int local145 = local135 >> 8 & 0xFF;
				@Pc(149) int local149 = local135 & 0xFF;
				@Pc(157) Class105 local157 = Static99.aClass105Array1[local125] = new Class105();
				local157.anInt2839 = local149 + (local139 << 28) + (local145 << 14);
				local157.anInt2833 = -1;
				local157.aBoolean182 = false;
				local157.anInt2835 = 0;
				Static62.anIntArray49[Static288.anInt4491++] = local125;
				Static56.aByteArray9[local125] = 0;
			}
		}
		arg0.method5612();
	}
}
