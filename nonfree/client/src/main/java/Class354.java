import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class354 implements Interface3 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "[F")
	public final float[] aFloatArray73;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public final int anInt9769;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public final int anInt9771;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray73 = new float[arg0 * arg1];
		this.anInt9769 = arg0;
		this.anInt9771 = arg1;
	}
}
