import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "Lclient!baa;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
	public static int anInt6845 = -1;

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5746(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZII)Lclient!rr;")
	public static Class292 method5747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class292 local12 = Static367.method5505(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass292Array2 == null || local12.aClass292Array2.length <= arg1) {
			return null;
		} else {
			return local12.aClass292Array2[arg1];
		}
	}
}
