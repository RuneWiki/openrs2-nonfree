import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Lclient!vh;")
	public static Class250 aClass250_74;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_163 = new Class131(25, 6);

	@OriginalMember(owner = "client!st", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray180 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_11 = new Class146(2, 4);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)B")
	public static byte method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public static void method5139() {
		Static392.aFont2 = null;
		Static274.anImage2 = null;
	}
}
