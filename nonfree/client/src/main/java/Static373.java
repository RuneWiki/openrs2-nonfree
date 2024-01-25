import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5811(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!kk;Ljava/awt/Frame;I)V")
	public static void method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class330 local10 = arg0.method4339(arg1);
			while (local10.anInt9132 == 0) {
				Static452.method7478(10L);
			}
			if (local10.anInt9132 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static452.method7478(100L);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg7 < 1 || Static111.anInt1752 - 2 < arg5 || Static279.anInt4567 - 2 < arg7) {
			return;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && Static353.method5596(arg5, arg7)) {
			local35 = arg2 + 1;
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 0 && !Static179.method2902(arg5, Static315.anInt5514, arg7, local35)) {
			return;
		}
		if (Static535.aClass156ArrayArrayArray2 == null) {
			return;
		}
		Static121.aClass15_Sub1_2.method399(arg3, arg2, arg5, Static308.aClass182Array1[arg2], arg7, Static485.aClass126_17);
		if (arg4 < 0) {
			return;
		}
		@Pc(81) int local81 = Static627.aClass5_Sub46_31.aClass11_Sub16_1.method4417();
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, 1);
		Static121.aClass15_Sub1_2.method397(arg2, arg4, local35, arg7, arg1, arg5, arg0, arg6, Static485.aClass126_17, Static308.aClass182Array1[arg2]);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, local81);
		return;
	}
}
