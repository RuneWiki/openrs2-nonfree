import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_51 = new Class287(37, 11);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method2746() {
		Static354.anInt6317 = 0;
		@Pc(12) int local12 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >> 9) + Static321.anInt5874;
		@Pc(20) int local20 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >> 9) + Static137.anInt3293;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static354.anInt6317 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static354.anInt6317 = 1;
		}
		if (Static354.anInt6317 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static354.anInt6317 = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI[B)I")
	public static int method2747(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static361.method5137(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method2748() {
		@Pc(11) int local11 = Static31.anInt499;
		@Pc(13) int[] local13 = Static315.anIntArray279;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class25_Sub2_Sub2_Sub5_Sub1 local23 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local13[local15]];
			if (local23 != null) {
				Static196.method3428(local23.method6668(), local23);
			}
		}
	}
}
