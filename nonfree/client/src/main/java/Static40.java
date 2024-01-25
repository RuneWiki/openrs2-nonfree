import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!ek;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_17 = new Class40(40, -1);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
	public static final int[] anIntArray54 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_17 = new Class160(33, 7);

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_18 = new Class160(50, 3);

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
	public static boolean aBoolean23 = true;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "S")
	public static short aShort7 = 256;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZB)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) Class6_Sub13 local15 = Static59.method44(arg0, arg1);
		if (local15 != null) {
			local15.method7849();
		}
	}
}
