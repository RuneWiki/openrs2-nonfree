import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array9;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!h;")
	public static final Class114 aClass114_53 = new Class114("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	public static final int anInt2483 = 1406;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_34 = new Class186(17, 4);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method2296() {
		for (@Pc(5) int local5 = 0; local5 < Static457.anInt7857; local5++) {
			@Pc(10) int local10 = Static386.anIntArray503[local5];
			@Pc(17) Class1_Sub10 local17 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local10);
			if (local17 != null) {
				@Pc(22) Class47_Sub2_Sub3_Sub1 local22 = local17.aClass47_Sub2_Sub3_Sub1_2;
				Static304.method5078(local22, local22.aClass238_1.anInt6754);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)B")
	public static byte method2297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
