import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[B")
	public static byte[] aByteArray61;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "[I")
	public static final int[] anIntArray384 = new int[1];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
	public static void method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(15) int local15 = arg4 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static427.method6552(arg3, arg4, arg0, arg2);
			}
		} else if (local15 == 0) {
			Static504.method7477(arg3, arg0, arg2, arg1);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(52) int local52 = arg0 - (local44 * arg3 >> 12);
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (Static251.anInt5168 > arg1) {
				local73 = (Static251.anInt5168 * local44 >> 12) + local52;
				local64 = Static251.anInt5168;
			} else if (arg1 > Static341.anInt6481) {
				local64 = Static341.anInt6481;
				local73 = local52 + (local44 * Static341.anInt6481 >> 12);
			} else {
				local73 = arg4;
				local64 = arg1;
			}
			@Pc(96) int local96;
			@Pc(104) int local104;
			if (arg3 < Static251.anInt5168) {
				local96 = Static251.anInt5168;
				local104 = (Static251.anInt5168 * local44 >> 12) + local52;
			} else if (Static341.anInt6481 < arg3) {
				local96 = Static341.anInt6481;
				local104 = (Static341.anInt6481 * local44 >> 12) + local52;
			} else {
				local96 = arg3;
				local104 = arg0;
			}
			if (Static507.anInt9124 > local73) {
				local64 = (Static507.anInt9124 - local52 << 12) / local44;
				local73 = Static507.anInt9124;
			} else if (local73 > Static234.anInt4897) {
				local64 = (Static234.anInt4897 - local52 << 12) / local44;
				local73 = Static234.anInt4897;
			}
			if (Static507.anInt9124 > local104) {
				local96 = (Static507.anInt9124 - local52 << 12) / local44;
				local104 = Static507.anInt9124;
			} else if (Static234.anInt4897 < local104) {
				local96 = (Static234.anInt4897 - local52 << 12) / local44;
				local104 = Static234.anInt4897;
			}
			Static308.method4986(local73, local104, local64, local96, arg2);
		}
	}
}
