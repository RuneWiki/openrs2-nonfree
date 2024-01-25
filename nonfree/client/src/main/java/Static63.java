import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array3;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[J")
	public static final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	public static int anInt977 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method889() {
		if (Static11.anInt201 != -1) {
			Static206.method3294(-1, Static11.anInt201, false, -1);
			Static11.anInt201 = -1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method890() {
		for (@Pc(18) Class5_Sub3_Sub8 local18 = (Class5_Sub3_Sub8) Static456.aClass114_53.method2805(); local18 != null; local18 = (Class5_Sub3_Sub8) Static456.aClass114_53.method2814()) {
			@Pc(23) Class28_Sub1_Sub4_Sub4 local23 = local18.aClass28_Sub1_Sub4_Sub4_1;
			if (local23.aBoolean721) {
				local18.method9052();
				local23.method7241();
			} else if (Static26.anInt350 >= local23.anInt8491) {
				local23.method7240(Static290.anInt5659);
				if (local23.aBoolean721) {
					local18.method9052();
				} else {
					Static308.method4867(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lclient!vc;")
	public static Class28_Sub8 method892() {
		@Pc(16) Class28_Sub8 local16 = (Class28_Sub8) Static455.aClass156_8.method3775();
		if (local16 == null) {
			return new Class28_Sub8();
		} else {
			Static33.anInt549--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lclient!fi;")
	public static Class5_Sub21 method894() {
		@Pc(6) Class5_Sub21 local6 = Static662.method8837();
		local6.aClass305_28 = null;
		local6.anInt3373 = 0;
		local6.aClass5_Sub41_Sub2_1 = new Class5_Sub41_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZBIIII)V")
	public static void method897(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(50) int local50 = local21 * (Static7.aShort1 - Static157.aShort25) / 100 + Static157.aShort25;
		if (Static135.aShort24 > local50) {
			local50 = Static135.aShort24;
		} else if (local50 > Static242.aShort40) {
			local50 = Static242.aShort40;
		}
		@Pc(75) int local75 = local50 * arg1 * 512 / (arg3 * 334);
		@Pc(109) int local109;
		@Pc(116) int local116;
		@Pc(80) short local80;
		if (local75 < Static588.aShort105) {
			local80 = Static588.aShort105;
			local50 = local80 * arg3 * 334 / (arg1 * 512);
			if (Static242.aShort40 < local50) {
				local50 = Static242.aShort40;
				local109 = local50 * arg1 * 512 / (local80 * 334);
				local116 = (arg3 - local109) / 2;
				if (arg0) {
					Static208.aClass65_7.la();
					Static208.aClass65_7.method6900(arg2, arg4, local116, -16777216, arg1);
					Static208.aClass65_7.method6900(arg2 + arg3 - local116, arg4, local116, -16777216, arg1);
				}
				arg2 += local116;
				arg3 -= local116 * 2;
			}
		} else if (Static222.aShort37 < local75) {
			local80 = Static222.aShort37;
			local50 = arg3 * local80 * 334 / (arg1 * 512);
			if (local50 < Static135.aShort24) {
				local50 = Static135.aShort24;
				local109 = local80 * 334 * arg3 / (local50 * 512);
				local116 = (arg1 - local109) / 2;
				if (arg0) {
					Static208.aClass65_7.la();
					Static208.aClass65_7.method6900(arg2, arg4, arg3, -16777216, local116);
					Static208.aClass65_7.method6900(arg2, arg4 + arg1 - local116, arg3, -16777216, local116);
				}
				arg1 -= local116 * 2;
				arg4 += local116;
			}
		}
		Static158.anInt3176 = (short) arg1;
		Static273.anInt5016 = arg2;
		Static177.anInt3437 = arg4;
		Static122.anInt9902 = arg1 * local50 / 334;
		Static650.anInt10484 = (short) arg3;
	}
}
