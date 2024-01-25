import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!rg;ILclient!d;)Lclient!ha;")
	public static Class144 method9366(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Class310 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3) {
		if (!Static485.method7318()) {
			throw new RuntimeException("");
		} else if (Static425.method6393("jaggl")) {
			@Pc(28) OpenGL local28 = new OpenGL();
			@Pc(38) long local38 = local28.init(arg0, 8, 8, 8, 24, 0, arg2);
			if (local38 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class144_Sub1_Sub2 local58 = new Class144_Sub1_Sub2(local28, arg0, local38, arg3, arg1, arg2);
			local58.method5669();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public static void method9367() {
		if (Static600.anIntArray533 != null && Static79.anIntArray75 != null) {
			return;
		}
		Static79.anIntArray75 = new int[256];
		Static600.anIntArray533 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(21) double local21 = (double) local13 / 255.0D * 6.283185307179586D;
			Static600.anIntArray533[local13] = (int) (Math.sin(local21) * 4096.0D);
			Static79.anIntArray75[local13] = (int) (Math.cos(local21) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
	public static void method9368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(26) Class14_Sub2_Sub9 local26 = Static499.method7527((long) arg1 << 32 | (long) arg0, 19);
		local26.method4004();
		local26.anInt4592 = arg3;
		local26.anInt4595 = arg2;
	}
}
