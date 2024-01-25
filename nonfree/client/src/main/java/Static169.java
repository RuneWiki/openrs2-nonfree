import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "[Lclient!hga;")
	public static Class129[] aClass129Array1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)Z")
	public static boolean method3029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Z")
	public static boolean method3030() {
		return Static561.aBoolean225;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IC)I")
	public static int method3032(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class3_Sub7_Sub17.anIntArray515.length > arg0 ? Class3_Sub7_Sub17.anIntArray515[arg0] : -1;
	}
}
