import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class341 implements Interface8 {

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	public final int anInt9819;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
	public final int anInt9815;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "[F")
	public final float[] aFloatArray75;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(II)V")
	public Class341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9819 = arg1;
		this.anInt9815 = arg0;
		this.aFloatArray75 = new float[arg1 * arg0];
	}
}
