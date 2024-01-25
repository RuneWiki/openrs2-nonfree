import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
	public static final int[] anIntArray359 = new int[14];

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public static int anInt4782 = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public static boolean method3794(@OriginalArg(1) int arg0) {
		if (Static371.aBooleanArray22[arg0]) {
			return true;
		} else if (Static149.aClass243_88.method5481(arg0)) {
			@Pc(23) int local23 = Static149.aClass243_88.method5472(arg0);
			if (local23 == 0) {
				Static371.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static34.aClass76ArrayArray1[arg0] == null) {
				Static34.aClass76ArrayArray1[arg0] = new Class76[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static34.aClass76ArrayArray1[arg0][local50] == null) {
					@Pc(66) byte[] local66 = Static149.aClass243_88.method5455(local50, arg0);
					if (local66 != null) {
						@Pc(78) Class76 local78 = Static34.aClass76ArrayArray1[arg0][local50] = new Class76();
						local78.anInt2100 = local50 + (arg0 << 16);
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method1681(new Class5_Sub15(local66));
					}
				}
			}
			Static371.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method3795(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static432.method5705(arg0);
	}
}
