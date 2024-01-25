import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "Lclient!kr;")
	public static Class204 aClass204_2;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "[Lclient!mk;")
	public static final Class228[] aClass228Array1 = new Class228[14];

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)I")
	public static int method3476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
