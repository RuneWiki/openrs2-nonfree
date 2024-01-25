import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Lclient!pn;")
	public static Class231 aClass231_2;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public static int anInt4281 = 0;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "J")
	public static volatile long aLong105 = 0L;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_52 = new Class158(44, 3);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IFFIFIFFLclient!qp;I[BBI)V")
	public static void method3536(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) Class248 arg5, @OriginalArg(9) int arg6, @OriginalArg(10) byte[] arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static15.method659(arg5, arg6, arg3, arg0, arg7, arg4, local7, arg2, arg1);
			arg6 += 16384;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method3541(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static162.method3157(0, arg0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BILjava/awt/Canvas;Lclient!kea;Lclient!e;)Lclient!oa;")
	public static Class5 method3545(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) Interface4 arg3) {
		if (!Static382.method5919()) {
			throw new RuntimeException("");
		} else if (Static140.method2462("jaggl")) {
			@Pc(34) OpenGL local34 = new OpenGL();
			@Pc(44) long local44 = local34.init(arg1, 8, 8, 8, 24, 0, arg0);
			if (local44 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(63) Class5_Sub3_Sub1 local63 = new Class5_Sub3_Sub1(local34, arg1, local44, arg3, arg2, arg0);
			local63.method6405();
			return local63;
		} else {
			throw new RuntimeException("");
		}
	}
}
