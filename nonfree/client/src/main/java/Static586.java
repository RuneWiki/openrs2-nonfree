import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "Z")
	public static boolean aBoolean712 = false;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
	public static void method8143() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static97.aBooleanArray4[local7] = false;
		}
		Static4.anInt23 = Static377.anInt7114;
		Static214.anInt4979 = Static637.anInt10650;
		Static258.anInt5552 = 0;
		Static153.anInt3784 = Static25.anInt1035;
		Static572.anInt9828 = Static504.anInt8868;
		Static324.anInt6509 = 0;
		Static639.anInt10676 = Static443.anInt8245;
		Static44.anInt1555 = -1;
		Static266.anInt5675 = -1;
		Static621.anInt10407 = -1;
		Static460.anInt8416 = -1;
		Static427.anInt8005 = 5;
		Static177.anInt3832 = Static435.anInt8192;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!pk;IILclient!efa;ILclient!vc;BI)V")
	public static void method8144(@OriginalArg(0) Class15_Sub1_Sub2_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub1_Sub2_Sub2_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class352 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class8_Sub4 local11 = new Class8_Sub4();
		local11.anInt1056 = arg6 << 9;
		local11.anInt1047 = arg4;
		local11.anInt1059 = arg1 << 9;
		if (arg5 != null) {
			local11.aClass352_1 = arg5;
			@Pc(158) int local158 = arg5.anInt10116;
			@Pc(161) int local161 = arg5.anInt10132;
			if (arg2 == 1 || arg2 == 3) {
				local161 = arg5.anInt10116;
				local158 = arg5.anInt10132;
			}
			local11.anInt1045 = arg5.anInt10083 << 9;
			local11.aBoolean101 = arg5.aBoolean722;
			local11.anInt1049 = arg1 + local161 << 9;
			local11.aBoolean99 = arg5.aBoolean721;
			local11.anInt1054 = arg6 + local158 << 9;
			local11.anInt1051 = arg5.anInt10089;
			local11.anInt1058 = arg5.anInt10133;
			local11.anInt1055 = arg5.anInt10113;
			local11.anInt1053 = arg5.anInt10085;
			local11.anInt1050 = arg5.anInt10123;
			local11.anIntArray31 = arg5.anIntArray589;
			local11.anInt1048 = arg5.anInt10114;
			if (arg5.anIntArray591 != null) {
				local11.aBoolean100 = true;
				local11.method976();
			}
			if (local11.anIntArray31 != null) {
				local11.anInt1046 = (int) (Math.random() * (double) (local11.anInt1050 - local11.anInt1058)) + local11.anInt1058;
			}
			Static584.aClass43_63.method1424(local11);
			return;
		}
		if (arg0 != null) {
			local11.aClass15_Sub1_Sub2_Sub2_Sub2_1 = arg0;
			@Pc(34) Class300 local34 = arg0.aClass300_1;
			if (local34.anIntArray498 != null) {
				local11.aBoolean100 = true;
				local34 = local34.method7306(Static420.aClass77_1);
			}
			if (local34 != null) {
				local11.anInt1054 = local34.anInt8912 + arg6 << 9;
				local11.anInt1049 = arg1 + local34.anInt8912 << 9;
				local11.anInt1055 = Static627.method8455(arg0);
				local11.anInt1051 = local34.anInt8897;
				local11.aBoolean101 = local34.aBoolean632;
				local11.anInt1053 = local34.anInt8902;
				local11.anInt1048 = local34.anInt8889;
				local11.anInt1045 = local34.anInt8904 << 9;
			}
			Static295.aClass43_32.method1424(local11);
			return;
		}
		if (arg3 == null) {
			return;
		}
		local11.aClass15_Sub1_Sub2_Sub2_Sub1_1 = arg3;
		local11.anInt1054 = arg6 + arg3.method6692() << 9;
		local11.anInt1049 = arg3.method6692() + arg1 << 9;
		local11.anInt1055 = Static122.method2760(arg3);
		local11.anInt1051 = 256;
		local11.anInt1048 = arg3.anInt3285;
		local11.anInt1053 = 256;
		local11.anInt1045 = arg3.anInt3307 << 9;
		local11.aBoolean101 = arg3.aBoolean250;
		Static413.aClass253_30.method6591(local11, (long) arg3.anInt8075);
		return;
	}
}
