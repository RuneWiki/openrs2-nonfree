import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt8473 = 0;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "[Lclient!be;")
	public static final Class5_Sub4_Sub2[] aClass5_Sub4_Sub2Array4 = new Class5_Sub4_Sub2[14];

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_162 = new Class136(51, 16);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!fa;II)V")
	public static void method7296(@OriginalArg(1) Class5_Sub4_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static251.aBoolean343) {
			return;
		}
		@Pc(18) int local18 = 0;
		@Pc(30) int local30;
		for (@Pc(24) Class5_Sub4_Sub14 local24 = (Class5_Sub4_Sub14) arg0.aClass80_3.method1538(); local24 != null; local24 = (Class5_Sub4_Sub14) arg0.aClass80_3.method1536()) {
			local30 = Static481.method6954(local24);
			if (local18 < local30) {
				local18 = local30;
			}
		}
		local18 += 8;
		Static266.anInt4412 = (Static405.aBoolean578 ? 26 : 22) + arg0.anInt2325 * 16;
		local30 = arg0.anInt2325 * 16 + 21;
		@Pc(67) int local67 = Static403.anInt6941 + Static42.anInt712;
		if (Static254.anInt4283 < local67 + local18) {
			local67 = Static403.anInt6941 - local18;
		}
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(94) int local94 = Static405.aBoolean578 ? 33 : 31;
		@Pc(101) int local101 = arg2 + 13 - local94;
		if (local101 + local30 > Static438.anInt7403) {
			local101 = Static438.anInt7403 - local30;
		}
		if (local101 < 0) {
			local101 = 0;
		}
		Static345.anInt5965 = local67;
		Static472.aClass5_Sub4_Sub6_1 = arg0;
		Static537.anInt8920 = local101;
		Static501.anInt9504 = local18;
	}
}
