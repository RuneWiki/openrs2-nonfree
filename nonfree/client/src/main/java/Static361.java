import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	public static int anInt6426;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_129 = new Class92(74, -1);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5343(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static459.method6338(arg0, 0, local16, 0, local6);
		return local16;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)V")
	public static void method5344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg1, 12);
		local8.method3088();
		local8.anInt3749 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!ae;)Lclient!af;")
	public static Class7_Sub1 method5345(@OriginalArg(1) Class6_Sub1 arg0) {
		return new Class7_Sub1(arg0.method6428(), arg0.method6428(), arg0.method6428(), arg0.method6428(), arg0.method6435(), arg0.method6435(), arg0.method6433());
	}
}
