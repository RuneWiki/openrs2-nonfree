import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_154 = new Class73(63, 7);

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_155 = new Class73(90, 10);

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_98 = new Class185(55, 7);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([Lclient!gg;II)V")
	public static void method7237(@OriginalArg(0) Class9_Sub4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub4 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10359;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10359 < local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub4 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7237(arg0, arg1, local10 - 1);
		method7237(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;I)V")
	public static void method7241(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4) {
		try {
			@Pc(6) Graphics local6 = Static428.aCanvas12.getGraphics();
			if (Static108.aFont1 == null) {
				Static108.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static7.anImage1 == null) {
					Static7.anImage1 = Static428.aCanvas12.createImage(Static294.anInt6026, Static277.anInt5899);
				}
				@Pc(52) Graphics local52 = Static7.anImage1.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static294.anInt6026, Static277.anInt5899);
				local67 = Static294.anInt6026 / 2 - 152;
				@Pc(73) int local73 = Static277.anInt5899 / 2 - 18;
				local52.setColor(arg1);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg2);
				local52.fillRect(local67 + 2, local73 + 2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(local67 + arg0 * 3 + 2, local73 + 2, 300 - arg0 * 3, 30);
				local52.setFont(Static108.aFont1);
				local52.setColor(arg3);
				local52.drawString(arg4, local67 + (304 - arg4.length() * 6) / 2, local73 - -22);
				if (Static467.aString85 != null) {
					local52.setFont(Static108.aFont1);
					local52.setColor(arg3);
					local52.drawString(Static467.aString85, Static294.anInt6026 / 2 - Static467.aString85.length() * 6 / 2, Static277.anInt5899 / 2 - 26);
				}
				local6.drawImage(Static7.anImage1, 0, 0, (ImageObserver) null);
			} catch (@Pc(193) Exception local193) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static294.anInt6026, Static277.anInt5899);
				@Pc(208) int local208 = Static294.anInt6026 / 2 - 152;
				local67 = Static277.anInt5899 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local208, local67, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local208 + 2, local67 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local208 + 1, local67 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local208 + 2, local67 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static108.aFont1);
				local6.setColor(arg3);
				if (Static467.aString85 != null) {
					local6.setFont(Static108.aFont1);
					local6.setColor(arg3);
					local6.drawString(Static467.aString85, Static294.anInt6026 / 2 - Static467.aString85.length() * 6 / 2, Static277.anInt5899 / 2 + -26);
				}
				local6.drawString(arg4, local208 + (304 - arg4.length() * 6) / 2, local67 - -22);
			}
		} catch (@Pc(323) Exception local323) {
			Static428.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!jha;IZLclient!jha;ZII)I")
	public static int method7242(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class67_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = Static370.method5895(arg4, arg0, arg1, arg2);
		if (local12 != 0) {
			return arg1 ? -local12 : local12;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(46) int local46 = Static370.method5895(arg5, arg0, arg3, arg2);
			return arg3 ? -local46 : local46;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIILclient!ka;Lclient!oia;)V")
	public static void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92 arg3, @OriginalArg(5) Class243 arg4) {
		if (arg3 != null) {
			arg4.method6335(arg1, arg3.RA(), arg3.na(), arg3.fa(), arg3.V(), arg2, arg3.G(), arg3.HA(), arg3.EA(), arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZIIIII)V")
	public static void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg3 < 0 || Static306.anInt6176 - 1 <= arg2 || Static108.anInt2930 - 1 <= arg3) {
			return;
		}
		if (Static26.aClass186ArrayArrayArray1 == null) {
			return;
		}
		@Pc(59) Interface22 local59;
		if (arg6 != 0) {
			if (arg6 != 1) {
				if (arg6 == 2) {
					local59 = (Interface22) Static173.method3262(arg4, arg2, arg3, rl.class);
					if (local59 == null) {
						return;
					}
					if (arg0 == 11) {
						arg0 = 10;
					}
					if (local59 instanceof Class9_Sub4_Sub2_Sub5) {
						((Class9_Sub4_Sub2_Sub5) local59).aClass363_4.method8379(arg5);
						return;
					}
					Static49.method1564(local59.method8436(), arg3, arg6, arg1, arg4, arg2, arg5, arg0);
				} else if (arg6 == 3) {
					local59 = (Interface22) Static446.method6808(arg4, arg2, arg3);
					if (local59 != null) {
						if (!(local59 instanceof Class9_Sub4_Sub3_Sub2)) {
							Static49.method1564(local59.method8436(), arg3, arg6, arg1, arg4, arg2, arg5, arg0);
							return;
						}
						((Class9_Sub4_Sub3_Sub2) local59).aClass363_2.method8379(arg5);
						return;
					}
				}
				return;
			}
			local59 = (Interface22) Static181.method3396(arg4, arg2, arg3);
			if (local59 != null) {
				if (!(local59 instanceof Class9_Sub4_Sub1_Sub1)) {
					@Pc(145) int local145 = local59.method8436();
					if (arg0 != 4 && arg0 != 5) {
						if (arg0 != 6) {
							if (arg0 == 7) {
								Static49.method1564(local145, arg3, arg6, (arg1 + 2 & 0x3) + 4, arg4, arg2, arg5, 4);
							} else if (arg0 == 8) {
								Static49.method1564(local145, arg3, arg6, arg1 + 4, arg4, arg2, arg5, 4);
								Static49.method1564(local145, arg3, arg6, (arg1 + 2 & 0x3) + 4, arg4, arg2, arg5, 4);
								return;
							}
							return;
						}
						Static49.method1564(local145, arg3, arg6, arg1 + 4, arg4, arg2, arg5, 4);
						return;
					}
					Static49.method1564(local145, arg3, arg6, arg1, arg4, arg2, arg5, 4);
					return;
				}
				((Class9_Sub4_Sub1_Sub1) local59).aClass363_1.method8379(arg5);
				return;
			}
			return;
		}
		local59 = (Interface22) Static37.method1328(arg4, arg2, arg3);
		@Pc(257) Interface22 local257 = (Interface22) Static373.method5920(arg4, arg2, arg3);
		if (local59 != null && arg0 != 2) {
			if (local59 instanceof Class9_Sub4_Sub5_Sub1) {
				((Class9_Sub4_Sub5_Sub1) local59).aClass363_3.method8379(arg5);
			} else {
				Static49.method1564(local59.method8436(), arg3, arg6, arg1, arg4, arg2, arg5, arg0);
			}
		}
		if (local257 == null) {
			return;
		}
		if (!(local257 instanceof Class9_Sub4_Sub5_Sub1)) {
			Static49.method1564(local257.method8436(), arg3, arg6, arg1, arg4, arg2, arg5, arg0);
			return;
		}
		((Class9_Sub4_Sub5_Sub1) local257).aClass363_3.method8379(arg5);
		return;
	}
}
