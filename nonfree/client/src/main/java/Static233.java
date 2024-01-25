import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!om", name = "n", descriptor = "I")
	public static int anInt4630;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Lclient!rk;")
	public static Class180 aClass180_58;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public static int anInt4637;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "Lclient!id;")
	public static Class99 aClass99_8;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	public static int anInt4645;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	public static int anInt4634 = 0;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public static int anInt4636 = 0;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	public static int anInt4638 = -1;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString292 = "Loaded world list data";

	@OriginalMember(owner = "client!om", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString293 = "Loaded textures";

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	public static int anInt4646 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBILclient!rk;)Lclient!mr;")
	public static Class140 method4073(@OriginalArg(0) int arg0, @OriginalArg(3) Class180 arg1) {
		@Pc(9) byte[] local9 = arg1.method4560(0, arg0);
		return local9 == null ? null : new Class140(local9);
	}
}
