import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_1 = new Class66(14, 1);

	@OriginalMember(owner = "client!io", name = "F", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_2 = new Class66(15, 4);

	@OriginalMember(owner = "client!io", name = "H", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_3 = new Class66(16, -2);

	@OriginalMember(owner = "client!io", name = "K", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_4 = new Class66(17, 0);

	@OriginalMember(owner = "client!io", name = "M", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_5 = new Class66(18, -2);

	@OriginalMember(owner = "client!io", name = "N", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_6 = new Class66(20, 6);

	@OriginalMember(owner = "client!io", name = "O", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_7 = new Class66(21, 8);

	@OriginalMember(owner = "client!io", name = "P", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_8 = new Class66(22, -2);

	@OriginalMember(owner = "client!io", name = "Q", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_9 = new Class66(23, 4);

	@OriginalMember(owner = "client!io", name = "R", descriptor = "Lclient!eh;")
	public static final Class66 aClass66_10 = new Class66(24, -1);

	@OriginalMember(owner = "client!io", name = "U", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_71 = new Class211(32, -1);

	@OriginalMember(owner = "client!io", name = "V", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_97 = new Class48(20, 12);

	@OriginalMember(owner = "client!io", name = "W", descriptor = "[I")
	public static final int[] anIntArray343 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!io", name = "X", descriptor = "[I")
	public static final int[] anIntArray344 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!je;ILclient!dp;Lclient!us;IIII)V")
	public static void method2374(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static323.anInt5463 == 4) {
			local14 = (int) Static386.aFloat82 & 0x3FFF;
		} else {
			local14 = (int) Static386.aFloat82 + Static246.anInt4136 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg0.anInt3074 / 2, arg0.anInt3071 / 2) + 10;
		@Pc(48) int local48 = arg1 * arg1 + arg6 * arg6;
		if (local48 > local39 * local39) {
			return;
		}
		@Pc(58) int local58 = Class13.anIntArray20[local14];
		@Pc(62) int local62 = Class13.anIntArray21[local14];
		if (Static323.anInt5463 != 4) {
			local58 = local58 * 256 / (Static205.anInt3600 + 256);
			local62 = local62 * 256 / (Static205.anInt3600 + 256);
		}
		@Pc(92) int local92 = arg6 * local58 + local62 * arg1 >> 15;
		@Pc(102) int local102 = arg6 * local62 - local58 * arg1 >> 15;
		arg2.method4675(arg0.anInt3074 / 2 + arg5 + local92 - arg2.method4682() / 2, -local102 + (arg4 - -(arg0.anInt3071 / 2)) - arg2.method4673() / 2, arg3, arg5, arg4);
	}
}
