import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public static int anInt7686;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt7682 = 104;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt7683 = 0;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_76 = new Class230(34, 7);

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt7687 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIIII)V")
	public static void method6326(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static535.anInt9696 = 0;
		Static35.anInt993 = arg0;
		Static208.anInt4309 = arg1;
		Static55.anInt1303 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIJIIIILclient!tc;Lclient!fa;)V")
	public static void method6327(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class305 arg6, @OriginalArg(8) Class93 arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg5 * arg5;
		if ((long) local11 > arg1) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg6.anInt9242 / 2, arg6.anInt9160 / 2);
		if (local31 * local31 >= local11) {
			Static353.method5872(Static460.aClass37Array9[arg0], arg4, arg7, arg3, arg6, arg5, arg2);
			return;
		}
		local31 -= 10;
		@Pc(57) int local57;
		if (Static267.anInt5668 == 4) {
			local57 = (int) Static533.aFloat188 & 0x3FFF;
		} else {
			local57 = (int) Static533.aFloat188 + Static288.anInt5964 & 0x3FFF;
		}
		@Pc(70) int local70 = Class2_Sub3.anIntArray620[local57];
		@Pc(74) int local74 = Class2_Sub3.anIntArray621[local57];
		if (Static267.anInt5668 != 4) {
			local70 = local70 * 256 / (Static66.anInt1706 + 256);
			local74 = local74 * 256 / (Static66.anInt1706 + 256);
		}
		@Pc(105) int local105 = arg5 * local74 + arg3 * local70 >> 14;
		@Pc(115) int local115 = arg3 * local74 - local70 * arg5 >> 14;
		@Pc(121) double local121 = Math.atan2((double) local105, (double) local115);
		@Pc(128) int local128 = (int) ((double) local31 * Math.sin(local121));
		@Pc(135) int local135 = (int) ((double) local31 * Math.cos(local121));
		Static594.aClass37Array17[arg0].method7075((float) local128 + (float) arg2 + (float) arg6.anInt9242 / 2.0F, (float) arg4 + (float) arg6.anInt9160 / 2.0F - (float) local135, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}
}
