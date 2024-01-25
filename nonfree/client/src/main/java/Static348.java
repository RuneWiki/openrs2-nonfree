import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rn", name = "N", descriptor = "Lclient!pj;")
	public static Class182 aClass182_4;

	@OriginalMember(owner = "client!rn", name = "Q", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_42 = new Class183();

	@OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
	public static int anInt5976 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)I")
	public static int method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static50.anIntArray50[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method4696(@OriginalArg(1) Class19 arg0) {
		if (Static234.aBoolean411) {
			Static149.method2554(arg0);
		} else {
			Static17.method177(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	public static void method4697() {
		if (Static320.aFrame3 != null) {
			return;
		}
		@Pc(16) int local16 = Static230.anInt4424;
		@Pc(18) int local18 = Static303.anInt5363;
		@Pc(25) int local25 = Static425.anInt7000 - Static141.anInt2881 - local16;
		@Pc(33) int local33 = Static17.anInt222 - local18 - Static302.anInt5346;
		if (local16 <= 0 && local25 <= 0 && local18 <= 0 && local33 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static226.aFrame1 == null) {
				local49 = Static206.aClass66_4.anApplet1;
			} else {
				local49 = Static226.aFrame1;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (Static226.aFrame1 == local49) {
				@Pc(63) Insets local63 = Static226.aFrame1.getInsets();
				local55 = local63.left;
				local57 = local63.top;
			}
			@Pc(72) Graphics local72 = local49.getGraphics();
			local72.setColor(Color.black);
			if (local16 > 0) {
				local72.fillRect(local55, local57, local16, Static17.anInt222);
			}
			if (local18 > 0) {
				local72.fillRect(local55, local57, Static425.anInt7000, local18);
			}
			if (local25 > 0) {
				local72.fillRect(Static425.anInt7000 + local55 - local25, local57, local25, Static17.anInt222);
			}
			if (local33 > 0) {
				local72.fillRect(local55, local57 + Static17.anInt222 - local33, Static425.anInt7000, local33);
				return;
			}
		} catch (@Pc(125) Exception local125) {
			return;
		}
	}
}
