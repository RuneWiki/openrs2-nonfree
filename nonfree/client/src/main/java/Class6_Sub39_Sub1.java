import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class6_Sub39_Sub1 extends Class6_Sub39 {

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16384];

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[16384];

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public int anInt7733;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public int anInt7734;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	public int anInt7739;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "J")
	public long aLong179;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray57[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray58[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I")
	@Override
	public int method8014() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I")
	@Override
	public int method8018() {
		return this.anInt7733;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)J")
	@Override
	public long method8016() {
		return this.aLong179;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	@Override
	public int method8017() {
		return this.anInt7739;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	@Override
	public int method8012() {
		return this.anInt7734;
	}
}
