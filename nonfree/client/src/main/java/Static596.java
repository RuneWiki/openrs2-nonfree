import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "Lclient!vd;")
	public static Class366 aClass366_8;

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "[I")
	public static int[] anIntArray553 = new int[2];

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Z")
	public static boolean method8616(@OriginalArg(0) int arg0) {
		if (Static675.aBooleanArray27[arg0]) {
			return true;
		} else if (Static472.aClass208_107.method4975(arg0)) {
			@Pc(25) int local25 = Static472.aClass208_107.method5005(arg0);
			if (local25 == 0) {
				Static675.aBooleanArray27[arg0] = true;
				return true;
			}
			if (Static489.aClass73ArrayArray2[arg0] == null) {
				Static489.aClass73ArrayArray2[arg0] = new Class73[local25];
			}
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				if (Static489.aClass73ArrayArray2[arg0][local50] == null) {
					@Pc(66) byte[] local66 = Static472.aClass208_107.method4991(arg0, local50, -128);
					if (local66 != null) {
						@Pc(78) Class73 local78 = Static489.aClass73ArrayArray2[arg0][local50] = new Class73();
						local78.anInt1388 = (arg0 << 16) + local50;
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method1276(new Class5_Sub23(local66));
					}
				}
			}
			Static675.aBooleanArray27[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
