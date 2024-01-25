import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Z")
	public static boolean aBoolean521 = true;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!un;")
	public static final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ZIIILjava/lang/String;IJIZ)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (!Static237.aBoolean384 && Static168.anInt3255 < 500) {
			@Pc(22) int local22 = arg6 == -1 ? Static217.anInt490 : arg6;
			@Pc(36) Class2_Sub26 local36 = new Class2_Sub26(arg5, arg1, local22, arg4, arg0, arg7, arg8, arg3, arg2, arg9);
			Static288.aClass265_41.method5999(local36);
			Static168.anInt3255++;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!ci;")
	public static Class2_Sub11 method4740(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class2_Sub11_Sub2");
			@Pc(10) Class2_Sub11 local10 = (Class2_Sub11) local6.getDeclaredConstructor().newInstance();
			local10.method5822(arg0);
			return local10;
		} catch (@Pc(32) Throwable local32) {
			@Pc(36) Class2_Sub11_Sub1 local36 = new Class2_Sub11_Sub1();
			local36.method5822(arg0);
			return local36;
		}
	}
}
