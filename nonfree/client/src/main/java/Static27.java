import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Lclient!rl;")
	public static Class16_Sub1_Sub1_Sub3_Sub2 aClass16_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!sl;B)V")
	public static void method628(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static67.aClass204_1 != null) {
			@Pc(24) int local24;
			try {
				Static67.aClass204_1.method4773(0L);
				Static67.aClass204_1.method4777(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method2873(0, local12, 24);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII)Z")
	public static boolean method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static343.aClass51_6.method6706(arg2, arg1, arg0, Static209.anIntArray263);
		@Pc(13) int local13 = Static209.anIntArray263[2];
		if (local13 < 50) {
			return false;
		} else {
			Static209.anIntArray263[2] = local13;
			Static209.anIntArray263[0] = Static622.anInt10160 * Static209.anIntArray263[0] / local13 + Static108.anInt2357;
			Static209.anIntArray263[1] = Static260.anInt4887 * Static209.anIntArray263[1] / local13 + Static449.anInt7346;
			return true;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method630(@OriginalArg(1) File arg0) {
		return Static158.method2756(arg0, (int) arg0.length());
	}
}
