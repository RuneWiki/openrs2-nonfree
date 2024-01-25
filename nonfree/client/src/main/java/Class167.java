import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class167 implements Interface14 {

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	public final int anInt4955;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
	public final int anInt4956;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "[F")
	public final float[] aFloatArray45;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4955 = arg1;
		this.anInt4956 = arg0;
		this.aFloatArray45 = new float[arg0 * arg1];
	}
}
