import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_111 = new Class314(36, 3);

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!ef;")
	public static final Class88 aClass88_3 = new Class88();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZII)I")
	public static int method6639(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub52 local8 = Static504.method7331(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray654.length > arg2) {
			return local8.anIntArray654[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public static void method6641() {
		for (@Pc(10) Class3_Sub40 local10 = (Class3_Sub40) Static580.aClass25_45.method435(); local10 != null; local10 = (Class3_Sub40) Static580.aClass25_45.method432()) {
			if (local10.aClass172_Sub1_1.method7044()) {
				Static558.method7939(local10.anInt7435);
			} else {
				local10.aClass172_Sub1_1.method7054();
				try {
					local10.aClass172_Sub1_1.method7038();
				} catch (@Pc(33) Exception local33) {
					Static296.method5075(local33, "TV: " + local10.anInt7435);
					Static558.method7939(local10.anInt7435);
				}
				if (!local10.aBoolean533 && !local10.aBoolean532) {
					@Pc(59) Class3_Sub23_Sub2 local59 = local10.aClass172_Sub1_1.method7049();
					if (local59 != null) {
						@Pc(65) Class3_Sub3_Sub2 local65 = local59.method4284();
						if (local65 != null) {
							local65.method2575(local10.anInt7436);
							Static304.aClass3_Sub3_Sub3_3.method2975(local65);
							local10.aBoolean533 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!rp;I)[Lclient!ub;")
	public static Class334[] method6643(@OriginalArg(0) Class298 arg0) {
		if (!arg0.method7271()) {
			return new Class334[0];
		}
		@Pc(16) Class174 local16 = arg0.method7280();
		while (local16.anInt5121 == 0) {
			Static143.method2414(10L);
		}
		if (local16.anInt5121 == 2) {
			return new Class334[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject12;
		@Pc(44) Class334[] local44 = new Class334[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(52) Class334 local52 = new Class334();
			local44[local46] = local52;
			local52.anInt9336 = local38[local46 << 2];
			local52.anInt9335 = local38[(local46 << 2) + 1];
			local52.anInt9334 = local38[(local46 << 2) + 2];
			local52.anInt9333 = local38[(local46 << 2) + 3];
		}
		return local44;
	}
}
