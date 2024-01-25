import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Lclient!aia;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "()V")
	public static void method5352() {
		for (@Pc(1) int local1 = Static368.anInt6287; local1 < Static633.anInt10310; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static209.anInt3602; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static245.anInt4308; local7++) {
					@Pc(16) Class351 local16 = Static441.aClass351ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class2_Sub1_Sub2 local21 = local16.aClass2_Sub1_Sub2_2;
						@Pc(24) Class2_Sub1_Sub2 local24 = local16.aClass2_Sub1_Sub2_1;
						if (local21 != null && local21.method8451()) {
							Static159.method2244(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8451()) {
								Static159.method2244(local24, local1, local4, local7, 1, 1);
								local24.method8462(local21, 0, false, 0, Static576.aClass132_15, 0);
								local24.method8449();
							}
							local21.method8449();
						}
						for (@Pc(68) Class67 local68 = local16.aClass67_3; local68 != null; local68 = local68.aClass67_1) {
							@Pc(72) Class2_Sub1_Sub1 local72 = local68.aClass2_Sub1_Sub1_1;
							if (local72 != null && local72.method8451()) {
								Static159.method2244(local72, local1, local4, local7, local72.aShort119 + 1 - local72.aShort118, local72.aShort120 - local72.aShort121 + 1);
								local72.method8449();
							}
						}
						@Pc(108) Class2_Sub1_Sub3 local108 = local16.aClass2_Sub1_Sub3_1;
						if (local108 != null && local108.method8451()) {
							Static188.method2684(local108, local1, local4, local7);
							local108.method8449();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
	public static String method5353(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local24 = true;
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(26);
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (arg1 > 0) {
			for (local49 = 0; local49 < arg1; local49++) {
				local54 = (int) arg3;
				arg3 /= 10L;
				local45.append((char) (local54 + 48 - (int) arg3 * 10));
			}
			local45.append(local7);
		}
		local49 = 0;
		while (true) {
			local54 = (int) arg3;
			arg3 /= 10L;
			local45.append((char) (local54 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local24) {
					local45.append('-');
				}
				return local45.reverse().toString();
			}
			if (arg0) {
				local49++;
				if (local49 % 3 == 0) {
					local45.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B[B)Lclient!ho;")
	public static Class9 method5355(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static563.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static563.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static563.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(55) int[] local55 = new int[local34 * local38];
					@Pc(67) PixelGrabber local67 = new PixelGrabber(local19, 0, 0, local34, local38, local55, 0, local34);
					local67.grabPixels();
					return Static546.aClass132_13.method7444(local55, local34, local38, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(80) InterruptedException local80) {
			}
		}
	}
}
