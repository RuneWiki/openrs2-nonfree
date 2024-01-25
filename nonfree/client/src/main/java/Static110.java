import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt6978;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!he;")
	public static Class100 aClass100_88;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_359 = new Class123(63, -1);

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Z")
	public static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public static int anInt6977 = 0;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt6979 = 0;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public static int anInt6980 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	public static int method5745(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
