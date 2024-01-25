import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!qn", name = "Y", descriptor = "Lclient!ha;")
	public static Class84 aClass84_20;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_70 = new Class77(51, 2);

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
	public static int anInt7657 = 0;

	@OriginalMember(owner = "client!qn", name = "W", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_219 = new Class88(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!qn", name = "X", descriptor = "I")
	public static int anInt7660 = -1;

	@OriginalMember(owner = "client!qn", name = "Z", descriptor = "I")
	public static int anInt7661 = 0;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	public static void method6372() {
		Static370.anInt6854 = Static267.aClass244_5.anInt7376 + Static267.aClass244_5.anInt7388 + 2;
		Static255.aStringArray29 = new String[500];
		Static93.anInt2164 = Static445.aClass244_7.anInt7376 + Static445.aClass244_7.anInt7388 + 2;
		for (@Pc(31) int local31 = 0; local31 < Static255.aStringArray29.length; local31++) {
			Static255.aStringArray29[local31] = "";
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;Ljava/lang/String;)V")
	public static void method6373(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static36.method6954(arg2, arg3, -1, arg1, null, arg4, arg0);
	}
}
