import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!kh;")
	public static Class91 aClass91_4;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "F")
	public static float aFloat156 = 128.0F;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Created gameworld";

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString182 = " is already on your ignore list.";

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString183 = "scroll:";

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "S")
	public static short aShort45 = 1;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public static int anInt5449 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILclient!qe;ILclient!u;Lclient!ie;)V")
	public static void method4340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13_Sub5_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub5_Sub2 arg5, @OriginalArg(7) Class73 arg6) {
		@Pc(24) Class4_Sub26 local24 = new Class4_Sub26();
		local24.anInt3915 = arg0 * 128;
		local24.anInt3907 = arg4;
		local24.anInt3914 = arg1 * 128;
		if (arg6 != null) {
			local24.anInt3909 = arg6.anInt2251;
			local24.anIntArray309 = arg6.anIntArray193;
			local24.anInt3917 = arg6.anInt2264;
			local24.aClass73_1 = arg6;
			local24.anInt3920 = arg6.anInt2249 * 128;
			local24.anInt3911 = arg6.anInt2271;
			@Pc(67) int local67 = arg6.anInt2253;
			@Pc(70) int local70 = arg6.anInt2259;
			local24.anInt3910 = arg6.anInt2258;
			if (arg2 == 1 || arg2 == 3) {
				local70 = arg6.anInt2253;
				local67 = arg6.anInt2259;
			}
			local24.anInt3912 = (arg1 + local67) * 128;
			local24.anInt3908 = (arg0 + local70) * 128;
			if (arg6.anIntArray196 != null) {
				local24.aBoolean242 = true;
				local24.method3178();
			}
			if (local24.anIntArray309 != null) {
				local24.anInt3919 = local24.anInt3909 + (int) ((double) (local24.anInt3911 - local24.anInt3909) * Math.random());
			}
			Static80.aClass17_11.method619(local24);
		} else if (arg5 != null) {
			@Pc(191) Class185 local191 = arg5.aClass185_1;
			local24.aClass13_Sub5_Sub2_1 = arg5;
			if (local191.anIntArray466 != null) {
				local24.aBoolean242 = true;
				local191 = local191.method4658();
			}
			if (local191 != null) {
				local24.anInt3912 = (arg1 + local191.anInt5803) * 128;
				local24.anInt3908 = (arg0 + local191.anInt5803) * 128;
				local24.anInt3910 = Static160.method2584(arg5);
				local24.anInt3920 = local191.anInt5784 * 128;
				local24.anInt3917 = local191.anInt5792;
			}
			Static17.aClass17_2.method619(local24);
		} else if (arg3 != null) {
			local24.aClass13_Sub5_Sub1_2 = arg3;
			local24.anInt3908 = (arg0 + arg3.method4219()) * 128;
			local24.anInt3912 = (arg1 + arg3.method4219()) * 128;
			local24.anInt3910 = Static4.method66(arg3);
			local24.anInt3917 = arg3.anInt4474;
			local24.anInt3920 = arg3.anInt4455 * 128;
			Static5.aClass163_1.method4181(Static193.method3171(arg3.aString148), local24);
		}
	}
}
