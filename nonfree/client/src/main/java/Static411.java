import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!uc", name = "qc", descriptor = "[S")
	public static short[] aShortArray101;

	@OriginalMember(owner = "client!uc", name = "Mb", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_202 = new Class214(95, 12);

	@OriginalMember(owner = "client!uc", name = "kc", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_86 = new Class212(32, 3);

	@OriginalMember(owner = "client!uc", name = "mc", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_125 = new Class266(7, 0, 1, 1);

	@OriginalMember(owner = "client!uc", name = "pc", descriptor = "Lclient!nd;")
	public static final Class4_Sub28 aClass4_Sub28_3 = new Class4_Sub28(0, 0);

	@OriginalMember(owner = "client!uc", name = "sc", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_105 = new Class21("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!uc", name = "yc", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_106 = new Class21("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIB)I")
	public static int method5298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23 = 65536 - Class4_Sub13.anIntArray496[arg0 * 8192 / arg3] >> 1;
		return (arg1 * local23 >> 16) + (arg2 * (65536 - local23) >> 16);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!uc;Z)V")
	public static void method5305(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt6538 == Static277.anInt2834 || arg0.anInt6505 == -1 || arg0.anInt6496 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class130 local30 = Static143.aClass85_1.method2406(arg0.anInt6505);
			if (local30.aBoolean247 || local30.anIntArray308[arg0.anInt6543] < arg0.anInt6479 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt6538 - arg0.anInt6533;
			@Pc(64) int local64 = Static277.anInt2834 - arg0.anInt6533;
			@Pc(75) int local75 = arg0.anInt6474 * 128 + arg0.method5302() * 64;
			@Pc(86) int local86 = arg0.anInt6509 * 128 + arg0.method5302() * 64;
			@Pc(97) int local97 = arg0.anInt6547 * 128 + arg0.method5302() * 64;
			@Pc(109) int local109 = arg0.anInt6508 * 128 + arg0.method5302() * 64;
			arg0.anInt7514 = (local75 * (local58 - local64) + local97 * local64) / local58;
			arg0.anInt7515 = (local64 * local109 + (local58 - local64) * local86) / local58;
		}
		arg0.anInt6551 = 0;
		if (arg0.anInt6500 == 0) {
			arg0.method5297(8192, false);
		}
		if (arg0.anInt6500 == 1) {
			arg0.method5297(12288, false);
		}
		if (arg0.anInt6500 == 2) {
			arg0.method5297(0, false);
		}
		if (arg0.anInt6500 == 3) {
			arg0.method5297(4096, false);
		}
	}
}
