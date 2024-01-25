import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kd", name = "fd", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!kd", name = "wd", descriptor = "[I")
	public static final int[] anIntArray337 = new int[8];

	@OriginalMember(owner = "client!kd", name = "xd", descriptor = "Z")
	public static final boolean aBoolean381 = false;

	@OriginalMember(owner = "client!kd", name = "Ad", descriptor = "[Lclient!nj;")
	public static Class224[] aClass224Array1 = new Class224[50];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!vd;Ljava/awt/Canvas;Lclient!d;III)Lclient!ha;")
	public static Class100 method4926(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(15) int local15 = 0;
		if (arg1 != null) {
			@Pc(20) Dimension local20 = arg1.getSize();
			local15 = local20.height;
			local5 = local20.width;
		}
		return Static197.method8793(arg4, arg0, local5, arg3, arg2, arg1, local15);
	}
}
