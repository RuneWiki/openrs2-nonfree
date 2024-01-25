import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static589 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_220 = new Class359(70, -1);

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public static int anInt9683 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILclient!fda;II)V")
	public static void method8093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class28_Sub1_Sub4_Sub2 arg2, @OriginalArg(5) int arg3) {
		Static476.method6822(arg3, arg2.anInt10784, arg0, arg1, arg2.anInt10781, 0, arg2.aByte145);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z")
	public static boolean method8095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
