import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_83 = new Class96("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_126 = new Class151(260);

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
	public static final int[] anIntArray381 = new int[2];

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[I")
	public static final int[] anIntArray382 = new int[50];

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
	public static final int[] anIntArray383 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method4092() {
		if (Static432.aFrame2 != null) {
			return;
		}
		@Pc(13) int local13 = Static128.anInt2407;
		@Pc(15) int local15 = Static83.anInt4881;
		@Pc(22) int local22 = Static90.anInt1737 - local13 - Static403.anInt7142;
		@Pc(29) int local29 = Static356.anInt6526 - Static324.anInt5725 - local15;
		if (local13 <= 0 && local22 <= 0 && local15 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41;
			if (Static303.aFrame1 == null) {
				local41 = Static403.aClass42_6.anApplet1;
			} else {
				local41 = Static303.aFrame1;
			}
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (local41 == Static303.aFrame1) {
				@Pc(56) Insets local56 = Static303.aFrame1.getInsets();
				local50 = local56.top;
				local48 = local56.left;
			}
			@Pc(65) Graphics local65 = local41.getGraphics();
			local65.setColor(Color.black);
			if (local13 > 0) {
				local65.fillRect(local48, local50, local13, Static356.anInt6526);
			}
			if (local15 > 0) {
				local65.fillRect(local48, local50, Static90.anInt1737, local15);
			}
			if (local22 > 0) {
				local65.fillRect(Static90.anInt1737 + local48 - local22, local50, local22, Static356.anInt6526);
			}
			if (local29 > 0) {
				local65.fillRect(local48, local50 + Static356.anInt6526 - local29, Static90.anInt1737, local29);
				return;
			}
		} catch (@Pc(116) Exception local116) {
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method4093() {
		@Pc(7) Class110 local7 = null;
		try {
			@Pc(12) Class159 local12 = Static403.aClass42_6.method661("2");
			while (local12.anInt4271 == 0) {
				Static366.method5214(1L);
			}
			if (local12.anInt4271 == 1) {
				local7 = (Class110) local12.anObject8;
				@Pc(39) byte[] local39 = new byte[(int) local7.method2360()];
				@Pc(53) int local53;
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41 += local53) {
					local53 = local7.method2359(local39, local41, local39.length - local41);
					if (local53 == -1) {
						throw new IOException("EOF");
					}
				}
				Static173.method2760(new Class1_Sub14(local39));
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local7 != null) {
				local7.method2357();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}
}
