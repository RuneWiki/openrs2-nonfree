import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!al", name = "u", descriptor = "I")
	public static int anInt824;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_9 = new Class130(57, -1);

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_2 = new Class200(12, 2);

	@OriginalMember(owner = "client!al", name = "v", descriptor = "Z")
	public static volatile boolean aBoolean62 = true;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!d;Ljava/awt/Canvas;ILclient!la;)Lclient!ha;")
	public static Class5 method904(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class196 arg3) {
		if (!Static118.method2413()) {
			throw new RuntimeException("");
		} else if (Static522.method7730("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class5_Sub1_Sub2 local58 = new Class5_Sub1_Sub2(local29, arg2, local39, arg1, arg3, arg0);
			local58.method5676();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
	public static boolean method905() {
		try {
			@Pc(11) Class354 local11 = new Class354();
			@Pc(16) byte[] local16 = local11.method8379(Static169.aByteArray48);
			Static25.method6691(local16);
			return true;
		} catch (@Pc(23) Exception local23) {
			return false;
		}
	}
}
