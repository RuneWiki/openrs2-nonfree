import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array8;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!rc;")
	public static Class66 aClass66_18 = new Class66(30);

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1037 = Static8.method128("0(U");

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt4056 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method2775() {
		if (Static47.aClass25_11 != null) {
			Static47.aClass25_11.method1566();
		}
		if (Static177.aClass25_12 != null) {
			Static177.aClass25_12.method1566();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)V")
	public static void method2776(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static20.anInt570; local16++) {
			if (Static146.aLongArray5[local16] == arg0) {
				Static20.anInt570--;
				for (@Pc(34) int local34 = local16; local34 < Static20.anInt570; local34++) {
					Static142.aClass18Array20[local34] = Static142.aClass18Array20[local34 + 1];
					Static20.anIntArray43[local34] = Static20.anIntArray43[local34 + 1];
					Static146.aLongArray5[local34] = Static146.aLongArray5[local34 + 1];
					Static156.anIntArray394[local34] = Static156.anIntArray394[local34 + 1];
				}
				Static159.anInt4381 = Static167.anInt4526;
				Static95.aClass1_Sub6_Sub1_1.method555(122);
				Static95.aClass1_Sub6_Sub1_1.method515(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method2777() {
		aClass1_Sub1_Sub8_Sub3Array8 = null;
		aClass66_18 = null;
		aClass18_1037 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ea;Ljava/awt/Color;II)V")
	public static void method2778(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static46.aCanvas38.getGraphics();
			if (Static180.aFont1 == null) {
				Static180.aFont1 = new Font("Helvetica", 1, 13);
				Static177.aFontMetrics1 = Static46.aCanvas38.getFontMetrics(Static180.aFont1);
			}
			if (Static10.aBoolean10) {
				Static10.aBoolean10 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static152.anInt4190, Static101.anInt3026);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static38.anImage3 == null) {
					Static38.anImage3 = Static46.aCanvas38.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static38.anImage3.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static180.aFont1);
				local47.setColor(Color.white);
				arg0.method755(local47, (304 - arg0.method749(Static177.aFontMetrics1)) / 2, 22);
				local2.drawImage(Static38.anImage3, Static152.anInt4190 / 2 - 152, Static101.anInt3026 / 2 + -18, null);
			} catch (@Pc(127) Exception local127) {
				@Pc(133) int local133 = Static152.anInt4190 / 2 - 152;
				@Pc(139) int local139 = Static101.anInt3026 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local133, local139, 303, 33);
				local2.fillRect(local133 + 2, local139 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local133 + 1, local139 - -1, 301, 31);
				local2.fillRect(local133 + arg2 * 3 + 2, local139 - -2, 300 - arg2 * 3, 30);
				local2.setFont(Static180.aFont1);
				local2.setColor(Color.white);
				arg0.method755(local2, (304 - arg0.method749(Static177.aFontMetrics1)) / 2 + local133, local139 + 22);
			}
		} catch (@Pc(221) Exception local221) {
			Static46.aCanvas38.repaint();
		}
	}
}
