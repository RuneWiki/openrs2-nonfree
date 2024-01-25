import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class339 implements Interface16 {

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public final int anInt9788;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[F")
	public final float[] aFloatArray73;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
	public final int anInt9789;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(II)V")
	public Class339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9788 = arg1;
		this.aFloatArray73 = new float[arg1 * arg0];
		this.anInt9789 = arg0;
	}
}
