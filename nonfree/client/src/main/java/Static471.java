import java.awt.Canvas;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas12;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
	public static int anInt8055;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ[I[JI)V")
	public static void method6634(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg3; local54 < arg0; local54++) {
			if (local20 + (long) (local52 & local54) > arg2[local54]) {
				@Pc(75) long local75 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16] = local75;
				@Pc(89) int local89 = arg1[local54];
				arg1[local54] = arg1[local16];
				arg1[local16++] = local89;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method6634(local16 - 1, arg1, arg2, arg3);
		method6634(arg0, arg1, arg2, local16 + 1);
	}
}
