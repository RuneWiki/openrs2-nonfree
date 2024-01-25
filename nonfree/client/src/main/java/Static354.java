import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_38 = new Class249();

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "[Lclient!vq;")
	public static final Class2_Sub13_Sub18[] aClass2_Sub13_Sub18Array3 = new Class2_Sub13_Sub18[14];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)I")
	public static int method5545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
	public static void method5546() {
		for (@Pc(10) Class2_Sub34 local10 = (Class2_Sub34) Static465.aClass249_64.method6527(); local10 != null; local10 = (Class2_Sub34) Static465.aClass249_64.method6525()) {
			if (local10.anInt5717 > 0) {
				local10.anInt5717--;
			}
			if (local10.anInt5717 != 0) {
				if (local10.anInt5725 > 0) {
					local10.anInt5725--;
				}
				if (local10.anInt5725 == 0 && local10.anInt5719 >= 1 && local10.anInt5726 >= 1 && Static363.anInt1158 - 2 >= local10.anInt5719 && Static511.anInt8889 - 2 >= local10.anInt5726 && (local10.anInt5718 < 0 || Static56.method1040(local10.anInt5724, local10.anInt5718))) {
					Static421.method6556(-1, local10.anInt5724, local10.anInt5726, local10.anInt5715, local10.anInt5719, local10.anInt5718, local10.anInt5723, local10.anInt5720);
					local10.anInt5725 = -1;
					if (local10.anInt5716 == local10.anInt5718 && local10.anInt5716 == -1) {
						local10.method7802();
					} else if (local10.anInt5718 == local10.anInt5716 && local10.anInt5715 == local10.anInt5727 && local10.anInt5722 == local10.anInt5724) {
						local10.method7802();
					}
				}
			} else if (local10.anInt5716 < 0 || Static56.method1040(local10.anInt5722, local10.anInt5716)) {
				Static421.method6556(-1, local10.anInt5722, local10.anInt5726, local10.anInt5727, local10.anInt5719, local10.anInt5716, local10.anInt5723, local10.anInt5720);
				local10.method7802();
			}
		}
	}
}
