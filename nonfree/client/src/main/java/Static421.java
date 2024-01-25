import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[Lclient!i;")
	public static Class67[] aClass67Array7;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Z")
	public static boolean aBoolean620;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[C")
	public static final char[] aCharArray11 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Z")
	public static boolean method6463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Lclient!vb;")
	public static Class2_Sub46 method6465() {
		if (Static270.aClass8_9 == null || Static136.aClass308_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub46 local16 = (Class2_Sub46) Static136.aClass308_1.method6869(); local16 != null; local16 = (Class2_Sub46) Static136.aClass308_1.method6869()) {
			@Pc(24) Class366 local24 = Static270.aClass25_2.method435(local16.anInt9117);
			if (local24 != null && local24.aBoolean735 && local24.method7995(Static270.anInterface9_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!rj;BLjava/lang/Object;)V")
	public static void method6466(@OriginalArg(0) Class287 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static459.method6498(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}
}
