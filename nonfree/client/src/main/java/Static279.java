import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	public static int anInt5665;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	public static int anInt5666 = 0;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "[I")
	public static final int[] anIntArray475 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Z")
	public static boolean method4856(@OriginalArg(1) int arg0) {
		if (Static144.aBooleanArray12[arg0]) {
			return true;
		} else if (Static117.aClass216_36.method5667(arg0)) {
			@Pc(25) int local25 = Static117.aClass216_36.method5675(arg0);
			if (local25 == 0) {
				Static144.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static348.aClass12ArrayArray1[arg0] == null) {
				Static348.aClass12ArrayArray1[arg0] = new Class12[local25];
			}
			for (@Pc(44) int local44 = 0; local44 < local25; local44++) {
				if (Static348.aClass12ArrayArray1[arg0][local44] == null) {
					@Pc(63) byte[] local63 = Static117.aClass216_36.method5648(arg0, local44);
					if (local63 != null) {
						@Pc(75) Class12 local75 = Static348.aClass12ArrayArray1[arg0][local44] = new Class12();
						local75.anInt465 = local44 + (arg0 << 16);
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method365(new Class1_Sub8(local63));
					}
				}
			}
			Static144.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
