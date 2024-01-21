import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
	public static final int anInt445 = 50;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	public static int anInt450 = 0;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Lclient!kb;")
	public static Class46 aClass46_131 = Static65.method1172("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!kb;ZLclient!jg;Lclient!kb;)[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] method362(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(8) int local8 = arg1.method1617(arg0);
		@Pc(19) int local19 = arg1.method1631(arg2, local8);
		return Static125.method2147(arg1, local19, local8);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!mc;II)V")
	public static void method363(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static12.method2889(arg0.anInt1711, arg1, arg0.anInt1700);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	public static void method364() {
		aClass46_131 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!kb;)V")
	public static void method365(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(11) Class46 local11 = arg1.method1372().method1371();
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < Static180.anInt3971; local19++) {
			@Pc(27) Class3_Sub2_Sub1_Sub1_Sub1 local27 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local19]];
			if (local27 != null && local27.aClass46_233 != null && local27.aClass46_233.method1389(local11)) {
				local17 = true;
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local27.anIntArray163[0], 0, 1, 0, local27.anIntArray160[0]);
				if (arg0 == 1) {
					Static133.aClass3_Sub4_Sub1_3.method233(204);
					Static133.aClass3_Sub4_Sub1_3.method198(Static127.anIntArray338[local19]);
				} else if (arg0 == 4) {
					Static133.aClass3_Sub4_Sub1_3.method233(111);
					Static133.aClass3_Sub4_Sub1_3.method183(Static127.anIntArray338[local19]);
				} else if (arg0 == 6) {
					Static133.aClass3_Sub4_Sub1_3.method233(159);
					Static133.aClass3_Sub4_Sub1_3.method198(Static127.anIntArray338[local19]);
				} else if (arg0 == 7) {
					Static133.aClass3_Sub4_Sub1_3.method233(175);
					Static133.aClass3_Sub4_Sub1_3.method183(Static127.anIntArray338[local19]);
				}
				break;
			}
		}
		if (!local17) {
			Static168.method2686(0, Static38.aClass46_298, Static178.method2860(new Class46[] { Static53.aClass46_463, local11 }));
		}
	}
}
