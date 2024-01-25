import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
	public static int anInt19;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt17 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
	public static int method11(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFIIZIIIZ)[[I")
	public static int[][] method17(@OriginalArg(1) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class1_Sub2_Sub32 local18 = new Class1_Sub2_Sub32();
		local18.aBoolean587 = false;
		local18.anInt6737 = 3;
		local18.anInt6730 = (int) (arg0 * 4096.0F);
		local18.anInt6731 = 4;
		local18.anInt6734 = 8;
		local18.method5967();
		Static306.method4069(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method5346(local45, local14[local45]);
		}
		return local14;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	public static void method20() {
		if (Static157.anIntArray201 != null && Static117.anIntArray157 != null) {
			return;
		}
		Static157.anIntArray201 = new int[256];
		Static117.anIntArray157 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static157.anIntArray201[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static117.anIntArray157[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
