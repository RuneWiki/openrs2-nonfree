import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt2470;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_28 = new Class307(128, 4);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)Z")
	public static boolean method2258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static119.method5521(arg0, arg1) | (arg0 & 0x800) != 0 || Static148.method2490(arg1, arg0);
	}
}
