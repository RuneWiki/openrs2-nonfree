import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!sha;")
	public static Class304 aClass304_4;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
	public static boolean aBoolean676;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	public static int anInt9875;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_176 = new Class268(32, 6);

	@OriginalMember(owner = "client!v", name = "h", descriptor = "[Lclient!pr;")
	public static final Class260[] aClass260Array1 = new Class260[2048];

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray54 = new boolean[200];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!aa;BLclient!sca;IJII)V")
	public static void method8331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(4) Class302 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg1 * arg1 + arg4 * arg4;
		if (arg5 < (long) local15) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg3.anInt8801 / 2, arg3.anInt8814 / 2);
		if (local15 <= local35 * local35) {
			Static512.method7605(arg2, arg1, arg6, arg3, Static257.aClass32Array13[arg7], arg0, arg4);
			return;
		}
		local35 -= 10;
		@Pc(65) int local65;
		if (Static334.anInt6354 == 4) {
			local65 = (int) Static284.aFloat164 & 0x3FFF;
		} else {
			local65 = (int) Static284.aFloat164 + Static298.anInt6417 & 0x3FFF;
		}
		@Pc(78) int local78 = Class100_Sub1.anIntArray428[local65];
		@Pc(82) int local82 = Class100_Sub1.anIntArray429[local65];
		if (Static334.anInt6354 != 4) {
			local82 = local82 * 256 / (Static620.anInt10702 + 256);
			local78 = local78 * 256 / (Static620.anInt10702 + 256);
		}
		@Pc(113) int local113 = arg1 * local78 + local82 * arg4 >> 14;
		@Pc(124) int local124 = arg1 * local82 - local78 * arg4 >> 14;
		@Pc(130) double local130 = Math.atan2((double) local113, (double) local124);
		@Pc(137) int local137 = (int) (Math.sin(local130) * (double) local35);
		@Pc(144) int local144 = (int) (Math.cos(local130) * (double) local35);
		Static145.aClass32Array9[arg7].method5087((float) arg3.anInt8801 / 2.0F + (float) arg0 + (float) local137, (float) arg3.anInt8814 / 2.0F + (float) arg6 - (float) local144, 4096, (int) (-local130 / 6.283185307179586D * 65535.0D));
	}
}
