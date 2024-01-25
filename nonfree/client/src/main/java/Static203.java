import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
	public static int anInt3665;

	@OriginalMember(owner = "client!ih", name = "Tb", descriptor = "Lclient!dda;")
	public static Class53 aClass53_67;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_121 = new Class202("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
	public static int anInt3677 = -1;

	@OriginalMember(owner = "client!ih", name = "tb", descriptor = "Lclient!wca;")
	public static Class310 aClass310_7 = null;

	@OriginalMember(owner = "client!ih", name = "Pb", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_122 = new Class202("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ih", name = "Vb", descriptor = "I")
	public static int anInt3701 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BII[Ljava/lang/String;[S)V")
	public static void method3264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg0; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) short local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg0] = arg3[local16];
		arg3[local16] = local34;
		method3264(local16 - 1, arg1, arg2, arg3);
		method3264(arg0, local16 + 1, arg2, arg3);
	}
}
