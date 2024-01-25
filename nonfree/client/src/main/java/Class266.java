import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class266 implements Interface5 {

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "[F")
	public final float[] aFloatArray72;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public final int anInt8048;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public final int anInt8049;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray72 = new float[arg0 * arg1];
		this.anInt8048 = arg1;
		this.anInt8049 = arg0;
	}
}
