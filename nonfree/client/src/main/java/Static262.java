import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "[I")
	public static final int[] anIntArray420 = new int[8];

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "S")
	public static short aShort58 = 1;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
	public static final int anInt5078 = 1339;

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
	public static int anInt5082 = 0;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBI)Z")
	public static boolean method4707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!qa;IILclient!n;III)V")
	public static void method4708(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static224.anInt4343 < 100) {
			Static491.method7538(arg2, arg0);
		}
		arg0.N(arg3, arg4, arg3 + arg5, arg1 + arg4);
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (Static224.anInt4343 < 100) {
			local33 = arg5 / 2 + arg3;
			local43 = arg1 / 2 + arg4 - 18 - 20;
			arg0.f(arg3, arg4, arg5, arg1, -16777216, 0);
			arg0.method7181(local33 - 152, local43, 304, 34, Static485.aColorArray6[Static332.anInt6229].getRGB(), 0);
			arg0.f(local33 - 150, local43 + 2, Static224.anInt4343 * 3, 30, Static172.aColorArray2[Static332.anInt6229].getRGB(), 0);
			Static511.aClass36_4.method7948(Static467.aClass45_121.method1474(Static544.anInt7853), -1, local43 + 20, Static104.aColorArray7[Static332.anInt6229].getRGB(), local33);
			return;
		}
		@Pc(109) int local109 = Static64.anInt1610 - (int) ((float) arg5 / Static335.aFloat103);
		local33 = Static32.anInt1050 + (int) ((float) arg1 / Static335.aFloat103);
		local43 = Static64.anInt1610 + (int) ((float) arg5 / Static335.aFloat103);
		Static468.anInt8080 = Static64.anInt1610 - (int) ((float) arg5 / Static335.aFloat103);
		Static386.anInt8112 = (int) ((float) (arg1 * 2) / Static335.aFloat103);
		Static516.anInt9149 = (int) ((float) (arg5 * 2) / Static335.aFloat103);
		Static184.anInt3826 = Static32.anInt1050 - (int) ((float) arg1 / Static335.aFloat103);
		@Pc(176) int local176 = Static32.anInt1050 - (int) ((float) arg1 / Static335.aFloat103);
		Static335.method4556(Static335.anInt4941 + local109, local33 - -Static335.anInt4935, Static335.anInt4941 + local43, Static335.anInt4935 + local176, arg3, arg4, arg3 + arg5, arg1 + arg4 + 1);
		Static335.method4560(arg0);
		@Pc(205) Class295 local205 = Static335.method4577(arg0);
		Static530.method8089(local205, arg0);
		if (Static360.anInt6507 > 0) {
			Static486.anInt8594--;
			if (Static486.anInt8594 == 0) {
				Static360.anInt6507--;
				Static486.anInt8594 = 20;
			}
		}
		if (!Static520.aBoolean687) {
			return;
		}
		@Pc(236) int local236 = arg3 + arg5 - 5;
		@Pc(242) int local242 = arg1 + arg4 - 8;
		Static186.aClass36_1.method7949("Fps:" + Static10.anInt280, 16776960, local236, local242);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static186.aClass36_1.method7949("Mem:" + local269 + "k", local271, local236, local257);
		local242 = local257 - 15;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)Lclient!hba;")
	public static Class121 method4709(@OriginalArg(1) int arg0) {
		@Pc(8) Class121[] local8 = Static503.method5032();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class121 local16 = local8[local10];
			if (local16.anInt3423 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
