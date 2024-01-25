import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Lclient!cr;")
	public static Class41 aClass41_44;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	public static int anInt6792 = 0;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray100 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
	public static int anInt6807 = 0;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)V")
	public static void method6015() {
		for (@Pc(7) int local7 = 0; local7 < Static195.anInt3883; local7++) {
			@Pc(13) int local13 = Static76.anIntArray118[local7];
			@Pc(17) Class4_Sub5_Sub2_Sub1 local17 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = Static187.aClass5_Sub12_Sub2_4.method5115();
			if ((local21 & 0x10) != 0) {
				local21 += Static187.aClass5_Sub12_Sub2_4.method5115() << 8;
			}
			Static331.method5733(local13, local17, local21);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!ui;")
	public static Class3 method6019(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class3_Sub1");
			@Pc(15) Class3 local15 = (Class3) local11.getDeclaredConstructor().newInstance();
			local15.method548(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class3_Sub2 local26 = new Class3_Sub2();
			local26.method548(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIIII)V")
	public static void method6022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub7 local10 = (Class5_Sub7) Static296.aClass103_138.method2756(); local10 != null; local10 = (Class5_Sub7) Static296.aClass103_138.method2748()) {
			Static54.method857(local10, arg3, arg1, arg2, arg0);
		}
		for (@Pc(31) Class5_Sub7 local31 = (Class5_Sub7) Static143.aClass103_70.method2756(); local31 != null; local31 = (Class5_Sub7) Static143.aClass103_70.method2748()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class88 local40 = local31.aClass4_Sub5_Sub2_Sub2_1.method4805();
			if (local31.aClass4_Sub5_Sub2_Sub2_1.aBoolean446) {
				local35 = 0;
			} else if (local40.anInt2272 == local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 || local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 == local40.anInt2286 || local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 == local40.anInt2290 || local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 == local40.anInt2275) {
				local35 = 2;
			} else if (local40.anInt2276 == local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 || local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 == local40.anInt2308 || local40.anInt2314 == local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 || local31.aClass4_Sub5_Sub2_Sub2_1.anInt5361 == local40.anInt2305) {
				local35 = 3;
			}
			if (local31.anInt436 != local35) {
				@Pc(115) int local115 = Static152.method5138(local31.aClass4_Sub5_Sub2_Sub2_1);
				if (local31.anInt438 != local115) {
					if (local31.aClass5_Sub16_Sub3_1 != null) {
						Static114.aClass5_Sub16_Sub4_1.method5798(local31.aClass5_Sub16_Sub3_1);
						local31.aClass5_Sub16_Sub3_1 = null;
					}
					local31.anInt438 = local115;
				}
				local31.anInt436 = local35;
			}
			local31.anInt442 = local31.aClass4_Sub5_Sub2_Sub2_1.anInt6631;
			local31.anInt435 = local31.aClass4_Sub5_Sub2_Sub2_1.anInt6631 + local31.aClass4_Sub5_Sub2_Sub2_1.method4807() * 64;
			local31.anInt443 = local31.aClass4_Sub5_Sub2_Sub2_1.anInt6632;
			local31.anInt439 = local31.aClass4_Sub5_Sub2_Sub2_1.anInt6632 + local31.aClass4_Sub5_Sub2_Sub2_1.method4807() * 64;
			Static54.method857(local31, arg3, arg1, arg2, arg0);
		}
		for (@Pc(188) Class5_Sub7 local188 = (Class5_Sub7) Static199.aClass190_22.method5471(); local188 != null; local188 = (Class5_Sub7) Static199.aClass190_22.method5465()) {
			@Pc(199) byte local199 = 1;
			@Pc(204) Class88 local204 = local188.aClass4_Sub5_Sub2_Sub1_1.method4805();
			if (local188.aClass4_Sub5_Sub2_Sub1_1.aBoolean446) {
				local199 = 0;
			} else if (local204.anInt2272 == local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 || local204.anInt2286 == local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 || local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 == local204.anInt2290 || local204.anInt2275 == local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361) {
				local199 = 2;
			} else if (local204.anInt2276 == local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 || local204.anInt2308 == local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 || local204.anInt2314 == local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 || local188.aClass4_Sub5_Sub2_Sub1_1.anInt5361 == local204.anInt2305) {
				local199 = 3;
			}
			if (local199 != local188.anInt436) {
				@Pc(295) int local295 = Static16.method307(local188.aClass4_Sub5_Sub2_Sub1_1);
				if (local188.anInt438 != local295) {
					if (local188.aClass5_Sub16_Sub3_1 != null) {
						Static114.aClass5_Sub16_Sub4_1.method5798(local188.aClass5_Sub16_Sub3_1);
						local188.aClass5_Sub16_Sub3_1 = null;
					}
					local188.anInt438 = local295;
				}
				local188.anInt436 = local199;
			}
			local188.anInt442 = local188.aClass4_Sub5_Sub2_Sub1_1.anInt6631;
			local188.anInt435 = local188.aClass4_Sub5_Sub2_Sub1_1.anInt6631 + local188.aClass4_Sub5_Sub2_Sub1_1.method4807() * 64;
			local188.anInt443 = local188.aClass4_Sub5_Sub2_Sub1_1.anInt6632;
			local188.anInt439 = local188.aClass4_Sub5_Sub2_Sub1_1.anInt6632 + local188.aClass4_Sub5_Sub2_Sub1_1.method4807() * 64;
			Static54.method857(local188, arg3, arg1, arg2, arg0);
		}
	}
}
