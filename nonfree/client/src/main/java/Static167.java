import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[16];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method2196() {
		for (@Pc(3) int local3 = 0; local3 < Static433.aByteArrayArrayArray15.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static433.aByteArrayArrayArray15[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static433.aByteArrayArrayArray15[0][0].length; local11++) {
					Static433.aByteArrayArrayArray15[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) Class2_Sub40 local15 = (Class2_Sub40) Static249.aClass70_26.method1264(); local15 != null; local15 = (Class2_Sub40) Static249.aClass70_26.method1261()) {
			Static471.method6071(arg3, arg0, arg2, local15, arg1);
		}
		@Pc(186) boolean local186;
		for (@Pc(36) Class2_Sub40 local36 = (Class2_Sub40) Static524.aClass70_58.method1264(); local36 != null; local36 = (Class2_Sub40) Static524.aClass70_58.method1261()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class61 local45 = local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.method6767();
			if (local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 == -1 || local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.aBoolean710) {
				local40 = 0;
			} else if (local45.anInt1317 == local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 || local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 == local45.anInt1325 || local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 == local45.anInt1331 || local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 == local45.anInt1328) {
				local40 = 2;
			} else if (local45.anInt1301 == local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 || local45.anInt1309 == local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 || local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351 == local45.anInt1312 || local45.anInt1298 == local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt8351) {
				local40 = 3;
			}
			if (local40 != local36.anInt7181) {
				@Pc(145) int local145 = Static473.method6141(local36.aClass12_Sub2_Sub1_Sub4_Sub2_2);
				@Pc(149) Class295 local149 = local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.aClass295_1;
				if (local149.anIntArray493 != null) {
					local149 = local149.method5942(Static426.aClass160_1);
				}
				if (local149 == null || local145 == -1) {
					local36.anInt7190 = -1;
					local36.anInt7181 = local40;
					local36.aBoolean592 = false;
				} else if (local36.anInt7190 == local145 && local149.aBoolean616 == local36.aBoolean592) {
					local36.anInt7181 = local40;
					local36.anInt7175 = local149.anInt7335;
				} else {
					local186 = false;
					if (local36.aClass2_Sub3_Sub3_2 == null) {
						local186 = true;
					} else {
						local36.anInt7175 -= 512;
						if (local36.anInt7175 <= 0) {
							Static246.aClass2_Sub3_Sub4_2.method6705(local36.aClass2_Sub3_Sub3_2);
							local186 = true;
							local36.aClass2_Sub3_Sub3_2 = null;
						}
					}
					if (local186) {
						local36.anInt7190 = local145;
						local36.aClass2_Sub37_2 = null;
						local36.aBoolean592 = local149.aBoolean616;
						local36.anInt7175 = local149.anInt7335;
						local36.aClass2_Sub13_Sub1_2 = null;
						local36.anInt7181 = local40;
					}
				}
			}
			local36.anInt7178 = local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt9374;
			local36.anInt7187 = local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt9374 + (local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.method6777() << 8);
			local36.anInt7184 = local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt9375;
			local36.anInt7188 = local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.anInt9375 + (local36.aClass12_Sub2_Sub1_Sub4_Sub2_2.method6777() << 8);
			Static471.method6071(arg3, arg0, arg2, local36, arg1);
		}
		for (@Pc(304) Class2_Sub40 local304 = (Class2_Sub40) Static399.aClass90_23.method1676(); local304 != null; local304 = (Class2_Sub40) Static399.aClass90_23.method1680()) {
			@Pc(308) byte local308 = 1;
			@Pc(313) Class61 local313 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.method6767();
			if (local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 == -1 || local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.aBoolean710) {
				local308 = 0;
			} else if (local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 == local313.anInt1317 || local313.anInt1325 == local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 || local313.anInt1331 == local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 || local313.anInt1328 == local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351) {
				local308 = 2;
			} else if (local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 == local313.anInt1301 || local313.anInt1309 == local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 || local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351 == local313.anInt1312 || local313.anInt1298 == local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt8351) {
				local308 = 3;
			}
			if (local304.anInt7181 != local308) {
				@Pc(410) int local410 = Static542.method5365(local304.aClass12_Sub2_Sub1_Sub4_Sub1_24);
				if (local410 == local304.anInt7190 && local304.aBoolean592 == local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.aBoolean458) {
					local304.anInt7181 = local308;
					local304.anInt7175 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt5820;
				} else {
					local186 = false;
					if (local304.aClass2_Sub3_Sub3_2 == null) {
						local186 = true;
					} else {
						local304.anInt7175 -= 512;
						if (local304.anInt7175 <= 0) {
							Static246.aClass2_Sub3_Sub4_2.method6705(local304.aClass2_Sub3_Sub3_2);
							local186 = true;
							local304.aClass2_Sub3_Sub3_2 = null;
						}
					}
					if (local186) {
						local304.aClass2_Sub13_Sub1_2 = null;
						local304.anInt7175 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt5820;
						local304.aClass2_Sub37_2 = null;
						local304.aBoolean592 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.aBoolean458;
						local304.anInt7190 = local410;
						local304.anInt7181 = local308;
					}
				}
			}
			local304.anInt7178 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt9374;
			local304.anInt7187 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt9374 + (local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.method6777() << 8);
			local304.anInt7184 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt9375;
			local304.anInt7188 = local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt9375 + (local304.aClass12_Sub2_Sub1_Sub4_Sub1_24.method6777() << 8);
			Static471.method6071(arg3, arg0, arg2, local304, arg1);
		}
	}
}
