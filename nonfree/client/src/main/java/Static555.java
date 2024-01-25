import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	public static int anInt8749 = 0;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_40 = new Class306(8);

	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	public static int anInt8761 = -1;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_183 = new Class156(15, -1);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)Lclient!vb;")
	public static Class371 method7517(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static491.aFloat23 == 3.0D) {
				return Static592.aClass371_12;
			}
			if ((double) Static491.aFloat23 == 4.0D) {
				return Static505.aClass371_10;
			}
			if ((double) Static491.aFloat23 == 6.0D) {
				return Static512.aClass371_11;
			}
			if ((double) Static491.aFloat23 >= 8.0D) {
				return Static647.aClass371_15;
			}
		} else if (arg0 == 1) {
			if ((double) Static491.aFloat23 == 3.0D) {
				return Static512.aClass371_11;
			}
			if ((double) Static491.aFloat23 == 4.0D) {
				return Static647.aClass371_15;
			}
			if ((double) Static491.aFloat23 == 6.0D) {
				return Static439.aClass371_9;
			}
			if ((double) Static491.aFloat23 >= 8.0D) {
				return Static286.aClass371_14;
			}
		} else if (arg0 == 2) {
			if ((double) Static491.aFloat23 == 3.0D) {
				return Static439.aClass371_9;
			}
			if ((double) Static491.aFloat23 == 4.0D) {
				return Static286.aClass371_14;
			}
			if ((double) Static491.aFloat23 == 6.0D) {
				return Static158.aClass371_5;
			}
			if ((double) Static491.aFloat23 >= 8.0D) {
				return Static680.aClass371_16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	public static void method7518() {
		@Pc(7) client local7 = Static189.aClient1;
		synchronized (Static189.aClient1) {
			if (Static95.aFrame1 == null) {
				@Pc(22) Container local22;
				if (Static207.aFrame2 != null) {
					local22 = Static207.aFrame2;
				} else if (Static265.anApplet2 == null) {
					local22 = Static597.anApplet_Sub1_1;
				} else {
					local22 = Static265.anApplet2;
				}
				Static166.anInt3250 = local22.getSize().width;
				Static249.anInt4342 = local22.getSize().height;
				@Pc(44) Insets local44;
				if (local22 == Static207.aFrame2) {
					local44 = Static207.aFrame2.getInsets();
					Static166.anInt3250 -= local44.left + local44.right;
					Static249.anInt4342 -= local44.bottom + local44.top;
				}
				if (Static260.method4249() == 1) {
					Static517.anInt8215 = 0;
					Static85.anInt9921 = Static592.anInt9548;
					Static256.anInt4629 = Static401.anInt6745;
					Static304.anInt5288 = (Static166.anInt3250 - Static592.anInt9548) / 2;
				} else {
					Static37.method8306();
				}
				if (Static670.aClass242_7 != Static387.aClass242_8) {
					@Pc(104) boolean local104;
					if (Static85.anInt9921 < 1024 && Static256.anInt4629 < 768) {
						local104 = true;
					} else {
						local104 = false;
					}
				}
				Static357.aCanvas8.setSize(Static85.anInt9921, Static256.anInt4629);
				if (Static273.aClass100_6 != null) {
					if (Static377.aBoolean419) {
						Static553.method7513(Static357.aCanvas8);
					} else {
						Static273.aClass100_6.method8614(Static357.aCanvas8, Static85.anInt9921, Static256.anInt4629);
					}
				}
				if (local22 == Static207.aFrame2) {
					local44 = Static207.aFrame2.getInsets();
					Static357.aCanvas8.setLocation(Static304.anInt5288 + local44.left, local44.top + Static517.anInt8215);
				} else {
					Static357.aCanvas8.setLocation(Static304.anInt5288, Static517.anInt8215);
				}
				if (Static381.anInt6411 != -1) {
					Static417.method6129(true);
				}
				Static285.method4554();
			}
		}
	}
}
