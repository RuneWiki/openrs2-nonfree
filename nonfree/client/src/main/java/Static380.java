import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "Lclient!nca;")
	public static Class254 aClass254_109;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "[Lclient!fla;")
	public static Interface8[] anInterface8Array1;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)Lclient!rka;")
	public static Class2_Sub6_Sub19 method5500(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub6_Sub19 local10 = (Class2_Sub6_Sub19) Static363.aClass378_4.method9118((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static680.aClass254_169.method6087(0, arg0);
		if (local27 == null || local27.length <= 1) {
			return null;
		}
		try {
			local10 = Static302.method4221(local27);
		} catch (@Pc(46) Exception local46) {
			throw new RuntimeException(local46.getMessage() + " S: " + arg0);
		}
		Static363.aClass378_4.method9117((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5501(@OriginalArg(0) String arg0) {
		Static570.aString99 = arg0;
		Static135.anInt2247 = Static570.aString99.length();
	}
}
