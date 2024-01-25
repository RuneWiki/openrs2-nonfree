import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	public static int anInt6878;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "[J")
	public static long[] aLongArray8;

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
	public static int anInt6882;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
	public static int anInt6883;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	public static int anInt6879 = 0;

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "[Lclient!ii;")
	public static Class23_Sub1[] aClass23_Sub1Array2 = new Class23_Sub1[0];

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
	public static int anInt6881 = -1;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!m;ILclient!js;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class26 method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(4) Class131 arg3, @OriginalArg(5) Canvas arg4) {
		return new Class26_Sub1(arg1, arg4, arg2, arg0, arg3);
	}
}
