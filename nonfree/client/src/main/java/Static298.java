import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
	public static int anInt5370;

	@OriginalMember(owner = "client!om", name = "W", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_90 = new Class231("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!om", name = "X", descriptor = "I")
	public static int anInt5367 = 13156520;

	@OriginalMember(owner = "client!om", name = "bb", descriptor = "I")
	public static int anInt5371 = -2;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
	public static void method4275() {
		if (Static50.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static124.anInt2074;
		@Pc(10) int local10 = Static226.anInt3803;
		@Pc(18) int local18 = Static119.anInt2042 - Static49.anInt789 - local8;
		@Pc(26) int local26 = Static268.anInt4657 - Static344.anInt6105 - local10;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local26 <= 0) {
			return;
		}
		try {
			@Pc(42) Container local42;
			if (Static393.aFrame2 == null) {
				local42 = Static138.aClass194_2.anApplet1;
			} else {
				local42 = Static393.aFrame2;
			}
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (local42 == Static393.aFrame2) {
				@Pc(57) Insets local57 = Static393.aFrame2.getInsets();
				local49 = local57.left;
				local51 = local57.top;
			}
			@Pc(66) Graphics local66 = local42.getGraphics();
			local66.setColor(Color.black);
			if (local8 > 0) {
				local66.fillRect(local49, local51, local8, Static268.anInt4657);
			}
			if (local10 > 0) {
				local66.fillRect(local49, local51, Static119.anInt2042, local10);
			}
			if (local18 > 0) {
				local66.fillRect(local49 + Static119.anInt2042 - local18, local51, local18, Static268.anInt4657);
			}
			if (local26 > 0) {
				local66.fillRect(local49, local51 + Static268.anInt4657 - local26, Static119.anInt2042, local26);
				return;
			}
		} catch (@Pc(120) Exception local120) {
			return;
		}
	}
}
