import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hea", name = "J", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "Lclient!td;")
	public static Class24 aClass24_13;

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
	public static int anInt4031;

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_6 = new Class337(10, 7);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!qk;ILclient!qt;ILclient!aa;ILjava/lang/String;Lclient!da;II)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class282 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) Class62 arg9, @OriginalArg(10) int arg10) {
		@Pc(13) int local13;
		if (Static305.anInt5422 == 4) {
			local13 = (int) Static401.aFloat165 & 0x3FFF;
		} else {
			local13 = Static226.anInt1879 + (int) Static401.aFloat165 & 0x3FFF;
		}
		@Pc(48) int local48 = Math.max(arg2.anInt8153 / 2, arg2.anInt8141 / 2) + 10;
		@Pc(56) int local56 = arg3 * arg3 + arg1 * arg1;
		if (local48 * local48 < local56) {
			return;
		}
		@Pc(70) int local70 = Class21.anIntArray656[local13];
		@Pc(74) int local74 = Class21.anIntArray655[local13];
		if (Static305.anInt5422 != 4) {
			local70 = local70 * 256 / (Static517.anInt8961 + 256);
			local74 = local74 * 256 / (Static517.anInt8961 + 256);
		}
		@Pc(106) int local106 = local70 * arg3 + arg1 * local74 >> 14;
		@Pc(116) int local116 = local74 * arg3 - local70 * arg1 >> 14;
		@Pc(123) int local123 = arg4.method7139(100, arg8, null);
		@Pc(131) int local131 = arg4.method7137(100, null, arg8, 0);
		@Pc(137) int local137 = local106 - local123 / 2;
		if (-arg2.anInt8153 <= local137 && arg2.anInt8153 >= local137 && -arg2.anInt8141 <= local116 && local116 <= arg2.anInt8141) {
			arg9.method8375(0, arg8, 0, null, arg7, null, arg0 + arg2.anInt8141 / 2 - local131 - arg5 - local116, 0, arg0, 50, arg10, local123, arg2.anInt8153 / 2 + arg10 + local137, arg6, 1);
		}
	}
}
