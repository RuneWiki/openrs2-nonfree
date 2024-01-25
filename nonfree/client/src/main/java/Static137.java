import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	public static int anInt2730;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "Lclient!gda;")
	public static Class126 aClass126_79;

	@OriginalMember(owner = "client!es", name = "X", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "I")
	public static int anInt2739;

	// $FF: synthetic field
	@OriginalMember(owner = "client!es", name = "K", descriptor = "Ljava/lang/Class;")
	public static Class aClass11;

	@OriginalMember(owner = "client!es", name = "U", descriptor = "Lclient!tda;")
	public static final Class346 aClass346_4 = new Class346();

	@OriginalMember(owner = "client!es", name = "H", descriptor = "J")
	public static long aLong81 = 20000000L;

	@OriginalMember(owner = "client!es", name = "M", descriptor = "I")
	public static final int anInt2740 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!mj;III)V")
	public static void method2548(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray31 != null) {
			@Pc(14) Class5_Sub24 local14 = new Class5_Sub24();
			local14.aClass238_6 = arg0;
			local14.anObjectArray2 = arg0.anObjectArray31;
			Static247.method3957(local14);
		}
		Static110.anInt9539 = arg1;
		Static268.anInt4795 = arg0.anInt5990;
		Static14.anInt171 = arg0.anInt5971;
		Static421.aBoolean472 = true;
		Static326.anInt4132 = arg2;
		Static586.anInt9462 = arg0.anInt5978;
		Static516.anInt8202 = arg0.anInt5986;
		Static462.anInt7482 = arg0.anInt6000;
		Static333.method5032(arg0);
	}
}
