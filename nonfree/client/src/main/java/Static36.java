import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_11 = new Class359(95, -1);

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
	public static int anInt607 = 0;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "[I")
	public static final int[] anIntArray25 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)V")
	public static void method529() {
		@Pc(16) byte[] local16;
		if (Static284.anObject10 == null) {
			@Pc(9) Class13_Sub2_Sub2 local9 = new Class13_Sub2_Sub2();
			local16 = local9.method7340();
			Static284.anObject10 = Static249.method3855(local16);
		}
		if (Static48.anObject24 == null) {
			@Pc(27) Class13_Sub1_Sub1 local27 = new Class13_Sub1_Sub1();
			local16 = local27.method2320();
			Static48.anObject24 = Static249.method3855(local16);
		}
	}
}
