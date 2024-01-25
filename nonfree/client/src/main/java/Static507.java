import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public static int anInt8693;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)Lclient!so;")
	public static Class5_Sub48 method7441(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(19) long local19 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class5_Sub48) Static236.aClass291_18.method6993(local19, 1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Z")
	public static boolean method7442(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
