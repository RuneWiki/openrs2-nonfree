import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!en", name = "t", descriptor = "Lclient!ei;")
	public static final Class73 aClass73_3 = new Class73();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B[SI)[S")
	public static short[] method6667(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static559.method5956(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
