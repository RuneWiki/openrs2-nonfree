import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "Lclient!la;")
	public static Class196 aClass196_85;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	public static int anInt7711 = 100;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "Lclient!qk;")
	public static Class279 aClass279_13 = null;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method6690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg4;
		@Pc(21) int local21 = arg5 - arg4;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(86) int local86 = local29 - local45 * (local57 - 1);
		@Pc(94) int local94 = local33 * (1 - local61) + local49;
		@Pc(103) int local103 = local37 - local53 * (local61 - 1);
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local29 << 2;
		@Pc(115) int local115 = local33 << 2;
		@Pc(119) int local119 = local37 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = local45 * (local57 - 3);
		@Pc(133) int local133 = local49 * 3;
		@Pc(139) int local139 = (local61 - 3) * local53;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg5 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = local115 * (local21 - 1);
		@Pc(159) int[] local159 = Static460.anIntArrayArray53[arg1];
		Static611.method8472(arg0 - local16, -arg3 + arg0, local159, arg6);
		Static611.method8472(arg0 + local16, -local16 + arg0, local159, arg2);
		Static611.method8472(arg0 + arg3, local16 + arg0, local159, arg6);
		while (local9 > 0) {
			@Pc(207) boolean local207 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local123;
					local86 += local141;
					local7++;
					local141 += local111;
					local123 += local111;
				}
			}
			if (local207) {
				if (local94 < 0) {
					while (local94 < 0) {
						local94 += local133;
						local103 += local149;
						local149 += local119;
						local133 += local119;
						local11++;
					}
				}
				if (local103 < 0) {
					local94 += local133;
					local103 += local149;
					local11++;
					local133 += local119;
					local149 += local119;
				}
				local94 += -local155;
				local103 += -local139;
				local155 -= local115;
				local139 -= local115;
			}
			if (local86 < 0) {
				local86 += local141;
				local70 += local123;
				local141 += local111;
				local123 += local111;
				local7++;
			}
			local70 += -local147;
			local86 += -local129;
			local147 -= local107;
			local9--;
			local129 -= local107;
			@Pc(340) int local340 = arg1 - local9;
			@Pc(344) int local344 = local9 + arg1;
			@Pc(348) int local348 = local7 + arg0;
			@Pc(353) int local353 = arg0 - local7;
			if (local207) {
				@Pc(378) int local378 = arg0 + local11;
				@Pc(382) int local382 = arg0 - local11;
				Static611.method8472(local382, local353, Static460.anIntArrayArray53[local340], arg6);
				Static611.method8472(local378, local382, Static460.anIntArrayArray53[local340], arg2);
				Static611.method8472(local348, local378, Static460.anIntArrayArray53[local340], arg6);
				Static611.method8472(local382, local353, Static460.anIntArrayArray53[local344], arg6);
				Static611.method8472(local378, local382, Static460.anIntArrayArray53[local344], arg2);
				Static611.method8472(local348, local378, Static460.anIntArrayArray53[local344], arg6);
			} else {
				Static611.method8472(local348, local353, Static460.anIntArrayArray53[local340], arg6);
				Static611.method8472(local348, local353, Static460.anIntArrayArray53[local344], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[B)Lclient!td;")
	public static Class24 method6691(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static116.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static116.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static116.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local34 * local38];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static323.aClass5_9.method7536(local58, local38, local34, local34);
				}
				throw new RuntimeException("");
			} catch (@Pc(83) InterruptedException local83) {
			}
		}
	}
}
