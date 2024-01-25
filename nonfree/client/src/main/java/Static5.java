import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public static int anInt83;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int anInt88;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	public static int anInt86 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method91() {
		Static202.aClass191_1.method8967();
		Static7.aClass6_1.method7045();
		Static493.aClient1.method1455();
		Static641.aCanvas13.setBackground(Color.black);
		Static254.anInt4897 = -1;
		Static202.aClass191_1 = Static510.method7942(Static641.aCanvas13);
		Static7.aClass6_1 = Static597.method8972(Static641.aCanvas13);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method93(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
			local10 = arg0.charAt(local16) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[II[ILclient!lea;I)Lclient!bga;")
	public static Class1_Sub1 method95(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class101_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg2[local12] + local12 * arg4;
			for (@Pc(24) int local24 = 0; local24 < arg0[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class1_Sub1(arg3, arg4, arg1, local10);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method98() {
		@Pc(7) client local7 = Static493.aClient1;
		synchronized (Static493.aClient1) {
			if (Static102.aFrame2 == null) {
				@Pc(24) Container local24;
				if (Static46.aFrame1 != null) {
					local24 = Static46.aFrame1;
				} else if (Static637.anApplet2 == null) {
					local24 = Static172.anApplet_Sub1_1;
				} else {
					local24 = Static637.anApplet2;
				}
				Static97.anInt1735 = local24.getSize().width;
				Static360.anInt6884 = local24.getSize().height;
				@Pc(48) Insets local48;
				if (Static46.aFrame1 == local24) {
					local48 = Static46.aFrame1.getInsets();
					Static97.anInt1735 -= local48.right + local48.left;
					Static360.anInt6884 -= local48.top + local48.bottom;
				}
				if (Static255.method4444() == 1) {
					Static309.anInt5584 = 0;
					Static17.anInt8637 = (Static97.anInt1735 - Static26.anInt458) / 2;
					Static406.anInt7570 = Static26.anInt458;
					Static19.anInt352 = Static340.anInt6390;
				} else {
					Static432.method7063();
				}
				if (Static235.aClass37_5 != Static314.aClass37_6) {
					@Pc(97) boolean local97;
					if (Static406.anInt7570 < 1024 && Static19.anInt352 < 768) {
						local97 = true;
					} else {
						local97 = false;
					}
				}
				Static641.aCanvas13.setSize(Static406.anInt7570, Static19.anInt352);
				if (Static607.aClass101_15 != null) {
					if (Static450.aBoolean606) {
						Static606.method9086(Static641.aCanvas13);
					} else {
						Static607.aClass101_15.method8092(Static641.aCanvas13, Static406.anInt7570, Static19.anInt352);
					}
				}
				if (local24 == Static46.aFrame1) {
					local48 = Static46.aFrame1.getInsets();
					Static641.aCanvas13.setLocation(local48.left + Static17.anInt8637, Static309.anInt5584 + local48.top);
				} else {
					Static641.aCanvas13.setLocation(Static17.anInt8637, Static309.anInt5584);
				}
				if (Static567.anInt9844 != -1) {
					Static94.method1626(true);
				}
				Static510.method7943();
			}
		}
	}
}
