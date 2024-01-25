import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!ud;")
	public static Class324 aClass324_3;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "S")
	public static short aShort80 = 256;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static int anInt6002 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)Z")
	public static boolean method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lclient!pba;")
	public static Class4_Sub14 method4737(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class4_Sub14_Sub1");
			@Pc(15) Class4_Sub14 local15 = (Class4_Sub14) local11.getDeclaredConstructor().newInstance();
			local15.method2877(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class4_Sub14_Sub2 local26 = new Class4_Sub14_Sub2();
			local26.method2877(arg0);
			return local26;
		}
	}
}
