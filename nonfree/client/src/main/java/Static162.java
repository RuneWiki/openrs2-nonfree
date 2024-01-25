import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public static int anInt3756;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_121 = new Class221(23, 10);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method3263() {
		if (Static229.aFrame3 != null) {
			return;
		}
		@Pc(8) int local8 = Static10.anInt185;
		@Pc(10) int local10 = Static177.anInt3977;
		@Pc(18) int local18 = Static286.anInt5753 - local8 - Static335.anInt6496;
		@Pc(29) int local29 = Static38.anInt556 - Static25.anInt396 - local10;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static291.aFrame4 == null) {
				local48 = Static62.aClass179_2.anApplet1;
			} else {
				local48 = Static291.aFrame4;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (local48 == Static291.aFrame4) {
				@Pc(62) Insets local62 = Static291.aFrame4.getInsets();
				local54 = local62.left;
				local56 = local62.top;
			}
			@Pc(71) Graphics local71 = local48.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static38.anInt556);
			}
			if (local10 > 0) {
				local71.fillRect(local54, local56, Static286.anInt5753, local10);
			}
			if (local18 > 0) {
				local71.fillRect(local54 + Static286.anInt5753 - local18, local56, local18, Static38.anInt556);
			}
			if (local29 > 0) {
				local71.fillRect(local54, Static38.anInt556 + local56 - local29, Static286.anInt5753, local29);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method3264(@OriginalArg(0) int arg0) {
		Static160.anInt3750 = -1;
		if (arg0 == 37) {
			Static202.aFloat49 = 3.0F;
		} else if (arg0 == 50) {
			Static202.aFloat49 = 4.0F;
		} else if (arg0 == 75) {
			Static202.aFloat49 = 6.0F;
		} else if (arg0 == 100) {
			Static202.aFloat49 = 8.0F;
		} else if (arg0 == 200) {
			Static202.aFloat49 = 16.0F;
		}
		Static160.anInt3750 = -1;
	}
}
