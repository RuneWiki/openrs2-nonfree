import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!lb;")
	public static Class221 aClass221_45;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static int anInt3134;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_54 = new Class186(55, -2);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JIII)V")
	public static void method2685(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = (int) arg0 >> 14 & 0x1F;
		@Pc(23) int local23 = (int) arg0 >> 20 & 0x3;
		@Pc(30) int local30 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local16 != 10 && local16 != 11 && local16 != 22) {
			Static372.method5394(true, local23, arg1, arg2, 0, local16, 0, 0);
			return;
		}
		@Pc(50) Class144 local50 = Static70.aClass323_1.method7792(local30);
		@Pc(63) int local63;
		@Pc(60) int local60;
		if (local23 == 0 || local23 == 2) {
			local60 = local50.anInt4410;
			local63 = local50.anInt4444;
		} else {
			local63 = local50.anInt4410;
			local60 = local50.anInt4444;
		}
		@Pc(74) int local74 = local50.anInt4445;
		if (local23 != 0) {
			local74 = (local74 << local23 & 0xF) + (local74 >> 4 - local23);
		}
		Static372.method5394(true, 0, arg1, arg2, local74, 0, local63, local60);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method2686(@OriginalArg(0) int arg0) {
		Static148.anInt2790 = 3;
		Static608.anInt9862 = 100;
		Static541.anInt6223 = -1;
		Static143.anInt2734 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Lclient!wk;")
	public static Class3_Sub22_Sub5 method2687() {
		return Static671.aClass3_Sub22_Sub5_3;
	}
}
