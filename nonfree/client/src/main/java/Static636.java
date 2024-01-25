import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_118 = new Class387(91, 6);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lclient!or;")
	public static Class5_Sub18 method8885(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("gka");
			@Pc(18) Class5_Sub18 local18 = (Class5_Sub18) local14.getDeclaredConstructor().newInstance();
			local18.method5405(arg0, arg1, arg2);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class5_Sub18_Sub2 local31 = new Class5_Sub18_Sub2();
			local31.method5405(arg0, arg1, arg2);
			return local31;
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)Lclient!nf;")
	public static Class5_Sub5_Sub17 method8886(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub5_Sub17 local10 = (Class5_Sub5_Sub17) Static44.aClass90_1.method1632((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static343.aClass208_76.method4991(arg0, 0, -4);
		if (local28 == null || local28.length <= 1) {
			return null;
		}
		try {
			local10 = Static606.method8453(local28);
		} catch (@Pc(45) Exception local45) {
			throw new RuntimeException(local45.getMessage() + " S: " + arg0);
		}
		Static44.aClass90_1.method1631(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
	public static void method8888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class5_Sub5_Sub6 local18 = Static478.method6972((long) arg1, 9);
		local18.method2687();
		local18.anInt3058 = arg0;
		local18.anInt3064 = arg2;
	}
}
