import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public static volatile int anInt227 = 0;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
	public static final int[] anIntArray30 = new int[4096];

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	public static int anInt234 = 0;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	public static final int anInt236 = -14475237;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZIII)V")
	public static void method290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(23) int local23 = arg4 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(48) int local48 = (Static33.aShort3 - Static156.aShort30) * local23 / 100 + Static156.aShort30;
		if (local48 < Static244.aShort61) {
			local48 = Static244.aShort61;
		} else if (Static233.aShort60 < local48) {
			local48 = Static233.aShort60;
		}
		@Pc(74) int local74 = local48 * arg4 * 512 / (arg0 * 334);
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(86) short local86;
		if (local74 < Static87.aShort15) {
			local86 = Static87.aShort15;
			local48 = arg0 * 334 * local86 / (arg4 * 512);
			if (local48 > Static233.aShort60) {
				local48 = Static233.aShort60;
				local115 = arg4 * 512 * local48 / (local86 * 334);
				local121 = (arg0 - local115) / 2;
				if (arg2) {
					Static34.aClass2_6.method3327();
					Static34.aClass2_6.method3277(arg1, arg4, arg3, -16777216, local121);
					Static34.aClass2_6.method3277(arg1, arg4, arg0 + arg3 - local121, -16777216, local121);
				}
				arg0 -= local121 * 2;
				arg3 += local121;
			}
		} else if (local74 > Static175.aShort35) {
			local86 = Static175.aShort35;
			local48 = local86 * 334 * arg0 / (arg4 * 512);
			if (local48 < Static244.aShort61) {
				local48 = Static244.aShort61;
				local115 = arg0 * 334 * local86 / (local48 * 512);
				local121 = (arg4 - local115) / 2;
				if (arg2) {
					Static34.aClass2_6.method3327();
					Static34.aClass2_6.method3277(arg1, local121, arg3, -16777216, arg0);
					Static34.aClass2_6.method3277(arg1 + arg4 - local121, local121, arg3, -16777216, arg0);
				}
				arg1 += local121;
				arg4 -= local121 * 2;
			}
		}
		Static244.anInt4759 = arg1;
		Static332.anInt6364 = (short) arg0;
		Static140.anInt2777 = arg3;
		Static335.anInt6381 = arg4 * local48 / 334;
		Static258.anInt5022 = (short) arg4;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!qj;BLclient!qj;)I")
	public static int method291(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method4486(Static195.anInt3974)) {
			local5++;
		}
		if (arg0.method4486(Static186.anInt3864)) {
			local5++;
		}
		if (arg0.method4486(Static135.anInt2701)) {
			local5++;
		}
		if (arg1.method4486(Static195.anInt3974)) {
			local5++;
		}
		if (arg1.method4486(Static186.anInt3864)) {
			local5++;
		}
		if (arg1.method4486(Static135.anInt2701)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method292() {
		Static277.anInt6207 = 0;
		Static175.aClass195_36.method5032();
		Static179.aBoolean310 = false;
	}
}
