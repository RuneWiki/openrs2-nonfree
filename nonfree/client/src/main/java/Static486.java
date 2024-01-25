import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public static int anInt8250;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	public static int anInt8252 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public static void method7138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(11, arg2);
		local8.method1474();
		local8.anInt1720 = arg0;
		local8.anInt1728 = arg1;
	}
}
