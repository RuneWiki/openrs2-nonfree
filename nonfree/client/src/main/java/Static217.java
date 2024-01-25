import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_83 = new Class180(34, 7);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!or;II)I")
	public static int method3757(@OriginalArg(0) Class260 arg0, @OriginalArg(2) int arg1) {
		if (!Static79.method1526(arg0).method7070(arg1) && arg0.anObjectArray9 == null) {
			return -1;
		} else if (arg0.anIntArray618 == null || arg0.anIntArray618.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray618[arg1];
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Lclient!lda;")
	public static Class98_Sub1 method3760(@OriginalArg(0) int arg0) {
		return Static323.aBoolean336 && Static321.anInt5361 <= arg0 && Static495.anInt8144 >= arg0 ? Static33.aClass98_Sub1Array4[arg0 - Static321.anInt5361] : null;
	}
}
