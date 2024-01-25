import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_175 = new Class12(62, -2);

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "[I")
	public static final int[] anIntArray487 = new int[2];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
	public static void method5635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static453.aClass136_Sub1_1.anInt4442 != 0 && arg1 != 0 && Static234.anInt4174 < 50 && arg3 != -1) {
			Static249.aClass266Array1[Static234.anInt4174++] = new Class266((byte) 1, arg3, arg1, arg2, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!wk;)I")
	public static int method5638(@OriginalArg(1) Class25_Sub5_Sub1 arg0) {
		if (arg0.anInt4274 == 0) {
			return 0;
		}
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (arg0.anInt4238 != -1) {
			@Pc(14) Class25_Sub5_Sub1 local14 = null;
			if (arg0.anInt4238 < 32768) {
				local14 = Static87.aClass25_Sub5_Sub1_Sub1Array6[arg0.anInt4238];
			} else if (arg0.anInt4238 >= 32768) {
				local14 = Static28.aClass25_Sub5_Sub1_Sub2Array1[arg0.anInt4238 - 32768];
			}
			if (local14 != null) {
				local46 = arg0.anInt5518 - local14.anInt5518;
				local52 = arg0.anInt5514 - local14.anInt5514;
				if (local46 != 0 || local52 != 0) {
					arg0.method3416((int) (Math.atan2((double) local46, (double) local52) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class25_Sub5_Sub1_Sub2) {
			@Pc(85) Class25_Sub5_Sub1_Sub2 local85 = (Class25_Sub5_Sub1_Sub2) arg0;
			if (local85.anInt4346 != -1 && (local85.anInt4314 == 0 || local85.anInt4315 > 0)) {
				local85.method3416(local85.anInt4346);
				local85.anInt4346 = -1;
			}
		} else if (arg0 instanceof Class25_Sub5_Sub1_Sub1) {
			@Pc(111) Class25_Sub5_Sub1_Sub1 local111 = (Class25_Sub5_Sub1_Sub1) arg0;
			if (local111.anInt3127 != -1 && (local111.anInt4314 == 0 || local111.anInt4315 > 0)) {
				local46 = local111.anInt5518 - (local111.anInt3127 - Static199.anInt3480 - Static199.anInt3480) * 64;
				local52 = local111.anInt5514 - (local111.anInt3109 - Static164.anInt2731 - Static164.anInt2731) * 64;
				if (local46 != 0 || local52 != 0) {
					local111.method3416((int) (Math.atan2((double) local46, (double) local52) * 2607.5945876176133D) & 0x3FFF);
				}
				local111.anInt3127 = -1;
			}
		}
		return arg0.method3422();
	}
}
