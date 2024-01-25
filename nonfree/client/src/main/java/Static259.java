import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt4870;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public static int anInt4871;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!pfa;")
	public static final Class269 aClass269_4 = new Class269();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method4297() {
		Static33.method733(Static305.aClass2_Sub49_15.aClass33_Sub4_1.method1937());
		@Pc(19) int local19 = (Static576.anInt9403 >> 12) + (Static406.anInt6899 >> 3);
		@Pc(27) int local27 = (Static338.anInt5885 >> 3) + (Static63.anInt1715 >> 12);
		Static531.anInt8550 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 = 0;
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method7017(8, 8);
		Static28.anIntArrayArray115 = new int[18][4];
		Static80.anIntArray148 = new int[18];
		Static94.aByteArrayArray5 = new byte[18][];
		Static635.anIntArray728 = new int[18];
		Static291.aByteArrayArray14 = new byte[18][];
		Static641.aByteArrayArray27 = new byte[18][];
		Static326.anIntArray366 = new int[18];
		Static461.anIntArray517 = new int[18];
		Static555.anIntArray663 = new int[18];
		Static502.aByteArrayArray26 = new byte[18][];
		Static187.aByteArrayArray8 = new byte[18][];
		Static87.anIntArray158 = new int[18];
		@Pc(82) int local82 = 0;
		@Pc(102) int local102;
		for (@Pc(91) int local91 = (local19 - (Static456.anInt7428 >> 4)) / 8; local91 <= ((Static456.anInt7428 >> 4) + local19) / 8; local91++) {
			for (local102 = (local27 - (Static5.anInt112 >> 4)) / 8; local102 <= (local27 + (Static5.anInt112 >> 4)) / 8; local102++) {
				@Pc(110) int local110 = local102 + (local91 << 8);
				Static635.anIntArray728[local82] = local110;
				Static87.anIntArray158[local82] = Static122.aClass238_58.method5575("m" + local91 + "_" + local102);
				Static326.anIntArray366[local82] = Static122.aClass238_58.method5575("l" + local91 + "_" + local102);
				Static461.anIntArray517[local82] = Static122.aClass238_58.method5575("n" + local91 + "_" + local102);
				Static80.anIntArray148[local82] = Static122.aClass238_58.method5575("um" + local91 + "_" + local102);
				Static555.anIntArray663[local82] = Static122.aClass238_58.method5575("ul" + local91 + "_" + local102);
				if (Static461.anIntArray517[local82] == -1) {
					Static87.anIntArray158[local82] = -1;
					Static326.anIntArray366[local82] = -1;
					Static80.anIntArray148[local82] = -1;
					Static555.anIntArray663[local82] = -1;
				}
				local82++;
			}
		}
		for (local102 = local82; local102 < Static461.anIntArray517.length; local102++) {
			Static461.anIntArray517[local102] = -1;
			Static87.anIntArray158[local102] = -1;
			Static326.anIntArray366[local102] = -1;
			Static80.anIntArray148[local102] = -1;
			Static555.anIntArray663[local102] = -1;
		}
		@Pc(290) byte local290;
		if (Static454.anInt7416 == 3) {
			local290 = 4;
		} else {
			local290 = 8;
		}
		Static183.method3129(false, local19, local290, local27);
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(III)Z")
	public static boolean method4299(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
	public static int method4301(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
