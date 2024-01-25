import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public static int anInt6884;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([BIIB)[B")
	public static byte[] method5540(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static461.method1985(arg0, arg1, local14, 0, 32768);
		return local14;
	}
}
