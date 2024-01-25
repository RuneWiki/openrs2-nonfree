import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pq", name = "Nc", descriptor = "Lclient!ok;")
	public static Class25 aClass25_2;

	@OriginalMember(owner = "client!pq", name = "ve", descriptor = "Z")
	public static boolean aBoolean514;

	@OriginalMember(owner = "client!pq", name = "V", descriptor = "Lclient!ke;")
	public static final Class189 aClass189_5 = new Class189(128);

	@OriginalMember(owner = "client!pq", name = "rc", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!pq", name = "pe", descriptor = "Lclient!v;")
	public static final Class362 aClass362_44 = new Class362();

	@OriginalMember(owner = "client!pq", name = "se", descriptor = "[I")
	public static final int[] anIntArray519 = new int[50];

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(Z)V")
	public static void method6735() {
		@Pc(17) Class6_Sub26 local17 = Static268.method3981(Static377.aClass15_2, Static641.aClass289_148);
		local17.aClass6_Sub23_Sub1_2.method8347(Static102.anInt1886);
		Static670.method9077(local17);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FIIFIFIILclient!nh;FII[BF)V")
	public static void method6810(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class71 arg5, @OriginalArg(9) float arg6, @OriginalArg(12) byte[] arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(22) int local22;
		@Pc(52) int local52;
		for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
			local22 = arg1;
			arg5.method1758(arg2 / (float) 128, 0, local12, arg0 / (float) 128, arg3 / (float) 16, arg4, arg6 * 127.0F);
			arg3 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg7[local22] = (byte) (int) ((float) arg7[local22] + local12[local52]);
				local22++;
			}
			arg6 *= arg8;
			arg0 *= 2.0F;
			arg2 *= 2.0F;
		}
		local22 = arg1;
		for (local52 = 0; local52 < 16384; local52++) {
			arg7[local22] = (byte) (arg7[local22] + 127);
			local22++;
		}
	}
}
