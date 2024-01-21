import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt312;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt313 = -1;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_190 = Static122.method531("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!b;")
	public static Class7 aClass7_5 = new Class7(260);

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_191 = null;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_192 = Static122.method531("<col=40ff00>");

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_193 = Static122.method531("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_194 = aClass73_193;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean22 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lclient!ce;")
	public static Class3_Sub1_Sub5 method204(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub5 local10 = (Class3_Sub1_Sub5) Static162.aClass7_26.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static37.aClass13_8.method348(8, arg0);
		local10 = new Class3_Sub1_Sub5();
		if (local20 != null) {
			local10.method473(new Class3_Sub12(local20));
		}
		Static162.aClass7_26.method186(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method205() {
		aClass73_190 = null;
		aClass73_192 = null;
		aClass73_191 = null;
		aClass73_194 = null;
		aClass7_5 = null;
		aRandom1 = null;
		aClass73_193 = null;
	}
}
