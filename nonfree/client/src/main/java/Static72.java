import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public static int anInt7879;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_174 = new Class362(1, -2);

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "[I")
	public static int[] anIntArray415 = new int[1];

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)I")
	public static int method6563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local13 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local13 * arg0;
		} else {
			return local13;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)Lclient!fn;")
	public static Class4_Sub18 method6564(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class4_Sub18) Static201.aClass350_15.method8207(local17);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	public static boolean method6566() {
		try {
			if (Static342.anInt6643 == 2) {
				if (Static162.aClass4_Sub41_1 == null) {
					Static162.aClass4_Sub41_1 = Static601.method7161(Static451.aClass176_108, Static480.anInt10083, Static544.anInt9651);
					if (Static162.aClass4_Sub41_1 == null) {
						return false;
					}
				}
				if (Static63.aClass113_1 == null) {
					Static63.aClass113_1 = new Class113(Static98.aClass176_33, Static539.aClass176_129);
				}
				@Pc(31) Class4_Sub7_Sub3 local31 = Static405.aClass4_Sub7_Sub3_4;
				if (Static280.aClass4_Sub7_Sub3_2 != null) {
					local31 = Static280.aClass4_Sub7_Sub3_2;
				}
				if (local31.method5472(Static63.aClass113_1, Static162.aClass4_Sub41_1, Static299.aClass176_76)) {
					Static405.aClass4_Sub7_Sub3_4 = local31;
					Static405.aClass4_Sub7_Sub3_4.method5451();
					@Pc(72) int local72;
					if (Static116.anInt2684 > 0) {
						Static342.anInt6643 = 3;
						Static405.aClass4_Sub7_Sub3_4.method5444(Static353.anInt6872 < Static116.anInt2684 ? Static353.anInt6872 : Static116.anInt2684);
						for (local72 = 0; local72 < Static342.anIntArray341.length; local72++) {
							Static405.aClass4_Sub7_Sub3_4.method5442(Static342.anIntArray341[local72], local72);
							Static342.anIntArray341[local72] = 255;
						}
					} else {
						Static342.anInt6643 = 0;
						Static405.aClass4_Sub7_Sub3_4.method5444(Static353.anInt6872);
						for (local72 = 0; local72 < Static342.anIntArray341.length; local72++) {
							Static405.aClass4_Sub7_Sub3_4.method5442(Static342.anIntArray341[local72], local72);
							Static342.anIntArray341[local72] = 255;
						}
					}
					if (Static280.aClass4_Sub7_Sub3_2 == null) {
						if (Static230.aLong124 > 0L) {
							Static405.aClass4_Sub7_Sub3_4.method5461(Static162.aClass4_Sub41_1, Static230.aLong124, Static450.aBoolean599);
						} else {
							Static405.aClass4_Sub7_Sub3_4.method5445(Static450.aBoolean599, Static162.aClass4_Sub41_1);
						}
					}
					if (Static124.aClass80_4 != null) {
						Static124.aClass80_4.method5607(Static405.aClass4_Sub7_Sub3_4);
					}
					Static162.aClass4_Sub41_1 = null;
					Static451.aClass176_108 = null;
					Static280.aClass4_Sub7_Sub3_2 = null;
					Static230.aLong124 = 0L;
					Static63.aClass113_1 = null;
					return true;
				}
			}
		} catch (@Pc(163) Exception local163) {
			local163.printStackTrace();
			Static405.aClass4_Sub7_Sub3_4.method5456();
			Static451.aClass176_108 = null;
			Static342.anInt6643 = 0;
			Static280.aClass4_Sub7_Sub3_2 = null;
			Static162.aClass4_Sub41_1 = null;
			Static63.aClass113_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)I")
	public static int method6568() {
		return 46;
	}
}
