import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "Lclient!aa;")
	public static Class2 aClass2_9;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "Lclient!la;")
	public static final Class136 aClass136_131 = new Class136(31, 8);

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "[Lclient!nj;")
	public static final Class3_Sub25[] aClass3_Sub25Array1 = new Class3_Sub25[2048];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V")
	public static void method3846() {
		Static284.aClass268_40.method6160();
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	public static void method3847() {
		for (@Pc(8) int local8 = 0; local8 < Static379.anInt6398; local8++) {
			@Pc(14) int local14 = Static198.anIntArray225[local8];
			@Pc(21) Class3_Sub40 local21 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local14);
			if (local21 != null) {
				@Pc(26) Class1_Sub2_Sub6_Sub1 local26 = local21.aClass1_Sub2_Sub6_Sub1_2;
				Static64.method1222(local26.aClass158_1.anInt4454, local26);
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ga;III)V")
	public static void method3849(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static296.aClass82_16 != null || Static367.aBoolean425 || (arg0 == null || Static199.method3077(arg0) == null)) {
			return;
		}
		Static296.aClass82_16 = arg0;
		Static260.aClass82_22 = Static199.method3077(arg0);
		Static233.anInt3984 = arg1;
		Static317.anInt5362 = arg2;
		Static170.aBoolean243 = false;
		Static254.anInt5710 = 0;
	}
}
