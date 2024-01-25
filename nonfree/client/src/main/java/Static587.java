import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lclient!ke;")
	public static Class196 aClass196_296;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public static void method8002() {
		if (Static518.aFrame4 != null) {
			return;
		}
		@Pc(8) int local8 = Static10.anInt176;
		@Pc(10) int local10 = Static415.anInt7087;
		@Pc(17) int local17 = Static197.anInt3210 - Static563.anInt9176 - local8;
		@Pc(23) int local23 = Static267.anInt4239 - Static316.anInt8165 - local10;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local23 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41;
			if (Static634.aFrame5 != null) {
				local41 = Static634.aFrame5;
			} else if (Static285.anApplet5 == null) {
				local41 = Static279.anApplet_Sub1_1;
			} else {
				local41 = Static285.anApplet5;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (local41 == Static634.aFrame5) {
				@Pc(59) Insets local59 = Static634.aFrame5.getInsets();
				local53 = local59.top;
				local51 = local59.left;
			}
			@Pc(68) Graphics local68 = local41.getGraphics();
			local68.setColor(Color.black);
			if (local8 > 0) {
				local68.fillRect(local51, local53, local8, Static267.anInt4239);
			}
			if (local10 > 0) {
				local68.fillRect(local51, local53, Static197.anInt3210, local10);
			}
			if (local17 > 0) {
				local68.fillRect(Static197.anInt3210 + local51 - local17, local53, local17, Static267.anInt4239);
			}
			if (local23 > 0) {
				local68.fillRect(local51, local53 + Static267.anInt4239 - local23, Static197.anInt3210, local23);
				return;
			}
		} catch (@Pc(124) Exception local124) {
			return;
		}
	}
}
