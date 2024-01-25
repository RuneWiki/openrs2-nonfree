import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "Lclient!jn;")
	public static Class176 aClass176_11;

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
	public static int anInt506;

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "[I")
	public static final int[] anIntArray21 = new int[1];

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_24 = new Class362(89, 1);

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_25 = new Class362(90, 8);

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "Lclient!op;")
	public static final Class250 aClass250_1 = new Class250();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)Lclient!ad;")
	public static Class7 method452() {
		return Static438.method6802();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBILjava/lang/String;I)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class225 local8 = Static24.method318(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray7 != null) {
			@Pc(18) Class4_Sub25 local18 = new Class4_Sub25();
			local18.anInt4395 = arg1;
			local18.aClass225_21 = local8;
			local18.aString49 = arg2;
			local18.anObjectArray1 = local8.anObjectArray7;
			Static388.method6121(local18);
		}
		if (Static203.anInt3855 != 10 || !Static69.method1180(local8).method128(arg1 - 1)) {
			return;
		}
		@Pc(68) Class4_Sub14 local68;
		if (arg1 == 1) {
			local68 = Static196.method3380(Static17.aClass159_1, Static125.aClass173_41);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 2) {
			local68 = Static196.method3380(Static17.aClass159_1, Static55.aClass173_99);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 3) {
			local68 = Static196.method3380(Static17.aClass159_1, Static477.aClass173_109);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 4) {
			local68 = Static196.method3380(Static17.aClass159_1, Static70.aClass173_22);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 5) {
			local68 = Static196.method3380(Static17.aClass159_1, Static407.aClass173_97);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 6) {
			local68 = Static196.method3380(Static17.aClass159_1, Static470.aClass173_108);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 7) {
			local68 = Static196.method3380(Static17.aClass159_1, Static1.aClass173_1);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 8) {
			local68 = Static196.method3380(Static17.aClass159_1, Static189.aClass173_53);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 9) {
			local68 = Static196.method3380(Static17.aClass159_1, Static324.aClass173_92);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
		if (arg1 == 10) {
			local68 = Static196.method3380(Static17.aClass159_1, Static468.aClass173_34);
			Static30.method404(arg3, arg0, local68, local8.anInt6527);
			Static353.method5712(local68);
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
	public static void method456() {
		@Pc(8) Class4_Sub15 local8 = (Class4_Sub15) Static222.aClass244_35.method5963();
		@Pc(21) boolean local21 = Static317.aClass225_54 != null || Static116.anInt2677 > 0;
		if (local21) {
			Static190.anInt3736 = 1;
		}
		if (Static89.aBoolean156 && Static584.aClass154_1.method3569(81) && Static339.anInt6583 > 2) {
			if (local21) {
				Static201.aClass4_Sub39_1 = (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286.aClass4_286;
			} else {
				Static525.method7623(local8.method3495(), (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286.aClass4_286, local8.method3498());
			}
		} else if (local21) {
			Static201.aClass4_Sub39_1 = (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286;
		} else {
			Static525.method7623(local8.method3495(), (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286, local8.method3498());
		}
	}
}
