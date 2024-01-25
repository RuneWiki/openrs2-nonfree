import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	public static int anInt6026;

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_75 = new Class276(84, -2);

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
	public static int anInt6027 = -1;

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Lclient!l;")
	public static Class190 method4988() {
		try {
			return (Class190) Class.forName("Class190_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method4989(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aByteArray86.length - arg0.anInt7869 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method6538();
		if (local22 < 0 || local22 > 1 || arg0.aByteArray86.length - arg0.anInt7869 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method6535();
		if (local46 * 6 > arg0.aByteArray86.length - arg0.anInt7869) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < local46; local64++) {
			@Pc(70) int local70 = arg0.method6535();
			@Pc(74) int local74 = arg0.method6497();
			if (Static183.anIntArray237.length > local70 && Static57.aBooleanArray5[local70] && (Static594.aClass279_1.method7005(local70).aChar1 != '1' || local74 >= -1 && local74 <= 1)) {
				Static183.anIntArray237[local70] = local74;
			}
		}
	}
}
