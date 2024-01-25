import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_59 = new Class57("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[Lclient!rp;")
	public static final Class3_Sub5[] aClass3_Sub5Array1 = new Class3_Sub5[2048];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
	public static void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static69.aClass48ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg1 << 28 | arg2 << 14);
		@Pc(25) Class3_Sub16 local25 = (Class3_Sub16) Static384.aClass44_39.method942(local19);
		if (local25 == null) {
			Static296.method4569(arg1, arg0, arg2);
			return;
		}
		@Pc(39) Class3_Sub40 local39 = (Class3_Sub40) local25.aClass138_15.method3051();
		if (local39 == null) {
			Static296.method4569(arg1, arg0, arg2);
			return;
		}
		@Pc(57) Class28_Sub5_Sub1 local57 = (Class28_Sub5_Sub1) Static296.method4569(arg1, arg0, arg2);
		if (local57 == null) {
			local57 = new Class28_Sub5_Sub1();
		} else {
			local57.anInt4871 = local57.anInt4876 = -1;
		}
		local57.anInt4879 = local39.anInt6017;
		local57.anInt4878 = local39.anInt6018;
		label44: while (true) {
			@Pc(85) Class3_Sub40 local85 = (Class3_Sub40) local25.aClass138_15.method3050();
			if (local85 == null) {
				break;
			}
			if (local57.anInt4879 != local85.anInt6017) {
				local57.anInt4871 = local85.anInt6017;
				local57.anInt4872 = local85.anInt6018;
				while (true) {
					@Pc(106) Class3_Sub40 local106 = (Class3_Sub40) local25.aClass138_15.method3050();
					if (local106 == null) {
						break label44;
					}
					if (local106.anInt6017 != local57.anInt4879 && local57.anInt4871 != local106.anInt6017) {
						local57.anInt4876 = local106.anInt6017;
						local57.anInt4877 = local106.anInt6018;
					}
				}
			}
		}
		@Pc(150) int local150 = Static55.method1005((arg2 << 7) + 64, arg1, (arg0 << 7) + 64);
		Static154.method5414(arg1, arg0, arg2, local150, local57);
	}
}
