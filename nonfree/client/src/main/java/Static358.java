import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "Z")
	public static boolean aBoolean485;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!nh;)I", line = 3)
	public static int method6416(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4162;
		@Pc(12) Class222 local12 = arg0.method4333();
		if (arg0.aBoolean317) {
			local8 = arg0.anInt4161;
		} else if (local12.anInt6251 == arg0.anInt4577 || local12.anInt6280 == arg0.anInt4577 || local12.anInt6289 == arg0.anInt4577 || local12.anInt6259 == arg0.anInt4577) {
			local8 = arg0.anInt4190;
		} else if (local12.anInt6253 == arg0.anInt4577 || local12.anInt6287 == arg0.anInt4577 || local12.anInt6255 == arg0.anInt4577 || local12.anInt6272 == arg0.anInt4577) {
			local8 = arg0.anInt4181;
		}
		return local8;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIB)V", line = 32)
	public static void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(18) int local18 = arg1 - arg2;
		@Pc(23) int local23 = arg0 - arg3;
		if (local18 == 0) {
			if (local23 != 0) {
				Static147.method2793(arg0, arg3, arg4, arg2);
			}
		} else if (local23 == 0) {
			Static121.method2436(arg2, arg4, arg3, arg1);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(64) int local64 = arg3 - (local55 * arg2 >> 12);
			@Pc(72) int local72;
			@Pc(80) int local80;
			if (Class25_Sub1.anInt675 > arg2) {
				local72 = Class25_Sub1.anInt675;
				local80 = (Class25_Sub1.anInt675 * local55 >> 12) + local64;
			} else if (Class61.anInt1835 < arg2) {
				local72 = Class61.anInt1835;
				local80 = (local55 * Class61.anInt1835 >> 12) + local64;
			} else {
				local80 = arg3;
				local72 = arg2;
			}
			@Pc(106) int local106;
			@Pc(108) int local108;
			if (arg1 < Class25_Sub1.anInt675) {
				local108 = (Class25_Sub1.anInt675 * local55 >> 12) + local64;
				local106 = Class25_Sub1.anInt675;
			} else if (arg1 <= Class61.anInt1835) {
				local106 = arg1;
				local108 = arg0;
			} else {
				local108 = (local55 * Class61.anInt1835 >> 12) + local64;
				local106 = Class61.anInt1835;
			}
			if (Class2_Sub40.anInt6819 > local108) {
				local108 = Class2_Sub40.anInt6819;
				local106 = (Class2_Sub40.anInt6819 - local64 << 12) / local55;
			} else if (Class2_Sub20.anInt2951 < local108) {
				local106 = (Class2_Sub20.anInt2951 - local64 << 12) / local55;
				local108 = Class2_Sub20.anInt2951;
			}
			if (local80 < Class2_Sub40.anInt6819) {
				local80 = Class2_Sub40.anInt6819;
				local72 = (Class2_Sub40.anInt6819 - local64 << 12) / local55;
			} else if (Class2_Sub20.anInt2951 < local80) {
				local72 = (Class2_Sub20.anInt2951 - local64 << 12) / local55;
				local80 = Class2_Sub20.anInt2951;
			}
			Static304.method5577(local106, local72, local108, local80, arg4);
		}
	}
}
