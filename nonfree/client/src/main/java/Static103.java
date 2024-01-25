import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_24 = new Class181(2, 7);

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public static int anInt2393 = -2;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "[I")
	public static final int[] anIntArray181 = new int[1000];

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)Z")
	public static boolean method2158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
