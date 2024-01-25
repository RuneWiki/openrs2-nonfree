import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[16384];

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray55[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray56[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!pi", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static379.method5233(30000L);
		return -1;
	}
}
