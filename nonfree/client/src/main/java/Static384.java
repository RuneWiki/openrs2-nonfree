import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tl", name = "Cb", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_205 = new Class186(19, -1);

	@OriginalMember(owner = "client!tl", name = "Db", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_83 = new Class242("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!tl", name = "Eb", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[128][128];

	@OriginalMember(owner = "client!tl", name = "Fb", descriptor = "I")
	public static int anInt6284 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!jb;Lclient!qa;)V")
	public static void method4838(@OriginalArg(1) Class126 arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(31) boolean local31 = Static390.aClass204_2.method4627(arg0.aBoolean251 ? Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 : null, arg1, arg0.anInt3395, arg0.anInt3383, arg0.anInt3446 | 0xFF000000, arg0.anInt3454, arg0.anInt3472) == null;
		if (local31) {
			Static113.aClass258_16.method5526(new Class4_Sub19(arg0.anInt3395, arg0.anInt3383, arg0.anInt3454, arg0.anInt3446 | 0xFF000000, arg0.anInt3472, arg0.aBoolean251));
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIII)I")
	public static int method4870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg2 >> 1);
	}
}
