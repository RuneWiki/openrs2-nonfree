import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class147 implements Interface14 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public final int anInt4265;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public final int anInt4263;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[F")
	public final float[] aFloatArray45;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4265 = arg0;
		this.anInt4263 = arg1;
		this.aFloatArray45 = new float[arg0 * arg1];
	}
}
