import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!hd;")
	public static final Class145 aClass145_14 = new Class145(4);

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "[I")
	public static final int[] anIntArray513 = new int[2];

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_158 = new Class186(126, 3);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!rba;)Lclient!iaa;")
	public static Class164 method7802(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(15) int local15 = arg0.method5272();
		return new Class164(local15);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!pga;")
	public static Class255 method7807(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class255_Sub1(arg0, 15000);
	}
}
