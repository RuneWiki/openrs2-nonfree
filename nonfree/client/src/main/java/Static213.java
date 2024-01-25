import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static213 {

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
	public static int anInt4045;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "Lclient!ha;")
	public static Class133 aClass133_5;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_107 = new Class87(260);

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
	public static final int[] anIntArray203 = new int[3];

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_48 = new Class46(35, 18);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
	public static boolean method3649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static628.method8886(arg1, arg0) || Static40.method5453(arg1, arg0);
	}
}
