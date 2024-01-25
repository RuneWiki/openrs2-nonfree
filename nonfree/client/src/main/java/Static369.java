import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static369 {

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
	public static int anInt6644;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
	public static int anInt6640 = 0;

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
	public static final int anInt6642 = Static509.method7779(1600);

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
	public static int anInt6643 = 0;

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_345 = new Class305(93, 11);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!n;BLjava/awt/Canvas;I)Lclient!qa;")
	public static Class4 method5966(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class4_Sub3(arg1, arg0, arg2);
	}
}
