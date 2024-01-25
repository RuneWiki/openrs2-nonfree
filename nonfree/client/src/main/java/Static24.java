import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "Lclient!ff;")
	public static final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "[I")
	public static final int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	public static final int anInt312 = 2;

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
	public static int anInt316 = 0;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "Lclient!oba;")
	public static final Class261 aClass261_1 = new Class261();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!fl;I[[B)V")
	public static void method289(@OriginalArg(0) Class116_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(15) int local15 = Static432.aByteArrayArray134.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(36) int local36 = (Static617.anIntArray642[local17] >> 8) * 64 - Static50.anInt606;
				@Pc(47) int local47 = (Static617.anIntArray642[local17] & 0xFF) * 64 - Static404.anInt7039;
				Static302.method4850();
				arg0.method3294(local47, Static669.aClass356Array1, local23, Static202.aClass75_5, local36);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
	public static int method290() {
		return Static290.anInt10204 == 1 ? Static592.anInt9421 : 0;
	}
}
