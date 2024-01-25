import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jo", name = "ib", descriptor = "Lclient!hp;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!jo", name = "gb", descriptor = "Lclient!pha;")
	public static final Class256 aClass256_3 = new Class256();

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIBII)Lclient!om;")
	public static Class57 method4716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 76724863L ^ (long) arg5 * 475427L ^ (long) arg4 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 986053L ^ (long) arg0 * 32147369L;
		@Pc(39) Class57 local39 = (Class57) Static409.aClass166_38.method4805(local33);
		if (local39 == null) {
			local39 = Static6.aClass100_1.method8829(arg4, arg3, arg5, arg1, arg0, arg2);
			Static409.aClass166_38.method4803(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!vd;)I")
	public static int method4728(@OriginalArg(1) Class353 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method8401(Static224.anInt4364)) {
			local10++;
		}
		if (arg0.method8401(Static595.anInt9908)) {
			local10++;
		}
		if (arg0.method8401(Static466.anInt7616)) {
			local10++;
		}
		if (arg0.method8401(Static482.anInt8354)) {
			local10++;
		}
		if (arg0.method8401(Static64.anInt10320)) {
			local10++;
		}
		if (arg0.method8401(Static116.anInt2276)) {
			local10++;
		}
		if (arg0.method8401(Static94.anInt1855)) {
			local10++;
		}
		if (arg0.method8401(Static499.anInt8643)) {
			local10++;
		}
		if (arg0.method8401(Static274.anInt7991)) {
			local10++;
		}
		if (arg0.method8401(Static188.anInt5454)) {
			local10++;
		}
		if (arg0.method8401(Static386.anInt5554)) {
			local10++;
		}
		if (arg0.method8401(Static560.anInt9546)) {
			local10++;
		}
		if (arg0.method8401(Static484.anInt8383)) {
			local10++;
		}
		if (arg0.method8401(Static240.anInt4805)) {
			local10++;
		}
		if (arg0.method8401(Static326.anInt6218)) {
			local10++;
		}
		if (arg0.method8401(Static572.anInt9597)) {
			local10++;
		}
		return local10;
	}
}
