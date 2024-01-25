import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static507 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt9922;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!da;")
	public static Class6 aClass6_15;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!qda;")
	public static final Class281 aClass281_21 = new Class281(3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILjava/awt/Canvas;BLclient!d;)Lclient!ha;")
	public static Class126 method8443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Interface8 arg3) {
		return new oa(arg2, arg3, arg0, arg1);
	}
}
