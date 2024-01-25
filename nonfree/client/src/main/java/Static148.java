import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "Lclient!rc;")
	public static Class285 aClass285_9;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_84 = new Class71(72, 6);

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_34 = new Class43();

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
	public static int anInt6592 = 0;

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
	public static int anInt6593 = -1;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!gh;Ljava/lang/Object;B)V")
	public static void method5409(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static214.method4061(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!rr;[Lclient!ada;)V")
	public static void method5411(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) Class8_Sub1[] arg1) {
		@Pc(6) int local6;
		if (Static172.aBoolean300) {
			local6 = arg0.method8329(arg1);
			Static269.aClass16_11.method6052(local6, arg1);
		}
		if (Static253.aClass86Array4 == Static34.aClass86Array5) {
			@Pc(28) int local28;
			if (arg0 instanceof Class15_Sub1_Sub2) {
				local6 = ((Class15_Sub1_Sub2) arg0).aShort105;
				local28 = ((Class15_Sub1_Sub2) arg0).aShort103;
			} else {
				local6 = arg0.anInt10301 >> Static172.anInt4156;
				local28 = arg0.anInt10298 >> Static172.anInt4156;
			}
			Static269.aClass16_11.EA(Static86.aClass86Array2[0].method8088(arg0.anInt10298, arg0.anInt10301), Static546.method7688(local6, local28), Static563.method7839(local6, local28), Static614.method5485(local6, local28));
		}
		@Pc(64) Class15_Sub7 local64 = arg0.method8331(Static269.aClass16_11);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean741) {
			@Pc(72) Class15_Sub6[] local72 = local64.aClass15_Sub6Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class15_Sub6 local79 = local72[local74];
				if (local79.aBoolean394) {
					Static460.method6945(local79.anInt5265 - local79.anInt5264, local79.anInt5266 + local79.anInt5264, local79.anInt5263 - local79.anInt5264, local79.anInt5262 + local79.anInt5264);
				}
			}
		}
		if (local64.aBoolean429) {
			local64.aClass15_Sub1_14 = arg0;
			if (Static403.aBoolean556) {
				@Pc(119) Class194 local119 = Static40.aClass194_2;
				synchronized (Static40.aClass194_2) {
					Static40.aClass194_2.method5082(local64);
					return;
				}
			}
			Static40.aClass194_2.method5082(local64);
			return;
		}
		Static513.method7386(local64);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)[Lclient!kda;")
	public static Class173[] method5412() {
		return new Class173[] { Static538.aClass173_12, Static502.aClass173_10, Static342.aClass173_8 };
	}
}
