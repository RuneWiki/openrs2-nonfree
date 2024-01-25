import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	public static int anInt9781;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!ft;")
	public static final Class125 aClass125_17 = new Class125();

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	public static int anInt9782 = 0;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_144 = new Class216(12, 7);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!qh;I)Ljava/lang/String;")
	public static String method8379(@OriginalArg(0) Class4_Sub5_Sub17 arg0) {
		if (arg0.aString98 == null || arg0.aString98.length() == 0) {
			return arg0.aString97 == null || arg0.aString97.length() <= 0 ? arg0.aString96 : arg0.aString96 + Static279.aClass179_32.method4066(Static164.anInt2984) + arg0.aString97;
		} else if (arg0.aString97 == null || arg0.aString97.length() <= 0) {
			return arg0.aString96 + Static279.aClass179_32.method4066(Static164.anInt2984) + arg0.aString98;
		} else {
			return arg0.aString96 + Static279.aClass179_32.method4066(Static164.anInt2984) + arg0.aString97 + Static279.aClass179_32.method4066(Static164.anInt2984) + arg0.aString98;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lclient!at;")
	public static Class21 method8380(@OriginalArg(1) int arg0) {
		@Pc(10) Class21 local10 = (Class21) Static115.aClass352_20.method7653((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static599.aClass34_117.method1239(0, arg0);
		local10 = new Class21();
		if (local20 != null) {
			local10.method563(new Class4_Sub11(local20));
		}
		local10.method566();
		Static115.aClass352_20.method7655((long) arg0, local10);
		return local10;
	}
}
