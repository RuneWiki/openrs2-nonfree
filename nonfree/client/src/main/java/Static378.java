import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public static int anInt6960;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
	public static final int[] anIntArray547 = new int[500];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
	public static boolean method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static388.method5701(arg0, arg1) | (arg0 & 0x2000) != 0 | Static160.method2897(arg0, arg1)) & Static205.method3345(arg1, arg0);
	}
}
