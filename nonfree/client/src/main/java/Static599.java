import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
	public static int anInt5622;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "Lclient!qt;")
	public static Class306 aClass306_2;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "Ljava/awt/Image;")
	public static Image anImage12;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FLclient!kc;ZFIIIFIFF)[B")
	public static byte[] method5107(@OriginalArg(0) float arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(16) byte[] local16 = new byte[262144];
		Static261.method4521(local16, 0, arg2, arg5, arg1, arg4, arg3, arg0);
		return local16;
	}
}
