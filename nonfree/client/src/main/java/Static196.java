import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gt", name = "F", descriptor = "Lclient!gn;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "[I")
	public static final int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(IZ)V")
	public static void method3112(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub4_Sub13 local12 = Static506.method2916(arg0, 3);
		local12.method4132();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([BI)V")
	public static void method3113(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class5_Sub12 local15 = new Class5_Sub12(arg0);
		@Pc(17) boolean local17 = false;
		while (true) {
			while (true) {
				@Pc(21) int local21 = local15.method8645();
				if (local21 == 0) {
					if (local17) {
						return;
					}
					if (Static318.anIntArray399 == null) {
						Static53.anInt818 = 4;
						Static318.anIntArray399 = new int[4];
						Static180.anIntArray276 = new int[4];
					}
					for (local21 = 0; local21 < Static318.anIntArray399.length; local21++) {
						Static318.anIntArray399[local21] = 0;
						Static180.anIntArray276[local21] = local21 * 20;
					}
					return;
				}
				if (local21 == 1) {
					if (Static318.anIntArray399 == null) {
						Static53.anInt818 = 4;
						Static318.anIntArray399 = new int[4];
						Static180.anIntArray276 = new int[4];
					}
					for (@Pc(45) int local45 = 0; local45 < Static318.anIntArray399.length; local45++) {
						Static318.anIntArray399[local45] = local15.method8595();
						Static180.anIntArray276[local45] = local15.method8595();
					}
					local17 = true;
				} else if (local21 == 2) {
					Static334.anInt5798 = local15.method8631();
				} else if (local21 == 3) {
					Static53.anInt818 = local15.method8645();
					Static180.anIntArray276 = new int[Static53.anInt818];
					Static318.anIntArray399 = new int[Static53.anInt818];
				}
			}
		}
	}
}
