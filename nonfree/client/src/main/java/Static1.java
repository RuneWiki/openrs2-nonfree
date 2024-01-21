import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public static int anInt1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!vc;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public static int anInt2;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!bf;")
	public static Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!ef;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!ef;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1 = Static6.method100("Abbrechen");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt5 = 128;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_2 = Static6.method100("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	public static int anInt8 = 0;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	public static int[] anIntArray1 = new int[50];

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!he;")
	public static Class26 aClass26_3 = Static6.method100("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method4() {
		aClass3_Sub3_Sub1_1 = null;
		aClass26_3 = null;
		aClass16_2 = null;
		aClass76_1 = null;
		aClass16_1 = null;
		aClass3_Sub1_Sub4_Sub1Array1 = null;
		aClass26_1 = null;
		anIntArray1 = null;
		aClass26_2 = null;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method6() {
		Static33.aClass3_Sub11_Sub1_2.method1036();
		@Pc(13) int local13 = Static33.aClass3_Sub11_Sub1_2.method1031(8);
		@Pc(18) int local18;
		if (Static133.anInt560 > local13) {
			for (local18 = local13; local18 < Static133.anInt560; local18++) {
				Static96.anIntArray311[Static58.anInt1778++] = Static48.anIntArray151[local18];
			}
		}
		if (Static133.anInt560 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static133.anInt560 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static48.anIntArray151[local18];
			@Pc(60) Class3_Sub1_Sub5_Sub1_Sub2 local60 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local56];
			@Pc(65) int local65 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
			if (local65 == 0) {
				Static48.anIntArray151[Static133.anInt560++] = local56;
				local60.anInt2722 = Static4.anInt136;
			} else {
				@Pc(85) int local85 = Static33.aClass3_Sub11_Sub1_2.method1031(2);
				if (local85 == 0) {
					Static48.anIntArray151[Static133.anInt560++] = local56;
					local60.anInt2722 = Static4.anInt136;
					Static76.anIntArray206[Static19.anInt512++] = local56;
				} else {
					@Pc(130) int local130;
					@Pc(140) int local140;
					if (local85 == 1) {
						Static48.anIntArray151[Static133.anInt560++] = local56;
						local60.anInt2722 = Static4.anInt136;
						local130 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
						local60.method1882(false, local130);
						local140 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
						if (local140 == 1) {
							Static76.anIntArray206[Static19.anInt512++] = local56;
						}
					} else if (local85 == 2) {
						Static48.anIntArray151[Static133.anInt560++] = local56;
						local60.anInt2722 = Static4.anInt136;
						local130 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
						local60.method1882(true, local130);
						local140 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
						local60.method1882(true, local140);
						@Pc(196) int local196 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
						if (local196 == 1) {
							Static76.anIntArray206[Static19.anInt512++] = local56;
						}
					} else if (local85 == 3) {
						Static96.anIntArray311[Static58.anInt1778++] = local56;
					}
				}
			}
		}
	}
}
