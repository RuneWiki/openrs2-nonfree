import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lclient!qv;")
	public static Class289 aClass289_1;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Ljava/awt/Image;")
	public static Image anImage12;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray245 = new int[3];

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
	public static int anInt4480 = 0;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_54 = new Class208(59, 4);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!mw;I)V")
	public static void method3591(@OriginalArg(0) Class1_Sub3_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static149.anInt2838; local7++) {
			@Pc(21) int local21 = Static511.anIntArray539[local7];
			@Pc(25) Class11_Sub1_Sub1_Sub3_Sub1 local25 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local21];
			@Pc(29) int local29 = arg0.method7974();
			if ((local29 & 0x20) != 0) {
				local29 += arg0.method7974() << 8;
			}
			if ((local29 & 0x1000) != 0) {
				local29 += arg0.method7974() << 16;
			}
			Static49.method795(arg0, local25, local29, local21);
		}
	}
}
