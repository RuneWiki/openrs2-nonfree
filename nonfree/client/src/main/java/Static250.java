import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString178 = "Loading world list data";

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!uc;")
	public static Class198 aClass198_45 = new Class198(64);

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt4794 = 0;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray26 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Z")
	public static boolean aBoolean274 = true;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
	public static boolean aBoolean275 = false;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!fb;)Ljava/lang/String;")
	public static String method4102(@OriginalArg(2) Class3_Sub4 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3633();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt4268 += Static323.aClass136_1.method3453(arg0.aByteArray70, local15, arg0.anInt4268, local7, 0);
			return Static149.method2424(0, local15, local7);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}
}
