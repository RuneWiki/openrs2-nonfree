import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!gca;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!kaa;")
	public static Class168 aClass168_1;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
	public static final int[] anIntArray45 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	public static int anInt1005 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZ)V")
	public static void method1024(@OriginalArg(0) boolean arg0) {
		if (Static563.aClass127_2 != null) {
			Static563.aClass127_2.method6305();
			Static563.aClass127_2 = null;
		}
		Static384.anInt6751 = 0;
		Static226.method4024();
		Static256.method4332();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static579.aClass189Array4[local19].method4600();
		}
		Static441.method6276(false);
		System.gc();
		Static495.method6397();
		Static422.aBoolean507 = false;
		Static9.anInt281 = -1;
		Static303.method4807(true);
		Static39.anInt4952 = 0;
		Static447.anInt7737 = 0;
		Static455.anInt7847 = 0;
		Static367.anInt6493 = 0;
		Static304.anInt5589 = 0;
		Static138.anInt3088 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static434.aClass262Array1.length; local58++) {
			Static434.aClass262Array1[local58] = null;
		}
		Static50.method1124();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static588.aClass4_Sub1_Sub1_Sub2Array3[local77] = null;
		}
		Static464.anInt7995 = 0;
		Static593.aClass128_43.method3274();
		Static535.anInt8885 = 0;
		Static478.aClass128_40.method3274();
		Static368.method5526();
		Static30.anInt863 = 0;
		Static498.aClass101_1.method2867();
		Static68.method6772();
		Static492.method6724();
		Static182.aLong95 = 0L;
		Class273.lb = null;
		if (arg0) {
			Static449.method6350(12);
			return;
		}
		Static449.method6350(3);
		try {
			Static608.method4639(Static249.anApplet1, "loggedout");
		} catch (@Pc(124) Throwable local124) {
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	public static void method1026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(arg1, 1);
		local13.method2582();
		local13.anInt2944 = arg0;
	}
}
