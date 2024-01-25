import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[B")
	public static byte[] aByteArray53;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!up;")
	public static Class243 aClass243_2;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "J")
	public static long aLong129;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public static int anInt4117;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!em;")
	public static Class1_Sub8 aClass1_Sub8_2;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_110 = new Class131(64, 7);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZILclient!qp;III)V")
	public static void method3411(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class191 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static442.anInt5016 >= 50 || (arg3 == null || arg3.anIntArrayArray165 == null || arg3.anIntArrayArray165.length <= arg4 || arg3.anIntArrayArray165[arg4] == null)) {
			return;
		}
		@Pc(30) int local30 = arg3.anIntArrayArray165[arg4][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(48) int local48 = local30 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg3.anIntArrayArray165[arg4].length > 1) {
			local65 = (int) ((double) arg3.anIntArrayArray165[arg4].length * Math.random());
			if (local65 > 0) {
				local34 = arg3.anIntArrayArray165[arg4][local65];
			}
		}
		@Pc(78) int local78 = local30 & 0x1F;
		if (local78 == 0) {
			if (arg1) {
				Static161.method2442(255, local48, local34, 0);
			}
		} else if (Static389.aClass128_Sub1_1.anInt3573 != 0) {
			local65 = arg2 - 64 >> 7;
			@Pc(108) int local108 = arg0 - 64 >> 7;
			Static254.aClass12Array1[Static442.anInt5016++] = new Class12((byte) 1, local34, local48, 0, 255, local78 + (local108 << 8) + (local65 << 16) + (arg5 << 24));
		}
	}
}
