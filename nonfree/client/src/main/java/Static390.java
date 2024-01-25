import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
	public static int[] anIntArray570;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!rr;")
	public static Class215 aClass215_1;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	public static int anInt6279;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_142 = new Class7("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	public static int anInt6278 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(JI)V")
	public static void method5230(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
