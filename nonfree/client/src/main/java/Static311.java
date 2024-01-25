import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mw", name = "J", descriptor = "Lclient!ra;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	public static void method5393() {
		if (Static189.aFrame1 != null) {
			return;
		}
		@Pc(11) int local11 = Static410.anInt7609;
		@Pc(13) int local13 = Static466.anInt8038;
		@Pc(21) int local21 = Static204.anInt4066 - local11 - Static70.anInt1753;
		@Pc(28) int local28 = Static199.anInt1460 - Static508.anInt8910 - local13;
		if (local11 <= 0 && local21 <= 0 && local13 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static306.aFrame2 == null) {
				local47 = Static473.aClass229_14.anApplet1;
			} else {
				local47 = Static306.aFrame2;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (local47 == Static306.aFrame2) {
				@Pc(61) Insets local61 = Static306.aFrame2.getInsets();
				local55 = local61.top;
				local53 = local61.left;
			}
			@Pc(70) Graphics local70 = local47.getGraphics();
			local70.setColor(Color.black);
			if (local11 > 0) {
				local70.fillRect(local53, local55, local11, Static199.anInt1460);
			}
			if (local13 > 0) {
				local70.fillRect(local53, local55, Static204.anInt4066, local13);
			}
			if (local21 > 0) {
				local70.fillRect(local53 + Static204.anInt4066 - local21, local55, local21, Static199.anInt1460);
			}
			if (local28 > 0) {
				local70.fillRect(local53, Static199.anInt1460 + local55 - local28, Static204.anInt4066, local28);
				return;
			}
		} catch (@Pc(127) Exception local127) {
			return;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)Z")
	public static boolean method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static373.method6001(arg1, arg0) & Static461.method7928(arg1, arg0);
	}
}
