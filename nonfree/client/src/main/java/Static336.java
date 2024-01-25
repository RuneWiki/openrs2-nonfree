import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "[I")
	public static final int[] anIntArray322 = new int[3];

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZLclient!un;Ljava/lang/String;)I")
	public static int method5505(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt5831;
		@Pc(15) byte[] local15 = Static293.method5079(arg1);
		arg0.method4940(local15.length);
		arg0.anInt5831 += Static48.aClass76_1.method2216(0, local15, local15.length, arg0.aByteArray68, arg0.anInt5831);
		return arg0.anInt5831 - local6;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLjava/lang/String;ZLclient!jn;)Lclient!dba;")
	public static Class59 method5506(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class176 arg2) {
		@Pc(18) int local18 = arg2.method3998(arg0);
		if (local18 == -1) {
			return new Class59(0);
		}
		@Pc(32) int[] local32 = arg2.method4002(local18);
		@Pc(38) Class59 local38 = new Class59(local32.length);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local38.anInt1365 > local40) {
				@Pc(56) Class4_Sub11 local56 = new Class4_Sub11(arg2.method3994(local32[local42++], local18));
				@Pc(60) int local60 = local56.method4931();
				@Pc(64) int local64 = local56.method4936();
				@Pc(70) int local70 = local56.method4905();
				if (!arg1 && local70 == 1) {
					local38.anInt1365--;
				} else {
					local38.anIntArray80[local40] = local60;
					local38.anIntArray81[local40] = local64;
					local40++;
				}
			}
			return local38;
		}
	}
}
