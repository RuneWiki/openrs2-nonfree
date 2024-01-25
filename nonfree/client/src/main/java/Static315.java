import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
	public static int anInt9133;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_98 = new Class257(83, 3);

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public static int anInt9128 = 0;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "[S")
	private static final short[] aShortArray113 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "[S")
	private static final short[] aShortArray114 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "[S")
	private static final short[] aShortArray115 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { aShortArray113, aShortArray115, aShortArray114 };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	public static void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class8_Sub5_Sub8 local13 = Static509.method7344(1, arg1);
		local13.method3509();
		local13.anInt4321 = arg0;
	}
}
