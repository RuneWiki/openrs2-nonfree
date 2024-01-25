import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fs", name = "O", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!fs", name = "M", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_31 = new Class84("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!fs", name = "P", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_36 = new Class237(6, 5);

	@OriginalMember(owner = "client!fs", name = "Q", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!fs", name = "R", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1767(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static22.method3265(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static87.anInt1697; local29++) {
			@Pc(35) String local35 = Static32.aStringArray5[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static22.method3265(local35);
			if (local35 != null && local35.equals(local24)) {
				Static87.anInt1697--;
				for (@Pc(59) int local59 = local29; local59 < Static87.anInt1697; local59++) {
					Static32.aStringArray5[local59] = Static32.aStringArray5[local59 + 1];
					Static349.aStringArray14[local59] = Static349.aStringArray14[local59 + 1];
					Static113.aStringArray47[local59] = Static113.aStringArray47[local59 + 1];
					Static329.aStringArray45[local59] = Static329.aStringArray45[local59 + 1];
					Static230.aBooleanArray14[local59] = Static230.aBooleanArray14[local59 + 1];
				}
				Static151.anInt2580 = Static337.anInt7419;
				Static55.method989(Static449.aClass131_193);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg0));
				Static232.aClass1_Sub1_Sub1_2.method4104(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!vq;Lclient!vq;ZZIII)I")
	public static int method1768(@OriginalArg(0) Class196_Sub1 arg0, @OriginalArg(1) Class196_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static269.method3930(arg0, arg1, arg4, arg2);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static269.method3930(arg0, arg1, arg5, arg3);
			return arg3 ? -local37 : local37;
		}
	}
}
