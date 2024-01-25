import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static165 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public static int anInt3242;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_77 = new Class381(45, 3);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public static int anInt3244 = 1;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public static int anInt3245 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method3007(@OriginalArg(0) File arg0) {
		return Static437.method6279((int) arg0.length(), arg0);
	}
}
