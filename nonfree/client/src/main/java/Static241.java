import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!un;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "Lclient!vk;")
	public static Class258 aClass258_1;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_106 = new Class263(38, 3);

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_66 = new Class177(11, -1);

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "J")
	public static volatile long aLong128 = 0L;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIZZ)I")
	public static int method3634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class1_Sub46 local8 = Static114.method1848(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray750.length) {
			return local8.anIntArray750[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!ia;)Lclient!pj;")
	public static Class1_Sub8 method3635(@OriginalArg(1) Class1_Sub3 arg0) {
		arg0.method1171();
		@Pc(18) int local18 = arg0.method1171();
		@Pc(22) Class1_Sub8 local22 = Static43.method790(local18);
		local22.anInt7804 = arg0.method1171();
		@Pc(31) int local31 = arg0.method1171();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method1171();
			local22.method6038(local39, arg0);
		}
		local22.method6033();
		return local22;
	}
}
