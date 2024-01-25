import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
	public static int anInt9054;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_52 = new Class271();

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "[Lclient!ol;")
	public static final Class2_Sub8[] aClass2_Sub8Array1 = new Class2_Sub8[2048];

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16];

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "[I")
	public static final int[] anIntArray457 = new int[2];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!kc;")
	public static Class191 method7942(@OriginalArg(0) Component arg0) {
		return new Class191_Sub1(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
	public static void method7943() {
		if (Static102.aFrame2 != null) {
			return;
		}
		@Pc(10) int local10 = Static17.anInt8637;
		@Pc(12) int local12 = Static309.anInt5584;
		@Pc(19) int local19 = Static97.anInt1735 - local10 - Static406.anInt7570;
		@Pc(32) int local32 = Static360.anInt6884 - local12 - Static19.anInt352;
		if (local10 <= 0 && local19 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(55) Container local55;
			if (Static46.aFrame1 != null) {
				local55 = Static46.aFrame1;
			} else if (Static637.anApplet2 == null) {
				local55 = Static172.anApplet_Sub1_1;
			} else {
				local55 = Static637.anApplet2;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (Static46.aFrame1 == local55) {
				@Pc(73) Insets local73 = Static46.aFrame1.getInsets();
				local65 = local73.left;
				local67 = local73.top;
			}
			@Pc(82) Graphics local82 = local55.getGraphics();
			local82.setColor(Color.black);
			if (local10 > 0) {
				local82.fillRect(local65, local67, local10, Static360.anInt6884);
			}
			if (local12 > 0) {
				local82.fillRect(local65, local67, Static97.anInt1735, local12);
			}
			if (local19 > 0) {
				local82.fillRect(Static97.anInt1735 + local65 - local19, local67, local19, Static360.anInt6884);
			}
			if (local32 > 0) {
				local82.fillRect(local65, local67 + Static360.anInt6884 - local32, Static97.anInt1735, local32);
				return;
			}
		} catch (@Pc(136) Exception local136) {
			return;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method7945(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}
}
