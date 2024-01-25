import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Lclient!sh;")
	public static final Class313 aClass313_4 = new Class313(0);

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "Lclient!wq;")
	public static final Class375 aClass375_39 = new Class375(2);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method7184() {
		Static118.anImage1 = null;
		Static127.aFont1 = null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7185(@OriginalArg(0) String arg0) {
		Static101.method2658("", 0, 0, arg0, "", "");
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIIIIIILclient!kda;Lclient!kda;)V")
	public static void method7186(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class3_Sub1_Sub3_Sub3 arg5, @OriginalArg(9) Class3_Sub1_Sub3_Sub3 arg6) {
		@Pc(7) int local7 = arg5.method5203();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class46 local20 = (Class46) Static40.aClass169_7.method5002((long) local7);
		if (local20 == null) {
			@Pc(27) Class296[] local27 = Static652.method7581(Static214.aClass157_106, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static186.aClass20_4.method7294(local27[0], true);
			Static40.aClass169_7.method5001(local20, (long) local7);
		}
		Static331.method5703(arg6.aByte132, 0, arg1 >> 1, arg6.anInt10303, arg6.method5214() * 256, arg6.anInt10310, arg3 >> 1);
		@Pc(73) int local73 = arg4 + Static613.anIntArray690[0] - 18;
		@Pc(83) int local83 = Static613.anIntArray690[1] + arg2 - 54 - 16;
		@Pc(91) int local91 = local73 + arg0 / 4 * 18;
		@Pc(99) int local99 = local83 + arg0 % 4 * 18;
		local20.method6213(local91, local99);
		if (arg5 == arg6) {
			Static186.aClass20_4.method7271(18, local99 - 1, -256, local91 - 1, 18);
		}
		Static113.method2842(local91 - 1, local91 + 18, local99 - 1, local99 - -18);
		@Pc(143) Class3_Sub6 local143 = Static157.method8066();
		local143.anInt8493 = local91 + 16;
		local143.anInt8494 = local99;
		local143.aClass3_Sub1_Sub3_Sub3_1 = arg5;
		local143.anInt8492 = local99 + 16;
		local143.anInt8495 = local91;
		Static512.aClass325_7.method8013(local143);
	}
}
