import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	public static int anInt5498;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
	public static final int anInt5496 = 12;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "[I")
	public static final int[] anIntArray369 = new int[8];

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "[I")
	public static final int[] anIntArray370 = new int[13];

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Z")
	public static boolean aBoolean475 = false;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Lclient!eh;")
	public static Class7_Sub4 method4313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub4_1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(FIFFIIIFLclient!gi;FI)[B")
	public static byte[] method4315(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) Class89 arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static442.method5820(arg4, arg2, 0, arg5, arg3, arg0, arg1, local10);
		return local10;
	}
}
