import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public static int anInt7000;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_184 = new Class158("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!la", name = "x", descriptor = "I")
	public static int anInt7015 = -2;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	public static int anInt7016 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!ia;)Lclient!vs;")
	public static Class90_Sub4 method5331(@OriginalArg(1) Class1_Sub3 arg0) {
		return new Class90_Sub4(arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1226(), arg0.method1171());
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)B")
	public static byte method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
