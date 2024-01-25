import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class98 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[16384];

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16384];

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!r;")
	public Class14_Sub2_Sub5 aClass14_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "Lclient!ka;")
	public Class129 aClass129_2;

	static {
		@Pc(64) double local64 = 3.834951969714103E-4D;
		for (@Pc(66) int local66 = 0; local66 < 16384; local66++) {
			aFloatArray10[local66] = (float) Math.sin((double) local66 * local64);
			aFloatArray11[local66] = (float) Math.cos((double) local66 * local64);
		}
	}
}
