import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt5679;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
	public static final int[] anIntArray319 = new int[5];

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_142 = new Class251(74, 7);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt5684 = -1;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!rea;I)V")
	public static void method5122(@OriginalArg(0) Class14_Sub21_Sub2 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < Static134.anInt2097; local3++) {
			@Pc(11) int local11 = Static429.anIntArray385[local3];
			@Pc(15) Class4_Sub3_Sub3_Sub3_Sub2 local15 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local11];
			@Pc(19) int local19 = arg0.method7695(108);
			if ((local19 & 0x10) != 0) {
				local19 += arg0.method7695(120) << 8;
			}
			if ((local19 & 0x800) != 0) {
				local19 += arg0.method7695(105) << 16;
			}
			Static289.method4809(local19, local15, arg0, ~arg1, local11);
		}
		if (arg1 != -1) {
			method5123(7);
		}
	}
}
