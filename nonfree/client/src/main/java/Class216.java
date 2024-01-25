import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class216 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16384];

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[16384];

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!r;")
	public Class3_Sub4_Sub5 aClass3_Sub4_Sub5_6;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!ka;")
	public Class17 aClass17_6;

	static {
		@Pc(445) double local445 = 3.834951969714103E-4D;
		for (@Pc(447) int local447 = 0; local447 < 16384; local447++) {
			aFloatArray55[local447] = (float) Math.sin((double) local447 * local445);
			aFloatArray56[local447] = (float) Math.cos(local445 * (double) local447);
		}
	}
}
