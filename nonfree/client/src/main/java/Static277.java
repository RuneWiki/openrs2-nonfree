import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_11 = new Class376(3, 2);

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_88 = new Class337(57, -2);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(CI)Z")
	public static boolean method4435(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!sr;I)V")
	public static void method4436(@OriginalArg(0) Class5_Sub48 arg0) {
		Static170.aClass330_13.method7917(arg0);
		arg0.anInt8986 = arg0.aClass5_Sub22_Sub1_2.anInt6629;
		Static80.anInt1677 += arg0.anInt8986;
		arg0.aClass5_Sub22_Sub1_2.anInt6629 = 0;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BLclient!ofa;)Lclient!ji;")
	public static Class177_Sub1 method4437(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(14) Class177 local14 = Static607.method8163(arg0);
		@Pc(18) int local18 = arg0.method5926();
		return new Class177_Sub1(local14.anInt4702, local14.aClass245_11, local14.aClass183_8, local14.anInt4699, local14.anInt4704, local18);
	}
}
