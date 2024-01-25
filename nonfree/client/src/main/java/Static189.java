import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
	public static int anInt11070;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_72 = new Class169(64);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!cea;)Lclient!kh;")
	public static Class110_Sub2 method9235(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) Class110 local7 = Static240.method4487(arg0);
		@Pc(11) int local11 = arg0.method8381();
		@Pc(15) int local15 = arg0.method8381();
		@Pc(24) int local24 = arg0.method8326();
		return new Class110_Sub2(local7.aClass309_11, local7.aClass86_10, local7.anInt7742, local7.anInt7733, local7.anInt7743, local7.anInt7736, local7.anInt7739, local7.anInt7738, local7.anInt7735, local11, local15, local24);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLclient!ff;)V")
	public static void method9237(@OriginalArg(1) Class3_Sub1_Sub3_Sub3_Sub1 arg0) {
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static76.aClass341_25.method8524(); local15 != null; local15 = (Class2_Sub21) Static76.aClass341_25.method8519()) {
			if (local15.aClass3_Sub1_Sub3_Sub3_Sub1_1 == arg0) {
				if (local15.aClass2_Sub8_Sub5_3 != null) {
					Static614.aClass2_Sub8_Sub4_2.method7925(local15.aClass2_Sub8_Sub5_3);
					local15.aClass2_Sub8_Sub5_3 = null;
				}
				local15.method9253();
				return;
			}
		}
	}
}
