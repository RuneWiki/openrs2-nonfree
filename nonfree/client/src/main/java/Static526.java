import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "F")
	public static float aFloat164;

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "[Lclient!cu;")
	public static Class62[] aClass62Array3;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIILclient!he;Lclient!he;)V")
	public static void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16_Sub1_Sub2 arg3, @OriginalArg(4) Class16_Sub1_Sub2 arg4) {
		@Pc(4) Class84 local4 = Static111.method2006(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass16_Sub1_Sub2_1 = arg3;
		local4.aClass16_Sub1_Sub2_2 = arg4;
		@Pc(19) int local19 = Static511.aClass91Array3 == Static332.aClass91Array2 ? 1 : 0;
		if (!arg3.method6990()) {
			arg3.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local19];
			Static518.aClass16_Sub1Array4[local19] = arg3;
		} else if (arg3.method6974()) {
			arg3.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local19];
			Static451.aClass16_Sub1Array3[local19] = arg3;
		} else {
			arg3.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local19];
			Static524.aClass16_Sub1Array5[local19] = arg3;
			Static578.aBoolean673 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method6990()) {
			if (arg4.method6974()) {
				arg4.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local19];
				Static451.aClass16_Sub1Array3[local19] = arg4;
				return;
			}
			arg4.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local19];
			Static524.aClass16_Sub1Array5[local19] = arg4;
			Static578.aBoolean673 = true;
			return;
		}
		arg4.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local19];
		Static518.aClass16_Sub1Array4[local19] = arg4;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!lk;I)V")
	public static void method7309(@OriginalArg(0) Class2_Sub31 arg0) {
		Static442.aClass114_39.method2771(arg0);
		arg0.anInt5738 = arg0.aClass2_Sub17_Sub1_2.anInt3378;
		Static570.anInt9341 += arg0.anInt5738;
		arg0.aClass2_Sub17_Sub1_2.anInt3378 = 0;
	}
}
