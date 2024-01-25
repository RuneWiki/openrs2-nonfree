import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
	public static int anInt2874;

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "Lclient!pa;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_39 = new Class212(81, 8);

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "[I")
	public static final int[] anIntArray243 = new int[14];

	@OriginalMember(owner = "client!gv", name = "w", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_96 = new Class214(103, -1);

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
	public static final int anInt2875 = 1405;

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
	public static int anInt2876 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2561(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static448.method6134(Static292.aClass212_71);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(arg0));
			Static457.aClass4_Sub20_Sub1_5.method4599(arg0);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!kd;")
	public static Class13 method2565(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class13_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public static void method2569() {
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			Static17.aClass188Array1[local13] = null;
		}
		Static190.anInt3813 = 0;
	}
}
