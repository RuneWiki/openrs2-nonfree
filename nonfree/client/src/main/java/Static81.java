import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
	public static int anInt1467;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "[Lclient!fp;")
	public static final Class97[] aClass97Array1 = new Class97[4];

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "Z")
	public static boolean aBoolean92 = true;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!wa;")
	public static Class56 method1383(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class56_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BCI)I")
	public static int method1384(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
