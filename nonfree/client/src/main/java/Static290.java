import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kda", name = "V", descriptor = "I")
	public static int anInt5993;

	@OriginalMember(owner = "client!kda", name = "A", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_62 = new Class185(59, 2);

	@OriginalMember(owner = "client!kda", name = "ob", descriptor = "Lclient!vg;")
	public static final Class354 aClass354_3 = new Class354(1);

	@OriginalMember(owner = "client!kda", name = "pb", descriptor = "[B")
	public static final byte[] aByteArray39 = new byte[2048];

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BI)V")
	public static void method4993(@OriginalArg(1) int arg0) {
		if (arg0 == Static269.anInt10099) {
			return;
		}
		Static306.anInt6176 = Static108.anInt2930 = Static557.anIntArray506[arg0];
		Static537.method7608();
		Static316.anIntArrayArrayArray2 = new int[4][Static306.anInt6176 >> 3][Static108.anInt2930 >> 3];
		Static634.anIntArrayArray68 = new int[Static306.anInt6176][Static108.anInt2930];
		Static612.anIntArrayArray65 = new int[Static306.anInt6176][Static108.anInt2930];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static313.aClass258Array1[local36] = Static521.method8021(Static108.anInt2930, Static306.anInt6176);
		}
		Static538.aByteArrayArrayArray18 = new byte[4][Static306.anInt6176][Static108.anInt2930];
		Static556.method7798(Static108.anInt2930, Static306.anInt6176);
		Static299.method5102(Static306.anInt6176 >> 3, Static108.anInt2930 >> 3, Static467.aClass5_13);
		Static269.anInt10099 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	public static void method4995() {
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub3_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub3_2);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub15_1);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub15_2);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub11_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub25_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub24_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub13_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub26_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub20_1);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub7_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub10_1);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub28_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub14_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub23_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub23_2);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub6_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub17_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub5_1);
		Static19.method602();
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub16_1);
		Static87.aClass6_Sub33_6.method4996(4, Static87.aClass6_Sub33_6.aClass14_Sub12_1);
		Static174.method3297();
		Static638.method8737();
		Static68.aBoolean183 = true;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)Z")
	public static boolean method5003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static268.method4837(arg0, arg1)) {
			return (arg1 & 0x9000) != 0 | Static598.method8290(arg0, arg1) | Static269.method8258(arg0, arg1) ? true : ((arg1 & 0x2000) != 0 | Static531.method7545(arg0, arg1) | Static329.method5521(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
