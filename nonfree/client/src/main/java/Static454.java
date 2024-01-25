import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "Lclient!la;")
	public static Class58 aClass58_13;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
	public static int anInt8310 = 0;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
	public static final int[] anIntArray455 = new int[2];

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	public static void method6875() {
		Static450.aBoolean599 = false;
		Static451.aClass176_108 = null;
		Static353.anInt6872 = 0;
		Static342.anInt6643 = 1;
		Static472.anInt8704 = 2;
		Static280.aClass4_Sub7_Sub3_2 = null;
		Static544.anInt9651 = -1;
		Static480.anInt10083 = -1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6877(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static413.anInt8212;
		@Pc(9) int[] local9 = Static229.anIntArray201;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class1_Sub4_Sub2_Sub1_Sub2 local21 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 && local21.aString78 != null && local21.aString78.equalsIgnoreCase(arg0)) {
				local11 = true;
				@Pc(50) Class4_Sub14 local50;
				if (arg1 == 1) {
					local50 = Static196.method3380(Static17.aClass159_1, Static23.aClass173_54);
					local50.aClass4_Sub11_Sub1_3.method4957(0);
					local50.aClass4_Sub11_Sub1_3.method4932(local9[local13]);
					Static353.method5712(local50);
				} else if (arg1 == 4) {
					local50 = Static196.method3380(Static17.aClass159_1, Static270.aClass173_80);
					local50.aClass4_Sub11_Sub1_3.method4958(0);
					local50.aClass4_Sub11_Sub1_3.method4902(local9[local13]);
					Static353.method5712(local50);
				} else if (arg1 == 5) {
					local50 = Static196.method3380(Static17.aClass159_1, Static201.aClass173_59);
					local50.aClass4_Sub11_Sub1_3.method4944(0);
					local50.aClass4_Sub11_Sub1_3.method4898(local9[local13]);
					Static353.method5712(local50);
				} else if (arg1 == 6) {
					local50 = Static196.method3380(Static17.aClass159_1, Static43.aClass173_12);
					local50.aClass4_Sub11_Sub1_3.method4913(0);
					local50.aClass4_Sub11_Sub1_3.method4902(local9[local13]);
					Static353.method5712(local50);
				} else if (arg1 == 7) {
					local50 = Static196.method3380(Static17.aClass159_1, Static461.aClass173_106);
					local50.aClass4_Sub11_Sub1_3.method4913(0);
					local50.aClass4_Sub11_Sub1_3.method4902(local9[local13]);
					Static353.method5712(local50);
				}
				break;
			}
		}
		if (!local11) {
			Static465.method7052(Static590.aClass364_25.method8334(Static154.anInt3181) + arg0);
		}
	}
}
