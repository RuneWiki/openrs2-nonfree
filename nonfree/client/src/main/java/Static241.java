import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
	public static int anInt4646;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
	public static int anInt4647;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "[I")
	public static final int[] anIntArray356 = new int[2048];

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	public static void method4290() {
		for (@Pc(3) int local3 = 0; local3 < Static141.anInt2822; local3++) {
			@Pc(9) int local9 = Static220.anIntArray339[local3];
			@Pc(16) Class1_Sub41 local16 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local9);
			if (local16 != null) {
				@Pc(21) Class20_Sub1_Sub1_Sub2 local21 = local16.aClass20_Sub1_Sub1_Sub2_2;
				Static409.method6503(local21.aClass283_1.anInt8439, local21);
			}
		}
	}
}
