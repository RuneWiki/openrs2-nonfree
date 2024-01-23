import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "J")
	public static long aLong189;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
	public static int anInt4919;

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "Lclient!oe;")
	public static Class72 aClass72_289;

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "Lclient!wc;")
	public static Class110 aClass110_26 = new Class110(64);

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Lclient!mj;")
	public static Class64 aClass64_17 = null;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
	public static int anInt4917 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)Z")
	public static boolean method3987(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
	public static int method3989(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
