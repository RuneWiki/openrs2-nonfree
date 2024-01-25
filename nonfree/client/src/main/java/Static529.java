import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_75 = new Class168(30);

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_223 = new Class381(25, 7);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!wq;)Lclient!rj;")
	public static Class132_Sub2 method7240(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(7) Class132 local7 = Static145.method2733(arg0);
		@Pc(11) int local11 = arg0.method7268();
		@Pc(22) int local22 = arg0.method7268();
		@Pc(26) int local26 = arg0.method7333();
		return new Class132_Sub2(local7.aClass189_13, local7.aClass346_14, local7.anInt10380, local7.anInt10382, local7.anInt10377, local7.anInt10374, local7.anInt10373, local7.anInt10383, local7.anInt10378, local11, local22, local26);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(IZ)V")
	public static void method7243(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static227.anInt9452;
		@Pc(7) int local7 = Static53.anInt931;
		if (arg0 && Static305.aBoolean339) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static273.aClass100_6.f(local7, local5);
	}
}
