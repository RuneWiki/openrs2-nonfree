import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!cj;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Lclient!np;")
	public static Class3_Sub11 aClass3_Sub11_1;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "Lclient!qs;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_44 = new Class303(47, 3);

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public static int anInt4022 = -2;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!oh;[II)V")
	public static void method3564(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray627 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray627.length; local12++) {
				if (arg0.anIntArray627[local12] != arg1[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt9489 != -1) {
				@Pc(53) Class185 local53 = Static545.aClass240_2.method5680(arg0.anInt9489);
				@Pc(56) int local56 = local53.anInt4978;
				if (local56 == 1) {
					arg0.anInt9473 = 0;
					arg0.anInt9509 = arg2;
					arg0.anInt9460 = 1;
					arg0.anInt9463 = 0;
					arg0.anInt9478 = 0;
					Static462.method6421(false, arg0.anInt9444, local53, arg0.aByte117, arg0.anInt9442, arg0.anInt9473);
				}
				if (local56 == 2) {
					arg0.anInt9463 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray627 == null || arg0.anIntArray627[local12] == -1 || Static545.aClass240_2.method5680(arg1[local12]).anInt4981 >= Static545.aClass240_2.method5680(arg0.anIntArray627[local12]).anInt4981) {
				arg0.anInt9534 = arg0.anInt9535;
				arg0.anIntArray627 = arg1;
				arg0.anInt9509 = arg2;
			}
		}
		if (local10) {
			arg0.anIntArray627 = arg1;
			arg0.anInt9509 = arg2;
			arg0.anInt9534 = arg0.anInt9535;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!dda;")
	public static Class66 method3567(@OriginalArg(0) Class45 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static213.anIntArray500 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static213.anIntArray500.length; local15++) {
				if (arg1 == Static213.anIntArray500[local15]) {
					return Static212.aClass66Array1[local15];
				}
			}
		}
		@Pc(43) Class66 local43 = (Class66) Static444.aClass6_56.method92((long) arg1);
		if (local43 != null) {
			if (arg2 && local43.aClass134_8 == null) {
				@Pc(55) Class134 local55 = Static149.method2843(arg1, Static258.aClass322_128);
				if (local55 == null) {
					return null;
				}
				local43.aClass134_8 = local55;
			}
			return local43;
		}
		@Pc(68) Class279[] local68 = Static604.method6158(Static119.aClass322_43, arg1);
		if (local68 == null) {
			return null;
		}
		@Pc(77) Class134 local77 = Static149.method2843(arg1, Static258.aClass322_128);
		if (local77 == null) {
			return null;
		}
		if (arg2) {
			local43 = new Class66(arg0.method7394(local77, local68), local77);
		} else {
			local43 = new Class66(arg0.method7394(local77, local68));
		}
		Static444.aClass6_56.method106((long) arg1, local43);
		return local43;
	}
}
