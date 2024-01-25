import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public static int anInt5135;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!hs;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_176 = new Class221("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[Lclient!lk;")
	public static final Class2_Sub13[] aClass2_Sub13Array1 = new Class2_Sub13[2048];

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	public static int anInt5133 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 + arg0;
		@Pc(15) int local15 = arg6 - arg0;
		for (@Pc(21) int local21 = arg4; local21 < local10; local21++) {
			Static264.method4096(Static267.anIntArrayArray38[local21], arg2, arg1, arg3);
		}
		@Pc(44) int local44 = arg1 - arg0;
		for (@Pc(46) int local46 = arg6; local46 > local15; local46--) {
			Static264.method4096(Static267.anIntArrayArray38[local46], arg2, arg1, arg3);
		}
		@Pc(68) int local68 = arg3 + arg0;
		for (@Pc(70) int local70 = local10; local70 <= local15; local70++) {
			@Pc(76) int[] local76 = Static267.anIntArrayArray38[local70];
			Static264.method4096(local76, arg2, local68, arg3);
			Static264.method4096(local76, arg5, local44, local68);
			Static264.method4096(local76, arg2, arg1, local44);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!tq;IZ)Lclient!np;")
	public static Class164 method4422(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class164 local14;
		if (Static174.aClass164_27 == null) {
			local14 = new Class164();
		} else {
			local14 = Static174.aClass164_27;
			Static174.aClass164_27 = Static174.aClass164_27.aClass164_19;
			Static250.anInt4495--;
			local14.aClass164_19 = null;
		}
		local14.anInt4393 = arg1;
		local14.aClass12_Sub1_2 = arg0;
		return local14;
	}
}
