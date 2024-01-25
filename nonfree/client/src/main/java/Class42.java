import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class42 implements Interface23 {

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	public final int anInt1136;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public final int anInt1134;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[F")
	public final float[] aFloatArray3;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1136 = arg0;
		this.anInt1134 = arg1;
		this.aFloatArray3 = new float[arg0 * arg1];
	}
}
