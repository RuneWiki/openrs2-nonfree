import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public static int anInt4244 = -1;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class5 method3583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface7 arg3) {
		return new oa(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BIILclient!ni;)Lclient!mv;")
	public static Class213 method3584(@OriginalArg(2) int arg0, @OriginalArg(3) Class223 arg1) {
		@Pc(9) byte[] local9 = arg1.method5954(0, arg0);
		return local9 == null ? null : new Class213(local9);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lclient!pca;")
	public static Class130 method3588() {
		try {
			return new Class130_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class130) Class.forName("Class130_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class130_Sub3();
			}
		}
	}
}
