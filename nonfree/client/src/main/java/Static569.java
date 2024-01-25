import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static569 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_12 = new Class225(12, 0, 1, 0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
	public static int method7899() {
		if ((double) Static654.aFloat159 == 3.0D) {
			return 37;
		} else if ((double) Static654.aFloat159 == 4.0D) {
			return 50;
		} else if ((double) Static654.aFloat159 == 6.0D) {
			return 75;
		} else if ((double) Static654.aFloat159 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	public static int method7901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static123.anIntArray114[arg0 & 0x3] : Static79.anIntArray84[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)Z")
	public static boolean method7903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static343.method5023(arg1, arg0) || Static486.method7076(arg0, arg1);
	}
}
