import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_73 = new Class71(86, 8);

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_53 = new Class257(17, 8);

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "[Lclient!fba;")
	public static final Class97[] aClass97Array1 = new Class97[14];

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_54 = new Class257(26, 8);

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "Lclient!rb;")
	public static final Class283 aClass283_4 = new Class283();

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/awt/Canvas;ZLclient!oh;Lclient!d;)Lclient!ha;")
	public static Class16 method4840(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Class237 arg2, @OriginalArg(4) Interface2 arg3) {
		if (!Static619.method8391()) {
			throw new RuntimeException("");
		} else if (Static267.method4634("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg1, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class16_Sub1_Sub1 local60 = new Class16_Sub1_Sub1(local29, arg1, local39, arg3, arg2, arg0);
			local60.method3979();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	public static void method4841(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static251.anInt9634 <= arg2 - arg3 && Static366.anInt6946 >= arg3 + arg2 && Static444.anInt8258 <= arg1 - arg3 && arg3 + arg1 <= Static188.anInt4410) {
			Static473.method7034(arg1, arg3, arg0, arg2);
		} else {
			Static131.method2901(arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method4842(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static342.method5464(arg1.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	public static void method4843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class8_Sub5_Sub8 local12 = Static509.method7344(13, arg1);
		local12.method3509();
		local12.anInt4321 = arg0;
	}
}
