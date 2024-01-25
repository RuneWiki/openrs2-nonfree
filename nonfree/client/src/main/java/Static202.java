import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt4720 = 100;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!qf;")
	public static final Class3_Sub39 aClass3_Sub39_1 = new Class3_Sub39(0, 0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method3954() {
		Static308.method5204();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)I")
	public static int method3958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static500.aClass274Array2 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg2 >> 9;
		@Pc(20) int local20 = arg0 >> 9;
		if (local16 < 0 || local20 < 0 || Static394.anInt7540 - 1 < local16 || Static462.anInt8391 - 1 < local20) {
			return 0;
		}
		@Pc(45) int local45 = arg1;
		if (arg1 < 3 && (Static244.aByteArrayArrayArray10[1][local16][local20] & 0x2) != 0) {
			local45 = arg1 + 1;
		}
		return Static500.aClass274Array2[local45].method8043(arg0, arg2);
	}
}
