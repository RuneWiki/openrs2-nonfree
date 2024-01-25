import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kia", name = "s", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!kia", name = "u", descriptor = "[I")
	public static final int[] anIntArray379 = new int[13];

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BD)V")
	public static void method4314(@OriginalArg(1) double arg0) {
		Static573.aClass117_9.method7253(Static504.aClass117_7);
		Static573.aClass117_9.method7247(0, 0, (int) arg0);
		Static512.aClass126_22.method7040(Static573.aClass117_9);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIII)V")
	public static void method4315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class5_Sub4_Sub13 local10 = Static506.method2916(arg3, 10);
		local10.method4140();
		local10.anInt4507 = arg0;
		local10.anInt4508 = arg1;
		local10.anInt4504 = arg2;
	}
}
