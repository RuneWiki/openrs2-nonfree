import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "Lclient!ha;")
	public static Class133 aClass133_14;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	public static int anInt9295 = 0;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "Lclient!cr;")
	public static final Class63 aClass63_6 = new Class63("runescape", 0);

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	public static int anInt9297 = 0;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "[I")
	public static final int[] anIntArray510 = new int[14];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([BI[BIIIIII)V")
	public static void method8024(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(22) int local22 = -(arg5 >> 2);
		@Pc(27) int local27 = -(arg5 & 0x3);
		for (@Pc(30) int local30 = -arg3; local30 < 0; local30++) {
			@Pc(38) int local38;
			for (@Pc(34) int local34 = local22; local34 < 0; local34++) {
				local38 = arg4++;
				arg2[local38] += arg0[arg6++];
				@Pc(50) int local50 = arg4++;
				arg2[local50] += arg0[arg6++];
				@Pc(62) int local62 = arg4++;
				arg2[local62] += arg0[arg6++];
				@Pc(74) int local74 = arg4++;
				arg2[local74] += arg0[arg6++];
			}
			for (@Pc(92) int local92 = local27; local92 < 0; local92++) {
				local38 = arg4++;
				arg2[local38] += arg0[arg6++];
			}
			arg4 += arg7;
			arg6 += arg1;
		}
	}
}
