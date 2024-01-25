import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public static int anInt7191;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[S")
	public static final short[] aShortArray102 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static int anInt7192 = 0;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_113 = new Class25(73, -1);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)V")
	public static void method5894(@OriginalArg(0) boolean arg0) {
		Static80.anInt1573 = 0;
		Static64.anInt1353 = 0;
		Static187.method2914();
		Static343.method4831(arg0);
		Static58.method1091();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static64.anInt1353; local23++) {
			local29 = Static279.anIntArray416[local23];
			if (Static450.aClass3_Sub3_Sub6_Sub2Array1[local29].anInt6745 != Static125.anInt2225) {
				if (Static450.aClass3_Sub3_Sub6_Sub2Array1[local29].aClass17_1.method285()) {
					Static405.method5558(Static450.aClass3_Sub3_Sub6_Sub2Array1[local29]);
				}
				Static450.aClass3_Sub3_Sub6_Sub2Array1[local29].method5529(null);
				Static450.aClass3_Sub3_Sub6_Sub2Array1[local29] = null;
			}
		}
		if (Static55.aClass6_Sub15_Sub1_1.anInt3487 != Static337.anInt5664) {
			throw new RuntimeException("gnp1 pos:" + Static55.aClass6_Sub15_Sub1_1.anInt3487 + " psize:" + Static337.anInt5664);
		}
		for (local29 = 0; local29 < Static147.anInt7038; local29++) {
			if (Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local29]] == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static147.anInt7038);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
	public static void method5897(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static34.aBooleanArray2[arg0]) {
			Static223.aClass158_52.method3696(arg0);
			Static129.aClass239ArrayArray1[arg0] = null;
			Static419.aClass239ArrayArray2[arg0] = null;
			Static34.aBooleanArray2[arg0] = false;
		}
	}
}
