import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!wb;")
	public static Class1_Sub4_Sub4 aClass1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Z")
	public static boolean aBoolean686 = false;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!fn;")
	public static final Class105 aClass105_3 = new Class105(16);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZ)S")
	public static short method7915(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local20 * local24 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(48) int local48 = local44 + local24;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local57 >> 4 << 7 | local14 << 10 | local48);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BZ)V")
	public static void method7916(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static335.aClass1_Sub2_Sub12_3 != null) {
			Static14.anInt324 = Static335.aClass1_Sub2_Sub12_3.anInt6324;
		} else {
			Static14.anInt324 = -1;
		}
		Static267.aClass91_9 = null;
		Static18.aClass295_4 = null;
		Static335.aClass1_Sub2_Sub12_3 = null;
		Static224.anInt4343 = 0;
		Static335.method4568();
		Static335.aClass295_19.method7541();
		Static405.aClass66_8 = null;
		Static155.aClass66_4 = null;
		Static93.aClass66_3 = null;
		Static335.aClass214_2 = null;
		Static89.aClass66_2 = null;
		Static269.aClass66_7 = null;
		Static162.anInt3142 = -1;
		Static452.aClass104_25 = null;
		Static161.aClass66_5 = null;
		Static214.aClass66_6 = null;
		Static70.aClass66_1 = null;
		Static313.anInt5997 = -1;
		Static335.aClass32_4.method1125();
		Static335.aClass160_3.method4296(64, 64);
		Static335.aClass32_4.method1130(128, 64);
		Static335.aClass18_3.method600(64);
		Static363.aClass118_1.method2941(64);
	}
}
