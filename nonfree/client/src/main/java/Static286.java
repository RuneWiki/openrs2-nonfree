import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Lclient!so;")
	public static Class14_Sub29 aClass14_Sub29_5;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public static int anInt4894;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	public static int anInt4898;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	public static int anInt4884 = 0;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public static int anInt4890 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I")
	public static int method4075(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ws;Lclient!fba;B)Lclient!eo;")
	public static Class14_Sub19 method4081(@OriginalArg(0) Class394 arg0, @OriginalArg(1) Class100 arg1) {
		@Pc(8) Class14_Sub19 local8 = Static664.method9230();
		local8.anInt2683 = arg1.anInt3009;
		local8.aClass100_41 = arg1;
		if (local8.anInt2683 == -1) {
			local8.aClass14_Sub29_Sub1_1 = new Class14_Sub29_Sub1(260);
		} else if (local8.anInt2683 == -2) {
			local8.aClass14_Sub29_Sub1_1 = new Class14_Sub29_Sub1(10000);
		} else if (local8.anInt2683 <= 18) {
			local8.aClass14_Sub29_Sub1_1 = new Class14_Sub29_Sub1(20);
		} else if (local8.anInt2683 <= 98) {
			local8.aClass14_Sub29_Sub1_1 = new Class14_Sub29_Sub1(100);
		} else {
			local8.aClass14_Sub29_Sub1_1 = new Class14_Sub29_Sub1(260);
		}
		local8.aClass14_Sub29_Sub1_1.method4286(arg0);
		local8.aClass14_Sub29_Sub1_1.method4283(local8.aClass100_41.method2449());
		local8.anInt2685 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	public static void method4083() {
		Static147.aClass264_19.method6366(50);
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void method4085() {
		Static206.anIntArray312 = Static525.method7546(0.4F);
	}
}
