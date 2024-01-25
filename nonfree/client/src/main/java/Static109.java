import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_23 = new Class171(105, 3);

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[200];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[B[BIIIII)V")
	public static void method1709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg7++;
				arg3[local30] += arg2[arg0++];
				@Pc(42) int local42 = arg7++;
				arg3[local42] += arg2[arg0++];
				@Pc(54) int local54 = arg7++;
				arg3[local54] += arg2[arg0++];
				@Pc(66) int local66 = arg7++;
				arg3[local66] += arg2[arg0++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local30 = arg7++;
				arg3[local30] += arg2[arg0++];
			}
			arg0 += arg6;
			arg7 += arg5;
		}
	}
}
