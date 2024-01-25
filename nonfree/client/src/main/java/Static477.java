import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "Lclient!m;")
	public static Class2_Sub1_Sub13 aClass2_Sub1_Sub13_3;

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "Lclient!in;")
	public static final Class169 aClass169_206 = new Class169(19, -2);

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ICI)I")
	public static int method7612(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(15) int local15 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(24) char local24 = Character.toLowerCase(arg1);
			local15 = (local24 << 4) + 1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBILjava/awt/Canvas;)Lclient!ag;")
	public static Class2_Sub2 method7614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class2_Sub2_Sub1");
			@Pc(15) Class2_Sub2 local15 = (Class2_Sub2) local11.getDeclaredConstructor().newInstance();
			local15.method7470(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class2_Sub2_Sub2 local28 = new Class2_Sub2_Sub2();
			local28.method7470(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)Lclient!dw;")
	public static Class82 method7615() {
		return Static407.method6711();
	}
}
