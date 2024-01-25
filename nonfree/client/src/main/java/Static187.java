import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
	public static int anInt3599;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_84 = new Class150(49, 6);

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "Lclient!mo;")
	public static Class201 aClass201_1 = new Class201();

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
	public static final int anInt3604 = 52;

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_85 = new Class150(26, 4);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public static void method3149() {
		Static303.anInt5999 = 0;
		Static331.anInt6285 = 0;
		Static327.anInt6257 = 0;
		Static162.anInt3280 = 0;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public static void method3151() {
		if (!Static479.aBoolean594) {
			return;
		}
		@Pc(11) Class220 local11 = Static485.method6724(Static496.anInt8516, Static207.anInt3882);
		if (local11 != null && local11.anObjectArray18 != null) {
			@Pc(20) Class5_Sub17 local20 = new Class5_Sub17();
			local20.anObjectArray3 = local11.anObjectArray18;
			local20.aClass220_5 = local11;
			Static266.method4403(local20);
		}
		Static479.aBoolean594 = false;
		Static92.anInt2142 = -1;
		Static383.anInt7004 = -1;
		if (local11 != null) {
			Static377.method5650(local11);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIILclient!oh;JLclient!pa;II)V")
	public static void method3152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class220 arg3, @OriginalArg(5) long arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) int local20 = arg7 * arg7 + arg6 * arg6;
		if ((long) local20 > arg4) {
			return;
		}
		@Pc(40) int local40 = Math.min(arg3.anInt6627 / 2, arg3.anInt6681 / 2);
		if (local20 <= local40 * local40) {
			Static295.method4921(arg7, arg3, arg6, arg5, Static167.aClass25Array9[arg2], arg0, arg1);
			return;
		}
		local40 -= 10;
		@Pc(56) int local56;
		if (Static166.anInt3343 == 4) {
			local56 = (int) Static476.aFloat339 & 0x3FFF;
		} else {
			local56 = Static352.anInt6565 + (int) Static476.aFloat339 & 0x3FFF;
		}
		@Pc(69) int local69 = Class5_Sub2_Sub16.anIntArray411[local56];
		@Pc(73) int local73 = Class5_Sub2_Sub16.anIntArray410[local56];
		if (Static166.anInt3343 != 4) {
			local73 = local73 * 256 / (Static145.anInt3048 + 256);
			local69 = local69 * 256 / (Static145.anInt3048 + 256);
		}
		@Pc(103) int local103 = local69 * arg6 + local73 * arg7 >> 15;
		@Pc(113) int local113 = local73 * arg6 - local69 * arg7 >> 15;
		@Pc(119) double local119 = Math.atan2((double) local103, (double) local113);
		@Pc(126) int local126 = (int) ((double) local40 * Math.sin(local119));
		@Pc(133) int local133 = (int) (Math.cos(local119) * (double) local40);
		Static529.aClass25Array17[arg2].method6962((float) arg0 + (float) arg3.anInt6627 / 2.0F + (float) local126, (float) -local133 + (float) arg1 + (float) arg3.anInt6681 / 2.0F, 4096, (int) (-local119 / 6.283185307179586D * 65535.0D));
	}
}
