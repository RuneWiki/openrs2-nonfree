import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "Lclient!f;")
	public static Class78 aClass78_6;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
	public static int anInt1027;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "[I")
	public static final int[] anIntArray51 = new int[13];

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_19 = new Class96("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "[I")
	public static final int[] anIntArray52 = new int[13];

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_25 = new Class254(54, 12);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILclient!qd;)V")
	public static void method853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub5 arg3) {
		@Pc(4) Class137 local4 = Static266.method5735(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass47_Sub5_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)Lclient!nh;")
	public static Class47_Sub2 method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub2_2;
	}
}
