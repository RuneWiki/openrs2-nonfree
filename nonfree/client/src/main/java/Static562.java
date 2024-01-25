import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Lclient!cv;")
	public static Class63 aClass63_6;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Lclient!nd;")
	public static Class238 aClass238_256;

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "Lclient!mg;")
	public static final Class222 aClass222_5 = new Class222();

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)[Lclient!eha;")
	public static Class97[] method7867() {
		return new Class97[] { Static57.aClass97_1, Static313.aClass97_14, Static399.aClass97_12 };
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)[Lclient!cha;")
	public static Class55[] method7869() {
		return new Class55[] { Static360.aClass55_10, Static460.aClass55_12, Static645.aClass55_15, Static190.aClass55_6, Static214.aClass55_8, Static636.aClass55_14, Static5.aClass55_1, Static308.aClass55_9, Static185.aClass55_5, Static77.aClass55_3, Static433.aClass55_11, Static150.aClass55_4, Static49.aClass55_2, Static582.aClass55_13, Static197.aClass55_7 };
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
	public static void method7870(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) Class2_Sub27 local8 = (Class2_Sub27) Static143.aClass114_16.method2772(); local8 != null; local8 = (Class2_Sub27) Static143.aClass114_16.method2762()) {
			if (local8.aClass2_Sub11_Sub4_3 != null) {
				Static622.aClass2_Sub11_Sub2_2.method2950(local8.aClass2_Sub11_Sub4_3);
				local8.aClass2_Sub11_Sub4_3 = null;
			}
			if (local8.aClass2_Sub11_Sub4_2 != null) {
				Static622.aClass2_Sub11_Sub2_2.method2950(local8.aClass2_Sub11_Sub4_2);
				local8.aClass2_Sub11_Sub4_2 = null;
			}
			local8.method8920();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class2_Sub27 local54 = (Class2_Sub27) Static536.aClass114_41.method2772(); local54 != null; local54 = (Class2_Sub27) Static536.aClass114_41.method2762()) {
			if (local54.aClass2_Sub11_Sub4_3 != null) {
				Static622.aClass2_Sub11_Sub2_2.method2950(local54.aClass2_Sub11_Sub4_3);
				local54.aClass2_Sub11_Sub4_3 = null;
			}
			local54.method8920();
		}
		for (@Pc(80) Class2_Sub27 local80 = (Class2_Sub27) Static289.aClass323_19.method7480(); local80 != null; local80 = (Class2_Sub27) Static289.aClass323_19.method7482()) {
			if (local80.aClass2_Sub11_Sub4_3 != null) {
				Static622.aClass2_Sub11_Sub2_2.method2950(local80.aClass2_Sub11_Sub4_3);
				local80.aClass2_Sub11_Sub4_3 = null;
			}
			local80.method8920();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!rg;ZLclient!rg;)V")
	public static void method7871(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg1.aClass2_Sub7_67 != null) {
			arg1.method8504();
		}
		arg1.aClass2_Sub7_67 = arg0;
		arg1.aClass2_Sub7_66 = arg0.aClass2_Sub7_66;
		arg1.aClass2_Sub7_67.aClass2_Sub7_66 = arg1;
		arg1.aClass2_Sub7_66.aClass2_Sub7_67 = arg1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIBIILclient!ha;II)V")
	public static void method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface25 local11 = (Interface25) Static587.method8331(arg0, arg4, arg3);
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			@Pc(20) Class5 local20 = Static79.aClass304_2.method6956(local11.method6207());
			@Pc(26) int local26 = local11.method6210() & 0x3;
			local30 = local11.method6212();
			if (local20.anInt60 == -1) {
				local37 = arg1;
				if (local20.anInt81 > 0) {
					local37 = arg2;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg5.method8092(4, arg7, local37, arg6);
					} else if (local26 == 1) {
						arg5.method8091(arg6, arg7, 4, local37);
					} else if (local26 == 2) {
						arg5.method8092(4, arg7 + 3, local37, arg6);
					} else if (local26 == 3) {
						arg5.method8091(arg6 + 3, arg7, 4, local37);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg5.method8164(local37, 1, arg7, 1, arg6);
					} else if (local26 == 1) {
						arg5.method8164(local37, 1, arg7 + 3, 1, arg6);
					} else if (local26 == 2) {
						arg5.method8164(local37, 1, arg7 + 3, 1, arg6 + 3);
					} else if (local26 == 3) {
						arg5.method8164(local37, 1, arg7, 1, arg6 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg5.method8091(arg6, arg7, 4, local37);
					} else if (local26 == 1) {
						arg5.method8092(4, arg7 + 3, local37, arg6);
					} else if (local26 == 2) {
						arg5.method8091(arg6 + 3, arg7, 4, local37);
					} else if (local26 == 3) {
						arg5.method8092(4, arg7, local37, arg6);
					}
				}
			} else {
				Static89.method6085(arg5, arg6, local26, local20, arg7);
			}
		}
		local11 = (Interface25) Static22.method567(arg0, arg4, arg3, rca.class);
		@Pc(270) Class5 local270;
		if (local11 != null) {
			local270 = Static79.aClass304_2.method6956(local11.method6207());
			local30 = local11.method6210() & 0x3;
			local37 = local11.method6212();
			if (local270.anInt60 != -1) {
				Static89.method6085(arg5, arg6, local30, local270, arg7);
			} else if (local37 == 9) {
				@Pc(299) int local299 = -1118482;
				if (local270.anInt81 > 0) {
					local299 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg5.method8130(arg6 + 3, arg7 - -3, arg6, local299, arg7);
				} else {
					arg5.method8130(arg6, arg7 + 3, arg6 + 3, local299, arg7);
				}
			}
		}
		local11 = (Interface25) Static366.method5446(arg0, arg4, arg3);
		if (local11 == null) {
			return;
		}
		local270 = Static79.aClass304_2.method6956(local11.method6207());
		local30 = local11.method6210() & 0x3;
		if (local270.anInt60 != -1) {
			Static89.method6085(arg5, arg6, local30, local270, arg7);
			return;
		}
	}
}
