import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_9 = new Class276("", 16);

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Z")
	public static boolean method3432(@OriginalArg(0) int arg0) {
		if (Static44.aBooleanArray3[arg0]) {
			return true;
		} else if (Static561.aClass386_120.method9214(arg0)) {
			@Pc(23) int local23 = Static561.aClass386_120.method9210(arg0);
			if (local23 == 0) {
				Static44.aBooleanArray3[arg0] = true;
				return true;
			}
			if (Static559.aClass230ArrayArray2[arg0] == null) {
				Static559.aClass230ArrayArray2[arg0] = new Class230[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static559.aClass230ArrayArray2[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static561.aClass386_120.method9196(local45, arg0);
					if (local59 != null) {
						@Pc(71) Class230 local71 = Static559.aClass230ArrayArray2[arg0][local45] = new Class230();
						local71.anInt6663 = (arg0 << 16) + local45;
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method5463(new Class14_Sub29(local59));
					}
				}
			}
			Static44.aBooleanArray3[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)I")
	public static int method3434() {
		if (Static505.aBoolean629) {
			return 6;
		} else if (Static12.aClass14_Sub3_Sub11_1 == null) {
			return 0;
		} else {
			@Pc(22) int local22 = Static12.aClass14_Sub3_Sub11_1.anInt4752;
			if (Static313.method7481(local22)) {
				return 1;
			} else if (Static461.method6748(local22)) {
				return 2;
			} else if (Static198.method3030(local22)) {
				return 3;
			} else if (Static254.method3738(local22)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Z")
	public static boolean method3435(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
