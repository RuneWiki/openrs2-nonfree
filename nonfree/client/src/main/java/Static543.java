import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	public static int anInt9404;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "Lclient!kda;")
	public static Class160 aClass160_106;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
	public static int anInt9405;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
	public static void method7933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) Object local34 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg1; local56 < arg0; local56++) {
			if (local20 + (long) (local56 & local54) > arg2[local56]) {
				@Pc(73) long local73 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16] = local73;
				@Pc(87) Object local87 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16++] = local87;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg0] = arg3[local16];
		arg3[local16] = local34;
		method7933(local16 - 1, arg1, arg2, arg3);
		method7933(arg0, local16 + 1, arg2, arg3);
	}
}
