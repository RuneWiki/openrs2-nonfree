import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public static int anInt3282;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!nm;")
	public static Class119 aClass119_61;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!nm;")
	public static Class119 aClass119_62;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B)Lclient!lk;")
	public static Class1_Sub5_Sub13 method2826(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub5_Sub13 local9 = new Class1_Sub5_Sub13();
		@Pc(14) Class1_Sub13 local14 = new Class1_Sub13(arg0);
		local14.anInt2018 = local14.aByteArray63.length - 2;
		@Pc(27) int local27 = local14.method1879();
		@Pc(38) int local38 = local14.aByteArray63.length - local27 - 12 - 2;
		local14.anInt2018 = local38;
		@Pc(45) int local45 = local14.method1860();
		local9.anInt3162 = local14.method1879();
		local9.anInt3155 = local14.method1879();
		local9.anInt3154 = local14.method1879();
		local9.anInt3159 = local14.method1879();
		@Pc(77) int local77 = local14.method1853();
		@Pc(88) int local88;
		@Pc(95) int local95;
		if (local77 > 0) {
			local9.aClass86Array1 = new Class86[local77];
			for (local88 = 0; local88 < local77; local88++) {
				local95 = local14.method1879();
				@Pc(102) Class86 local102 = new Class86(Static138.method3842(local95));
				local9.aClass86Array1[local88] = local102;
				while (local95-- > 0) {
					@Pc(117) int local117 = local14.method1860();
					@Pc(121) int local121 = local14.method1860();
					local102.method2144(new Class1_Sub22(local121), (long) local117);
				}
			}
		}
		local14.anInt2018 = 0;
		local9.aString105 = local14.method1876();
		local9.anIntArray273 = new int[local45];
		local9.anIntArray272 = new int[local45];
		local88 = 0;
		local9.aStringArray20 = new String[local45];
		while (local38 > local14.anInt2018) {
			local95 = local14.method1879();
			if (local95 == 3) {
				local9.aStringArray20[local88] = local14.method1827().intern();
			} else if (local95 >= 100 || local95 == 21 || local95 == 38 || local95 == 39) {
				local9.anIntArray272[local88] = local14.method1853();
			} else {
				local9.anIntArray272[local88] = local14.method1860();
			}
			local9.anIntArray273[local88++] = local95;
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIBIII)Z")
	public static boolean method2827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) long local14 = Static234.method3768(arg4, arg1 + 0, arg2);
		@Pc(25) int local25;
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(43) Class150 local43;
		@Pc(62) int local62;
		@Pc(60) int[] local60;
		@Pc(86) int local86;
		if (local14 != 0L) {
			local25 = (int) local14 >> 20 & 0x3;
			local32 = (int) local14 >> 14 & 0x1F;
			local39 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local43 = Static160.method2744(local39);
			if (local43.anInt4556 == -1) {
				local60 = Static77.anIntArray131;
				local62 = arg3;
				if (local14 > 0L) {
					local62 = arg0;
				}
				local86 = arg1 * 4 + (-arg2 + 103) * 512 * 4 + 24624;
				if (local32 == 0 || local32 == 2) {
					if (local25 == 0) {
						local60[local86] = local62;
						local60[local86 + 512] = local62;
						local60[local86 + 1024] = local62;
						local60[local86 + 1536] = local62;
					} else if (local25 == 1) {
						local60[local86] = local62;
						local60[local86 + 1] = local62;
						local60[local86 + 2] = local62;
						local60[local86 + 3] = local62;
					} else if (local25 == 2) {
						local60[local86 + 3] = local62;
						local60[local86 + 512 + 3] = local62;
						local60[local86 + 3 + 1024] = local62;
						local60[local86 + 3 + 1536] = local62;
					} else if (local25 == 3) {
						local60[local86 + 1536] = local62;
						local60[local86 + 1537] = local62;
						local60[local86 + 1538] = local62;
						local60[local86 + 1536 + 3] = local62;
					}
				}
				if (local32 == 3) {
					if (local25 == 0) {
						local60[local86] = local62;
					} else if (local25 == 1) {
						local60[local86 + 3] = local62;
					} else if (local25 == 2) {
						local60[local86 + 1536 + 3] = local62;
					} else if (local25 == 3) {
						local60[local86 + 1536] = local62;
					}
				}
				if (local32 == 2) {
					if (local25 == 3) {
						local60[local86] = local62;
						local60[local86 + 512] = local62;
						local60[local86 + 1024] = local62;
						local60[local86 + 1536] = local62;
					} else if (local25 == 0) {
						local60[local86] = local62;
						local60[local86 + 1] = local62;
						local60[local86 + 2] = local62;
						local60[local86 + 3] = local62;
					} else if (local25 == 1) {
						local60[local86 + 3] = local62;
						local60[local86 + 515] = local62;
						local60[local86 + 3 + 1024] = local62;
						local60[local86 + 3 + 1536] = local62;
					} else if (local25 == 2) {
						local60[local86 + 1536] = local62;
						local60[local86 + 1536 + 1] = local62;
						local60[local86 + 2 + 1536] = local62;
						local60[local86 + 3 + 1536] = local62;
					}
				}
			} else if (!Static279.method4267(arg2, local25, arg1, local43)) {
				return false;
			}
		}
		local14 = Static209.method3471(arg4, arg1 + 0, arg2);
		if (local14 != 0L) {
			local25 = (int) local14 >> 20 & 0x3;
			local32 = (int) local14 >> 14 & 0x1F;
			local39 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			local43 = Static160.method2744(local39);
			if (local43.anInt4556 == -1) {
				if (local32 == 9) {
					local86 = 4 * 512 * (103 - arg2) + arg1 * 4 + 24624;
					local60 = Static77.anIntArray131;
					local62 = 15658734;
					if (local14 > 0L) {
						local62 = 15597568;
					}
					if (local25 == 0 || local25 == 2) {
						local60[local86 + 1536] = local62;
						local60[local86 + 1 + 1024] = local62;
						local60[local86 + 2 + 512] = local62;
						local60[local86 + 3] = local62;
					} else {
						local60[local86] = local62;
						local60[local86 + 1 + 512] = local62;
						local60[local86 + 1024 + 2] = local62;
						local60[local86 + 1539] = local62;
					}
				}
			} else if (!Static279.method4267(arg2, local25, arg1, local43)) {
				return false;
			}
		}
		local14 = Static277.method4241(arg4, arg1 + 0, arg2);
		if (local14 != 0L) {
			local32 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			@Pc(579) Class150 local579 = Static160.method2744(local32);
			local25 = (int) local14 >> 20 & 0x3;
			if (local579.anInt4556 != -1 && !Static279.method4267(arg2, local25, arg1, local579)) {
				return false;
			}
		}
		return true;
	}
}
