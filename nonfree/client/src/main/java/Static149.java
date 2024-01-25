import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!el", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)I")
	public static int method2162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static543.anIntArray606[arg1 & 0x3] : Static174.anIntArray225[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(I)Lclient!dv;")
	public static Class88_Sub1 method2163() {
		return Static313.aClass88_Sub1Array2.length > Static55.anInt901 ? Static313.aClass88_Sub1Array2[Static55.anInt901++] : null;
	}
}
