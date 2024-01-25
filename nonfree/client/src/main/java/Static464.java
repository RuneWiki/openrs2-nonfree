import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pka", name = "d", descriptor = "Lclient!ru;")
	public static final Class6_Sub47 aClass6_Sub47_1 = new Class6_Sub47(0, 0);

	@OriginalMember(owner = "client!pka", name = "c", descriptor = "I")
	public static final int anInt7986 = -1;

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7028(@OriginalArg(1) Class75 arg0) {
		if (Static539.anInt8776 < 2 && !Static162.aBoolean266 || Static637.aClass381_13 != null) {
			return;
		}
		@Pc(50) String local50;
		if (Static162.aBoolean266 && Static539.anInt8776 < 2) {
			local50 = Static185.aString41 + Static50.aClass43_31.method596(Static601.anInt9518) + Static6.aString5 + " ->";
		} else if (Static28.aBoolean30 && Static435.aClass148_1.method3952(81) && Static539.anInt8776 > 2) {
			local50 = Static104.method2009(Static197.aClass6_Sub2_Sub11_2);
		} else {
			@Pc(72) Class6_Sub2_Sub11 local72 = Static197.aClass6_Sub2_Sub11_2;
			if (local72 == null) {
				return;
			}
			local50 = Static104.method2009(local72);
			@Pc(82) int[] local82 = null;
			if (Static536.method7655(local72.anInt5173)) {
				local82 = Static149.aClass244_1.method5958((int) local72.aLong169).anIntArray500;
			} else if (local72.anInt5175 != -1) {
				local82 = Static149.aClass244_1.method5958(local72.anInt5175).anIntArray500;
			} else if (Static67.method810(local72.anInt5173)) {
				@Pc(160) Class6_Sub11 local160 = (Class6_Sub11) Static419.aClass74_45.method1401((long) (int) local72.aLong169);
				if (local160 != null) {
					@Pc(165) Class60_Sub1_Sub1_Sub3_Sub2 local165 = local160.aClass60_Sub1_Sub1_Sub3_Sub2_1;
					@Pc(168) Class294 local168 = local165.aClass294_1;
					if (local168.anIntArray511 != null) {
						local168 = local168.method7168(Static303.aClass55_2);
					}
					if (local168 != null) {
						local82 = local168.anIntArray513;
					}
				}
			} else if (Static635.method8594(local72.anInt5173)) {
				@Pc(135) Class125 local135 = Static290.aClass163_5.method4124(123, (int) (local72.aLong169 >>> 32 & 0x7FFFFFFFL));
				if (local135.anIntArray198 != null) {
					local135 = local135.method3383(Static303.aClass55_2);
				}
				if (local135 != null) {
					local82 = local135.anIntArray194;
				}
			}
			if (local82 != null) {
				local50 = local50 + Static170.method3325(local82);
			}
		}
		if (Static539.anInt8776 > 2) {
			local50 = local50 + "<col=ffffff> / " + (Static539.anInt8776 - 2) + Class43.lb.method596(Static601.anInt9518);
		}
		if (Static57.aClass381_1 != null) {
			@Pc(278) Class67 local278 = Static57.aClass381_1.method8747(arg0);
			if (local278 == null) {
				local278 = Static205.aClass67_6;
			}
			local278.method8299(Static532.aClass49Array14, Static57.aClass381_1.anInt10073, Static57.aClass381_1.anInt10159, local50, Static632.anIntArray650, Static57.aClass381_1.anInt10131, Static150.anInt3128, Static57.aClass381_1.anInt10090, Static192.aRandom1, Static57.aClass381_1.anInt10082, Static317.anIntArray318, Static180.anInt3649, Static178.anInt8756, Static57.aClass381_1.anInt10106);
			Static15.method206(Static632.anIntArray650[3], Static632.anIntArray650[2], Static632.anIntArray650[0], Static632.anIntArray650[1]);
		} else if (Static177.aClass381_3 != null && Static517.aClass121_8 == Static129.aClass121_1) {
			@Pc(253) int local253 = Static205.aClass67_6.method8290(Static532.aClass49Array14, Static180.anInt3649, Static154.anInt3258 + 16, local50, Static192.aRandom1, Static388.anInt6713 + 4, Static317.anIntArray318);
			Static15.method206(16, Static228.aClass53_7.method824(local50) + local253, Static388.anInt6713 + 4, Static154.anInt3258);
			return;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIILclient!ft;II)Ljava/awt/Frame;")
	public static Frame method7030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method3354()) {
			return null;
		}
		@Pc(24) Class328[] local24 = Static200.method3727(arg2);
		if (local24 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local24.length; local33++) {
			if (local24[local33].anInt9013 == arg0 && local24[local33].anInt9016 == arg3 && (!local31 || arg1 < local24[local33].anInt9011)) {
				local31 = true;
				arg1 = local24[local33].anInt9011;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(108) Class380 local108 = arg2.method3346(arg3, arg0, arg1);
		while (local108.anInt10067 == 0) {
			Static255.method4444(10L);
		}
		@Pc(122) Frame local122 = (Frame) local108.anObject25;
		if (local122 == null) {
			return null;
		} else if (local108.anInt10067 == 2) {
			Static665.method8842(local122, arg2);
			return null;
		} else {
			return local122;
		}
	}
}
