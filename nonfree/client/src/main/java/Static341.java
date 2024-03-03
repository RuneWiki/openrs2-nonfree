import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qg;)V", line = 252)
	public static void method6121(@OriginalArg(1) Class2_Sub4_Sub2 arg0) {
		arg0.method4870();
		@Pc(10) int local10 = Class11_Sub3_Sub2.anInt4220;
		@Pc(20) Class11_Sub5_Sub2_Sub1 local20 = Static17.aClass11_Sub5_Sub2_Sub1_3 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local10] = new Class11_Sub5_Sub2_Sub1();
		local20.anInt4610 = local10;
		@Pc(28) int local28 = arg0.method4869(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray316[0] = local39 - Static154.anInt3136;
		local20.anInt6768 = (local20.anIntArray316[0] << 7) + (local20.method4329() << 6);
		local20.anIntArray317[0] = local43 - Static139.anInt2716;
		local20.anInt6770 = (local20.anIntArray317[0] << 7) + (local20.method4329() << 6);
		Static330.anInt6573 = local20.aByte78 = local33;
		if (Class12_Sub4.aClass2_Sub4Array1[local10] != null) {
			local20.method4067(Class12_Sub4.aClass2_Sub4Array1[local10]);
		}
		Class28.anInt751 = 0;
		Class64.anIntArray121[Class28.anInt751++] = local10;
		Class30.aByteArray7[local10] = 0;
		Class133.anInt3543 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local10) {
				@Pc(138) int local138 = arg0.method4869(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				Class2_Sub2_Sub10.anIntArray422[local124] = (local142 << 28) - (-(local148 << 14) - local152);
				Class217.anIntArray410[local124] = 0;
				Class11_Sub4_Sub1.anIntArray260[local124] = -1;
				Class2_Sub26_Sub1.anIntArray284[Class133.anInt3543++] = local124;
				Class30.aByteArray7[local124] = 0;
			}
		}
		arg0.method4866();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!nk;I)V", line = 553)
	public static void method6130(@OriginalArg(0) Class161 arg0) {
		if (!Class2_Sub2_Sub10_Sub2.aBoolean419) {
			return;
		}
		Static85.method1962(Class2_Sub3_Sub11.aClass145_79);
		Class14.aClass2_Sub4_Sub2_4.method4814(arg0.anInt4310);
		Class14.aClass2_Sub4_Sub2_4.method4856(arg0.anInt4290);
		Class14.aClass2_Sub4_Sub2_4.method4856(InputStream_Sub1.anInt3788);
		Class14.aClass2_Sub4_Sub2_4.method4844(Class119.anInt3313);
		Class14.aClass2_Sub4_Sub2_4.method4806(Static314.anInt6305);
		Class14.aClass2_Sub4_Sub2_4.method4844(arg0.anInt4293);
	}
}
