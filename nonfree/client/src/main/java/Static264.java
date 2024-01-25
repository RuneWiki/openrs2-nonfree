import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public static int anInt4902 = -50;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Lclient!di;")
	public static final Class54 aClass54_69 = new Class54(75, 4);

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_100 = new Class265(95, 8);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ya;IIILclient!jo;I)V")
	public static void method3952(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class134 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class16 local9 = Static258.aClass120_4.method2660(arg3.anInt3637);
		if (local9.anInt355 == -1) {
			return;
		}
		if (arg3.aBoolean275) {
			@Pc(23) int local23 = arg1 + arg3.anInt3649;
			arg1 = local23 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(39) Class17 local39 = local9.method321(arg1, arg0, arg3.aBoolean276);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg3.anInt3670;
		@Pc(48) int local48 = arg3.anInt3652;
		if ((arg1 & 0x1) == 1) {
			local45 = arg3.anInt3652;
			local48 = arg3.anInt3670;
		}
		@Pc(72) int local72 = local39.j();
		@Pc(75) int local75 = local39.T();
		if (local9.aBoolean13) {
			local72 = local45 * 4;
			local75 = local48 * 4;
		}
		if (local9.anInt356 == 0) {
			local39.method5775(arg4, arg2 - (local48 - 1) * 4, local72, local75);
		} else {
			local39.s(arg4, arg2 - (local48 - 1) * 4, local72, local75, 0, local9.anInt356 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	public static void method3953() {
		Static451.anIntArray634 = Static287.method4141(0.4F);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
	public static void method3955(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub5_Sub13 local10 = Static208.method3306(arg0, 10);
		local10.method4545();
	}
}
