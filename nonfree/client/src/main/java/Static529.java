import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
	public static final int[] anIntArray330 = new int[8];

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "F")
	public static float aFloat136 = 0.0F;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static void method5795() {
		if (Static635.anApplet2 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static635.anApplet2.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static582.method8056() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static651.method5915(Static635.anApplet2, "document.cookie=\"" + local30 + "\"");
		} catch (@Pc(44) Throwable local44) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!br;)V")
	public static void method5796(@OriginalArg(1) Class9_Sub3 arg0) {
		arg0.aClass9_Sub4_Sub2_Sub1_1 = null;
		if (Static624.anInt10504 < 20) {
			Static265.aClass234_5.method6097(arg0);
			Static624.anInt10504++;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5804(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) - (local10 - Static598.method8291(arg0.charAt(local12)));
		}
		return local10;
	}
}
