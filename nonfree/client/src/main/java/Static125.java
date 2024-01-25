import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_91 = new Class214(53, 7);

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "S")
	public static short aShort23 = 205;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "J")
	public static long aLong79 = -1L;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public static int anInt2599 = -1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZLclient!kg;I)V")
	public static void method2339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class130 arg4, @OriginalArg(6) int arg5) {
		if (Static93.anInt2064 >= 50 || (arg4 == null || arg4.anIntArrayArray28 == null || arg1 >= arg4.anIntArrayArray28.length || arg4.anIntArrayArray28[arg1] == null)) {
			return;
		}
		@Pc(34) int local34 = arg4.anIntArrayArray28[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg4.anIntArrayArray28[arg1].length > 1) {
			local61 = (int) ((double) arg4.anIntArrayArray28[arg1].length * Math.random());
			if (local61 > 0) {
				local38 = arg4.anIntArrayArray28[arg1][local61];
			}
		}
		@Pc(74) int local74 = local34 & 0x1F;
		if (local74 == 0) {
			if (arg3) {
				Static420.method5852(local44, local38, 255, 0);
			}
		} else if (Static157.aClass185_Sub1_1.anInt5555 != 0) {
			local61 = arg0 - 64 >> 7;
			@Pc(101) int local101 = arg2 - 64 >> 7;
			Static121.aClass7Array2[Static93.anInt2064++] = new Class7((byte) 1, local38, local44, 0, 255, local74 + (arg5 << 24) + (local61 << 16) + (local101 << 8));
		}
	}
}
