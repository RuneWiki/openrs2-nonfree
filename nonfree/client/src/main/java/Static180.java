import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	public static int anInt3712;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString130 = "Started 3d Library";

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public static int anInt3713 = 0;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString131 = "white:";

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
	public static void method3494() {
		Static308.aClass11_96.method213();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public static void method3495() {
		if (Static44.anInt1104 == 5) {
			Static44.anInt1104 = 6;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!ap;IIII)Ljava/awt/Frame;")
	public static Frame method3496(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method286()) {
			return null;
		}
		@Pc(25) Class210[] local25 = Static305.method5315(arg0);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg2 == local25[local33].anInt6532 && local25[local33].anInt6535 == arg1 && (!local31 || local25[local33].anInt6536 > arg3)) {
				arg3 = local25[local33].anInt6536;
				local31 = true;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(103) Class205 local103 = arg0.method281(arg2, arg3, arg1);
		while (local103.anInt6370 == 0) {
			Static15.method5425(10L);
		}
		@Pc(118) Frame local118 = (Frame) local103.anObject7;
		if (local118 == null) {
			return null;
		} else if (local103.anInt6370 == 2) {
			Static34.method3923(arg0, local118);
			return null;
		} else {
			return local118;
		}
	}
}
