import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
	public static int anInt9107;

	@OriginalMember(owner = "client!cca", name = "t", descriptor = "I")
	public static int anInt9115;

	@OriginalMember(owner = "client!cca", name = "u", descriptor = "I")
	public static int anInt9116;

	@OriginalMember(owner = "client!cca", name = "z", descriptor = "[Lclient!ia;")
	public static Class167[] aClass167Array15;

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "[I")
	public static final int[] anIntArray596 = new int[8];

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
	public static int anInt9111 = 0;

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "Lclient!kka;")
	public static final Class3_Sub17_Sub2 aClass3_Sub17_Sub2_4 = new Class3_Sub17_Sub2(7500);

	@OriginalMember(owner = "client!cca", name = "w", descriptor = "I")
	public static int anInt9118 = 999999;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)I")
	public static int method7735(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static189.anInt7974 - 1; local3++) {
			if (arg0 < Static59.anIntArray65[local3] + Static221.anIntArray277[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static189.anInt7974 - 1;
		}
		return local1;
	}
}
