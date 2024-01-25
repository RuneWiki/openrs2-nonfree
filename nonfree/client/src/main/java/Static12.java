import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "M", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!am", name = "L", descriptor = "[I")
	public static final int[] anIntArray24 = new int[100];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!mn;)Lclient!wd;")
	public static Class2_Sub46 method227(@OriginalArg(1) int arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(8) byte[] local8 = arg1.method3664(arg0);
		return local8 == null ? null : new Class2_Sub46(local8);
	}
}
