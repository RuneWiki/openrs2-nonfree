import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "g", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean17 = true;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "[I")
	public static final int[] anIntArray18 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_10 = new Class151(8);

	@OriginalMember(owner = "client!an", name = "j", descriptor = "I")
	public static int anInt279 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
	public static boolean method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
