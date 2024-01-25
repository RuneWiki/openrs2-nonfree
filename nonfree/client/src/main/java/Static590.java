import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!ih;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_62 = new Class313(8);

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
	public static boolean aBoolean730 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method7962(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg4 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg0 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local29; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local38; local52 < 0; local52++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local16;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
	public static void method7964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub39 local10 = (Class2_Sub39) Static418.aClass8_45.method210(); local10 != null; local10 = (Class2_Sub39) Static418.aClass8_45.method218()) {
			Static202.method3297(arg2, local10, arg3, arg0, arg1);
		}
		for (@Pc(36) Class2_Sub39 local36 = (Class2_Sub39) Static33.aClass8_2.method210(); local36 != null; local36 = (Class2_Sub39) Static33.aClass8_2.method218()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class54 local45 = local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.method6168();
			if (local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.aBoolean569) {
				local40 = 0;
			} else if (local45.anInt1387 == local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 || local45.anInt1386 == local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 || local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 == local45.anInt1423 || local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 == local45.anInt1412) {
				local40 = 2;
			} else if (local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 == local45.anInt1389 || local45.anInt1384 == local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 || local45.anInt1397 == local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419 || local45.anInt1391 == local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt7419) {
				local40 = 3;
			}
			if (local36.anInt7750 != local40) {
				@Pc(128) int local128 = Static505.method7026(local36.aClass6_Sub1_Sub1_Sub1_Sub1_2);
				@Pc(132) Class86 local132 = local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.aClass86_1;
				if (local132.anIntArray136 != null) {
					local132 = local132.method1567(Static70.aClass78_1);
				}
				if (local132 == null || local128 == -1) {
					local36.anInt7744 = -1;
					local36.aBoolean611 = false;
				} else if (local128 != local36.anInt7744 || local132.aBoolean194 != local36.aBoolean611) {
					if (local36.aClass2_Sub10_Sub4_3 != null) {
						Static122.aClass2_Sub10_Sub1_2.method1012(local36.aClass2_Sub10_Sub4_3);
						local36.aClass2_Sub10_Sub4_3 = null;
					}
					local36.aBoolean611 = local132.aBoolean194;
					local36.anInt7744 = local128;
					local36.aClass2_Sub20_1 = null;
					local36.aClass2_Sub7_Sub1_2 = null;
				}
				local36.anInt7750 = local40;
			}
			local36.anInt7751 = local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt8761;
			local36.anInt7749 = local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt8761 + (local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.method6165() << 8);
			local36.anInt7745 = local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt8764;
			local36.anInt7748 = local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.anInt8764 + (local36.aClass6_Sub1_Sub1_Sub1_Sub1_2.method6165() << 8);
			Static202.method3297(arg2, local36, arg3, arg0, arg1);
		}
		for (@Pc(242) Class2_Sub39 local242 = (Class2_Sub39) Static175.aClass162_19.method3527(); local242 != null; local242 = (Class2_Sub39) Static175.aClass162_19.method3523()) {
			@Pc(246) byte local246 = 1;
			@Pc(251) Class54 local251 = local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.method6168();
			if (local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.aBoolean569) {
				local246 = 0;
			} else if (local251.anInt1387 == local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 || local251.anInt1386 == local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 || local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 == local251.anInt1423 || local251.anInt1412 == local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419) {
				local246 = 2;
			} else if (local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 == local251.anInt1389 || local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 == local251.anInt1384 || local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 == local251.anInt1397 || local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7419 == local251.anInt1391) {
				local246 = 3;
			}
			if (local246 != local242.anInt7750) {
				@Pc(350) int local350 = Static579.method7833(local242.aClass6_Sub1_Sub1_Sub1_Sub2_1);
				if (local350 != local242.anInt7744 || local242.aBoolean611 != local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.aBoolean576) {
					if (local242.aClass2_Sub10_Sub4_3 != null) {
						Static122.aClass2_Sub10_Sub1_2.method1012(local242.aClass2_Sub10_Sub4_3);
						local242.aClass2_Sub10_Sub4_3 = null;
					}
					local242.anInt7744 = local350;
					local242.aClass2_Sub7_Sub1_2 = null;
					local242.aBoolean611 = local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.aBoolean576;
					local242.aClass2_Sub20_1 = null;
				}
				local242.anInt7750 = local246;
			}
			local242.anInt7751 = local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt8761;
			local242.anInt7749 = local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt8761 + (local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.method6165() << 8);
			local242.anInt7745 = local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt8764;
			local242.anInt7748 = local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt8764 + (local242.aClass6_Sub1_Sub1_Sub1_Sub2_1.method6165() << 8);
			Static202.method3297(arg2, local242, arg3, arg0, arg1);
		}
	}
}
