import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public class Class55_Sub2_Sub1 extends Class55_Sub2 {

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[16384];

	@OriginalMember(owner = "client!fu", name = "A", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[16384];

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
	public int anInt2858;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
	public int anInt2859;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
	public int anInt2862;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!fu", name = "D", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
	public int anInt2867;

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "B")
	public byte aByte26 = 5;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray7[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray8[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	protected Class55_Sub2_Sub1() {
	}
}
