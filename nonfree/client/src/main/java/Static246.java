import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!rg;")
	public static final Class285 aClass285_4 = new Class285();

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt4542 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIIZ)V")
	public static void method4027(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static106.method2232(arg1, Static338.aClass133_Sub1Array2.length - 1, arg2, arg0, arg3, 0);
		Static558.anInt8941 = 0;
		Static347.aClass3_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)Lclient!f;")
	public static Class46 method4029(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static478.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static478.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static478.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local34 * local38];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static4.aClass43_1.method7198(local55, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(79) InterruptedException local79) {
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public static void method4030(@OriginalArg(0) boolean arg0) {
		Static17.anInt272 = 0;
		Static321.anInt5791 = 0;
		Static314.method4912();
		Static20.method432(arg0);
		Static398.method5826();
		@Pc(20) boolean local20 = false;
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static17.anInt272; local22++) {
			local28 = Static58.anIntArray105[local22];
			@Pc(37) Class3_Sub39 local37 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local28);
			@Pc(40) Class9_Sub1_Sub1_Sub2_Sub1 local40 = local37.aClass9_Sub1_Sub1_Sub2_Sub1_2;
			if (Static255.aBoolean352 && Static186.method3190(local28)) {
				Static47.method788();
			}
			if (Static305.anInt5560 != local40.anInt6391) {
				if (local40.aClass294_1.method6428()) {
					Static321.method5002(local40);
				}
				local40.method425(null);
				local20 = true;
				local37.method7812();
			}
		}
		if (local20) {
			Static568.anInt9131 = Static243.aClass310_16.method6608();
			Static243.aClass310_16.method6604(Static341.aClass3_Sub39Array1);
		}
		if (Static178.anInt8249 != Static187.aClass3_Sub11_Sub1_1.anInt3520) {
			throw new RuntimeException("gnp1 pos:" + Static187.aClass3_Sub11_Sub1_1.anInt3520 + " psize:" + Static178.anInt8249);
		}
		for (local28 = 0; local28 < Static49.anInt1058; local28++) {
			if (Static243.aClass310_16.method6601((long) Static480.anIntArray603[local28]) == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static49.anInt1058);
			}
		}
	}
}
