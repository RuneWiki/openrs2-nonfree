import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pba", name = "I", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_165 = new Class215(91, 2);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)V")
	public static void method6750(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg1, 17);
		local8.method3088();
		local8.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!ma;ILclient!in;ZII)V")
	public static void method6752(@OriginalArg(1) Class2_Sub8_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class157 arg2, @OriginalArg(6) int arg3) {
		Static196.method3971(arg3, arg2, arg1);
		Static603.aClass2_Sub8_Sub3_5 = arg0;
	}
}
