import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!we", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!we", name = "T", descriptor = "I")
	public static int anInt6609;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_190 = new Class34("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
	public static final int[] anIntArray526 = new int[32];

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method5539() {
		Static285.aClass5_23 = null;
		Static135.aClass5_14 = null;
		Class141.lb = null;
		Static18.aClass5_3 = null;
		Static224.aClass5_24 = null;
		Static277.aClass5_26 = null;
		Static324.aClass5_28 = null;
		Static188.aClass5_20 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)I")
	public static int method5540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg2;
			arg2 = local16;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return 7 + 1 - arg3 - arg0;
		} else if (local7 == 2) {
			return 7 + 1 - arg4 - arg2;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILclient!uo;ILclient!eq;II)Lclient!c;")
	public static Class5 method5541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class60 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static267.aClass119_1.aBoolean338 = arg4 != null;
		Static267.aClass119_1.anInt3596 = arg5;
		Static267.aClass119_1.anInt3597 = arg0;
		Static267.aClass119_1.anInt3593 = arg1;
		Static267.aClass119_1.anInt3595 = arg6;
		Static267.aClass119_1.anInt3602 = arg2.anInt2472;
		Static267.aClass119_1.anInt3600 = arg3;
		return (Class5) Static357.aClass18_3.method570(Static267.aClass119_1);
	}
}
