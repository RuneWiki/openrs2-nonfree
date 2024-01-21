import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_522 = Static161.method2452("mem=");

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_526 = Static161.method2452("Unable to find ");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!dc;")
	public static Class20 aClass20_523 = aClass20_526;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public static int anInt1558 = 0;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_524 = Static161.method2452("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_525 = Static161.method2452("; Expires=");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIII)V")
	public static void method1169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class5_Sub9 local14 = (Class5_Sub9) Static210.aClass91_7.method2684(); local14 != null; local14 = (Class5_Sub9) Static210.aClass91_7.method2678()) {
			if (local14.anInt1005 != -1 || local14.anIntArray93 != null) {
				@Pc(26) int local26 = 0;
				if (arg1 > local14.anInt1020) {
					local26 = arg1 - local14.anInt1020;
				} else if (arg1 < local14.anInt1014) {
					local26 = local14.anInt1014 - arg1;
				}
				if (local14.anInt1006 < arg2) {
					local26 += arg2 - local14.anInt1006;
				} else if (arg2 < local14.anInt1011) {
					local26 += local14.anInt1011 - arg2;
				}
				if (local14.anInt1008 < local26 - 64 || Static188.anInt3751 == 0 || arg3 != local14.anInt1019) {
					if (local14.aClass5_Sub11_Sub1_2 != null) {
						Static43.aClass5_Sub11_Sub4_1.method2877(local14.aClass5_Sub11_Sub1_2);
						local14.aClass5_Sub11_Sub1_2 = null;
					}
					if (local14.aClass5_Sub11_Sub1_3 != null) {
						Static43.aClass5_Sub11_Sub4_1.method2877(local14.aClass5_Sub11_Sub1_3);
						local14.aClass5_Sub11_Sub1_3 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(139) int local139 = (local14.anInt1008 - local26) * Static188.anInt3751 / local14.anInt1008;
					if (local14.aClass5_Sub11_Sub1_2 != null) {
						local14.aClass5_Sub11_Sub1_2.method1613(local139);
					} else if (local14.anInt1005 >= 0) {
						@Pc(151) Class21 local151 = Static221.method619(Static60.aClass23_Sub1_9, local14.anInt1005, 0);
						if (local151 != null) {
							@Pc(158) Class5_Sub7_Sub1 local158 = local151.method620().method2004(Static160.aClass49_1);
							@Pc(163) Class5_Sub11_Sub1 local163 = Static222.method1580(local158, local139);
							local163.method1606(-1);
							Static43.aClass5_Sub11_Sub4_1.method2872(local163);
							local14.aClass5_Sub11_Sub1_2 = local163;
						}
					}
					if (local14.aClass5_Sub11_Sub1_3 != null) {
						local14.aClass5_Sub11_Sub1_3.method1613(local139);
						if (!local14.aClass5_Sub11_Sub1_3.method3206()) {
							local14.aClass5_Sub11_Sub1_3 = null;
						}
					} else if (local14.anIntArray93 != null && (local14.anInt1013 -= arg0) <= 0) {
						@Pc(203) int local203 = (int) (Math.random() * (double) local14.anIntArray93.length);
						@Pc(211) Class21 local211 = Static221.method619(Static60.aClass23_Sub1_9, local14.anIntArray93[local203], 0);
						if (local211 != null) {
							@Pc(218) Class5_Sub7_Sub1 local218 = local211.method620().method2004(Static160.aClass49_1);
							@Pc(223) Class5_Sub11_Sub1 local223 = Static222.method1580(local218, local139);
							local223.method1606(0);
							Static43.aClass5_Sub11_Sub4_1.method2872(local223);
							local14.anInt1013 = local14.anInt1009 + (int) ((double) (local14.anInt1012 - local14.anInt1009) * Math.random());
							local14.aClass5_Sub11_Sub1_3 = local223;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!ri;")
	public static Class5_Sub2_Sub18 method1174(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub18 local10 = (Class5_Sub2_Sub18) Static172.aClass8_34.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static120.aClass23_46.method738(arg0, 3);
		local10 = new Class5_Sub2_Sub18();
		if (local22 != null) {
			local10.method2569(new Class5_Sub6(local22));
		}
		Static172.aClass8_34.method232((long) arg0, local10);
		return local10;
	}
}
