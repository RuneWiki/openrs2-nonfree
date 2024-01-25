import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!un;I)V")
	public static void method688(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static340.aClass134_3 != null) {
			@Pc(24) int local24;
			try {
				Static340.aClass134_3.method3241(0L);
				Static340.aClass134_3.method3247(local8);
				for (local24 = 0; local24 < 24 && local8[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local24 = 0; local24 < 24; local24++) {
					local8[local24] = -1;
				}
			}
		}
		arg0.method4929(local8, 24);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V")
	public static void method690(@OriginalArg(0) int arg0) {
		if (Static342.anInt6643 == 0) {
			Static405.aClass4_Sub7_Sub3_4.method5444(arg0);
		} else {
			Static353.anInt6872 = arg0;
		}
	}
}
