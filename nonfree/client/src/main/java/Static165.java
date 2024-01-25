import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gt", name = "Fb", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!gt", name = "Gb", descriptor = "[B")
	public static final byte[] aByteArray46 = new byte[2048];

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILclient!wv;)V")
	public static void method3097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub5 arg3) {
		@Pc(4) Class64 local4 = Static442.method6845(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass20_Sub5_1 = arg3;
		}
	}
}
