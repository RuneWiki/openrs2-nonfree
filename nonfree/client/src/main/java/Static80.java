import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array3;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!sl;)Lclient!kn;")
	public static Class53_Sub3 method1741(@OriginalArg(1) Class2_Sub17 arg0) {
		return new Class53_Sub3(arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2835(), arg0.method2859());
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)V")
	public static void method1744(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static188.method3210(8, arg0);
		local13.method923();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!d;Lclient!nd;)V")
	public static void method1746(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class238 arg1) {
		Static65.anInterface2_6 = arg0;
		Static134.aClass238_269 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V")
	public static void method1747(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub43 local14 = Static95.method1915(arg0, arg1);
		if (local14 != null) {
			local14.method8920();
		}
	}
}
