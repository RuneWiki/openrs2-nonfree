import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kfa", name = "w", descriptor = "F")
	public static float aFloat129;

	@OriginalMember(owner = "client!kfa", name = "z", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_63 = new Class208(65, 2);

	@OriginalMember(owner = "client!kfa", name = "D", descriptor = "Lclient!pn;")
	public static final Class271 aClass271_7 = new Class271(1);

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIII)V")
	public static void method3923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub4 local11 = (Class1_Sub4) Static592.aClass111_65.method2547(); local11 != null; local11 = (Class1_Sub4) Static592.aClass111_65.method2554()) {
			Static561.method7585(arg3, arg2, arg0, local11, arg1);
		}
		@Pc(188) boolean local188;
		for (@Pc(36) Class1_Sub4 local36 = (Class1_Sub4) Static452.aClass111_52.method2547(); local36 != null; local36 = (Class1_Sub4) Static452.aClass111_52.method2554()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class114 local45 = local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.method6073();
			if (local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 == -1 || local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.aBoolean575) {
				local40 = 0;
			} else if (local45.anInt2994 == local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 || local45.anInt3009 == local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 || local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 == local45.anInt3023 || local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 == local45.anInt2993) {
				local40 = 2;
			} else if (local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 == local45.anInt3006 || local45.anInt2989 == local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 || local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577 == local45.anInt3002 || local45.anInt3018 == local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt7577) {
				local40 = 3;
			}
			if (local36.anInt226 != local40) {
				@Pc(137) int local137 = Static227.method3387(local36.aClass11_Sub1_Sub1_Sub3_Sub2_1);
				@Pc(141) Class354 local141 = local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.aClass354_1;
				if (local141.anIntArray597 != null) {
					local141 = local141.method7683(Static390.aClass353_29);
				}
				if (local141 == null || local137 == -1) {
					local36.anInt226 = local40;
					local36.anInt230 = -1;
					local36.aBoolean5 = false;
				} else if (local36.anInt230 == local137 && local36.aBoolean5 == local141.aBoolean699) {
					local36.anInt226 = local40;
					local36.anInt228 = local141.anInt9426;
				} else {
					local188 = false;
					if (local36.aClass1_Sub6_Sub4_1 == null) {
						local188 = true;
					} else {
						local36.anInt228 -= 512;
						if (local36.anInt228 <= 0) {
							Static425.aClass1_Sub6_Sub3_2.method6532(local36.aClass1_Sub6_Sub4_1);
							local188 = true;
							local36.aClass1_Sub6_Sub4_1 = null;
						}
					}
					if (local188) {
						local36.aBoolean5 = local141.aBoolean699;
						local36.anInt228 = local141.anInt9426;
						local36.aClass1_Sub13_Sub1_2 = null;
						local36.aClass1_Sub49_2 = null;
						local36.anInt230 = local137;
						local36.anInt226 = local40;
					}
				}
			}
			local36.anInt238 = local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt8902;
			local36.anInt229 = local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt8902 + (local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.method6058() << 8);
			local36.anInt225 = local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt8906;
			local36.anInt224 = local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.anInt8906 + (local36.aClass11_Sub1_Sub1_Sub3_Sub2_1.method6058() << 8);
			Static561.method7585(arg3, arg2, arg0, local36, arg1);
		}
		for (@Pc(300) Class1_Sub4 local300 = (Class1_Sub4) Static60.aClass91_3.method2278(); local300 != null; local300 = (Class1_Sub4) Static60.aClass91_3.method2276()) {
			@Pc(304) byte local304 = 1;
			@Pc(309) Class114 local309 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.method6073();
			if (local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 == -1 || local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.aBoolean575) {
				local304 = 0;
			} else if (local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 == local309.anInt2994 || local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 == local309.anInt3009 || local309.anInt3023 == local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 || local309.anInt2993 == local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577) {
				local304 = 2;
			} else if (local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 == local309.anInt3006 || local309.anInt2989 == local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 || local309.anInt3002 == local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577 || local309.anInt3018 == local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt7577) {
				local304 = 3;
			}
			if (local300.anInt226 != local304) {
				@Pc(409) int local409 = Static126.method2238(local300.aClass11_Sub1_Sub1_Sub3_Sub1_1);
				if (local300.anInt230 == local409 && local300.aBoolean5 == local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.aBoolean260) {
					local300.anInt226 = local304;
					local300.anInt228 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt3588;
				} else {
					local188 = false;
					if (local300.aClass1_Sub6_Sub4_1 == null) {
						local188 = true;
					} else {
						local300.anInt228 -= 512;
						if (local300.anInt228 <= 0) {
							Static425.aClass1_Sub6_Sub3_2.method6532(local300.aClass1_Sub6_Sub4_1);
							local300.aClass1_Sub6_Sub4_1 = null;
							local188 = true;
						}
					}
					if (local188) {
						local300.anInt228 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt3588;
						local300.anInt230 = local409;
						local300.anInt226 = local304;
						local300.aClass1_Sub49_2 = null;
						local300.aClass1_Sub13_Sub1_2 = null;
						local300.aBoolean5 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.aBoolean260;
					}
				}
			}
			local300.anInt238 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt8902;
			local300.anInt229 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt8902 + (local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.method6058() << 8);
			local300.anInt225 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt8906;
			local300.anInt224 = local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.anInt8906 + (local300.aClass11_Sub1_Sub1_Sub3_Sub1_1.method6058() << 8);
			Static561.method7585(arg3, arg2, arg0, local300, arg1);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIII)V")
	public static void method3924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static330.anInt6025 && arg0 + arg2 <= Static194.anInt3788 && Static120.anInt2491 <= arg3 - arg0 && Static71.anInt1350 >= arg0 + arg3) {
			Static65.method1053(arg0, arg1, arg2, arg3);
		} else {
			Static555.method7528(arg1, arg0, arg2, arg3);
		}
	}
}
