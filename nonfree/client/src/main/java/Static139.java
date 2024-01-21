import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] aClass1_Sub2_Sub5_Sub1Array11;

	@OriginalMember(owner = "client!pb", name = "xb", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!pb", name = "Eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray89;

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1953 = Static118.method2249("");

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1951 = aClass65_1953;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1952 = aClass65_1953;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_8 = new Class67(50);

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1954 = aClass65_1953;

	@OriginalMember(owner = "client!pb", name = "tb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1955 = Static118.method2249(" <col=ffffff>");

	@OriginalMember(owner = "client!pb", name = "ub", descriptor = "[I")
	public static final int[] anIntArray387 = new int[5];

	@OriginalMember(owner = "client!pb", name = "yb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1956 = aClass65_1953;

	@OriginalMember(owner = "client!pb", name = "zb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1957 = aClass65_1953;

	@OriginalMember(owner = "client!pb", name = "Db", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1958 = aClass65_1953;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I")
	public static int method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!sd;BLclient!sd;)V")
	public static void method2609(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		Static158.aClass60_31 = arg1;
		Static176.aClass60_36 = arg0;
	}
}
