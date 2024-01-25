import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	public static int anInt4449;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public static int anInt4451;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_141 = new Class186(31, 3);

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
	public static final int[] anIntArray368 = new int[50];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg6 == arg1 && arg5 == arg0 && arg7 == arg3 && arg2 == arg8) {
			Static262.method3577(arg4, arg6, arg5, arg8, arg7);
			return;
		}
		@Pc(44) int local44 = arg6;
		@Pc(46) int local46 = arg5;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg1 * 3;
		@Pc(62) int local62 = arg0 * 3;
		@Pc(66) int local66 = arg3 * 3;
		@Pc(70) int local70 = arg2 * 3;
		@Pc(80) int local80 = local58 + arg7 - local66 - arg6;
		@Pc(90) int local90 = arg8 + local62 - local70 - arg5;
		@Pc(100) int local100 = local66 + local50 - local58 - local58;
		@Pc(109) int local109 = local54 + local70 - local62 - local62;
		@Pc(114) int local114 = local58 - local50;
		@Pc(119) int local119 = local62 - local54;
		for (@Pc(121) int local121 = 128; local121 <= 4096; local121 += 128) {
			@Pc(129) int local129 = local121 * local121 >> 12;
			@Pc(135) int local135 = local121 * local129 >> 12;
			@Pc(139) int local139 = local135 * local80;
			@Pc(143) int local143 = local135 * local90;
			@Pc(147) int local147 = local129 * local100;
			@Pc(151) int local151 = local129 * local109;
			@Pc(155) int local155 = local121 * local114;
			@Pc(159) int local159 = local121 * local119;
			@Pc(169) int local169 = (local139 + local147 + local155 >> 12) + arg6;
			@Pc(180) int local180 = arg5 + (local159 + local151 + local143 >> 12);
			Static262.method3577(arg4, local44, local46, local180, local169);
			local46 = local180;
			local44 = local169;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method3362() {
		if (Static269.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static353.anInt6357;
		@Pc(10) int local10 = Static76.anInt1789;
		@Pc(17) int local17 = Static290.anInt5237 - local8 - Static87.anInt1948;
		@Pc(30) int local30 = Static274.anInt4847 - Static349.anInt6303 - local10;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static373.aFrame2 == null) {
				local49 = Static89.aClass114_3.anApplet1;
			} else {
				local49 = Static373.aFrame2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (Static373.aFrame2 == local49) {
				@Pc(63) Insets local63 = Static373.aFrame2.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local49.getGraphics();
			local72.setColor(Color.black);
			if (local8 > 0) {
				local72.fillRect(local55, local57, local8, Static274.anInt4847);
			}
			if (local10 > 0) {
				local72.fillRect(local55, local57, Static290.anInt5237, local10);
			}
			if (local17 > 0) {
				local72.fillRect(Static290.anInt5237 + local55 - local17, local57, local17, Static274.anInt4847);
			}
			if (local30 > 0) {
				local72.fillRect(local55, local57 + Static274.anInt4847 - local30, Static290.anInt5237, local30);
				return;
			}
		} catch (@Pc(120) Exception local120) {
			return;
		}
	}
}
