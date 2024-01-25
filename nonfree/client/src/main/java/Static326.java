import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
	public static final int[] anIntArray624 = new int[25];

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_149 = new Class55("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_163 = new Class253(65, -1);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ok;Z)V")
	public static void method5716(@OriginalArg(0) Class178 arg0) {
		Static205.anInt3626 = 0;
		Static181.anInt3255 = 0;
		Static14.aClass169_1 = new Class169();
		Static57.aClass28_Sub1_Sub1_Sub1Array1 = new Class28_Sub1_Sub1_Sub1[1024];
		Static452.method5748(arg0);
		Static123.method2020(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	public static void method5717() {
		@Pc(7) Class266 local7 = null;
		try {
			@Pc(13) Class236 local13 = Static230.aClass61_4.method1456("2", true);
			while (local13.anInt6178 == 0) {
				Static214.method2089(1L);
			}
			if (local13.anInt6178 == 1) {
				local7 = (Class266) local13.anObject8;
				@Pc(35) byte[] local35 = new byte[(int) local7.method5673()];
				@Pc(50) int local50;
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37 += local50) {
					local50 = local7.method5677(local37, local35, local35.length - local37);
					if (local50 == -1) {
						throw new IOException("EOF");
					}
				}
				Static320.method4222(new Class7_Sub14(local35));
			}
		} catch (@Pc(78) Exception local78) {
		}
		try {
			if (local7 != null) {
				local7.method5674();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
	public static void method5718() {
		if (Static145.aFrame4 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static452.aFrame5 == null) {
			local13 = Static230.aClass61_4.anApplet1;
		} else {
			local13 = Static452.aFrame5;
		}
		Static382.anInt6127 = local13.getSize().width;
		Static439.anInt7322 = local13.getSize().height;
		@Pc(38) Insets local38;
		if (Static452.aFrame5 == local13) {
			local38 = Static452.aFrame5.getInsets();
			Static382.anInt6127 -= local38.right + local38.left;
			Static439.anInt7322 -= local38.top + local38.bottom;
		}
		if (Static120.method1994() == 1) {
			Static148.anInt2796 = (Static382.anInt6127 - Static448.anInt7377) / 2;
			Static251.anInt4258 = Static448.anInt7377;
			Static445.anInt1110 = 0;
			Static286.anInt4051 = Static81.anInt1634;
		} else if (Static268.anInt4537 < 96 && Static377.anInt6113 == 0) {
			@Pc(87) int local87 = Static382.anInt6127 > 1024 ? 1024 : Static382.anInt6127;
			Static251.anInt4258 = local87;
			@Pc(98) int local98 = Static439.anInt7322 > 768 ? 768 : Static439.anInt7322;
			Static148.anInt2796 = (Static382.anInt6127 - local87) / 2;
			Static286.anInt4051 = local98;
			Static445.anInt1110 = 0;
		} else {
			Static251.anInt4258 = Static382.anInt6127;
			Static286.anInt4051 = Static439.anInt7322;
			Static445.anInt1110 = 0;
			Static148.anInt2796 = 0;
		}
		if (Static167.aClass136_5 != Static313.aClass136_7) {
			@Pc(133) boolean local133;
			if (Static251.anInt4258 < 1024 && Static286.anInt4051 < 768) {
				local133 = true;
			} else {
				local133 = false;
			}
		}
		Static95.aCanvas3.setSize(Static251.anInt4258, Static286.anInt4051);
		if (Static269.aClass51_9 != null) {
			Static269.aClass51_9.method5309(Static95.aCanvas3);
		}
		if (local13 == Static452.aFrame5) {
			local38 = Static452.aFrame5.getInsets();
			Static95.aCanvas3.setLocation(Static148.anInt2796 + local38.left, Static445.anInt1110 + local38.top);
		} else {
			Static95.aCanvas3.setLocation(Static148.anInt2796, Static445.anInt1110);
		}
		if (Static183.anInt3293 != -1) {
			Static301.method4014(true);
		}
		Static108.method1875();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
	public static int method5719(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
