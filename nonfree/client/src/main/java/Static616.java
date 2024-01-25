import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
	public static int anInt10413 = 4;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!ji;)Lclient!hi;")
	public static Class109_Sub1_Sub1 method8466(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(7) Class109_Sub1 local7 = Static576.method8015(arg0);
		@Pc(11) int local11 = arg0.method8231();
		return new Class109_Sub1_Sub1(local7.aClass79_21, local7.aClass127_18, local7.anInt9905, local7.anInt9908, local7.anInt9913, local7.anInt9904, local7.anInt9909, local7.anInt9907, local7.anInt9912, local7.anInt4633, local7.anInt4628, local7.anInt4635, local7.anInt4632, local7.anInt4626, local7.anInt4634, local11);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method8468(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class5 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static293.aClass5_6 = arg2;
		Static319.aClass115_3 = Static293.aClass5_6.method6184();
		Static428.aClass115_7 = Static293.aClass5_6.method6184();
		Static368.aClass115_4 = Static293.aClass5_6.method6184();
		Static289.anInt10739 = 2;
		Static64.anInterface20_3 = null;
		Static471.anInt5158 = 0;
		Static552.anInt9486 = 1;
		Static457.anInt8207 = 2;
		Static633.anInt10652 = arg3;
		Static361.anInt6971 = arg1;
		Static309.anInt6228 = 0;
		Static381.method6035(arg4, arg0);
	}
}
