import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!ga;")
	public static Class111 aClass111_105;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Lclient!ga;")
	public static Class111 aClass111_106;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	public static int anInt7725;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
	public static int anInt7726;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_182 = new Class81(115, 6);

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString81 = null;

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
	public static final int anInt7724 = 0;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
	public static int anInt7727 = 0;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
	public static int anInt7728 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFF[BFLclient!hc;IBIIIIFI)V")
	public static void method6353(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) Class130 arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(25) int local25;
		@Pc(57) int local57;
		for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
			local25 = arg7;
			arg5.method4620(local12, arg8 / (float) 128, arg6, arg2 / (float) 16, arg1 / (float) 128, 0, arg0 * 127.0F);
			arg8 *= 2.0F;
			for (local57 = 0; local57 < 16384; local57++) {
				arg3[local25] = (byte) ((float) arg3[local25] + local12[local57]);
				local25++;
			}
			arg0 *= arg4;
			arg2 *= 2.0F;
			arg1 *= 2.0F;
		}
		local25 = arg7;
		for (local57 = 0; local57 < 16384; local57++) {
			arg3[local25] = (byte) (arg3[local25] + 127);
			local25++;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V")
	public static void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 != null) {
			Static158.method2429(local7.aClass20_Sub2_Sub3_1);
			if (local7.aClass20_Sub2_Sub3_1 != null) {
				local7.aClass20_Sub2_Sub3_1 = null;
			}
		}
	}
}
