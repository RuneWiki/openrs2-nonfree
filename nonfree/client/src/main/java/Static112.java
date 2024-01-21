import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!kd;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_17;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!ef;")
	public static Class29 aClass29_7;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1104 = Static193.method3027("details)3dat");

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1105 = Static193.method3027("Welt");

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1106 = Static193.method3027("(U1");

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJZI)Lclient!oc;")
	public static Class70 method1609(@OriginalArg(1) long arg0) {
		@Pc(32) int local32 = 1;
		@Pc(37) long local37 = arg0 / (long) 10;
		while (local37 != 0L) {
			local37 /= 10;
			local32++;
		}
		@Pc(50) int local50 = local32;
		if (arg0 < 0L) {
			local50 = local32 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local50];
		if (arg0 < 0L) {
			local62[0] = 45;
		}
		for (@Pc(79) int local79 = 0; local79 < local32; local79++) {
			@Pc(86) int local86 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local86 < 0) {
				local86 = -local86;
			}
			if (local86 > 9) {
				local86 += 39;
			}
			local62[local50 - local79 - 1] = (byte) (local86 + 48);
		}
		@Pc(123) Class70 local123 = new Class70();
		local123.anInt2899 = local50;
		local123.aByteArray30 = local62;
		return local123;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
	public static void method1611() {
		for (@Pc(1) int local1 = 0; local1 < Static76.anInt1501; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static89.anInt659; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static126.anInt2489; local7++) {
					@Pc(16) Class3_Sub6 local16 = Static118.aClass3_Sub6ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class36 local21 = local16.aClass36_1;
						if (local21 != null && local21.aClass26_4.method2994()) {
							Static156.method2293(local21.aClass26_4, local1, local4, local7, 1, 1);
							if (local21.aClass26_5 != null && local21.aClass26_5.method2994()) {
								Static156.method2293(local21.aClass26_5, local1, local4, local7, 1, 1);
								local21.aClass26_4.method2996(local21.aClass26_5, 0, 0, 0, false);
								local21.aClass26_5 = local21.aClass26_5.method2992();
							}
							local21.aClass26_4 = local21.aClass26_4.method2992();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt827; local77++) {
							@Pc(83) Class99 local83 = local16.aClass99Array1[local77];
							if (local83 != null && local83.aClass26_11.method2994()) {
								Static156.method2293(local83.aClass26_11, local1, local4, local7, local83.anInt4224 + 1 - local83.anInt4226, local83.anInt4230 - local83.anInt4239 + 1);
								local83.aClass26_11 = local83.aClass26_11.method2992();
							}
						}
						@Pc(125) Class64 local125 = local16.aClass64_1;
						if (local125 != null && local125.aClass26_6.method2994()) {
							Static184.method2897(local125.aClass26_6, local1, local4, local7);
							local125.aClass26_6 = local125.aClass26_6.method2992();
						}
					}
				}
			}
		}
	}
}
