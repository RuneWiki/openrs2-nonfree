import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "Lclient!vj;")
	public static final Class344 aClass344_2 = new Class344();

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Lclient!vj;")
	public static final Class344 aClass344_5 = new Class344();

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!vj;")
	public static final Class344 aClass344_3 = new Class344();

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Lclient!vj;")
	public static final Class344 aClass344_4 = new Class344();

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt9341 = -1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
	public static void method7588() {
		for (@Pc(1) int local1 = Static567.anInt9400; local1 < Static175.anInt9133; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static27.anInt373; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static507.anInt8645; local7++) {
					@Pc(16) Class39 local16 = Static292.aClass39ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class8_Sub3_Sub4 local21 = local16.aClass8_Sub3_Sub4_1;
						@Pc(24) Class8_Sub3_Sub4 local24 = local16.aClass8_Sub3_Sub4_2;
						if (local21 != null && local21.method7629()) {
							Static459.method6334(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7629()) {
								Static459.method6334(local24, local1, local4, local7, 1, 1);
								local24.method7623(0, false, Static402.aClass134_11, local21, 0, 0);
								local24.method7617();
							}
							local21.method7617();
						}
						for (@Pc(68) Class111 local68 = local16.aClass111_1; local68 != null; local68 = local68.aClass111_2) {
							@Pc(72) Class8_Sub3_Sub3 local72 = local68.aClass8_Sub3_Sub3_1;
							if (local72 != null && local72.method7629()) {
								Static459.method6334(local72, local1, local4, local7, local72.aShort133 + 1 - local72.aShort132, local72.aShort130 - local72.aShort131 + 1);
								local72.method7617();
							}
						}
						@Pc(108) Class8_Sub3_Sub1 local108 = local16.aClass8_Sub3_Sub1_1;
						if (local108 != null && local108.method7629()) {
							Static299.method4185(local108, local1, local4, local7);
							local108.method7617();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	public static int method7589(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return ~local37 & arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!kj;)I")
	public static int method7591(@OriginalArg(1) Class192 arg0) {
		if (Static430.aClass192_2 == arg0) {
			return 5890;
		} else if (arg0 == Static468.aClass192_3) {
			return 34167;
		} else if (Static493.aClass192_4 == arg0) {
			return 34168;
		} else if (Static308.aClass192_1 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
