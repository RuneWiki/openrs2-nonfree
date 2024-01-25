import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_2 = new Class186(57, 3);

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
	public static final int[] anIntArray15 = new int[2];

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "[Lclient!gm;")
	public static final Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array1 = new Class1_Sub1_Sub8[14];

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_4 = new Class6(2, 12);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)Z")
	public static boolean method230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
