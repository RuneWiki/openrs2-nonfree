import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_167 = new Class349(32, -1);

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
	public static boolean aBoolean806 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method7736(@OriginalArg(0) Class12_Sub2_Sub1_Sub4 arg0) {
		@Pc(10) boolean local10 = false;
		if (arg0.anInt8412 == Static532.anInt8757 || arg0.anInt8394 == -1 || arg0.anInt8397 != 0) {
			local10 = true;
		} else {
			@Pc(32) Class148 local32 = Static117.aClass18_1.method296(arg0.anInt8394);
			if (local32.aBoolean219 || local32.anIntArray253[arg0.anInt8420] < arg0.anInt8396 + 1) {
				local10 = true;
			}
		}
		if (local10) {
			@Pc(64) int local64 = arg0.anInt8412 - arg0.anInt8369;
			@Pc(70) int local70 = Static532.anInt8757 - arg0.anInt8369;
			@Pc(82) int local82 = arg0.anInt8358 * 512 + arg0.method6777() * 256;
			@Pc(93) int local93 = arg0.anInt8359 * 512 + arg0.method6777() * 256;
			@Pc(105) int local105 = arg0.anInt8401 * 512 + arg0.method6777() * 256;
			@Pc(116) int local116 = arg0.anInt8363 * 512 + arg0.method6777() * 256;
			arg0.anInt9374 = (local105 * local70 + local82 * (local64 - local70)) / local64;
			arg0.anInt9375 = (local93 * (local64 - local70) + local116 * local70) / local64;
		}
		arg0.anInt8428 = 0;
		if (arg0.anInt8426 == 0) {
			arg0.method6766(8192, false);
		}
		if (arg0.anInt8426 == 1) {
			arg0.method6766(12288, false);
		}
		if (arg0.anInt8426 == 2) {
			arg0.method6766(0, false);
		}
		if (arg0.anInt8426 == 3) {
			arg0.method6766(4096, false);
		}
	}
}
