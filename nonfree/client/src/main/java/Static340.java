import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "Lclient!uu;")
	public static Class249 aClass249_6;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!lt;")
	public static Class158 aClass158_71;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
	public static int anInt5720 = -1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ia;)V")
	public static void method4808(@OriginalArg(1) Class6_Sub15_Sub1 arg0) {
		arg0.method2607();
		@Pc(10) int local10 = Static251.anInt4268;
		@Pc(20) Class3_Sub3_Sub6_Sub1 local20 = Static134.aClass3_Sub3_Sub6_Sub1_1 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local10] = new Class3_Sub3_Sub6_Sub1();
		local20.anInt6731 = local10;
		@Pc(28) int local28 = arg0.method2604(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray582[0] = local39 - Static206.anInt3592;
		local20.anInt6675 = (local20.anIntArray582[0] << 7) + (local20.method5512() << 6);
		local20.anIntArray583[0] = local43 - Static99.anInt1814;
		local20.anInt6677 = (local20.anIntArray583[0] << 7) + (local20.method5512() << 6);
		Static4.anInt30 = local20.aByte93 = local33;
		if (Static362.aClass6_Sub15Array1[local10] != null) {
			local20.method4694(Static362.aClass6_Sub15Array1[local10]);
		}
		Static416.anInt4773 = 0;
		Static5.anIntArray3[Static416.anInt4773++] = local10;
		Static278.aByteArray62[local10] = 0;
		Static396.anInt6555 = 0;
		for (@Pc(122) int local122 = 1; local122 < 2048; local122++) {
			if (local122 != local10) {
				@Pc(132) int local132 = arg0.method2604(18);
				@Pc(136) int local136 = local132 >> 16;
				@Pc(142) int local142 = local132 >> 8 & 0xFF;
				@Pc(146) int local146 = local132 & 0xFF;
				@Pc(154) Class2 local154 = Static337.aClass2Array1[local122] = new Class2();
				local154.anInt5 = (local136 << 28) + (local142 << 14) + local146;
				local154.anInt7 = 0;
				local154.anInt6 = -1;
				local154.aBoolean1 = false;
				Static167.anIntArray275[Static396.anInt6555++] = local122;
				Static278.aByteArray62[local122] = 0;
			}
		}
		arg0.method2613();
	}
}
