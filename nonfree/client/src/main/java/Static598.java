import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!cl;")
	public static Class58 aClass58_9;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt9085 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public static void method7697() {
		if (Static702.aFrame3 != null) {
			return;
		}
		@Pc(11) int local11 = Static251.anInt3914;
		@Pc(13) int local13 = Static388.anInt5985;
		@Pc(21) int local21 = Static91.anInt2083 - local11 - Static681.anInt10652;
		@Pc(28) int local28 = Static342.anInt5491 - Static76.anInt1720 - local13;
		if (local11 <= 0 && local21 <= 0 && local13 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(56) Container local56;
			if (Static628.aFrame2 != null) {
				local56 = Static628.aFrame2;
			} else if (Static41.anApplet1 == null) {
				local56 = Static229.anApplet_Sub1_1;
			} else {
				local56 = Static41.anApplet1;
			}
			@Pc(70) int local70 = 0;
			@Pc(72) int local72 = 0;
			if (Static628.aFrame2 == local56) {
				@Pc(78) Insets local78 = Static628.aFrame2.getInsets();
				local70 = local78.left;
				local72 = local78.top;
			}
			@Pc(87) Graphics local87 = local56.getGraphics();
			local87.setColor(Color.black);
			if (local11 > 0) {
				local87.fillRect(local70, local72, local11, Static342.anInt5491);
			}
			if (local13 > 0) {
				local87.fillRect(local70, local72, Static91.anInt2083, local13);
			}
			if (local21 > 0) {
				local87.fillRect(Static91.anInt2083 + local70 - local21, local72, local21, Static342.anInt5491);
			}
			if (local28 > 0) {
				local87.fillRect(local70, local72 + Static342.anInt5491 - local28, Static91.anInt2083, local28);
				return;
			}
		} catch (@Pc(146) Exception local146) {
			return;
		}
	}
}
