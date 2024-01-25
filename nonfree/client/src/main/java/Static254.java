import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	public static int anInt5479 = 0;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!vfa;")
	public static final Class6_Sub49 aClass6_Sub49_1 = new Class6_Sub49(0, 0);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	public static int anInt5485 = -1;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIB)I")
	public static int method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) byte local20;
		if (arg0 > 20000) {
			Static290.method4995();
			local20 = 4;
		} else if (arg0 > 10000) {
			local20 = 3;
			Static624.method8538();
		} else if (arg0 > 5000) {
			Static502.method6026();
			local20 = 2;
		} else {
			Static367.method7654();
			local20 = 1;
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != arg1) {
			Static87.aClass6_Sub33_6.method4996(arg1, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
			Static237.method4302(arg1, false);
		}
		Static541.method7640();
		return local20;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;I)V")
	public static void method4488(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class6_Sub17 local6 = Static145.method2840();
		local6.aClass6_Sub8_Sub1_2.method8211(Static519.aClass238_7.anInt7405);
		local6.aClass6_Sub8_Sub1_2.method8241(0);
		@Pc(21) int local21 = local6.aClass6_Sub8_Sub1_2.anInt10061;
		local6.aClass6_Sub8_Sub1_2.method8241(637);
		@Pc(32) int[] local32 = Static229.method4153(local6);
		@Pc(36) int local36 = local6.aClass6_Sub8_Sub1_2.anInt10061;
		local6.aClass6_Sub8_Sub1_2.method8205(arg2);
		local6.aClass6_Sub8_Sub1_2.method8241(Static234.anInt5227);
		local6.aClass6_Sub8_Sub1_2.method8205(arg1);
		local6.aClass6_Sub8_Sub1_2.method8238(Static361.aLong189);
		local6.aClass6_Sub8_Sub1_2.method8211(Static638.anInt10709);
		local6.aClass6_Sub8_Sub1_2.method8211(Static8.aClass290_1.anInt8594);
		Static287.method4978(local6.aClass6_Sub8_Sub1_2);
		@Pc(73) String local73 = Static108.aString21;
		local6.aClass6_Sub8_Sub1_2.method8211(local73 == null ? 0 : 1);
		if (local73 != null) {
			local6.aClass6_Sub8_Sub1_2.method8205(local73);
		}
		local6.aClass6_Sub8_Sub1_2.method8211(arg3);
		local6.aClass6_Sub8_Sub1_2.method8211(arg0 ? 1 : 0);
		local6.aClass6_Sub8_Sub1_2.anInt10061 += 7;
		local6.aClass6_Sub8_Sub1_2.method8252(local32, local36, local6.aClass6_Sub8_Sub1_2.anInt10061);
		local6.aClass6_Sub8_Sub1_2.method8224(local6.aClass6_Sub8_Sub1_2.anInt10061 - local21);
		Static452.method6867(local6);
		Static632.anInt10595 = 1;
		Static634.anInt10666 = 0;
		Static284.anInt5943 = 0;
		Static109.anInt2942 = -3;
		if (arg3 < 13) {
			Static201.aBoolean576 = true;
			Static529.method5795();
		}
	}
}
