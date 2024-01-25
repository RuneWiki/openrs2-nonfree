import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_15 = new Class70();

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_13 = new Class225(5, 1);

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!hu", name = "O", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_57 = new Class349(1, -1);

	@OriginalMember(owner = "client!hu", name = "Q", descriptor = "[S")
	private static final short[] aShortArray70 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!hu", name = "S", descriptor = "[S")
	private static final short[] aShortArray71 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!hu", name = "T", descriptor = "[S")
	private static final short[] aShortArray72 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hu", name = "R", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { aShortArray70, aShortArray71, aShortArray72 };

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)I")
	public static int method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class285.anIntArray475[arg2 * 8192 / arg0] >> 1;
		return (arg3 * (65536 - local24) >> 16) + (local24 * arg1 >> 16);
	}
}
