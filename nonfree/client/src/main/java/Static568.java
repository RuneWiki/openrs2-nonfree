import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	public static int anInt9276 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)Z")
	public static boolean method7408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static131.method1767(arg0, arg1) | (arg0 & 0x70000) != 0 || Static347.method5021(arg1, arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!gk;)V")
	public static void method7409(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static466.aClass121_4 != null) {
			@Pc(25) int local25;
			try {
				Static466.aClass121_4.method2186(0L);
				Static466.aClass121_4.method2181(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method4498(local13, 24);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([SBI)[S")
	public static short[] method7411(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static598.method4264(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
