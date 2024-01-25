import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt947;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_37 = new Class18(60, -1);

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!eb;")
	public static Class42 aClass42_2 = new Class42();

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public static final int anInt943 = 1339;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public static int anInt944 = 0;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt945 = 100;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
	public static final int[] anIntArray61 = new int[50];

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public static final int anInt946 = 50;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[anInt946];

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
	public static final int[] anIntArray62 = new int[anInt946];

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
	public static final int[] anIntArray63 = new int[anInt946];

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
	public static final int[] anIntArray64 = new int[anInt946];

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "[I")
	public static final int[] anIntArray65 = new int[anInt946];

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
	public static final int[] anIntArray66 = new int[anInt946];

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
	public static final int[] anIntArray67 = new int[anInt946];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!mj;IZLclient!mj;BZ)I")
	private static int method931(@OriginalArg(0) int arg0, @OriginalArg(1) Class135_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class135_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static139.method2815(arg4, arg1, arg0, arg3);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(43) int local43 = Static139.method2815(arg4, arg1, arg2, arg5);
			return arg5 ? -local43 : local43;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!qh;III[Z)V")
	public static void method932(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static258.aClass36Array2 == Static200.aClass36Array4) {
			return;
		}
		@Pc(9) int local9 = Static50.aClass36Array3[arg1].method4433(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class36 local22 = Static50.aClass36Array3[local11];
				if (local22 != null) {
					local22.method4442(arg0, arg2, local9 - local22.method4433(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZZIIZ)V")
	public static void method933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 <= arg4) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg4) / 2;
		@Pc(25) int local25 = arg4;
		@Pc(29) Class135_Sub1 local29 = Static164.aClass135_Sub1Array2[local23];
		Static164.aClass135_Sub1Array2[local23] = Static164.aClass135_Sub1Array2[arg1];
		Static164.aClass135_Sub1Array2[arg1] = local29;
		for (@Pc(41) int local41 = arg4; local41 < arg1; local41++) {
			if (method931(arg0, Static164.aClass135_Sub1Array2[local41], arg5, arg2, local29, arg3) <= 0) {
				@Pc(61) Class135_Sub1 local61 = Static164.aClass135_Sub1Array2[local41];
				Static164.aClass135_Sub1Array2[local41] = Static164.aClass135_Sub1Array2[local25];
				Static164.aClass135_Sub1Array2[local25++] = local61;
			}
		}
		Static164.aClass135_Sub1Array2[arg1] = Static164.aClass135_Sub1Array2[local25];
		Static164.aClass135_Sub1Array2[local25] = local29;
		method933(arg0, local25 - 1, arg2, arg3, arg4, arg5);
		method933(arg0, arg1, arg2, arg3, local25 + 1, arg5);
	}
}
