import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_56 = new Class171(80, 9);

	@OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
	public static final int[] anIntArray256 = new int[25];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!fq;III)V")
	public static void method3705(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class368 local12;
		if (arg2 < Static133.anInt2551) {
			local12 = Static254.aClass368ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass34_Sub1_Sub2_1 != null && local12.aClass34_Sub1_Sub2_1.method7841()) {
				arg0.method7842(0, local12.aClass34_Sub1_Sub2_1, Static599.anInt7773, 0, Static50.aClass95_1, true);
			}
		}
		if (arg3 < Static133.anInt2551) {
			local12 = Static254.aClass368ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass34_Sub1_Sub2_1 != null && local12.aClass34_Sub1_Sub2_1.method7841()) {
				arg0.method7842(0, local12.aClass34_Sub1_Sub2_1, 0, Static599.anInt7773, Static50.aClass95_1, true);
			}
		}
		if (arg2 < Static133.anInt2551 && arg3 < Static155.anInt2874) {
			local12 = Static254.aClass368ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass34_Sub1_Sub2_1 != null && local12.aClass34_Sub1_Sub2_1.method7841()) {
				arg0.method7842(0, local12.aClass34_Sub1_Sub2_1, Static599.anInt7773, Static599.anInt7773, Static50.aClass95_1, true);
			}
		}
		if (arg2 < Static133.anInt2551 && arg3 > 0) {
			local12 = Static254.aClass368ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass34_Sub1_Sub2_1 != null && local12.aClass34_Sub1_Sub2_1.method7841()) {
				arg0.method7842(0, local12.aClass34_Sub1_Sub2_1, Static599.anInt7773, -Static599.anInt7773, Static50.aClass95_1, true);
			}
		}
	}
}
