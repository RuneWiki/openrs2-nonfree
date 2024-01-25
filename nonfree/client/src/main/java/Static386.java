import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static386 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_98 = new Class216(82, -1);

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	public static int anInt5675 = -1;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)Z")
	public static boolean method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!ka;BI)Lclient!oba;")
	public static Class261 method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class261(arg1, arg0, arg3, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}
}
