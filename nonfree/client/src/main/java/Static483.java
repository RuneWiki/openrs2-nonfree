import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!vd;")
	public static Class353 aClass353_89;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt8373;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
	public static final int[] anIntArray525 = new int[1024];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([BI)Lclient!pga;")
	public static Class32 method7218(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static119.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static119.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static119.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(61) int[] local61 = new int[local38 * local34];
					@Pc(73) PixelGrabber local73 = new PixelGrabber(local19, 0, 0, local34, local38, local61, 0, local34);
					local73.grabPixels();
					return Static162.aClass100_7.method8847(local38, local34, local61, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(86) InterruptedException local86) {
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!sca;Lclient!sca;)V")
	public static void method7219(@OriginalArg(1) Class302 arg0, @OriginalArg(2) Class302 arg1) {
		@Pc(12) Class6_Sub9 local12 = Static560.method8089(Static391.aClass126_1, Static189.aClass208_32);
		local12.aClass6_Sub40_Sub2_1.method8554(arg0.anInt8838);
		local12.aClass6_Sub40_Sub2_1.method8561(arg1.anInt8877);
		local12.aClass6_Sub40_Sub2_1.method8561(arg0.anInt8834);
		local12.aClass6_Sub40_Sub2_1.method8564(arg1.anInt8838);
		local12.aClass6_Sub40_Sub2_1.method8565(arg0.anInt8877);
		local12.aClass6_Sub40_Sub2_1.method8561(arg1.anInt8834);
		Static263.method4681(local12);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILclient!k;I)V")
	public static void method7220(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (!Static71.aBoolean94) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(24) int local24;
		for (@Pc(18) Class6_Sub2_Sub4 local18 = (Class6_Sub2_Sub4) arg1.aClass286_6.method7242(); local18 != null; local18 = (Class6_Sub2_Sub4) arg1.aClass286_6.method7241()) {
			local24 = Static588.method8284(local18);
			if (local24 > local10) {
				local10 = local24;
			}
		}
		local10 += 8;
		Static457.anInt8136 = arg1.anInt5417 * 16 + (Static270.aBoolean364 ? 26 : 22);
		local24 = arg1.anInt5417 * 16 + 21;
		@Pc(60) int local60 = Static29.anInt622 + Static400.anInt7476;
		if (Static321.anInt6137 < local60 + local10) {
			local60 = Static29.anInt622 - local10;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		@Pc(90) int local90 = Static270.aBoolean364 ? 33 : 31;
		@Pc(97) int local97 = arg2 + 13 - local90;
		if (Static356.anInt6630 < local24 + local97) {
			local97 = Static356.anInt6630 - local24;
		}
		Static195.anInt3962 = local60;
		if (local97 < 0) {
			local97 = 0;
		}
		Static72.aClass6_Sub2_Sub12_1 = arg1;
		Static617.anInt10189 = local97;
		Static282.anInt5632 = local10;
	}
}
