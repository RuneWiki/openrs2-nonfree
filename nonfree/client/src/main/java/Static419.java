import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[[Lclient!tq;")
	public static Class239[][] aClass239ArrayArray2;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!bn;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public static int anInt7008 = 0;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!tq;")
	public static Class239 aClass239_16 = null;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method5689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static252.aClass201_5.method4452(Static329.aClass231_95.method5138(Static382.anInt6289));
		@Pc(24) int local24;
		for (@Pc(18) Class6_Sub33 local18 = (Class6_Sub33) Static307.aClass88_23.method1882(); local18 != null; local18 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			local24 = Static360.method5069(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static228.anInt3878 * 16 + 21;
		@Pc(53) int local53 = arg1 - local13 / 2;
		if (local13 + local53 > Static235.anInt4053) {
			local53 = Static235.anInt4053 - local13;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(73) int local73 = arg0;
		if (local24 + arg0 > Static381.anInt6279) {
			local73 = Static381.anInt6279 - local24;
		}
		Static203.anInt3581 = local53;
		if (local73 < 0) {
			local73 = 0;
		}
		Static236.anInt4059 = local73;
		Static206.aBoolean239 = true;
		Static265.anInt4552 = local13;
		Static122.anInt2156 = Static228.anInt3878 * 16 + (Static312.aBoolean355 ? 26 : 22);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
	public static void method5690(@OriginalArg(0) int arg0) {
		Static43.anInt913 = arg0;
		Static253.aClass220_38.method4999();
	}
}
