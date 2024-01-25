import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
	public static int anInt3439;

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_99 = new Class194(1, -2);

	@OriginalMember(owner = "client!gfa", name = "r", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_28 = new Class384(4, 1);

	@OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
	public static int anInt3440 = 1;

	@OriginalMember(owner = "client!gfa", name = "u", descriptor = "[Lclient!qha;")
	public static final Class3_Sub43[] aClass3_Sub43Array1 = new Class3_Sub43[1024];

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "Lclient!st;")
	public static final Class314 aClass314_59 = new Class314(54, -1);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lclient!cu;")
	public static Class61 method2953(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static598.aFloat67 == 3.0D) {
				return Static412.aClass61_6;
			}
			if ((double) Static598.aFloat67 == 4.0D) {
				return Static506.aClass61_7;
			}
			if ((double) Static598.aFloat67 == 6.0D) {
				return Static642.aClass61_8;
			}
			if ((double) Static598.aFloat67 >= 8.0D) {
				return Static252.aClass61_3;
			}
		} else if (arg0 == 1) {
			if ((double) Static598.aFloat67 == 3.0D) {
				return Static642.aClass61_8;
			}
			if ((double) Static598.aFloat67 == 4.0D) {
				return Static252.aClass61_3;
			}
			if ((double) Static598.aFloat67 == 6.0D) {
				return Static370.aClass61_4;
			}
			if ((double) Static598.aFloat67 >= 8.0D) {
				return Static410.aClass61_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static598.aFloat67 == 3.0D) {
				return Static370.aClass61_4;
			}
			if ((double) Static598.aFloat67 == 4.0D) {
				return Static410.aClass61_5;
			}
			if ((double) Static598.aFloat67 == 6.0D) {
				return Static153.aClass61_2;
			}
			if ((double) Static598.aFloat67 >= 8.0D) {
				return Static54.aClass61_1;
			}
		}
		return null;
	}
}
