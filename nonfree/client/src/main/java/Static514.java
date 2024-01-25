import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public static int anInt8866;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Lclient!qaa;")
	public static final Class266 aClass266_6 = new Class266();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIILclient!r;)V")
	public static void method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2) {
		Static196.aClass31_8 = arg2;
		Static363.aClass263ArrayArray5 = new Class263[arg1][arg0];
		if (Static484.anIntArray499 != null) {
			Static178.aClass47_2 = Static295.method4426(Static484.anIntArray499[5], Static484.anIntArray499[0], Static484.anIntArray499[3], Static484.anIntArray499[1], Static484.anIntArray499[2], Static484.anIntArray499[4]);
		}
		Static384.aClass263_2 = new Class263();
		Static25.method245();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static171.method3048(arg0, arg1) || Static295.method4420(arg1, arg0);
	}
}
