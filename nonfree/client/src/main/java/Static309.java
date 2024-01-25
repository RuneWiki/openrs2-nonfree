import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
	public static int anInt5878 = 0;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "[I")
	public static final int[] anIntArray532 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
	public static int anInt5886 = 0;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
	public static int anInt5890 = 0;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	public static int anInt5892 = 0;

	@OriginalMember(owner = "client!tl", name = "F", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static156.method5346(arg3);
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg3 - arg5;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(27) int local27 = arg3;
		@Pc(30) int local30 = -arg3;
		@Pc(32) int local32 = local21;
		@Pc(35) int local35 = -local21;
		@Pc(37) int local37 = -1;
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(85) int local85;
		if (arg1 >= Static32.anInt750 && Static112.anInt2485 >= arg1) {
			@Pc(51) int[] local51 = Static104.anIntArrayArray31[arg1];
			local60 = Static222.method3991(arg0 - arg3, Static275.anInt5244, Static6.anInt136);
			local68 = Static222.method3991(arg0 + arg3, Static275.anInt5244, Static6.anInt136);
			local77 = Static222.method3991(arg0 - local21, Static275.anInt5244, Static6.anInt136);
			local85 = Static222.method3991(local21 + arg0, Static275.anInt5244, Static6.anInt136);
			Static27.method690(local77, local51, arg2, local60);
			Static27.method690(local85, local51, arg4, local77);
			Static27.method690(local68, local51, arg2, local85);
		}
		@Pc(105) int local105 = -1;
		while (local27 > local17) {
			local37 += 2;
			local105 += 2;
			local30 += local37;
			local35 += local105;
			if (local35 >= 0 && local32 >= 1) {
				local32--;
				Static208.anIntArray360[local32] = local17;
				local35 -= local32 << 1;
			}
			local17++;
			@Pc(235) int local235;
			@Pc(243) int local243;
			@Pc(254) int[] local254;
			@Pc(154) int local154;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				local154 = arg1 - local27;
				local60 = local27 + arg1;
				if (Static32.anInt750 <= local60 && local154 <= Static112.anInt2485) {
					if (local21 <= local27) {
						local68 = Static222.method3991(local17 + arg0, Static275.anInt5244, Static6.anInt136);
						local77 = Static222.method3991(arg0 - local17, Static275.anInt5244, Static6.anInt136);
						if (local60 <= Static112.anInt2485) {
							Static27.method690(local68, Static104.anIntArrayArray31[local60], arg2, local77);
						}
						if (local154 >= Static32.anInt750) {
							Static27.method690(local68, Static104.anIntArrayArray31[local154], arg2, local77);
						}
					} else {
						local68 = Static208.anIntArray360[local27];
						local77 = Static222.method3991(arg0 + local17, Static275.anInt5244, Static6.anInt136);
						local85 = Static222.method3991(arg0 - local17, Static275.anInt5244, Static6.anInt136);
						local235 = Static222.method3991(local68 + arg0, Static275.anInt5244, Static6.anInt136);
						local243 = Static222.method3991(arg0 - local68, Static275.anInt5244, Static6.anInt136);
						if (local60 <= Static112.anInt2485) {
							local254 = Static104.anIntArrayArray31[local60];
							Static27.method690(local243, local254, arg2, local85);
							Static27.method690(local235, local254, arg4, local243);
							Static27.method690(local77, local254, arg2, local235);
						}
						if (local154 >= Static32.anInt750) {
							local254 = Static104.anIntArrayArray31[local154];
							Static27.method690(local243, local254, arg2, local85);
							Static27.method690(local235, local254, arg4, local243);
							Static27.method690(local77, local254, arg2, local235);
						}
					}
				}
			}
			local154 = arg1 - local17;
			local60 = local17 + arg1;
			if (Static32.anInt750 <= local60 && Static112.anInt2485 >= local154) {
				local68 = arg0 + local27;
				local77 = arg0 - local27;
				if (Static6.anInt136 <= local68 && local77 <= Static275.anInt5244) {
					local68 = Static222.method3991(local68, Static275.anInt5244, Static6.anInt136);
					local77 = Static222.method3991(local77, Static275.anInt5244, Static6.anInt136);
					if (local21 <= local17) {
						if (local60 <= Static112.anInt2485) {
							Static27.method690(local68, Static104.anIntArrayArray31[local60], arg2, local77);
						}
						if (local154 >= Static32.anInt750) {
							Static27.method690(local68, Static104.anIntArrayArray31[local154], arg2, local77);
						}
					} else {
						local85 = local32 >= local17 ? local32 : Static208.anIntArray360[local17];
						local235 = Static222.method3991(local85 + arg0, Static275.anInt5244, Static6.anInt136);
						local243 = Static222.method3991(arg0 - local85, Static275.anInt5244, Static6.anInt136);
						if (Static112.anInt2485 >= local60) {
							local254 = Static104.anIntArrayArray31[local60];
							Static27.method690(local243, local254, arg2, local77);
							Static27.method690(local235, local254, arg4, local243);
							Static27.method690(local68, local254, arg2, local235);
						}
						if (Static32.anInt750 <= local154) {
							local254 = Static104.anIntArrayArray31[local154];
							Static27.method690(local243, local254, arg2, local77);
							Static27.method690(local235, local254, arg4, local243);
							Static27.method690(local68, local254, arg2, local235);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)I")
	public static int method5332() {
		@Pc(7) Class46 local7 = Static218.aClass46_5;
		@Pc(9) boolean local9 = false;
		if (Static67.anInt1615 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static65.method5095(null, null, local15, 0, 0);
		}
		@Pc(32) long local32 = Static168.method3300();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method5190();
		}
		@Pc(61) int local61 = (int) (Static168.method3300() - local32);
		local7.method5108(100, 0, 100, -16777216, 0);
		if (local9) {
			local7.method5158();
		}
		return local61;
	}
}
