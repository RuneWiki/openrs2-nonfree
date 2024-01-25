import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLclient!oi;)V")
	public static void method7353(@OriginalArg(1) Class9_Sub4_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static384.anInt7234 == arg0.anInt4351 || arg0.anInt4341 == -1 || arg0.anInt4326 != 0) {
			local5 = true;
		} else {
			@Pc(28) Class113 local28 = Static528.aClass198_2.method5706(arg0.anInt4341);
			if (local28.aBoolean310 || arg0.lb + 1 > local28.anIntArray176[arg0.anInt4319]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(56) int local56 = arg0.anInt4351 - arg0.anInt4316;
			@Pc(62) int local62 = Static384.anInt7234 - arg0.anInt4316;
			@Pc(74) int local74 = arg0.anInt4303 * 512 + arg0.method3620() * 256;
			@Pc(85) int local85 = arg0.anInt4273 * 512 + arg0.method3620() * 256;
			@Pc(97) int local97 = arg0.anInt4291 * 512 + arg0.method3620() * 256;
			@Pc(109) int local109 = arg0.anInt4318 * 512 + arg0.method3620() * 256;
			arg0.anInt10360 = ((local56 - local62) * local74 + local97 * local62) / local56;
			arg0.anInt10357 = (local62 * local109 + local85 * (local56 - local62)) / local56;
		}
		arg0.anInt4358 = 0;
		if (arg0.anInt4334 == 0) {
			arg0.method3633(8192, false);
		}
		if (arg0.anInt4334 == 1) {
			arg0.method3633(12288, false);
		}
		if (arg0.anInt4334 == 2) {
			arg0.method3633(0, false);
		}
		if (arg0.anInt4334 == 3) {
			arg0.method3633(4096, false);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZZJIILjava/lang/String;ZIIJIZLjava/lang/String;)V")
	public static void method7357(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) String arg11) {
		if (!Static199.aBoolean358 && Static611.anInt10324 < 500) {
			@Pc(16) int local16 = arg2 == -1 ? Static329.anInt6606 : arg2;
			@Pc(36) Class6_Sub5_Sub9 local36 = new Class6_Sub5_Sub9(arg11, arg4, local16, arg7, arg9, arg1, arg3, arg6, arg0, arg10, arg8, arg5);
			Static298.method5094(local36);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method7358(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static381.method6035(local6.height, local6.width);
		if (Static552.anInt9486 == 1) {
			Static293.aClass5_6.method6145(arg0, Static226.anInt5043, Static84.anInt2618);
		} else {
			Static293.aClass5_6.method6145(arg0, Static528.anInt9203, Static287.anInt5975);
		}
	}
}
