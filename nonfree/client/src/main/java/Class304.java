import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class304 implements Interface25 {

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	public final int anInt9244;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public final int anInt9241;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "[F")
	public final float[] aFloatArray79;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(II)V")
	public Class304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9244 = arg1;
		this.anInt9241 = arg0;
		this.aFloatArray79 = new float[arg0 * arg1];
	}
}
