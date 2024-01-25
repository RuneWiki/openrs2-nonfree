import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mia", name = "p", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[16384];

	@OriginalMember(owner = "client!mia", name = "o", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[16384];

	@OriginalMember(owner = "client!mia", name = "n", descriptor = "I")
	private int anInt6737;

	@OriginalMember(owner = "client!mia", name = "v", descriptor = "I")
	private int anInt6741;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			aFloatArray63[local13] = (float) Math.sin(local11 * (double) local13);
			aFloatArray62[local13] = (float) Math.cos((double) local13 * local11);
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4110(this.anInt6737, this.anInt6741);
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt6741 = arg0.method7804();
		this.anInt6737 = arg0.method7804();
	}
}
