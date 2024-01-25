import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_64 = new Class233(8);

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public static int anInt10240 = 0;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_184 = new Class274(46, 5);

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)V")
	public static void method8565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub50 local17 = Static595.method8194(Static610.aClass310_2, Static470.aClass269_79);
		local17.aClass2_Sub34_Sub2_2.method6869(arg1);
		local17.aClass2_Sub34_Sub2_2.method6900(arg0);
		Static311.method4754(local17);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
	public static void method8566(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub5_Sub10 local16 = Static594.method8175(arg0, 5);
		local16.method4387();
	}
}
