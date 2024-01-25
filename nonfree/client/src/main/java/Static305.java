import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Lclient!lm;")
	public static Class134 aClass134_134;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!wf;")
	public static final Class1_Sub21_Sub2 aClass1_Sub21_Sub2_3 = new Class1_Sub21_Sub2(5000);

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_33 = new Class14();

	@OriginalMember(owner = "client!u", name = "v", descriptor = "I")
	public static int anInt6104 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!lm;B)V")
	public static void method5283(@OriginalArg(0) Class134 arg0) {
		Static159.aClass134_143 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!nj;)Lclient!lj;")
	public static Class131 method5284(@OriginalArg(1) Class1_Sub21 arg0) {
		@Pc(12) Class131 local12 = new Class131();
		local12.anInt3546 = arg0.method5715();
		local12.aClass1_Sub2_Sub2_1 = Static106.method1656(local12.anInt3546);
		return local12;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)Lclient!ep;")
	public static Class1_Sub2_Sub3 method5285(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub2_Sub3 local9 = new Class1_Sub2_Sub3();
		@Pc(14) Class1_Sub21 local14 = new Class1_Sub21(arg0);
		local14.anInt6611 = local14.aByteArray82.length - 2;
		@Pc(25) int local25 = local14.method5715();
		@Pc(36) int local36 = local14.aByteArray82.length - local25 - 12 - 2;
		local14.anInt6611 = local36;
		@Pc(43) int local43 = local14.method5716();
		local9.anInt1557 = local14.method5715();
		local9.anInt1563 = local14.method5715();
		local9.anInt1561 = local14.method5715();
		local9.anInt1558 = local14.method5715();
		@Pc(73) int local73 = local14.method5720();
		@Pc(81) int local81;
		@Pc(87) int local87;
		if (local73 > 0) {
			local9.aClass207Array1 = new Class207[local73];
			for (local81 = 0; local81 < local73; local81++) {
				local87 = local14.method5715();
				@Pc(94) Class207 local94 = new Class207(Static304.method5275(local87));
				local9.aClass207Array1[local81] = local94;
				while (local87-- > 0) {
					@Pc(105) int local105 = local14.method5716();
					@Pc(109) int local109 = local14.method5716();
					local94.method5552(new Class1_Sub14(local109), (long) local105);
				}
			}
		}
		local14.anInt6611 = 0;
		local9.aString57 = local14.method5709();
		local9.aStringArray9 = new String[local43];
		local9.anIntArray116 = new int[local43];
		local9.anIntArray115 = new int[local43];
		local81 = 0;
		while (local36 > local14.anInt6611) {
			local87 = local14.method5715();
			if (local87 == 3) {
				local9.aStringArray9[local81] = local14.method5701().intern();
			} else if (local87 >= 100 || local87 == 21 || local87 == 38 || local87 == 39) {
				local9.anIntArray115[local81] = local14.method5720();
			} else {
				local9.anIntArray115[local81] = local14.method5716();
			}
			local9.anIntArray116[local81++] = local87;
		}
		return local9;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static void method5286() {
		@Pc(1) Class37 local1 = Static246.aClass37_80;
		synchronized (Static246.aClass37_80) {
			Static246.aClass37_80.method920(5);
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method5287() {
		if (Static124.aBoolean197) {
			return;
		}
		if (Static317.aBoolean521) {
			Static143.aFloat21 = (int) Static143.aFloat21 + 191 & 0xFFFFFF80;
		} else {
			Static93.aFloat9 += (24.0F - Static93.aFloat9) / 2.0F;
		}
		Static124.aBoolean197 = true;
		Static209.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!cd;IIZ)V")
	public static void method5288(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg0.anInt4026 && arg2 != -1) {
			@Pc(23) Class177 local23 = Static354.method5863(arg2);
			@Pc(26) int local26 = local23.anInt5420;
			if (local26 == 1) {
				arg0.lb = 0;
				arg0.anInt4062 = arg1;
				arg0.anInt4027 = 0;
				arg0.anInt4039 = 1;
				arg0.anInt4010 = 0;
				Static351.method3417(arg0.anInt6726, false, arg0.anInt6728, arg0.lb, local23);
			}
			if (local26 == 2) {
				arg0.anInt4010 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt4026 == -1 || Static354.method5863(arg2).anInt5417 >= Static354.method5863(arg0.anInt4026).anInt5417) {
			arg0.anInt4010 = 0;
			arg0.lb = 0;
			arg0.anInt4062 = arg1;
			arg0.anInt4085 = arg0.anInt4088;
			arg0.anInt4027 = 0;
			arg0.anInt4039 = 1;
			arg0.anInt4026 = arg2;
			if (arg0.anInt4026 == -1) {
				return;
			}
			Static351.method3417(arg0.anInt6726, false, arg0.anInt6728, arg0.lb, Static354.method5863(arg0.anInt4026));
		}
	}
}
