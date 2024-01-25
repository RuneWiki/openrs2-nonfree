import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!dh;")
	public static Class3_Sub13 aClass3_Sub13_2;

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_201 = new Class123(112, -1);

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "J")
	public static long aLong165 = 0L;

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "Lclient!or;")
	public static final Class244 aClass244_48 = new Class244();

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
	public static final int anInt6003 = 0;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!or;IILclient!r;)V")
	public static void method4877(@OriginalArg(1) Class244 arg0, @OriginalArg(4) Class31 arg1) {
		Static448.aClass244_72.method5581();
		if (Static225.aBoolean295) {
			return;
		}
		for (@Pc(20) Class3_Sub33 local20 = (Class3_Sub33) arg0.method5572(); local20 != null; local20 = (Class3_Sub33) arg0.method5576()) {
			@Pc(30) Class338 local30 = Static157.aClass189_2.method4642(local20.anInt5496);
			if (Static331.method4879(local30)) {
				@Pc(42) boolean local42 = Static162.method2973(local30, local20, arg1);
				if (local42) {
					Static55.method6552(arg1, local20, local30);
				}
			}
		}
	}
}
