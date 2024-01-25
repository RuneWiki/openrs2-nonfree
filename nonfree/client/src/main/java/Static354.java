import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public static int anInt6233;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[Lclient!jw;")
	public static final Class6_Sub28[] aClass6_Sub28Array1 = new Class6_Sub28[1024];

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	public static int anInt6235 = 2;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray34 = new boolean[100];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method5292(@OriginalArg(0) int arg0) {
		if (Static555.aBooleanArray42[arg0]) {
			return true;
		} else if (Static400.aClass251_134.method5842(arg0)) {
			@Pc(23) int local23 = Static400.aClass251_134.method5849(arg0);
			if (local23 == 0) {
				Static555.aBooleanArray42[arg0] = true;
				return true;
			}
			if (Static375.aClass97ArrayArray1[arg0] == null) {
				Static375.aClass97ArrayArray1[arg0] = new Class97[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static375.aClass97ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static400.aClass251_134.method5860(arg0, local42);
					if (local56 != null) {
						@Pc(68) Class97 local68 = Static375.aClass97ArrayArray1[arg0][local42] = new Class97();
						local68.anInt2311 = (arg0 << 16) + local42;
						if (local56[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local68.method1973(new Class6_Sub14(local56));
					}
				}
			}
			Static555.aBooleanArray42[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
	public static int method5293() {
		if (Static147.aFrame1 == null) {
			return Static456.aBoolean533 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
