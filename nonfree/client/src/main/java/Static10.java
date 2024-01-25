import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	public static int anInt229;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "[Lclient!fn;")
	public static final Class75[] aClass75Array1 = new Class75[128];

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_5 = new Class117("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public static int anInt228 = -1;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString2 = "";

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIII)V")
	public static void method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 + 1;
		Static224.method5303(Static73.anIntArrayArray6[arg3], arg4, arg0, arg1);
		@Pc(18) int local18 = arg2 - 1;
		Static224.method5303(Static73.anIntArrayArray6[arg2], arg4, arg0, arg1);
		for (@Pc(29) int local29 = local9; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static73.anIntArrayArray6[local29];
			local35[arg1] = local35[arg4] = arg0;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIII)V")
	public static void method167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(8, arg1);
		local8.method3858();
		local8.anInt4390 = arg2;
		local8.anInt4388 = arg0;
		local8.anInt4398 = arg3;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!oo;I)V")
	public static void method168(@OriginalArg(0) Class67_Sub3_Sub3 arg0) {
		@Pc(8) int local8 = arg0.anInt5037 - Static293.anInt5807;
		@Pc(20) int local20 = arg0.anInt5051 * 128 + arg0.method4368() * 64;
		@Pc(32) int local32 = arg0.anInt5012 * 128 + arg0.method4368() * 64;
		arg0.anInt6308 += (local20 - arg0.anInt6308) / local8;
		arg0.anInt5071 = 0;
		arg0.anInt6310 += (local32 - arg0.anInt6310) / local8;
		if (arg0.anInt4999 == 0) {
			arg0.method4370(8192);
		}
		if (arg0.anInt4999 == 1) {
			arg0.method4370(12288);
		}
		if (arg0.anInt4999 == 2) {
			arg0.method4370(0);
		}
		if (arg0.anInt4999 == 3) {
			arg0.method4370(4096);
		}
	}
}
