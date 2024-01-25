import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt4290;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	public static int anInt4291 = 0;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_92 = new Class253(77, 6);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ok;IIB)Lclient!du;")
	public static Class57 method3389(@OriginalArg(0) Class178 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = arg0.method3838(0, arg1);
		return local18 == null ? null : new Class57(local18);
	}
}
