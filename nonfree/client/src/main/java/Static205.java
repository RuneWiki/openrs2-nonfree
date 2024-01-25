import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt323;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "Lclient!tk;")
	public static Class224 aClass224_2;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Lclient!b;")
	public static Class20 aClass20_8;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_11 = new Class57("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[Lclient!en;")
	public static final Class71[] aClass71Array2 = new Class71[50];

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	public static int anInt327 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZIIIIZI)V")
	public static void method302(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) Class23_Sub1 local16 = Static97.aClass23_Sub1Array1[local10];
		Static97.aClass23_Sub1Array1[local10] = Static97.aClass23_Sub1Array1[arg2];
		Static97.aClass23_Sub1Array1[arg2] = local16;
		for (@Pc(28) int local28 = arg1; local28 < arg2; local28++) {
			if (Static346.method5245(arg4, arg3, local16, arg0, Static97.aClass23_Sub1Array1[local28], arg5) <= 0) {
				@Pc(48) Class23_Sub1 local48 = Static97.aClass23_Sub1Array1[local28];
				Static97.aClass23_Sub1Array1[local28] = Static97.aClass23_Sub1Array1[local12];
				Static97.aClass23_Sub1Array1[local12++] = local48;
			}
		}
		Static97.aClass23_Sub1Array1[arg2] = Static97.aClass23_Sub1Array1[local12];
		Static97.aClass23_Sub1Array1[local12] = local16;
		method302(arg0, arg1, local12 - 1, arg3, arg4, arg5);
		method302(arg0, local12 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public static void method305() {
		Static154.anInt6085 = 0;
		Static91.anInt2989 = -1;
		Static109.anInt2145 = -1;
		Static361.anInt6050 = -1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)I")
	public static int method306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static177.anIntArray357[arg1 & 0x3] : Static226.anIntArray427[arg1 & 0x3];
	}
}
