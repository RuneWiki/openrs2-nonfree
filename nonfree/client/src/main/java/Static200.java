import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "Lclient!db;")
	public static Class74 aClass74_2;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
	public static void method2823() {
		@Pc(10) Class2_Sub46 local10;
		for (local10 = (Class2_Sub46) Static237.aClass60_235.method1226(7); local10 != null; local10 = (Class2_Sub46) Static237.aClass60_235.method1228()) {
			Static255.method3618(false, local10);
		}
		for (local10 = (Class2_Sub46) Static556.aClass60_180.method1226(7); local10 != null; local10 = (Class2_Sub46) Static556.aClass60_180.method1228()) {
			Static255.method3618(true, local10);
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Lclient!baa;")
	public static Class28 method2824(@OriginalArg(0) int arg0) {
		@Pc(18) Class28 local18 = (Class28) Static57.aClass85_10.method1737((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = Static196.aClass254_70.method6087(arg0, 0);
		local18 = new Class28();
		if (local29 != null) {
			local18.method511(arg0, new Class2_Sub20(local29));
		}
		Static57.aClass85_10.method1745((long) arg0, 16383, local18);
		return local18;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIZ)V")
	public static void method2825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(9, (long) arg2);
		local14.method6239();
		local14.anInt6936 = arg0;
		local14.anInt6938 = arg1;
	}
}
