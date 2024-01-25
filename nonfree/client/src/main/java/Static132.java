import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!gi", name = "id", descriptor = "I")
	public static int anInt2510;

	@OriginalMember(owner = "client!gi", name = "pb", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_29 = new Class208(42, 8);

	@OriginalMember(owner = "client!gi", name = "hd", descriptor = "I")
	public static int anInt2509 = 765;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!pb;ILclient!l;ILjava/awt/Canvas;)Lclient!za;")
	public static Class75 method2117(@OriginalArg(0) int arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(5) Canvas arg4) {
		return new Class75_Sub2(arg2, arg4, arg3, arg0, arg1);
	}
}
