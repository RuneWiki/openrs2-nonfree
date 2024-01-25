import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "Z")
	public static boolean aBoolean547 = true;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IZ)V")
	public static void method5410(@OriginalArg(1) boolean arg0) {
		Static248.aClass1_Sub7_Sub1_2.method728(220);
		for (@Pc(18) Class1_Sub9 local18 = (Class1_Sub9) Static348.aClass26_20.method871(); local18 != null; local18 = (Class1_Sub9) Static348.aClass26_20.method878()) {
			if (!local18.method5711()) {
				local18 = (Class1_Sub9) Static348.aClass26_20.method871();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt1106 == 0) {
				Static125.method2404(local18, arg0, true);
			}
		}
		if (Static297.aClass177_20 != null) {
			Static133.method2517(Static297.aClass177_20);
			Static297.aClass177_20 = null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Lclient!rg;")
	public static Class177 method5412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class177 local12 = Static140.method2694(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass177Array2 == null || arg1 >= local12.aClass177Array2.length) {
			return null;
		} else {
			return local12.aClass177Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!aa;Z[[II)V")
	public static void method5413(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(27) int[][] local27;
			@Pc(29) int local29;
			@Pc(33) int local33;
			if (arg3 == null) {
				local27 = null;
			} else {
				local27 = new int[Static48.anInt1107 + 1][Static337.anInt6402 + 1];
				for (local29 = 0; local29 <= Static337.anInt6402; local29++) {
					for (local33 = 0; local33 <= Static48.anInt1107; local33++) {
						local27[local33][local29] = Static213.anIntArrayArrayArray10[local15][local33][local29] - arg3[local33][local29];
					}
				}
			}
			local29 = 0;
			local33 = 0;
			if (!arg2) {
				if (Static8.aBoolean28) {
					local33 = 8;
				}
				if (Static44.aBoolean87) {
					local29 = 2;
				}
				if (Static158.anInt3147 != 0) {
					local29 |= 0x1;
					if (local15 == 0 || Static157.anInt3131 >= 96) {
						local33 |= 0x10;
					}
				}
			}
			if (Static44.aBoolean87) {
				local33 |= 0x7;
			}
			@Pc(123) Class41 local123 = arg1.method3336(Static48.anInt1107, Static337.anInt6402, Static213.anIntArrayArrayArray10[local15], local27, local29, local33);
			Static306.method5160(local15, local123);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
	public static int method5414(@OriginalArg(1) int arg0) {
		@Pc(12) Class145 local12 = Static49.method1111(arg0);
		@Pc(15) int local15 = local12.anInt4270;
		@Pc(18) int local18 = local12.anInt4271;
		@Pc(21) int local21 = local12.anInt4268;
		@Pc(28) int local28 = Class176.anIntArray651[local21 - local18];
		return Static197.anIntArray793[local15] >> local18 & local28;
	}
}
