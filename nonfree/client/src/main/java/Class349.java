import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class349 implements Interface8 {

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "I")
	public final int anInt10033;

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "I")
	public final int anInt10035;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "[F")
	public final float[] aFloatArray72;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(II)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10033 = arg1;
		this.anInt10035 = arg0;
		this.aFloatArray72 = new float[arg0 * arg1];
	}
}
