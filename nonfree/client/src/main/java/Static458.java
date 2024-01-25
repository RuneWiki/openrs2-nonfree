import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
	public static int anInt8218;

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_146 = new Class73(20, 7);

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
	public static int anInt8217 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	public static void method6904() {
		Static643.anInt10750 = 0;
		@Pc(11) int local11 = Static84.aClass6_Sub8_Sub1_1.method8237();
		@Pc(19) int local19 = Static84.aClass6_Sub8_Sub1_1.method8229();
		@Pc(23) int local23 = Static84.aClass6_Sub8_Sub1_1.method8246();
		@Pc(34) boolean local34 = Static84.aClass6_Sub8_Sub1_1.method8253() == 1;
		Static203.method3702();
		Static290.method4993(local23);
		@Pc(47) int local47 = (Static125.anInt3103 - Static84.aClass6_Sub8_Sub1_1.anInt10061) / 16;
		Static307.anIntArrayArray24 = new int[local47][4];
		@Pc(57) int local57;
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static307.anIntArrayArray24[local53][local57] = Static84.aClass6_Sub8_Sub1_1.method8236();
			}
		}
		Static191.aByteArrayArray7 = null;
		Static228.anIntArray215 = new int[local47];
		Static75.aByteArrayArray1 = new byte[local47][];
		Static642.anIntArray572 = new int[local47];
		Static502.anIntArray342 = new int[local47];
		Static199.aByteArrayArray8 = new byte[local47][];
		Static448.aByteArrayArray24 = new byte[local47][];
		Static642.aByteArrayArray37 = new byte[local47][];
		Static440.anIntArray418 = new int[local47];
		Static296.anIntArray272 = null;
		Static525.anIntArray474 = new int[local47];
		local47 = 0;
		for (local57 = (local19 - (Static306.anInt6176 >> 4)) / 8; local57 <= ((Static306.anInt6176 >> 4) + local19) / 8; local57++) {
			for (@Pc(133) int local133 = (local11 - (Static108.anInt2930 >> 4)) / 8; local133 <= (local11 + (Static108.anInt2930 >> 4)) / 8; local133++) {
				Static228.anIntArray215[local47] = (local57 << 8) + local133;
				Static502.anIntArray342[local47] = Static415.aClass223_90.method5959("m" + local57 + "_" + local133);
				Static440.anIntArray418[local47] = Static415.aClass223_90.method5959("l" + local57 + "_" + local133);
				Static525.anIntArray474[local47] = Static415.aClass223_90.method5959("um" + local57 + "_" + local133);
				Static642.anIntArray572[local47] = Static415.aClass223_90.method5959("ul" + local57 + "_" + local133);
				local47++;
			}
		}
		Static441.method6730(local11, local34, local19, 11);
	}
}
