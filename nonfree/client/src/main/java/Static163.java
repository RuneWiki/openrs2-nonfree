import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "J")
	public static long aLong154 = 0L;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBI)V")
	public static void method3724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub2_Sub6 local12 = Static104.method831(arg2, 10);
		local12.method1192();
		local12.anInt1558 = arg1;
		local12.anInt1565 = arg0;
		local12.anInt1557 = arg3;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)V")
	public static void method3726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 13);
		local8.method1192();
		local8.anInt1565 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IBI)V")
	public static void method3732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg1, 7);
		local8.method1192();
		local8.anInt1565 = arg0;
	}
}
