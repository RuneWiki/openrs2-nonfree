import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)I")
	public static int method8370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static52.aByteArrayArray4 == null ? 0 : Static52.aByteArrayArray4[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V")
	public static void method8373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static348.anInt6489 = arg3;
		Static164.anInt3252 = arg1;
		Static540.anInt9071 = arg4;
		Static134.anInt2813 = arg2;
		Static481.anInt8219 = arg0;
		if (Static481.anInt8219 >= 100) {
			@Pc(26) int local26 = Static348.anInt6489 * 512 + 256;
			@Pc(32) int local32 = Static540.anInt9071 * 512 + 256;
			@Pc(41) int local41 = Static594.method8211(local26, local32, Static65.anInt1298) - Static134.anInt2813;
			@Pc(45) int local45 = local26 - Static419.anInt7345;
			@Pc(50) int local50 = local41 - Static13.anInt232;
			@Pc(55) int local55 = local32 - Static522.anInt8849;
			@Pc(66) int local66 = (int) Math.sqrt((double) (local55 * local55 + local45 * local45));
			Static253.anInt4961 = (int) (Math.atan2((double) local50, (double) local66) * 2607.5945876176133D) & 0x3FFF;
			Static35.anInt545 = (int) (Math.atan2((double) local45, (double) local55) * -2607.5945876176133D) & 0x3FFF;
			Static330.anInt6250 = 0;
			if (Static253.anInt4961 < 1024) {
				Static253.anInt4961 = 1024;
			}
			if (Static253.anInt4961 > 3072) {
				Static253.anInt4961 = 3072;
			}
		}
		Static189.anInt3565 = -1;
		Static68.anInt1361 = -1;
		Static471.anInt8064 = 2;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!uv;Lclient!uv;I)V")
	public static void method8375(@OriginalArg(0) Class344 arg0, @OriginalArg(1) Class344 arg1) {
		@Pc(12) Class3_Sub27 local12 = Static59.method1040(Static325.aClass20_2, Static67.aClass314_27);
		local12.aClass3_Sub9_Sub2_2.method5601(arg1.anInt9571);
		local12.aClass3_Sub9_Sub2_2.method5620(arg0.anInt9586);
		local12.aClass3_Sub9_Sub2_2.method5601(arg0.anInt9571);
		local12.aClass3_Sub9_Sub2_2.method5581(arg0.anInt9567);
		local12.aClass3_Sub9_Sub2_2.method5616(arg1.anInt9567);
		local12.aClass3_Sub9_Sub2_2.method5581(arg1.anInt9586);
		Static148.method2572(local12);
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(II)I")
	public static int method8376(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}
}
