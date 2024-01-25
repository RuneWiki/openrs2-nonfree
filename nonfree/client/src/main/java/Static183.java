import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!ij;")
	public static Class93 aClass93_69;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Lclient!we;")
	public static final Class212 aClass212_6 = new Class212();

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
	public static final int[] anIntArray363 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_85 = new Class85("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt3674 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3321(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg1 ? 32768 : 0;
		@Pc(25) int local25 = local17 + (arg1 ? Static60.anInt1965 : Static236.anInt4218);
		for (@Pc(27) int local27 = local17; local27 < local25; local27++) {
			@Pc(34) Class5_Sub1_Sub18 local34 = Static234.method4160(local27);
			if (local34.aBoolean496 && local34.method5359().toLowerCase().indexOf(local2) != -1) {
				if (local11 >= 50) {
					Static160.aShortArray38 = null;
					Static249.anInt6209 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(67) short[] local67 = new short[local9.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local11; local69++) {
						local67[local69] = local9[local69];
					}
					local9 = local67;
				}
				local9[local11++] = (short) local27;
			}
		}
		Static160.aShortArray38 = local9;
		Static276.anInt5763 = 0;
		Static249.anInt6209 = local11;
		@Pc(105) String[] local105 = new String[Static249.anInt6209];
		for (@Pc(107) int local107 = 0; local107 < Static249.anInt6209; local107++) {
			local105[local107] = Static234.method4160(local9[local107]).method5359();
		}
		Static252.method4467(local105, Static160.aShortArray38);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIB)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static134.anInt2038 = arg0;
		Static346.anInt6672 = arg2;
		Static259.anInt5094 = arg3;
		Static15.anInt315 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBII)I")
	public static int method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class187.anIntArray570[arg1 * 8192 / arg3] >> 1;
		return (arg0 * (65536 - local21) >> 16) + (arg2 * local21 >> 16);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
	public static int method3325() {
		@Pc(9) Class55 local9 = Static236.aClass55_9;
		@Pc(11) boolean local11 = false;
		if (Static342.anInt6605 != 0) {
			@Pc(20) Canvas local20 = new Canvas();
			local20.setSize(100, 100);
			local9 = Static66.method5183(local20, null, 0, 0, null);
			local11 = true;
		}
		@Pc(37) long local37 = Static340.method5863();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local9.method5184();
		}
		@Pc(63) int local63 = (int) (Static340.method5863() - local37);
		local9.method5254(100, -16777216, 100, 0, 0);
		if (local11) {
			local9.method5168();
		}
		return local63;
	}
}
