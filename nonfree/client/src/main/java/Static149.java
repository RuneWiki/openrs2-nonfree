import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_3 = new Class295(10, 17);

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "Lclient!jl;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
	public static int anInt2838 = 0;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBI)Z")
	public static boolean method2490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static28.method561(arg0, arg1) | (arg0 & 0x800) != 0 || Static519.method7180(arg0, arg1);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIB)Z")
	public static boolean method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
