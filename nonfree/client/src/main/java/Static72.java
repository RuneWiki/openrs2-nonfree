import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!wg;")
	public static Class265 aClass265_2;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public static int anInt1388;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt1389;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!de;")
	public static final Class50 aClass50_3 = new Class50(15, 0, 1, 0);

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
	public static final int[] anIntArray121 = new int[6];

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public static int anInt1387 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!sv;)Lclient!eg;")
	public static Class2_Sub2 method1078(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.method3580();
		@Pc(13) int local13 = arg0.method3580();
		@Pc(17) Class2_Sub2 local17 = Static157.method2216(local13);
		local17.anInt7025 = arg0.method3580();
		@Pc(31) int local31 = arg0.method3580();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method3580();
			local17.method5470(arg0, local39);
		}
		local17.method5475();
		return local17;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)V")
	public static void method1079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(12, arg0);
		local8.method3098();
		local8.anInt3911 = arg1;
	}
}
