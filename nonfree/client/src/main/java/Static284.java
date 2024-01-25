import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "Lclient!qn;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
	public static int anInt5035 = -1;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_94 = new Class156(63, -1);

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_125 = new Class381(26, 7);

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "Lclient!v;")
	public static final Class370 aClass370_4 = new Class370(64);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!gda;I)Lclient!km;")
	public static Class5_Sub30 method4548(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1) {
		@Pc(8) byte[] local8 = arg1.method3069(arg0);
		return local8 == null ? null : new Class5_Sub30(local8);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIII)V")
	public static void method4549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static282.anInt5028 = arg4;
		Static469.anInt7626 = arg2;
		Static134.anInt2209 = arg1;
		Static578.anInt9023 = arg3;
		Static177.anInt3350 = arg0;
		if (Static177.anInt3350 >= 100) {
			@Pc(30) int local30 = Static282.anInt5028 * 512 + 256;
			@Pc(36) int local36 = Static578.anInt9023 * 512 + 256;
			@Pc(45) int local45 = Static461.method6500(local30, Static324.anInt5529, local36) - Static469.anInt7626;
			@Pc(50) int local50 = local30 - Static141.anInt2764;
			@Pc(55) int local55 = local45 - Static42.anInt703;
			@Pc(59) int local59 = local36 - Static282.anInt5025;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local50 * local50 + local59 * local59));
			Static96.anInt10862 = (int) (Math.atan2((double) local55, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static542.anInt8612 = (int) (-2607.5945876176133D * Math.atan2((double) local50, (double) local59)) & 0x3FFF;
			Static331.anInt5582 = 0;
			if (Static96.anInt10862 < 1024) {
				Static96.anInt10862 = 1024;
			}
			if (Static96.anInt10862 > 3072) {
				Static96.anInt10862 = 3072;
			}
		}
		Static417.anInt7039 = -1;
		Static227.anInt9451 = -1;
		Static426.anInt7111 = 2;
	}
}
