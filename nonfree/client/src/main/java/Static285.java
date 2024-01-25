import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	public static int anInt5876;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "Lclient!gq;")
	public static final Class117 aClass117_9 = new Class117();

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "[I")
	public static final int[] anIntArray344 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
	public static int anInt5873 = 0;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "[I")
	public static final int[] anIntArray345 = new int[256];

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!nha;BII)Lclient!jea;")
	public static Class3_Sub1_Sub9 method4970(@OriginalArg(0) Class229 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt7099 | arg2 << 10;
		@Pc(24) Class3_Sub1_Sub9 local24 = (Class3_Sub1_Sub9) Static367.aClass345_3.method8056((long) local10 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static347.aClass181_63.method5049(Static347.aClass181_63.method5037(local10));
		if (local36 == null) {
			local10 = arg0.anInt7099 | arg1 + 65536 << 10;
			local24 = (Class3_Sub1_Sub9) Static367.aClass345_3.method8056((long) local10 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static347.aClass181_63.method5049(Static347.aClass181_63.method5037(local10));
			if (local36 == null) {
				local10 = arg0.anInt7099 | 0x3FFFC00;
				local24 = (Class3_Sub1_Sub9) Static367.aClass345_3.method8056((long) local10 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static347.aClass181_63.method5049(Static347.aClass181_63.method5037(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local24 = Static47.method1113(local36);
					} catch (@Pc(192) Exception local192) {
						throw new RuntimeException(local192.getMessage() + " S: " + local10);
					}
					local24.aClass229_6 = arg0;
					Static367.aClass345_3.method8058(local24, (long) local10 << 16);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local24 = Static47.method1113(local36);
				} catch (@Pc(124) Exception local124) {
					throw new RuntimeException(local124.getMessage() + " S: " + local10);
				}
				local24.aClass229_6 = arg0;
				Static367.aClass345_3.method8058(local24, (long) local10 << 16);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local24 = Static47.method1113(local36);
			} catch (@Pc(52) Exception local52) {
				throw new RuntimeException(local52.getMessage() + " S: " + local10);
			}
			local24.aClass229_6 = arg0;
			Static367.aClass345_3.method8058(local24, (long) local10 << 16);
			return local24;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBIIII)V")
	public static void method4971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(43) int local43 = (1 - local33) * local17 + local25;
		@Pc(51) int local51 = local21 - local29 * (local33 - 1);
		@Pc(55) int local55 = local17 << 2;
		@Pc(59) int local59 = local21 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = ((arg2 << 1) - 3) * local29;
		@Pc(81) int local81 = local59;
		Static580.method8027(Static104.anIntArrayArray24[arg3], arg1 + arg0, -arg0 + arg1, arg4);
		@Pc(101) int local101 = (arg2 - 1) * local55;
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local67;
					local51 += local81;
					local67 += local59;
					local7++;
					local81 += local59;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local43 += local67;
				local67 += local59;
				local7++;
				local81 += local59;
			}
			local51 += -local75;
			local43 += -local101;
			local75 -= local55;
			local9--;
			local101 -= local55;
			@Pc(175) int local175 = arg3 - local9;
			@Pc(179) int local179 = arg3 + local9;
			@Pc(183) int local183 = arg1 + local7;
			@Pc(188) int local188 = arg1 - local7;
			Static580.method8027(Static104.anIntArrayArray24[local175], local183, local188, arg4);
			Static580.method8027(Static104.anIntArrayArray24[local179], local183, local188, arg4);
		}
	}
}
