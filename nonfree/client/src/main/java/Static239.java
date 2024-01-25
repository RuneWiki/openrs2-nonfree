import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!ka;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
	public static boolean aBoolean310;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_73 = new Class287(75, 16);

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!raa;")
	public static final Class277 aClass277_1 = new Class277();

	@OriginalMember(owner = "client!j", name = "k", descriptor = "[I")
	public static final int[] anIntArray224 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)V")
	public static void method3809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub7_Sub19 local16 = Static73.method5992(7, arg1);
		local16.method7363();
		local16.anInt9381 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method3810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method3812() {
		if (Static178.aFrame3 != null) {
			return;
		}
		@Pc(10) int local10 = Static537.anInt9359;
		@Pc(12) int local12 = Static490.anInt8427;
		@Pc(27) int local27 = Static483.anInt8361 - Static34.anInt3201 - local10;
		@Pc(35) int local35 = Static429.anInt7984 - Static492.anInt8445 - local12;
		if (local10 <= 0 && local27 <= 0 && local12 <= 0 && local35 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static302.aFrame2 != null) {
				local50 = Static302.aFrame2;
			} else if (Static304.anApplet1 == null) {
				local50 = Static350.anApplet_Sub1_1;
			} else {
				local50 = Static304.anApplet1;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (local50 == Static302.aFrame2) {
				@Pc(70) Insets local70 = Static302.aFrame2.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local50.getGraphics();
			local79.setColor(Color.black);
			if (local10 > 0) {
				local79.fillRect(local62, local64, local10, Static429.anInt7984);
			}
			if (local12 > 0) {
				local79.fillRect(local62, local64, Static483.anInt8361, local12);
			}
			if (local27 > 0) {
				local79.fillRect(local62 + Static483.anInt8361 - local27, local64, local27, Static429.anInt7984);
			}
			if (local35 > 0) {
				local79.fillRect(local62, Static429.anInt7984 + local64 - local35, Static483.anInt8361, local35);
				return;
			}
		} catch (@Pc(133) Exception local133) {
			return;
		}
	}
}
