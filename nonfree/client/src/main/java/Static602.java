import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_68 = new Class352(8);

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "[I")
	public static final int[] anIntArray651 = new int[8];

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
	public static int anInt9261 = 0;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString115 = "";

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!es;II)V")
	public static void method7913(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (Static165.aClass252_4 == null) {
			return;
		}
		try {
			Static165.aClass252_4.method5153(0L);
			Static165.aClass252_4.method5163(arg1, 24, arg0.aByteArray107);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method7915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class33 arg2) {
		Static340.aClass33_9 = arg2;
		Static665.aClass92_9 = Static340.aClass33_9.method8118();
		Static46.aClass92_1 = Static340.aClass33_9.method8118();
		Static491.aClass92_8 = Static340.aClass33_9.method8118();
		Static151.anInterface18Array1 = null;
		Static106.anInt2134 = 0;
		Static590.anInt9079 = 100;
		Static131.anIntArray159 = null;
		Static617.anInt9691 = 100;
		Static155.method2704(arg1, arg0);
		Static423.anInt6689 = -1;
		Static633.anInt9789 = -1;
		Static494.anInt7907 = -1;
	}
}
