import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt5674 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!et;IIIIIZIIILclient!ha;)V")
	public static void method4823(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class33 arg10) {
		if (arg0 > arg6 && arg0 < arg7 + arg6 && arg5 - 13 < arg3 && arg5 + 3 > arg3 && arg1.aBoolean286) {
			arg9 = arg4;
		}
		@Pc(40) int[] local40 = null;
		if (Static603.method8220(arg1.anInt3485)) {
			local40 = Static367.aClass281_1.method6975((int) arg1.aLong74).anIntArray441;
		} else if (arg1.anInt3482 != -1) {
			local40 = Static367.aClass281_1.method6975(arg1.anInt3482).anIntArray441;
		} else if (Static438.method6668(arg1.anInt3485)) {
			@Pc(126) Class3_Sub49 local126 = (Class3_Sub49) Static60.aClass307_6.method7424((long) arg1.aLong74);
			if (local126 != null) {
				@Pc(131) Class2_Sub3_Sub1_Sub2_Sub1 local131 = local126.aClass2_Sub3_Sub1_Sub2_Sub1_2;
				@Pc(134) Class22 local134 = local131.aClass22_1;
				if (local134.anIntArray29 != null) {
					local134 = local134.method425(Static514.aClass166_1);
				}
				if (local134 != null) {
					local40 = local134.anIntArray31;
				}
			}
		} else if (Static530.method7543(arg1.anInt3485)) {
			@Pc(91) Class272 local91;
			if (arg1.anInt3485 == 1002) {
				local91 = Static541.aClass349_4.method8123((int) arg1.aLong74);
			} else {
				local91 = Static541.aClass349_4.method8123((int) (arg1.aLong74 >>> 32 & 0x7FFFFFFFL));
			}
			if (local91.anIntArray523 != null) {
				local91 = local91.method6856(Static514.aClass166_1);
			}
			if (local91 != null) {
				local40 = local91.anIntArray524;
			}
		}
		@Pc(151) String local151 = Static590.method8097(arg1);
		if (local40 != null) {
			local151 = local151 + Static211.method4159(local40);
		}
		Static16.aClass25_1.method5846(Static603.aClass5Array20, arg9, local151, arg5, arg6 + 3, Static610.anIntArray611);
		if (arg1.aBoolean287) {
			Static112.aClass5_9.method7577(arg6 + Static224.aClass315_11.method7572(local151) + 5, arg5 - 12);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(DI)V")
	public static void method4824(@OriginalArg(0) double arg0) {
		Static364.aClass47_4.method7877(Static449.aClass47_8);
		Static364.aClass47_4.method7876(0, 0, (int) arg0);
		Static67.aClass33_5.method6233(Static364.aClass47_4);
	}
}
