import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public static int anInt4619 = -1;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	public static int anInt4620 = 0;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Lclient!tp;")
	public static Class331 method3722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class331 local12 = Static178.method3435(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass331Array2 == null || arg1 >= local12.aClass331Array2.length) {
			return null;
		} else {
			return local12.aClass331Array2[arg1];
		}
	}
}
