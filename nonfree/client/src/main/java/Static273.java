import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_151 = new Class202("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIB)V")
	public static void method4339(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub16 local10 = Static218.method3456(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray128.length; local15++) {
				local10.anIntArray128[local15] = -1;
				local10.anIntArray129[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!wca;)V")
	public static void method4342(@OriginalArg(1) Class310 arg0) {
		if (Static99.anInt1978 == arg0.anInt9236) {
			Static368.aBooleanArray32[arg0.anInt9211] = true;
		}
	}
}
