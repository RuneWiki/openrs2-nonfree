import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I[B)Lclient!ue;")
	public static Class6_Sub2_Sub21 method3316(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class6_Sub2_Sub21 local9 = new Class6_Sub2_Sub21();
		@Pc(14) Class6_Sub15 local14 = new Class6_Sub15(arg0);
		local14.anInt3174 = local14.aByteArray20.length - 2;
		@Pc(32) int local32 = local14.method3018();
		@Pc(42) int local42 = local14.aByteArray20.length - local32 - 16 - 2;
		local14.anInt3174 = local42;
		@Pc(49) int local49 = local14.method3015();
		local9.anInt9640 = local14.method3018();
		local9.anInt9641 = local14.method3018();
		local9.anInt9642 = local14.method3018();
		local9.anInt9636 = local14.method3018();
		local9.anInt9635 = local14.method3018();
		local9.anInt9638 = local14.method3018();
		@Pc(85) int local85 = local14.method3030();
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (local85 > 0) {
			local9.aClass74Array1 = new Class74[local85];
			for (local93 = 0; local93 < local85; local93++) {
				local99 = local14.method3018();
				@Pc(106) Class74 local106 = new Class74(Static314.method4970(local99));
				local9.aClass74Array1[local93] = local106;
				while (local99-- > 0) {
					@Pc(117) int local117 = local14.method3015();
					@Pc(123) int local123 = local14.method3015();
					local106.method1399(new Class6_Sub6(local123), (long) local117);
				}
			}
		}
		local14.anInt3174 = 0;
		local9.aString115 = local14.method2986();
		local9.anIntArray629 = new int[local49];
		local93 = 0;
		while (local42 > local14.anInt3174) {
			local99 = local14.method3018();
			if (local99 == 3) {
				if (local9.aStringArray39 == null) {
					local9.aStringArray39 = new String[local49];
				}
				local9.aStringArray39[local93] = local14.method3046().intern();
			} else if (local99 == 54) {
				if (local9.aLongArray20 == null) {
					local9.aLongArray20 = new long[local49];
				}
				local9.aLongArray20[local93] = local14.method3049();
			} else {
				if (local9.anIntArray631 == null) {
					local9.anIntArray631 = new int[local49];
				}
				if (local99 >= 150 || local99 == 21 || local99 == 38 || local99 == 39) {
					local9.anIntArray631[local93] = local14.method3030();
				} else {
					local9.anIntArray631[local93] = local14.method3015();
				}
			}
			local9.anIntArray629[local93++] = local99;
		}
		return local9;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method3317(@OriginalArg(0) int arg0) {
		@Pc(27) byte[] local27;
		if (arg0 == 100 && Static385.anInt6671 > 0) {
			local27 = Static663.aByteArrayArray194[--Static385.anInt6671];
			Static663.aByteArrayArray194[Static385.anInt6671] = null;
			return local27;
		} else if (arg0 == 5000 && Static481.anInt8160 > 0) {
			local27 = Static427.aByteArrayArray130[--Static481.anInt8160];
			Static427.aByteArrayArray130[Static481.anInt8160] = null;
			return local27;
		} else if (arg0 == 30000 && Static391.anInt6753 > 0) {
			local27 = Static48.aByteArrayArray122[--Static391.anInt6753];
			Static48.aByteArrayArray122[Static391.anInt6753] = null;
			return local27;
		} else {
			if (Static345.aByteArrayArrayArray16 != null) {
				for (@Pc(84) int local84 = 0; local84 < Static600.anIntArray615.length; local84++) {
					if (arg0 == Static600.anIntArray615[local84] && Static520.anIntArray564[local84] > 0) {
						@Pc(109) byte[] local109 = Static345.aByteArrayArrayArray16[local84][--Static520.anIntArray564[local84]];
						Static345.aByteArrayArrayArray16[local84][Static520.anIntArray564[local84]] = null;
						return local109;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[B)V")
	public static synchronized void method3318(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static385.anInt6671 < 1000) {
			Static663.aByteArrayArray194[Static385.anInt6671++] = arg0;
		} else if (arg0.length == 5000 && Static481.anInt8160 < 250) {
			Static427.aByteArrayArray130[Static481.anInt8160++] = arg0;
		} else if (arg0.length == 30000 && Static391.anInt6753 < 50) {
			Static48.aByteArrayArray122[Static391.anInt6753++] = arg0;
		} else if (Static345.aByteArrayArrayArray16 != null) {
			for (@Pc(81) int local81 = 0; local81 < Static600.anIntArray615.length; local81++) {
				if (Static600.anIntArray615[local81] == arg0.length && Static345.aByteArrayArrayArray16[local81].length > Static520.anIntArray564[local81]) {
					Static345.aByteArrayArrayArray16[local81][Static520.anIntArray564[local81]++] = arg0;
					return;
				}
			}
		}
	}
}
