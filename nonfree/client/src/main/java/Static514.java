import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "I")
	public static int anInt8777;

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_11 = new Class225(9, 0, 4, 1);

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_87 = new Class286(4, 7);

	@OriginalMember(owner = "client!qea", name = "q", descriptor = "[I")
	public static final int[] anIntArray479 = new int[64];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)Z")
	public static boolean method7351(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BII)Z")
	public static boolean method7353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
