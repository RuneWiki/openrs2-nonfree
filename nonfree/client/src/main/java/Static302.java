import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "Lclient!qm;")
	public static Class192 aClass192_5;

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "Lclient!is;")
	public static Class110 aClass110_8;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_130 = new Class211(83, -1);

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_131 = new Class211(35, 7);

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_184 = new Class48(64, -1);

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lclient!o;")
	public static final Class169 aClass169_284 = new Class169("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "Lclient!o;")
	public static final Class169 aClass169_285 = new Class169("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
	public static int anInt5151 = 10;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_185 = new Class48(37, 7);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg4; local7++) {
			for (@Pc(19) int local19 = arg2; local19 <= arg0; local19++) {
				if (arg3 == Static51.anIntArrayArray15[local7][local19] && Static8.anIntArrayArray1[local7][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!tq;IIIIIIIIILclient!ns;)Lclient!ns;")
	public static Class22 method4520(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class22 arg9) {
		@Pc(11) long local11 = (long) arg5;
		@Pc(17) Class22 local17 = (Class22) Static281.aClass227_37.method4863(local11);
		if (local17 == null) {
			@Pc(27) Class238 local27 = Static180.method2595(arg5, Static350.aClass230_78);
			if (local27 == null) {
				return null;
			}
			local17 = arg0.method5368(local27, 1031, Static49.anInt3744, 64, 768);
			Static281.aClass227_37.method4865(local17, local11);
		}
		local17 = local17.method1598((byte) 2, 1031, true);
		if (arg8 != 0) {
			local17.method1605(arg8);
		}
		if (arg4 != 0) {
			local17.method1582(arg4);
		}
		if (arg6 != 0) {
			local17.method1580(arg6);
		}
		if (arg7 != 0) {
			local17.method1568(0, arg7, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Ljava/lang/Object;[IZI)V")
	public static void method4522(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg0; local46++) {
			if (arg2[local46] < (local46 & 0x1) + local20) {
				@Pc(61) int local61 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local61;
				@Pc(75) Object local75 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local75;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method4522(local16 - 1, arg1, arg2, arg3);
		method4522(arg0, arg1, arg2, local16 + 1);
	}
}
