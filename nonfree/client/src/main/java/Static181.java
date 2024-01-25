import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt3228;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public static int anInt3227 = -1;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_58 = new Class337(115, 6);

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public static int anInt3232 = -1;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public static int anInt3236 = -1;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
	public static void method2785() {
		if (Static323.aFrame2 != null) {
			return;
		}
		@Pc(10) int local10 = Static246.anInt4491;
		@Pc(12) int local12 = Static147.anInt2574;
		@Pc(19) int local19 = Static312.anInt10525 - Static345.anInt5827 - local10;
		@Pc(26) int local26 = Static28.anInt359 - Static408.anInt7118 - local12;
		if (local10 <= 0 && local19 <= 0 && local12 <= 0 && local26 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static190.aFrame1 != null) {
				local48 = Static190.aFrame1;
			} else if (Static7.anApplet1 == null) {
				local48 = Static580.anApplet_Sub1_1;
			} else {
				local48 = Static7.anApplet1;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local48 == Static190.aFrame1) {
				@Pc(66) Insets local66 = Static190.aFrame1.getInsets();
				local60 = local66.top;
				local58 = local66.left;
			}
			@Pc(75) Graphics local75 = local48.getGraphics();
			local75.setColor(Color.black);
			if (local10 > 0) {
				local75.fillRect(local58, local60, local10, Static28.anInt359);
			}
			if (local12 > 0) {
				local75.fillRect(local58, local60, Static312.anInt10525, local12);
			}
			if (local19 > 0) {
				local75.fillRect(Static312.anInt10525 + local58 - local19, local60, local19, Static28.anInt359);
			}
			if (local26 > 0) {
				local75.fillRect(local58, Static28.anInt359 + local60 - local26, Static312.anInt10525, local26);
				return;
			}
		} catch (@Pc(128) Exception local128) {
			return;
		}
	}
}
