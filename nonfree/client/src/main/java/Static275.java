import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt5377;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public static int anInt5378;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!io;")
	public static final Class148 aClass148_8 = new Class148(15, 0, 1, 0);

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lclient!we;")
	public static final Class5_Sub51[] aClass5_Sub51Array1 = new Class5_Sub51[1024];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static final int[] anIntArray377 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method4502() {
		if (Static254.aFrame32 != null) {
			return;
		}
		@Pc(8) int local8 = Static186.anInt3583;
		@Pc(10) int local10 = Static10.anInt149;
		@Pc(22) int local22 = Static149.anInt3095 - Static383.anInt6994 - local8;
		@Pc(29) int local29 = Static295.anInt5920 - Static456.anInt7874 - local10;
		if (local8 <= 0 && local22 <= 0 && local10 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41;
			if (Static265.aFrame25 == null) {
				local41 = Static159.aClass9_10.anApplet1;
			} else {
				local41 = Static265.aFrame25;
			}
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (local41 == Static265.aFrame25) {
				@Pc(56) Insets local56 = Static265.aFrame25.getInsets();
				local48 = local56.left;
				local50 = local56.top;
			}
			@Pc(65) Graphics local65 = local41.getGraphics();
			local65.setColor(Color.black);
			if (local8 > 0) {
				local65.fillRect(local48, local50, local8, Static295.anInt5920);
			}
			if (local10 > 0) {
				local65.fillRect(local48, local50, Static149.anInt3095, local10);
			}
			if (local22 > 0) {
				local65.fillRect(Static149.anInt3095 + local48 - local22, local50, local22, Static295.anInt5920);
			}
			if (local29 > 0) {
				local65.fillRect(local48, Static295.anInt5920 + local50 - local29, Static149.anInt3095, local29);
				return;
			}
		} catch (@Pc(119) Exception local119) {
			return;
		}
	}
}
