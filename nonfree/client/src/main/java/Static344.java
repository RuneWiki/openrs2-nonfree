import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt5736;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!pu;")
	public static Class270 aClass270_66;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_189 = new Class235(74, 6);

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public static int anInt5737 = 999999;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public static int anInt5738 = -1;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	public static int anInt5739 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)Z")
	public static boolean method4702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(CB)Z")
	public static boolean method4704(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
