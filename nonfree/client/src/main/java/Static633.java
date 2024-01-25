import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
	public static int anInt10297 = -1;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IJIZ)Ljava/lang/String;")
	public static String method8850(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static140.method1963(arg0);
		@Pc(17) Calendar local17 = Static242.aCalendar1;
		@Pc(27) int local27 = local17.get(5);
		@Pc(31) int local31 = local17.get(2);
		@Pc(35) int local35 = local17.get(1);
		@Pc(39) int local39 = local17.get(11);
		@Pc(43) int local43 = local17.get(12);
		return arg1 == 3 ? Static547.method7963(arg0, arg1) : Integer.toString(local27 / 10) + local27 % 10 + "-" + Static298.aStringArrayArray3[arg1][local31] + "-" + local35 + " " + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[BII[BII)V")
	public static void method8851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg1; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg4++;
				arg3[local31] = (byte) (arg3[local31] - arg6[arg2++]);
				@Pc(44) int local44 = arg4++;
				arg3[local44] = (byte) (arg3[local44] - arg6[arg2++]);
				@Pc(57) int local57 = arg4++;
				arg3[local57] = (byte) (arg3[local57] - arg6[arg2++]);
				@Pc(70) int local70 = arg4++;
				arg3[local70] = (byte) (arg3[local70] - arg6[arg2++]);
			}
			for (@Pc(91) int local91 = local15; local91 < 0; local91++) {
				local31 = arg4++;
				arg3[local31] = (byte) (arg3[local31] - arg6[arg2++]);
			}
			arg4 += arg7;
			arg2 += arg5;
		}
	}
}
