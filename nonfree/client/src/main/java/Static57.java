import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt1245;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt1246;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!ir;")
	public static Class100 aClass100_21;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_4 = new Class24(8);

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public static int anInt1247 = -1;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "F")
	public static float aFloat3 = 0.0F;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method948() {
		Static20.aClass3_Sub4_Sub2_1.method3688();
		@Pc(11) int local11 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static20.aClass3_Sub4_Sub2_1.method3681(2);
		if (local23 == 0) {
			Static303.anIntArray447[Static283.anInt4489++] = 2047;
			return;
		}
		@Pc(44) int local44;
		@Pc(54) int local54;
		if (local23 == 1) {
			local44 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
			Static349.aClass5_Sub4_Sub4_Sub1_2.method4202(1, local44);
			local54 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
			if (local54 == 1) {
				Static303.anIntArray447[Static283.anInt4489++] = 2047;
			}
		} else if (local23 == 2) {
			if (Static20.aClass3_Sub4_Sub2_1.method3681(1) == 1) {
				local44 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
				Static349.aClass5_Sub4_Sub4_Sub1_2.method4202(2, local44);
				local54 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
				Static349.aClass5_Sub4_Sub4_Sub1_2.method4202(2, local54);
			} else {
				local44 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
				Static349.aClass5_Sub4_Sub4_Sub1_2.method4202(0, local44);
			}
			local44 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
			if (local44 == 1) {
				Static303.anIntArray447[Static283.anInt4489++] = 2047;
			}
		} else if (local23 == 3) {
			local44 = Static20.aClass3_Sub4_Sub2_1.method3681(7);
			local54 = Static20.aClass3_Sub4_Sub2_1.method3681(7);
			@Pc(146) int local146 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
			if (local146 == 1) {
				Static303.anIntArray447[Static283.anInt4489++] = 2047;
			}
			@Pc(164) int local164 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
			Static163.anInt3184 = Static20.aClass3_Sub4_Sub2_1.method3681(2);
			Static349.aClass5_Sub4_Sub4_Sub1_2.method2675(local54, local44, Static163.anInt3184, local164 == 1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ir;I)Lclient!bm;")
	public static Class3_Sub8 method949(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2318(arg1);
		return local8 == null ? null : new Class3_Sub8(local8);
	}
}
