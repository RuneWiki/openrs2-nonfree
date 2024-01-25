import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public static int anInt3209;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!nv;")
	public static Class183 aClass183_3;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_46 = new Class177(2, 15);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	public static void method2378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static316.anInt5918; local3++) {
			@Pc(9) Rectangle local9 = Class30_Sub1_Sub1_Sub2.aRectangleArray2[local3];
			if (local9.width + local9.x > arg1 && local9.x < arg3 + arg1 && arg2 < local9.height + local9.y && local9.y < arg2 + arg0) {
				Static55.aBooleanArray7[local3] = true;
			}
		}
	}
}
