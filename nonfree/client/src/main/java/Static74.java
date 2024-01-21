import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public static int anInt2248;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public static int anInt2245 = 0;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_541 = Static8.method128("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 method1570() {
		@Pc(9) Class1_Sub1_Sub8_Sub3 local9 = new Class1_Sub1_Sub8_Sub3();
		local9.anInt2317 = Static145.anIntArray375[0];
		local9.anInt2316 = Static47.anInt4239;
		local9.anInt2319 = Static131.anIntArray333[0];
		local9.anInt2314 = Static26.anIntArray54[0];
		local9.anInt2318 = Static129.anIntArray331[0];
		@Pc(36) byte[] local36 = Static22.aByteArrayArray4[0];
		local9.anInt2315 = Static101.anInt3032;
		@Pc(45) int local45 = local9.anInt2314 * local9.anInt2317;
		local9.anIntArray203 = new int[local45];
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			local9.anIntArray203[local51] = Static9.anIntArray13[local36[local51] & 0xFF];
		}
		Static76.method1682();
		return local9;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIII)V")
	public static void method1571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static180.anInt4780; local3++) {
			if (Static24.anIntArray49[local3] + Static146.anIntArray376[local3] > arg2 && arg2 + arg1 > Static146.anIntArray376[local3] && arg3 < Static97.anIntArray265[local3] + Static154.anIntArray391[local3] && Static97.anIntArray265[local3] < arg3 + arg0) {
				Static9.aBooleanArray1[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ea;Lclient!ea;Lclient!dd;)[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] method1573(@OriginalArg(1) Class18 arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(9) int local9 = arg2.method2246(arg0);
		@Pc(19) int local19 = arg2.method2251(arg1, local9);
		return Static3.method74(local19, local9, arg2);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Lclient!fh;[BIILclient!re;IIIII)V")
	public static void method1574(@OriginalArg(0) int arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class68 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) Class1_Sub6 local10 = new Class1_Sub6(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method527();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method527();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local10.method544();
				@Pc(48) int local48 = local28 >> 12;
				@Pc(52) int local52 = local28 & 0x3F;
				@Pc(58) int local58 = local28 >> 6 & 0x3F;
				@Pc(62) int local62 = local44 >> 2;
				@Pc(66) int local66 = local44 & 0x3;
				if (arg3 == local48 && local58 >= arg4 && local58 < arg4 + 8 && local52 >= arg8 && arg8 + 8 > local52) {
					@Pc(105) Class1_Sub1_Sub11 local105 = Static62.method1274(local16);
					@Pc(123) int local123 = arg0 + Static163.method3018(local52 & 0x7, local105.anInt2815, local105.anInt2822, local66, local58 & 0x7, arg9);
					@Pc(140) int local140 = arg7 + Static107.method2200(arg9, local52 & 0x7, local105.anInt2815, local66, local58 & 0x7, local105.anInt2822);
					if (local123 > 0 && local140 > 0 && local123 < 103 && local140 < 103) {
						@Pc(152) Class22 local152 = null;
						@Pc(154) int local154 = arg6;
						if ((Static2.aByteArrayArrayArray1[1][local123][local140] & 0x2) == 2) {
							local154 = arg6 - 1;
						}
						if (local154 >= 0) {
							local152 = arg1[local154];
						}
						Static119.method2351(local16, local62, local66 + arg9 & 0x3, arg6, arg5, local140, local123, local152);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public static void method1575() {
		aClass18_541 = null;
		aRandom1 = null;
		anIntArray198 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	public static void method1576() {
		if (Static80.aClass23_1 != null) {
			@Pc(11) Class23 local11 = Static80.aClass23_1;
			synchronized (Static80.aClass23_1) {
				Static80.aClass23_1 = null;
			}
		}
	}
}
