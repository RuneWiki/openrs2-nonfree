import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "[I")
	public static int[] anIntArray589;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	public static int anInt5892;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	public static int anInt5867 = 0;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_38 = new Class313(4);

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	public static int anInt5889 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!kr;)Lclient!fp;")
	public static Class97 method4995(@OriginalArg(2) int arg0, @OriginalArg(3) Class171 arg1) {
		@Pc(9) byte[] local9 = arg1.method4339(arg0, 0);
		return local9 == null ? null : new Class97(local9);
	}
}
