import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	public static int anInt4037;

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1994 = Static193.method3027("");

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1987 = aClass70_1994;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1989 = Static193.method3027("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1988 = aClass70_1989;

	@OriginalMember(owner = "client!vb", name = "fb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1990 = aClass70_1994;

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1991 = aClass70_1994;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Z")
	public static volatile boolean aBoolean182 = true;

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1992 = aClass70_1994;

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1993 = aClass70_1994;

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "I")
	public static int anInt4041 = 0;

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1995 = aClass70_1994;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(B)V")
	public static void method3152() {
		if (Static52.anIntArray58 != null && Static1.anIntArray93 != null) {
			return;
		}
		Static1.anIntArray93 = new int[256];
		Static52.anIntArray58 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static52.anIntArray58[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static1.anIntArray93[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}
