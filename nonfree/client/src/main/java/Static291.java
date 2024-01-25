import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!qa;")
	public static Class122 aClass122_6;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt5489;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_69 = new Class306("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Lclient!ck;")
	public static Class49_Sub1 method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass49_Sub1_2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
	public static void method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(11, arg1);
		local8.method4946();
		local8.anInt5822 = arg2;
		local8.anInt5821 = arg0;
	}
}
