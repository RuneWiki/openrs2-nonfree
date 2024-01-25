import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "I")
	public static int anInt7082 = 104;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "S")
	public static short aShort74 = 320;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public static int anInt7083 = 0;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!eia;B)V")
	public static void method5827(@OriginalArg(0) Class8_Sub16 arg0) {
		if (arg0.aClass8_Sub9_6 != null) {
			arg0.aClass8_Sub9_6.anInt1945 = 0;
		}
		arg0.aBoolean644 = false;
		for (@Pc(23) Class8_Sub16 local23 = arg0.method7434(); local23 != null; local23 = arg0.method7429()) {
			method5827(local23);
		}
	}
}
