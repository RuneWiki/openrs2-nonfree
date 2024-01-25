import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt2338;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!vr;")
	public static Class112 aClass112_2;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!ra;")
	public static Class170 aClass170_48;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString147 = "purple:";

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[S")
	public static short[] aShortArray19 = new short[256];

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public static final int[] anIntArray142 = new int[500];

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method2185(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static114.method2255(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public static void method2186() {
		Static25.aClass66_3.method1933();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method2187() {
		if (Static30.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static269.anInt5158;
		@Pc(15) int local15 = Static312.anInt5960;
		@Pc(22) int local22 = Static9.anInt307 - Static17.anInt5991 - local8;
		@Pc(29) int local29 = Static275.anInt5385 - Static246.anInt4801 - local15;
		if (local8 <= 0 && local22 <= 0 && local15 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static168.aFrame2 == null) {
				local48 = Static202.aClass10_3.anApplet1;
			} else {
				local48 = Static168.aFrame2;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (Static168.aFrame2 == local48) {
				@Pc(62) Insets local62 = Static168.aFrame2.getInsets();
				local54 = local62.left;
				local56 = local62.top;
			}
			@Pc(71) Graphics local71 = local48.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static275.anInt5385);
			}
			if (local15 > 0) {
				local71.fillRect(local54, local56, Static9.anInt307, local15);
			}
			if (local22 > 0) {
				local71.fillRect(Static9.anInt307 + local54 - local22, local56, local22, Static275.anInt5385);
			}
			if (local29 > 0) {
				local71.fillRect(local54, local56 + Static275.anInt5385 - local29, Static9.anInt307, local29);
				return;
			}
		} catch (@Pc(123) Exception local123) {
			return;
		}
	}
}
