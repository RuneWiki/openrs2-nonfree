import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Lclient!bb;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
	public static int anInt3197;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "[S")
	public static short[] aShortArray45;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
	public static final int[] anIntArray277 = new int[13];

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	public static int anInt3199 = 0;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	public static void method2924() {
		@Pc(5) Class198 local5 = Static170.aClass198_129;
		synchronized (Static170.aClass198_129) {
			Static170.aClass198_129.method5209();
		}
		local5 = Static245.aClass198_178;
		synchronized (Static245.aClass198_178) {
			Static245.aClass198_178.method5209();
		}
		local5 = Static142.aClass198_109;
		synchronized (Static142.aClass198_109) {
			Static142.aClass198_109.method5209();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III[Lclient!qr;II[BLclient!vq;IBZI)V")
	public static void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class170[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class47 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(18) Class4_Sub11 local18 = new Class4_Sub11(arg6);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method3416();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method3457();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local18.method3440();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (arg0 == local58 && local54 >= arg2 && arg2 + 8 > local54 && arg8 <= local48 && local48 < arg8 + 8) {
					@Pc(97) Class18 local97 = Static113.method2380(local20);
					@Pc(114) int local114 = Static237.method5583(local54 & 0x7, local70, local48 & 0x7, arg10, local97.anInt529, local97.anInt532) + arg5;
					@Pc(131) int local131 = Static291.method4879(local97.anInt529, local54 & 0x7, arg10, local70, local97.anInt532, local48 & 0x7) + arg1;
					if (local114 > 0 && local131 > 0 && local114 < Static350.anInt6637 - 1 && local131 < Static105.anInt2647 - 1) {
						@Pc(154) Class170 local154 = null;
						if (!arg9) {
							@Pc(158) int local158 = arg4;
							if ((Static2.aByteArrayArrayArray1[1][local114][local131] & 0x2) == 2) {
								local158 = arg4 - 1;
							}
							if (local158 >= 0) {
								local154 = arg3[local158];
							}
						}
						Static55.method1173(-1, local20, local154, local131, true, local114, local66, arg4, arg7, arg10 + local70 & 0x3, arg9, arg4);
					}
				}
			}
		}
	}
}
