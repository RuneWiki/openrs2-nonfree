import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array17;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!hp;")
	public static Interface6 anInterface6_1 = new Class124();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!va;)I")
	public static int method2345(@OriginalArg(1) Class15_Sub2_Sub4 arg0) {
		if (arg0.anInt8930 == 0) {
			return 0;
		}
		@Pc(63) int local63;
		@Pc(56) int local56;
		if (arg0.anInt8927 != -1) {
			@Pc(15) Class15_Sub2_Sub4 local15 = null;
			if (arg0.anInt8927 < 32768) {
				@Pc(29) Class6_Sub49 local29 = (Class6_Sub49) Static251.aClass234_29.method5464((long) arg0.anInt8927);
				if (local29 != null) {
					local15 = local29.aClass15_Sub2_Sub4_Sub1_2;
				}
			} else if (arg0.anInt8927 >= 32768) {
				local15 = Static551.aClass15_Sub2_Sub4_Sub2Array1[arg0.anInt8927 - 32768];
			}
			if (local15 != null) {
				local56 = arg0.anInt8911 - local15.anInt8911;
				local63 = arg0.anInt8913 - local15.anInt8913;
				if (local56 != 0 || local63 != 0) {
					arg0.method7125((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class15_Sub2_Sub4_Sub2) {
			@Pc(171) Class15_Sub2_Sub4_Sub2 local171 = (Class15_Sub2_Sub4_Sub2) arg0;
			if (local171.anInt9036 != -1 && (local171.anInt8998 == 0 || local171.anInt8995 > 0)) {
				local171.method7125(local171.anInt9036);
				local171.anInt9036 = -1;
			}
		} else if (arg0 instanceof Class15_Sub2_Sub4_Sub1) {
			@Pc(99) Class15_Sub2_Sub4_Sub1 local99 = (Class15_Sub2_Sub4_Sub1) arg0;
			if (local99.anInt5186 != -1 && (local99.anInt8998 == 0 || local99.anInt8995 > 0)) {
				local56 = local99.anInt8911 - (local99.anInt5186 - Static150.anInt2792 - Static150.anInt2792) * 256;
				local63 = local99.anInt8913 - (local99.anInt5183 - Static154.anInt2878 - Static154.anInt2878) * 256;
				if (local56 != 0 || local63 != 0) {
					local99.method7125((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
				local99.anInt5186 = -1;
			}
		}
		return arg0.method7132();
	}
}
