import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_84 = new Class156(16, 5);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZLclient!tga;II)Ljava/awt/Frame;")
	public static Frame method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class349 arg2, @OriginalArg(4) int arg3) {
		if (!arg2.method7736()) {
			return null;
		}
		@Pc(21) Class284[] local21 = Static418.method6134(arg2);
		if (local21 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local21.length; local30++) {
			if (arg0 == local21[local30].anInt7350 && arg3 == local21[local30].anInt7345 && (!local28 || local21[local30].anInt7347 > arg1)) {
				local28 = true;
				arg1 = local21[local30].anInt7347;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(124) Class361 local124 = arg2.method7749(arg1, arg0, arg3);
		while (local124.anInt9720 == 0) {
			Static620.method7045(-4, 10L);
		}
		@Pc(138) Frame local138 = (Frame) local124.anObject20;
		if (local138 == null) {
			return null;
		} else if (local124.anInt9720 == 2) {
			Static35.method561(local138, arg2);
			return null;
		} else {
			return local138;
		}
	}
}
