import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
	public static int anInt520 = 0;

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_12 = new Class55("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!bk", name = "T", descriptor = "[Lclient!fe;")
	public static Class19_Sub1[] aClass19_Sub1Array1 = new Class19_Sub1[0];

	@OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
	public static int anInt524 = 0;

	@OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
	public static int anInt529 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)I")
	public static int method416(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[I[Ljava/lang/Object;IB)V")
	public static void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg0) / 2;
		@Pc(13) int local13 = arg3;
		@Pc(17) int local17 = arg1[local11];
		arg1[local11] = arg1[arg0];
		arg1[arg0] = local17;
		@Pc(31) Object local31 = arg2[local11];
		arg2[local11] = arg2[arg0];
		arg2[arg0] = local31;
		@Pc(50) int local50 = ~local17 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg3; local52 < arg0; local52++) {
			if ((local52 & local50) + local17 > arg1[local52]) {
				@Pc(71) int local71 = arg1[local52];
				arg1[local52] = arg1[local13];
				arg1[local13] = local71;
				@Pc(85) Object local85 = arg2[local52];
				arg2[local52] = arg2[local13];
				arg2[local13++] = local85;
			}
		}
		arg1[arg0] = arg1[local13];
		arg1[local13] = local17;
		arg2[arg0] = arg2[local13];
		arg2[local13] = local31;
		method417(local13 - 1, arg1, arg2, arg3);
		method417(arg0, arg1, arg2, local13 + 1);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IBI)V")
	public static void method418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg1, 13);
		local8.method4716();
		local8.anInt5868 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)I")
	public static int method419(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
