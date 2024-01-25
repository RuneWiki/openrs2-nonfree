import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "B")
	public static byte aByte130;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	public static int anInt9713 = -2;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "Lclient!or;")
	public static final Class259 aClass259_13 = new Class259();

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Lclient!em;")
	public static final Class83 aClass83_210 = new Class83(28, 5);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	public static void method7885(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 8);
		local8.method4835();
	}
}
