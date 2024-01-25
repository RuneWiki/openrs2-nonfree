import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_8 = new Class359(64);

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_30 = new Class322(127, 5);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	public static void method1037() {
		aClass359_8.method8507();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIILclient!jka;IIIILclient!ha;I)V")
	public static void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2_Sub11 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class75 arg9, @OriginalArg(11) int arg10) {
		if (arg10 < arg4 && arg8 + arg10 > arg4 && arg1 > arg0 - 13 && arg1 < arg0 + 3 && arg5.aBoolean391) {
			arg6 = arg7;
		}
		@Pc(36) int[] local36 = null;
		if (Static536.method7655(arg5.anInt5173)) {
			local36 = Static149.aClass244_1.method5958((int) arg5.aLong169).anIntArray500;
		} else if (arg5.anInt5175 != -1) {
			local36 = Static149.aClass244_1.method5958(arg5.anInt5175).anIntArray500;
		} else if (Static67.method810(arg5.anInt5173)) {
			@Pc(101) Class6_Sub11 local101 = (Class6_Sub11) Static419.aClass74_45.method1401((long) (int) arg5.aLong169);
			if (local101 != null) {
				@Pc(106) Class60_Sub1_Sub1_Sub3_Sub2 local106 = local101.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				@Pc(109) Class294 local109 = local106.aClass294_1;
				if (local109.anIntArray511 != null) {
					local109 = local109.method7168(Static303.aClass55_2);
				}
				if (local109 != null) {
					local36 = local109.anIntArray513;
				}
			}
		} else if (Static635.method8594(arg5.anInt5173)) {
			@Pc(78) Class125 local78 = Static290.aClass163_5.method4124(122, (int) (arg5.aLong169 >>> 32 & 0x7FFFFFFFL));
			if (local78.anIntArray198 != null) {
				local78 = local78.method3383(Static303.aClass55_2);
			}
			if (local78 != null) {
				local36 = local78.anIntArray194;
			}
		}
		@Pc(135) String local135 = Static104.method2009(arg5);
		if (local36 != null) {
			local135 = local135 + Static170.method3325(local36);
		}
		Static205.aClass67_6.method8301(arg6, arg0, arg10 + 3, Static532.aClass49Array14, local135, Static317.anIntArray318);
		if (arg5.aBoolean394) {
			Static386.aClass49_27.method8997(arg10 + Static228.aClass53_7.method824(local135) + 5, arg0 + -12);
		}
	}
}
