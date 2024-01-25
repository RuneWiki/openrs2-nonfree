import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!mia;")
	public static Interface16 anInterface16_1;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZII)V")
	public static void method9107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class6_Sub4_Sub18 local19 = Static565.method7924((long) arg1 << 32 | (long) arg0, 18);
		local19.method7976();
		local19.anInt9463 = arg3;
		local19.anInt9466 = arg2;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLclient!d;Ljava/awt/Canvas;Lclient!ae;I)Lclient!ha;")
	public static Class132 method9108(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class8 arg2, @OriginalArg(4) int arg3) {
		if (!Static424.method6294()) {
			throw new RuntimeException("");
		} else if (Static272.method4009("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg1, 8, 8, 8, 24, 0, arg3);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class132_Sub1_Sub1 local58 = new Class132_Sub1_Sub1(local24, arg1, local34, arg0, arg2, arg3);
			local58.method7526();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}
}
