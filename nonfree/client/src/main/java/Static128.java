import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ec", name = "fc", descriptor = "I")
	public static int anInt6986;

	@OriginalMember(owner = "client!ec", name = "Fc", descriptor = "I")
	public static int anInt7009;

	@OriginalMember(owner = "client!ec", name = "Jb", descriptor = "I")
	public static int anInt7021;

	@OriginalMember(owner = "client!ec", name = "wb", descriptor = "Z")
	public static boolean aBoolean541;

	@OriginalMember(owner = "client!ec", name = "Db", descriptor = "[Lclient!tu;")
	public static Class337[] aClass337Array6;

	@OriginalMember(owner = "client!ec", name = "xc", descriptor = "I")
	public static int anInt7014 = 0;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
	public static void method5983() {
		Static63.aClass290_2.method6971();
		Static557.aClass218_3.method5203();
		Static133.aClass324_1.method7965();
		Static536.aClass392_2.method9288();
		Static325.aClass231_1.method5368();
		Static201.aClass127_1.method2498();
		Static158.aClass317_1.method7884(64);
		Static421.aClass385_2.method9168();
		Static519.aClass199_1.method4691();
		Static637.aClass301_1.method7168();
		Static123.aClass234_1.method5394();
		Static356.aClass325_2.method7984();
		Static645.aClass256_4.method5939();
		Static2.aClass33_1.method654();
		Static218.aClass20_1.method343();
		Static4.aClass355_1.method8695();
		Static162.aClass181_1.method3877();
		Static112.aClass321_1.method7944();
		Static565.aClass363_33.method8769();
		Static575.aClass350_2.method8669();
		Static356.aClass157_1.method3088();
		Static588.aClass237_2.method5449();
		Static612.method8697();
		Static522.method7562();
		Static601.method8652();
		Static49.method5805();
		Static679.method9319();
		Static445.aClass391_42.method9286();
		Static539.aClass391_52.method9286();
		Static30.aClass391_4.method9286();
		Static533.aClass391_50.method9286();
		Static173.aClass391_19.method9286();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[B)Lclient!fs;")
	public static Class134 method6003(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static454.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static454.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static454.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(62) int[] local62 = new int[local36 * local40];
					@Pc(74) PixelGrabber local74 = new PixelGrabber(local21, 0, 0, local36, local40, local62, 0, local36);
					local74.grabPixels();
					return Static457.aClass57_11.method7679(local36, local62, local36, local40);
				}
				throw new RuntimeException("");
			} catch (@Pc(87) InterruptedException local87) {
			}
		}
	}
}
