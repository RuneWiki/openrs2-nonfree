import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class121 implements Interface3 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public final int anInt2638;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[F")
	public final float[] aFloatArray13;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	public final int anInt2639;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(II)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2638 = arg1;
		this.aFloatArray13 = new float[arg1 * arg0];
		this.anInt2639 = arg0;
	}
}
