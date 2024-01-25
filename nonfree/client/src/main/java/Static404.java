import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
	public static int anInt889;

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "Lclient!cq;")
	public static Class2_Sub13 aClass2_Sub13_2;

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)Z")
	public static boolean method784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)Z")
	public static boolean method788(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
