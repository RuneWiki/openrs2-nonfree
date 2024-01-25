import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class16 implements Interface8 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[F")
	public final float[] aFloatArray1;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public final int anInt706;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public final int anInt710;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(II)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray1 = new float[arg1 * arg0];
		this.anInt706 = arg1;
		this.anInt710 = arg0;
	}
}
