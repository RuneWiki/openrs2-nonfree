import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_86 = new Class146(57, -1);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ma;IIILclient!hd;IJII)V")
	public static void method4895(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class110 arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg2 * arg2;
		if ((long) local11 > arg5) {
			return;
		}
		@Pc(27) int local27 = Math.min(arg4.anInt2617 / 2, arg4.anInt2590 / 2);
		if (local11 <= local27 * local27) {
			Static119.method4570(arg1, arg2, arg0, Static450.aClass95Array16[arg3], arg7, arg6, arg4);
			return;
		}
		local27 -= 10;
		@Pc(54) int local54;
		if (Static97.anInt1791 == 4) {
			local54 = (int) Static109.aFloat75 & 0x3FFF;
		} else {
			local54 = (int) Static109.aFloat75 + Static35.anInt575 & 0x3FFF;
		}
		@Pc(65) int local65 = Class100.anIntArray206[local54];
		@Pc(69) int local69 = Class100.anIntArray208[local54];
		if (Static97.anInt1791 != 4) {
			local65 = local65 * 256 / (Static380.anInt6188 + 256);
			local69 = local69 * 256 / (Static380.anInt6188 + 256);
		}
		@Pc(100) int local100 = arg2 * local69 + arg6 * local65 >> 15;
		@Pc(111) int local111 = local69 * arg6 - local65 * arg2 >> 15;
		@Pc(117) double local117 = Math.atan2((double) local100, (double) local111);
		@Pc(124) int local124 = (int) (Math.sin(local117) * (double) local27);
		@Pc(131) int local131 = (int) (Math.cos(local117) * (double) local27);
		Static102.aClass95Array4[arg3].method5824((float) arg7 + (float) arg4.anInt2617 / 2.0F + (float) local124, (float) -local131 + (float) arg4.anInt2590 / 2.0F + (float) arg1, 4096, (int) (-local117 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBI)V")
	public static void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class4_Sub2_Sub17 local13 = Static34.method1709(11, arg2);
		local13.method5529();
		local13.anInt6873 = arg0;
		local13.anInt6871 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIII)V")
	public static void method4899(@OriginalArg(0) boolean arg0) {
		Static145.anInt2577 = 22050;
		Static391.aBoolean443 = arg0;
		Static365.anInt6046 = 2;
	}
}
