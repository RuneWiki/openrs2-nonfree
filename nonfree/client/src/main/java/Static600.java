import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "Z")
	public static boolean aBoolean722;

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_79 = new Class99(64);

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
	public static int anInt10555 = 0;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	public static void method8797() {
		for (@Pc(10) Class2_Sub6_Sub10 local10 = (Class2_Sub6_Sub10) Static430.aClass341_24.method8524(); local10 != null; local10 = (Class2_Sub6_Sub10) Static430.aClass341_24.method8519()) {
			@Pc(23) Class3_Sub1_Sub3_Sub5 local23 = local10.aClass3_Sub1_Sub3_Sub5_1;
			if (local23.anInt9872 < Static407.anInt7704) {
				local10.method9253();
				local23.method8225();
			} else if (Static407.anInt7704 >= local23.anInt9884) {
				local23.method8227();
				if (local23.anInt9885 > 0) {
					@Pc(63) Class2_Sub33 local63 = (Class2_Sub33) aClass99_79.method3056((long) (local23.anInt9885 - 1));
					if (local63 != null) {
						@Pc(68) Class3_Sub1_Sub3_Sub3_Sub1 local68 = local63.aClass3_Sub1_Sub3_Sub3_Sub1_2;
						if (local68.anInt10303 >= 0 && Static47.anInt1794 * 512 > local68.anInt10303 && local68.anInt10310 >= 0 && Static209.anInt4742 * 512 > local68.anInt10310) {
							local23.method8224(Static590.method8716(local68.anInt10303, local23.aByte132, local68.anInt10310) - local23.anInt9852, local68.anInt10310, Static407.anInt7704, local68.anInt10303);
						}
					}
				}
				if (local23.anInt9885 < 0) {
					@Pc(121) int local121 = -local23.anInt9885 - 1;
					@Pc(126) Class3_Sub1_Sub3_Sub3_Sub2 local126;
					if (local121 == Static569.anInt10211) {
						local126 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2;
					} else {
						local126 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local121];
					}
					if (local126 != null && local126.anInt10303 >= 0 && Static47.anInt1794 * 512 > local126.anInt10303 && local126.anInt10310 >= 0 && local126.anInt10310 < Static209.anInt4742 * 512) {
						local23.method8224(Static590.method8716(local126.anInt10303, local23.aByte132, local126.anInt10310) - local23.anInt9852, local126.anInt10310, Static407.anInt7704, local126.anInt10303);
					}
				}
				local23.method8228(Static99.anInt2781);
				Static324.method5602(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Lclient!fha;")
	public static Class3_Sub1_Sub4 method8798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class3_Sub1_Sub4 local14 = local7.aClass3_Sub1_Sub4_1;
			local7.aClass3_Sub1_Sub4_1 = null;
			Static452.method7100(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)Z")
	public static boolean method8800(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
