import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	public static int anInt5691;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public static final int anInt5686 = 2;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_7 = new Class180("", 16);

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_201 = new Class184(74, 8);

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	public static final int anInt5694 = 1401;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!qa;BIILclient!jt;I)V")
	public static void method4570(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class208 local11 = Static404.aClass123_3.method3180(arg3.anInt4028);
		if (local11.anInt6540 == -1) {
			return;
		}
		if (arg3.aBoolean320) {
			@Pc(25) int local25 = arg4 + arg3.anInt4006;
			arg4 = local25 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(40) Class22 local40 = local11.method5144(arg4, arg3.aBoolean321, arg0);
		if (local40 == null) {
			return;
		}
		@Pc(46) int local46 = arg3.anInt4004;
		@Pc(49) int local49 = arg3.anInt4036;
		if ((arg4 & 0x1) == 1) {
			local49 = arg3.anInt4004;
			local46 = arg3.anInt4036;
		}
		@Pc(75) int local75 = local40.ja();
		@Pc(78) int local78 = local40.JA();
		if (local11.aBoolean454) {
			local78 = local49 * 4;
			local75 = local46 * 4;
		}
		if (local11.anInt6535 == 0) {
			local40.method6075(arg1, arg2 + 4 - local49 * 4, local75, local78);
		} else {
			local40.M(arg1, arg2 + 4 - local49 * 4, local75, local78, 0, local11.anInt6535 | 0xFF000000, 1);
		}
	}
}
