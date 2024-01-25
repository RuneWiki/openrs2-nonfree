import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString106 = "";

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
	public static int anInt8908 = -50;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!pe;BIII)Ljava/awt/Frame;")
	public static Frame method7470(@OriginalArg(1) Class246 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method6135()) {
			return null;
		}
		@Pc(28) Class34[] local28 = Static465.method7169(arg0);
		if (local28 == null) {
			return null;
		}
		@Pc(34) boolean local34 = false;
		for (@Pc(36) int local36 = 0; local36 < local28.length; local36++) {
			if (local28[local36].anInt1205 == arg3 && arg1 == local28[local36].anInt1207 && (!local34 || local28[local36].anInt1203 > arg2)) {
				local34 = true;
				arg2 = local28[local36].anInt1203;
			}
		}
		if (!local34) {
			return null;
		}
		@Pc(110) Class280 local110 = arg0.method6131(arg3, arg1, arg2);
		while (local110.anInt8467 == 0) {
			Static566.method8004(10L);
		}
		@Pc(122) Frame local122 = (Frame) local110.anObject16;
		if (local122 == null) {
			return null;
		} else if (local110.anInt8467 == 2) {
			Static529.method7714(local122, arg0);
			return null;
		} else {
			return local122;
		}
	}
}
