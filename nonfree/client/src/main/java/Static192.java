import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	public static int anInt3828 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BILclient!ci;)Lclient!gg;")
	public static Class84 method3432(@OriginalArg(1) int arg0, @OriginalArg(2) Class38 arg1) {
		@Pc(13) byte[] local13 = arg1.method1031(arg0);
		return local13 == null ? null : new Class84(local13);
	}
}
