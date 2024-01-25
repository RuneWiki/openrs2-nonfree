import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "Lclient!om;")
	public static Class2_Sub5_Sub12 aClass2_Sub5_Sub12_3;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_153 = new Class265(98, 2);

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
	public static boolean method5165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static405.anInt6755; local1++) {
			@Pc(6) Class210 local6 = Static385.aClass210Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5786 == 1) {
				local15 = local6.anInt5774 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5779 + (local6.anInt5792 * local15 >> 8);
					local37 = local6.anInt5794 + (local6.anInt5782 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5781 * local15 >> 8);
					local57 = local6.anInt5776 + (local6.anInt5778 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5786 == 2) {
				local15 = arg0 - local6.anInt5774;
				if (local15 > 0) {
					local27 = local6.anInt5779 + (local6.anInt5792 * local15 >> 8);
					local37 = local6.anInt5794 + (local6.anInt5782 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5781 * local15 >> 8);
					local57 = local6.anInt5776 + (local6.anInt5778 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5786 == 3) {
				local15 = local6.anInt5779 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5774 + (local6.anInt5775 * local15 >> 8);
					local37 = local6.anInt5793 + (local6.anInt5796 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5781 * local15 >> 8);
					local57 = local6.anInt5776 + (local6.anInt5778 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5786 == 4) {
				local15 = arg2 - local6.anInt5779;
				if (local15 > 0) {
					local27 = local6.anInt5774 + (local6.anInt5775 * local15 >> 8);
					local37 = local6.anInt5793 + (local6.anInt5796 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5781 * local15 >> 8);
					local57 = local6.anInt5776 + (local6.anInt5778 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5786 == 5) {
				local15 = arg1 - local6.anInt5789;
				if (local15 > 0) {
					local27 = local6.anInt5774 + (local6.anInt5775 * local15 >> 8);
					local37 = local6.anInt5793 + (local6.anInt5796 * local15 >> 8);
					local47 = local6.anInt5779 + (local6.anInt5792 * local15 >> 8);
					local57 = local6.anInt5794 + (local6.anInt5782 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(III)Lclient!vr;")
	public static Class3_Sub5 method5166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub5_2;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method5167(@OriginalArg(0) Class49_Sub2 arg0) {
		@Pc(18) byte[] local18;
		if (Static288.anObject8 == null) {
			@Pc(9) Class5_Sub1_Sub1 local9 = new Class5_Sub1_Sub1();
			local18 = local9.method192();
			Static288.anObject8 = Static172.method2803(local18);
		}
		if (Static76.anObject1 == null) {
			@Pc(29) Class5_Sub2_Sub1 local29 = new Class5_Sub2_Sub1();
			local18 = local29.method4374();
			Static76.anObject1 = Static172.method2803(local18);
		}
		@Pc(48) Class208 local48 = arg0.aClass208_1;
		if (local48.method4555() && Static120.anObject4 == null) {
			local18 = Static350.method4781(new Class87_Sub1(419684), 0.5F, 4.0F, 4.0F, 16.0F, 0.6F);
			Static120.anObject4 = Static172.method2803(local18);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!sk;I)V")
	public static void method5170(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(11) Class2_Sub24 local11 = (Class2_Sub24) Static216.aClass163_38.method3769((long) arg0.anInt6137);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub3_Sub3_2 != null) {
			Static260.aClass2_Sub3_Sub1_2.method1826(local11.aClass2_Sub3_Sub3_2);
			local11.aClass2_Sub3_Sub3_2 = null;
		}
		local11.method5866();
	}
}
