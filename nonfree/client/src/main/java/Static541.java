import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "J")
	public static long aLong241;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!vc;")
	public static Class349 aClass349_4;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIIJ)V")
	public static void method7682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(21) int local21 = (int) arg2 >> 14 & 0x1F;
		@Pc(28) int local28 = (int) arg2 >> 20 & 0x3;
		@Pc(35) int local35 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local21 != 10 && local21 != 11 && local21 != 22) {
			Static167.method3514(local28, 0, true, 0, local21, arg1, 0, arg0);
			return;
		}
		@Pc(65) Class272 local65 = aClass349_4.method8123(local35);
		@Pc(76) int local76;
		@Pc(73) int local73;
		if (local28 == 0 || local28 == 2) {
			local73 = local65.anInt8284;
			local76 = local65.anInt8263;
		} else {
			local76 = local65.anInt8284;
			local73 = local65.anInt8263;
		}
		@Pc(87) int local87 = local65.anInt8277;
		if (local28 != 0) {
			local87 = (local87 << local28 & 0xF) + (local87 >> 4 - local28);
		}
		Static167.method3514(0, local87, true, local73, 0, arg1, local76, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILclient!eq;II)Lclient!mba;")
	public static Class121_Sub2_Sub1 method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean275 || Static474.method7016(arg4) && Static474.method7016(arg1)) {
			return new Class121_Sub2_Sub1(arg3, 3553, arg2, arg0, arg4, arg1, true);
		} else if (arg3.aBoolean262) {
			return new Class121_Sub2_Sub1(arg3, 34037, arg2, arg0, arg4, arg1, true);
		} else {
			return new Class121_Sub2_Sub1(arg3, arg2, arg0, arg4, arg1, Static95.method2482(arg4), Static95.method2482(arg1), true);
		}
	}
}
