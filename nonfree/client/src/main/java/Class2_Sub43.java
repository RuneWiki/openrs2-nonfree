import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!oca", name = "r", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[16384];

	@OriginalMember(owner = "client!oca", name = "q", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[16384];

	@OriginalMember(owner = "client!oca", name = "s", descriptor = "Ljava/lang/String;")
	public String aString90;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			aFloatArray54[local17] = (float) Math.sin(local15 * (double) local17);
			aFloatArray53[local17] = (float) Math.cos((double) local17 * local15);
		}
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
	private Class2_Sub43() {
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub43(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString90 = arg0;
	}
}
