import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array8;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "Lclient!kq;")
	public static Class136 aClass136_7;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_81 = new Class2(1, 3);

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_116 = new Class253(84, 7);

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "[I")
	public static int[] anIntArray464 = new int[2];

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	public static int anInt5179 = -1;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lclient!go;")
	public static Class95 method4088(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(15) int local15 = arg0 & 0xFFFF;
		if (Static294.aClass95ArrayArray3[local11] == null || Static294.aClass95ArrayArray3[local11][local15] == null) {
			@Pc(29) boolean local29 = Static252.method3355(local11);
			if (!local29) {
				return null;
			}
		}
		return Static294.aClass95ArrayArray3[local11][local15];
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIJ)V")
	public static void method4093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg2 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static253.method3388(local22, true, arg0, 0, 0, local10, arg1, 0);
			return;
		}
		@Pc(43) Class189 local43 = Static411.aClass142_4.method3148(local29);
		@Pc(56) int local56;
		@Pc(53) int local53;
		if (local22 == 0 || local22 == 2) {
			local53 = local43.anInt5110;
			local56 = local43.anInt5073;
		} else {
			local53 = local43.anInt5073;
			local56 = local43.anInt5110;
		}
		@Pc(67) int local67 = local43.anInt5083;
		if (local22 != 0) {
			local67 = (local67 << local22 & 0xF) + (local67 >> 4 - local22);
		}
		Static253.method3388(0, true, arg0, local67, local53, 0, arg1, local56);
	}
}
