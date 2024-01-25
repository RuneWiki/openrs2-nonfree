import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_163 = new Class322(44, 7);

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
	public static final int anInt8744 = -1;

	@OriginalMember(owner = "client!rq", name = "u", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray9 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_17 = new Class221(2, 5);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!jc;I)Lclient!vm;")
	public static Class58_Sub3 method7651(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(13) Class58 local13 = Static559.method7902(arg0);
		@Pc(17) int local17 = arg0.method3015();
		@Pc(21) int local21 = arg0.method3015();
		@Pc(25) int local25 = arg0.method3018();
		return new Class58_Sub3(local13.aClass318_20, local13.aClass238_13, local13.anInt10051, local13.anInt10055, local13.anInt10052, local13.anInt10050, local13.anInt10053, local13.anInt10054, local13.anInt10056, local17, local21, local25);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZI)V")
	public static void method7652(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static29.method338(Static50.aClass43_12.method596(Static601.anInt9518), arg1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!rj;ILclient!mq;IIIIIII)V")
	public static void method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class318 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class238 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static21.anInt284 = arg1;
		Static66.aClass238_2 = arg4;
		Static41.aClass64_2 = null;
		Static87.anInt9501 = arg10;
		Static136.anInt2650 = arg3;
		Static331.aClass318_17 = arg2;
		Static274.anInt3230 = arg0;
		Static347.anInt5922 = arg7;
		Static459.anInt7964 = arg8;
		Static492.aClass64_4 = null;
		Static231.anInt4485 = arg5;
		Static226.anInt4399 = arg9;
		Static513.anInt8473 = arg6;
		Static12.aClass64_1 = null;
		Static562.method7942(-117);
		Static457.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)V")
	public static void method7654(@OriginalArg(1) int arg0) {
		Static287.anInt5150 = arg0;
		@Pc(7) Class359 local7 = Static296.aClass359_42;
		synchronized (Static296.aClass359_42) {
			Static296.aClass359_42.method8507();
		}
		local7 = Static535.aClass359_24;
		synchronized (Static535.aClass359_24) {
			Static535.aClass359_24.method8507();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)Z")
	public static boolean method7655(@OriginalArg(0) int arg0) {
		if (arg0 == 57 || arg0 == 52 || arg0 == 16 || arg0 == 2 || arg0 == 18 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 47;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZII)Lclient!aw;")
	public static Class6_Sub3 method7657(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) long local19 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class6_Sub3) Static410.aClass74_43.method1401(local19);
	}
}
