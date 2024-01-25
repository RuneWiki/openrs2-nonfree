import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public static int anInt9458;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_8 = new Class275(1, 2);

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
	public static boolean aBoolean799 = false;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public static int anInt9456 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public static void method7817() {
		if (Static530.anInt9144 == -1) {
			return;
		}
		@Pc(11) int local11 = Static501.aClass59_5.method4107();
		@Pc(15) int local15 = Static501.aClass59_5.method4106();
		@Pc(20) Class3_Sub30 local20 = (Class3_Sub30) Static264.aClass276_37.method6907();
		if (local20 != null) {
			local11 = local20.method6363();
			local15 = local20.method6367();
		}
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (Static349.aBoolean590) {
			local32 = Static477.method7033();
			local34 = Static10.method114();
		}
		Static223.method4293(Static530.anInt9144, local32, local11 + local32, local34, local15, local11, Static256.anInt5669 + local34, local15 + local34, local34, local32, local32 + Static114.anInt2970);
		if (Static505.aClass108_10 != null) {
			Static544.method7716(local15 + local34, local11 + local32);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method7818(@OriginalArg(0) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static207.method4083(local11.width, local11.height);
		if (Static178.anInt4220 == 1) {
			Static67.aClass33_5.method6189(arg0, Static273.anInt5828, Static211.anInt4905);
		} else {
			Static67.aClass33_5.method6189(arg0, Static448.anInt8136, Static33.anInt611);
		}
	}
}
