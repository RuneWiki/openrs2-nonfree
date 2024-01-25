import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class111 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[16384];

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[16384];

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray19;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!ci;")
	public Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public int anInt2978 = -1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray17[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray18[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}
}
