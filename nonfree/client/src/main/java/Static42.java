import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!da", name = "I", descriptor = "I")
	public static int anInt890;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Lclient!fi;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[Lclient!fh;")
	public static Class50[] aClass50Array1 = new Class50[6];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!gk;")
	public static Class58 method795(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class58_Sub1");
			@Pc(10) Class58 local10 = (Class58) local6.getDeclaredConstructor().newInstance();
			local10.method2974(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class58_Sub2 local29 = new Class58_Sub2();
			local29.method2974(arg0, arg1, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZC)C")
	public static char method800(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
