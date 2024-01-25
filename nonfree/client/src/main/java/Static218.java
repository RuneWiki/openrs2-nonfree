import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static218 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!vt;")
	public static final Class2_Sub24 aClass2_Sub24_3 = new Class2_Sub24(new byte[5000]);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_122 = new Class208(12, -2);

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public static int anInt4414 = 0;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BC)Z")
	public static boolean method3893(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
