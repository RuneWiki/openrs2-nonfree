import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class382 implements Interface16 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public final int anInt10482;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[F")
	public final float[] aFloatArray67;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public final int anInt10483;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V")
	public Class382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10482 = arg1;
		this.aFloatArray67 = new float[arg0 * arg1];
		this.anInt10483 = arg0;
	}
}
