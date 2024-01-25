import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static546 {

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "Lclient!kr;")
	public static Class171 aClass171_60;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "Lclient!kr;")
	public static Class171 aClass171_61;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
	public static int anInt2819 = -2;

	@OriginalMember(owner = "client!ww", name = "y", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V")
	public static void method2430(@OriginalArg(1) int arg0) {
		Static299.anInt5548 = arg0;
		Static99.anInt1989 = 100;
		Static361.anInt6368 = -1;
		anInt2811 = 3;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)I")
	public static int method2435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static159.anIntArray281[arg1 & 0x3] : 256;
	}
}
