import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!sj;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!wq;")
	public static Class216 aClass216_19;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_16 = new Class93("M", "M", "M", "M");

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_17 = new Class93("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_18 = new Class93("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Z")
	public static boolean method1308(@OriginalArg(0) int arg0) {
		if (arg0 == 58 || arg0 == 11 || arg0 == 57 || arg0 == 6 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lclient!oe;")
	public static Class104 method1310() {
		try {
			return (Class104) Class.forName("Class104_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!jg;I)V")
	public static void method1311(@OriginalArg(0) Class55_Sub3 arg0) {
		arg0.aClass62_1 = null;
		@Pc(10) int local10 = arg0.aClass55_Sub4Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass55_Sub4Array1[local12].aBoolean300 = false;
		}
		@Pc(25) Class67[] local25 = Class114.aClass67Array1;
		synchronized (Class114.aClass67Array1) {
			if (local10 < Class114.aClass67Array1.length && Static81.anIntArray194[local10] < 200) {
				Class114.aClass67Array1[local10].method2100(arg0);
				@Pc(50) int local50 = Static81.anIntArray194[local10]++;
			}
		}
	}
}
