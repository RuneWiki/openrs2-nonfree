import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "[I")
	public static int[] anIntArray753;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_168 = new Class77(53, 6);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method5355() {
		if (Static363.aFrame4 != null) {
			return;
		}
		@Pc(8) int local8 = Static125.anInt2378;
		@Pc(10) int local10 = Static284.anInt5038;
		@Pc(17) int local17 = Static269.anInt4774 - Static335.anInt5875 - local8;
		@Pc(24) int local24 = Static388.anInt4032 - Static263.anInt4662 - local10;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local24 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static154.aFrame1 == null) {
				local43 = Static92.aClass53_2.anApplet1;
			} else {
				local43 = Static154.aFrame1;
			}
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (local43 == Static154.aFrame1) {
				@Pc(57) Insets local57 = Static154.aFrame1.getInsets();
				local49 = local57.left;
				local51 = local57.top;
			}
			@Pc(66) Graphics local66 = local43.getGraphics();
			local66.setColor(Color.black);
			if (local8 > 0) {
				local66.fillRect(local49, local51, local8, Static388.anInt4032);
			}
			if (local10 > 0) {
				local66.fillRect(local49, local51, Static269.anInt4774, local10);
			}
			if (local17 > 0) {
				local66.fillRect(Static269.anInt4774 + local49 - local17, local51, local17, Static388.anInt4032);
			}
			if (local24 > 0) {
				local66.fillRect(local49, local51 + Static388.anInt4032 - local24, Static269.anInt4774, local24);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public static void method5356() {
		Static322.method4957();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public static int method5359(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
