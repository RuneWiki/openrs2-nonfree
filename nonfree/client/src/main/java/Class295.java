import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class295 implements Interface12 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "[F")
	public static final float[] aFloatArray84 = new float[16384];

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "[F")
	public static final float[] aFloatArray85 = new float[16384];

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
	private boolean aBoolean606;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString73;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray85[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray84[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class295(@OriginalArg(0) String arg0) {
		this.aString73 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Lclient!dea;")
	@Override
	public Class68 method6882() {
		return Static90.aClass68_4;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z")
	public boolean method6440() {
		return this.aBoolean606;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
	@Override
	public int method6883() {
		@Pc(13) int local13 = Static342.method5077(this.aString73);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean606 = true;
			return 100;
		}
	}
}
