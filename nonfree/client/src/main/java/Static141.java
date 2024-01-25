import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!en", name = "G", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_55 = new Class180(130, -2);

	@OriginalMember(owner = "client!en", name = "N", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray52 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!en", name = "O", descriptor = "[I")
	public static final int[] anIntArray231 = new int[1];

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public static void method2605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static120.method2296(arg3, Static374.anInt5986, Static84.anInt1667);
		@Pc(17) int local17 = Static120.method2296(arg0, Static374.anInt5986, Static84.anInt1667);
		@Pc(23) int local23 = Static120.method2296(arg1, Static7.anInt93, Static115.anInt2377);
		@Pc(29) int local29 = Static120.method2296(arg4, Static7.anInt93, Static115.anInt2377);
		@Pc(37) int local37 = Static120.method2296(arg2 + arg3, Static374.anInt5986, Static84.anInt1667);
		@Pc(46) int local46 = Static120.method2296(arg0 - arg2, Static374.anInt5986, Static84.anInt1667);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static483.method7014(Static392.anIntArrayArray39[local48], local23, local29, arg5);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static483.method7014(Static392.anIntArrayArray39[local64], local23, local29, arg5);
		}
		@Pc(91) int local91 = Static120.method2296(arg1 + arg2, Static7.anInt93, Static115.anInt2377);
		@Pc(100) int local100 = Static120.method2296(arg4 - arg2, Static7.anInt93, Static115.anInt2377);
		for (@Pc(102) int local102 = local37; local102 <= local46; local102++) {
			@Pc(108) int[] local108 = Static392.anIntArrayArray39[local102];
			Static483.method7014(local108, local23, local91, arg5);
			Static483.method7014(local108, local100, local29, arg5);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method2606(@OriginalArg(0) String arg0) {
		return Static81.method1580(16, arg0);
	}
}
