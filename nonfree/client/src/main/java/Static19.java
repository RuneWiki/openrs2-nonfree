import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!am;")
	public static Class11 aClass11_150;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array19;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt6738 = 0;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString249 = "Checking for updates - ";

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "[I")
	public static final int[] anIntArray539 = new int[1000];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIILclient!lh;B)Ljava/awt/Frame;")
	public static Frame method5601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class120 arg3) {
		if (!arg3.method3240()) {
			return null;
		}
		@Pc(25) Class196[] local25 = Static223.method3821(arg3);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg2 == local25[local33].anInt6206 && arg0 == local25[local33].anInt6212 && (!local31 || local25[local33].anInt6213 > arg1)) {
				arg1 = local25[local33].anInt6213;
				local31 = true;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(91) Class51 local91 = arg3.method3230(arg2, arg1, arg0);
		while (local91.anInt1229 == 0) {
			Static270.method5481(10L);
		}
		@Pc(103) Frame local103 = (Frame) local91.anObject1;
		if (local103 == null) {
			return null;
		} else if (local91.anInt1229 == 2) {
			Static72.method1361(local103, arg3);
			return null;
		} else {
			return local103;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB)I")
	public static int method5603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 & 0x3;
		if (local15 == 0) {
			return arg1;
		} else if (local15 == 1) {
			return arg2;
		} else if (local15 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
