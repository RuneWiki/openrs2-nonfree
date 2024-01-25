import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16384];

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[16384];

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	public final int anInt3128;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public final int anInt3130;

	static {
		@Pc(16) double local16 = 3.834951969714103E-4D;
		for (@Pc(18) int local18 = 0; local18 < 16384; local18++) {
			aFloatArray11[local18] = (float) Math.sin(local16 * (double) local18);
			aFloatArray12[local18] = (float) Math.cos(local16 * (double) local18);
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(II)V")
	public Class1_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3128 = arg0;
		this.anInt3130 = arg1;
	}
}
