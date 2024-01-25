import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static558 {

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public static int anInt8797;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public static int anInt8795 = 0;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "[I")
	public static final int[] anIntArray500 = new int[1024];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ac;Lclient!ac;B)V")
	public static void method7542(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		if (arg1.aClass5_337 != null) {
			arg1.method9222();
		}
		arg1.aClass5_338 = arg0;
		arg1.aClass5_337 = arg0.aClass5_337;
		arg1.aClass5_337.aClass5_338 = arg1;
		arg1.aClass5_338.aClass5_337 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method7543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class100 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static548.aClass100_13 = arg2;
		Static500.aClass10_9 = Static548.aClass100_13.method8623();
		Static479.aClass10_8 = Static548.aClass100_13.method8623();
		Static83.aClass10_1 = Static548.aClass100_13.method8623();
		Static488.anInt7901 = 0;
		Static565.anInt8920 = 2;
		Static526.anInt8350 = 2;
		Static122.anInt2024 = arg4;
		Static181.anInt3401 = 1;
		Static682.anInterface24_1 = null;
		Static111.anInt1795 = 0;
		Static659.anInt10729 = arg1;
		Static142.method6602(arg0, arg3);
	}
}
