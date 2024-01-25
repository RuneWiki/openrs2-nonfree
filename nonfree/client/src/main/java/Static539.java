import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "Lclient!hd;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public static int anInt8860 = 0;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!au;")
	public static final Class21 aClass21_87 = new Class21(4);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public static void method7062() {
		if (Static43.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static8.anInt227;
		@Pc(12) int local12 = Static107.anInt1866;
		@Pc(24) int local24 = Static441.anInt7086 - local10 - Static172.anInt2621;
		@Pc(32) int local32 = Static222.anInt3250 - Static187.anInt8962 - local12;
		if (local10 <= 0 && local24 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static223.aFrame2 != null) {
				local49 = Static223.aFrame2;
			} else if (Static195.anApplet4 == null) {
				local49 = Static414.anApplet_Sub1_1;
			} else {
				local49 = Static195.anApplet4;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (Static223.aFrame2 == local49) {
				@Pc(67) Insets local67 = Static223.aFrame2.getInsets();
				local61 = local67.top;
				local59 = local67.left;
			}
			@Pc(76) Graphics local76 = local49.getGraphics();
			local76.setColor(Color.black);
			if (local10 > 0) {
				local76.fillRect(local59, local61, local10, Static222.anInt3250);
			}
			if (local12 > 0) {
				local76.fillRect(local59, local61, Static441.anInt7086, local12);
			}
			if (local24 > 0) {
				local76.fillRect(local59 + Static441.anInt7086 - local24, local61, local24, Static222.anInt3250);
			}
			if (local32 > 0) {
				local76.fillRect(local59, local61 + Static222.anInt3250 - local32, Static441.anInt7086, local32);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public static void method7064() {
		if (Static573.aClass264_1 != null) {
			Static573.aClass264_1.method5518();
		}
		if (Static55.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static55.aThread1.join();
				return;
			} catch (@Pc(17) InterruptedException local17) {
			}
		}
	}
}
