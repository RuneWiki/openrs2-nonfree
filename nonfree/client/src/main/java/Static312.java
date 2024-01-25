import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!dn;")
	public static Class69 aClass69_62;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas12;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!js;")
	public static final Class156 aClass156_9 = new Class156(2, 4, 4, 0);

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
	public static final int[] anIntArray465 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public static void method5402() {
		@Pc(16) byte[] local16;
		if (Static124.anObject4 == null) {
			@Pc(9) Class35_Sub2_Sub1 local9 = new Class35_Sub2_Sub1();
			local16 = local9.method2851();
			Static124.anObject4 = Static271.method4827(local16);
		}
		if (Static431.anObject13 == null) {
			@Pc(32) Class35_Sub1_Sub2 local32 = new Class35_Sub1_Sub2();
			local16 = local32.method4820();
			Static431.anObject13 = Static271.method4827(local16);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ID)V")
	public static void method5403(@OriginalArg(1) double arg0) {
		if (Static521.aDouble9 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static417.anIntArray703[local11] = local23 > 255 ? 255 : local23;
		}
		Static521.aDouble9 = arg0;
	}
}
