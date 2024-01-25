import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I")
	public static int method4101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILclient!gl;)Lclient!ci;")
	public static Class4_Sub1_Sub4 method4106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2) {
		@Pc(10) int local10 = arg0 << 8 | arg2.anInt2619;
		@Pc(19) Class4_Sub1_Sub4 local19 = (Class4_Sub1_Sub4) Static358.aClass24_3.method655((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static4.aClass166_6.method3684(Static4.aClass166_6.method3665(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 8 | arg2.anInt2619;
			local19 = (Class4_Sub1_Sub4) Static358.aClass24_3.method655((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static4.aClass166_6.method3684(Static4.aClass166_6.method3665(local10));
			if (local31 == null) {
				local10 = arg2.anInt2619 | 0xFFFF00;
				local19 = (Class4_Sub1_Sub4) Static358.aClass24_3.method655((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static4.aClass166_6.method3684(Static4.aClass166_6.method3665(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static405.method5346(local31);
					local19.aClass93_4 = arg2;
					Static358.aClass24_3.method660(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static405.method5346(local31);
				local19.aClass93_4 = arg2;
				Static358.aClass24_3.method660(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static405.method5346(local31);
			local19.aClass93_4 = arg2;
			Static358.aClass24_3.method660(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg1 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(22) Class4_Sub39 local22 = (Class4_Sub39) Static183.aClass196_17.method4477(local14);
		if (local22 == null) {
			local22 = new Class4_Sub39();
			Static183.aClass196_17.method4474(local14, local22);
		}
		if (arg0 >= local22.anIntArray589.length) {
			@Pc(43) int[] local43 = new int[arg0 + 1];
			@Pc(48) int[] local48 = new int[arg0 + 1];
			for (@Pc(50) int local50 = 0; local50 < local22.anIntArray589.length; local50++) {
				local43[local50] = local22.anIntArray589[local50];
				local48[local50] = local22.anIntArray588[local50];
			}
			for (@Pc(76) int local76 = local22.anIntArray589.length; local76 < arg0; local76++) {
				local43[local76] = -1;
				local48[local76] = 0;
			}
			local22.anIntArray589 = local43;
			local22.anIntArray588 = local48;
		}
		local22.anIntArray589[arg0] = arg2;
		local22.anIntArray588[arg0] = arg3;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)I")
	public static int method4113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}
}
