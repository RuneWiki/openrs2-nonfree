import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!ns;")
	public static Class166 aClass166_284;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
	public static int anInt7168;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!pg;")
	public static Class186 aClass186_257;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static int anInt7165 = 0;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_256 = new Class186(38, 28);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[50][];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!tf;[[B)V")
	public static void method5522(@OriginalArg(1) Class134_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(23) int local23 = arg1.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) byte[] local31 = arg1[local25];
			if (local31 != null) {
				@Pc(38) Class4_Sub30 local38 = new Class4_Sub30(local31);
				local44 = Static100.anIntArray134[local25] >> 8;
				@Pc(50) int local50 = Static100.anIntArray134[local25] & 0xFF;
				@Pc(57) int local57 = local44 * 64 - Static381.anInt6688;
				@Pc(63) int local63 = local50 * 64 - Static285.anInt5187;
				Static10.method281();
				arg0.method5142(Static395.aClass268Array1, Static285.anInt5187, local63, local57, Static381.anInt6688, local38);
				arg0.method5162(local12, Static16.aClass30_11, local57, local63, local38);
				if (!arg0.aBoolean442 && Static50.anInt1367 / 8 == local44 && local50 == Static33.anInt781 / 8 && local12[0] != -1) {
					Static132.aClass129_1 = Static447.aClass78_1.method1818(local12[2], Static316.aClass88_4, local12[3], local12[0], local12[1]);
					Static300.anInt5429 = local12[4];
				}
			}
		}
		for (@Pc(140) int local140 = 0; local140 < local23; local140++) {
			@Pc(152) int local152 = (Static100.anIntArray134[local140] >> 8) * 64 - Static381.anInt6688;
			local44 = (Static100.anIntArray134[local140] & 0xFF) * 64 - Static285.anInt5187;
			@Pc(166) byte[] local166 = arg1[local140];
			if (local166 == null && Static33.anInt781 < 800) {
				Static10.method281();
				arg0.method5147(local152, local44);
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIB)I")
	public static int method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static231.anInt4229 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg0 - Static137.anInt5581;
		@Pc(24) int local24 = arg2 - Static137.anInt5584;
		for (@Pc(29) Class4_Sub32 local29 = (Class4_Sub32) Static137.aClass258_37.method5538(); local29 != null; local29 = (Class4_Sub32) Static137.aClass258_37.method5528()) {
			if (arg1 == local29.anInt5601) {
				@Pc(50) int local50 = local29.anInt5605;
				@Pc(53) int local53 = local29.anInt5602;
				@Pc(63) int local63 = Static137.anInt5581 + local50 << 14 | Static137.anInt5584 + local53;
				@Pc(83) int local83 = (local24 - local53) * (-local53 + local24) + (local19 - local50) * (-local50 + local19);
				if (local12 < 0 || local83 < local14) {
					local14 = local83;
					local12 = local63;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!jb;)V")
	public static void method5524(@OriginalArg(1) Class126 arg0) {
		if (arg0.anInt3435 == Static99.anInt5862) {
			Static26.aBooleanArray2[arg0.anInt3440] = true;
		}
	}
}
