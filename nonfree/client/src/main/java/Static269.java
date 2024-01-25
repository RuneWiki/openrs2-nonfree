import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[2];

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_95 = new Class359(35, 4);

	@OriginalMember(owner = "client!it", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public static int anInt4977 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BILclient!uaa;I)V")
	public static void method4158(@OriginalArg(1) int arg0, @OriginalArg(2) Class345 arg1, @OriginalArg(3) int arg2) {
		Static99.anInt2172 = arg2;
		Static16.anInt263 = arg0;
		Static528.aClass345_11 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)V")
	public static void method4159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(11, (long) arg1);
		local14.method7286();
		local14.anInt8549 = arg0;
		local14.anInt8546 = arg2;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B[B)V")
	public static void method4164(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class5_Sub41 local18 = new Class5_Sub41(arg0);
		@Pc(20) boolean local20 = false;
		while (true) {
			while (true) {
				@Pc(24) int local24 = local18.method7816();
				if (local24 == 0) {
					if (local20) {
						return;
					}
					if (Static152.anIntArray133 == null) {
						Static152.anIntArray133 = new int[4];
						Static430.anInt58 = 4;
						Static511.anIntArray480 = new int[4];
					}
					for (local24 = 0; local24 < Static152.anIntArray133.length; local24++) {
						Static152.anIntArray133[local24] = 0;
						Static511.anIntArray480[local24] = local24 * 20;
					}
					return;
				}
				if (local24 == 1) {
					if (Static152.anIntArray133 == null) {
						Static430.anInt58 = 4;
						Static511.anIntArray480 = new int[4];
						Static152.anIntArray133 = new int[4];
					}
					for (@Pc(72) int local72 = 0; local72 < Static152.anIntArray133.length; local72++) {
						Static152.anIntArray133[local72] = local18.method7849();
						Static511.anIntArray480[local72] = local18.method7849();
					}
					local20 = true;
				} else if (local24 == 2) {
					Static105.anInt2259 = local18.method7860();
				} else if (local24 == 3) {
					Static430.anInt58 = local18.method7816();
					Static152.anIntArray133 = new int[Static430.anInt58];
					Static511.anIntArray480 = new int[Static430.anInt58];
				}
			}
		}
	}
}
