import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_99 = new Class319(16, 16);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)I")
	public static int method4701(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
	public static boolean method4703(@OriginalArg(0) int arg0) {
		if (Static24.aBooleanArray1[arg0]) {
			return true;
		} else if (Static301.aClass111_70.method2463(arg0)) {
			@Pc(23) int local23 = Static301.aClass111_70.method2442(arg0);
			if (local23 == 0) {
				Static24.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static249.aClass365ArrayArray3[arg0] == null) {
				Static249.aClass365ArrayArray3[arg0] = new Class365[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static249.aClass365ArrayArray3[arg0][local45] == null) {
					@Pc(61) byte[] local61 = Static301.aClass111_70.method2441(local45, arg0);
					if (local61 != null) {
						@Pc(73) Class365 local73 = Static249.aClass365ArrayArray3[arg0][local45] = new Class365();
						local73.anInt9646 = (arg0 << 16) + local45;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method7910(new Class1_Sub20(local61));
					}
				}
			}
			Static24.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
