import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "Lclient!tw;")
	public static Class333 aClass333_2;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "Lclient!hu;")
	public static Class21 aClass21_7;

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_10 = new Class316(13, 0, 1, 0);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLclient!ig;)Lclient!cn;")
	public static Class5_Sub3 method3723(@OriginalArg(1) Class8_Sub8 arg0) {
		return new Class5_Sub3(arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8560(), arg0.method8525());
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3730(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static649.method5532(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
