import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!re", name = "Sc", descriptor = "Ljava/lang/String;")
	public static String aString307 = "Loaded world list data";

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIZFZII)[I")
	public static int[] method4661(@OriginalArg(4) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class5_Sub2_Sub29 local15 = new Class5_Sub2_Sub29();
		local15.anInt5235 = 4;
		local15.anInt5242 = (int) (arg0 * 4096.0F);
		local15.anInt5239 = 8;
		local15.aBoolean400 = true;
		local15.anInt5237 = 8;
		local15.anInt5244 = 35;
		local15.method5811();
		Static319.method5393(2048, 1);
		local15.method4619(local11, 0);
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)Lclient!ir;")
	public static Class63_Sub3 method4667(@OriginalArg(1) int arg0) {
		@Pc(7) Class24[] local7 = Class180.aClass24Array1;
		synchronized (Class180.aClass24Array1) {
			@Pc(30) Class63_Sub3 local30;
			if (arg0 >= Class180.aClass24Array1.length || Class180.aClass24Array1[arg0].method626()) {
				local30 = new Class63_Sub3();
				local30.aClass63_Sub7Array1 = new Class63_Sub7[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass63_Sub7Array1[local52] = new Class63_Sub7();
				}
			} else {
				local30 = (Class63_Sub3) Class180.aClass24Array1[arg0].method622();
				local30.method5690();
				@Pc(37) int local37 = Static93.anIntArray126[arg0]--;
			}
			return local30;
		}
	}
}
