import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Lclient!ns;")
	public static Class166 aClass166_295;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "Lclient!si;")
	public static final Class217 aClass217_40 = new Class217(10, 6);

	@OriginalMember(owner = "client!we", name = "P", descriptor = "I")
	public static int anInt7377 = 0;

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "Lclient!gl;")
	public static final Class93 aClass93_10 = new Class93("", 10);

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_136 = new Class36(68, -1);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!eu;ZLclient!qa;I)V")
	public static void method5685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class70 local9 = Static70.aClass212_6.method4944(arg2.anInt2165);
		if (local9.anInt2152 == -1) {
			return;
		}
		if (arg2.aBoolean167) {
			@Pc(26) int local26 = arg0 + arg2.anInt2170;
			arg0 = local26 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(38) Class3 local38 = local9.method1611(arg3, arg2.aBoolean162, arg0);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg2.anInt2169;
		@Pc(47) int local47 = arg2.anInt2198;
		if ((arg0 & 0x1) == 1) {
			local44 = arg2.anInt2198;
			local47 = arg2.anInt2169;
		}
		@Pc(67) int local67 = local38.ja();
		@Pc(70) int local70 = local38.JA();
		if (local9.aBoolean158) {
			local67 = local44 * 4;
			local70 = local47 * 4;
		}
		if (local9.anInt2150 == 0) {
			local38.method5885(arg1, arg4 - (local47 - 1) * 4, local67, local70);
		} else {
			local38.M(arg1, arg4 - (local47 - 1) * 4, local67, local70, 0, local9.anInt2150 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static108.aString21 = arg2;
		Static404.anInt6896 = arg0;
		Static248.aString48 = arg1;
		if (Static248.aString48.equals("") || Static108.aString21.equals("")) {
			Static452.anInt7565 = 3;
		} else if (Static83.anInt1889 == -1) {
			Static205.anInt3906 = 1;
			Static17.anInt522 = 0;
			Static225.anInt4000 = 0;
			Static452.anInt7565 = -3;
			@Pc(39) Class4_Sub30 local39 = new Class4_Sub30(128);
			local39.method4871(10);
			local39.method4861((int) (Math.random() * 9.9999999E7D));
			local39.method4860(Static13.method317(Static248.aString48));
			local39.method4861((int) (Math.random() * 9.9999999E7D));
			local39.method4849(Static108.aString21);
			local39.method4861((int) (Math.random() * 9.9999999E7D));
			local39.method4850(Static183.aBigInteger1, Static362.aBigInteger2);
			Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
			Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_20.anInt6527);
			Static116.aClass4_Sub30_Sub1_1.method4871(local39.anInt6244 + 2);
			Static116.aClass4_Sub30_Sub1_1.method4846(587);
			Static116.aClass4_Sub30_Sub1_1.method4843(local39.aByteArray79, local39.anInt6244);
		} else {
			Static133.method1944();
		}
	}
}
