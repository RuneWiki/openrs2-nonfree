import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Z")
	public static boolean aBoolean435 = true;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!r;")
	public static final Class176 aClass176_1 = Static170.method3389();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BILclient!wo;I)Lclient!hf;")
	public static Class82 method4154(@OriginalArg(1) int arg0, @OriginalArg(2) Class216 arg1) {
		@Pc(11) byte[] local11 = arg1.method5648(arg0, 0);
		return local11 == null ? null : new Class82(local11);
	}
}
