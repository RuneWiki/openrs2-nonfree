import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	public static int anInt7011;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)V")
	public static void method5935() {
		for (@Pc(10) Class3_Sub54 local10 = (Class3_Sub54) Static623.aClass62_45.method1680(); local10 != null; local10 = (Class3_Sub54) Static623.aClass62_45.method1681()) {
			if (local10.aBoolean752) {
				local10.aBoolean752 = false;
			} else {
				Static492.method7030(local10.anInt10223);
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLclient!ji;ZB)V")
	public static void method5937(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub28 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt5252;
		@Pc(12) int local12 = (int) arg1.aLong309;
		arg1.method8770();
		if (arg0) {
			Static452.method6501(local8);
		}
		Static23.method771(local8);
		@Pc(36) Class208 local36 = Static676.method8728(local12);
		if (local36 != null) {
			Static374.method5525(local36);
		}
		Static146.method2534();
		if (!arg2 && Static277.anInt5201 != -1) {
			Static325.method5063(1, Static277.anInt5201);
		}
		@Pc(57) Class68 local57 = new Class68(Static222.aClass62_21);
		for (@Pc(62) Class3_Sub28 local62 = (Class3_Sub28) local57.method1844(); local62 != null; local62 = (Class3_Sub28) local57.method1845()) {
			if (!local62.method8771()) {
				local62 = (Class3_Sub28) local57.method1844();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt5253 == 3) {
				@Pc(88) int local88 = (int) local62.aLong309;
				if (local8 == local88 >>> 16) {
					method5937(true, local62, arg2);
				}
			}
		}
	}
}
