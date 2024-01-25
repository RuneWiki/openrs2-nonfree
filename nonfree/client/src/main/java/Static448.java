import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBIIILclient!laa;)Ljava/awt/Frame;")
	public static Frame method6297(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class198 arg3) {
		if (!arg3.method4286()) {
			return null;
		}
		@Pc(25) Class19[] local25 = Static226.method3367(arg3);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg0 == local25[local33].anInt637 && local25[local33].anInt642 == arg1 && (!local31 || arg2 < local25[local33].anInt639)) {
				arg2 = local25[local33].anInt639;
				local31 = true;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(95) Class191 local95 = arg3.method4287(arg2, arg1, arg0);
		while (local95.anInt5014 == 0) {
			Static408.method5841(10L);
		}
		@Pc(110) Frame local110 = (Frame) local95.anObject11;
		if (local110 == null) {
			return null;
		} else if (local95.anInt5014 == 2) {
			Static66.method1054(local110, arg3);
			return null;
		} else {
			return local110;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)Lclient!rd;")
	public static Class293 method6298() {
		try {
			return (Class293) Class.forName("Class293_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
