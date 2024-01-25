import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "Z")
	public static final boolean aBoolean601 = false;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
	public static boolean method6260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static559.method7593(arg0, arg1) | (arg1 & 0x10000) != 0 || Static312.method4328(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static330.method4520(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
	public static boolean method6262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(ILclient!mo;)Lclient!hc;")
	public static Class54_Sub2_Sub1 method6266(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(7) Class54_Sub2 local7 = Static508.method7082(arg0);
		@Pc(16) int local16 = arg0.method5738();
		return new Class54_Sub2_Sub1(local7.aClass335_10, local7.aClass122_9, local7.anInt4146, local7.anInt4142, local7.anInt4145, local7.anInt4141, local7.anInt4143, local7.anInt4144, local7.anInt4139, local7.anInt3229, local7.anInt3227, local7.anInt3232, local7.anInt3226, local7.anInt3235, local7.anInt3233, local16);
	}
}
