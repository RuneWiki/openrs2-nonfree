import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_29 = new Class94(8, 1);

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public static final int anInt3270 = 0;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_52 = new Class215(75, 6);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILclient!qfa;B)Z")
	public static boolean method3007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub5 arg3) {
		if (!Static62.aBoolean167 || !Static219.aBoolean366) {
			return false;
		} else if (Static513.anInt9411 < 100) {
			return false;
		} else if (Static331.method5702(arg2, arg1, arg0)) {
			@Pc(28) int local28 = arg1 << Static151.anInt3896;
			@Pc(32) int local32 = arg0 << Static151.anInt3896;
			@Pc(47) int local47 = Static9.aClass65Array1[arg2].method7995(arg0, arg1) - 1;
			@Pc(53) int local53 = local47 + arg3.method8618();
			if (arg3.aShort62 == 1) {
				if (!Static549.method8195(local28, local28, local32, local28, Static582.anInt10356 + local32, local53, local53, local47, local32)) {
					return false;
				} else if (Static549.method8195(local28, local28, local32, local28, Static582.anInt10356 + local32, local47, local53, local47, local32 + Static582.anInt10356)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 == 2) {
				if (!Static549.method8195(local28, local28 + Static582.anInt10356, local32 - -Static582.anInt10356, local28, Static582.anInt10356 + local32, local53, local53, local47, local32 + Static582.anInt10356)) {
					return false;
				} else if (Static549.method8195(local28, Static582.anInt10356 + local28, local32 + Static582.anInt10356, Static582.anInt10356 + local28, Static582.anInt10356 + local32, local53, local47, local47, local32 + Static582.anInt10356)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 == 4) {
				if (!Static549.method8195(local28 + Static582.anInt10356, Static582.anInt10356 + local28, local32, Static582.anInt10356 + local28, local32 - -Static582.anInt10356, local53, local53, local47, local32)) {
					return false;
				} else if (Static549.method8195(local28 + Static582.anInt10356, local28 - -Static582.anInt10356, local32, Static582.anInt10356 + local28, local32 - -Static582.anInt10356, local47, local53, local47, Static582.anInt10356 + local32)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 == 8) {
				if (!Static549.method8195(local28, Static582.anInt10356 + local28, local32, local28, local32, local53, local53, local47, local32)) {
					return false;
				} else if (Static549.method8195(local28, local28 + Static582.anInt10356, local32, Static582.anInt10356 + local28, local32, local53, local47, local47, local32)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 == 16) {
				if (Static369.method6238(local53, Static361.anInt7189, Static361.anInt7189 + local32, local28, local47, Static361.anInt7189)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 == 32) {
				if (Static369.method6238(local53, Static361.anInt7189, Static361.anInt7189 + local32, local28 + Static361.anInt7189, local47, Static361.anInt7189)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 == 64) {
				if (Static369.method6238(local53, Static361.anInt7189, local32, Static361.anInt7189 + local28, local47, Static361.anInt7189)) {
					Static241.anInt5214++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort62 != 128) {
				return true;
			} else if (Static369.method6238(local53, Static361.anInt7189, local32, local28, local47, Static361.anInt7189)) {
				Static241.anInt5214++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public static void method3008() {
		Static286.method5211();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static55.aClass104Array3[local8].method3255();
		}
		Static180.method3757();
		Static261.method4784();
		Static26.method656();
		System.gc();
		Static186.aClass20_4.ya();
	}
}
