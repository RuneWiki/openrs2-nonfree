import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!oaa;IZZLclient!oaa;ZI)I")
	public static int method7481(@OriginalArg(0) Class256_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class256_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static119.method2063(arg5, arg3, arg0, arg4);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(45) int local45 = Static119.method2063(arg1, arg2, arg0, arg4);
			return arg2 ? -local45 : local45;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!rba;)V")
	public static void method7482(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static667.aClass325_8 != null) {
			@Pc(25) int local25;
			try {
				Static667.aClass325_8.method7815(0L);
				Static667.aClass325_8.method7819(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(56) Exception local56) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method5274(24, local13, 0);
	}
}
