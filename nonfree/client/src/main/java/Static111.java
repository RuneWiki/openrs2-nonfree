import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	public static int anInt2192;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "Lclient!qh;")
	public static Class4_Sub5_Sub17 aClass4_Sub5_Sub17_2;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_4 = new Class79(1);

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_5 = new Class79(2);

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_6 = new Class79(4);

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_7 = new Class79(1);

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_8 = new Class79(2);

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_9 = new Class79(4);

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_10 = new Class79(2);

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "Lclient!dw;")
	public static final Class79 aClass79_11 = new Class79(4);

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_54 = new Class151(28, 5);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V")
	public static void method2110(@OriginalArg(1) int arg0) {
		@Pc(17) Class4_Sub5_Sub11 local17 = Static652.method8695((long) arg0, 5);
		local17.method3956();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILclient!bt;I)Lclient!so;")
	public static Class334 method2111(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(14) byte[] local14 = arg1.method1239(arg0, 0);
		return local14 == null ? null : new Class334(local14);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!es;)Lclient!dn;")
	public static Class71_Sub1 method2112(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class71_Sub1(arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8827(), arg0.method8865());
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method2113(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				@Pc(65) char local65 = Static174.aCharArray2[(int) (local51 - arg0 * 37L)];
				if (local65 == '_') {
					@Pc(75) int local75 = local47.length() - 1;
					local65 = ' ';
					local47.setCharAt(local75, Character.toUpperCase(local47.charAt(local75)));
				}
				local47.append(local65);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[B)Lclient!tf;")
	public static Class17 method2114(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static205.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static205.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static205.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local38 * local34];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static582.aClass33_13.method8128(local55, local38, local34, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(80) InterruptedException local80) {
			}
		}
	}
}
