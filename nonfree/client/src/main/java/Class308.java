import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class308 implements Interface25 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public final int anInt9018;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public final int anInt9016;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(II)V")
	public Class308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9018 = arg0;
		this.anInt9016 = arg1;
		this.aFloatArray65 = new float[arg0 * arg1];
	}
}
