import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIII)V")
	public static void method6405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = Static611.anInt9666;
		if (local12 == 0) {
			return;
		}
		if (local12 == 1) {
			Static4.anInt22 = arg0;
			Static401.anInt6900 = arg1;
			Static113.anInt2235 = arg3;
			Static611.anInt9666 = 2;
			Static373.anInt6281 = arg2;
		} else if (local12 == 2) {
			if (Static4.anInt22 > arg0) {
				Static4.anInt22 = arg0;
			}
			if (Static373.anInt6281 < arg2) {
				Static373.anInt6281 = arg2;
			}
			if (Static113.anInt2235 > arg3) {
				Static113.anInt2235 = arg3;
			}
			if (arg1 > Static401.anInt6900) {
				Static401.anInt6900 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!ao;IIBI)V")
	public static void method6406(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) Class6_Sub50 local19 = null;
		for (@Pc(24) Class6_Sub50 local24 = (Class6_Sub50) Static39.aClass340_2.method8124(); local24 != null; local24 = (Class6_Sub50) Static39.aClass340_2.method8134()) {
			if (arg2 == local24.anInt9417 && local24.anInt9410 == arg3 && local24.anInt9409 == arg4 && arg0 == local24.anInt9418) {
				local19 = local24;
				break;
			}
		}
		if (local19 == null) {
			local19 = new Class6_Sub50();
			local19.anInt9409 = arg4;
			local19.anInt9410 = arg3;
			local19.anInt9418 = arg0;
			local19.anInt9417 = arg2;
			Static39.aClass340_2.method8131(local19);
		}
		local19.aBoolean701 = true;
		local19.aClass22_2 = arg1;
		local19.aBoolean702 = false;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
	public static void method6407() {
		Static149.aClass359_17.method8507();
		Static556.aClass359_50.method8507();
		Static109.aClass359_13.method8507();
		Static43.aClass359_5.method8507();
	}
}
