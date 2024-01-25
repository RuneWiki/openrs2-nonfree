import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!up", name = "o", descriptor = "I")
	public static int anInt10168;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "I")
	public static int anInt10164 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)Z")
	public static boolean method8644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != -1) {
			anInt10164 = -2;
		}
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIILclient!br;I)Ljava/awt/Frame;")
	public static Frame method8645(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class47 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method1395()) {
			return null;
		}
		@Pc(18) Class192[] local18 = Static703.method9306(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local18.length; local27++) {
			if (local18[local27].anInt4995 == arg3 && arg1 == local18[local27].anInt4999 && (!local25 || local18[local27].anInt4997 > arg0)) {
				arg0 = local18[local27].anInt4997;
				local25 = true;
			}
		}
		if (!local25) {
			return null;
		}
		@Pc(110) Class338 local110 = arg2.method1405(arg1, arg3, arg0);
		while (local110.anInt8934 == 0) {
			Static550.method7219(10L);
		}
		if (16744004 != 16744004) {
			method8644(0, -77, -79);
		}
		@Pc(138) Frame local138 = (Frame) local110.anObject16;
		if (local138 == null) {
			return null;
		} else if (local110.anInt8934 == 2) {
			Static392.method5317(arg2, local138);
			return null;
		} else {
			return local138;
		}
	}
}
