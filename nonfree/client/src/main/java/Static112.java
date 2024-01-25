import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([SII)[S")
	public static short[] method1972(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static600.method3770(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
	public static boolean method1973() {
		return Static539.aBoolean655;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lclient!rr;")
	public static Class290 method1974(@OriginalArg(0) int arg0) {
		@Pc(8) Class290[] local8 = Static129.method2218();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class290 local16 = local8[local10];
			if (arg0 == local16.anInt7898) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!ua;IJIILclient!wv;I)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class365 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if (arg3 < (long) local11) {
			return;
		}
		@Pc(38) int local38 = Math.min(arg6.anInt9578 / 2, arg6.anInt9638 / 2);
		if (local38 * local38 >= local11) {
			Static229.method7248(arg1, arg5, arg6, arg2, arg0, arg7, Static492.aClass10Array23[arg4]);
			return;
		}
		local38 -= 10;
		@Pc(66) int local66;
		if (Static585.anInt9461 == 4) {
			local66 = (int) Static143.aFloat61 & 0x3FFF;
		} else {
			local66 = Static368.anInt6520 + (int) Static143.aFloat61 & 0x3FFF;
		}
		@Pc(79) int local79 = Class151.anIntArray244[local66];
		@Pc(83) int local83 = Class151.anIntArray245[local66];
		if (Static585.anInt9461 != 4) {
			local79 = local79 * 256 / (Static536.anInt8845 + 256);
			local83 = local83 * 256 / (Static536.anInt8845 + 256);
		}
		@Pc(112) int local112 = local83 * arg0 + local79 * arg5 >> 14;
		@Pc(123) int local123 = arg5 * local83 - arg0 * local79 >> 14;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local38);
		@Pc(143) int local143 = (int) ((double) local38 * Math.cos(local129));
		Static130.aClass10Array20[arg4].method7678((float) local136 + (float) arg7 + (float) arg6.anInt9578 / 2.0F, (float) -local143 + (float) arg6.anInt9638 / 2.0F + (float) arg1, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}
}
