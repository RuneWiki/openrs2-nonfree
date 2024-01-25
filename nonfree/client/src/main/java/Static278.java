import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I")
	public static int method4179() {
		if (Static85.aFrame1 == null) {
			return Static385.aBoolean487 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	public static void method4180() {
		Static247.anIntArray374 = Static451.method6336(0.4F);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(CII)I")
	public static int method4181(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V")
	public static void method4182(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static189.aBoolean295 = arg1;
		Static576.aString93 = arg0;
		Static286.aString42 = arg2;
		if (!Static189.aBoolean295 && Static18.anInt5702 != 3 && (Static286.aString42.equals("") || Static576.aString93.equals(""))) {
			Static36.method607(3);
			return;
		}
		Static476.aBoolean540 = false;
		if (Static18.anInt5702 != 1) {
			Static56.anInt979 = 0;
			Static496.anInt9104 = -1;
		}
		Static36.method607(-3);
		Static52.anInt1207 = 0;
		Static86.anInt9996 = 0;
		Static252.anInt4624 = 1;
	}
}
