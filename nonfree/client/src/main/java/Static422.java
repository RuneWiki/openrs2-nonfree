import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static422 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt8671;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!tf;")
	public static Class322 aClass322_148;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
	public static final int[] anIntArray569 = new int[13];

	@OriginalMember(owner = "client!q", name = "e", descriptor = "[Lclient!uca;")
	public static final Class334[] aClass334Array5 = new Class334[16];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Z")
	public static boolean method7213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
