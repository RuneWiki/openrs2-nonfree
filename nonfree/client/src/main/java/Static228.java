import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!jw;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
	public static int anInt3956;

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[200];

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "[Lclient!ur;")
	public static final Class349[] aClass349Array1 = new Class349[4];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZIIIILclient!wu;)V")
	public static void method3581(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class384 arg2) {
		Static513.method7410(arg0, arg2, arg1, 0L);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBIILclient!aa;ILclient!vfa;JI)V")
	public static void method3583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class357 arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg2 * arg2 + arg1 * arg1;
		if (arg6 < (long) local16) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg5.anInt9852 / 2, arg5.anInt9797 / 2);
		if (local16 <= local32 * local32) {
			Static554.method7808(arg3, arg0, Static405.aClass44Array10[arg7], arg1, arg2, arg4, arg5);
			return;
		}
		local32 -= 10;
		@Pc(52) int local52;
		if (Static584.anInt9543 == 4) {
			local52 = (int) Static112.aFloat22 & 0x3FFF;
		} else {
			local52 = (int) Static112.aFloat22 + Static402.anInt9327 & 0x3FFF;
		}
		@Pc(65) int local65 = Class5_Sub12_Sub1.anIntArray748[local52];
		@Pc(69) int local69 = Class5_Sub12_Sub1.anIntArray749[local52];
		if (Static584.anInt9543 != 4) {
			local65 = local65 * 256 / (Static425.anInt7212 + 256);
			local69 = local69 * 256 / (Static425.anInt7212 + 256);
		}
		@Pc(100) int local100 = arg2 * local69 + arg1 * local65 >> 14;
		@Pc(111) int local111 = arg1 * local69 - local65 * arg2 >> 14;
		@Pc(117) double local117 = Math.atan2((double) local100, (double) local111);
		@Pc(124) int local124 = (int) ((double) local32 * Math.sin(local117));
		@Pc(131) int local131 = (int) (Math.cos(local117) * (double) local32);
		Static285.aClass44Array9[arg7].method5306((float) arg5.anInt9852 / 2.0F + (float) arg0 + (float) local124, (float) arg4 + (float) arg5.anInt9797 / 2.0F - (float) local131, 4096, (int) (-local117 / 6.283185307179586D * 65535.0D));
	}
}
