import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!iv;")
	public static Class158 aClass158_8;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt2516;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_35 = new Class90(108, 4);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!sg;")
	public static Class6 method2011(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class6 local8;
		try {
			local8 = (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class6_Sub2();
		}
		local8.anInt10337 = arg0;
		local8.aString229 = arg1;
		return local8;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
	public static boolean method2013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static83.method1772(arg0, arg1) & Static404.method6136(arg1, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method2014(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg1 != null) {
				local11 = Static138.method2485(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg0;
			}
			Static446.method6579(local11);
			local11 = Static517.method8197(local11, "%3a", ":");
			local11 = Static517.method8197(local11, "%40", "@");
			local11 = Static517.method8197(local11, "%26", "&");
			local11 = Static517.method8197(local11, "%23", "#");
			if (Static533.anApplet1 != null) {
				@Pc(101) Class316 local101 = Static501.aClass366_6.method8268(new URL(Static533.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static165.anInt3435 + "&u=" + Static344.aLong177 + "&v1=" + Static594.aString235 + "&v2=" + Static594.aString242 + "&e=" + local11));
				while (local101.anInt9478 == 0) {
					Static214.method3478(1L);
				}
				if (local101.anInt9478 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local101.anObject136;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
