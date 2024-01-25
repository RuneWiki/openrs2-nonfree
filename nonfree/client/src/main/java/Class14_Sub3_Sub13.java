import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class14_Sub3_Sub13 extends Class14_Sub3 {

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[16384];

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16384];

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public int anInt7037 = 0;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray50[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray51[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!so;II)V")
	private void method5696(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt7037 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!so;I)V")
	public void method5700(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5866();
			if (local10 == 0) {
				return;
			}
			this.method5696(arg0, local10);
		}
	}
}
