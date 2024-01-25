import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class17 implements Interface8 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
	public final int anInt425;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	public final int anInt426;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "[F")
	public final float[] aFloatArray3;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(II)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt425 = arg1;
		this.anInt426 = arg0;
		this.aFloatArray3 = new float[arg1 * arg0];
	}
}
