import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public abstract class Class46 {

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[16384];

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[16384];

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			aFloatArray18[local17] = (float) Math.sin(local15 * (double) local17);
			aFloatArray17[local17] = (float) Math.cos(local15 * (double) local17);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLclient!cr;)Lclient!cr;")
	public abstract Class2_Sub1_Sub3 method5436(@OriginalArg(1) Class2_Sub1_Sub3 arg0);
}
