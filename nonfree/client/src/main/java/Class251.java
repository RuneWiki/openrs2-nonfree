import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class251 implements Interface26 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public final int anInt7418;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "[F")
	public final float[] aFloatArray55;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public final int anInt7419;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7418 = arg1;
		this.aFloatArray55 = new float[arg0 * arg1];
		this.anInt7419 = arg0;
	}
}
