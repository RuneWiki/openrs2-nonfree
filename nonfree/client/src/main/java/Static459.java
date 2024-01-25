import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public static int anInt8549;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt8551 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!pe;IIZIIIILclient!op;I)V")
	public static void method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class258 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class250 arg9, @OriginalArg(11) int arg10) {
		Static508.aClass258_10 = arg2;
		Static512.anInt9192 = arg1;
		Static404.aClass261_2 = null;
		Static16.aClass261_1 = null;
		Static6.anInt162 = arg3;
		Static82.aClass250_2 = arg9;
		Static156.anInt3237 = arg7;
		Static447.aClass261_3 = null;
		Static383.anInt7371 = arg6;
		Static71.anInt1234 = arg5;
		Static462.anInt8629 = arg10;
		Static242.anInt4383 = arg4;
		Static133.anInt2855 = arg0;
		Static113.anInt2667 = arg8;
		Static407.method6449();
		Static20.aBoolean18 = true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method6996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
