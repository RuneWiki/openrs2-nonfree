import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "Lclient!jd;")
	public static Class84 aClass84_68;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "Lclient!ak;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
	public static int anInt3648 = 0;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "[I")
	public static int[] anIntArray297 = new int[2500];

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
	public static int anInt3655 = 64;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
	public static int anInt3656 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public static void method2953() {
		Static273.aByteArrayArray115 = null;
		Static30.anIntArray46 = null;
		Static19.anIntArray30 = null;
		Static262.anIntArray528 = null;
		Static187.anIntArray314 = null;
		Static40.anIntArray59 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2954(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static19.aClass162_1);
		arg0.removeMouseMotionListener(Static19.aClass162_1);
		arg0.removeFocusListener(Static19.aClass162_1);
		Static166.anInt3486 = 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2955(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}
}
