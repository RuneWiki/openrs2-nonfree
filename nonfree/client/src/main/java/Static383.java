import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!nba", name = "J", descriptor = "I")
	public static int anInt6430;

	@OriginalMember(owner = "client!nba", name = "I", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_244 = new Class179(79, 8);

	@OriginalMember(owner = "client!nba", name = "K", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!nba", name = "L", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!nba", name = "N", descriptor = "I")
	public static int anInt6432 = -1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method5442(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) byte[] local10 = new byte[arg1];
			Static650.method8854(arg1, local10, arg0);
			return local10;
		} catch (@Pc(18) IOException local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLclient!gga;)Lclient!rl;")
	public static Class63_Sub3 method5443(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(7) Class63 local7 = Static583.method8067(arg0);
		@Pc(11) int local11 = arg0.method8369();
		@Pc(15) int local15 = arg0.method8369();
		@Pc(19) int local19 = arg0.method8363();
		return new Class63_Sub3(local7.aClass7_9, local7.aClass249_12, local7.anInt8533, local7.anInt8532, local7.anInt8537, local7.anInt8536, local7.anInt8538, local7.anInt8535, local7.anInt8534, local11, local15, local19);
	}
}
