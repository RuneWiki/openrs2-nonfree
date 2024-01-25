import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static int anInt7388 = 0;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!im;")
	public static final Class140 aClass140_116 = new Class140(11, -1);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIIIII)V")
	public static void method6175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static205.anInt4042 < arg1 || arg3 < Static99.anInt1988) {
			return;
		}
		@Pc(27) boolean local27;
		if (Static358.anInt8908 > arg4) {
			arg4 = Static358.anInt8908;
			local27 = false;
		} else if (arg4 > Static216.anInt4203) {
			local27 = false;
			arg4 = Static216.anInt4203;
		} else {
			local27 = true;
		}
		@Pc(50) boolean local50;
		if (Static358.anInt8908 > arg2) {
			arg2 = Static358.anInt8908;
			local50 = false;
		} else if (arg2 <= Static216.anInt4203) {
			local50 = true;
		} else {
			arg2 = Static216.anInt4203;
			local50 = false;
		}
		if (arg1 >= Static99.anInt1988) {
			Static424.method6216(arg2, arg0, arg4, Static447.anIntArrayArray99[arg1++]);
		} else {
			arg1 = Static99.anInt1988;
		}
		if (arg3 <= Static205.anInt4042) {
			Static424.method6216(arg2, arg0, arg4, Static447.anIntArrayArray99[arg3--]);
		} else {
			arg3 = Static205.anInt4042;
		}
		@Pc(105) int local105;
		if (local27 && local50) {
			for (local105 = arg1; local105 <= arg3; local105++) {
				@Pc(111) int[] local111 = Static447.anIntArrayArray99[local105];
				local111[arg4] = local111[arg2] = arg0;
			}
		} else if (local27) {
			for (local105 = arg1; local105 <= arg3; local105++) {
				Static447.anIntArrayArray99[local105][arg4] = arg0;
			}
		} else if (local50) {
			for (local105 = arg1; local105 <= arg3; local105++) {
				Static447.anIntArrayArray99[local105][arg2] = arg0;
			}
		}
	}
}
