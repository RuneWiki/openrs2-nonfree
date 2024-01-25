import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class3_Sub11_Sub13 extends Class3_Sub11 {

	@OriginalMember(owner = "client!nea", name = "x", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[16384];

	@OriginalMember(owner = "client!nea", name = "A", descriptor = "[F")
	public static final float[] aFloatArray42 = new float[16384];

	@OriginalMember(owner = "client!nea", name = "z", descriptor = "Lclient!pda;")
	public final Class28_Sub1_Sub1_Sub4 aClass28_Sub1_Sub1_Sub4_1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray41[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray42[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!pda;)V")
	public Class3_Sub11_Sub13(@OriginalArg(0) Class28_Sub1_Sub1_Sub4 arg0) {
		this.aClass28_Sub1_Sub1_Sub4_1 = arg0;
	}
}
