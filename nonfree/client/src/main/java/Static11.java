import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "Lclient!qf;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	public static int anInt194;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_11 = new Class157(45, 4);

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!fh;ILclient!or;IIIIZI)V")
	public static void method170(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg5 * arg5 + arg7 * arg7;
		if (arg1 < local15) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg0.anInt1874 / 2, arg0.anInt1845 / 2);
		if (local33 * local33 >= local15) {
			Static343.method3355(Static56.aClass46Array6[arg6], arg2, arg0, arg4, arg3, arg7, arg5);
			return;
		}
		local33 -= 10;
		@Pc(61) int local61;
		if (Static135.anInt2910 == 4) {
			local61 = (int) Static366.aFloat48 & 0x3FFF;
		} else {
			local61 = Static85.anInt1601 + (int) Static366.aFloat48 & 0x3FFF;
		}
		@Pc(74) int local74 = Class101.anIntArray234[local61];
		@Pc(78) int local78 = Class101.anIntArray235[local61];
		if (Static135.anInt2910 != 4) {
			local74 = local74 * 256 / (Static267.anInt5561 + 256);
			local78 = local78 * 256 / (Static267.anInt5561 + 256);
		}
		@Pc(110) int local110 = arg5 * local74 + local78 * arg7 >> 15;
		@Pc(121) int local121 = local78 * arg5 - local74 * arg7 >> 15;
		@Pc(127) double local127 = Math.atan2((double) local110, (double) local121);
		@Pc(134) int local134 = (int) (Math.sin(local127) * (double) local33);
		@Pc(141) int local141 = (int) ((double) local33 * Math.cos(local127));
		Static132.aClass46Array26[arg6].method5030((float) local134 + (float) arg0.anInt1874 / 2.0F + (float) arg3, (float) arg4 + (float) arg0.anInt1845 / 2.0F - (float) local141, 4096, (int) (-local127 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLclient!iq;Lclient!iq;)V")
	public static void method171(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class104 arg1) {
		Static124.aClass104_77 = arg0;
		Static64.aClass104_44 = arg1;
		Static124.aClass104_77.method2745(34);
	}
}
