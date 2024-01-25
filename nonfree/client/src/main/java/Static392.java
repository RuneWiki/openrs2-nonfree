import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Lclient!la;")
	public static final Class136 aClass136_179 = new Class136(66, -1);

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
	public static int anInt6568 = -1;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "[I")
	public static final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "Lclient!of;")
	public static final Class174 aClass174_188 = new Class174("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lclient!kr;")
	public static Class1_Sub3 method5427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_3;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V")
	public static void method5428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(5, arg1);
		local8.method1003();
		local8.anInt972 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB[JI[I)V")
	public static void method5429(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg2; local55++) {
			if (local21 + (long) (local53 & local55) > arg1[local55]) {
				@Pc(73) long local73 = arg1[local55];
				arg1[local55] = arg1[local17];
				arg1[local17] = local73;
				@Pc(87) int local87 = arg3[local55];
				arg3[local55] = arg3[local17];
				arg3[local17++] = local87;
			}
		}
		arg1[arg2] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg2] = arg3[local17];
		arg3[local17] = local35;
		method5429(arg0, arg1, local17 - 1, arg3);
		method5429(local17 + 1, arg1, arg2, arg3);
	}
}
