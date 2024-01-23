import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
	public static int anInt5070;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38 = new String[5];

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
	public static int anInt5073 = 0;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString299 = "glow1:";

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
	public static int anInt5078 = -1;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString300 = "Face here";

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)V")
	public static void method4334(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static127.aClass1_Sub14_Sub1_3.method1408(126);
			Static127.aClass1_Sub14_Sub1_3.method1374(arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!nk;Lclient!nk;I)V")
	public static void method4338(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1) {
		Static133.aClass121_64 = arg0;
		Static235.aClass121_129 = arg1;
	}
}
