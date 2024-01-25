import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!su", name = "n", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_152 = new Class254(99, 20);

	@OriginalMember(owner = "client!su", name = "q", descriptor = "Lclient!oh;")
	public static final Class238 aClass238_4 = new Class238();

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method7300(@OriginalArg(0) Class9 arg0) {
		@Pc(7) int local7 = Static69.anInt1684;
		@Pc(9) int local9 = Static230.anInt4775;
		@Pc(11) int local11 = Static24.anInt8441;
		@Pc(15) int local15 = Static430.anInt868 - 3;
		if (Static73.aClass66_17 == null || Static515.aClass66_30 == null) {
			if (Static132.aClass168_118.method4427(Static514.anInt9028) && Static132.aClass168_118.method4427(Static467.anInt8607)) {
				Static73.aClass66_17 = arg0.method5412(Static583.method55(Static132.aClass168_118, Static514.anInt9028, 0));
				@Pc(63) Class1 local63 = Static583.method55(Static132.aClass168_118, Static467.anInt8607, 0);
				Static515.aClass66_30 = arg0.method5412(local63);
				local63.method53();
				Static33.aClass66_7 = arg0.method5412(local63);
			} else {
				arg0.C(local7, local9, local11, 20, 255 - Static359.anInt6349 << 24 | Static427.anInt9634, 1);
			}
		}
		@Pc(92) int local92;
		@Pc(90) int local90;
		if (Static73.aClass66_17 != null && Static515.aClass66_30 != null) {
			local90 = (local11 - Static515.aClass66_30.QA() * 2) / Static73.aClass66_17.QA();
			for (local92 = 0; local92 < local90; local92++) {
				Static73.aClass66_17.method8066(Static515.aClass66_30.QA() + local7 + Static73.aClass66_17.QA() * local92, local9);
			}
			Static515.aClass66_30.method8066(local7, local9);
			Static33.aClass66_7.method8066(local11 + local7 - Static33.aClass66_7.QA(), local9);
		}
		Static489.aClass73_5.method7888(Static222.aClass152_69.method4002(Static286.anInt5468), Static532.anInt9208 | 0xFF000000, -1, local7 + 3, local9 + 14);
		arg0.C(local7, local9 + 20, local11, local15 - 20, -Static359.anInt6349 + 255 << 24 | Static427.anInt9634, 1);
		local90 = Static401.aClass4_1.method1216();
		local92 = Static401.aClass4_1.method1215();
		@Pc(176) int local176 = 0;
		@Pc(198) int local198;
		for (@Pc(181) Class6_Sub42 local181 = (Class6_Sub42) Static207.aClass211_29.method5183(); local181 != null; local181 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			local198 = local9 + (Static205.anInt4369 - 1 - local176) * 16 + 20 + 13;
			if (local90 > local7 && local11 + local7 > local90 && local198 - 13 < local92 && local198 + 4 > local92 && local181.aBoolean605) {
				arg0.C(local7, local198 - 12, local11, 16, 255 - Static580.anInt9818 << 24 | Static413.anInt7741, 1);
			}
			local176++;
		}
		if ((Static31.aClass66_6 == null || Static12.aClass66_5 == null || Static236.aClass66_23 == null) && Static132.aClass168_118.method4427(Static209.anInt4410) && Static132.aClass168_118.method4427(Static504.anInt8966) && Static132.aClass168_118.method4427(Static87.anInt2167)) {
			@Pc(278) Class1 local278 = Static583.method55(Static132.aClass168_118, Static504.anInt8966, 0);
			Static12.aClass66_5 = arg0.method5412(local278);
			local278.method53();
			Static53.aClass66_12 = arg0.method5412(local278);
			Static31.aClass66_6 = arg0.method5412(Static583.method55(Static132.aClass168_118, Static209.anInt4410, 0));
			@Pc(303) Class1 local303 = Static583.method55(Static132.aClass168_118, Static87.anInt2167, 0);
			Static236.aClass66_23 = arg0.method5412(local303);
			local303.method53();
			Static135.aClass66_20 = arg0.method5412(local303);
		}
		@Pc(369) int local369;
		@Pc(334) int local334;
		if (Static31.aClass66_6 != null && Static12.aClass66_5 != null && Static236.aClass66_23 != null) {
			local198 = (local11 - Static236.aClass66_23.QA() * 2) / Static31.aClass66_6.QA();
			for (local334 = 0; local334 < local198; local334++) {
				Static31.aClass66_6.method8066(local7 + Static236.aClass66_23.QA() + local334 * Static31.aClass66_6.QA(), local15 + local9 - Static31.aClass66_6.b());
			}
			local369 = (local15 - Static236.aClass66_23.b() - 20) / Static12.aClass66_5.b();
			for (@Pc(371) int local371 = 0; local371 < local369; local371++) {
				Static12.aClass66_5.method8066(local7, local371 * Static12.aClass66_5.b() + local9 + 20);
				Static53.aClass66_12.method8066(local7 + local11 - Static53.aClass66_12.QA(), Static12.aClass66_5.b() * local371 + (local9 - -20));
			}
			Static236.aClass66_23.method8066(local7, local15 + local9 - Static236.aClass66_23.b());
			Static135.aClass66_20.method8066(local11 + local7 - Static236.aClass66_23.QA(), local15 + local9 - Static236.aClass66_23.b());
		}
		local176 = 0;
		for (@Pc(441) Class6_Sub42 local441 = (Class6_Sub42) Static207.aClass211_29.method5183(); local441 != null; local441 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			local334 = (Static205.anInt4369 - local176 - 1) * 16 + local9 + 33;
			local369 = Static532.anInt9208 | 0xFF000000;
			if (local7 < local90 && local90 < local11 + local7 && local334 - 13 < local92 && local334 + 4 > local92 && local441.aBoolean605) {
				local369 = Static524.anInt9094 | 0xFF000000;
			}
			@Pc(504) int[] local504 = null;
			if (Static394.method6227(local441.anInt8285)) {
				local504 = Static98.aClass203_1.method4899((int) local441.aLong200).anIntArray288;
			} else if (local441.anInt8289 != -1) {
				local504 = Static98.aClass203_1.method4899(local441.anInt8289).anIntArray288;
			} else if (Static390.method6168(local441.anInt8285)) {
				@Pc(535) Class6_Sub33 local535 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local441.aLong200);
				if (local535 != null) {
					@Pc(540) Class11_Sub1_Sub1_Sub1 local540 = local535.aClass11_Sub1_Sub1_Sub1_2;
					@Pc(543) Class222 local543 = local540.aClass222_1;
					if (local543.anIntArray464 != null) {
						local543 = local543.method5329(Static435.aClass234_1);
					}
					if (local543 != null) {
						local504 = local543.anIntArray463;
					}
				}
			} else if (Static472.method5255(local441.anInt8285)) {
				@Pc(577) Class31 local577;
				if (local441.anInt8285 == 1009) {
					local577 = Static480.aClass57_11.method1469((int) local441.aLong200);
				} else {
					local577 = Static480.aClass57_11.method1469((int) (local441.aLong200 >>> 32 & 0x7FFFFFFFL));
				}
				if (local577.anIntArray69 != null) {
					local577 = local577.method1029(Static435.aClass234_1);
				}
				if (local577 != null) {
					local504 = local577.anIntArray72;
				}
			}
			@Pc(615) String local615 = Static84.method1839(local441);
			if (local504 != null) {
				local615 = local615 + Static506.method7533(local504);
			}
			Static489.aClass73_5.method7899(Static451.aClass66Array11, local369, local7 + 3, local615, Static235.anIntArray314, local334);
			if (local441.aBoolean607) {
				Static270.aClass66_24.method8066(local7 + Static1.aClass82_1.method2292(local615) + 5, local334 + -12);
			}
			local176++;
		}
		Static173.method3500(Static430.anInt868, Static230.anInt4775, Static24.anInt8441, Static69.anInt1684);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	public static void method7301(@OriginalArg(1) int arg0) {
		Static137.anInt2914 = 3;
		Static447.anInt8208 = 100;
		Static339.anInt6292 = -1;
		Static221.anInt4650 = arg0;
	}
}
