import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mv", name = "X", descriptor = "Lclient!l;")
	public static Class57 aClass57_19;

	@OriginalMember(owner = "client!mv", name = "Z", descriptor = "Lclient!it;")
	public static Class114 aClass114_1;

	@OriginalMember(owner = "client!mv", name = "V", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_212 = new Class22(61, 5);

	@OriginalMember(owner = "client!mv", name = "Y", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_58 = new Class215(33, 11);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(FFFFILclient!ge;IBFII)[B")
	public static byte[] method3710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) Class79 arg4, @OriginalArg(8) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static261.method3782(local15, arg2, arg0, 0, arg3, arg1, arg5, arg4);
		return local15;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZZII)I")
	public static int method3713(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class4_Sub25 local13 = Static175.method2834(arg0, arg2);
		if (local13 == null) {
			return -1;
		} else if (arg1 >= 0 && local13.anIntArray230.length > arg1) {
			return local13.anIntArray230[arg1];
		} else {
			return -1;
		}
	}
}
