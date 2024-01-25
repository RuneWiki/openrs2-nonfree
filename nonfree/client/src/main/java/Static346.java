import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "[I")
	public static final int[] anIntArray532 = new int[1];

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_79 = new Class160(70, 3);

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "[I")
	public static int[] anIntArray533 = new int[2];

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "[Lclient!ud;")
	public static final Class29_Sub2_Sub1_Sub2[] aClass29_Sub2_Sub1_Sub2Array1 = new Class29_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
	public static boolean method5212() {
		@Pc(13) Class6 local13 = Static445.aClass275_162.aClass6_229.aClass6_283;
		if (local13 == null || local13 == Static445.aClass275_162.aClass6_229) {
			return false;
		}
		@Pc(24) Class6_Sub48 local24 = (Class6_Sub48) local13;
		if (local24.anInt8333 >= 2000) {
			local24.anInt8333 -= 2000;
		}
		return local24.anInt8333 == 1009;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Z")
	public static boolean method5215(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
