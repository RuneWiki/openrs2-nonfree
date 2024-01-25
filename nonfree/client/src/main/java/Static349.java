import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	public static int anInt6682;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "Lclient!sj;")
	public static Class190 aClass190_5;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "Z")
	public static boolean aBoolean659 = false;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public static void method5587() {
		Static170.aClass16_18.method421();
		for (@Pc(13) Class1_Sub23 local13 = (Class1_Sub23) Static188.aClass16_22.method410(); local13 != null; local13 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			if (local13.anInt3588 < 1000) {
				local13.method5628();
				Static170.aClass16_18.method416(local13);
			}
		}
		Static170.aClass16_18.method415(Static188.aClass16_22);
		if (Static28.aClass12_3 != null || Static174.anInt3787 > 0) {
			return;
		}
		@Pc(50) int local50 = -1;
		if (Static305.aClass1_Sub21_1 != null) {
			local50 = Static305.aClass1_Sub21_1.method2701();
		}
		if (!Static146.aBoolean308) {
			if (Static90.anInt2274 >= 0) {
				local50 = Static90.anInt2274;
			}
			Static90.anInt2274 = -1;
			if (local50 == 0 && (Static270.anInt5519 == 1 && Static115.anInt2635 > 2 || Static44.method1030())) {
				local50 = 2;
			}
			if (local50 == 2 && Static115.anInt2635 > 0) {
				if (Static305.aClass1_Sub21_1 == null) {
					Static190.method3692(Static22.anInt5199, Static36.anInt1195);
				} else {
					Static190.method3692(Static305.aClass1_Sub21_1.method2703(), Static305.aClass1_Sub21_1.method2704());
				}
			}
			if (local50 != 0 || Static115.anInt2635 <= 0) {
				return;
			}
			Static96.method5288();
			return;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local50 == -1) {
			local66 = Static222.aClass84_1.method5408();
			local70 = Static222.aClass84_1.method5406();
			if (Static210.anInt4473 - 10 > local66 || local66 > Static210.anInt4473 + Static198.anInt1219 + 10 || Static339.anInt6506 - 10 > local70 || local70 > Static339.anInt6506 + Static282.anInt6601 + 10) {
				Static146.aBoolean308 = false;
				Static8.method5018(Static282.anInt6601, Static198.anInt1219, Static339.anInt6506, Static210.anInt4473);
			}
		}
		if (local50 != 0) {
			return;
		}
		local66 = Static210.anInt4473;
		local70 = Static339.anInt6506;
		@Pc(121) int local121 = Static198.anInt1219;
		@Pc(125) int local125 = Static305.aClass1_Sub21_1.method2704();
		@Pc(129) int local129 = Static305.aClass1_Sub21_1.method2703();
		@Pc(131) int local131 = -1;
		@Pc(150) int local150;
		for (@Pc(133) int local133 = 0; local133 < Static115.anInt2635; local133++) {
			if (Static337.aBoolean630) {
				local150 = local70 + (Static115.anInt2635 - local133 - 1) * 16 + 33;
				if (local125 > local66 && local125 < local121 + local66 && local150 - 13 < local129 && local150 + 4 > local129) {
					local131 = local133;
				}
			} else {
				local150 = (Static115.anInt2635 - local133 - 1) * 16 + local70 + 31;
				if (local125 > local66 && local125 < local121 + local66 && local129 > local150 - 13 && local129 < local150 + 3) {
					local131 = local133;
				}
			}
		}
		if (local131 != -1) {
			local150 = 0;
			@Pc(243) Class183 local243 = new Class183(Static188.aClass16_22);
			for (@Pc(248) Class1_Sub23 local248 = (Class1_Sub23) local243.method4850(); local248 != null; local248 = (Class1_Sub23) local243.method4847()) {
				if (local131 == local150) {
					Static339.method5472(local248);
				}
				local150++;
			}
		}
		Static146.aBoolean308 = false;
		Static8.method5018(Static282.anInt6601, Static198.anInt1219, Static339.anInt6506, Static210.anInt4473);
		return;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5593(@OriginalArg(0) String arg0) {
		return Static56.method1460(arg0);
	}
}
