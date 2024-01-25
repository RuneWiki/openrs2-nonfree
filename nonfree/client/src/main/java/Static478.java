import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static478 {

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	public static int anInt8065;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_172 = new Class40(10, 12);

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "Lclient!kca;")
	public static final Class168 aClass168_6 = new Class168();

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)[Lclient!rn;")
	public static Class277[] method6658() {
		return new Class277[] { Static315.aClass277_4, Static415.aClass277_8, Static330.aClass277_6 };
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method6659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static196.method2957(0, arg0, arg4, arg2, arg3, arg5, arg1);
	}
}
