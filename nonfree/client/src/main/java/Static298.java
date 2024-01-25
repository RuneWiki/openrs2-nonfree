import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "Lclient!wia;")
	public static Class386 aClass386_71;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z[Ljava/lang/Object;[III)V")
	public static void method4394(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg3; local53 < arg2; local53++) {
			if (local20 + (local53 & local51) > arg1[local53]) {
				@Pc(73) int local73 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local73;
				@Pc(87) Object local87 = arg0[local53];
				arg0[local53] = arg0[local16];
				arg0[local16++] = local87;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method4394(arg0, arg1, local16 - 1, arg3);
		method4394(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
	public static void method4395() {
		Static494.anInt8821 = 1;
		Static652.anInt10896 = -1;
		Static2.method22(Static521.aString85.equals(""), true, "", Static521.aString85);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;)Lclient!ha;")
	public static Class137 method4398(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface3 arg2) {
		return new Class137_Sub3(arg1, arg2, arg0);
	}
}
