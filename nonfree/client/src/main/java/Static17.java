import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BIIIFIZI)[I")
	public static int[] method365(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub3_Sub17 local10 = new Class2_Sub3_Sub17();
		local10.anInt5772 = (int) (arg0 * 4096.0F);
		local10.anInt5782 = 8;
		local10.anInt5773 = 4;
		local10.aBoolean440 = true;
		local10.anInt5780 = 8;
		local10.anInt5778 = 35;
		local10.method9152();
		Static30.method730(1, 2048);
		local10.method4992(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIZI[Lclient!at;)V")
	public static void method366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24[] arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg4.length; local11++) {
			@Pc(17) Class24 local17 = arg4[local11];
			if (local17 != null && arg0 == local17.anInt511) {
				Static164.method3542(arg1, local17, arg2, arg3);
				Static49.method1753(arg1, arg3, local17);
				if (local17.anInt463 > local17.anInt434 - local17.anInt441) {
					local17.anInt463 = local17.anInt434 - local17.anInt441;
				}
				if (local17.anInt463 < 0) {
					local17.anInt463 = 0;
				}
				if (local17.anInt467 > local17.anInt489 - local17.anInt488) {
					local17.anInt467 = local17.anInt489 - local17.anInt488;
				}
				if (local17.anInt467 < 0) {
					local17.anInt467 = 0;
				}
				if (local17.anInt480 == 0) {
					Static553.method8245(arg2, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method367(@OriginalArg(0) int arg0) {
		Static432.anInt8068 = arg0;
		Static205.aClass169_28.method5009();
	}
}
