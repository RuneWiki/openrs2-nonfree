import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "Lclient!sea;")
	public static Class308 aClass308_60;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_33 = new Class208(27, 2);

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "Lclient!hw;")
	public static final Class148 aClass148_2 = new Class148();

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "[I")
	public static final int[] anIntArray131 = new int[2];

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
	public static int anInt2940 = -1;

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_34 = new Class208(24, -1);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BI[BIIIII[B)V")
	public static void method2550(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg4 >> 2);
		@Pc(19) int local19 = -(arg4 & 0x3);
		for (@Pc(22) int local22 = -arg6; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg0++;
				arg1[local30] = (byte) (arg1[local30] - arg7[arg3++]);
				@Pc(43) int local43 = arg0++;
				arg1[local43] = (byte) (arg1[local43] - arg7[arg3++]);
				@Pc(56) int local56 = arg0++;
				arg1[local56] = (byte) (arg1[local56] - arg7[arg3++]);
				@Pc(69) int local69 = arg0++;
				arg1[local69] = (byte) (arg1[local69] - arg7[arg3++]);
			}
			for (@Pc(85) int local85 = local19; local85 < 0; local85++) {
				local30 = arg0++;
				arg1[local30] = (byte) (arg1[local30] - arg7[arg3++]);
			}
			arg0 += arg5;
			arg3 += arg2;
		}
	}
}
