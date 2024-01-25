import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gja", name = "x", descriptor = "I")
	public static int anInt3477;

	@OriginalMember(owner = "client!gja", name = "s", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_82 = new Class381(46, 3);

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!gda;ZLclient!gda;Lclient!gda;Lclient!gda;)V")
	public static void method3192(@OriginalArg(0) Class126 arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) Class126 arg3) {
		Static609.aClass126_197 = arg0;
		Static90.aClass126_53 = arg1;
		Static304.aClass126_148 = arg2;
		Static397.aClass238ArrayArray2 = new Class238[Static90.aClass126_53.method3082()][];
		Static383.aBooleanArray19 = new boolean[Static90.aClass126_53.method3082()];
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(III)Lclient!qea;")
	public static Class299 method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass299_2;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method3195(@OriginalArg(0) Class100 arg0) {
		Static645.aClass194Array1 = new Class194[Static54.anIntArray64.length];
		for (@Pc(11) int local11 = 0; local11 < Static54.anIntArray64.length; local11++) {
			@Pc(17) int local17 = Static54.anIntArray64[local11];
			@Pc(22) Class196 local22 = Static321.method4907(Static153.aClass126_88, local17);
			@Pc(30) Class70 local30 = arg0.method8612(local22, Static692.method8270(Static471.aClass126_219, local17));
			Static645.aClass194Array1[local11] = new Class194(local30, local22);
		}
	}
}
