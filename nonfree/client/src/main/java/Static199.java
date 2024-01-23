import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_112;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!jb;")
	public static Class28 aClass28_70;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!vb;")
	public static Class120 aClass120_20 = new Class120();

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt4323 = -1;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	public static int anInt4324 = 0;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt4325 = 0;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1133 = Static231.method3737("Benutzen");

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1134 = Static231.method3737("Okay");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IZLjava/awt/Color;I)V")
	public static void method3192(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Color arg3) {
		try {
			@Pc(2) Graphics local2 = Static203.aCanvas3.getGraphics();
			if (Static26.aFont1 == null) {
				Static26.aFont1 = new Font("Helvetica", 1, 13);
				Static105.aFontMetrics1 = Static203.aCanvas3.getFontMetrics(Static26.aFont1);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static158.anInt3484, Static180.anInt4990);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static109.anImage3 == null) {
					Static109.anImage3 = Static203.aCanvas3.createImage(304, 34);
				}
				@Pc(50) Graphics local50 = Static109.anImage3.getGraphics();
				local50.setColor(arg3);
				local50.drawRect(0, 0, 303, 33);
				local50.fillRect(2, 2, arg1 * 3, 30);
				local50.setColor(Color.black);
				local50.drawRect(1, 1, 301, 31);
				local50.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local50.setFont(Static26.aFont1);
				local50.setColor(Color.white);
				arg0.method3115(local50, 22, (304 - arg0.method3107(Static105.aFontMetrics1)) / 2);
				local2.drawImage(Static109.anImage3, Static158.anInt3484 / 2 - 152, Static180.anInt4990 / 2 - 18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static158.anInt3484 / 2 - 152;
				@Pc(141) int local141 = Static180.anInt4990 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local135, local141, 303, 33);
				local2.fillRect(local135 + 2, local141 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local135 + 1, local141 - -1, 301, 31);
				local2.fillRect(arg1 * 3 + local135 + 2, local141 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static26.aFont1);
				local2.setColor(Color.white);
				arg0.method3115(local2, local141 + 22, (-arg0.method3107(Static105.aFontMetrics1) + 304) / 2 + local135);
			}
			if (Static171.aClass107_1009 != null) {
				local2.setFont(Static26.aFont1);
				local2.setColor(Color.white);
				Static171.aClass107_1009.method3115(local2, Static180.anInt4990 / 2 - 26, Static158.anInt3484 / 2 - Static171.aClass107_1009.method3107(Static105.aFontMetrics1) / 2);
			}
		} catch (@Pc(247) Exception local247) {
			Static203.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIBIIII)V")
	public static void method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(14) int local14 = arg3 - arg5;
		@Pc(23) boolean local23;
		if (Static92.anInt1986 > 0 && Static92.anInt1986 % 10 < 5) {
			local23 = true;
		} else {
			local23 = false;
		}
		@Pc(36) int local36 = 983040 / arg6;
		@Pc(40) int local40 = 983040 / arg1;
		for (@Pc(43) int local43 = -local40; local43 < local40 + local14; local43++) {
			@Pc(54) int local54 = local43 * arg1 >> 16;
			@Pc(64) int local64 = arg1 * (local43 + 1) >> 16;
			@Pc(69) int local69 = local64 - local54;
			if (local69 > 0) {
				local54 += arg7;
				@Pc(85) int local85 = arg5 + local43 >> 6;
				if (local85 >= 0 && Static223.anIntArrayArrayArray12.length - 1 >= local85) {
					@Pc(106) int[][] local106 = Static223.anIntArrayArrayArray12[local85];
					for (@Pc(109) int local109 = -local36; local109 < local10 + local36; local109++) {
						@Pc(120) int local120 = arg6 * local109 >> 16;
						@Pc(130) int local130 = (local109 + 1) * arg6 >> 16;
						@Pc(135) int local135 = local130 - local120;
						if (local135 > 0) {
							local120 += arg2;
							@Pc(147) int local147 = arg4 + local109 >> 6;
							if (local147 >= 0 && local147 <= local106.length - 1 && local106[local147] != null) {
								@Pc(182) int local182 = (arg5 + local43 & 0x3F) + ((arg4 + local109 & 0x3F) << 6);
								@Pc(188) int local188 = local106[local147][local182];
								if (local188 != 0) {
									@Pc(196) Class101 local196 = Static170.method2725(local188 - 1);
									if (local23 && Static34.anInt720 == local196.anInt3917) {
										@Pc(206) Class1_Sub25 local206 = new Class1_Sub25();
										local206.anInt3763 = local196.anInt3917;
										local206.anInt3755 = local120;
										local206.anInt3754 = local54;
										Static39.aClass120_4.method3567(local206);
									}
									Static160.aClass1_Sub2_Sub2_Sub1Array2[local196.anInt3917].method189(local54 - 7, local120 + -7);
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(253) Class1_Sub25 local253 = (Class1_Sub25) Static39.aClass120_4.method3564(); local253 != null; local253 = (Class1_Sub25) Static39.aClass120_4.method3561()) {
			Static160.aClass1_Sub2_Sub2_Sub1Array2[local253.anInt3763].method189(local253.anInt3754 - 7, local253.anInt3755 + -7);
			Static205.method3260(local253.anInt3754, local253.anInt3755, 15, 16776960, 128);
			Static205.method3260(local253.anInt3754, local253.anInt3755, 7, 16777215, 256);
		}
		Static39.aClass120_4.method3560();
	}
}
