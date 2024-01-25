import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
	public static int[] anIntArray589;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method9605() {
		Static645.method8763();
		@Pc(12) int local12 = Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1092();
		if (local12 == 2) {
			Static116.method2046(Static406.anInt7570, Static607.aClass101_15, Static19.anInt352);
		} else if (local12 == 3) {
			Static674.method9827(Static406.anInt7570, Static423.anInt7782, Static306.anInt5542, Static19.anInt352, Static607.aClass101_15);
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1091()) {
			Static606.method9086(Static641.aCanvas13);
		}
		if (Static607.aClass101_15 != null) {
			Static359.method6153();
		}
		Static110.aBoolean800 = Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1092() != 0;
		Static450.aBoolean606 = Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1091();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lclient!q;")
	public static Class291 method9606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static193.aClass291ArrayArrayArray2[0][arg1][arg2] != null && Static193.aClass291ArrayArrayArray2[0][arg1][arg2].aClass291_1 != null;
			if (local28 && arg0 >= Static60.anInt1169 - 1) {
				return null;
			}
			Static557.method8501(arg0, arg1, arg2);
		}
		return Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method9609(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static679.method4129(arg0, 0, local14, 0, local6);
		return local14;
	}
}
