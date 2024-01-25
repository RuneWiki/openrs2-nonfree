import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "Lclient!jca;")
	public static final Class144 aClass144_1 = new Class144(0, 3, Static524.aClass310_20);

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "Lclient!jca;")
	public static final Class144 aClass144_2 = new Class144(1, 3, Static524.aClass310_20);

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "Lclient!jca;")
	public static final Class144 aClass144_3 = new Class144(2, 4, Static524.aClass310_16);

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "Lclient!jca;")
	public static final Class144 aClass144_4 = new Class144(3, 1, Static524.aClass310_20);

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "Lclient!jca;")
	public static final Class144 aClass144_5 = new Class144(4, 2, Static524.aClass310_20);

	@OriginalMember(owner = "client!jca", name = "m", descriptor = "Lclient!jca;")
	public static final Class144 aClass144_6 = new Class144(5, 3, Static524.aClass310_20);

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!jca;")
	private static final Class144 aClass144_7 = new Class144(6, 4, Static524.aClass310_20);

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
	public static final int anInt4764 = Static192.method3681(16);

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_80 = new Class133(4, 8);

	@OriginalMember(owner = "client!jca", name = "q", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_81 = new Class133(85, 8);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)[Lclient!jca;")
	public static Class144[] method3992() {
		return new Class144[] { aClass144_1, aClass144_2, aClass144_3, aClass144_4, aClass144_5, aClass144_6, aClass144_7 };
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!oa;IIIILclient!qd;)V")
	public static void method3993(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class242 arg4) {
		@Pc(9) Class32 local9 = Static241.aClass198_15.method5094(arg4.anInt7188);
		if (local9.anInt957 == -1) {
			return;
		}
		if (arg4.aBoolean479) {
			@Pc(27) int local27 = arg2 + arg4.anInt7189;
			arg2 = local27 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(41) Class119 local41 = local9.method895(arg4.aBoolean490, arg0, arg2);
		if (local41 == null) {
			return;
		}
		@Pc(47) int local47 = arg4.anInt7195;
		@Pc(55) int local55 = arg4.anInt7193;
		if ((arg2 & 0x1) == 1) {
			local47 = arg4.anInt7193;
			local55 = arg4.anInt7195;
		}
		@Pc(69) int local69 = local41.AA();
		@Pc(72) int local72 = local41.a();
		if (local9.aBoolean71) {
			local69 = local47 * 4;
			local72 = local55 * 4;
		}
		if (local9.anInt962 == 0) {
			local41.method6670(arg1, arg3 + 4 - local55 * 4, local69, local72);
		} else {
			local41.KA(arg1, arg3 - (local55 - 1) * 4, local69, local72, 0, local9.anInt962 | 0xFF000000, 1);
		}
	}
}
