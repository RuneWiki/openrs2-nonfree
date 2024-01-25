import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
	public static final int[] anIntArray517 = new int[1];

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!vu;")
	public static final Class349 aClass349_14 = new Class349();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg3 - arg5;
		@Pc(20) int local20 = arg0 + arg5;
		for (@Pc(22) int local22 = arg0; local22 < local20; local22++) {
			Static250.method4000(arg2, Static478.anIntArrayArray51[local22], arg1, arg4);
		}
		@Pc(45) int local45 = arg2 - arg5;
		@Pc(50) int local50 = arg1 + arg5;
		for (@Pc(52) int local52 = arg3; local52 > local15; local52--) {
			Static250.method4000(arg2, Static478.anIntArrayArray51[local52], arg1, arg4);
		}
		for (@Pc(68) int local68 = local20; local68 <= local15; local68++) {
			@Pc(74) int[] local74 = Static478.anIntArrayArray51[local68];
			Static250.method4000(local50, local74, arg1, arg4);
			Static250.method4000(arg2, local74, local45, arg4);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!fa;)Lclient!r;")
	private static Class12 method6453(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface5 arg1) {
		return new Class12_Sub3(arg0, arg1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!ga;ILclient!fa;)Lclient!r;")
	public static synchronized Class12 method6466(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class111 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface5 arg4) {
		if (arg3 == 0) {
			return method6453(arg1, arg4);
		} else if (arg3 == 2) {
			return Static587.method7844(arg1, arg4);
		} else if (arg3 == 1) {
			return Static136.method2288(arg1, arg0, arg4);
		} else if (arg3 == 5) {
			return Static147.method2384(arg0, arg2, arg4, arg1);
		} else if (arg3 == 3) {
			return Static596.method886(arg4, arg1, arg2, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
