import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	public static int anInt5204;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Z")
	public static boolean aBoolean348 = true;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method4163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(14, arg0);
		local8.method2052();
		local8.anInt2698 = arg1;
	}
}
