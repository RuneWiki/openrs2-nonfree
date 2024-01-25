import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "Lclient!sm;")
	public static Class307 aClass307_1;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	public static int anInt9152 = 0;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "[I")
	public static final int[] anIntArray665 = new int[2048];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/io/File;I)[B")
	public static byte[] method7607(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static474.method6725(arg1, arg0, local6);
			return local6;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z")
	public static boolean method7610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static581.method7883(arg1, arg0) || Static379.method5606(arg0, arg1);
	}
}
