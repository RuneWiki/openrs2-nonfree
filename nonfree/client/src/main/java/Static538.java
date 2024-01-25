import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "Lclient!d;")
	public static Interface11 anInterface11_11;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_12 = new Class158(10, 2, 2, 0);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BIBLclient!em;I)V")
	public static void method7684(@OriginalArg(1) int arg0, @OriginalArg(3) Class60_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray263[0];
		@Pc(15) int local15 = arg1.anIntArray264[0];
		if (local10 < 0 || local10 >= Static29.anInt380 || local15 < 0 || local15 >= Static327.anInt5650 || (arg2 < 0 || arg2 >= Static29.anInt380 || arg0 < 0 || arg0 >= Static327.anInt5650)) {
			return;
		}
		@Pc(89) int local89 = Static475.method7128(0, arg1.method4424((byte) -28), local15, local10, arg2, Static381.anIntArray381, Static657.anIntArray685, 0, Static669.aClass356Array1[arg1.aByte135], -4, true, 0, 0, arg0);
		if (local89 >= 1 && local89 <= 3) {
			for (@Pc(108) int local108 = 0; local108 < local89 - 1; local108++) {
				arg1.method2704(Static657.anIntArray685[local108], (byte) 2, Static381.anIntArray381[local108]);
			}
		}
	}
}
