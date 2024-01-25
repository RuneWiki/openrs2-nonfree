import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!pq;")
	public static Class251 aClass251_83;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	public static int anInt4689;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	public static int anInt4690;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_112 = new Class40(110, -1);

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public static final int anInt4686 = 1403;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "[S")
	public static final short[] aShortArray79 = new short[] { 18, 11, 9, 25, 15, 21, 10, 30 };

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "[S")
	public static final short[] aShortArray80 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[B[BIIIII)V")
	public static void method4037(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(20) int local20 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg7++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg6++]);
				@Pc(44) int local44 = arg7++;
				arg2[local44] = (byte) (arg2[local44] - arg1[arg6++]);
				@Pc(57) int local57 = arg7++;
				arg2[local57] = (byte) (arg2[local57] - arg1[arg6++]);
				@Pc(70) int local70 = arg7++;
				arg2[local70] = (byte) (arg2[local70] - arg1[arg6++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg7++;
				arg2[local31] = (byte) (arg2[local31] - arg1[arg6++]);
			}
			arg6 += arg5;
			arg7 += arg4;
		}
	}
}
