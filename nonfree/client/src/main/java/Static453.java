import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Z")
	public static boolean aBoolean606 = false;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public static void method5905(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static472.aBooleanArray27[arg0]) {
			Static439.aClass229_100.method4968(arg0);
			Static509.aClass273ArrayArray2[arg0] = null;
			Static183.aClass273ArrayArray1[arg0] = null;
			Static472.aBooleanArray27[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Z")
	public static boolean method5906(@OriginalArg(1) int arg0) {
		if (Static472.aBooleanArray27[arg0]) {
			return true;
		} else if (Static439.aClass229_100.method4984(arg0)) {
			@Pc(23) int local23 = Static439.aClass229_100.method4981(arg0);
			if (local23 == 0) {
				Static472.aBooleanArray27[arg0] = true;
				return true;
			}
			if (Static509.aClass273ArrayArray2[arg0] == null) {
				Static509.aClass273ArrayArray2[arg0] = new Class273[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static509.aClass273ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static439.aClass229_100.method4980(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class273 local76 = Static509.aClass273ArrayArray2[arg0][local50] = new Class273();
						local76.anInt6810 = local50 + (arg0 << 16);
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method5639(new Class2_Sub7(local64));
					}
				}
			}
			Static472.aBooleanArray27[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
