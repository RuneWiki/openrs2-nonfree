import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!kc;")
	public static Class13_Sub1_Sub1_Sub1_Sub2 aClass13_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[SB)[S")
	public static short[] method4395(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static653.method5394(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBLjava/io/File;)[B")
	public static byte[] method4396(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static513.method7198(local6, arg1, arg0);
			return local6;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}
}
