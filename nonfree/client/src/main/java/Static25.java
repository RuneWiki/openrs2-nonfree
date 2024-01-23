import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
	public static int anInt510;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "Lclient!jg;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
	public static int anInt502 = 0;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "F")
	public static float aFloat19 = 128.0F;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
	public static int[] anIntArray53 = new int[25];

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	public static int anInt507 = 0;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "[I")
	public static int[] anIntArray54 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
	public static int anInt512 = -1;

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "[I")
	public static int[] anIntArray55 = new int[256];

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString18 = "M";

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method417(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static173.method3185(Static94.method4774(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I")
	public static int method420(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B[B)[B")
	public static byte[] method421(@OriginalArg(1) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(15) byte[] local15 = new byte[local2];
		Static302.method1372(arg0, 0, local15, 0, local2);
		return local15;
	}
}
