import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static633 {

	@OriginalMember(owner = "client!wia", name = "D", descriptor = "I")
	public static int anInt10641;

	@OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
	public static int anInt10643;

	@OriginalMember(owner = "client!wia", name = "R", descriptor = "I")
	public static int anInt10652;

	@OriginalMember(owner = "client!wia", name = "V", descriptor = "Lclient!jd;")
	public static Class152 aClass152_3;

	@OriginalMember(owner = "client!wia", name = "G", descriptor = "I")
	public static int anInt10644 = 0;

	@OriginalMember(owner = "client!wia", name = "L", descriptor = "Z")
	public static boolean aBoolean839 = false;

	@OriginalMember(owner = "client!wia", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "(III)I")
	public static int method8695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
