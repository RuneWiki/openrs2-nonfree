import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_10 = new Class219(6, 0, 4, 2);

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!fd;B)Lclient!qga;")
	public static Class260 method2969(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(10) Class100 local10 = Static414.method6700()[arg0.method6538()];
		@Pc(17) Class237 local17 = Static557.method1636()[arg0.method6538()];
		@Pc(21) int local21 = arg0.method6525();
		@Pc(25) int local25 = arg0.method6525();
		@Pc(34) int local34 = arg0.method6535();
		@Pc(38) int local38 = arg0.method6535();
		@Pc(42) int local42 = arg0.method6525();
		@Pc(46) int local46 = arg0.method6497();
		@Pc(50) int local50 = arg0.method6497();
		return new Class260(local10, local17, local21, local25, local34, local38, local42, local46, local50);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!e;Ljava/awt/Canvas;ILclient!pe;)Lclient!oa;")
	public static Class15 method2970(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class254 arg3) {
		if (!Static279.method4843()) {
			throw new RuntimeException("");
		} else if (Static68.method1703("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class15_Sub2_Sub1 local60 = new Class15_Sub2_Sub1(local29, arg2, local39, arg1, arg3, arg0);
			local60.method5418();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2972(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
