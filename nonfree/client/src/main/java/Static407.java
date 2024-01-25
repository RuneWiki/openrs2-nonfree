import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!wt;")
	public static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_3;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "[Lclient!rk;")
	public static final Class3_Sub40[] aClass3_Sub40Array1 = new Class3_Sub40[1024];

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static final int anInt6719 = 1401;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!qa;Lclient!ga;)V")
	public static void method5562(@OriginalArg(1) Class167 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(39) boolean local39 = Static158.aClass272_1.method6278(arg1.anInt2215, arg1.aBoolean172 ? Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 : null, arg1.anInt2200, arg1.anInt2205, arg0, arg1.anInt2251, arg1.anInt2226 | 0xFF000000) == null;
		if (local39) {
			Static249.aClass193_35.method4527(new Class3_Sub44(arg1.anInt2200, arg1.anInt2215, arg1.anInt2205, arg1.anInt2226 | 0xFF000000, arg1.anInt2251, arg1.aBoolean172));
			Static463.method6297(arg1);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)V")
	public static void method5564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static163.method5702(arg0)) {
			Static149.method2336(Static298.aClass82ArrayArray2[arg0], arg1);
		}
	}
}
