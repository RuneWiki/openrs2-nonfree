import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
	public static int anInt6294;

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!sea;)Lclient!vn;")
	public static Class352 method5100(@OriginalArg(0) int arg0, @OriginalArg(2) Class308 arg1) {
		@Pc(16) byte[] local16 = arg1.method6547(arg0);
		return local16 == null ? null : new Class352(local16);
	}
}
