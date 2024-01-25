import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public static int anInt10895;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Z")
	public static boolean method9317(@OriginalArg(0) int arg0) {
		if (Static505.aBooleanArray62[arg0]) {
			return true;
		} else if (Static78.aClass124_20.method3608(arg0)) {
			@Pc(28) int local28 = Static78.aClass124_20.method3629(arg0);
			if (local28 == 0) {
				Static505.aBooleanArray62[arg0] = true;
				return true;
			}
			if (Static111.aClass357ArrayArray1[arg0] == null) {
				Static111.aClass357ArrayArray1[arg0] = new Class357[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static111.aClass357ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static78.aClass124_20.method3641(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class357 local76 = Static111.aClass357ArrayArray1[arg0][local50] = new Class357();
						local76.anInt10460 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method8983(new Class2_Sub8(local64));
					}
				}
			}
			Static505.aBooleanArray62[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Z")
	public static boolean method9318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static388.method6540(arg0, arg1)) {
			return Static144.method2525(arg0, arg1) | (arg1 & 0x9000) != 0 | Static84.method1423(arg0, arg1) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static340.method5708(arg1, arg0) | Static320.method5327(arg0, arg1));
		} else {
			return false;
		}
	}
}
