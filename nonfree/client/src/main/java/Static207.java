import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt4058;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_65 = new Class27(62, 8);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Z")
	public static boolean method3218(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3220(@OriginalArg(1) Class10_Sub8_Sub2 arg0) {
		arg0.method2532();
		@Pc(10) int local10 = Static245.anInt4435;
		@Pc(20) Class24_Sub3_Sub2_Sub2 local20 = Static263.aClass24_Sub3_Sub2_Sub2_4 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local10] = new Class24_Sub3_Sub2_Sub2();
		local20.anInt6228 = local10;
		@Pc(30) int local30 = arg0.method2525(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		@Pc(45) int local45 = local30 & 0x3FFF;
		local20.anIntArray610[0] = local41 - Static168.anInt3353;
		local20.anInt7092 = (local20.anIntArray610[0] << 7) + (local20.method4919() << 6);
		local20.anIntArray611[0] = local45 - Static72.anInt1488;
		local20.anInt7094 = (local20.anIntArray611[0] << 7) + (local20.method4919() << 6);
		Static96.anInt1983 = local20.aByte98 = local35;
		if (Static134.aClass10_Sub8Array1[local10] != null) {
			local20.method4930(Static134.aClass10_Sub8Array1[local10]);
		}
		Static270.anInt4754 = 0;
		Static53.anIntArray79[Static270.anInt4754++] = local10;
		Static456.aByteArray95[local10] = 0;
		Static348.anInt5937 = 0;
		for (@Pc(123) int local123 = 1; local123 < 2048; local123++) {
			if (local123 != local10) {
				@Pc(137) int local137 = arg0.method2525(18);
				@Pc(141) int local141 = local137 >> 16;
				@Pc(147) int local147 = local137 >> 8 & 0xFF;
				@Pc(151) int local151 = local137 & 0xFF;
				@Pc(159) Class32 local159 = Static458.aClass32Array1[local123] = new Class32();
				local159.anInt724 = 0;
				local159.aBoolean48 = false;
				local159.anInt726 = local151 + (local147 << 14) + (local141 << 28);
				local159.anInt725 = -1;
				Static147.anIntArray294[Static348.anInt5937++] = local123;
				Static456.aByteArray95[local123] = 0;
			}
		}
		arg0.method2528();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ph;IIIIIZ)V")
	public static void method3224(@OriginalArg(0) Class187 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static398.anInt6739 = 0;
		Static285.aClass187_87 = arg0;
		Static124.anInt2565 = 2;
		Static212.anInt4104 = arg1;
		Static300.aBoolean350 = false;
		Static345.anInt5874 = arg2;
		Static152.anInt3124 = 1;
	}
}
