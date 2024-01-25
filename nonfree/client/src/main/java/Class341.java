import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class341 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16384];

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16384];

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public int anInt9073 = 0;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray70[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray71[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!io;I)V")
	public void method7513(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4393();
			if (local12 == 0) {
				return;
			}
			this.method7515(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!io;)V")
	private void method7515(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 5) {
			this.anInt9073 = arg1.method4426();
		}
	}
}
