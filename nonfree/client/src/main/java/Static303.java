import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
	public static int anInt5522 = -1;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray3 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)Lclient!qw;")
	public static Class308 method5004(@OriginalArg(1) int arg0) {
		@Pc(10) Class308 local10 = (Class308) Static60.aClass22_5.method462((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static415.aClass124_35.method3641(0, arg0);
		local10 = new Class308();
		if (local20 != null) {
			local10.method7870(new Class2_Sub8(local20));
		}
		local10.method7873();
		Static60.aClass22_5.method470((long) arg0, local10);
		return local10;
	}
}
