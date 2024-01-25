import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static530 {

	@OriginalMember(owner = "client!rka", name = "g", descriptor = "[S")
	private static final short[] aShortArray136 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!rka", name = "o", descriptor = "[S")
	private static final short[] aShortArray137 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rka", name = "p", descriptor = "[S")
	private static final short[] aShortArray138 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!rka", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray13 = new short[][] { aShortArray138, aShortArray136, aShortArray137 };

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(IZIIB)V")
	public static void method7616(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static172.method3336(arg3, (byte) -31)) {
			Static83.method1220(arg0, -1, arg1, arg2, Static686.aClass381ArrayArray2[arg3]);
		}
	}
}
