import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class173 implements Interface25 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	public final int anInt4902;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	public final int anInt4904;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "[F")
	public final float[] aFloatArray25;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4902 = arg0;
		this.anInt4904 = arg1;
		this.aFloatArray25 = new float[arg0 * arg1];
	}
}
