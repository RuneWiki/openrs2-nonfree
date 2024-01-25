import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!mb;")
	public static Class132 aClass132_15;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIILclient!ja;IBLclient!cj;)V")
	public static void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class81 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Interface2 arg5) {
		if (Static271.anInt5044 < 100) {
			Static95.method1719(arg3, arg5);
		}
		arg3.method3033(arg0, arg4, arg2 + arg0, arg4 - -arg1);
		@Pc(32) int local32;
		@Pc(51) int local51;
		if (Static271.anInt5044 < 100) {
			local32 = arg2 / 2 + arg0;
			arg3.method2962(arg0, arg4, arg2, arg1, -16777216, 0);
			local51 = arg1 / 2 + arg4 - 18 - 20;
			arg3.method2992(local32 - 152, local51, 304, 34, Static94.aColorArray1[Static328.anInt6057].getRGB(), 0);
			arg3.method2962(local32 - 150, local51 + 2, Static271.anInt5044 * 3, 30, Static189.aColorArray2[Static328.anInt6057].getRGB(), 0);
			Static309.aClass30_5.method5333(Static341.aColorArray3[Static328.anInt6057].getRGB(), local32, Static110.aString81, -1, local51 + 20);
			return;
		}
		@Pc(107) int local107 = Static61.anInt1126 - (int) ((float) arg2 / Static307.aFloat17);
		local32 = (int) ((float) arg1 / Static307.aFloat17) + Static23.anInt371;
		local51 = Static61.anInt1126 + (int) ((float) arg2 / Static307.aFloat17);
		@Pc(132) int local132 = Static23.anInt371 - (int) ((float) arg1 / Static307.aFloat17);
		Static29.anInt561 = Static23.anInt371 - (int) ((float) arg1 / Static307.aFloat17);
		Static31.anInt575 = (int) ((float) (arg2 * 2) / Static307.aFloat17);
		Static206.anInt3782 = Static61.anInt1126 - (int) ((float) arg2 / Static307.aFloat17);
		Static323.anInt5956 = (int) ((float) (arg1 * 2) / Static307.aFloat17);
		Static307.method1095(local107 + Static307.anInt1200, local32 + Static307.anInt1195, local51 + Static307.anInt1200, Static307.anInt1195 + local132, arg0, arg4, arg2 + arg0, arg4 + 1 + arg1);
		Static307.method1097(arg3);
		@Pc(199) Class211 local199 = Static307.method1104(arg3);
		Static7.method147(local199, arg3);
		if (Static41.anInt6388 > 0) {
			Static297.anInt5578--;
			if (Static297.anInt5578 == 0) {
				Static41.anInt6388--;
				Static297.anInt5578 = 20;
			}
		}
		if (!Static28.aBoolean38) {
			return;
		}
		@Pc(230) int local230 = arg2 + arg0 - 5;
		@Pc(236) int local236 = arg4 + arg1 - 8;
		Static298.aClass30_4.method5336(local230, "Fps:" + Static118.anInt2258, 16776960, local236);
		@Pc(251) int local251 = local236 - 15;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(265) int local265 = 16776960;
		if (local263 > 65536) {
			local265 = 16711680;
		}
		Static298.aClass30_4.method5336(local230, "Mem:" + local263 + "k", local265, local251);
		local236 = local251 - 15;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public static void method4363() {
		@Pc(10) Class201 local10 = null;
		try {
			@Pc(14) Class196 local14 = Static308.aClass206_5.method5509();
			while (local14.anInt5851 == 0) {
				Static278.method5283(1L);
			}
			if (local14.anInt5851 == 1) {
				local10 = (Class201) local14.anObject8;
				@Pc(42) byte[] local42 = new byte[(int) local10.method5363()];
				@Pc(59) int local59;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local59) {
					local59 = local10.method5362(local42.length - local44, local42, local44);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static10.method191(new Class6_Sub10(local42));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local10 != null) {
				local10.method5359();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}
}
