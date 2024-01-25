import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!ga;")
	public static Class111 aClass111_99;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!f;")
	public static Class10 aClass10_33;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "[I")
	public static final int[] anIntArray488 = new int[8];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!wv;I)V")
	public static void method5847(@OriginalArg(1) int arg0, @OriginalArg(2) Class365 arg1, @OriginalArg(3) int arg2) {
		Static539.anInt8888 = arg2;
		Static193.aClass365_7 = arg1;
		Static89.anInt1988 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIB)Z")
	public static boolean method5848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method5849(@OriginalArg(2) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(82) int local82;
			if (local48 >= '0' && local48 <= '9') {
				local82 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local82 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local82 = local48 - 'W';
			} else {
				return false;
			}
			if (local82 >= 10) {
				return false;
			}
			if (local28) {
				local82 = -local82;
			}
			@Pc(124) int local124 = local82 + local37 * 10;
			if (local124 / 10 != local37) {
				return false;
			}
			local37 = local124;
			local35 = true;
		}
		return local35;
	}
}
