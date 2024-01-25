import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_40 = new Class387(71, 2);

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "[I")
	public static int[] anIntArray207 = new int[250];

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
	public static int anInt3623 = 0;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IZIILclient!mca;I)Ljava/awt/Frame;")
	public static Frame method3177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class230 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method5347()) {
			return null;
		}
		@Pc(21) Class277[] local21 = Static513.method7490(arg2);
		if (local21 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local21.length; local30++) {
			if (local21[local30].anInt7756 == arg3 && arg0 == local21[local30].anInt7753 && (!local28 || local21[local30].anInt7754 > arg1)) {
				arg1 = local21[local30].anInt7754;
				local28 = true;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(108) Class366 local108 = arg2.method5361(arg0, arg1, arg3);
		while (local108.anInt10206 == 0) {
			Static351.method5279(10L);
		}
		if (false) {
			anIntArray207 = null;
		}
		@Pc(136) Frame local136 = (Frame) local108.anObject18;
		if (local136 == null) {
			return null;
		} else if (local108.anInt10206 == 2) {
			Static606.method8452(arg2, local136);
			return null;
		} else {
			return local136;
		}
	}
}
