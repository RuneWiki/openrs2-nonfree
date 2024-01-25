import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class354 implements Interface23 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public final int anInt9009;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public final int anInt9007;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(II)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray65 = new float[arg1 * arg0];
		this.anInt9009 = arg0;
		this.anInt9007 = arg1;
	}
}
