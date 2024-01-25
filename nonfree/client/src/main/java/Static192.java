import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
	public static int anInt3505;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "Lclient!la;")
	public static final Class136 aClass136_95 = new Class136(29, 0);

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_92 = new Class163(15, 4);

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!vr;IIIIZ)V")
	public static void method3007(@OriginalArg(1) Class261 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static139.anInt2476 >= 50 || (arg0 == null || arg0.anIntArrayArray62 == null || arg2 >= arg0.anIntArrayArray62.length || arg0.anIntArrayArray62[arg2] == null)) {
			return;
		}
		@Pc(38) int local38 = arg0.anIntArrayArray62[arg2][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(48) int local48 = local38 >> 5 & 0x7;
		@Pc(52) int local52 = local38 & 0x1F;
		@Pc(69) int local69;
		if (arg0.anIntArrayArray62[arg2].length > 1) {
			local69 = (int) (Math.random() * (double) arg0.anIntArrayArray62[arg2].length);
			if (local69 > 0) {
				local42 = arg0.anIntArrayArray62[arg2][local69];
			}
		}
		if (local52 == 0) {
			if (arg5) {
				Static462.method6277(255, 0, local48, local42);
			}
		} else if (Static39.aClass79_Sub1_1.anInt2163 != 0) {
			local69 = arg3 - 64 >> 7;
			@Pc(108) int local108 = arg4 - 64 >> 7;
			Static342.aClass216Array1[Static139.anInt2476++] = new Class216((byte) 1, local42, local48, 0, 255, local52 + (arg1 << 24) + (local69 << 16) + (local108 << 8));
		}
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)[Lclient!js;")
	public static Class123[] method3009() {
		return new Class123[] { Static308.aClass123_6, Static445.aClass123_5, Static28.aClass123_1 };
	}
}
