import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt139;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!qs;")
	public static final Class291 aClass291_1 = new Class291();

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_1 = new Class179(8, 7);

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IC)Z")
	public static boolean method162(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static158.aCharArray2;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (arg0 == local35) {
					return true;
				}
			}
		}
		return false;
	}
}
