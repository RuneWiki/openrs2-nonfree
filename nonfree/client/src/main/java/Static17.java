import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!at", name = "K", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_14 = new Class214(40, 0);

	@OriginalMember(owner = "client!at", name = "P", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_15 = new Class214(79, 12);

	@OriginalMember(owner = "client!at", name = "Q", descriptor = "[Lclient!oo;")
	public static final Class188[] aClass188Array1 = new Class188[100];

	@OriginalMember(owner = "client!at", name = "R", descriptor = "[I")
	public static final int[] anIntArray21 = new int[13];

	@OriginalMember(owner = "client!at", name = "S", descriptor = "I")
	public static int anInt349 = 0;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
	public static void method291() {
		Static422.method5869();
		Static256.method4185();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IJ)V")
	public static void method294(@OriginalArg(1) long arg0) {
		@Pc(14) int local14 = Static326.anInt5852 + Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514;
		@Pc(19) int local19 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 + Static26.anInt470;
		if (Static53.anInt4623 - local14 < -500 || Static53.anInt4623 - local14 > 500 || Static233.anInt4616 - local19 < -500 || Static233.anInt4616 - local19 > 500) {
			Static53.anInt4623 = local14;
			Static233.anInt4616 = local19;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (local14 != Static53.anInt4623) {
			local59 = local14 - Static53.anInt4623;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local67 > local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local59 > local67) {
				local67 = local59;
			}
			Static53.anInt4623 += local67;
		}
		if (!Static157.aClass185_Sub1_1.aBoolean393) {
			Static322.aFloat82 += (float) arg0 * Static249.aFloat69 / 6.0F;
			Static43.aFloat26 += Static275.aFloat76 * (float) arg0 / 6.0F;
		}
		if (Static233.anInt4616 != local19) {
			local59 = local19 - Static233.anInt4616;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 <= 0) {
				if (local67 == 0) {
					local67 = -1;
				} else if (local67 < local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = 1;
			} else if (local67 > local59) {
				local67 = local59;
			}
			Static233.anInt4616 += local67;
		}
		Static117.method4155();
	}
}
