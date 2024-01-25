import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_150 = new Class322(105, 7);

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!kl;")
	public static final Class211 aClass211_4 = new Class211();

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
	public static boolean aBoolean632 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;IZ)Lclient!jv;")
	public static Class199 method7217(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class199 local15;
		try {
			local15 = (Class199) Class.forName("wf").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			local15 = new Class199_Sub1();
		}
		local15.anInt10292 = arg1;
		local15.aString128 = arg0;
		return local15;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLjava/net/Socket;I)Lclient!go;")
	public static Class141 method7218(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class141_Sub1(arg0, 15000);
	}
}
