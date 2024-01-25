import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	public static int anInt7288;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z")
	public static boolean method5855() {
		if (Static409.aBoolean530) {
			try {
				Static476.method5363(Static390.aClass255_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!qa;Lclient!wi;)I")
	public static int method5858(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class271 arg1) {
		if (arg1.anInt7788 != -1) {
			return arg1.anInt7788;
		}
		if (arg1.anInt7803 != -1) {
			@Pc(29) Class160 local29 = arg0.anInterface4_5.method5685(arg0.method2052() ? arg1.anInt7803 : arg1.anInt7789);
			if (!local29.aBoolean319) {
				return local29.aShort51;
			}
		}
		return arg1.anInt7791;
	}
}
