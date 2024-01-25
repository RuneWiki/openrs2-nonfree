import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	public static int anInt4899;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_29 = new Class126(10);

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "[I")
	public static final int[] anIntArray321 = new int[14];

	@OriginalMember(owner = "client!mt", name = "r", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_154 = new Class189("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZIII)V")
	public static void method3784(@OriginalArg(0) boolean arg0) {
		Static232.anInt4442 = 22050;
		Static361.anInt6115 = 2;
		Static324.aBoolean657 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(JIII)V")
	public static void method3785(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static439.method5750(true, arg1, local22, 0, 0, local10, arg2, 0);
			return;
		}
		@Pc(59) Class93 local59 = Static435.aClass30_4.method769(local29);
		@Pc(70) int local70;
		@Pc(73) int local73;
		if (local22 == 0 || local22 == 2) {
			local70 = local59.anInt2762;
			local73 = local59.anInt2782;
		} else {
			local70 = local59.anInt2782;
			local73 = local59.anInt2762;
		}
		@Pc(83) int local83 = local59.anInt2794;
		if (local22 != 0) {
			local83 = (local83 << local22 & 0xF) + (local83 >> 4 - local22);
		}
		Static439.method5750(true, arg1, 0, local73, local70, 0, arg2, local83);
	}
}
