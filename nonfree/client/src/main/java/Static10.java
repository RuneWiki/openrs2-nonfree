import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
	public static int anInt246;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	public static int anInt245 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public static void method251() {
		@Pc(7) int local7 = Static273.anInt5328;
		@Pc(14) int local14 = Static82.anInt1780 - Static3.anInt122 - local7;
		@Pc(16) int local16 = Static98.anInt2312;
		@Pc(24) int local24 = Static179.anInt3754 - local16 - Static148.anInt3206;
		if (local7 <= 0 && local14 <= 0 && local16 <= 0 && local24 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static237.aFrame2 != null) {
				local43 = Static237.aFrame2;
			} else if (Static193.aFrame1 == null) {
				local43 = Static253.aClass175_4.anApplet1;
			} else {
				local43 = Static193.aFrame1;
			}
			@Pc(56) int local56 = 0;
			@Pc(58) int local58 = 0;
			if (local43 == Static193.aFrame1) {
				@Pc(65) Insets local65 = Static193.aFrame1.getInsets();
				local56 = local65.top;
				local58 = local65.left;
			}
			@Pc(74) Graphics local74 = local43.getGraphics();
			local74.setColor(Color.black);
			if (local7 > 0) {
				local74.fillRect(local58, local56, local7, Static179.anInt3754);
			}
			if (local16 > 0) {
				local74.fillRect(local58, local56, Static82.anInt1780, local16);
			}
			if (local14 > 0) {
				local74.fillRect(local58 + Static82.anInt1780 - local14, local56, local14, Static179.anInt3754);
			}
			if (local24 > 0) {
				local74.fillRect(local58, Static179.anInt3754 + local56 - local24, Static82.anInt1780, local24);
			}
		} catch (@Pc(130) Exception local130) {
		}
	}
}
