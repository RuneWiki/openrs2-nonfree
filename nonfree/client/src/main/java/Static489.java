import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!mn;")
	public static Class194 aClass194_2;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub5 aClass1_Sub1_Sub5_3;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public static int anInt8146 = 0;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_125 = new Class306("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method6710(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static40.aBoolean44) {
			try {
				@Pc(25) Class233 local25 = (Class233) Class.forName("Class233_Sub1").getDeclaredConstructor().newInstance();
				local25.method5447(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static40.aBoolean44 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;ZILclient!ra;)V")
	public static void method6714(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class67 arg2) {
		@Pc(20) int local20 = Static448.aClass232_7.method5438(null, 250, arg0);
		@Pc(29) int local29 = Static448.aClass232_7.method5434(null, arg0, 250) * 13;
		Static513.aClass122_10.f(6, 6, local20 + 8, 4 + 4 + local29, -16777216, 0);
		Static513.aClass122_10.method7282(6, 6, local20 + 8, local29 + 4 + 4, -1, 0);
		arg2.method7488(10, arg0, 1, -1, 0, null, local29, null, 10, null, 0, -1, local20);
		Static518.method7137(local29 + 4 + 4, local20 + 8, 6, 6);
		if (arg1) {
			try {
				Static513.aClass122_10.method7236();
			} catch (@Pc(120) Exception_Sub1 local120) {
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
	public static boolean method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
