import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[Lclient!at;")
	public static Class16[] aClass16Array2;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!gs;")
	public static final Class93 aClass93_3 = new Class93();

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Lclient!qh;")
	public static Class75 method2822() {
		try {
			return (Class75) Class.forName("Class75_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)I")
	public static int method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static178.anInt5442 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(23) int local23 = arg0 - Static282.anInt3479;
		@Pc(27) int local27 = arg2 - Static282.anInt3477;
		for (@Pc(34) Class2_Sub40 local34 = (Class2_Sub40) Static282.aClass156_23.method3155(); local34 != null; local34 = (Class2_Sub40) Static282.aClass156_23.method3150()) {
			if (arg1 == local34.anInt6352) {
				@Pc(43) int local43 = local34.anInt6349;
				@Pc(46) int local46 = local34.anInt6347;
				@Pc(57) int local57 = local43 + Static282.anInt3479 << 14 | local46 + Static282.anInt3477;
				@Pc(77) int local77 = (local27 - local46) * (-local46 + local27) + (local23 - local43) * (-local43 + local23);
				if (local12 < 0 || local77 < local14) {
					local14 = local77;
					local12 = local57;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[B)Lclient!ho;")
	public static Class2_Sub5_Sub5 method2824(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub5_Sub5 local9 = new Class2_Sub5_Sub5();
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0);
		local14.anInt4347 = local14.aByteArray52.length - 2;
		@Pc(30) int local30 = local14.method3555();
		@Pc(41) int local41 = local14.aByteArray52.length - local30 - 12 - 2;
		local14.anInt4347 = local41;
		@Pc(48) int local48 = local14.method3574();
		local9.anInt2695 = local14.method3555();
		local9.anInt2694 = local14.method3555();
		local9.anInt2691 = local14.method3555();
		local9.anInt2690 = local14.method3555();
		@Pc(76) int local76 = local14.method3580();
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (local76 > 0) {
			local9.aClass72Array1 = new Class72[local76];
			for (local84 = 0; local84 < local76; local84++) {
				local90 = local14.method3555();
				@Pc(97) Class72 local97 = new Class72(Static29.method453(local90));
				local9.aClass72Array1[local84] = local97;
				while (local90-- > 0) {
					@Pc(110) int local110 = local14.method3574();
					@Pc(116) int local116 = local14.method3574();
					local97.method1653(new Class2_Sub20(local116), (long) local110);
				}
			}
		}
		local14.anInt4347 = 0;
		local9.aString85 = local14.method3603();
		local9.aStringArray12 = new String[local48];
		local9.anIntArray213 = new int[local48];
		local9.anIntArray214 = new int[local48];
		local84 = 0;
		while (local41 > local14.anInt4347) {
			local90 = local14.method3555();
			if (local90 == 3) {
				local9.aStringArray12[local84] = local14.method3582().intern();
			} else if (local90 >= 100 || local90 == 21 || local90 == 38 || local90 == 39) {
				local9.anIntArray213[local84] = local14.method3580();
			} else {
				local9.anIntArray213[local84] = local14.method3574();
			}
			local9.anIntArray214[local84++] = local90;
		}
		return local9;
	}
}
