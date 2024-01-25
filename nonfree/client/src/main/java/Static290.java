import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_132 = new Class263(48, 10);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public static int anInt5510 = 0;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean341 = Boolean.FALSE;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZLclient!sq;B)V")
	public static void method4258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class235 arg5) {
		if (Static113.anInt2513 >= 50 || (arg5 == null || arg5.anIntArrayArray56 == null || arg5.anIntArrayArray56.length <= arg1 || arg5.anIntArrayArray56[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg5.anIntArrayArray56[arg1][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(46) int local46 = local32 & 0x1F;
		@Pc(68) int local68;
		if (arg5.anIntArrayArray56[arg1].length > 1) {
			local68 = (int) ((double) arg5.anIntArrayArray56[arg1].length * Math.random());
			if (local68 > 0) {
				local36 = arg5.anIntArrayArray56[arg1][local68];
			}
		}
		if (local46 == 0) {
			if (arg4) {
				Static298.method4341(local36, 255, local42, 0);
			}
		} else if (Static12.aClass34_Sub1_1.anInt7175 != 0) {
			local68 = arg3 - 64 >> 7;
			@Pc(107) int local107 = arg0 - 64 >> 7;
			Static117.aClass45Array1[Static113.anInt2513++] = new Class45((byte) 1, local36, local42, 0, 255, local46 + (local107 << 8) + (local68 << 16) + (arg2 << 24));
		}
	}
}
