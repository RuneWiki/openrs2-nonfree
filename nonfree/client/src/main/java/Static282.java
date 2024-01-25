import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	public static int anInt4977;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public static int anInt4980;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[200];

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_128 = new Class131(67, 7);

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_85 = new Class237(19, 20);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
	public static void method4031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static305.anInt5429 <= arg0 && arg0 <= Static212.anInt452) {
			@Pc(19) int local19 = Static85.method1427(Static221.anInt4001, arg1, Static83.anInt7380);
			@Pc(25) int local25 = Static85.method1427(Static221.anInt4001, arg3, Static83.anInt7380);
			Static50.method825(local19, local25, arg2, arg0);
		}
	}
}
