import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wja", name = "e", descriptor = "I")
	public static int anInt10802;

	@OriginalMember(owner = "client!wja", name = "g", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(IIII)V")
	public static void method9112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 * Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251() >> 8;
		if (local12 == 0 || arg1 == -1) {
			return;
		}
		if (!Static76.aBoolean115 && Static603.anInt9717 != -1 && Static471.method6667(-1) && !Static390.method5744()) {
			Static210.aClass5_Sub4_Sub2_4 = Static2.method22();
			@Pc(50) Class5_Sub4_Sub2 local50 = Static369.method5507(Static210.aClass5_Sub4_Sub2_4);
			Static129.method1925(local50);
		}
		Static420.method6160(Static446.aClass126_207, arg1, local12);
		Static214.method8571(-1, 255);
		Static76.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
	public static void method9113(@OriginalArg(0) int arg0) {
		Static255.anInt6561 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static672.anInt10829; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static532.anInt8517; local6++) {
				if (Static283.aClass128ArrayArrayArray1[arg0][local3][local6] == null) {
					Static283.aClass128ArrayArrayArray1[arg0][local3][local6] = new Class128(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)V")
	public static void method9114() {
		Static227.anInt9452 = (int) ((double) Static271.anInt4910 * 34.46D);
		Static53.anInt931 = 200;
		Static227.anInt9452 <<= 0x2;
		if (Static273.aClass100_6.method8632()) {
			Static227.anInt9452 += 512;
		}
		Static529.method7243(false);
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIII)I")
	public static int method9115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static565.method7648(local17, local7);
		@Pc(35) int local35 = Static565.method7648(local17, local7 + 1);
		@Pc(42) int local42 = Static565.method7648(local17 + 1, local7);
		@Pc(51) int local51 = Static565.method7648(local17 + 1, local7 - -1);
		@Pc(68) int local68 = Static455.method6424(local35, local28, local13, arg0);
		@Pc(75) int local75 = Static455.method6424(local51, local42, local13, arg0);
		return Static455.method6424(local75, local68, local23, arg0);
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(II)V")
	public static void method9116(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub1_Sub15 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class84 local8 = Static668.aClass84Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static532.anInt8517; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static672.anInt10829; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static314.anInt5377;
							@Pc(32) int local32 = local12 << Static314.anInt5377;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class84 local41 = Static668.aClass84Array4[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7620(local12, local15) - local41.method7620(local12, local15);
									@Pc(71) int local71 = local8.method7620(local12, local15 + 1) - local41.method7620(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7620(local12 + 1, local15 + 1) - local41.method7620(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7620(local12 + 1, local15) - local41.method7620(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Z[B)Lclient!hk;")
	public static Class155 method9118(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static189.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static189.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static189.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(65) int[] local65 = new int[local36 * local40];
					@Pc(77) PixelGrabber local77 = new PixelGrabber(local21, 0, 0, local36, local40, local65, 0, local36);
					local77.grabPixels();
					return Static273.aClass100_6.method8645(local36, local36, local65, local40);
				}
				throw new RuntimeException("");
			} catch (@Pc(90) InterruptedException local90) {
			}
		}
	}
}
